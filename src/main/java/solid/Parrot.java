package solid;

public class Parrot extends Bird implements Flyable, Danceable {
    FlyingTechniques flyingTechnique;

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "Green";
        this.noOfWings = 2;
        flyingTechnique = new FlyingTechniqueA();
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void dance() {
        flyingTechnique.fly();
    }
}
