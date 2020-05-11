/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoscondicional;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class tarefa1105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Tarefa da aula 11-05//
    //Exercício 1//
     Scanner teclado = new Scanner(System.in);
    int n;
    
    System.out.println("Digite um número inteiro:");
    n = teclado.nextInt();
    
        if ((n % 2) == 0){ //(n % 2) == 0 - importante!//
            System.out.println(+n+" É um número par!");
            
        }else{
            System.out.println(+n+" É um número ímpar!");
        }
        
    //Exercício 2//
    int ano;
    
    System.out.println("Digite um ano:");
    ano = teclado.nextInt();
    
        if (ano == 2020) {
            System.out.println(+ano+" É o ano atual!");
        }else{
            if (ano >= 2021){
                System.out.println(+ano+" É do futuro!");
            }else{
                System.out.println(+ano+" É do passado!");
            }
        }
        
   //Exercício 3//
  String nome;
  double nota1, nota2, mediafinal;
  
  System.out.println("Olá, digite seu nome:");
  nome = teclado.next();
  
  System.out.println("Agora, digite a primeira nota: ");
  nota1 = teclado.nextDouble();
  
  System.out.println("Para terminar, digite sua segunda nota: ");
  nota2 = teclado.nextDouble() ;
  
  mediafinal = nota1 + nota2 / 2;
  
       if (mediafinal <=  3.99 ) {
            System.out.println("Nome: "+nome+ " Média: "+mediafinal+" Situação:Reprovado");
        }else{
           if (mediafinal > 4.00 && mediafinal<= 5.99) {
               System.out.println("Nome: "+nome+ " Média: "+mediafinal+" Situação:Recuperação");
               
           }else{
               System.out.println("Nome: "+nome+ " Média: "+mediafinal+" Situação:Aprovado!");
           }
           
       }
        
    
            
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
