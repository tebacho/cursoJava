package cl.kibernum.manejo.excepciones;

public class ExceptionTest {
    
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("y se marchó");
        }catch(ArithmeticException aa){
            System.out.println("Aritmethic Exception");
        }catch(RuntimeException aa){
            System.out.println("Runtime Exception");
        }
        catch(Exception aa){
            System.out.println("Exception");
            aa.printStackTrace();
        }finally{
            System.out.println("Finally");
        }
    }
}
