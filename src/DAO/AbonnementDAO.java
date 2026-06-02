/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerùain
 */
public class AbonnementDAO {
     public static boolean ajouterAbonnement(String libelle, String dure, String prix) {
        //Connection conn = Bd.getConnection();
        Connection conn =  Bd.connex();
        if (conn == null) {
            System.out.println("connexion echouer !") ;
            return false; // Si la connexion échoue
            
        }

        String insert = "INSERT INTO abonnement (libelle_abonnement, duree_abonnement,  prix_mensuel) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, libelle);
            ps.setString(2, dure);
            ps.setString(3, prix);
           
            
            int rowsInserted = ps.executeUpdate();
            ps.close();
            conn.close();
            
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
}
