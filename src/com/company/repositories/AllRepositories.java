package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Back;
import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class AllRepositories implements IAllRepositories {
    private final IDB database;

    public AllRepositories(IDB database) {
        this.database = database;
    }

    @Override
    public List<Front> getAllFront() {
        Connection connection = null;
        try {
            connection = database.getConnection();

            String sql = "SELECT * FROM \"Front-end_dev\"";
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);
            List<Front> fronts = new LinkedList<>();
            while (result.next()) {
                Front front = new Front(
                        result.getInt("ID"),
                        result.getString("First_name"),
                        result.getInt("Age"),
                        result.getDate("Started_working"),
                        result.getInt("Level"),
                        result.getInt("Salary")
                );
                fronts.add(front);
            }
            return fronts;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    ///////////////////NEED FOR BACK DEV

    @Override
    public List<Back> getAllBack() {
        Connection connection = null;
        try {
            connection = database.getConnection();

            String sql = "SELECT * FROM \"Back-end_dev\"";
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);
            List<Back> backs = new LinkedList<>();
            while (result.next()) {
                Back back = new Back(
                        result.getInt("ID"),
                        result.getString("First_name"),
                        result.getInt("Age"),
                        result.getDate("Started_working"),
                        result.getInt("Level"),
                        result.getInt("Salary")
                );
                backs.add(back);
            }
            return backs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<List> getAllList() {
        return null;
    }

    @Override
    public List getName(int f_name) {
        return null;
    }

    @Override
    public boolean addFront(Front front) {
        Connection connection = null;
        try {
            connection = database.getConnection();

            String sql = "INSERT INTO \"Front-end_dev\"(\"First_name\", \"Age\", \"Started_working\", \"Level\", \"Salary\")\n" +
                    "VALUES(?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, front.getF_name());
            statement.setInt(2, front.getAge());
            statement.setDate(3, front.getStarted_working());
            statement.setInt(4, front.getLevel());
            statement.setInt(5, front.getSalary());
            statement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean addBack(Back back) {
        Connection connection = null;
        try {
            connection = database.getConnection();

            String sql = "INSERT INTO \"Back-end_dev\"(\"First_name\", \"Age\", \"Started_working\", \"Level\", \"Salary\")\n" +
                    "VALUES(?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, back.getF_name());
            statement.setInt(2, back.getAge());
            statement.setDate(3, back.getStarted_working());
            statement.setInt(4, back.getLevel());
            statement.setInt(5, back.getSalary());
            statement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Front> deleteFront() {
        return null;
    }

    @Override
    public List<Back> deleteBack() {
        return null;
    }

    @Override
    public List<List> getFront() {
        return null;
    }

    @Override
    public List<List> getBack() {
        return null;
    }
}
