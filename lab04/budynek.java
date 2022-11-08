import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class budynek {
    String nazwa;
    int liczba_pieter;
    LocalDate rokBudowy;

    public budynek(String nazwa, int liczba_pieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.liczba_pieter = liczba_pieter;
        this.rokBudowy = rokBudowy;
    }
    public void setNazwa(String nazwa) {this.nazwa=nazwa;}

    public long getIlelat(){
        LocalDate today= LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ileLat;
    }

}
