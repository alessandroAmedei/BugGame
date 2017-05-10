package a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *@author Alessandro Amedei 4AIT
 */
public class Cronometro {
    
long startTime=0;
boolean active=false;

public void start(){
  if(active) return;
  active=true;
  startTime=System.currentTimeMillis();
}

public long stop(){
if(!active) return(-1);
active=false;
return(System.currentTimeMillis()-startTime);  //END TIME - START TIME = ELAPSE TIME
    
}
    
}
