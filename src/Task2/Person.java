package Task2;

public class Person {
    private String fullName;
    private int age;

    Person(){

    }

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Such and such a Person is talking");
    }

    public void talk(){
        System.out.println("Such and such a Person is talking");
    }
}
