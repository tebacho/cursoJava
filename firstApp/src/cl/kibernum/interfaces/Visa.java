package cl.kibernum.interfaces;
import static cl.kibernum.interfaces.CreditCard.*;

public class Visa implements CreditCard{

    @Override
    public int getHomeCredit(int id, int wage, int year) {
        return (int)(id*(wage*0.5f)*(0.3f*year));
    }

    @Override
    public int getForeignCredit(int id, int wage, int year) {
        return (int)(id*(wage*0.3f)*(0.25f*year));
    }

    @Override
    public String getSegmento(int wage, int credit) {
         if(wage*credit>1000000){
             return "Platinum";
         }else if(wage*credit>500000){
             return "Silver";
         }else{
             return "mimbre";
         }
    }

    @Override
    public void pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Visa{" +" COD BANCO "+COD_BANCO+" COD PAIS "+COD_PAIS+'}';
    }
    
    
}
