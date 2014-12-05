import greenfoot.*; 

public class VrachtOverslaan extends World
{
    public VrachtOverslaan()
    {    
        super(1280, 720, 1); 
       
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 640, 360);
        addObject(new VOSchip(), 640,440);
        addObject(new VOSchip2(), 640, 250);
        addObject(new VOConB(), 990, 400);
        addObject(new VOConM(), 1005, 443 );
        addObject(new VOConS(), 1020, 485);
        addObject(new VOCrane(), 640, 360);
        addObject(new VOCrane2(), 500, 360);
    }
}