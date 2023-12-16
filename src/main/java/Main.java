import AbstractFactory.StudentExample.AnadoluLisesiFactory;
import AbstractFactory.StudentExample.Okul;
import CompositePattern.Family;
import CompositePattern.FamilyComponent;
import CompositePattern.FamilyLister;
import CompositePattern.Person;
import DecoraterPattern.AnimalBehaviours.*;
import DecoraterPattern.Beverages.*;
import DecoraterPattern.LowerCaseInputStream.LowerCaseInputStream;
import IteratorPattern.AktasFamily;
import IteratorPattern.AllFamilyDisplayer;
import IteratorPattern.SimsekFamily;
import MVC.JavaDJ.BeatController;
import MVC.JavaDJ.BeatModel;
import MVC.JavaDJ.BeatModelInterface;
import MVC.JavaDJ.ControllerInterface;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /* Observer Pattern - Exchange Rate Example */
        /*ExchangeRateDataProvider exchangeRateDataProvider = new ExchangeRateDataProvider();
        LiraDollarRateDisplay liraDollarRateDisplay = new LiraDollarRateDisplay(exchangeRateDataProvider);
        exchangeRateDataProvider.setExchanges(1,2,3,4,5);*/

        /* Decorator Pattern - Beverages Example */
        /*Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());*/

        /* Decorator Pattern - Animal Behaviour Example */
        /*Animal bird = new Bird();
        bird = new FlyBehavior(bird);
        System.out.println(bird.getName());
        Animal ostrich = new Ostrich();
        ostrich = new FlyBehavior(ostrich);
        ostrich = new RunBehavior(ostrich);
        System.out.println(ostrich.getName());
        Animal dog = new Dog();
        dog = new RunBehavior(dog);
        System.out.println(dog.getName());*/

        /* Decorator Pattern - LowerCaseInputStream */
        /*int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/test.txt")));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /* Abstract Factory Pattern - School Student Example */
        /*Okul adnanMenderesAL = new Okul(new AnadoluLisesiFactory());
        adnanMenderesAL.display();*/

        /* Iterator Pattern - Family Display */
        /*AllFamilyDisplayer allFamilyDisplayer = new AllFamilyDisplayer(new AktasFamily(),new SimsekFamily());
        allFamilyDisplayer.display();*/

        /* Composite Pattern - Family Display */
        /*FamilyComponent aktasFamily = new Family("Bayram AKTAS FAMILY");
        aktasFamily.add(new Person("Bayram","Aktas",45));
        aktasFamily.add(new Person("Ayse","Aktas",44));
        aktasFamily.add(new Person("Yasin","Aktas",24));
        aktasFamily.add(new Person("Yakup","Aktas",21));
        aktasFamily.add(new Person("Zeynep","Aktas",17));

        FamilyComponent simsekFamily = new Family("Bahri SIMSEK FAMILY");
        simsekFamily.add(new Person("Bahri","Simsek",50));
        simsekFamily.add(new Person("Aynur","Simsek",47));
        simsekFamily.add(new Person("Fatih","Simsek",24));
        simsekFamily.add(new Person("Hamza","Simsek",19));
        simsekFamily.add(new Person("Murathan","Simsek",14));

        FamilyComponent muhammetSimsekfamily = new Family("Muhammet SIMSEK FAMILY");
        muhammetSimsekfamily.add(new Person("Muhammet","Simsek",26));
        muhammetSimsekfamily.add(new Person("Zehra","Simsek",25));
        muhammetSimsekfamily.add(new Person("Erva","Simsek",1));

        simsekFamily.add(muhammetSimsekfamily);

        FamilyComponent allFamilies = new Family("ALL FAMILIES");
        allFamilies.add(aktasFamily);
        allFamilies.add(simsekFamily);
        FamilyLister lister = new FamilyLister(allFamilies);
        lister.listAllFamilies();*/

        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);


    }
}
