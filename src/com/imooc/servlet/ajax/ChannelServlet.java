package com.imooc.servlet.ajax;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/channel")
public class ChannelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String level=request.getParameter("level");
        String parent=request.getParameter("parent");
        List list=new ArrayList();
        if(level.equals("1")){
            list.add(new Channel("ai","前沿/区块链/人工智能"));
            list.add(new Channel("web","HTML/CSS/JS"));
        }else if(level.equals("2")){
            if(parent.equals("ai")){
               list.add(new Channel("micro","微服务"));
                list.add(new Channel("blockChain","区块链"));
                list.add(new Channel("other","..."));
            }else if(parent.equals("web")){
                list.add(new Channel("html","html"));
                list.add(new Channel("css","css"));
                list.add(new Channel("other","..."));

            }
        }
        String json= JSON.toJSONString(list);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);

    }
}
