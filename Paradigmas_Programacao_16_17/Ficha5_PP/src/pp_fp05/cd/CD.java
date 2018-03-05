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
public class CD {
    protected String name;
    protected int year;
    protected String editor;
    protected int tracks;

    public CD(String TempName, int TempYear, String TempEditor, int TempTracks) {
        name = TempName;
        year = TempYear;
        editor = TempEditor;
        tracks = TempTracks;
    }
}
