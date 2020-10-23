package com.jk.controller;

import com.jk.entity.People;
import com.jk.service.PeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PeopleController {

    @Resource
    private PeopleService peopleService;

    @RequestMapping("findAll")
    public List<People> findAll(){
        return peopleService.findAll();
    }

    @RequestMapping("savePeople")
    public void savePeople(@RequestBody People people){
        peopleService.savePeople(people);
    }

    @RequestMapping("deletePeople")
    public void deletePeople(@RequestParam Integer id){
        peopleService.deletePeople(id);
    }

    @RequestMapping("hxPeople")
    public People hxPeople(@RequestParam Integer id){
        return peopleService.hxPeople(id);
    }

    @RequestMapping("updatePeople")
    public void updatePeople(@RequestBody People people){
        peopleService.updatePeople(people);
    }

}
