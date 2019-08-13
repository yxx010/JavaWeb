package com.imooc.servlet.json;

import com.alibaba.fastjson.JSON;

import java.util.Calendar;

public class FastJson1 {
    public static void main(String[] args) {
        Emp emp =new Emp();
        emp.setNo(4488);
        emp.setName("王晓东");
        emp.setJob("客户经理");
        emp.setSalary(1000f);
        emp.setDname("市场部");
        Calendar c=Calendar.getInstance();
        c.set(2019,0,30,0,0,0);
        emp.setDate(c.getTime());
        //FastJson提供了Json与字符串的转换
        String json=JSON.toJSONString(emp);
        System.out.println(json);
        Emp emp1=JSON.parseObject(json,Emp.class);
        System.out.println(emp1.getName());
    }
}
