import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int num = in.nextInt();
        switch (num) {
            case 1:
                int intarr[] = new int[10];
                for (int i = 0; i < intarr.length; i++) {
                    intarr[i] = i;
                }
                int bet = intarr[0];
                intarr[0] = intarr[intarr.length - 1];
                intarr[intarr.length - 1] = bet;
                System.out.println("Измененные местами элементы:" + intarr[0] + " " + intarr[intarr.length - 1]);

                break;
            case 2:
                int II = 5;
                int JJ = 5;
                int time = JJ;
                int arr[][] = new int[II][JJ];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        //  arr[i][j] = j;
                        arr[i][j]=random.nextInt(10);
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(" " + arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("введите индексы двх элементов двумерного массива. Мы выведем сумму элементов между ними и их самих");
                int ind1 = in.nextInt();
                int ind2 = in.nextInt();

                int ind3 = in.nextInt();
                int ind4 = in.nextInt();
                int sum = 0;
                if (ind3 < ind1 || ind3 == ind1 && ind4 < ind2 || ind1 < 0 || ind2 < 0 || ind3 < 0 || ind4 < 0 || ind1 > 4 || ind2 > 4 || ind3 > 4 || ind4 > 4 || ind1 == ind3 && ind2 == ind4) {
                    System.out.println("Индексы введены неверно.");
                    return;
                } else {
                    boolean firstiter = true;
                    boolean lastiter = true;
                    if (ind1 == ind3) {
                        for(int j=ind2;j<=ind4;j++)
                        {
                            sum+=arr[ind1][j];
                        }
                    } else {
                        for (int i = ind1; i <= ind3; i++) {
                            for (int j = 0; j < time; j++) {
                                if (i == ind1 && j == 0 && firstiter) {
                                    j = ind2;
                                    firstiter = false;
                                } else if (i == ind3 && j == 0 && lastiter) {
                                    time = ind4 + 1;
                                    lastiter = false;
                                }
                                sum += arr[i][j];
                            }
                        }
                    }
                }
                System.out.println("Сумма элементов: " + sum);

                break;
            default:
                System.out.println("Такого номера нет");
        }


        //------------

        //-----------


        //--------------
        in.close();
    }
}