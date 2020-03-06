package com.gzh.springcloud.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.gzh.springcloud.entities.Dept;

@Mapper
public interface DeptMapper {
    
    @Select(value ="select * from dept where deptno = #{deptno}")
    public Dept getDeptById(Long id);
    
    @Options(useGeneratedKeys = true,keyProperty="deptno")
    @Insert(value ="insert into dept(dname,db_source) values(#{dname},DATABASE())")
    public long insertDept(Dept dept);
}
