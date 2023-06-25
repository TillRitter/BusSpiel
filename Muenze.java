import greenfoot.*; //Alle Greenfoot-Klassen werden für das Programm nutzbar


public class Muenze extends Actor //Die Klasse Münze hat Zugriff auf den Actor(engl. für Klasse)
{
    
    int punkte;  //Die Variable punkte wird definiert
    public Muenze(){           //Der Konstruktor der Münze wird definiert
        getImage().scale(25,25);  //Das Bild der Münze wird auf eine Größe von 25x25 Pixel festgelegt
    }
    
    public void act() //Die Methode public void act wird definiert und ausgeführt
    {
        if(isTouching(Hinder.class)){     //Falls die Münze ein Objekt der Klasse Hinder berührt...
            removeTouching(Muenze.class);  //...wird die betroffene Münze gelöscht
        }
        
        
    }
}
