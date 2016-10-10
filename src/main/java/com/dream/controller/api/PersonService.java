package com.dream.controller.api;

import com.dream.representation.PersonObject;

import java.util.List;

public interface PersonService {

    /**
     * 查询所有的 person
     */
    List<PersonObject> listAll();

    /**
     * 通过 id 查询 person
     */
    PersonObject findById(Long id);
}
