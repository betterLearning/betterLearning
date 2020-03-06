package com.gzh.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzh.springcloud.dao.DeptDao;
import com.gzh.springcloud.entities.Dept;
import com.gzh.springcloud.mapper.DeptMapper;
import com.gzh.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
    
    @Autowired
    private DeptDao dao;
    
    @Autowired
    private DeptMapper mapper;
    
    @Override
    public long addDept(Dept dept) {
        
        return mapper.insertDept(dept);
    }
    
    @Override
    public Dept get(Long id) {
        
        return mapper.getDeptById(id);
    }
    
    @Override
    public List<Dept> list() {
        
        return dao.findAll();
    }
    
}
