package com.imooc.servlet.employee;

public class Employee {
    private Integer no;
    private String name;
    private String department;
    private String job;
    private Float salary;

    public Employee(Integer no, String name, String department, String job, Float salary) {
        this.no = no;
        this.name = name;
        this.department = department;
        this.job = job;
        this.salary = salary;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
