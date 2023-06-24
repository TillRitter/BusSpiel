import greenfoot.*; //Alle Greenfoot-Klassen sind für das Programm nutzbar

public class Bus extends Actor //Die Klasse Bus hat auf den Actor Zugriff
{
    MyWorld w;  //Ein Platz wird für die MyWorld freigestellt
    int punkte;  //Die Variable punkte wird ohne Wert definiert
    public Bus(MyWorld w1){
        getImage().scale(60,60);  //Setzt das Bild des Busses auf 60x60 Pixel fest
        setRotation(90); //Dreht den Bus beim Erstellen der Landkarte um 90°
        w=w1;  //Die Verbindung zur MyWorld wird in w gespeichert
    }

    public void act(){ //Die Methode public void act wird definiert
        tastenPruefung(); //Führt die Methode tastenPruefung aus
        sammeln();  //Führt die Methode sammeln aus

    }

    public void tastenPruefung(){  //Definiert die Methode public void tastenPruefung
        if( Greenfoot.isKeyDown("d"))setRotation(getRotation()+2);  //Falls D gedrückt wird,dreht sich der Bus um 2°
        if( Greenfoot.isKeyDown("a"))setRotation(getRotation()-2);  //Falls A gedrückt wird,dreht sich der Bus um -2°
        if( Greenfoot.isKeyDown("w")){  //Falls W gedrückt wird...
            if(isTouching(Hinder.class)){ //... und der Bus ein Objekt der Klasse Hinder berührt,dann...
                setLocation(132,35);   //...wird der Bus an seinen Ursprung teleportiert
            }else{
                move(1);   //Falls er nichts berührt,bewegt der Bus sich 1 Pixel vorwärts
            }
        }
        if(Greenfoot.isKeyDown("s")){ //Falls S gedrückt wird...
            if(isTouching(Hinder.class)){ //und der Bus ein Objekt der Klasse Hinder berührt,dann...
                setLocation(132,35);  //...wird der Bus an seinen Ursprung teleportiert
            }else{
                move(-1);  //Falls der Bus nichts berührt,bewegt er sich um 1 Pixel rückwärts
                
            }
        }
    }

    
    public void sammeln(){ //Definiert die Methode public void sammeln
        if(isTouching(Muenze.class)){ //Falls der Bus ein Objekt der Klasse Muenze berührt,dann...
            removeTouching(Muenze.class);//...wird die Münze gelöscht und...
            punkte=punkte+1; //...die Variable punkte für den Bus um eins erhöht-> Der Bus bekommt einen Punkt
        }
    }
}
