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
public class Etudiant {
        private String cin;
        private String nom_etud;
        private String prenom_etud;
        private int age;
        private String nom_spec;
        private String email;
        
        public String getCin() {
          return cin;
        }
        
        public void setCin(String cin) {
          this.cin = cin;
        }
        
        public String getNomEtud() {
          return nom_etud;
        }
        
        public void setNomEtud(String nom_etud) {
          this.nom_etud = nom_etud;
        }
        
        public String getPrenomEtud() {
          return prenom_etud;
        }
        
        public void setPrenomEtud(String prenom_etud) {
          this.prenom_etud = prenom_etud;
        }
        
        public int getAge() {
          return age;
        }
        
        public void setAge(int age) {
          this.age = age;
        }
        
        public String getNomSpec() {
          return nom_spec;
        }
        
        public void setNomSpec(String nom_spec) {
          this.nom_spec = nom_spec;
        }
        
        public String getEmail() {
          return email;
        }
        
        public void setEmail(String email) {
          this.email = email;
        }
        
       public Etudiant(String cin, String nom_etud, String prenom_etud, int age, String nom_spec, String email) {
        this.cin = cin;
        this.nom_etud = nom_etud;
        this.prenom_etud = prenom_etud;
        this.age = age;
        this.nom_spec = nom_spec;
        this.email = email;
    }
}

