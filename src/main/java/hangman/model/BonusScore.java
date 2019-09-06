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
public class BonusScore implements GameScore{
     /**
     * @pre Inicia con 0 puntos
     * @pos numero entre 0 e i*10 - donde i es la longitud de la palabra 
     * @param correctCount, Entero 
     * @param incorrectCount, Entero
     * @throws hangman.model.HangmanException Si el numero ingresado es Invalido
     * @return entero con puntaje total, mayor a cero
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{       
        int puntaje = 0;
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NUMERO_INVALIDO);}
        if (correctCount*10>incorrectCount*5){
            puntaje=correctCount*10-(incorrectCount*5);
        }
        return puntaje;
    }
    
    
}
