package solid;

public abstract class Bird {

    protected int age;
    protected String name;
    protected String color;
    protected int noOfWings;

    public void breath(){
        System.out.println("Bird is breathing");
    }

    abstract void makeSound();
    abstract void eat();
}
