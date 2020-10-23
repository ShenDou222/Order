package com.jk.service;

import com.jk.entity.People;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "peopleprovider")
public interface PeopleService {

    @RequestMapping("findAll")
    public List<People> findAll();

    @RequestMapping("savePeople")
    public void savePeople(@RequestBody People people);

    @RequestMapping("deletePeople")
    public void deletePeople(@RequestParam Integer id);

    @RequestMapping("hxPeople")
    public People hxPeople(@RequestParam Integer id);

    @RequestMapping("updatePeople")
    public void updatePeople(@RequestBody People people);


}
