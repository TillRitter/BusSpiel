import greenfoot.*;//

public class MyWorld extends World{
    private Bus b1;
    private Busschild bs1;
    private Van v1;
    
    private Hinder h1;
    private Hinder h2;
    private Hinder h3;
    private Hinder h4;
    private Hinder h5;
    private Hinder h6;
    private Hinder h7;
    private Hinder h8;
    private Hinder h9;
    private Hinder h10;
    private Hinder h11;
    private Hinder h12;
    private Hinder h13;
    private Hinder h14;
    private Hinder h15;
    private Hinder h16;
    private Hinder h17;
    private Muenze m1[];
    public MyWorld(){ //Der Konstruktor der MyWorld wird definiert
       super (1000,900,1);  //Legt die Spielfeldgröße auf 1000x900 fest
       b1=new Bus(this);
       addObject(b1,132,35); //Fügt das Objekt an den gewünschten Platz ein
       
       v1=new Van (this);
       addObject (v1,865,50);//Fügt das Objekt an den gewünschten Platz ein
       
       
       m1=new Muenze [70];
       for(int i=0; i<m1.length;i++){//bestimmte Anzahl WH
           m1[i]=new Muenze();
           addObject(m1[i],Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(900));//Fügt die Objekte der Klasse Muenze zufällig überall auf dem Spielfeld ein 
        }
        
       Greenfoot.setSpeed(60);
       
       bs1=new Busschild();
       addObject(bs1,700,500); //Fügt das Objekt an den gewünschten Platz ein
       
       h1=new Hinder ();            //Fügt das Objekt hinzu
       addObject(h1,50,50);         //Fügt das Objekt an den gewünschten Platz ein
       h1.getImage().scale(50,290); //Gibt das Bild und die Größe des Objekts



        //F�gt das objekt hinzu
        //F�gt das Objekt an den gew�nschten platz ein
        //Gibt das Bild und die Gr��e des objekts




       h2=new Hinder ();          
       addObject(h2,520,600);//F�gt das Objekt an den gew�nschten platz ein
       h2.getImage().scale(55,530); //Gibt das Bild und die Gr��e des objekts
       
       
       h3=new Hinder ();
       addObject(h3,740,740);//F�gt das Objekt an den gew�nschten platz ein
       h3.getImage().scale(145,240); //Gibt das Bild und die Gr��e des objekts
       
       
    
       h4=new Hinder ();
       addObject(h4,500,195);//F�gt das Objekt an den gew�nschten platz ein
       h4.getImage().scale(620,30); //Gibt das Bild und die Gr��e des objekts
       
    
       
       h5=new Hinder ();
       addObject(h5,315,35);//F�gt das Objekt an den gew�nschten platz ein
       h5.getImage().scale(210,50); //Gibt das Bild und die Gr��e des objekts
       
       h6=new Hinder ();
       addObject(h6,675,38);//F�gt das Objekt an den gew�nschten platz ein
       h6.getImage().scale(156,40); //Gibt das Bild und die Gr��e des objekts
       
       
       h7=new Hinder ();
       addObject(h7,270,540);//F�gt das Objekt an den gew�nschten platz ein
       h7.getImage().scale(140,150); //Gibt das Bild und die Gr��e des objekts
       
       
       h8=new Hinder ();
       addObject(h8,740,360);//F�gt das Objekt an den gew�nschten platz ein
       h8.getImage().scale(135,250); //Gibt das Bild und die Gr��e des objekts
       
       h9=new Hinder ();
       addObject(h9,870,620);//F�gt das Objekt an den gew�nschten platz ein
       h9.getImage().scale(210,35); //Gibt das Bild und die Gr��e des objekts
       
       h10=new Hinder ();
       addObject(h10,180,850);//F�gt das Objekt an den gew�nschten platz ein
       h10.getImage().scale(300,215); //Gibt das Bild und die Gr��e des objekts
       
       h11=new Hinder ();
       addObject(h11,210,270);//F�gt das Objekt an den gew�nschten platz ein
       h11.getImage().scale(36,151); //Gibt das Bild und die Gr��e des objekts
       
       
       //L1=new Leute ();
       //addObject(L1,800,100);
       //L1.getImage().scale(240,65);
       
       h12=new Hinder ();
       addObject(h12,40,400);//F�gt das Objekt an den gew�nschten platz ein
       h12.getImage().scale(36,162); //Gibt das Bild und die Gr��e des objekts
       
       h13=new Hinder ();
       addObject(h13,950,400);//F�gt das Objekt an den gew�nschten platz ein
       h13.getImage().scale(45,176); //Gibt das Bild und die Gr��e des objekts
       
       h14=new Hinder ();
       addObject(h14,950,80);//F�gt das Objekt an den gew�nschten platz ein
       h14.getImage().scale(35,116); //Gibt das Bild und die Gr��e des objekts
       
       h15=new Hinder ();
       addObject(h15,960,770);//F�gt das Objekt an den gew�nschten platz ein
       h15.getImage().scale(35,25); //Gibt das Bild und die Gr��e des objekts
       
       h16=new Hinder ();
       addObject(h16,370,330);//F�gt das Objekt an den gew�nschten platz ein
       h16.getImage().scale(74,45); //Gibt das Bild und die Gr��e des objekts
       
       h17=new Hinder ();
       addObject(h17,40,610);//F�gt das Objekt an den gew�nschten platz ein
       h17.getImage().scale(30,30); //Gibt das Bild und die Gr��e des objekts
       
       
             
    }
    
    public void act(){ 
        zeigePunkte();
        gewonnenPruefung();
    }
    
    public void zeigePunkte(){
        showText ("Punkte Bus:    "+b1.punkte,80,20);
        showText ("Punkte Van:    "+v1.punkte,500,20);
    }
    
    public void gewonnenPruefung(){
        
        if(b1.punkte>19){
            showText("Bus hat gewonnen",
            getWidth()/2,getHeight()/2);
            Greenfoot.stop();
            
            
        }
        if(v1.punkte>19){
            showText("Van hat gewonnen",getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    
    
}