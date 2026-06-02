/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author AN
 */
public class CgAbonnement {

    public static boolean modifierAbonnement(String ancienlibelle, String libelle, String duree, double prix) {
        Connection connex = Bd.connex();
        if (connex != null) {
            String queryM = "UPDATE abonnement SET libelle_abonnement = ?, duree_abonnement = ?, prix_mensuel = ? WHERE libelle_abonnement = ?";
            try (PreparedStatement ps = connex.prepareStatement(queryM)) {
                ps.setString(1, libelle);  // Nouveau libellé
                ps.setString(2, duree);    // Nouvelle durée
                ps.setDouble(3, prix);     // Nouveau prix
                ps.setString(4, ancienlibelle); // Condition WHERE avec l'ancien libellé

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

    public static boolean supprimerAbonnement(String libelle) {
        Connection connex = Bd.connex();
        if (connex != null) {
            String queryS = "DELETE FROM abonnement WHERE libelle_abonnement = ?";
            try (PreparedStatement ps = connex.prepareStatement(queryS)) {
                ps.setString(1, libelle); // Définir le paramètre
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
