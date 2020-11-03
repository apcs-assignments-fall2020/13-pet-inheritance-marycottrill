public class Dog extends Pet {
    // Instance variable(s)
    private String name;
    private int age;
    private String breed;

    //Constructors
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog() {
        this.name = "Max";
        this.age = 1;
        this.breed = "Golden Retriever";
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof!");
    }


    // toString method
    public String toString() {
        String str = "Name: " + name + ", Age: " + age + ", Breed:" + breed;
        return str;
    }

    // Getter- already inherited getName and getAge 
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        if (name.trim().length() != 0) {
            this.breed = breed;
        }
    }
}
