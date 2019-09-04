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
public class OriginalScore implements GameScore{
    /**
     * @pre Inicia con 100 puntos
     * @pos numero entre 0 y 100 
     * @param correctCount, Entero 
     * @param incorrectCount, Entero
     * @return entero con puntaje total mayor a cero
     */
    public int calculateScore(int correctCount, int incorrectCount)throws HangmanException{
        int puntaje = 100;
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NUMERO_INVALIDO);}
        
        return 0;
    }
    
}
