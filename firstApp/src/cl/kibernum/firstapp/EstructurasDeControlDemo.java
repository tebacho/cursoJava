package cl.kibernum.firstapp;

public class EstructurasDeControlDemo {

    public static void main(String[] args) {
//        ifDemo();
        switchDemo();
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
    
    private static void switchDemo(){
        
        int i = 100;
        final int y = 9;
        final int e = 100;
        
        switch (i){
            
        case y:{
                System.out.println("0");
                break;
        }
        case e:
            System.out.println("100");
            break;
        case 20:
            System.out.println("20");
            break;
        default:
            System.out.println("default");
        }
    }
}
