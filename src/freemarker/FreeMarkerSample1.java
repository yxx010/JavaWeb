package freemarker;


import freemarker.entity.Computer;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FreeMarkerSample1 {
    public static void main(String[] args) throws IOException, TemplateException {
        //1.加载模板
        //创建核心配置对象
        Configuration config=new Configuration(Configuration.VERSION_2_3_29);
        //设置加载的目录，""代表当前目录
        config.setClassForTemplateLoading(FreeMarkerSample1.class,"");
        //得到模板对象
        Template t=config.getTemplate("sample1.ftl");
        //2.创建数据
        Map<String,Object> data=new HashMap<>();
        data.put("site","百度");
        data.put("url","http://www.baidu.com");
        data.put("date",new Date());
        data.put("number",434.8899988);
        Map info=new HashMap();
        info.put("cpu","i5");
        Computer c1=new Computer("123456","ThinkPad",2,null,new Date(), 4100f,info);
        data.put("computer",c1);
        //3.产生输出
        //new OutputStreamWriter(System.out)字节转字符流
        t.process(data,new OutputStreamWriter(System.out));
    }
}
