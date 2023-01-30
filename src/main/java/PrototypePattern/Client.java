package PrototypePattern;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Neha", 27, "Dec", 79.00, "2021");
        IntelligentStudent iSt = new IntelligentStudent("Neha", 27, "May", 79.00, "2021", 10);

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register(st);
        studentRegistry.register(iSt);

        Student s1 = studentRegistry.getPrototype("Dec").clone();
        s1.setAge(26);
        s1.setName("Bhanu");


        IntelligentStudent iSt1 = (IntelligentStudent) studentRegistry.getPrototype("May").clone();
        iSt1.setAge(24);
        iSt1.setName("Trisha");


    }
}
