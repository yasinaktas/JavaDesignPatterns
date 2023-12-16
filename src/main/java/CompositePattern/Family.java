package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Family extends FamilyComponent{

    List<FamilyComponent> familyComponents = new ArrayList<>();

    private String name;

    public Family(String name) {
        this.name = name;
    }

    @Override
    public void add(FamilyComponent component) {
        familyComponents.add(component);
    }

    @Override
    public void remove(FamilyComponent component) {
        familyComponents.remove(component);
    }

    @Override
    public FamilyComponent getChild(int i) {
        return familyComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("\n+----- [" + name + "] -----+\n");
        for(FamilyComponent component : familyComponents){ // Çok önemli
            component.display();
        }
    }
}
