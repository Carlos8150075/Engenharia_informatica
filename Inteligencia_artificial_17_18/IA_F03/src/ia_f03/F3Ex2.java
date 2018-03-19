/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_f03;

import FreeCBR.CBR;
import FreeCBR.CBRResult;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Bernardo
 */
public class F3Ex2 {

    private static CBR cbr = null;
    private static final String CBR_FILE = "../datasets/origem_carros_test.cbr";
    private static final String LOG_FILE = "../datasets/weather.log";
    private static long time;
    private static Scanner scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        if (Files.exists(Paths.get(CBR_FILE))) {
            if (!Files.exists(Paths.get(LOG_FILE))) {
                try {
                    new BufferedWriter(new FileWriter(new File(LOG_FILE))).close();
                } catch (IOException e) {
                    System.out.println("Impossivel criar ficheiro de log");
                    e.printStackTrace();
                }
            }
            try {
                cbr = new CBR(CBR_FILE, LOG_FILE, true, true);
            } catch (IOException e) {
                System.out.println("O ficheiro não existe");
                return;
            }

            System.out.println("Numero de casos: " + cbr.getNumCases());
            String[] query = buildQuery();
            String[] features = new String[]{"mpg", "displacement", "horsepower", "weight", "acceleration", "origin"};
            int[] pesos = new int[]{8, 5, 5, 5, 7, 10};
            int[] zeros = new int[]{0, 0, 0, 0, 0, 0};

            int[] funcoesSimilaridade = new int[]{CBR.SEARCH_SCALE_FUZZY_LINEAR, CBR.SEARCH_SCALE_FUZZY_LINEAR,
                CBR.SEARCH_SCALE_FUZZY_LINEAR, CBR.SEARCH_SCALE_FUZZY_LINEAR, CBR.SEARCH_SCALE_FUZZY_LINEAR, CBR.SEARCH_SCALE_FUZZY_LINEAR};
            tic();
            CBRResult[] result = cbr.search(features, query, pesos, zeros, funcoesSimilaridade, zeros);
            toc();

            System.out.println("O carro é da nacionalidade"
                    + Arrays.toString(query) + ": " + cbr.getCase(result[0].caseNum)[5].getStringValue() + ", "
                    + "com " + result[0].matchPercent + "% de certeza");

        } else {
            System.out.println("A base de casos não existe em " + CBR_FILE);
        }
    }


private static void tic() {
        time = System.currentTimeMillis();
    }

    private static void toc() {
        System.out.println("Demorou " + (System.currentTimeMillis() - time) + " milisegundos.");
    }
    
    private static String[] buildQuery(){
        System.out.println("mpg: ");
        int mpg = scan.nextInt();
        System.out.println("displacement: ");
        int dis = scan.nextInt();
        System.out.println("horsepower: ");
        int hp = scan.nextInt();
        System.out.println("weight: ");
        int w = scan.nextInt();
        System.out.println("accelaration: ");
        int acc = scan.nextInt();
        
        String[] query = new String[]{""+ mpg, ""+dis, ""+hp, ""+ w, ""+acc,"?"};
        
        return query;
    }
}
