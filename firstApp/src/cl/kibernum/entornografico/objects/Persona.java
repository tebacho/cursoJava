/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.entornografico.objects;

import cl.kibernum.interfaces.CreditCard;

/**
 *
 * @author Kibernum
 */
public class Persona {
    private String nombre;
    private int edad;
    private int rut;
    private CreditCard ccar;
    private Persona(){
        this("",0,0,null);
    }

    public Persona(String nombre, int edad, int rut, CreditCard ccar) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.ccar = ccar;
    }
    
    public static Persona newInstanceofPersona(){
        return new Persona();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the rut
     */
    public int getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * @return the ccar
     */
    public CreditCard getCcar() {
        return ccar;
    }

    /**
     * @param ccar the ccar to set
     */
    public void setCcar(CreditCard ccar) {
        this.ccar = ccar;
    }
}
