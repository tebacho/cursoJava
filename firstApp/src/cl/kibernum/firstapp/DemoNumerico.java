package cl.kibernum.firstapp;

public class DemoNumerico {
    static final String one ="uno";
    static String tres = "tres";
    public static void main(String[] args) {
                
        DemoNumerico demo = new DemoNumerico();
        try{
        System.out.println("El resultado es: "+demo.getResult(1, 2, Operaciones.DIVISION));
        }catch(NoSuchOperationException nsee){
            System.out.println(nsee.getMessage());
        }catch(ZeroDivisionException zde){
            System.out.println(zde.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
    }
    public double getResult(double i, double j, Operaciones op){
        CalculoFactory cf = CalculoFactory.getInstance();
        Calcular calc = cf.getCalculador(op);
        double resultado = calc.calcular(i, j);
        return resultado;
    }
}

class CalculoFactory{
    private static CalculoFactory instance;
    private CalculoFactory(){
    
    }
    public static CalculoFactory getInstance(){
        if(instance==null){
            instance= new CalculoFactory();
        }
        return instance;
    }
    public Calcular getCalculador(Operaciones op){
        Calcular calc = null;
        switch (op.signo) {
            case '+':
                calc = new Suma();
            case '-':
                calc = new Resta();
            case '*':
                calc = new Multiplicacion();
            case '/':
                calc = new Division();
        }
        return calc;
    }
}


interface Calcular{
    double calcular(double numero, double segundo);
}
class Suma implements Calcular{

    @Override
    public double calcular(double numero, double segundo) {
        double resultado = numero+segundo;
//        System.out.print("la suma es :");
        return resultado;
    }  
}
class Resta implements Calcular{

    @Override
    public double calcular(double numero, double segundo) {
        double resultado = numero-segundo;
//        System.out.print("la resta es :");
        return resultado;
    }   
}
class Multiplicacion implements Calcular{

    @Override
    public double calcular(double numero, double segundo) {
       double resultado = numero*segundo;
//       System.out.print("la multiplicación es :");
        return resultado;
    } 
}
class Division implements Calcular{

    @Override
    public double calcular(double numero, double segundo) {
        if(segundo!=0){
            double resultado = numero/segundo;
//            System.out.print("la division es :");
            return resultado;
        }else{
           throw new ZeroDivisionException();
        }
    }
}
    class ZeroDivisionException extends ArithmeticException{
        public ZeroDivisionException(){
            super("ERROR: DIVISION POR CERO");
        }
    }
    class NoSuchOperationException extends ArithmeticException{
        public NoSuchOperationException(char op){
            super("ERROR: NO EXISTE OPERADOR "+op);
        }
    }
enum Operaciones{
    SUMA('+'),
    RESTA('-'),
    MULTIPLICACION('*'),
    DIVISION('/');
    
    public final char signo;
    
    private Operaciones(char signo){
        this.signo=signo;
    }
    
}
