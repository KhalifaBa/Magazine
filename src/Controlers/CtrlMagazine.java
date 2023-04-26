package Controlers;

import Entities.Magazine;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlMagazine
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlMagazine() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Magazine> GetAllMagazines()
    {
        ArrayList<Magazine> lesMagazines = new ArrayList<>();
        // A vous de jouer
        try {
            ps = cnx.prepareCall("SELECT magazine.idMag,magazine.nomMag,specialite.nomSpe FROM `magazine` INNER JOIN specialite ON magazine.numSpecialite = specialite.idSpe;");
            rs = ps.executeQuery();
            while (rs.next())
            {
                Magazine unMagazine = new Magazine(rs.getInt(1),rs.getString(2),rs.getString(3));
                lesMagazines.add(unMagazine);
            }
        }

        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
        return lesMagazines;
    }

    public double GetMontantMagazine(int idMag)
    {
        double montant = 0;

        // A vous de jouer

        return montant;
    }

}
