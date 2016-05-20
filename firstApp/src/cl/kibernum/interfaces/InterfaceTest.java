package cl.kibernum.interfaces;

public class InterfaceTest {
    
    public static void main(String[] args) {
        CreditCard cardMaster = new Mastercard();
        CreditCard cardVisa = new Visa();
        System.out.println(cardMaster.toString());
        System.out.println(cardVisa.toString());
        System.out.println(cardVisa.getForeignCredit(1, 1000000, 22));
        System.out.println(cardVisa.getHomeCredit(1, 1000000, 22));
        
        
    }
}
