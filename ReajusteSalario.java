package AtividadeDePesquisaLPP;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
     
        double salarioReajustado = salario * 1.10; 
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário original: R$" + salario);
        System.out.println("Salário reajustado: R$" + salarioReajustado);
        
        scanner.close();
    }


}

