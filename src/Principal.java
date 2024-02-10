/**Programa para calcular o IMC (Indice de massa corporal)
 * Ao informar o seu peso e altura ele ira te retornar qual seu IMC
 * e dirá se esta acima ou abaixo do peso ideal.
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura:");
        double altura = sc.nextDouble();

        // Cria  uma instância
        Paciente paciente = new Paciente(peso, altura);

        // Calcula o IMC
        double imc = paciente.calcularImc();

        // Imprime o resultado do IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // imprime o diagonostico
        System.out.println("Diagnóstico: " + paciente.diagnostico());

        sc.close();
    }
}
