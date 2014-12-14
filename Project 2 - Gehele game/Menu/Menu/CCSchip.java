import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class CCSchip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CCSchip extends Actor
{
    /**
     * Act - do whatever the CCSchip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean ShipInHarbor;
    
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        Actor plek = getOneIntersectingObject( CCplek.class );
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();
        int x = getX();
        int y = getY();
 
        
    if(!ShipInHarbor){     
    if (mouseX > 220 && mouseX < 340 && mouseY > 440 && mouseY < 725) {
    if( x > 281) { setLocation(getX() -2, getY() );} 
    if( x == 280) { setRotation(270); setLocation(x, y+1 ); }
    }}

    if(x == 280 && y == 590){ShipInHarbor = true;}
 
    if(!ShipInHarbor){
    if (mouseX > 468 && mouseX < 588 && mouseY > 440 && mouseY < 725) {
    if( x > 528) { setLocation(getX() -2, getY() );} 
    if( x == 528 ) { setRotation(270); setLocation(x, y+1 ); }
    }}

    if(x == 528 && y == 590){ShipInHarbor = true;}
 
    if(!ShipInHarbor){
    if(mouseX > 716 && mouseX < 836 && mouseY > 440 && mouseY < 725) {
    if( x > 776) { setLocation(getX() -2, getY() );} 
    if( x == 776) { setRotation(270); setLocation(x, y+1 ); }
    }}
 
    if(x == 776 && y == 590){ShipInHarbor = true;}

    if(!ShipInHarbor){
    if(mouseX > 964 && mouseX < 1084 && mouseY > 440 && mouseY < 725) {
    if( x > 1024) { setLocation(getX() -2, getY() );} 
    if( x == 1024) { setRotation(270); setLocation(x, y+1 ); }
    }}
   
    if(x == 1024 && y == 590){ShipInHarbor = true;}
    if(x == 1024 && y == 590) { ShipInHarbor = true;}
    if(x == 776 && y == 590) { ShipInHarbor = true;}
    if(x == 528 && y == 590) { ShipInHarbor = true;}
    if(x == 280 && y == 590) { ShipInHarbor = true;}
   
    if(ShipInHarbor == true) {setLocation(x, y );}
    }
  }






