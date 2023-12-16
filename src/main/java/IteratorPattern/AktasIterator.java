package IteratorPattern;

import java.util.ArrayList;

/*  Bu class java.util.Iterator kullandığımız için devre dışı kaldı
    çünkü Aktas Family ArrayList içinde tutuyor kisileri
*/

public class AktasIterator implements Iterator{

    ArrayList<Person> kisiler;
    int position;

    public AktasIterator(ArrayList<Person> kisiler) {
        this.kisiler = kisiler;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < kisiler.size() && kisiler.get(position) != null;
    }

    @Override
    public Person next() {
        Person person = kisiler.get(position);
        position = position + 1;
        return person;
    }
}
