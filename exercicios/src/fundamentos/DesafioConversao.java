package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite os tres ultimos salarios: (de enter para cada salario)");
        String salario1 = entrada.nextLine();
        String salario2 = entrada.nextLine();
        String salario3 = entrada.nextLine();
        entrada.close();

        if (salario1.contains(",")){
            salario1 = salario1.replace(",",".");
        }
        if (salario2.contains(",")){
            salario2 = salario2.replace(",",".");
        }
        if (salario3.contains(",")){
            salario3 = salario3.replace(",",".");
        }
        double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) /3;
        System.out.println("A média dos salários é: "+ media);

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o primeiro salario:");
        String salario11 = entrada.nextLine().replace(",",".");
        System.out.println("Digite o segundo salario:");
        String salario21 = entrada.nextLine().replace(",",".");
        System.out.println("Digite o terceiro salario:");
        String salario31 = entrada.nextLine().replace(",",".");

    }
}
