package com.jk.service;

import com.jk.entity.People;

import java.util.List;

public interface PeopleService {


    List<People> findAll();

    void savePeople(People people);

    void deletePeople(Integer id);

    People hxPeople(Integer id);

    void updatePeople(People people);
}
