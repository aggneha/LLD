package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> registry = new HashMap<>();

    public void register(Student student){
        registry.put(student.getBatchName(), student);
    }

    public Student getPrototype(String batchName){
        return registry.get(batchName);
    }
}
