package com.imooc.servlet.upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建磁盘文件项工厂
        DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
        //2.创建核心解析类
        ServletFileUpload fileUpload=new ServletFileUpload(diskFileItemFactory);
        //3.解析请求对象
        try {
            List<FileItem> list=fileUpload.parseRequest(request);
            //4.遍历集合获取每个部分的对象
            for(FileItem fileItem:list){
                //判断是普通项，还是文件上传项
                if(fileItem.isFormField()){
                    //普通项
                    //获取普通项的名称
                    String name=fileItem.getFieldName();
                    String value=fileItem.getString("UTF-8");
                    System.out.println(name+" "+value);
                }else{
                    //文件上传项
                    //获取文件名
                    String fileName=fileItem.getName();
                    //获取文件的输入流
                    InputStream is=fileItem.getInputStream();
                    //将文件写到另外一个路径
                    String path=getServletContext().getRealPath("/upload");
                    System.out.println(path);
                    //创建输出流与输入流对接

                    OutputStream fos=new FileOutputStream(path+"\\"+fileName);
                    int len=0;
                    byte []b=new byte[1024];
                    while ((len=is.read(b))!=-1){
                        fos.write(b,0,len);
                    }
                    is.close();
                    fos.close();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
