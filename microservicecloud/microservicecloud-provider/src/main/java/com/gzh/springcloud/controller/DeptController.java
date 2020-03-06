package com.gzh.springcloud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gzh.springcloud.entities.Dept;
import com.gzh.springcloud.service.DeptService;

@RestController
public class DeptController {
    
    @Autowired
    private DeptService service;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @GetMapping(value ="/dept/add")
    public Dept add(Dept dept) {
     service.addDept(dept); 
     return dept;
    }
    
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }
    
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }
    
    @GetMapping(value = "/query")
    public Map<String, Object> query() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM dept");
        return list.get(0);
    }
}
