package edu.connexion3A7.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface Iservice <T>
{
 void addEntity(T entity )throws SQLException;
 void removeEntity(T entity) throws SQLException;
 void updateEntity(T entity)  throws SQLException;
List<T> getEntities() throws SQLException;




}
