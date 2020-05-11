
package revisao1;

import java.util.Scanner;

public class aula0405 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        // EXERCÍCIO 1
           
        String nome;
            
            System.out.println("Insira seu nome: ");
            nome = teclado.next();
            
            System.out.println("Olá, " +nome+ "! Seja bem vindo!");
            System.out.println("\n ");
        //EXERCICIO 2
               
        double n1, n2, n3, n4,m;
            
            System.out.println("Insira sua primeira nota: ");
            n1 = teclado.nextInt();
            
            System.out.println("Insira sua segunda nota: ");
            n2 = teclado.nextInt();
            
            System.out.println("Insira sua terceira nota: ");
            n3 = teclado.nextInt();
            
            System.out.println("Insira sua quarta nota: ");
            n4 = teclado.nextInt();
            
            m = (n1 + n2 + n3 + n4)/ 4;
            System.out.println(" ");
            System.out.println("Está é sua média em matemática: "+m);
            System.out.println("\n ");
        //EXERCICIO 3
        
            int x,y,z,w;
            
            System.out.println("Insira um número: ");
            x = teclado.nextInt();
            y = 1;
            z = 0;
            while(y <= 10){
                z++;
                  w = x * z;   
                  System.out.println(" "+x+" X "+y+" = "+w);
                y++;
            }
            System.out.println("\n ");
        //EXERCICIO 4
        
        double areaQ,areaT,base,h,lado,peso,alt,imc;
        
            System.out.println("Insira o valor da base do triangulo: ");
            base = teclado.nextDouble();
            
            System.out.println("Insira o valor da altura do triangulo: ");
            h = teclado.nextDouble();
            
            areaT = (base * h)/ 2;
            
            System.out.println("A Área do seu triangulo é: " +areaT);
            System.out.println("\n");
            
            System.out.println("Insira o valor do lado do quadrado: ");
            lado = teclado.nextDouble();
            
            areaQ = lado * lado;
            
            System.out.println("A Área do seu quadrado é: "+areaQ);
            System.out.println("\n");
            
            System.out.println("Informe seu peso: ");
            peso = teclado.nextDouble();
            
            System.out.println("Informe sua altura: ");
            alt = teclado.nextDouble();
            
            imc = peso / alt;
            
            System.out.println("IMC: "+imc);
            System.out.println(" ");
            System.out.println("\n");
            //EXERCICIO 5
            
            double km, m;
                
                System.out.println("Insira a quilometragem que gostaria de converter em milhas: ");
                km = teclado.nextDouble();
                
                m = km / 1.60934;
                
                System.out.println("Quilometragem inserida, em milhas: "+m);
                
                System.out.println("\n");
            //EXERCICIO 6
            
            int mes, dia;
            
                System.out.println("Insira uma quantidade de meses para ser convertida em dias: ");
                mes = teclado.nextInt();
                
                dia = mes * 30;
                
                System.out.println(""+mes+" meses em dias: "+dia+" dias");
                
                /*QUESTÃO SECRETA DO VÍDEO SHHHH:
                    Diferença entre Double e Float:
                    O tipo de variável float ocupa
                    menos espaço na memória RAM,
                    enquanto o tipo de variável
                    double é mais preciso.           
                */
    }
    
}
