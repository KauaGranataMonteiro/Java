import java.text.DecimalFormat;
import java.util.Scanner;
public class B_KauãGranata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		int idade=0, expServ=0, candidato=0, contIdade=0, somaIdade=0, contMedio= 0,contSuperior = 0, contPos = 0, contMestrado =0, contDoutor=0;  
		int contCand=0, contExp=0, contnExp=0;
		char sexo = 0, escolaridade=0;
		
		while(candidato != 2){
			
			
		System.out.print("Informe a idade: ");
		idade = e.nextInt();
		
		System.out.print("Infome seu sexo (M ou F): ");
		sexo = e.next().toUpperCase().charAt(0);
		//validação
		while(sexo!= 'M' && sexo != 'F'){
			System.out.println("Digite corretamente (M ou F):" );
			sexo= e.next().toUpperCase().charAt(0);
		}
		
		System.out.print("Informe sua escolaridade: ");
		escolaridade = e.next().toUpperCase().charAt(0);
		//validação
		while(escolaridade != 'M' && escolaridade != 'S' && escolaridade != 'P' && escolaridade != 'T' && escolaridade != 'D' ){
			System.out.println("Digite corretamente:" );
			escolaridade= e.next().toUpperCase().charAt(0);
		}
		
		System.out.print("Tem experiencia no serviço? ");
		expServ = e.nextInt();
		//validação
		while(expServ != 1 && expServ != 2){
			System.out.println("Digite corretamente (1 ou 2):" );
			expServ =e.nextInt();
		}
		
		contCand++;
		
		System.out.print("Deseja cadastrar um novo candidato?");
		candidato = e.nextInt();
		//validação
		while(candidato != 1 && candidato != 2){
			System.out.println("Digite corretamente (1 ou 2):" );
			candidato =e.nextInt();
		}
		
		
		//Contadores
		//a)
		if (sexo=='M' && expServ == 1){
			contIdade++;
			somaIdade += idade;
		}
		//b)
		if(expServ == 1){
			contExp++;
			
		}else{
			contnExp++;
		}
		//c)
		if(escolaridade == 'M'){
			contMedio ++;
		}else if (escolaridade == 'S'){
			contSuperior ++;
		}else if (escolaridade == 'P'){
			contPos ++;
		}else if (escolaridade == 'T'){
			contMestrado ++;
		}else{
			contDoutor++;
		}
		
	}//Fecha while
		
		//a)
		if(contIdade == 0){
			System.out.println("Sem média");
		}else{
		System.out.println("Idade média dos homens que já tem experiência no serviço: "+somaIdade/contIdade + " anos");
		}
		//b)
		if(contExp == 0){
			System.out.println("Sem porcentagem para candidatos com experiencia");
		}else{
		System.out.println("Porcentagem de candidatos com experiencia: " +  numFormatado.format(((double)contExp/contCand)*100)+"%");
		System.out.println("Porcentagem de candidatos sem experiência: " + numFormatado.format(((double)contnExp/contCand)*100)+"%");
		}
		//c)
		System.out.println("Candidatos com ensino médio: " +contMedio);
		System.out.println("Candidatos com ensino Superior: " +contSuperior);
		System.out.println("Candidatos com Pós graduação: " +contPos);
		System.out.println("Candidatos com Mestrado: " +contMestrado);
		System.out.println("Candidatos com Doutorado: " +contDoutor);
		
		
		
		
		
		
		
		
		
		

	}

}
