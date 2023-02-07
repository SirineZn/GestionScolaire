/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionscolaire;

/**
 *
 * @author sirine
 */
public class Specialite {
    private int Id_spec;
    private String nom_spec;
    private String[] tab_matieres;
    
    public int getIdSpec() {
      return Id_spec;
    }
    
    public void setIdSpec(int Id_spec) {
      this.Id_spec = Id_spec;
    }
    
    public String getNomSpec() {
      return nom_spec;
    }
    
    public void setNomSpec(String nom_spec) {
      this.nom_spec = nom_spec;
    }
    
    public String[] getTabMatieres() {
      return tab_matieres;
    }
    
    public void setTabMatieres(String[] tab_matieres) {
      this.tab_matieres = tab_matieres;
    }
}
