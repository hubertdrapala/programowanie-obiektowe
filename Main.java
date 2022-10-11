import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
    //wywoływanie metod
       //zad 1
        System.out.println(getMyName());
        System.out.println(getMyAge());
        //zad 2
        obliczenia(1,2);
        liczby(1);
        Scanner in = new Scanner (System.in);
        int a,b;
        System.out.println("podaj a i b: ");
        a = in.nextInt();
        b= in.nextInt();
        obliczenia(a,b);
        //zad3
        liczby()



    }
    //metody
    public static String getMyName(){
        return "Jan";
    }
    public static int getMyAge(){
        return 23;
    }
    public static void obliczenia(int l1,int l2){
        System.out.println(l1+"+"+l2+"="+(l1+l2));
        System.out.println(l1+"-"+l2+"="+(l1-l2));
        System.out.println(l1+"*"+l2+"="+(l1*l2));

    }

    public static boolean liczby(int l1){
        if(l1%2==0)
            System.out.println("parzysta");
        return false;
    }



}