package solid;

public class Crow extends Bird implements Flyable {

    private FlyingTechniques flyingTechnique;

    public Crow(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Black";
        this.noOfWings = 2;
        flyingTechnique = new FlyingTechniqueB();
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat() {

    }

    @Override
    public void fly() {
        flyingTechnique.fly();
    }
}
