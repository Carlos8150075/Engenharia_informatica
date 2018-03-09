/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3_pp;
/**
 *
 * @author Bernardo
 */
public class Ficha3_PP {
    void exerc1(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = j;
            }
        }
        System.out.println("Matriz Original");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Matriz Transposta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.print("\n");
        }
    }
    void exerc2(int n, int num) {
        int[] vet = new int[n];
        int soma = 0;
        for (int i = 0; i < n; i++) {
            vet[i] = i;
        }
        for (int i = 3; i < n; i++) {
            if (vet[i] % num == 0) {
                soma = soma + num;
            }
            if (soma == num) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        Ficha3_PP ex = new Ficha3_PP();
        //ex.exerc1(3);
        ex.exerc2(30, 28);
    }
    
}
