package com.imooc.servlet.el;

public class Course {
    private int id;
    private String name;
    private String category;
    public Course(){

    }

    public Course(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "课程id:" + id +
                ", 课程名称:" + name +
                ", 所属方向:" + category ;
    }
}
