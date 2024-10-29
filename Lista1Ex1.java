/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
*/
package atividade_pratica2;
import java.util.Scanner;

public class Lista1Ex1{
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
    
     
//Variavel   
int valorA, valorB, valorC,opcao;



//-----------------
System.out.println("####Vamos brincar de Calculo com a Generatin(Turma 78)####");

System.out.println("Informe um valor inteiro para A:");
valorA = leia.nextInt();

System.out.println("Informe um valor inteiro para B:");
valorB = leia.nextInt();

System.out.println("Informe um valor inteiro para C:");
valorC = leia.nextInt();

//Calculo com switch
System.out.println("Escolha a operacao desejada:1, 2 ou 3");
opcao = leia.nextInt();

switch(opcao){

    case 1:        
        if(valorA + valorB > valorC){
        System.out.println("A Soma de A + B e Maior do que C.");
        }else{System.out.println("A Soma de A + B NAO e Maior do que C.");}
        break;
        
    case 2:
         if(valorA + valorB < valorC){
        System.out.println("A Soma de A + B e Menor do que C.");
        }else{System.out.println("A Soma de A + B NAO e Menor do que C.");
        }
        break;
          
    case 3:
         if(valorA + valorB == valorC){
        System.out.println("A Soma de A + B e igual a C.");
        }else{System.out.println("A Soma de A + B NAO e igual a C.");
        }
        break;  
          
    default:
        System.out.println("Opcao invalida");
        break;

}

leia.close();      
              
}
}