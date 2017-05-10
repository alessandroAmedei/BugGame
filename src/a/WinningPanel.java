/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ame
 */
public class WinningPanel extends JPanel{


WinningPanel(){
    
    this.setVisible(true);
    this.setSize(1000,800);
    this.setLayout(null);
    this.setLocation(0,50);
    this.setBackground(new Color(29,30,160));
   
    Main.p1.add(this);
    
    
 
    
      
    this.repaint();
   
}

int x=480;
    int y=680;
int xl=230;
  
    int xr=730;

int radius=80;
int x1=480 ,x2=480 ,x3=480 ,x4=480 ,x5=480 ,x6=480,x7=480,x8=480 ,y1=180,y2=180,y3=180,y4=180,y5=180,y6=180,y7=180,y8=180 ;
int xl1=230 ,xl2=230 ,xl3=230 ,xl4=230 ,xl5=230 ,xl6=230,xl7=230,xl8=230 ,yl1=180,yl2=180,yl3=180,yl4=180,yl5=180,yl6=180,yl7=180,yl8=180 ;
int xr1=730 ,xr2=730 ,xr3=730 ,xr4=730 ,xr5=730 ,xr6=730,xr7=730,xr8=730 ,yr1=180,yr2=180,yr3=180,yr4=180,yr5=180,yr6=180,yr7=180,yr8=180 ;

    boolean fire=false;
    
    boolean sound=true;




@Override
public void paintComponent(Graphics g){


    super.paintComponent(g);
   if(!fire){
    
    

    
    
    
      y=y-1;
      
        g.setColor(Color.WHITE);  
  g.drawOval(x,y , 20, 20);
  g.fillOval(x,y , 20, 20);
          g.setColor(Color.GREEN);  
 g.drawOval(xl,y , 20, 20);
  g.fillOval(xl,y , 20, 20);
            g.setColor(Color.RED);  
   g.drawOval(xr,y , 20, 20);
  g.fillOval(xr,y , 20, 20);
  

  
repaint();

if(y==180)
fire=true;

   }
   else{
       
g.setColor(Color.WHITE);
       g.fillOval(x1++,y1++,radius,radius);
       g.fillOval(x2--,y2--,radius,radius);
       g.fillOval(x3++,y3--,radius,radius);
       g.fillOval(x4--,y4++,radius,radius);
       g.fillOval(x5++,y5=y5+2,radius,radius);
       g.fillOval(x6--,y5=y5-2,radius,radius);
       g.fillOval(x7++,y7=y7-2,radius,radius);
       g.fillOval(x8--,y8=y8+2,radius,radius);
       
 g.setColor(Color.GREEN);      
       
      g.fillOval(xl1++,yl1++,radius,radius);
       g.fillOval(xl2--,yl2--,radius,radius);
       g.fillOval(xl3++,yl3--,radius,radius);
       g.fillOval(xl4--,yl4++,radius,radius);
       g.fillOval(xl5++,yl5=yl5+2,radius,radius);
       g.fillOval(xl6--,yl5=yl5-2,radius,radius);
       g.fillOval(xl7++,yl7=yl7-2,radius,radius);
       g.fillOval(xl8--,yl8=yl8+2,radius,radius);
       
g.setColor(Color.RED);
       
       g.fillOval(xr1++,yr1++,radius,radius);
       g.fillOval(xr2--,yr2--,radius,radius);
       g.fillOval(xr3++,yr3--,radius,radius);
       g.fillOval(xr4--,yr4++,radius,radius);
       g.fillOval(xr5++,yr5=yr5+2,radius,radius);
       g.fillOval(xr6--,yr5=yr5-2,radius,radius);
       g.fillOval(xr7++,yr7=yr7-2,radius,radius);
       g.fillOval(xr8--,yr8=yr8+2,radius,radius);
       
       radius=(int) (radius-0.00000000001); 
       
try {  
            Thread.sleep(12);
        } catch (InterruptedException ex) {
            
        }

repaint();
 
  

    if(sound){
        Main.playSound.playSound("explosion1.wav");
        Main.playSound.playSound("explosion2.wav");
    sound=false;}

   
  
}
   
}
}
