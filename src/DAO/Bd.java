/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.Bd.connex;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerùain
 */
public class Bd {
    
    public static Connection connex(){
        String url = "jdbc:mysql://localhost:3306/salle_sport";// Connexion a la base de donnée
        String login = "root"; // nom utilisqateur
        String passwd = ""; // le mot de passe s'il y en a mais par def aut ces ""
        java.sql.Connection connex = null; // Connection est de la bibliotheque java.sql.Connection il vas contenir la Connexion pour la base de donnée
        try {
            connex = DriverManager.getConnection(url, login, passwd);
            //return connex;
        } catch (SQLException ex) {
            Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Connection) connex;
    }

   
}
