/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.entornografico.objects;

import cl.kibernum.entornografico.objects.exception.NoSuchCardException;
import cl.kibernum.interfaces.CreditCard;
import cl.kibernum.interfaces.Mastercard;
import cl.kibernum.interfaces.Visa;


public class CreditCardUtil {
    public static CreditCard getSelectedCreditCard(CardEnum cardEnum ){
        CreditCard ccard = null;
        switch(cardEnum){
            case VISA:
                return new Visa();
            case MASTERCARD:
                return new Mastercard();
        }
        throw new NoSuchCardException("");
    }
    public static CreditCard getCard(int cod){
        CardEnum enume = CardEnum.getCardEnum(cod);
        return getSelectedCreditCard(enume);
    }
}
