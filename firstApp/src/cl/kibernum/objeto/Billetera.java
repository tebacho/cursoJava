package cl.kibernum.objeto;

public class Billetera {

    private String material;
    private int monto;
    private String color;
    public static final String MARCA = "Shansho";
    public Billetera(String material, int monto, String color) {
        this.material = material;
        this.monto = monto;
        this.color = color;
    }

    private Billetera() {
        this("Default", 0, "Sin color");
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static Billetera createInstance(){
        return new Billetera();
    }

    @Override
    public String toString() {
        return "Billetera{" + "material=" + material + ", monto=" + monto + ", color=" + color + '}';
    }

    
}
