package solid;

public class Sparrow extends Bird implements Flyable {

    private FlyingTechniques flyingTechnique;

    public Sparrow(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Golden";
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
