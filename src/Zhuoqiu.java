

import java.awt.*;
import javax.swing.*;

public class Zhuoqiu extends JFrame{
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x = 100;
	double y = 100;
	double degree = 3.14/3;
	//boolean right = true;
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("chuangkoubeihualeyici");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
/*		if (x>800) {
			right = false;
		}
		if (x<50) {
			right = true;
		}
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}*/
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if (y>500-40-30||y<40+40) {
			degree=-degree;
		}
		if(x<40||x>856-40-30) {
			degree=3.14-degree;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856, 500);
		setLocation(100,100);
		setVisible(true);
		
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		System.out.println("welcome to creat cutegame");
		Zhuoqiu ballgame = new Zhuoqiu();
		ballgame.launchFrame();
	}
}