package AbstractFactory.StudentExample;

public class FenLisesiFactory implements OkulFactory{

    @Override
    public Ders createDers() {
        return new Matematik();
    }

    @Override
    public Ogrenci createOgrenci() {
        return new SayicalciOgrenci();
    }
}
