/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.entornografico.objects;

import cl.kibernum.entornografico.objects.exception.NoSuchCardException;

/**
 *
 * @author Kibernum
 */
public enum CardEnum {
    VISA(0), MASTERCARD(1), DINERS(2);
    
    private int cod;

    public int getCod() {
        return cod;
    }
    
    CardEnum(int cod){
        this.cod = cod;
    }
    
    public static CardEnum getCardEnum(int cod){
        for(CardEnum cardType : CardEnum.values()){
            if(cod ==cardType.cod){
                return cardType;
            }
        }
        throw new NoSuchCardException("");
    }
}
