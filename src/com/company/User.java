package com.company;

/**
 * Created by java1 on 2017.12.04..
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private int age;

    public User(){}

    public User(int id, String firstName, String lastName, String password, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
    }

    public User(User user) {
        this.age = user.age;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.password = user.password;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
