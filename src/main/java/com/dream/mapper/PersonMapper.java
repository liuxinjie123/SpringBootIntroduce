package com.dream.mapper;

import com.dream.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select(" select * from hello_person ")
    List<Person> listAll();

    Person findById(@Param("id") Long id);


}
