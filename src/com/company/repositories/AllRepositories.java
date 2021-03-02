package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Back;
import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

            String sql = "SELECT * FROM Front-end_dev";
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);
            List<Front> fronts = new LinkedList<>();
            while (result.next()) {
                Front front = new Front(
                        result.getInt("ID"),
                        result.getString("Name"),
                        result.getInt("Age"),
                        result.getDate("Started_working"),
                        result.getInt("Level"),
                        result.getInt("Salary")


//                        result.getInt("ID_num"),
//                        result.getString("NameOfProd"),
//                        result.getInt("Price"),
//                        result.getString("DateOfManuf"),
//                        result.getString("DueDate"),
//                        result.getString("Manufacturer")
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
    public boolean createFront(Front front) {
        return false;
    }

    @Override
    public boolean createBack(Back back) {
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
    public List<List> deleteList() {
        return null;
    }
}
