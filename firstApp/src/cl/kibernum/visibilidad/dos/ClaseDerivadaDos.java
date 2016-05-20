/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.visibilidad.dos;

import cl.kibernum.visibilidad.uno.ClaseUno;

/**
 *
 * @author Kibernum
 */
public class ClaseDerivadaDos extends ClaseUno {

    public void pruebaVisibilidad(){
        super.intProtected = 0;
        this.intProtected = 1;
        super.intPublico = 0;
        System.out.println(super.intProtected);
        System.out.println(this.intProtected);
    }
    
}
