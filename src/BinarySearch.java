import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int numeros[] = {5, 7, 9, 11, 13, 15};

        System.out.println("Quantidade de tentativas:" +  BuscaBinaria(numeros, 13));

    }

    private static Integer BuscaBinaria(int numeros[], int procurarPor) {
        int inicio = 0;
        int fim = numeros.length -1;
        int contador = 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == procurarPor) {
                return contador;
            } else if (meio > procurarPor) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
            contador++;
        }
        return contador;
    }
}
