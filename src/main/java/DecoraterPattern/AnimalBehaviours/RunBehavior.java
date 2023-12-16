package DecoraterPattern.AnimalBehaviours;

public class RunBehavior extends Behaviour{

    public RunBehavior(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getName() {
        return animal.getName() + ", I can run";
    }
}
