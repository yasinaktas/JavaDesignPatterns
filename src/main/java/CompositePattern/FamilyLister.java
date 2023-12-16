package CompositePattern;

public class FamilyLister {
    FamilyComponent allFamilies;

    public FamilyLister(FamilyComponent allFamilies) {
        this.allFamilies = allFamilies;
    }

    public void listAllFamilies(){
        allFamilies.display();
    }
}
