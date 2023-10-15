package AtividadeDePesquisaLPP;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite a sua massa em quilos: ");
        double massa = scanner.nextDouble();
        
     
        double imc = massa / (altura * altura);
        
        System.out.println("Seu IMC é: " + imc);
        
       
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Seu peso está dentro da faixa saudável.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        scanner.close();
    }


	}

