package a;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ame
 */
public class BackArrowL implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        //if(me.getX()>15 && me.getX()<55 && me.getY()>860  && me.getY()<900){
            Main.p1.setVisible(false);
        Main.p2.setVisible(true);
        Main.p1=null;
        Main.turn=false;
         
      //  }
         
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
     
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
      
    }
    
}
