package a;






import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alessandro Amedei 4AIT
 */
public class MListener implements MouseListener {

    int g1p=0;
    int g2p=0;
    Cronometro timer = new Cronometro();
    private int power=0;
  private Point topLeft;
  int x,y,cx,cy;
    @Override
    public void mousePressed(MouseEvent e) {
        Button b1 = (Button) e.getSource();
        if(Main.turn!=b1.giocatore)   
        return;
    timer.start(); 
    
         
    topLeft = b1.getLocation();    
        
        
        cx=topLeft.x+25;  //CENTRO
        cy=topLeft.y+25;         // 25 è metà del lato
    
     x=e.getX()+topLeft.x; //CLICK
      y=e.getY()+topLeft.y;
      
     
      
      
   
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
        
    Button b1 = (Button) e.getSource();  
    if(Main.turn!=b1.giocatore)   
        return; 
    
       power = (int)timer.stop()/125;
        if(power==0)power=1;
        
        
     topLeft.x=topLeft.x+(cx-x)*power;
       topLeft.y=topLeft.y+(cy-y)*power;
    
     
    b1.setLocation(topLeft.x,topLeft.y);   //FINE CONTROLLI SPOSTAMENTO  
        
        
        
        
        
             int nButton=(int)Main.p3.noba.getValue();             //CONTROLLO COMPONENTI.....
        int lv=nButton*2;  //Estrazione Componenti JPANEL
        Button[] b= new Button[lv];
        for(int c=0,r=0;r<lv;c++){
            if("a.Button".equals(Main.p1.getComponents()[c].getClass().getName())){
        b[r]= (Button) Main.p1.getComponents()[c]; 
        
            r++;
           
            }
        }
        
        
       
        
    
        
        short g1pk=0;
        short g2pk=0;
         
                Point p;
                Point p2;
                
                boolean ok;
                for(int i=0;i<b.length;i++){
                    
                   
                  
                if(b[i].isVisible()==true){                    
                    
                p = b1.getLocation();
                p2 = b[i].getLocation();  
                //Confronto i due topleft.. Se il valore assoluto è minore di 50, un button è sopra l'altro, se sono poi di
                //due "squadre" diverse (giocatore), si elimina quello sotto..
                int q= Math.abs(p.x-p2.x);
                int q2=Math.abs(p.y-p2.y);
                
                
             
                
      
             if(q<=50 && q2<=50 && b1.giocatore!=b[i].giocatore || (p2.x>975 || p2.y>800  || p2.x <-24 || p2.y<-24)){  //far scomparire button
           
                    b[i].setVisible(false);                         //cordinate top down left right LIMITE!
                b[i].removeMouseListener(this);
                if(b[i].giocatore){
                    g2p++;
                    GamePanel.labelG2p.setText(""+g2p);
               Main.playSound.playSound("g1.wav");
                }
                else if(!b[i].giocatore){
                    g1p++;
                    GamePanel.labelG1p.setText(""+g1p);
                Main.playSound.playSound("g2.wav");
                }
                
                
               
                
                //}
                }
                }
                }
                
  
                    
                
                 
        MouseListener app;
        if(Main.turn==true){
                Main.turn=false;
                Main.labelTurn.setText(OptionsPanel.fg2.getText()+ " Turn");
                Main.labelTurn.setForeground(new Color(0,OptionsPanel.rgb3.getValue(),255));
                
                
                
                
           }
        else if(Main.turn==false){
                Main.turn=true;
                Main.labelTurn.setText(OptionsPanel.fg1.getText()+ " Turn");
               Main.labelTurn.setForeground(new Color(255,0,OptionsPanel.rgb2.getValue()));
        }








        
      /*  boolean win;      // CONTROLLO PIU PESANTE ANCHE SE FUNZIONANTE..
        for(int i=0;i<b.length;i++){  //CONTROLLO VINCITA
                    
                   win= b[i].giocatore;
                   if(win && b[i].isVisible())
                       g1pk++;
                   else if(!win && b[i].isVisible())
                       g2pk++;
                      }*/
        
        if(g1p==nButton){
                       Main.labelTurn.setText(Main.p3.fg1.getText() + " has won!");   
                       //Main.playSound.playSound("tada.wav");
                       Main.playSound.playSound("startfw.wav");
                       new WinningPanel();
                       
      
        }
                   
                   else if(g2p==nButton){
                       Main.labelTurn.setText(Main.p3.fg2.getText() + " has won!");
                      //Main.playSound.playSound("tada.wav");
                       Main.playSound.playSound("startfw.wav");
                       
                       new WinningPanel();
       }
     
    
    }
    
    

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {  
       
    
      
                
                }
       
   



 

 //author AlessandroAmedei
 

  
}
             

      
             
    

   
    

