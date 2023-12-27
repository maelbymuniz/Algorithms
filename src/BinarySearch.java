import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            numeros.add(i);
        }

        System.out.println("Quantidade de tentativas:" +  BuscaBinaria(numeros, 300));

    }

    private static Integer BuscaBinaria(ArrayList<Integer> numeros, int procurarPor) {
        int chute;
        int fim;
        int meio;
        int inicio = 0;
        fim = numeros.size() -1;
        int contador = 0;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            chute = numeros.get(meio);

            if (chute == procurarPor) {
               return contador;
            } else if (chute > procurarPor) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
            contador++;
        }
        return contador;
    }
}
