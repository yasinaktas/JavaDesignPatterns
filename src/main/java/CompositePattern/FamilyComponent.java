package CompositePattern;

public abstract class FamilyComponent {
    public void add(FamilyComponent component){
        throw new UnsupportedOperationException();
    }
    public void remove(FamilyComponent component){
        throw new UnsupportedOperationException();
    }
    public FamilyComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getSurname(){
        throw new UnsupportedOperationException();
    }
    public int getAge(){
        throw new UnsupportedOperationException();
    }

    public void display(){
        throw new UnsupportedOperationException();
    }
}
