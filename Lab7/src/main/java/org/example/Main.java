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
                Planets earth=new Planets("Earth",300000000,1);
                Planets mars=new Planets("Mars",250000000,1);
                Planets saturn=new Planets("Saturn",280000000,1);
                Planets zibzebzyab=new Planets("ZibZebZyab",600000000,30);
                Planets[] planets=new Planets[Planets.totalPlanets];
                planets[0]=earth;
                planets[1]=mars;
                planets[2]=saturn;
                planets[3]=zibzebzyab;
                int mooncount=0;
                for(int i=0;i<Planets.totalPlanets;i++){
                    mooncount+=planets[i].getMoons();
                }
                if(mooncount>40)
                {
                    System.out.println("Спутников слишком много!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    return;
                }

                else{
                    System.out.println(Planets.getAverageMoons());
                }
               break;
            default:
                System.out.println("Такого номера нет");
        }
    }
}