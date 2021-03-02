package com.company.controllers;

import com.company.entities.Back;
import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

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
    public boolean createFront(Front front) {
        return false;
    }
    public boolean createBack(Back back) {
        return false;
    }
    public List<Front> deleteFront() {
        return null;
    }
    public List<Back> deleteBack() {
        return null;
    }
}
