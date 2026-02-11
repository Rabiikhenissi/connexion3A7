package edu.connexion3A7.Tests;

import edu.connexion3A7.Entities.Personne;
import edu.connexion3A7.Services.PersonneService;
import edu.connexion3A7.Tools.MyConnexion;

import java.sql.SQLException;

public class Mainclass {
    public static void main(String[] args)  {
        //MyConnexion myConnexion = new MyConnexion();
        int n1= MyConnexion.getInstance().hashCode();
        int n2= MyConnexion.getInstance().hashCode();
        System.out.println("n1="+n1 +" n2="+n2);
        Personne p = new Personne( "user","admin");
       PersonneService ps = new PersonneService();
        try {
           // ps.addEntity2(p);
            System.out.println(ps.getEntities());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
