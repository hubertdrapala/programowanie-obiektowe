import static java.lang.Math.*;
public class Okrag {

    public double promien;
    public Punkt srodek;

    double  getPowierzchnia(){
        return(PI*(Math.pow(promien,2)));

    }
    double getSrednica(){
        return((promien)*2);
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

   boolean sprawdz(){
        double x=0, a=0,b=0,y=0;
        boolean check=Math.pow((x-a),2) + Math.pow((y-b),2)<=Math.pow(promien,2);
        if (check==false){
            System.out.println("znajduje sie w okregu");
        }
        else{
            System.out.println("nie znajduje sie w okregu ");
        }
        return check;

   }


}
