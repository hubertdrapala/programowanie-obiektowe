public class Main {
    public static void main(String[] args) {
        Punkt pkt1=new Punkt(2,5);
        pkt1.zeruj();
        Punkt pkt2=new Punkt(3,7);
        pkt2.opis();
        Punkt pkt3=new Punkt(1,6);
        pkt3.przesun(1,2);

        Prostokat p1= new Prostokat(3,5);
        Trojkat t1 = new Trojkat(2,6);
        figura f1 = new figura();
        p1.getPowierzchnia();
        f1.opis();
        t1.getClass();





    }
}