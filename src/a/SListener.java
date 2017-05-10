package a;

import java.awt.Color;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ame
 */
public class SListener implements ChangeListener {

  @Override
  public void stateChanged(ChangeEvent e){
      
      JSlider slide = (JSlider) e.getSource();
      int R,G,B;
      
    switch(slide.getY()){
        
        
        case 90:
            
      R=slide.getValue();
      G=255;
      B=slide.getValue()/200;
              
      
      OptionsPanel.rgb1.setBackground(new Color(R,G,B));
      
      GamePanel.r2=R;
      GamePanel.g2=G;
      GamePanel.b2=B;
         break;
            
            
            
        case 180:
            
            
            R=255;
      G=0;
      B=slide.getValue();
            
            
      GamePanel.r1=R;
      GamePanel.g1=G;
      GamePanel.b1=B;
            OptionsPanel.rgb2.setBackground(new Color(R,G,B));
         //   Main.p3.rgb2.setBackground(new Color(R,G,B));
         //   Main.p2.setBackground(new Color(R,G,B));
            break;
        case 270:
            
            
            R=0;
      G=slide.getValue();
      B=255;
            
            GamePanel.r3=R;
      GamePanel.g3=G;
      GamePanel.b3=B;
    
    //Main.labelTurn.setForeground(new Color(R,G,B)); Colore INIZIALE..
    
            OptionsPanel.rgb3.setBackground(new Color(R,G,B));
            break;
            
            
    }
    
    
  }
}
