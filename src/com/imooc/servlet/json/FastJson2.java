package com.imooc.servlet.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class FastJson2 {
    public static void main(String[] args) {
        List emplist=new ArrayList();
        for(int i=1;i<=5;i++){
            Emp emp=new Emp();
            emp.setNo(4488+i);
            emp.setName("员工"+i);
            emplist.add(emp);
        }
        String json=JSON.toJSONString(emplist);
        System.out.println(json);

        List<Emp> emps=JSON.parseArray(json,Emp.class);
        for(Emp emp:emps){
            System.out.println(emp.getNo()+":"+emp.getName());
        }
    }

}
