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
    Balance Balance = new Balance();
    Balloons Balloons = new Balloons(3);
    
    public VOGrijper grijper;
    public VOgrijper20 Grijper;
    
    // big array
    public VOConB[] containersB;
    public VOConB currentContainerB = null;
    public VOConB1[] containersB1;
    public VOConB1 currentContainerB1 = null;
    public VOConB2[] containersB2;
    public VOConB2 currentContainerB2 = null;
    
    public VOConEB[] containersEB;
    public VOConEB currentContainerEB = null;
    public VOConEB1[] containersEB1;
    public VOConEB1 currentContainerEB1 = null;
    public VOConEB2[] containersEB2;
    public VOConEB2 currentContainerEB2 = null;
    
    //medium array
    public VOConM[] containersM;
    public VOConM currentContainerM = null;
    public VOConM1[] containersM1;
    public VOConM1 currentContainerM1 = null;
    public VOConM2[] containersM2;
    public VOConM2 currentContainerM2 = null;
    
    public VOConEM[] containersEM;
    public VOConEM currentContainerEM = null;
    public VOConEM1[] containersEM1;
    public VOConEM1 currentContainerEM1 = null;
    public VOConEM2[] containersEM2;
    public VOConEM2 currentContainerEM2 = null;
    
    //small array
    public VOConS[] containersS;
    public VOConS currentContainerS = null;
    public VOConS1[] containersS1;
    public VOConS1 currentContainerS1 = null;
    public VOConS2[] containersS2;
    public VOConS2 currentContainerS2 = null;
    
    public VOConES[] containersES;
    public VOConES currentContainerES = null;
    public VOConES1[] containersES1;
    public VOConES1 currentContainerES1 = null;
    public VOConES2[] containersES2;
    public VOConES2 currentContainerES2 = null;
    
    public void gameover()
    {
        Saver scoreSaver = new Saver();
        scoreSaver.saveHighscore(Counter.getValue());
        
        ScoreBoard finalScore = new ScoreBoard(getWidth()/3, getHeight()/3);
        
        addObject(finalScore, getWidth() /3, getHeight() /3); 
    }
    
    public VrachtOverslaan()
    {
        super(1280, 720, 1); //wereld
        setPaintOrder(Balloons.class, VOCrane.class, VOGrijper.class, VOCrane2.class,
        VOgrijper20.class, VOConS.class, VOConB.class, VOConM.class, VOTrain.class, VOConEB.class, VOConEM.class, VOConES.class,
        VOLocomotief.class, Rails.class, VOreserveplek.class, VOSchip.class, VOSchip2.class );
       
        //kade
        addObject(new VOreserveplek(), 147, 575);
        addObject(new Kade(), 640, 360);
        addObject(new Rails(), 650, 694);
        
        // De trein
        VOTrain Train = new VOTrain();
        VOTrain Train2 = new VOTrain();
        addObject(new VOLocomotief(), 640, 692);
        addObject(Train2, 523, 692);
        addObject(Train, 383, 692);
       
        // Tot hier!
       
        
        // De containers schip1: "Speler"
        
        grijper = new VOGrijper();
        addObject(grijper, 640,550);
        addObject(new VOCrane(), 640, 550);
        
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
        
        containersB1 = new VOConB1[10];
        for(int i = 0; i < containersB1.length; i++ ){
            containersB1[i] = new VOConB1();
        }
        
        addObject(containersB1[0], 990, 400);
        addObject(containersB1[1], 945, 485);
        addObject(containersB1[2], 870, 443);
        addObject(containersB1[3], 765, 400);
        addObject(containersB1[4], 720, 485);
        addObject(containersB1[5], 645, 443);
        addObject(containersB1[6], 540, 400);
        addObject(containersB1[7], 495, 485);
        addObject(containersB1[8], 420, 443);
        addObject(containersB1[9], 315, 400);
        
         containersB2 = new VOConB2[10];
        for(int i = 0; i < containersB2.length; i++ ){
            containersB2[i] = new VOConB2();
        }
        
        addObject(containersB2[0], 990, 400);
        addObject(containersB2[1], 945, 485);
        addObject(containersB2[2], 870, 443);
        addObject(containersB2[3], 765, 400);
        addObject(containersB2[4], 720, 485);
        addObject(containersB2[5], 645, 443);
        addObject(containersB2[6], 540, 400);
        addObject(containersB2[7], 495, 485);
        addObject(containersB2[8], 420, 443);
        addObject(containersB2[9], 315, 400);
        
        
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
        
        containersM1 = new VOConM1[10];
        for(int i = 0; i < containersM1.length; i++ ){
            containersM1[i] = new VOConM1();
        }
        
        addObject(containersM1[0], 1005, 443);
        addObject(containersM1[1], 900, 400);
        addObject(containersM1[2], 855, 485);
        addObject(containersM1[3], 780, 443);
        addObject(containersM1[4], 675, 400);
        addObject(containersM1[5], 630, 485);
        addObject(containersM1[6], 555, 443); 
        addObject(containersM1[7], 450, 400);
        addObject(containersM1[8], 405, 485);
        addObject(containersM1[9], 330, 443);
        
        containersM2 = new VOConM2[10];
        for(int i = 0; i < containersM2.length; i++ ){
            containersM2[i] = new VOConM2();
        }
        
        addObject(containersM2[0], 1005, 443);
        addObject(containersM2[1], 900, 400);
        addObject(containersM2[2], 855, 485);
        addObject(containersM2[3], 780, 443);
        addObject(containersM2[4], 675, 400);
        addObject(containersM2[5], 630, 485);
        addObject(containersM2[6], 555, 443); 
        addObject(containersM2[7], 450, 400);
        addObject(containersM2[8], 405, 485);
        addObject(containersM2[9], 330, 443);
        
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
       
        containersS1 = new VOConS1[10];
        for(int i = 0; i < containersS1.length; i++ ){
            containersS1[i] = new VOConS1();
        }

        addObject(containersS1[0], 1020, 485);
        addObject(containersS1[1], 945, 443);
        addObject(containersS1[2], 840, 402);
        addObject(containersS1[3], 795, 485);
        addObject(containersS1[4], 720, 443);
        addObject(containersS1[5], 615, 402);
        addObject(containersS1[6], 570, 485);
        addObject(containersS1[7], 495, 443);
        addObject(containersS1[8], 390, 400);
        addObject(containersS1[9], 345, 485);
       
        containersS2 = new VOConS2[10];
        for(int i = 0; i < containersS2.length; i++ ){
            containersS2[i] = new VOConS2();
        }

        addObject(containersS2[0], 1020, 485);
        addObject(containersS2[1], 945, 443);
        addObject(containersS2[2], 840, 402);
        addObject(containersS2[3], 795, 485);
        addObject(containersS2[4], 720, 443);
        addObject(containersS2[5], 615, 402);
        addObject(containersS2[6], 570, 485);
        addObject(containersS2[7], 495, 443);
        addObject(containersS2[8], 390, 400);
        addObject(containersS2[9], 345, 485);
       
       
        // Tot hier!
        
        // De containers schip2: "Computer"
        
        Grijper = new VOgrijper20();
        addObject(Grijper, 298, 10);
        addObject(new VOCrane2(), 298, 188);
        
        
        //VOConEB tegenstander "Rood"
        containersEB = new VOConEB[10];
        for(int i = 0; i < containersEB.length; i++ ){
            containersEB[i] = new VOConEB();
        }
        addObject(containersEB[0], 992, 203);
        addObject(containersEB[1], 949, 290);
        addObject(containersEB[2], 873, 246);
        addObject(containersEB[3], 769, 203);
        addObject(containersEB[4], 724, 290);
        addObject(containersEB[5], 650, 246);
        addObject(containersEB[6], 546, 203);
        addObject(containersEB[7], 500, 290);
        addObject(containersEB[8], 428, 246);
        addObject(containersEB[9], 322, 203);
        
        containersEB1 = new VOConEB1[10];
        for(int i = 0; i < containersEB1.length; i++ ){
            containersEB1[i] = new VOConEB1();
        }
        addObject(containersEB1[0], 992, 203);
        addObject(containersEB1[1], 949, 290);
        addObject(containersEB1[2], 873, 246);
        addObject(containersEB1[3], 769, 203);
        addObject(containersEB1[4], 724, 290);
        addObject(containersEB1[5], 650, 246);
        addObject(containersEB1[6], 546, 203);
        addObject(containersEB1[7], 500, 290);
        addObject(containersEB1[8], 428, 246);
        addObject(containersEB1[9], 322, 203);
        
        containersEB2 = new VOConEB2[10];
        for(int i = 0; i < containersEB2.length; i++ ){
            containersEB2[i] = new VOConEB2();
        }
        addObject(containersEB2[0], 992, 203);
        addObject(containersEB2[1], 949, 290);
        addObject(containersEB2[2], 873, 246);
        addObject(containersEB2[3], 769, 203);
        addObject(containersEB2[4], 724, 290);
        addObject(containersEB2[5], 650, 246);
        addObject(containersEB2[6], 546, 203);
        addObject(containersEB2[7], 500, 290);
        addObject(containersEB2[8], 428, 246);
        addObject(containersEB2[9], 322, 203);
        
        //VOConEM tegenstander "Groen"
         containersEM = new VOConEM[10];
        for(int i = 0; i < containersEM.length; i++ ){
            containersEM[i] = new VOConEM();
        }
        
        addObject(containersEM[0], 1007, 246);
        addObject(containersEM[1], 903, 203);
        addObject(containersEM[2], 859, 290);
        addObject(containersEM[3], 784, 246);
        addObject(containersEM[4], 679, 203);
        addObject(containersEM[5], 633, 290);
        addObject(containersEM[6], 561, 246);
        addObject(containersEM[7], 456, 203);
        addObject(containersEM[8], 410, 290);
        addObject(containersEM[9], 338, 246);
        
         containersEM1 = new VOConEM1[10];
        for(int i = 0; i < containersEM1.length; i++ ){
            containersEM1[i] = new VOConEM1();
        }
        
        addObject(containersEM1[0], 1007, 246);
        addObject(containersEM1[1], 903, 203);
        addObject(containersEM1[2], 859, 290);
        addObject(containersEM1[3], 784, 246);
        addObject(containersEM1[4], 679, 203);
        addObject(containersEM1[5], 633, 290);
        addObject(containersEM1[6], 561, 246);
        addObject(containersEM1[7], 456, 203);
        addObject(containersEM1[8], 410, 290);
        addObject(containersEM1[9], 338, 246);
        
         containersEM2 = new VOConEM2[10];
        for(int i = 0; i < containersEM2.length; i++ ){
            containersEM2[i] = new VOConEM2();
        }
        
        addObject(containersEM2[0], 1007, 246);
        addObject(containersEM2[1], 903, 203);
        addObject(containersEM2[2], 859, 290);
        addObject(containersEM2[3], 784, 246);
        addObject(containersEM2[4], 679, 203);
        addObject(containersEM2[5], 633, 290);
        addObject(containersEM2[6], 561, 246);
        addObject(containersEM2[7], 456, 203);
        addObject(containersEM2[8], 410, 290);
        addObject(containersEM2[9], 338, 246);
        
        
        //VOConES tegenstander "Geel"
        containersES = new VOConES[10];
        for(int i = 0; i < containersES.length; i++ ){
            containersES[i] = new VOConES();
        }
        
        addObject(containersES[0], 1022, 290);
        addObject(containersES[1], 947, 246);
        addObject(containersES[2], 842, 203);
        addObject(containersES[3], 799, 290);
        addObject(containersES[4], 724, 246);
        addObject(containersES[5], 620, 203);
        addObject(containersES[6], 574, 290);
        addObject(containersES[7], 502, 246);
        addObject(containersES[8], 396, 203);
        addObject(containersES[9], 351, 290);
        
        containersES1 = new VOConES1[10];
        for(int i = 0; i < containersES1.length; i++ ){
            containersES1[i] = new VOConES1();
        }
        
        addObject(containersES1[0], 1022, 290);
        addObject(containersES1[1], 947, 246);
        addObject(containersES1[2], 842, 203);
        addObject(containersES1[3], 799, 290);
        addObject(containersES1[4], 724, 246);
        addObject(containersES1[5], 620, 203);
        addObject(containersES1[6], 574, 290);
        addObject(containersES1[7], 502, 246);
        addObject(containersES1[8], 396, 203);
        addObject(containersES1[9], 351, 290);
        
        containersES2 = new VOConES2[10];
        for(int i = 0; i < containersES2.length; i++ ){
            containersES2[i] = new VOConES2();
        }
        
        addObject(containersES2[0], 1022, 290);
        addObject(containersES2[1], 947, 246);
        addObject(containersES2[2], 842, 203);
        addObject(containersES2[3], 799, 290);
        addObject(containersES2[4], 724, 246);
        addObject(containersES2[5], 620, 203);
        addObject(containersES2[6], 574, 290);
        addObject(containersES2[7], 502, 246);
        addObject(containersES2[8], 396, 203);
        addObject(containersES2[9], 351, 290); 
        
        //schepen
        addObject(new VOSchip(), 640,442);
        addObject(new VOSchip2(), 640, 250);
        
        
        //Einde
        addObject(new BackButton(), 75, 50);
        addObject(new VOPlek(), 640, 400);
        addObject(new VOPlek2(), 640, 486);
        
        //counter
        Counter = new Counter("Punten: ");
        addObject(Counter, 301, 33);
        
        //Balance
        Balance = new Balance();
        addObject(Balance, 400, 33);
        
        //NPC
        addObject(new Oscar(), 1218, 607);
        Balloons = new Balloons(3);
        addObject(Balloons, 1086, 456);
    }
 
    public Counter getCounter()
    {
        return Counter;
    }
    
    public Balance getBalance(){
        return Balance;
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
        
        if(Counter.getValue() == 90){
            gameover();
            Greenfoot.stop();
        }
        
        if( timer == 500){
            removeObjects(getObjects(Oscar.class));
            removeObjects(getObjects(Balloons.class));
        }
    }
}