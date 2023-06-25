import greenfoot.*;//Alle Greenfoot-Welten werden für das Programm nutzbar

public class MyWorld extends World{
    private Bus b1;  //Ein Objekt(b1) der Klasse Bus wird als privat deklariert
    private Busschild bs1; //im weiteren: s.o
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
       b1=new Bus(this);   //b1 wird als Objekt der Klasse mit Verbindung zur MyWorld erstellt
       addObject(b1,132,35); //Fügt das Objekt an den gewünschten Platz ein
       
       v1=new Van (this); //v1 wird als Objekt der Klasse Van mit Verbindung zur MyWorld erstellt
       addObject (v1,865,50);//Fügt das Objekt an den gewünschten Platz ein
       
       
       m1=new Muenze [70];  //Mithilfe eines Arrays werden 70 Objekte der Klasse Muenze erschaffen
       for(int i=0; i<m1.length;i++){//Der Array setzt für i immer neue Zahlen ein bis er bei 70 angekommen ist und dann aufhört
           m1[i]=new Muenze(); //Jede Muenze wird nacheinander einzeln erstellt
           addObject(m1[i],Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(900));//Fügt die Objekte der Klasse Muenze zufällig überall auf dem Spielfeld ein 
        }
        
       Greenfoot.setSpeed(50); //Setzt die Geschwindigkeit auf 50
       
       bs1=new Busschild();  //bs1 wird als Objekt der Klasse Busschild erstellt
       addObject(bs1,700,500); //Fügt das Objekt an den gewünschten Platz ein
       
       h1=new Hinder ();            //h1 wird als Objekt der Klasse Hinder erstellt
       addObject(h1,50,50);         //Fügt das Objekt an den gewünschten Platz ein
       h1.getImage().scale(50,290); //Setzt das Bild und die Größe des Objekts auf 50x290 Pixel fest




       h2=new Hinder ();          //im weiteren: s.o
       addObject(h2,520,600);
       h2.getImage().scale(55,530); 
       
       
       h3=new Hinder ();
       addObject(h3,740,740);
       h3.getImage().scale(145,240); 
       
       
    
       h4=new Hinder ();
       addObject(h4,500,195);
       h4.getImage().scale(620,30); 
       
    
       
       h5=new Hinder ();
       addObject(h5,315,35);
       h5.getImage().scale(210,50); 
       
       h6=new Hinder ();
       addObject(h6,675,38);
       h6.getImage().scale(156,40); 
       
       
       h7=new Hinder ();
       addObject(h7,270,540);
       h7.getImage().scale(140,150); 
       
       
       h8=new Hinder ();
       addObject(h8,740,360);
       h8.getImage().scale(135,250); 
       
       h9=new Hinder ();
       addObject(h9,870,620);
       h9.getImage().scale(210,35); 
       
       h10=new Hinder ();
       addObject(h10,180,850);
       h10.getImage().scale(300,215); 
       
       h11=new Hinder ();
       addObject(h11,210,270);
       h11.getImage().scale(36,151); 
       
       
       
       h12=new Hinder ();
       addObject(h12,40,400);
       h12.getImage().scale(36,162); 
       h13=new Hinder ();
       addObject(h13,950,400);
       h13.getImage().scale(45,176); 
       
       h14=new Hinder ();
       addObject(h14,950,80);
       h14.getImage().scale(35,116); 
       
       h15=new Hinder ();
       addObject(h15,960,770);
       h15.getImage().scale(35,25); 
       h16=new Hinder ();
       addObject(h16,370,330);
       h16.getImage().scale(74,45); 
       
       h17=new Hinder ();
       addObject(h17,40,610);
       h17.getImage().scale(30,30); 
       
       
             
    }
    
    public void act(){ //Die Methode public void act wird definiert
        zeigePunkte();  //Die Methode zeigePunkte wird ausgeführt
        gewonnenPruefung(); //Die Methode gewonnenPruefung wird ausgeführt
    }
    
    public void zeigePunkte(){ //Die Methode public void zeigePunkte wird definiert
        showText ("Punkte Bus:    "+b1.punkte,80,20); //Zeigt den Text: "Punkte Bus:    "an den Koordinaten 80,20.In den freien Platz werden die Punkte des Busses eingefügt
        showText ("Punkte Van:    "+v1.punkte,700,20);////Zeigt den Text: "Punkte Van:    "an den Koordinaten 700,20.In den freien Platz werden die Punkte des Vans eingefügt
    }
    
    public void gewonnenPruefung(){//Definiert die Methode public void gewonnenPruefung
        
        if(b1.punkte>19){  //Falls der Bus mehr als 19 Objekte der Klasse Muenze gesammelt hat,...
            showText("Bus hat gewonnen", //...wird der Text "Bus hat gewonnen" angezeigt und zwar...
            getWidth()/2,getHeight()/2);//..in der Mitte des Spielfeldes
            Greenfoot.stop(); //Das Spiel und somit alle Methoden stoppen
            
            
        }
        if(v1.punkte>19){ //Falls der Van mehr als 19 Objekte der Klasse Muenze gesammelt hat,...
            showText("Van hat gewonnen",getWidth()/2,getHeight()/2); //...wird in der Mitte des Spielfeldes der Text "Van hat gewonnen" angezeigt und...
            Greenfoot.stop(); //...das Spiel und somit alle Methoden stoppen

          }
    }
    
    
}