package Controlers;

import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlPigiste
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlPigiste()
    {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<String> GetNomsPigistes()
    {
        ArrayList<String> lesNomDesPigistes = new ArrayList<>();
        // A vous de jouer
        return lesNomDesPigistes;
    }
}
