/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.entornografico.objects.exception;

/**
 *
 * @author Kibernum
 */
public class NoSuchCardException extends RuntimeException {
    
    public NoSuchCardException(String mensaje){
        super("NO EXISTE TAL TARJETA: "+mensaje);
    }
    
}
