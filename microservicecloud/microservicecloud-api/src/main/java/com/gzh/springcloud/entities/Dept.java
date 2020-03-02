package com.gzh.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    
    private String dname;
    
    private String db_source;
    
    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
