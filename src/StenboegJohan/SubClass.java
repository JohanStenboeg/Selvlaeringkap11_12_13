package StenboegJohan;

public class SubClass extends SuperClass {
    public SubClass() { //Laver en constructor i subclassen.
        super(); //Bliver kaldt om man skriver den eller ej. Refererer til superclassen's constructor.
    }

    public void getMessage() { //Laver en ny getter metode, som når den bliver kaldt på henter denne tekst samt objectMessage fra superclassen.
        System.out.println("This is the SubClass message" + objectMessage);

    }
}

