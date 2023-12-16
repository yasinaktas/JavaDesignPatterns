package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class AktasFamily implements Family{
    private ArrayList<Person> kisiler;


    public AktasFamily() {
        kisiler = new ArrayList<>();
        kisiler.add(new Person("Bayram","Aktas"));
        kisiler.add(new Person("Ayse","Aktas"));
        kisiler.add(new Person("Yasin","Aktas"));
        kisiler.add(new Person("Yakup","Aktas"));
        kisiler.add(new Person("Zeynep","Aktas"));
    }

    /*public ArrayList<Person> getKisiler() {
        return kisiler;
    }*/

    // Kendi Iterator'umuz
    /*public Iterator createIterator(){
        return new AktasIterator(kisiler);
    }*/

    // java.util.Iterator
    @Override
    public Iterator<Person> createIterator() {
        return kisiler.iterator();
    }

}
