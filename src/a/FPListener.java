/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Ame
 */
public class FPListener implements MouseListener { 

    @Override
    public void mouseClicked(MouseEvent me) {
        Main.p3.setVisible(false);
        Main.p4.setVisible(false);
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       int x= me.getXOnScreen();
               int y=me.getYOnScreen();
               
           if(x<40&&y<100)    {
               Main.p3.setVisible(true);
               Main.p2.setComponentZOrder(Main.p3,2);
           }
           
           if(x>950&&y<100)    {
               Main.p4.setVisible(true);
               Main.p2.setComponentZOrder(Main.p4,2);
           }
           
           }
           

    @Override
    public void mouseExited(MouseEvent me) {
       
    }
    
}
