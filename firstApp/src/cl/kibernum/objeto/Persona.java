package cl.kibernum.objeto;

public class Persona {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setEdad(33);
        p.setNombre("Tania");
        p.setPeso(62.5f);
        p.print();

        Persona pe = new Persona();
        pe.setEdad(35);
        pe.setNombre("Taylor");
        pe.setPeso(69.5f);
        pe.print();
        Sapo.noHaceNada();
        Sapo.noHaceNada();
        Sapo.noHaceNada();

        Sapo sapo = new Sapo();
        sapo.noHaceNad();
    }

    int edad;
    String nombre;
    float peso;
    String colorOjos;
    static String genero;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    protected void soyProtected(){
        System.out.println("Soy protected");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Persona.genero = genero;
    }
    
    

    public void print() {

        System.out.println("Nombre Persona: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Peso: " + getPeso());

    }
}

class Sapo {

    static {
        System.out.println("SOY UN SAPO ESTÁTICO");
    }

    {
        System.out.println("SOY UN SAPO NO ESTÁTICO");
    }

    public static void noHaceNada() {

    }

    public void noHaceNad() {

    }

}
