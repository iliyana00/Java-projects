package org.example;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public void Print(){
        System.out.printf("%s\t%d\t%s\n",name,age,city);
    }
}
