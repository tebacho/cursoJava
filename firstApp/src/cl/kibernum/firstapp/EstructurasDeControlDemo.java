package cl.kibernum.firstapp;

public class EstructurasDeControlDemo {

    public static void main(String[] args) {
//        ifDemo();
//        switchDemo();
        whileDemo();
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
    private static void whileDemo(){
        int cont=0;
        cont = diff();
        
    }
    private static int diff(){
        int cont=0;  
        while(true){
            double antes=(Runtime.getRuntime().freeMemory());
            System.out.println("i inside while ["+(++cont)+"]");
            System.gc();
            double diff = antes-Runtime.getRuntime().freeMemory();
            System.out.println("diferencia memoria "+diff);
            if(diff<0){
               System.exit(0);  
            }
        return 0;
        }
        
    }
}
