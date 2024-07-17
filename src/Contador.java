import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois =  terminal.nextInt();
	
		try {
			//chamando ó metódo contar
			contar(parametroUm, parametroDois);
			
		}catch(ParametrosInvalidosException e){
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}
	}
	
	public static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
		//valida se o primeiro parametro é maior que o segundo parametro
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		for(int i = 1; i <=(parametroDois - parametroUm); i++) {
			System.out.println("Imprimindo o numero: " + i);
		}
	}
}
