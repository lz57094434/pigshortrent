package org.lanqiao.controller;

import org.lanqiao.entity.User;
import org.lanqiao.service.UsermsgImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


@Controller
public class UsermsgController {
@Autowired
private UsermsgImpl userImpl;
    @RequestMapping("/usermsg")
    @ResponseBody
    public int updateByPrimaryKey(User user) {
        return userImpl.updateByPrimaryKey(user);
    }


    public static Random random = new Random();
    public static String char_data = "ABCDEFGHGKMNPQRSTUVWXYZabcdefghjknmpqrstuvwxyz23456789";
    public static String[] font_data = new String[]{"Arial", "宋体"  ,"黑体"};
    public static String text;
    public static BufferedImage draw(){
        StringBuilder sbuilder = new StringBuilder();
        BufferedImage image = createImage(120, 40);
        Graphics g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 120, 40);
        g.setColor(Color.WHITE);
        g.fillRect(1, 1, 120-2, 40-2);
        for (int i=0; i<4; i++){
            g.setFont(randomFont());//设置随机字体
            g.setColor(randomColor());//设置随即颜色
            int index = random.nextInt(char_data.length());
            String tempstr = char_data.substring(index, index+1);//获取随机字符
            g.drawString(tempstr, (120/6*(i+1)), 40-10);//将字符画在画板上
            sbuilder.append(tempstr);//获取验证码
        }
        text = sbuilder.toString();
        for (int i=0; i<3; i++){
            drawRandomLine(g, 120, 40);//画3条干扰线
        }
        return image;
    }
    public static void saveFile(BufferedImage image, OutputStream out) throws IOException {
        ImageIO.write(image, "jpg", out);
    }
    //创建图片缓冲区
    public static BufferedImage createImage(int width, int height){
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        return image;
    }

    //创建随机字体
    public static Font randomFont(){
        int index1 = random.nextInt(font_data.length);
        int font_style = random.nextInt(3);
        int font_size = random.nextInt(10)+20;
        return new Font(font_data[index1],font_style,font_size);
    }
    //创建随机干扰线
    public static void  drawRandomLine(Graphics g, int width,int height){
        int x1 = random.nextInt(width);
        int y1 = random.nextInt(height);
        int x2 = random.nextInt(width);
        int y2 = random.nextInt(height);
        g.setFont(randomFont());//设置随机字体
        g.setColor(randomColor());//设置随即颜色
        g.drawLine(x1, y1, x2, y2);
    }

    //创建随机颜色
    public static Color randomColor(){
        int red = random.nextInt(200);
        int green = random.nextInt(200);
        int blue = random.nextInt(200);
        return new Color(red, green, blue);
    }
    //清除session中的验证码
    public static void removeAttr(final HttpSession session, final String attrName){
        final Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                session.removeAttribute(attrName);
                timer.cancel();
            }
        } , 3*60*1000);
    }

    @RequestMapping("/s")
    @ResponseBody
    public User selectByPrimaryKey(Integer userId){return userImpl.selectByPrimaryKey(userId);}
}

