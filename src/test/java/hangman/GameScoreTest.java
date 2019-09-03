/** 
  
OriginalScore:
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

BonusScore: 
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


PowerBonusScore:

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
package hangman;
import org.junit.Assert;
import hangmanException.*;
import org.junit.Test;

public class GameScoreTest {
   @Test 
    public void pruebaBonusScore(){
        
        
    }

}
