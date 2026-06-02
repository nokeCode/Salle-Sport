/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author AN
 */
public class SiginDAO {
    public static boolean verifierUtilisateur(String nom, String motDePasse) {
        Connection con = Bd.connex();
        String sql = "SELECT * FROM utilisateur WHERE nom_user = ? AND mot_de_passe_user = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, motDePasse);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return true; // Utilisateur trouvé
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false; // Identifiants incorrects
    }
}
