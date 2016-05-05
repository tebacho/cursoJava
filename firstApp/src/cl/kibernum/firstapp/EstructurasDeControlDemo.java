package cl.kibernum.firstapp;

public class EstructurasDeControlDemo {

    public static void main(String[] args) {
        ifDemo();
    }
    private static void ifDemo(){
        int i=12, j=11;
        System.out.println("Sin corchetes");
        if(i<j)
            System.out.println("true");
            System.out.println("false");
        System.out.println("Con corchetes");            
        if(i<j){
            System.out.println("true");
            System.out.println("false");
        }
    }
}
