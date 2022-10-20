import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Fazer as entradas
        // Altura e peso
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double peso = sc.nextDouble();
        sc.close();

        double imc = peso / Math.pow(altura, 2);

        String diagnostico = resultadoIMC(imc);

        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);

    }

    public static String resultadoIMC(double imc) {
        String retorno = "";

        if (imc < 18.5) {
            retorno = "MAGREZA";
        } else
        if ((imc >= 18.5) && (imc < 25)) {
            retorno = "NORMAL";
        } else
        if ((imc >= 25) && (imc < 30)) {
            retorno = "SOBREPESO";
        } else
        if ((imc >= 30) && (imc < 40)) {
            retorno = "OBESIDADE";
        } else {
            retorno = "OBESIDADE GRAVE";
        }

        return retorno;
    }
}
