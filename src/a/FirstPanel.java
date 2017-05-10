package a;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ame
 */

public class FirstPanel extends JPanel{
    Image img = null;
    Image img2 = null;
    
    FirstPanel(){
     
        LotL LotL = new LotL();  
        FPListener FPL = new FPListener();
    this.setVisible(true);
    this.setSize(1000,1000);
    this.setLayout(null);
    this.setBackground(Color.white); 
    this.addMouseListener(FPL);
    Main.f1.add(this);
    
    Button start = new Button("Start Game!");
    
    
    Button options = new Button("Options");
    
    Button credits = new Button("Credits");
    
    
    
    
    start.setVisible(true);
    start.setSize(200,80);
    start.setLayout(null);
    start.setLocation(400,580);
    start.addActionListener(LotL); 
    start.setBackground(Color.green);
    start.identificatore=1;
    this.add(start);
    
    options.setVisible(true);
    options.setSize(200,70);
    options.setLayout(null);
    options.setLocation(400,680);
    options.addActionListener(LotL); 
    options.setBackground(Color.green);
    options.identificatore=2;
    this.add(options);
    
    credits.setVisible(true);
    credits.setSize(190,60);
    credits.setLayout(null);
    credits.setLocation(405,780);
    credits.addActionListener(LotL); 
    credits.setBackground(Color.green);
    credits.identificatore=3;
    this.add(credits);
        
    
    img= Toolkit.getDefaultToolkit().getImage("ok.jpg");
    img2= Toolkit.getDefaultToolkit().getImage("logo3.gif");
    
    this.repaint();
    
    }
    
    int B=30;
    int R=80;
    int G=140;
       @Override
   protected void paintComponent(Graphics g){
       
               
       
       super.paintComponent(g);
       
       setOpaque(true);
       g.drawImage(img, 210, 25, 580,580,this);
       g.drawImage(img2, 210, 800, 580,200,this);
       
       g.setColor(new Color(R,G,B));
       g.drawOval(435,10,130,110);
       g.fillOval(435,10,130,110);
       if(B==150)
       B=0;     
       if(R==170)
           R=0;
       if(G==160)
           G=0;
      
       
       
       
        try {  
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            
        }
       
       
      
      // g.drawLine(470,40,440,140);
    
    
       B++;
       R++;
       G++;
      repaint();
    
    }
    

}