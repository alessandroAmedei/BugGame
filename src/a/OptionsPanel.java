package a;



import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;




import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ame
 */


public class OptionsPanel extends JPanel {
   

   static JSlider rgb1 = new JSlider(0,255);
   static JSlider rgb2 = new JSlider(0,255);
   static JSlider rgb3 = new JSlider(0,255);
   static SpinnerNumberModel noba = new SpinnerNumberModel();
   
   static JTextField fg1 = new JTextField();
   static JTextField fg2 = new JTextField();
   
   CheckboxGroup cbg1 = new CheckboxGroup();
   
OptionsPanel(){
        
       
        
    this.setVisible(false);
    this.setSize(350,1000);
    this.setLayout(null);
    this.setBackground(new Color(255,150,0));
    
    Main.f1.add(this); 
        
      JSpinner nob = new JSpinner(noba);
      JLabel l1= new JLabel("Options");    
      JLabel l2= new JLabel("Background Color");
      JLabel g1= new JLabel("Left Button Color");
      JLabel g2= new JLabel("Right Button Color");  
      JLabel nob1 = new JLabel("Number of Checkers for Player");
      JLabel ng1= new JLabel("Name of Left Player");
      JLabel ng2= new JLabel("Name of Right Player");
      JLabel cbL1= new JLabel("Standard Location");
      JLabel cbL2= new JLabel("Casual Location");
      
      
       CheckboxE cb1 = new CheckboxE(false);
      CheckboxE cb2 = new CheckboxE(true);
      
     rgb1.setVisible(true);         //ATTENZIONE A CAMBIARE LE CORDINATE! X E Y SERVONO PER RICONOSCERE LA SLIDE IN SLISTENER.CLASS
     rgb1.setSize(240,40);
     rgb1.setLocation(55,90);
     this.add(rgb1);
     rgb1.setBackground(new Color(rgb1.getValue(),255,0));
    rgb1.addChangeListener(new SListener());
    
    
     rgb2.setVisible(true);
     rgb2.setSize(240,40);
     rgb2.setLocation(55,180);
     this.add(rgb2);
     rgb2.setBackground(new Color(255,0,rgb1.getValue()));
    rgb2.addChangeListener(new SListener());
    
    
    rgb3.setVisible(true);
     rgb3.setSize(240,40);
     rgb3.setLocation(55,270);
     this.add(rgb3);
     rgb3.setBackground(new Color(0,rgb1.getValue(),255));
    rgb3.addChangeListener(new SListener());
    
    
    nob.setVisible(true);
    nob.setSize(60,30);
    nob.setLocation(55,360);
    noba.setMaximum(10);
    noba.setMinimum(3);
    noba.setValue(3);  //Mettere a 3 alla fine delle prove..
    this.add(nob);
    
    fg1.setVisible(true);
    fg1.setSize(150,30);
    fg1.setLocation(55,450);
    this.add(fg1);
    
    fg2.setVisible(true);
    fg2.setSize(150,30);
    fg2.setLocation(55,540);
    this.add(fg2);
    
    cb1.setVisible(true);
    cb1.setSize(15,15);
    cb1.setLocation(55,630);
    cb1.setCheckboxGroup(cbg1);
    this.add(cb1);
    
    cb2.setVisible(true);
    cb2.setSize(15,15);
    cb2.setLocation(55,660);
    cb2.setCheckboxGroup(cbg1);
    
    cbg1.setSelectedCheckbox(cb1);
    
    this.add(cb2);
    
    
   
    Font f= new Font("Segoe Print",Font.ITALIC,20);
    Font f2= new Font("Segoe Print",Font.BOLD,13);
    
    l1.setVisible(true);       //Etichetta OPTIONS
    l1.setSize(140,20);
    l1.setLocation(135,10);
    l1.setFont(f);
    this.add(l1);
    
    
    l2.setVisible(true);
    l2.setSize(120,30);
    l2.setLocation(55,65);
    l2.setFont(f2);
    this.add(l2);
    
    g1.setVisible(true);
    g1.setSize(150,30);
    g1.setLocation(55,155);
    g1.setFont(f2);
    this.add(g1);
    
    g2.setVisible(true);
    g2.setSize(150,30);
    g2.setLocation(55,245);
    g2.setFont(f2);
    this.add(g2);
    
    nob1.setVisible(true);
    nob1.setSize(200,30);
    nob1.setLocation(55,335);
    nob1.setFont(f2);
    this.add(nob1);
    
    ng1.setVisible(true);
    ng1.setSize(200,30);
    ng1.setLocation(55,425);
    ng1.setFont(f2);
    this.add(ng1);
    
    ng2.setVisible(true);
    ng2.setSize(200,30);
    ng2.setLocation(55,515);
    ng2.setFont(f2);
    this.add(ng2);
    
    cbL1.setVisible(true);       //Etichetta OPTIONS
    cbL1.setSize(150,15);
    cbL1.setLocation(85,630);
    cbL1.setFont(f2);
    this.add(cbL1);
    
    cbL2.setVisible(true);       //Etichetta OPTIONS
    cbL2.setSize(150,15);
    cbL2.setLocation(85,660);
    cbL2.setFont(f2);
    this.add(cbL2);
}

    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        
    }
    
    public class CheckboxE extends Checkbox{
       boolean choice;
    
        CheckboxE(boolean app){
           
      choice=app;
        
    }
        
      public int getFunction(){
          if(choice)
              return(1);
              else
              return(0);
      }
    }
    

        
    
}
