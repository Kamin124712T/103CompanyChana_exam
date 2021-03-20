package Todopackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTodoList {
    public static void main(String[] args) {
        int choice;
        TodoList todoList = new TodoList();
        Scanner sc = new Scanner(System.in);
        do {
            choice = menu();
            switch (choice){
                case 1:
                    System.out.println("To Do List");
                    todoList.showList();
                    break;
                case 2:
                    System.out.print("Task name: ");
                    String name = sc.nextLine();
                    System.out.print("Deadline (day month year): ");
                    try {
                        int day = sc.nextInt();
                        int month = sc.nextInt();
                        int year = sc.nextInt();
                        sc.nextLine();
                        Date date = new Date(day, month, year); 
                        todoList.addTask(name, date);
                    } catch (InputMismatchException e){
                        System.out.println("Error: Invalid date!");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Removed task number: ");
                    int num = sc.nextInt();
                    todoList.removeTask(num-1);
                    break;
                case 4:
                    todoList.sortTasks();
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("0. Exit the program");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to to-do list");
        System.out.println("3. Remove item from to-do list");
        System.out.println("4. Sort tasks by date");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = -1;
        
	 try {
            choice = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid choice!");
        }
        return choice;
    }
}
