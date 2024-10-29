/*Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
*/

package atividade_pratica2;
import java.util.Scanner;

public class Lista2Ex7{
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
     
    
     float numero1;
     float numero2;
     int cod;
     double result;
     
     //Entrada de dados
     
     System.out.println("## Bem - vindo(a) a calculadora Generation ##");
     System.out.println("Selecione um numero");
     numero1 = leia.nextFloat();
     
     System.out.println("Selecione outro numero");
     numero2 = leia.nextFloat();
     
     System.out.println("Selecione a operação desejada pelo numero, (1)soma; (2)subtracao; (3)Multiplicacao; (4)Divisao:");
     
     //Resultado final
     cod = leia.nextInt();
     
     switch(cod){
     
     case 1:
     result = numero1 + numero2;
     System.out.printf(+numero1+" + " +numero2+ " = "+result);
     break;
     
     case 2:
     result = numero1 - numero2;
     System.out.printf(+numero1+" - " +numero2+ " = "+result);
     break;
     
     case 3:
     result = numero1 * numero2;
     System.out.printf(+numero1+" * " +numero2+ " = "+result);     
     break;
     
     case 4:
    
     result = numero1 / numero2;
     System.out.printf(+numero1+" / " +numero2+ " = "+result);
   
     break;
     
     default:
     System.out.println("Operação Invalida!");
     
     leia.close();
     }
     }
     }
     
     