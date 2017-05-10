package a;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *@author Alessandro Amedei 4AIT
 */
public class LotL implements ActionListener {  //PAGINA INIZIALE..

//1 StartL
//2 Option

   
            
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        
            
                
        Button bapp= (Button)ae.getSource();
        short id=bapp.identificatore;
        
        switch(id){
            case 1:
                
        if("".equals(Main.p3.fg1.getText()))      //Condizione STRINGHE.. SE SONO VUOTE NOME DEFAULT;
            Main.p3.fg1.setText("Left Player");
        if("".equals(Main.p3.fg2.getText()))
            Main.p3.fg2.setText("Right Player");        
                
        Main.p3.setVisible(false);
        Main.p2.setVisible(false);
        Main.p1=new GamePanel();
        
        Main.p1.setVisible(true);
        Main.playSound.playSound("click1.wav");
        Main.p1.insertButton();
       
        
                break;
                
            case 2:
            
        Main.p3.setVisible(true);
        Main.p2.setComponentZOrder(Main.p3,2);
        
       
        Main.playSound.playSound("click1.wav");
         
 
                break;
                
            case 3:
                Main.p4.setVisible(true);
                Main.p2.setComponentZOrder(Main.p4,2);
                Main.playSound.playSound("click1.wav");
                break;
        }      
                
            
            
      
    }
        
            
       
    }
