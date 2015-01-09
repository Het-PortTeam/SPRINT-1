import greenfoot.*; 


public class VrachtOverslaan extends World
{
    private String img;  
    private GifImage gif = new GifImage("water_gif_test2.gif");
    public long currentTime = System.currentTimeMillis();   // Later (for example in an act() method), do:
    public int timer = 0;
    public int explainOnce = 1;
    public double Difficulty = 1; 
    Counter Counter = new Counter();
    public VOGrijper grijper;
    public VOConB[] containersB;
    public VOConB currentContainerB = null;
    public VOConM[] containersM;
    public VOConM currentContainerM = null;
    public VOConS[] containersS;
    public VOConS currentContainerS = null;
    
    public VrachtOverslaan()
    {
        super(1280, 720, 1); //wereld
        setPaintOrder(VOCrane.class, VOGrijper.class, VOCrane2.class,
        VOgrijper20.class, VOConS.class, VOConB.class, VOConM.class,
        VOTrain.class, VOLocomotief.class, Rails.class, VOSchip.class, VOSchip2.class);
       
        //kade
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 650, 694);
        
        // De trein
        addObject(new VOLocomotief(), 640, 695);
        addObject(new VOTrain(), 523, 698);
        addObject(new VOTrain(), 383, 698);
        // Tot hier!
        
        //schepen
        addObject(new VOSchip(), 640,442);
        addObject(new VOSchip2(), 640, 250);
        
        // De containers schip1:
        
        grijper = new VOGrijper();
        addObject(grijper, 640,550);
        addObject(new VOCrane(), 640, 550);
        addObject(new VOgrijper20(), 500, 130);
        addObject(new VOCrane2(), 500, 188);
        
        //VOConB "Rood"
        containersB = new VOConB[10];
        for(int i = 0; i < containersB.length; i++ ){
            containersB[i] = new VOConB();
        }
        
        addObject(containersB[0], 990, 400);
        addObject(containersB[1], 945, 485);
        addObject(containersB[2], 870, 443);
        addObject(containersB[3], 765, 400);
        addObject(containersB[4], 720, 485);
        addObject(containersB[5], 645, 443);
        addObject(containersB[6], 540, 400);
        addObject(containersB[7], 495, 485);
        addObject(containersB[8], 420, 443);
        addObject(containersB[9], 315, 400);
        
        //VOConM "Groen"
        containersM = new VOConM[10];
        for(int i = 0; i < containersM.length; i++ ){
            containersM[i] = new VOConM();
        }
        
        addObject(containersM[0], 1005, 443);
        addObject(containersM[1], 900, 400);
        addObject(containersM[2], 855, 485);
        addObject(containersM[3], 780, 443);
        addObject(containersM[4], 675, 400);
        addObject(containersM[5], 630, 485);
        addObject(containersM[6], 555, 443); 
        addObject(containersM[7], 450, 400);
        addObject(containersM[8], 405, 485);
        addObject(containersM[9], 330, 443);
        
        //VOConS "Geel"
        containersS = new VOConS[10];
        for(int i = 0; i < containersS.length; i++ ){
            containersS[i] = new VOConS();
        }

        addObject(containersS[0], 1020, 485);
        addObject(containersS[1], 945, 443);
        addObject(containersS[2], 840, 402);
        addObject(containersS[3], 795, 485);
        addObject(containersS[4], 720, 443);
        addObject(containersS[5], 615, 402);
        addObject(containersS[6], 570, 485);
        addObject(containersS[7], 495, 443);
        addObject(containersS[8], 390, 400);
        addObject(containersS[9], 345, 485);
       
        // Tot hier!
        
        // De containers schip2:
        //VOConB tegenstander "Rood"
        addObject(new VOConB(), 992, 203);
        
        //VOConM tegenstander "Groen"
        addObject(new VOConM(), 1007, 246);
        
        //VOConS tegenstander "Geel"
        addObject(new VOConS(), 1022, 290);
        
        
        //Einde
        addObject(new BackButton(), 75, 50);
        addObject(new VOPlek(), 640, 400);
        addObject(new VOPlek2(), 640, 486);
        
        //counter
        Counter = new Counter("Punten: ");
        addObject(Counter, 301, 33);
    }
 
    public Counter getCounter()
    {
        return Counter;
    }
    
    public void act()
    {
        int CounterValue = Counter.getValue();
        setBackground(gif.getCurrentImage());
        if( currentTime + 1000 <  System.currentTimeMillis() )
       {
           timer += Difficulty;
       }
    
       if( timer == 3000)
       {
           timer = 0;
           
           addObject(new VOLocomotief(), 640, 695);
           addObject(new VOTrain(), 523, 698);
           addObject(new VOTrain(), 383, 698);
           
           //System.out.print(Difficulty);
       }
       
              if(CounterValue % 25 == 0 && CounterValue > 0)
       {
           Difficulty = CounterValue / 25;
        }
    }
}