    
package hangman;
import org.junit.Assert;
import hangman.model.*;
import org.junit.Test;


public class GameScoreTest {
 /**   
  * OriginalScore:
  * El puntaje no deberia ser menor a 0 asi hayan mas de 10 letras incorrectas
    Caso 1. Limite inferior: Cantidad Incorrectas = 100 | puntaje = 0
    Caso 2. Limite medio: Cantidad Incorrectas = 10    | puntaje = 0
    Caso 3. Limite superior:  Cantidad Incorrectas = 0  | puntaje = 0
    
  * Deberia generarse un error al ingresar un numero de respuestas incorrectas negativo
    * Caso 1. Limite inferior: Cantidad Incorrectas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
    * Caso 2. Limite medio: Cantidad Incorrectas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
    * Caso 3. Limite superior: Cantidad Incorrectas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO
 
  * Deberia generarse un error al ingresar un numero de respuestas correctas negativo
    * Caso 1. Limite inferior: Cantidad Correctas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
    * Caso 2. Limite medio: Cantidad Correctas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
    * Caso 3. Limite superior: Cantidad Correctas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO
    * 
     
 * Deberia dar un puntaje entre 10 y 100
    * Caso 1. Limite Inferior: Cantidad Incorrectas = 9    | puntaje = 10
    * Caso 2. Limite medio: Cantidad Incorrectas = 5       | puntaje = 50
    * Caso 3. Limite superior: Cantidad Incorrectas = 1    | puntaje = 90
    * */
    
   
    
   @Test 
    public void deberiaSerCeroElScoreOriginalScore() throws HangmanException {
        OriginalScore puntaje = new OriginalScore();
        
        Assert.assertEquals(0,puntaje.calculateScore(5,100));       
        Assert.assertEquals(0,puntaje.calculateScore(0,10));        
        
    }
    @Test 
    public void deberiaGenerarErrorDatosInvalidosIncorrectCountOriginalScore() throws HangmanException{
        OriginalScore puntaje = new OriginalScore();
        try {
            puntaje.calculateScore(2,-100);
            puntaje.calculateScore(5,-10);
            puntaje.calculateScore(6,-1);
        }catch (HangmanException e){
                Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
    @Test
    public void deberiaGenerarErrorDatosInvalidosCorrectCountOriginalScore() throws HangmanException{
        OriginalScore puntaje = new OriginalScore();
        try {
            puntaje.calculateScore(-100,5);
            puntaje.calculateScore(-10,4);
            puntaje.calculateScore(-1,3);
            puntaje.calculateScore(-8,-9);
        }catch (HangmanException e){
            Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
    
    @Test
    public void deberiaRetornarUnValorEntreDiezYCien() throws HangmanException{
        OriginalScore puntaje = new OriginalScore();
        Assert.assertEquals(10,puntaje.calculateScore(1,9));
        Assert.assertEquals(50,puntaje.calculateScore(5,5));
        Assert.assertEquals(90,puntaje.calculateScore(9,1));
    }
    /**
     * BonusScore: 
    * El puntaje no deberia ser menor a 0 asi hayan mas letras incorrectas que correctas
        Caso 1. Limite inferior: Cantidad Correctas = 1 | Cantidad Incorrectas = 6  | puntaje = 0
        Caso 2. Limite medio: Cantidad Correctas = 1    | Cantidad Incorrectas = 3  | puntaje = 0
        Caso 3. Limite superior: Cantidad Correctas = 1 | Cantidad Incorrectas 4    | puntaje = 0

    * No deberia haber limite de puntaje positivo.
        * Caso 1. Limite inferior: Cantidad Correctas = 11 | Cantidad Incorrectas = 0  | puntaje = 110
        * Caso 2. Limite medio: Cantidad Correctas = 15    | Cantidad Incorrectas = 0  | puntaje = 150
        * Caso 3. Limite superior: Cantidad Correctas = 20 | Cantidad Incorrectas 0    | puntaje = 200

    * Deberia generarse un error al ingresar un numero de respuestas incorrectas negativo
        * Caso 1. Limite inferior: Cantidad Incorrectas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 2. Limite medio: Cantidad Incorrectas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 3. Limite superior: Cantidad Incorrectas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO 

    * Deberia generarse un error al ingresar un numero de respuestas correctas negativo
        * Caso 1. Limite inferior: Cantidad Correctas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 2. Limite medio: Cantidad Correctas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 3. Limite superior: Cantidad Correctas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO    
         
    * Deberia dar un puntaje entre 10 y ∞
        * Caso 1. Limite Inferior: Cantidad Correctas = 1  Cantidad Incorrectas = 1    | puntaje = 5
        * Caso 2. Limite medio: Cantidad Correctas = 50 Cantidad Incorrectas = 20      | puntaje = 400
        * Caso 3. Limite superior: Cantidad Incorrectas = 1000    | puntaje = 100      | puntaje = 9500 

     */
    @Test
    public void deberiaTenerScoreEnCeroPorMayorIncorrectCountBonusScore() throws HangmanException{
        BonusScore puntaje = new BonusScore();
        Assert.assertEquals(5,puntaje.calculateScore(1, 1));
        Assert.assertEquals(400,puntaje.calculateScore(50, 20));
        Assert.assertEquals(9500,puntaje.calculateScore(1000, 100));
    
    } 
    @Test
   public void noDeberiaTenerRestriccionesEnPuntajePositivoBonusScore() throws HangmanException{
      BonusScore puntaje = new BonusScore();
       Assert.assertEquals(110,puntaje.calculateScore(11, 0));
       Assert.assertEquals(150,puntaje.calculateScore(15, 0));
       Assert.assertEquals(200,puntaje.calculateScore(20, 0));
   }
    @Test 
    public void deberiaGenerarErrorDatosInvalidosIncorrectCountBonusScore() throws HangmanException{
        BonusScore puntaje = new BonusScore();
        try {
            puntaje.calculateScore(2,-100);
            puntaje.calculateScore(5,-10);
            puntaje.calculateScore(6,-1);
        }catch (HangmanException e){
                Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
    @Test
    public void deberiaGenerarErrorDatosInvalidosCorrectCountBonusScore() throws HangmanException{
        BonusScore puntaje = new BonusScore();
        try {
            puntaje.calculateScore(-100,5);
            puntaje.calculateScore(-10,4);
            puntaje.calculateScore(-1,3);
            puntaje.calculateScore(-8,-9);
        }catch (HangmanException e){
                Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
    /**
     * PowerBonusScore:

    * No deberia permitir tener mas de 500 puntos con ningun numero de respuestas correctas
        * Caso 1. Limite inferior: Cantidad Correctas = 4 | Cantidad Incorrectas = 0 | puntaje = 500
        * Caso 2. Limite medio: Cantidad Correctas = 5 | Cantidad Incorrectas = 0 | puntaje = 500
        * Caso 3. Limite superior: Cantidad Correctas = 6 | Cantidad Incorrectas = 0| puntaje = 500

    * Deberia dar un puntaje mayor a 0
        * Caso 1. Limite inferior: Cantidad Correctas = 2    | Cantidad Incorrectas 1 | puntaje = 17
        * Caso 2. Limite medio: Cantidad Correctas = 3       | Cantidad Incorrectas 2 | puntaje = 500
        * Caso 3. Limite superior: Cantidad Correctas = 4    | Cantidad Incorrectas 20 | puntaje = 500

    * El puntaje no deberia ser menor a 0 asi hayan mas letras incorrectas que correctas
        Caso 1. Limite inferior: Cantidad Correctas = 1 | Cantidad Incorrectas = 6  | puntaje = 0
        Caso 2. Limite medio: Cantidad Correctas = 1    | Cantidad Incorrectas = 3  | puntaje = 0
        Caso 3. Limite superior: Cantidad Correctas = 1 | Cantidad Incorrectas 4    | puntaje = 0    * 

    * Deberia generarse un error al ingresar un numero de respuestas incorrectas negativo
        * Caso 1. Limite inferior: Cantidad Incorrectas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 2. Limite medio: Cantidad Incorrectas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 3. Limite superior: Cantidad Incorrectas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO 

    * Deberia generarse un error al ingresar un numero de respuestas correctas negativo
        * Caso 1. Limite inferior: Cantidad Correctas = -100  | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 2. Limite medio: Cantidad Correctas =-10       | deberia dar excepcion HangmanException.NUMERO_INVALIDO
        * Caso 3. Limite superior: Cantidad Correctas = -1    | deberia dar excepcion HangmanException.NUMERO_INVALIDO    
     */
    
    @Test
    public void noDeberiaPermitirPuntajesMayoresAQuinientosPowerBonusScore()  throws HangmanException{
        PowerBonusScore puntaje = new PowerBonusScore();
        Assert.assertEquals(500,puntaje.calculateScore(4, 0));
        Assert.assertEquals(500,puntaje.calculateScore(5, 0));
        Assert.assertEquals(500,puntaje.calculateScore(6, 0));
    }
    @Test
    public void deberiaDarUnPuntajeMayorACero() throws HangmanException{
        PowerBonusScore puntaje = new PowerBonusScore ();
        Assert.assertEquals(17,puntaje.calculateScore(2,1));
        Assert.assertEquals(109,puntaje.calculateScore(3,2));
        Assert.assertEquals(465,puntaje.calculateScore(4,20));
    }
    @Test 
    public void deberiaTenerPuntajeEnCeroPowerBonusScore() throws HangmanException{
        PowerBonusScore puntaje = new PowerBonusScore();
        Assert.assertEquals(0,puntaje.calculateScore(1, 6));
        Assert.assertEquals(0,puntaje.calculateScore(1, 3));
        Assert.assertEquals(0,puntaje.calculateScore(1, 4));
    }
    @Test 
    public void deberiaGenerarErrorDatosInvalidosIncorrectCountPowerBonusScore() throws HangmanException{
        BonusScore puntaje = new BonusScore();
        try {
            puntaje.calculateScore(2,-100);
            puntaje.calculateScore(5,-10);
            puntaje.calculateScore(6,-1);
        }catch (HangmanException e){
                Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
    @Test
    public void deberiaGenerarErrorDatosInvalidosCorrectCountPowerBonusScore() throws HangmanException{
        BonusScore puntaje = new BonusScore();
        try {
            puntaje.calculateScore(-100,5);
            puntaje.calculateScore(-10,4);
            puntaje.calculateScore(-1,3);
            
        }catch (HangmanException e){
                Assert.assertEquals(e.getMessage(),(HangmanException.NUMERO_INVALIDO));
        }
    }
}