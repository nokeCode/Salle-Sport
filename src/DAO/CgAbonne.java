/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author AN
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CgAbonne {
   public static boolean modifierAbonne(String nom, String prenom, String numeroTelephone, String statut, String ancienNumeroTelephone) {
    Connection connex = Bd.connex();
    if (connex != null) {
        try {
            String query = "UPDATE abonne SET nom_abonne = ?, prenom_abonne = ?, numero_telephone = ?, statut_souscription = ? WHERE numero_telephone = ?";
            PreparedStatement ps = connex.prepareStatement(query);
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, numeroTelephone);
            ps.setString(4, statut);
            ps.setString(5, ancienNumeroTelephone);
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                connex.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    return false;
}

    public static boolean supprimerAbonne(String numeroTelephone) {
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String query = "DELETE FROM abonnes WHERE numero_telephone = ?";
                PreparedStatement ps = connex.prepareStatement(query);
                ps.setString(1, numeroTelephone);
                int rowsDeleted = ps.executeUpdate();
                return rowsDeleted > 0;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    connex.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return false;
    }
}
