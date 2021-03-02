package com.company.repositories.interfaces;

import com.company.entities.Back;
import com.company.entities.Front;

import java.util.List;

public interface IAllRepositories {
    Front getAllFront();
    List<Back> getAllBack();

    List<List> getAllList();
    List getName(int f_name);
    boolean createFront(Front front);
    boolean createBack(Back back);
    List<Front> deleteFront();
    List<Back> deleteBack();
    List<List> deleteList();
}
