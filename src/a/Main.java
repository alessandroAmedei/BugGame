package a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alessandro Amedei 4AIT
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amedei.alessandro
 */
public class Main {
static JFrame f1;
static GamePanel p1;
static FirstPanel p2;
 static OptionsPanel p3;
static CreditsPanel p4;
static playSound playSound= new playSound();

static JLabel labelTurn;
static boolean turn=false;

    public static void main(String[] args){

    f1 = new JFrame();
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    f1.setVisible(true);
    f1.setSize(1000,1000);
    f1.setResizable(false);
    f1.setLayout(null);
    
    ImageIcon imc= new ImageIcon("ico3.png");
f1.setIconImage(imc.getImage()); //f è la JFrame
    
    labelTurn = new JLabel();
  
    
     p3=new OptionsPanel();   
    p2=new FirstPanel();
    p4=new CreditsPanel();
    

    
    
   
    
    

    
    
    

   
    
    
    
    
    
   
    }
}
    
    


