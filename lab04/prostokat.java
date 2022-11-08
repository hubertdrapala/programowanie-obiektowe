public class prostokat
{
    double dlugosc,szerokosc;
    public prostokat(double dlugosc,double szerokosc){
        this.dlugosc=dlugosc;
        this.szerokosc=szerokosc;
    }
    public double pole(){
        return dlugosc*szerokosc;
    }
    public double obwod(){
        return  (2*dlugosc)+(2*szerokosc);

    }
    public double przekatna(){
        return Math.sqrt(((Math.pow(dlugosc,2))+Math.pow(szerokosc,2)));
    }
    public void Wypisz(){
        System.out.println("prostokat o boku a:"+dlugosc+" i boku b:" +szerokosc);
        System.out.println("pole= "+pole());
        System.out.println("obwod=: "+obwod());
        System.out.println("przekatna: "+przekatna());
    }



}
