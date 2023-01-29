package solid;

public class Penguin extends Bird implements Danceable {

    public Penguin(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "Black";
        this.noOfWings = 2;
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
}
