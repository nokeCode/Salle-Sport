/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Gerùain
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AbonneDAO {
    public static boolean ajouterAbonne(String nom, String prenom,String numTel, String statut) {
        //Connection conn = Bd.getConnection();
        Connection conn =  Bd.connex();
        if (conn == null) {
            System.out.println("connexion echouer !") ;
            return false; // Si la connexion échoue
            
        }

        String insert = "INSERT INTO abonne (nom_abonne, prenom_abonne,  numero_telephone, statut_souscription) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            //ps.setString(3, dateInscript);
            ps.setString(3, numTel);
            int statutValue = statut.equalsIgnoreCase("OUI")?1 : 0;
            ps.setInt(4, statutValue);
            
            int rowsInserted = ps.executeUpdate();
            ps.close();
            conn.close();
            
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //pour modifier les abonnés
    public static void updateStatut(String nom, String prenom) {
        com.mysql.jdbc.Connection con = Bd.connex();
        String query = "UPDATE abonnes SET statut = 'OUI' WHERE nom = ? AND prenom = ?";
        
        try  {
            java.sql.PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //pour supprimer les abonnés
    public static void deleteAbonne(String nom, String prenom) {
        com.mysql.jdbc.Connection con = Bd.connex();
        String query = "DELETE FROM abonnes WHERE nom = ? AND prenom = ?";
        
        try {
            java.sql.PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nom);
            pst.setString(2, prenom);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
