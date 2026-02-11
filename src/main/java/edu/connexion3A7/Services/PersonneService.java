package edu.connexion3A7.Services;

import edu.connexion3A7.Entities.Personne;
import edu.connexion3A7.Interfaces.Iservice;
import edu.connexion3A7.Tools.MyConnexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonneService implements Iservice<Personne> {
Connection con = MyConnexion.getInstance().getCon();
    @Override
    public void addEntity(Personne personne) throws SQLException{
        String requete="Insert INTO Personne (nom,prenom) VALUES ('"+personne.getNom()+"','"+personne.getPrenom()+"')";
        Statement stmt = MyConnexion.getInstance().getCon().createStatement();
        stmt.executeUpdate(requete);
        System.out.println("success");
    }
    public void addEntity2(Personne personne) throws SQLException{
        String requete="Insert INTO Personne (nom,prenom) VALUES (?,?)";
        PreparedStatement stmt = MyConnexion.getInstance().getCon().prepareStatement(requete);
        stmt.setString(1,personne.getNom());
        stmt.setString(2,personne.getPrenom());
        stmt.executeUpdate();
        System.out.println("success");
    }

    @Override
    public void removeEntity(Personne entity) throws SQLException {

    }

    @Override
    public void updateEntity(Personne entity) throws SQLException{

    }

    @Override
    public List<Personne> getEntities() throws SQLException{
        List<Personne> personnes=new ArrayList<Personne>();
        String requete="SELECT * From  Personne";
        Statement stmt =MyConnexion.getInstance().getCon().createStatement();
        ResultSet rs=stmt.executeQuery(requete);
        while(rs.next()){
            personnes.add(new Personne(rs.getInt(1),rs.getString(2),rs.getString(3)));
        }
        System.out.println("success");
        return personnes;
    }
}
