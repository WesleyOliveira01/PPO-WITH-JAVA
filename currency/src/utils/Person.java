package utils;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void showPersonDetails(){
        System.out.printf("Name: %s%nAge: %d%n",this.name,this.age);
    }
}
