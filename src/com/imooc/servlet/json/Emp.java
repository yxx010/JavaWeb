package com.imooc.servlet.json;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Emp {
    private Integer no;
    private String name;
    private String job;
    //不显示市场部
    @JSONField(serialize = false)
    private String dname;
    @JSONField(name="hiredate" ,format = "yyyy-MM-dd hh:mm:ss")
    private Date date;
    private Float salary;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
