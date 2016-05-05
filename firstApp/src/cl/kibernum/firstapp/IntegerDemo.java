package cl.kibernum.firstapp;

/**
 *
 * @Clase que demuesta el uso de enteros
 */
public class IntegerDemo {
    
    static byte mByte = Byte.MAX_VALUE;
    short mShort = Short.MAX_VALUE;
    int mInt = Integer.MAX_VALUE;
    long mLong = Long.MAX_VALUE;
    char mChar = Character.MAX_VALUE;
    
    public static void main(String args[]){

        byte bait = 127;
        byte bait2 = 1;
        byte bait3 = (byte)(bait+bait2); 
        System.out.println(""+(bait3));
        
        
//        IntegerDemo iDemo = new IntegerDemo();
//        iDemo.getResult(10, 20);
//        Calcular calc = new Division();
//        System.out.println(calc.calcular(2, 3));
        pruebaIncrementoUnario();
    }
    
    public int getResult(int numero, int segundo){
        int suma = numero+segundo;
        System.out.println(suma);
        return suma;
    }
    static public void pruebaIncrementoUnario(){
        int i=0;
        System.out.println(i++);
        
        i=0;
        System.out.println(i++ + i++);        
        
        i=0;
        int res= i++ + i++ + i++;
        System.out.println("res"+res);
        
        i=0;
        System.out.println(i++ + (i++*i++) + i++);
        
        System.out.println(i);
    }
}

//interface Calcular{
//    double calcular(int numero, int segundo);
//}
//class Suma implements Calcular{
//
//    @Override
//    public double calcular(int numero, int segundo) {
//        int resultado = numero+segundo;
//        System.out.print("la suma es :");
//        return resultado;
//    }  
//}
//class Resta implements Calcular{
//
//    @Override
//    public double calcular(int numero, int segundo) {
//        int resultado = numero-segundo;
//        System.out.print("la resta es :");
//        return resultado;
//    }   
//}
//class Multiplicacion implements Calcular{
//
//    @Override
//    public double calcular(int numero, int segundo) {
//       int resultado = numero*segundo;
//       System.out.print("la multiplicación es :");
//        return resultado;
//    } 
//}
//class Division implements Calcular{
//
//    @Override
//    public double calcular(int numero, int segundo) {
//        if(segundo!=0){
//            int resultado = numero-segundo;
//            System.out.print("la division es :");
//            return resultado;
//        }else{
//            System.out.println("El divisor no puede ser 0");
//            return 0;
//        }
//    }
//    
//}
