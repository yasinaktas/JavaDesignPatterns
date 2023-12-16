package AbstractFactory.StudentExample;

public class EsitAgirlikciOgrenci implements Ogrenci{
    @Override
    public void dersCalis() {
        System.out.println("Eşit Ağırlık çalışıyorum");
    }
}
