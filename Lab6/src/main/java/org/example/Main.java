package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        switch(num){
            case 1:
                Human Vlad=new Human("Vlad", "Markov", 2007);
                System.out.println(Vlad.getAge());
                break;
            default:
                System.out.println("Такого номера нет");
        }
    }
}