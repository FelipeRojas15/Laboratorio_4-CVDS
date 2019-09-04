/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author 2153043
 */
public class HangmanException extends Exception{
    public static final String NUMERO_INVALIDO = "Un numero o mas en los parametros es incorrecto";
    public HangmanException (String msg){
        super(msg);
    }
    
}
