import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        prostokat p1=new prostokat( 2,2);
        p1.Wypisz();


        budynek b1=new budynek("essa",69, LocalDate.of(2022,10,10));
        b1.getIlelat();
    }
}