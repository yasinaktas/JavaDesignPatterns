package DecoraterPattern.AnimalBehaviours;

public class FlyBehavior extends Behaviour{

    public FlyBehavior(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getName() {
        return animal.getName() + ", I can fly";
    }
}
