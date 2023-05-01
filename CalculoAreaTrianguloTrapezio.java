import java.util.Scanner;

//instrução1
//Pergunta ao usuario o 1 Base Maior do triangulo
//instrução2
//Guardar o valor da Base Maior do triangulo
//instrução3
//Pergunta ao usuario a Base Menor do triangulo
//instrução4
//Guarda o valor da altura do triangulo
//instrução5
//Fazer a multiplicação da Base pela Altura
//instrução6
//Fazer a divisao da multiplicação por 2 para obiter a areas 
//instrução7
//Guarda o resula da divisao
//intrução8
//Exibir para o usuario o valor da area do triangulo
//introdução9
//Finalizar o codigo
//...

class CalculoAreaTrianguloTrapezio {
  
	public static void main(String args[]){  
   
    	Scanner CalculoAreaTrianguloTrapezio = new Scanner(System.in);
		
		double mult;
		double alturaT;
		double baseMaior;
		double baseMenor;
		double resultado;
		
		System.out.printf("Por farvor insira a base maior do triangulo: \n\n"); 
		baseMaior = CalculoAreaTrianguloTrapezio.nextDouble();
		
		System.out.printf("\nPor farvor insira a base menor do triangulo: \n\n"); 
		baseMenor = CalculoAreaTrianguloTrapezio.nextDouble();
		
		System.out.printf("\nPor farvor insira a altura do triangulo: \n\n"); 
		alturaT   = CalculoAreaTrianguloTrapezio.nextDouble();
			
		mult = (baseMaior + baseMenor) /2 ;
		
		resultado = mult * alturaT;
		
		System.out.printf("\nA area do triangulo Trapezio e: " + resultado); 
			
    	System.exit(0);
		
	}

}
