package a;


import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @author Alessandro Amedei 4AIT
 */
public class Button extends JButton {
    boolean giocatore;  //2 giocatore e basta per ora
    short identificatore; //PER FIRSTPAGE
    Button(String name){
       super(name); 
    }
    Button(int g){
        
        if(g==0)
        giocatore=true;
        else
            giocatore=false;
        
    }
    
    Button(){
        
    }

    

}
    
    

