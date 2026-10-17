import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Employer{
    private String fullname;
    private double salary;
    public Employer(String f1, double s1){
        if(f1.length()>15){
            System.out.println("Фамилия гигантская!!! Нам не подходит");
            return;
        }
        fullname=f1;
        salary=s1;
    }
    public String getFullname(){
        return  fullname;
    }
    public  double getSalary(){
        return salary;
    }

}
class Report{
    static void generateReport(Employer[] mass){

        System.out.println(String.format("%-20s%9s","FIO","Salary"));
        for(int i=0;i<mass.length;i++)
        {
            System.out.println(String.format("%-20s%10.2f",mass[i].getFullname(),mass[i].getSalary()));
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        switch (num) {
            case 1:
                String s1=" I LOVE CHICKEN WIINGS    !";
                System.out.println(s1.replace(' ','_'));
                break;
            case 2:
                String s2= in.next();
                Pattern pattern=Pattern.compile("^\\p{Alnum}+$");
                Matcher matcher=pattern.matcher(s2);
                if(matcher.matches())
                {
                    System.out.println("строка содержит только буквы и цифры");
                }
                else{
                    System.out.println("Строка имеет неверные символы");
                }
                break;
            case 3:
                String s3= "a!a a@a a#a a$a a%a";
                Pattern pattern3=Pattern.compile("a\\P{Alnum}a");
                Matcher matcher3=pattern3.matcher(s3);
                while (matcher3.find()){
                    System.out.println(matcher3.group());
                }
                break;
            case 4:
                Employer employer1= new Employer("Марков",3000.00);
                Employer employer2= new Employer("Стригельский",5000.00);
                Employer employer3= new Employer("Мартинович",2500.00);
                Employer[] mass={employer1,employer2,employer3};
                Report.generateReport(mass);
                break;
            default:
                System.out.println("Такого номера нет");

        }

        in.close();
    }
}