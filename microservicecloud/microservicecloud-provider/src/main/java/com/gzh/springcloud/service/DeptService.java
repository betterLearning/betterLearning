package com.gzh.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gzh.springcloud.entities.Dept;

@Service
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
