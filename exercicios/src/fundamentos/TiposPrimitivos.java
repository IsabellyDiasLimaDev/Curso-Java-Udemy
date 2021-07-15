package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 3276;
        int id = 56789;
        long pontosAcumulados = 33_2334_845L;

        //tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_1033.01;

        //tipo booleano
        boolean estaDeFerias = false; //true

        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Numeros de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha ->" + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
