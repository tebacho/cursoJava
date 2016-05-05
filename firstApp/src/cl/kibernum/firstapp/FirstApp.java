package cl.kibernum.firstapp;

public class FirstApp {

    public static void main(String[] args) {
        Oso balu = new Balu();
        Oso balu2 = new Balu();
        Oso balu3 = new Balu();
        Oso balu4 = new Balu();
        Oso balu5 = new Balu();
        Oso balu6 = new Balu();
        Oso balu7 = new Balu();
        Oso balu8 = new Balu();
        int hol = (int) 19.0D;
        
    }
    
}

class Balu extends Oso{
    static
    {
        x=10;
        System.out.println("bloque anonimo");
    }
    static int x;
    public Balu(){
        System.out.println(x);
        System.out.println("constructor");
        
    }
    public void cantar(){
        String[] canto = new Cancion().canto;
        for(String prosa : canto){
            System.out.println(prosa);
        }
    }
}

class Cancion{
    String canto[] = {"Si recoges un fruto",
                "Con espinas por fuera",
                "y te pinchas la mano, te pinchas en vano",
                "tomar espinas con la mano es malo",
                "en vez de la mano, usa siempre un palo", 
                "mas usarás la mano, cuando coges el fruto del banano...." };
}
class Oso{
     String pelo = "cafe";
     protected void cantar(){

            System.out.println("GRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");

    }
}