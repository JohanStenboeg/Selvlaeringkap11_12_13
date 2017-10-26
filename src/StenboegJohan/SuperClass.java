package StenboegJohan;
/*
Program funtion:
        Understanding super and sub classes.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */

public class SuperClass {
    //Her laver man en constructor.
    public SuperClass() { //En superclass er en form for overordnet beskrivelse af et objekt.
        //Man kan opsætte nogle metoder og variabler, der så varrierer i subklasserne.
        //fx kan man have en superclass hund, og så nogle subklasser for labrador eller husky.
        super(); //Man behøver ikke skrive super();, men
    }
    String objectMessage = "This is the original superclass message"; //Deklarerer en tekst til en tekst.
    public void getMessage() { //Laver en getter metode, der skal printe noget tekst samt værdien af objectMessage.
        System.out.println("This is the SuperClass message" + objectMessage);
    }
    //laver en setter metode, til at sætte en ny værdi for objectMessage.
    public void setMessage(String newMessage) {
        this.objectMessage = newMessage;

    }


    }
