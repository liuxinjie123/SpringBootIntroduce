package com.dream.service;

import com.dream.controller.api.PersonService;
import com.dream.mapper.PersonMapper;
import com.dream.representation.PersonObject;
import com.dream.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<PersonObject> listAll() {
        return BeanMapper.mapList(personMapper.listAll(), PersonObject.class);
    }

    @Override
    public PersonObject findById(Long id) {
        return BeanMapper.map(personMapper.findById(id), PersonObject.class);
    }


}
