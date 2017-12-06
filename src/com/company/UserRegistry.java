package com.company;

import java.util.Scanner;

/**
 * Created by java1 on 2017.12.06..
 */
public class UserRegistry {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int operation = -1;

        while (operation != 5) {
            System.out.print("Válasszon egy menüpontot");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    printAllUser();
                    break;
                case 2:
                    addNewUser();
                    break;
                case 3:
                    modifyUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    System.out.println("Kilépés...");
                    break;
                default:
            }
        }
    }

    private User[] users;

    public UserRegistry() {
        users = new User[10];
        init();
    }

    public void printMenu() {
        System.out.println("*********Menu*************");
        System.out.println("****Print all user (1)****");
        System.out.println("*****Add new user (2)*****");
        System.out.println("*****Modify  user (3)*****");
        System.out.println("*****Delete user (4)******");
        System.out.println("**********Exit (5)********");
    }

    private void init() {
        for (int i = 0; i < users.length; ++i) {
            users[i] = new User();
            users[i].setId(i);
            users[i].setFirstName("alma" + Math.random() * 100);
            users[i].setLastName("Béla" + Math.random() * 100);
            users[i].setPassword("secretkey" + Math.random() * 100);
            users[i].setAge((int) (Math.random() * 100));

        }
    }

    public void printAllUser() {
        for (int i = 0; i < users.length - 1; ++i) {
            System.out.print("id: " + users[i].getId());
            System.out.print(" \nfirstname: " + users[i].getFirstName());
            System.out.print(" \nlastname: " + users[i].getLastName());
            System.out.print(" \npassword: " + users[i].getPassword());
            System.out.print(" \nage: " + users[i].getAge());

        }
    }

    private void addNewUser() {
        boolean hasPlace = false;

        for (int i = 0; i < users.length; ++i) {
            if (users[i] == null) {

                User user = new User();

                Scanner scanner = new Scanner(System.in);

                int id = 0;

                for (int j = 0; j < users.length; ++j) {
                    //Hiányzik valami innen
                }
                String firstname;
                String lastname;
                String password;
                int age;


                System.out.println("firstname: ");
                firstname = scanner.next();

                System.out.println("lastname: ");
                lastname = scanner.next();

                System.out.println("password: ");
                password = scanner.next();

                System.out.println("age: ");
                age = scanner.nextInt();

                user.setFirstName(firstname);
                user.setLastName(lastname);
                user.setPassword(password);
                user.setAge(age);


                users[i] = user;
                hasPlace = true;
                break;
            }
        }
        if (!hasPlace) {
            System.out.println("Nincs több hely!");
        }


    }

    private void modifyUser() {

    }

    private void deleteUser() {

    }
}
