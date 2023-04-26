package Controlers;

import Entities.Article;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlArticle
{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlArticle() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Article> GetAllArticlesByIdMagazine(int idMag)
    {
        ArrayList<Article> lesArticles = new ArrayList<>();
        // A vous de jouer
        return lesArticles;
    }
}
