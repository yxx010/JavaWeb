package com.imooc.servlet.regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
	public static void main(String[] args) {
		StringBuilder content = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream("web/city.html");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader bufferedReader = new BufferedReader(isr);
			String lineText = "";
			while((lineText = bufferedReader.readLine()) != null) {
//				System.out.println(lineText);
				content.append(lineText + "\n");
			}
			bufferedReader.close();
			System.out.println(content);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1.创建正则表达式对象
		Pattern p = Pattern.compile("<li>([\\u4e00-\\u9fa5]{2,10})([a-zA-Z]+)</li>");
		//2.匹配正则表达式
		Matcher m = p.matcher(content);
		//3.查找匹配的结果
		while(m.find()) {
		//group(0)匹配的完整字符串
//			System.out.println(m.group(0));
			//第一个分组
			String chs = m.group(1);
			//第二个分组
			String eng = m.group(2);
			System.out.println(chs + "-" + eng);
		}
	}
}
