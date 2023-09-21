
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danilobarros
 */
//Teste automatizado utilizando JUnit
public class CalculadoraTest {
    private Soma soma = new Soma();
    private Divisao div = new Divisao();
    private Subtracao subtracao = new Subtracao();
    private Multiplicacao multiplicacao = new Multiplicacao();
    
    //Testando a soma de dois números
    @Test
    public void testSomar() {
        int resultado = soma.somar(2,4);
        assertEquals(6, resultado);
    }

    //Testando a subtração de dois números
    @Test
    public void testSubtrair() {
        int resultado = subtracao.sub(8, 3);
        assertEquals(5, resultado);
    }

    //Testando a multiplicação de dois números
    @Test
    public void testMultiplicar() {
        int resultado = multiplicacao.multi(10, 2);
        assertEquals(20, resultado);
    }

    //Testando a divisão de dois números
    @Test
    public void testDividir() {
        int resultado = div.div(8, 4);
        assertEquals(2, resultado);
    }
}
