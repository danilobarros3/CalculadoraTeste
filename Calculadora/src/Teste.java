/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author danilobarros
 */
//Classe destinada para testes
public class Teste {

    public static void main(String[] args) {
        //Testando a soma 2 e 4, resutaldo esperado de 6
        Soma soma = new Soma();
        System.out.println(soma.somar(2,4));
        
        //Testando a subtração 8 e 3, resultado esperado de 5
        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.sub(8,3));
        
        //Testando a divisão 8 e 4, resultado esperado 2 
        Divisao divisao = new Divisao();
        System.out.println(divisao.div(8,4));
        
        //Testando a multiplicacao 10 e 2, resultado esperado 20
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.multi(10,2));
    }
          
           
   
}
