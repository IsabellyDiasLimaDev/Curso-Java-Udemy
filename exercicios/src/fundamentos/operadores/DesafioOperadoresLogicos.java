package fundamentos.operadores;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
//        boolean trabalho1 = true;
//        boolean trabalho2 = true;
//
//        boolean televisao50 = trabalho1 && trabalho2;
//        boolean televisao32 = trabalho1 ^ trabalho2;
//        boolean sorvete = trabalho1 || trabalho2;
//        System.out.println("TELEVISAO DE 50': " + televisao50);
//        System.out.println("TELEVISAO DE 32': " + televisao32);
//        System.out.println("SORVETE: " + sorvete);

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);

        trabalho1 = true;
        trabalho2 = true;

        comprouTV50 = trabalho1 && trabalho2;
        comprouTV32 = trabalho1 ^ trabalho2;
        comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);

        trabalho1 = true;
        trabalho2 = false;

        comprouTV50 = trabalho1 && trabalho2;
        comprouTV32 = trabalho1 ^ trabalho2;
        comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);

        trabalho1 = false;
        trabalho2 = true;

        comprouTV50 = trabalho1 && trabalho2;
        comprouTV32 = trabalho1 ^ trabalho2;
        comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
