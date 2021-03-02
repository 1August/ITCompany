package com.company.controllers;

import com.company.entities.Back;
import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

import java.util.List;

public class AllControllers implements IAllRepositories {
    private final IAllRepositories repository;

    public AllControllers(IAllRepositories repository) {
            this.repository = repository;
        }

    @Override
    public String getAllFront() {
        List<Front> fronts = repository.getAllFront();
        return fronts.toString();
    }

    @Override
    public String getAllBack() {
        List<Back> backs = repository.getAllBack();
        return backs.toString();
    }

//    public String getAllBack() {
//        List<Back> backs = repository.getAllBack();
//        return backs.toString();
//    }
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
