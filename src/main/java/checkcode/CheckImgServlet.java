package checkcode;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckImgServlet")
public class CheckImgServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width=120;
        int height=30;
        //步骤一，内存中生成一张图片
        BufferedImage bufferedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //步骤二，操作该图片，设置背景色及绘制边框
        Graphics graphics=bufferedImage.getGraphics();
        //设置背景色
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0,0,width,height);
        //绘制边框
        graphics.setColor(Color.BLUE);
        graphics.drawRect(0,0,width-1,height-1);
        //步骤三，生成随机数字，写入到图片中
        Graphics2D graphics2D=(Graphics2D) graphics;
        graphics2D.setColor(Color.BLACK);
        graphics2D.setFont(new Font("宋体",Font.BOLD,18));
        String words="ABCDEFGHIJKLMNOPQRST";
        Random random=new Random();
        //定义字符串，保存随机字符
        StringBuffer sb=new StringBuffer();
        int x=10;
        for (int i=0;i<4;i++){
            graphics2D.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
            int idx=random.nextInt(words.length());
            //获得指定位置字符
            char c=words.charAt(idx);
            //将随机生成的字符存入sb
            sb.append(c);
            //产生正负30度
            int jiaodu=random.nextInt(60)-30;
            //角度转化成弧度
            double theta=jiaodu*Math.PI/180;

            graphics2D.rotate(theta,x,20);
            graphics2D.drawString(String.valueOf(c),x,20);
            graphics2D.rotate(-theta,x,20);

            x+=30;
        }
        //字符串存到session里
        request.getSession().setAttribute("checkCode",sb.toString());
        //步骤四，输出到浏览器
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
    }
}
