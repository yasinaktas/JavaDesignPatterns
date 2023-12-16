package AbstractFactory.StudentExample;

public class Okul {
    Ders ders;
    Ogrenci ogrenci;
    OkulFactory okulFactory;

    public Okul(OkulFactory okulFactory) {
        this.okulFactory = okulFactory;
        ders = okulFactory.createDers();
        ogrenci = okulFactory.createOgrenci();
    }

    public void display(){
        ogrenci.dersCalis();
        System.out.println("    "  + ders.getDersAdi());
    }

}
