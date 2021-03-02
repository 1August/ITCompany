package com.company;

import com.company.controllers.AllControllers;
import com.company.entities.Back;
import com.company.entities.Front;

import java.sql.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MyApplication {
    private final AllControllers controller;
    private final Scanner scanner;

    public MyApplication(AllControllers controller) {
        scanner = new Scanner(System.in);
        this.controller = controller;
    }

    public void start() {
        while (true) {
            System.out.println("");
            System.out.println("Welcome to my application");
            System.out.println("Enter login:");
            String login = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            if (login.equals("admin") && password.equals("admin12345")) {
                Director_start();
            } else if (login.equals("dev") && password.equals("dev12345")) {
                System.out.println("1. Front-end \n2. Back-end");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    Front_start();
                } else if (choice == 2) {
                    Back_start();
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        }
    }

    public void Director_start () {
        while (true) {
            System.out.println("Select option (1-3)");
            System.out.println("0. Get All Developers");
            System.out.println("1. Get Front-end Developers");
            System.out.println("2. Get Back-end Developers");
            System.out.println("3. Add Front-end Developer");
            System.out.println("4. Add Back-end Developer");
            System.out.println("5. Delete from Front-end by ID");
            System.out.println("6. Delete from Back-end by ID");
            System.out.println("0. Close program");
            System.out.println("---------------------------");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option == 0) {
                String response = controller.getAll();
                System.out.println(response);
            } else if (option == 1) {
                String response = controller.getAllFront();
                System.out.println(response);
            } else if (option == 2) {
                String response = controller.getAllBack();
                System.out.println(response);
            } else if (option == 3) {
                System.out.println("Enter first name:");
                String name = scanner.next();
                System.out.println("Age:");
                int age = scanner.nextInt();
                System.out.println("Started working date:");
                Date date = Date.valueOf(scanner.next());
                System.out.println("Level:");
                int lvl = scanner.nextInt();
                System.out.println("Salary:");
                int salary = scanner.nextInt();
                boolean response = controller.addFront(name, age, date, lvl, salary);
                System.out.println(response);
            } else if (option == 4) {
                System.out.println("Enter first name:");
                String name = scanner.next();
                System.out.println("Age:");
                int age = scanner.nextInt();
                System.out.println("Started working date:");
                Date date = Date.valueOf(scanner.next());
                System.out.println("Level:");
                int lvl = scanner.nextInt();
                System.out.println("Salary:");
                int salary = scanner.nextInt();
                boolean response = controller.addBack(name, age, date, lvl, salary);
                System.out.println(response);
            } else if (option == 5) {
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                controller.deleteFront(id);
            } else if (option == 6) {
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                controller.deleteBack(id);
            } else {
                break;
            }
        }
    }

    public void Front_start() {
        String response = controller.getAllFront();
        System.out.println(response);
    }

    public void Back_start () {
        while (true) {
            System.out.println("Select option (1-3)");
            System.out.println("1. Get all Products");

            System.out.println("0. Close program");
            System.out.println("---------------------------");
            try {
                System.out.println("Choose who you are:");
                System.out.println("1. Director");
                System.out.println("2. Developer");
                System.out.println("0. Exit");
                int option = scanner.nextInt();
                if (option == 1) {
//                    Director();
                } else if (option == 2) {
//                    Developer();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must bew integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("---------------------------");
        }
    }


}
