package PrototypePattern;

public class IntelligentStudent extends Student{

    int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(String name, int age, String batchName, double avgBatchPsp, String yearOfEnrollment, int iq){
        super(name, age, batchName, avgBatchPsp, yearOfEnrollment);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent st){
        super(st);
        this.iq = st.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
