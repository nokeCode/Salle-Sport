/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import com.raven.model.StatusType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerùain
 */
public class Affichage {
     public static List<Object[]> getAbonnes() {
        List<Object[]> abonnes = new ArrayList<>();
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String queryAbonne = "SELECT nom_abonne, prenom_abonne, date_inscription, numero_telephone, statut_souscription FROM abonne";
                
                PreparedStatement ps = connex.prepareStatement(queryAbonne);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String nom = rs.getString("nom_abonne");
                    String prenom = rs.getString("prenom_abonne");
                    String dateInscription = rs.getString("date_inscription");
                    String numeroTelephone = rs.getString("numero_telephone");
                    String statutSouscription = rs.getString("statut_souscription");

                    // Convertir "OUI" ou "NON" en StatusType.OUI ou StatusType.NON
                    StatusType statut = statutSouscription.equals("OUI") ? StatusType.OUI : StatusType.NON;

                    // Ajouter les données à la liste
                    abonnes.add(new Object[]{nom, prenom, dateInscription, numeroTelephone, statut});
                }
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
        return abonnes;
    }
     
    public static List<Object[]> getAbonnement() {
        List<Object[]> abonnements = new ArrayList<>();
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String queryAbonnement = "SELECT libelle_abonnement, duree_abonnement, prix_mensuel FROM abonnement";
               
                PreparedStatement ps = connex.prepareStatement(queryAbonnement);
               
                ResultSet rs = ps.executeQuery();
               
                while (rs.next()) {
                    String libelle = rs.getString("libelle_abonnement");
                    int duree = rs.getInt("duree_abonnement");
                    double prixMensuel = rs.getDouble("prix_mensuel");

                    // Ajouter les données à la liste
                    abonnements.add(new Object[]{libelle, duree, prixMensuel});
                }
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
        return abonnements;
    }
    //
     public static List<Object[]> getnom() {
        List<Object[]> nom_pre = new ArrayList<>();
        Connection connex = Bd.connex();
        if (connex != null) {
            try {
                String querynom = "SELECT nom_abonne,  FROM abonnes";
                
                PreparedStatement ps = connex.prepareStatement(querynom);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String nom = rs.getString("nom_abonne");
                    String prenom = rs.getString("prenom_abonne");
                    // Ajouter les données à la liste
                    nom_pre.add(new Object[]{nom, prenom});
                }
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
        return nom_pre;
    }
}
