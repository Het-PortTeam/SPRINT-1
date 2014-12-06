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
        // De containers:
        addObject(new VOConB(), 990, 400);
        addObject(new VOConM(), 1005, 443 );
        addObject(new VOConS(), 1020, 485);
        addObject(new VOConB(), 945, 485);
        addObject(new VOConS(), 945, 443);
        addObject(new VOConM(), 900, 400);
        addObject(new VOConS(), 840, 402);
        addObject(new VOConB(), 870, 443);
        addObject(new VOConM(), 855, 485);
        // Tot hier!
        addObject(new VOGrijper(), 640,360);
        addObject(new VOCrane(), 640, 360);
        addObject(new VOGrijper2(), 500, 130);
        addObject(new VOCrane2(), 500, 360);
    }
}