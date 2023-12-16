package IteratorPattern;

import java.util.Iterator;

public class SimsekIterator implements Iterator<Person> {

    Person[] kisiler;
    int position;

    public SimsekIterator(Person[] kisiler) {
        this.kisiler = kisiler;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < kisiler.length && kisiler[position] != null;
    }

    @Override
    public Person next() {
        Person person = kisiler[position];
        position = position+1;
        return person;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Kişi Silemezsiniz!");
    }
}
