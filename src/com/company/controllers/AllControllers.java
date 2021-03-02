package com.company.controllers;

import com.company.entities.Back;
import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

import java.sql.Date;
import java.util.List;

public class AllControllers {
    private final IAllRepositories repository;

    public AllControllers(IAllRepositories repository) {
            this.repository = repository;
        }

    public String getAllFront() {
        List<Front> fronts = repository.getAllFront();
        return fronts.toString();
    }

    public String getAllBack() {
        List<Back> backs = repository.getAllBack();
        return backs.toString();
    }

//    public String getAllBack() {
//        List<Back> backs = repository.getAllBack();
//        return backs.toString();
//    }
    public List<List> getFront() {
        return null;
    }
    public List<List> getBack() {
        return null;
    }
    public List getName(int f_name) {
        return null;
    }
    public boolean addFront(String f_name, int age, Date started_working, int level, int salary) {
        Front front = new Front(f_name, age, started_working, level, salary);
        boolean created = repository.addFront(front);
        return (created ? true : false);
    }
    public boolean addBack(String f_name, int age, Date started_working, int level, int salary) {
        Back back = new Back(f_name, age, started_working, level, salary);
        boolean created = repository.addBack(back);
        return (created ? true : false);
    }
    public List<Front> deleteFront() {
        return null;
    }
    public List<Back> deleteBack() {
        return null;
    }
}
