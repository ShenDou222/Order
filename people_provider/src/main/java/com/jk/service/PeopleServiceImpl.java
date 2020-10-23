package com.jk.service;

import com.jk.entity.People;
import com.jk.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public List<People> findAll() {
        return peopleMapper.findAll();
    }

    @Override
    public void savePeople(People people) {
        peopleMapper.insert(people);
    }

    @Override
    public void deletePeople(Integer id) {
        peopleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public People hxPeople(Integer id) {
        return peopleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updatePeople(People people) {
        peopleMapper.updateByPrimaryKey(people);
    }
}
