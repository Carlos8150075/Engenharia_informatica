/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Bernardo
 */
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Author[] a = new Author[]{
            new Author(20, "DJ Carnage", "Holanda", 1234569, 2134623),
            new Author(30, "Timmy", "Canada", 45294865, 5698556)
        };
        
        Track[] t = new Track[]{
            new Track(1, "PSY or DIE", 96, a[0].name),
            new Track(2, "Trumpets", 90, a[1].name)
        };
        
        CD cd = new CD("EDM", 2016, "t", 15);

        System.out.println("Nome do CD: " + cd.name);
        System.out.println("Ano de Lançamento: " + cd.year);
        System.out.println("Editor: " + cd.editor);
        for(Track track : t){
            System.out.println("Nome da musica numero " + track.n_faixa + " do Cd " + track.nome);
            System.out.println("Duraçao: " + track.duracao);
            System.out.println("Autor: " + a[i].name);
            i++;
        }
    }
}
