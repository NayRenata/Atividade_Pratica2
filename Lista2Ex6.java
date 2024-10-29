/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.*/
package atividade_pratica2;
import java.util.Scanner;

public class Lista2Ex6{
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
     
     //variavel
     String nome;
     int cod;
     double salario,result;
     
     //Entrada de dados
     System.out.println("Informe o seu nome:");
     nome = leia.nextLine();
     
     System.out.println("Qual e o seu cargo, escreva apenas o numero >> 1 = gerente, 2 = vendedor, 3 = supervisor, 4 = motorista, 5 = estoquista, 6 = Tecnico de TI;");
     cod = leia.nextInt();
     
     System.out.println("Informe o seu salario:");
     salario = leia.nextDouble();
     
     //Hora do switch
        
     switch(cod){
     
     case 1:
     result = salario + (0.10 * salario);
          
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Gerente |Novo salario:" +result);
         break;
     
     
     case 2:
     result = salario + (0.07 * salario);
     
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Vendedor |Novo salario:" +result);
         break;
         
     case 3:
     result = salario + (0.09 * salario);
     
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Supervisor |Novo salario:" +result);

                  break;
         
     case 4:
     result = salario + (0.06 * salario);
     
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Motorista |Novo salario:" +result);
 break;    
         
     case 5:
     result = salario + (0.05 * salario);
     
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Estoquista  |Novo salario:" +result);
break;
         
     case 6:
     result = salario + (0.08 * salario);
     
         System.out.println("Nome do colaborador:" +nome+ "|Cargo:Tecnico de TI |Novo salario:" +result);
         break;       
         
 
    
     }
     }
     }
     
     
     
     