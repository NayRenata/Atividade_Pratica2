/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo:
*/
package atividade_pratica2;
import java.util.Scanner;

public class Lista1Ex3{
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in);
     
//Variavel     
     String nome;
     int idade;
     boolean doador;
     
//Entrada das informações(nome,idade e se ja é doador)
   System.out.println("Digite o seu nome completo:");
   nome = leia.nextLine();
   
   System.out.println("Informe a sua idade:");  
   idade= leia.nextInt();
   
   System.out.println("Informe se ja realizou alguma doacao de sangue em sua vida, utilize (true) sim e (false) nao:");
   doador = leia.nextBoolean();
   
   //Hora da relação condicional
   if(idade >= 18 && idade <= 60 || idade >= 61 && idade <=69 && doador == true){
        
        System.out.println(nome+ " de " +idade+" anos, esta apta(o) para doar sangue!");
        
   }else {
        System.out.println(nome+ " de " +idade+" anos, nao esta apta(o) para doar sangue!"); 
   }
   
   }
   }