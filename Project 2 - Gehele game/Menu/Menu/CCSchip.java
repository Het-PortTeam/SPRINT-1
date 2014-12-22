import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class CCSchip extends Actor
{
  private boolean ShipInHarbor;
  public int score;
  public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
  public int timer = 0;
  public boolean clicked;
  Actor plek = getOneIntersectingObject( CCplek.class ); 
    
  public void act() 
  {   
      if(Greenfoot.mouseClicked(plek)){ 
          clicked=true; 
      }
        
      if( currentTime + 1000 <  System.currentTimeMillis() )
      {
            timer += 1;
      }
    
      if( timer == 5)
      {
            System.out.println("Cool");
      }
    
      if(clicked==true)
      {
            Actor plek = getOneIntersectingObject( CCplek.class );    
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
        
            mouseClicked();
           // gotClicked();
      }
  }
  /*
  public boolean gotClicked()
  {
      boolean wasClicked=clicked;
      clicked=false;
      return wasClicked;
  }
  */
    public void mouseClicked()
    { 
           
        int x = getX();
        int y = getY();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();
        while(ShipInHarbor == false) {
            if(!ShipInHarbor){     
                if (mouseX > 220 && mouseX < 340 && mouseY > 440 && mouseY < 725) {
                    if( x > 281) { setLocation(getX() -2, getY() );} 
                    if( x == 280 && y > 200) { setRotation(270); setLocation(x, y+1 ); }
                }
            }

            if(x == 280 && y == 590){ShipInHarbor = true;}
 
            if(!ShipInHarbor){
                 if (mouseX > 468 && mouseX < 588 && mouseY > 440 && mouseY < 725) {
                     if( x > 528) { setLocation(getX() -2, getY() );} 
                     if( x == 528 ) { setRotation(270); setLocation(x, y+1 ); }
                 }
            }

            if(x == 528 && y == 590){ShipInHarbor = true;}
 
            if(!ShipInHarbor){
                 if(mouseX > 716 && mouseX < 836 && mouseY > 440 && mouseY < 725) {
                     if( x > 776) { setLocation(getX() -2, getY() );} 
                     if( x == 776) { setRotation(270); setLocation(x, y+1 ); }
                 }
            }
 
            if(x == 776 && y == 590){ShipInHarbor = true;}

            if(!ShipInHarbor){
                 if(mouseX > 964 && mouseX < 1084 && mouseY > 440 && mouseY < 725) {
                     if( x > 1024) { setLocation(getX() -2, getY() );} 
                     if( x == 1024) { setRotation(270); setLocation(x, y+1 ); }
                 }
            }
   
            World W = getWorld();
    
            if(x == 1024 && y == 590){ShipInHarbor = true; W.removeObjects(W.getObjects(CCSchip.class));}
            if(x == 776 && y == 590) { ShipInHarbor = true; W.removeObjects(W.getObjects(CCSchip.class));}
            if(x == 528 && y == 590) { ShipInHarbor = true; W.removeObjects(W.getObjects(CCSchip.class));}
            if(x == 280 && y == 590) { ShipInHarbor = true; W.removeObjects(W.getObjects(CCSchip.class));}
   
            if(ShipInHarbor == true) {setLocation(x, y ); score++;} 
        }
    }
}