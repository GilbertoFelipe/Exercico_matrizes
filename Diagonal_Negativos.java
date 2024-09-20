package exercicios.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Diagonal_Negativos {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        int n, qtdnegativos;

        System.out.println("Qual a ordem da matriz? ");
        n = sc.nextInt();

        int[][] matriz = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                    System.out.printf("Elemento [%d,%d: ]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Diagonal Principal: ");

        for(int i=0; i<n; i++){
            System.out.printf("%d ", matriz [i][i]);
        }

        qtdnegativos = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (matriz[i][j] < 0){
                    qtdnegativos++;

                }
                    
            }
        }

            System.out.printf("\nQuantidade de Negativos = %d\n", qtdnegativos);

                sc.close();
    }
}


