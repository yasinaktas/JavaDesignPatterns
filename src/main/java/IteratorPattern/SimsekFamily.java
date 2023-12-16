package IteratorPattern;

import java.util.Iterator;

public class SimsekFamily implements Family{

    private static int MAX;
    Person[] kisiler;

    public SimsekFamily() {
        MAX = 6;
        kisiler = new Person[MAX];

        kisiler[0] = new Person("Bahri","Simsek");
        kisiler[1] = new Person("Aynur","Simsek");
        kisiler[2] = new Person("Muhammet","Simsek");
        kisiler[3] = new Person("Fatih","Simsek");
        kisiler[4] = new Person("Hamza","Simsek");
        kisiler[5] = new Person("Murathan","Simsek");

    }

    /*public Person[] getKisiler() {
        return kisiler;
    }*/

    /*public Iterator createIterator(){
        return new SimsekIterator(kisiler);
    }*/

    @Override
    public Iterator<Person> createIterator() {
        return new SimsekIterator(kisiler);
    }

}
