package com.company.repositories.interfaces;

import com.company.entities.Back;
import com.company.entities.Front;
import org.postgresql.util.PSQLException;

import java.util.List;

public interface IAllRepositories {
    List<Front> getAllFront();
    List<Back> getAllBack();

    boolean addFront(Front front);
    boolean addBack(Back back);
    List<Front> deleteFront(int id) throws PSQLException;
    List<Back> deleteBack(int id) throws PSQLException;
}
