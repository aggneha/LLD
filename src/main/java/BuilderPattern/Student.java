package BuilderPattern;



public class Student {
    private String name;
    private int age;
    private int psp;
    private String collegeName;
    private String gender;
    private String city;

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.collegeName = builder.collegeName;
        this.gender = builder.gender;
        this.city = builder.city;

    }

    public static Builder builder(){
        return new Builder();
    }


     static class Builder {

        //do all the validations for Builder class, either in setter or in constructor
        //if any validation fails, throws exception from Helper class

        private String name;
        private int age;
        private int psp;
        private String collegeName;
        private String gender;
        private String city;


        private Builder(){}

        public Student build(){
            //put all the validations here
            return new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setCollegeName(String collegeName) {
            this.collegeName = collegeName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }




    }


}
