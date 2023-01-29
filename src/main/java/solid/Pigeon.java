package solid;

public class Pigeon extends Bird implements Flyable{
    private FlyingTechniques flyingTechnique;

    public Pigeon(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Grey";
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
