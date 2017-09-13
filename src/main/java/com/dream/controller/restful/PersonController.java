package com.dream.controller.restful;

import com.dream.api.PersonService;
import com.dream.representation.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Result listAllPerson() {
        return Result.success().putData("list", personService.listAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findPersonById(@PathVariable(value = "id") Long id) {
        return Result.success().putData("person", personService.findById(id));
    }
}
