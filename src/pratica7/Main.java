package pratica7;

import java.util.Scanner;

;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[][] mat = new int[5][5];

		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++) {
				System.out.println("informe um numero ");
				mat[i][j] = sc.nextInt();
			}
		System.out.println("Matriz informada:\n");
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++) {
				System.out.printf("%5d\n", mat[i][j]);

			}
		System.out.println("Elementos nas posições de linhas pares e colunas impares:\n");
		for (i = 0; i < 5; i += 2)
			for (j = 1; j < 5; j += 2) {
				System.out.printf("%5d\n", mat[i][j]);

			}
		System.out.println("Matriz transposta:\n");
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++) {
				System.out.printf("%5d\n", mat[j][i]);

			}
		System.out.println("trocar elementos da diagonal principal:\n");
		for (i = 0; i < 5; i++) {
			int pos = (mat[i].length - 1) - i;
			int temp = mat[i][pos];
			mat[i][pos] = mat[i][i];
			mat[i][i] = temp;
			System.out.printf("%5d\n", temp);

		}
	}

}
