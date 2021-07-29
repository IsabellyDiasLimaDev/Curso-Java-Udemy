package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        double expressao1 = Math.pow((6 * (3 + 2)), 2);
        double expressao2 = expressao1 / (3 * 2);
        double expressao3 = (1 - 5) * (2 - 7);
        double expressao4 = Math.pow((expressao3 / 2), 2);
        double expressao5 = Math.pow((expressao2 - expressao4), 3);
        double expressao6 = Math.pow(10, 3);
        double resultado = expressao5 / expressao6;
        System.out.println(resultado);
    }
}
