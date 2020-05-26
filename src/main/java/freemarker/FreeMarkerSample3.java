package freemarker;


import freemarker.entity.Computer;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class FreeMarkerSample3 {
    public static void main(String[] args) throws IOException, TemplateException {
        //1.加载模板
        //创建核心配置对象
        Configuration config=new Configuration(Configuration.VERSION_2_3_29);
        //设置加载的目录，""代表当前目录
        config.setClassForTemplateLoading(FreeMarkerSample3.class,"");
        //得到模板对象
        Template t=config.getTemplate("sample3.ftl");
        //2.创建数据
        Map<String,Object> data=new HashMap<>();
        data.put("name","jackson");
        data.put("brand","bmw");
        data.put("words","first blood");
        data.put("n",30000.83);
        data.put("date",new Date());
        List<Computer> computers=new ArrayList<>();
        computers.add(new Computer("623451","ThinkPad",2,null,new Date(), 4100f,new HashMap()));
        computers.add(new Computer("623452","HP XXX",1,"李四",new Date(), 4200f,new HashMap()));
        computers.add(new Computer("623453","DELL XXX",3,null,new Date(), 4300f,new HashMap()));
        computers.add(new Computer("623454","MacPro",1,"张三",new Date(), 16100f,new HashMap()));
        computers.add(new Computer("623455","MacAir",1,"张三",new Date(), 13100f,new HashMap()));
        data.put("computers",computers);
        //3.产生输出
        //new OutputStreamWriter(System.out)字节转字符流
        t.process(data,new OutputStreamWriter(System.out));
    }
}
