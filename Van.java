import greenfoot.*; //Alle Greenfoot-Klassen werden für das Programm nutzbar


public class Van extends Actor//Der Van hat Zugriff auf den Actor
{
    MyWorld w;    //Ein Platz wird für die MyWorld freigestellt
    int punkte;  //Die Variable punkte wird ohne Wert definiert
    public Van (MyWorld w1){  //Der Konstruktor des Vans wird definiert und erwartet eine Verbindung zur MyWorld
        getImage().scale(120,70);  //Legt das Bild des Vans auf eine Größe von120x70 Pixel fest
        setRotation(270);       //Dreht den Van um 270°
        w=w1;     //Die Verbindung zur MyWorld wird in w gespeichert
    }
    
    public void act(){  //Die Methode public void act wird definiert
        tastenPruefung();  //Führt die Methode public void tastenPruefung aus
        sammeln();        //Führt die Methode public void sammeln aus
    }
    
    public void tastenPruefung(){ //Die Methode public void tastenPruefung wird definiert
        if( Greenfoot.isKeyDown("left"))setRotation(getRotation()-2);  //Wird die linke Pfeiltaste gedrückt, dreht sich der Van um -2°
        if( Greenfoot.isKeyDown("right"))setRotation(getRotation()+2);  //Wird die rechte Pfeiltaste gedrückt, dreht sich der Van um 2°
        if( Greenfoot.isKeyDown("down")){   //Wird die Pfeiltaste nach unten gedrückt,und ...
            if(isTouching(Hinder.class)){  //...der Van ein Objekt der Klasse Hinder berührt...
                setLocation(865,50);    //...wird der Van an seinen Ursprung teleportiert...
            }else{
                move(1);   //Falls er kein Objekt der Klasse Hinder berührt, bewegt er sich um 1 Pixel voran
            }
        }
        if(Greenfoot.isKeyDown("up")){   //Wird die Pfeiltaste nach oben gedrückt und...
            if(isTouching(Hinder.class)){  //...der Van ein Objekt der Klasse Hinder berührt, wird er..
                  setLocation(865,50);   //an seinen Ursprung teleportiert
            }else{
                move(-1);  //Falls er kein Objekt der Klasse Hinder berührt, bewegt er sich um 1 Pixel zuück
                
            }
        }
    }
    
    public void sammeln(){  //Die Methode public void sammeln wird definiert
        if(isTouching(Muenze.class)){      //Falls der Van ein Objekt der Klasse Muenze berührt...
            removeTouching(Muenze.class);   //...wird die betroffene Münze gelöscht...
            punkte=punkte+1;          //...und die Variable punkte wird für den Van um eins erhöht-> Der Van bekommt einen Punkt
        }
    }
 }

