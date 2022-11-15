public class figura {


        //pola metody i kontruktory
        Punkt punkt;
        String kolor = "bialy";


        figura(){
            punkt = new Punkt(0,0);
        }
        figura(String kolor){
            this.kolor=kolor;
        }
        figura(Punkt punkt){
            this.punkt=punkt;
        }
        String getKolor(){
            return kolor;
        }
        String opis(){
            return "Klasa Figura. Kolor obiektu: "+kolor;
        }




}
