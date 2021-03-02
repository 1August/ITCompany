package com.company;

import com.company.controllers.AllControllers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final AllControllers controller;
    private final Scanner scanner;

    public MyApplication(AllControllers controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("");
            System.out.println("Welcome to my application");

            //////////////////////////////////////////////////////////////
            System.out.println("Enter login and password:");
            String login = scanner.next();
            String password = scanner.next();
            if (login == "admin" && password == "admin12345") {
                Director_start();
            } else if (login == "dev" && password == "dev12345") {
                System.out.println("(1)Front-end or (2)Back-end?");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    Front_start();
//                    String response = controller.getAllFront();
//                    System.out.println(response);
                } else if (choice == 2) {
                    Back_start();
//                    String response = controller.getAllBack();
//                    System.out.println(response);
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
            //////////////////////////////////////////////////////////////

//            System.out.println("Select option (1-3)");
//            System.out.println("1. Get all Products");
//
//            System.out.println("0. Close program");
//            System.out.println("---------------------------");
//            try {
//
//                System.out.println("Choose who you are:");
//                System.out.println("1. Director");
//                System.out.println("2. Developer");
//                System.out.println("0. Exit");
//                int option = scanner.nextInt();
//                if (option == 1) {
////                    Director();
//                } else if (option == 2) {
////                    Developer();
//                } else {
//                    break;
//                }
//
////                System.out.println("Please, enter option:");
////                int option = scanner.nextInt();
////                if (option == 1) {
////
////                } else {
////                    break;
////                }
//            } catch (InputMismatchException e) {
//                System.out.println("Input must bew integer");
//                scanner.nextLine();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//            System.out.println("---------------------------");
        }
    }

    public void Director_start () {
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

//                System.out.println("Please, enter option:");
//                int option = scanner.nextInt();
//                if (option == 1) {
//
//                } else {
//                    break;
//                }
            } catch (InputMismatchException e) {
                System.out.println("Input must bew integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("---------------------------");
        }
    }

//    public void Front_start () {
//
//        String response = controller.getAllFront();
//        System.out.println(response);
////        while (true) {
////            System.out.println("Select option (1-3)");
////            System.out.println("1. Get all Products");
////
////            System.out.println("0. Close program");
////            System.out.println("---------------------------");
////            try {
////                System.out.println("Choose who you are:");
////                System.out.println("1. Director");
////                System.out.println("2. Developer");
////                System.out.println("0. Exit");
////
////
//////                System.out.println("Please, enter option:");
//////                int option = scanner.nextInt();
//////                if (option == 1) {
//////
//////                } else {
//////                    break;
//////                }
////            } catch (InputMismatchException e) {
////                System.out.println("Input must bew integer");
////                scanner.nextLine();
////            } catch (Exception e) {
////                System.out.println(e.getMessage());
////            }
////            System.out.println("---------------------------");
//        }
//    }

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

//                System.out.println("Please, enter option:");
//                int option = scanner.nextInt();
//                if (option == 1) {
//
//                } else {
//                    break;
//                }
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
