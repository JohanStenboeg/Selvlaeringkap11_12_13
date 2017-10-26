package StenboegJohan;

public class SuperClassSubClassDemo {
    public static void main(String[] args) {
        SuperClass mySuperClassObject = new SuperClass(); //Laver et object fra superclassen.
        SubClass mySubClassObject = new SubClass(); //laver et object fra subclassen.

        mySuperClassObject.getMessage(); //Henter message fra super.
        mySubClassObject.getMessage(); //Henter message fra sub.

        mySuperClassObject.setMessage("This is a superClass"); //sætter en ny message istedet for objectmessage fra superclassen.
        mySubClassObject.setMessage("This is a subclass"); //sætter en ny message istedet for objectmessage fra superclassen til subclassen.

        mySuperClassObject.getMessage(); //Printer den nye besked.
        mySubClassObject.getMessage(); //Printer den nye besked. 
    }
}
