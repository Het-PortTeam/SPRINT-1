import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControleCentrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControleCentrum extends World
{    
    private String img;  
    private GifImage gif = new GifImage("water_gif_test2.gif");  
    public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
    public int timer = 0;
    public int explainOnce = 1;
    Counter Counter = new Counter();

    public ControleCentrum()
    {    
        super(1280, 720, 1); 
        addObject(new CCLand1(), 100, 495);
        addObject(new CCLand2(), 1190, 565);
        addObject(new CCBoei(), 400, 300);
        addObject(new CCBoei(), 650, 300);
        addObject(new CCBoei(), 900, 300);
        addObject(new CCKade(), 400, 570); 
        addObject(new CCKade(), 650, 570);
        addObject(new CCKade(), 900, 570);
        Counter = new Counter("Punten: ");
        addObject(Counter, 600, 75);
        addObject(new CCSchip(Counter), 1200, 200);
        addObject(new CCplek(), 280, 590); 
        addObject(new CCplek(), 527, 590);
        addObject(new CCplek(), 777, 590);
        addObject(new CCplek(), 1027, 590);
        addObject(new BackButton(), 75, 50);
        
        addObject(new CCEind(), 136, 202);
        
        
    }
        
        
    
    public void act()
    {
        setBackground(gif.getCurrentImage());
      /* if(explainOnce == 1) {
           Greenfoot.playSound("CC.mp3");
           explainOnce = 0;
       }*/
       
  /*     if( currentTime + 1000 <  System.currentTimeMillis() )
    {
        timer += 1;
    }
    
    if( timer == 500)
    {
        timer = 0;
        addObject(new CCSchip(point), 1200, 200);
    }*/
    }

}


