/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2_pp;

/**
 *
 * @author Bernardo
 */
public class F02_PP {

    /**
     * @param args the command line arguments
     */
    void exerc2(){
        int[][] matrix = new int[][]{{11,7,333},{-20,-23,63},{-22,501,10000}};
        int soma=0;
        float media=0;
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                soma = soma + matrix[i][j];
            }
        }
        media = soma / 9;
        System.out.println(soma);
        System.out.println(media);
    }
    void exerc3() {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int mult = 0;
        int cont_N = 0;
        int maior = lista[0];
        for (int i = 0; i < 9; i++) {
            if (lista[i] > 0) {
                mult = lista[i];
                mult = lista[i] * mult;

            }
            if (lista[i] < 0) {
                cont_N++;
            }
            if (lista[i] > lista[i + 1]) {
                maior = lista[i];
            }

        }
        System.out.println(mult);
        System.out.println(cont_N);
        System.out.println(maior);
    }
    void exerc4(){
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int tamanho = nome.length;
        int espaço =0;
        for(int i =0;i<tamanho;i++){
            if(nome[i]==' '){
                espaço = i; 
            }
        }
        for(int i =espaço;i<tamanho-1;i++){
            System.out.print(nome[i]);
        }
        System.out.print(",");
        for(int i =0;i<espaço;i++){
            System.out.print(nome[i]);
        }
    }
    void exerc6(){
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int[] listaC = new int[listaA.length+listaB.length];
        int[] listaD = new int[listaA.length];
        int cont=0;
        int j=0;
        //System.arraycopy(listaA, 0, listaC, 0, listaA.length);
        //System.arraycopy(listaB, 0, listaC, listaA.length, listaB.length);
        int i;
        int k=0;
        for(i =0; i<listaA.length;i++){
            listaC[i]=listaA[i];    
        }
        for(j=0;j<listaB.length;j++){
           listaC[i+j]=listaB[j]; 
        }
        for(i=0;i<listaA.length+listaB.length;i++){
            if(listaC[k]==listaC[i]){
                cont++;
            }else{
                k++;
            }
        }
        
        int pos=0;
        for(i=0;i<listaA.length;i++){
            for(j=0;j<listaB.length;j++){
                if(listaA[i]==listaB[j]){
                    break;
                }
            }
            if (j==listaB.length){
                    listaD[pos++]=listaA[i];
            }
        }
        for(i=0;i<pos;i++){
            System.out.println(listaD[i]);
        }
    }
    public static void main(String[] args) {
        F02_PP ex1 = new F02_PP();
        //ex1.exerc1();
        //ex1.exerc3();
        ex1.exerc4();
        //ex1.exerc6();
    }
    
}
