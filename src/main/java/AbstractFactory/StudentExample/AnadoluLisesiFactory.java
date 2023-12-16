package AbstractFactory.StudentExample;

public class AnadoluLisesiFactory implements OkulFactory{
    @Override
    public Ders createDers() {
        return new Turkce();
    }

    @Override
    public Ogrenci createOgrenci() {
        return new EsitAgirlikciOgrenci();
    }
}
