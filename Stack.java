package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        boolean choiceExit=true;
        while (choiceExit){
            printChoices();
            System.out.println("Enter choice -> ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.change();
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    choiceExit=false;
                    break;
            }
        }

    }
    public static void printChoices(){
        System.out.println("1 -> push");
        System.out.println("2 -> pop");
        System.out.println("3 -> peek");
        System.out.println("4 -> change");
        System.out.println("5 -> display");
        System.out.println("6 -> exit");
    }

}


class Stack {
    static Scanner scanner = new Scanner(System.in);
    private int top=-1;
    private int arr[] = new int[5];

    public void push() {
        System.out.println("Enter the element : ");
        int n = scanner.nextInt();
        arr[++top] = n;
    }

    public void pop() {
        top--;
    }

    public void peek() {
        System.out.println("Enter the index : ");
        int n = scanner.nextInt();
        if (top - n < 0) {
            System.out.println("Unreachable");
        } else {
            System.out.println("Element = " + arr[top - n]);
        }
    }

    public void change() {
        System.out.println("Enter the index you want to change ");
        int index = scanner.nextInt();
        System.out.println("Enter the value : ");
        int x = scanner.nextInt();
        arr[index] = x;
    }

    public void display() {
        for (int i = 0; i < top+1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
