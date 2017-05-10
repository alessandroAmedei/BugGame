package a;



import a.OptionsPanel.CheckboxE;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class GamePanel extends JPanel{
static JLabel labelG1p = new JLabel();
static    JLabel labelG2p = new JLabel();    
static int r1=255,g1=0,b1=0,r2=0,g2=255,b2=0,r3=0,g3=0,b3=255;    
private Icon img;

    GamePanel(){
    

    this.setVisible(false);
    this.setSize(1000,1000);
    this.setLayout(null);
    this.setBackground(new Color(r2,g2,b2));
    Main.f1.add(this);
        
        
   
    
    Font f= new Font("sansserif",Font.BOLD,20);
    
    labelG1p.setVisible(true);
    labelG1p.setLayout(null);
    labelG1p.setFont(f);
    labelG1p.setLocation(230,810);
    labelG1p.setSize(20,200);
    labelG1p.setText("0");
    //Main.labelTurn.setBorder(BorderFactory.createLineBorder(Color.black));
    this.add(labelG1p);
    
    
    labelG2p.setVisible(true);
    labelG2p.setLayout(null);
    labelG2p.setFont(f);
    labelG2p.setLocation(750,810);
    labelG2p.setSize(20,200);
    labelG2p.setText("0");
    //Main.labelTurn.setBorder(BorderFactory.createLineBorder(Color.black));
    this.add(labelG2p);
    
    Main.labelTurn.setVisible(true);
    Main.labelTurn.setLayout(null);
    Main.labelTurn.setFont(f);
    Main.labelTurn.setLocation(400,810);
    Main.labelTurn.setSize(300,200);
    Main.labelTurn.setText(Main.p3.fg2.getText()+ " Turn");
    Main.labelTurn.setForeground(new Color(0,OptionsPanel.rgb3.getValue(),255));
    this.add(Main.labelTurn);
         
   
        
        JLabel backArrow = new JLabel();
        BackArrowL backArrowL = new BackArrowL();
        
        backArrow.setVisible(true);
        backArrow.setSize(40,40);
        backArrow.setLayout(null);
        backArrow.setLocation(15,900);
        backArrow.addMouseListener(backArrowL);
        
        ImageIcon icon = new ImageIcon("ico1.png"); 
        backArrow.setIcon(icon);
        this.add(backArrow);
        
        
        
     
        
        
        
        
          
     
    
        
    }
    
          
               

    
    
   
    @Override
public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.black);
      
        g.drawLine(0,850,1000,850);
        
        
      
     
    }

public boolean checkup(int x,int y,int distance,short add){
       
       boolean check=true;
       int nButton=(int)Main.p3.noba.getValue();             //CONTROLLO COMPONENTI.....
        int lv=nButton*2;  //Estrazione Componenti JPANEL
        
        
        Button[] b= new Button[add];
        for(int c=0,r=0;r<add;c++){
            if("a.Button".equals(Main.p1.getComponents()[c].getClass().getName())){
        b[r]= (Button) Main.p1.getComponents()[c];
           r++;
           
            }
        }
        
        
    for(int i=0;i<add;i++){
        if(Math.abs(x-b[i].getX())<distance && Math.abs(y-b[i].getY())<distance)
            check=false;
    }
    
    return(check);
    
            
            
        

    
}



public void insertButton(){
    
    int nButton=3;
        nButton=(int) Main.p3.noba.getValue();
        Button bapp = null; 
         MListener l1 = new MListener();    
        
        
        
        
        CheckboxE id=(CheckboxE) Main.p3.cbg1.getSelectedCheckbox();
        
        
       switch(id.getFunction()){
            case 0:
                
        
        int x=50;
    int y;
    
    for(int r=0;r<2;r++){
        
    y=50;    
     for(int c=0;c<nButton;c++){
         bapp=new Button();
    
     bapp.setVisible(true);
    bapp.setSize(50,50);
    bapp.setLayout(null);
    y=y+70;
    bapp.setLocation(x,y);
    bapp.addMouseListener(l1);
    
    this.add(bapp);
    if(r==0){
        bapp.setBackground(new Color(r1,g1,b1));
        bapp.giocatore=true;}
    else{
        bapp.setBackground(new Color(r3,g3,b3));
        bapp.giocatore=false;}
        
     }
     x=this.getWidth()-bapp.getWidth()-x;
     
    }
        
        
    
    
        
        
        break;
        
      
            case 1:  
        
   short add=0;
   Random random = new Random();
          int npX;
          int npY;
          boolean check=false;
          
          
         
        nButton=(int) OptionsPanel.noba.getValue();
          
          for(int r=0;r<2;r++){
              for(int i=0;i<nButton;i++){
          
          while(true){
              
           npX= random.nextInt(900);
           npY= random.nextInt(800);
           
          check=Main.p1.checkup(npX, npY,70,add);  //CON PIU' DI 4 ELEMENTI ENTRA IN UN CICLO INFINITO.... MINORE E' LA DISTANZA(70) PIU BUTTON SI POSSONO METTERE
           
           if(check){
               bapp=new Button();
               bapp.setVisible(true);
               bapp.setSize(50,50);
               bapp.setLayout(null);
               bapp.setLocation(npX,npY);
               bapp.addMouseListener(l1);
               this.add(bapp);
               add++;
               if(r==0){
        bapp.setBackground(new Color(r1,g1,b1));
        bapp.giocatore=true;}
    else{
        bapp.setBackground(new Color(r3,g3,b3));
        bapp.giocatore=false;}
             
               
               break;
               
           }
          }
              }
          }    
          
         break;       
     
}


}


}





