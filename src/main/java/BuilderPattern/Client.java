package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Student.Builder builder =  Student.builder().setName("Harshita").setAge(28).setCity("Bangalore").setCollegeName("IIT KGP").setGender("F");
        Student st = builder.build();
    }
}
