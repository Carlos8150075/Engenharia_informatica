package ia_f03;

/**
 * Created by Davide on 13/03/2018.
 */
import FreeCBR.CBR;
import FreeCBR.CBRResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by Davide Carneiro on 20/03/2017.
 */
public class F3Ex1 {

    private static CBR cbr = null;
    private static final String CBR_FILE = "../datasets/weather.cbr";
    private static final String LOG_FILE = "../datasets/weather.log";
    private static long time;

    public static void main(String[] args) {

        if (Files.exists(Paths.get(CBR_FILE))) //se existe a base de casos
        {
            if (!Files.exists(Paths.get(LOG_FILE))) //se não existe o ficheiro de log, cria-o
            {
                try {
                    new BufferedWriter(new FileWriter(new File(LOG_FILE))).close();
                } catch (IOException e) {
                    System.out.println("Impossível criar ficheiro de log.");
                    e.printStackTrace();
                    return;
                }
            }

            try {
                cbr = new CBR(CBR_FILE, LOG_FILE, true, true);
            } catch (IOException e) {
                System.out.println("O ficheiro não existe...");
                return;
            }

            /*
             * Procurar casos similares
             *
             * */
            System.out.println("A utilizar base de casos com " + cbr.getNumCases() + " casos");

            String[] query = new String[]{"sunny", "82", "90", "false", "?"};   //NOVO CASO

            String[] features = new String[]{"outlook", "temperature", "humidity", "windy", "play"};
            int[] pesos = new int[]{8, 5, 5, 5, 7};
            int[] zeros = new int[]{0, 0, 0, 0, 0};
            int[] funcoesSimilaridade = new int[]{CBR.SEARCH_SCALE_FLAT, CBR.SEARCH_SCALE_FUZZY_LINEAR,
                CBR.SEARCH_SCALE_FUZZY_LINEAR, CBR.SEARCH_SCALE_FLAT, CBR.SEARCH_SCALE_FLAT};

            tic();  
            CBRResult[] result = cbr.search(features, query, pesos, zeros, funcoesSimilaridade, zeros);
            toc();

            for (int i = 0; i < result.length; i++) {
                System.out.println("Case: " + result[i].caseNum + " - match (%): " + result[i].matchPercent);
            }

            System.out.println("Devo jogar com as seguintes condições? "
                    + Arrays.toString(query) + ": " + cbr.getCase(result[0].caseNum)[4].getBoolValue() + ", "
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
}
