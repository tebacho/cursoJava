package cl.kibernum.interfaces;

public interface CreditCard {
    public final static int COD_BANCO = 22;
    public final static int COD_PAIS = 56;
    
    public int getHomeCredit(int id, int wage, int year);
    public int getForeignCredit(int id, int wage, int year);
    public String getSegmento(int wage, int credit);
    public void pay();
    
}
