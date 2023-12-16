package IteratorPattern;

import java.util.Iterator;

public interface Family {
    public Iterator<Person> createIterator();
}
