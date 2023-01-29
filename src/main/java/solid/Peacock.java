package solid;

public class Peacock extends Bird implements Danceable,Flyable{
    FlyingTechniques flyingTechnique;

    public Peacock(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Blue";
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
    public void dance() {

    }

    @Override
    public void fly() {
        flyingTechnique.fly();
    }
}
