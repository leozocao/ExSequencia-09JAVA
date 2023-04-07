import java.util.Scanner;

public class fahcel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double fahren, cel;

        System.out.print("Digite um valor em Fahrenheit: ");
        fahren = teclado.nextDouble();

        cel = 5 * ((fahren - 32) / 9);

        System.out.print("O valor digitado em graus Celsius é: " + cel);

        teclado.close();

    }
}