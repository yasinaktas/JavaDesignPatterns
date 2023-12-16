package IteratorPattern;
import java.util.Iterator;

public class AllFamilyDisplayer {
    /*AktasFamily aktasFamily;
    SimsekFamily simsekFamily;

    public AllFamilyDisplayer(AktasFamily aktasFamily, SimsekFamily simsekFamily) {
        this.aktasFamily = aktasFamily;
        this.simsekFamily = simsekFamily;
    }

    public void display(){
        Iterator aktasIterator = aktasFamily.createIterator();
        Iterator simsekIterator = simsekFamily.createIterator();

        System.out.println("AKTAS FAMILY\n");
        display(aktasIterator);
        System.out.println("\n-----------------------\n");
        System.out.println("SIMSEK FAMILY\n");
        display(simsekIterator);
        System.out.println("\n-----------------------\n");

    }*/

    Family aktasFamily;
    Family simsekFamily;

    public AllFamilyDisplayer(Family aktasFamily, Family simsekFamily) {
        this.aktasFamily = aktasFamily;
        this.simsekFamily = simsekFamily;
    }

    public void display(){
        Iterator<Person> aktasIterator = aktasFamily.createIterator();
        Iterator<Person> simsekIterator = simsekFamily.createIterator();

        System.out.println("AKTAS FAMILY\n");
        display(aktasIterator);
        System.out.println("\n-----------------------\n");
        System.out.println("SIMSEK FAMILY\n");
        display(simsekIterator);
        System.out.println("\n-----------------------\n");

    }

    private void display(Iterator<Person> iterator){
        while(iterator.hasNext()){
            Person person = (Person) iterator.next();
            System.out.println(person.getName() + " " + person.getSurname());
        }
    }

}
