/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ame
 */
public class CreditsPanel extends JPanel{
    CreditsPanel(){
        
        this.setVisible(false);
    this.setSize(300,1000);
    this.setLayout(null);
    this.setBackground(new Color(51,153,255));
    this.setLocation(700,0);
    Main.f1.add(this); 
    
  
        
    Font f2= new Font("arial",Font.ITALIC,20);
    Font f= new Font("Segoe Print",Font.BOLD,20);
    
    JLabel l1= new JLabel("Credits");
      l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(70,30);
    l1.setLocation(115,10);
    l1.setFont(f);
    this.add(l1);
    

    
   l1= new JLabel("Bug Game");
      l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(150,30);
    l1.setLocation(100,50);
    l1.setFont(f);
    this.add(l1);
    
    l1= new JLabel("Version 1.0");
      l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(130,30);
    l1.setLocation(100,90);
    l1.setFont(f);
    this.add(l1);
    
    l1= new JLabel("Developed in Florence");
      l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(250,30);
    l1.setLocation(50,130);
    l1.setFont(f);
    this.add(l1);
    
 l1= new JLabel("by Alessandro Amedei");
      l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(250,30);
    l1.setLocation(50,155);
    l1.setFont(f);
    this.add(l1);
    
    
    l1=null;
   
        
    }
}
