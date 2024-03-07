import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0) {
            soma = soma + numero;
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos numeros digitados é: " + soma);

    }
}