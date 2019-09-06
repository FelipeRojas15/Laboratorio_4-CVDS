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
public class PowerBonusScore implements GameScore{
    /**
     * @pre Inicia con 0 puntos
     * @pos numero entre 0 y 500 
     * @param correctCount, Entero 
     * @param incorrectCount, Entero
     * @return entero con puntaje total mayor a cero
     */
    public int calculateScore(int correctCount, int incorrectCount)throws HangmanException{        
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NUMERO_INVALIDO);}
        
        int puntaje = (((int)Math.pow(5,correctCount)))-(incorrectCount*8);
        if (puntaje > 500){
            puntaje = 500;
        }
        
        if (puntaje < 0){
            puntaje = 0;
        }
        
        return puntaje; 
    }
}
