import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Main {

    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //czyPalindrom()
        lab2zad1();

    }

    public static void zad1() {

        int n, a = 0, b = 10;
        double suma = 0, pkt = 0, ile = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc studentow");
        n = input.nextInt();
        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj ilosc pkt: 0-10");
                pkt = input.nextDouble();
                if (pkt >= a && pkt <= b) {
                    suma += pkt;
                    ile++;
                    n--;
                }
            }
        }
    }

    //zadanie2
    public static double input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        double n = input.nextDouble();
        return n;
    }

    public static void zad2() {
        int ile_d = 0, ile_u = 0;
        double suma_D = 0, suma_U = 0, liczb;
        for (int i = 0; i < 10; i++) {
            liczb = input();
            if (liczb >= 0) {
                ile_d++;
                suma_D += liczb;
            } else {
                ile_u++;
                suma_U += liczb;
            }
        }
        System.out.println("ilosc dodatnich:" + ile_d + ",suma =" + suma_D);
        System.out.println("ilosc ujmenych:" + ile_u + ",suma =" + suma_U);

    }

    public static void zad3() {
        System.out.println("ile liczb w ciagu:");
        Scanner input = new Scanner(System.in);
        double n = input();
        int parzyste = 0, nieparzyste = 0;
        double liczba = 0;
        double sumaP = 0;
        double sumaN = 0;
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            liczba = input.nextInt();
        }

        if (n % 2 == 0) {
            parzyste++;
            sumaP += liczba;
        } else {
            nieparzyste++;
            sumaN += liczba;
        }
        System.out.println("ilosc parzystych:" + parzyste + ",suma =" + sumaP);
        System.out.println("ilosc nieparzystych:" + nieparzyste + ",suma =" + sumaN);


    }


    public static boolean czyPalindrom(String s) {
        int l = s.length() - 1;
        s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l)) return false;
            l--;
        }
        return true;
    }

    public static void lab2zad1() {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj a ,b ,c: ");
        double a, x, b, c, delta, x1, x2;
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        delta = b * b - (4 * a * c);
        System.out.println("delta: " +delta);
        if (delta > 0) {

            x1 = b - sqrt(delta) / 2 * a;
            x2 = b + sqrt(delta) / 2 * a;
            System.out.println("x1: " +x1);
            System.out.println("x2: " +x2);
        } else if (delta == 0) {
            x = -b / 2 * a;
        } else System.out.println("brak rozwiazan");


    }
}

