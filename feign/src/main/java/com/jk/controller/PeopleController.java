package com.jk.controller;

import com.jk.entity.People;
import com.jk.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PeopleController {

    @Resource
    private PeopleService peopleService;
    
    @RequestMapping("people/toAdd")
    public String toAdd(Model model){

        model.addAttribute("selectPeopleById",new People());
        return "insertProple";
    }

    @RequestMapping("findOrder")
    public String findOrder(Model model){
        List<People> people = peopleService.findAll();
        model.addAttribute("peopleList",people);
        return "PeopleIndex";
    }

    @RequestMapping("savePeople")
    public String savePeople(People people){
        if (people.getId() == null){
            peopleService.savePeople(people);
        }else{
            peopleService.updatePeople(people);
        }

        return "redirect:findOrder";
    }

    @RequestMapping("deletePeopleById")
    public String deletePeopleById(Integer peopleId){
        peopleService.deletePeople(peopleId);
        return "redirect:findOrder";
    }

    @RequestMapping("selectPeopleById")
    public String selectPeopleById(Integer peopleId,Model model){
        People people = peopleService.hxPeople(peopleId);
        model.addAttribute("selectPeopleById",people);
        return "insertProple";
    }


}
