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

  public Specialite(int id_spec, String nom_spec, String[] tab_matieres) {
    this.Id_spec = id_spec;
    this.nom_spec = nom_spec;
    this.tab_matieres = tab_matieres;
  }

  @Override
  public String toString() {
    return "Specialité[Id_spec=" + Id_spec + ", nom_spec=" + nom_spec + ",tab_matieres=" + tab_matieres + "]";
  }
  Specialite [] tabSpecialite  = new Specialite  [10]  ;




public void AjoutSpecialite  (Specialite  s ){
  if (existeSpecialite(s) ==false){
    tabSpecialite [tabSpecialite.length]= s;
  }
  else {
    System.out.println("ce Specialite  existe déja");
  }
   




}
public void deleteSpecialite (Specialite  s){
for (int i=0;i<tabSpecialite .length;i++){
  if (tabSpecialite[i]== s ){
    tabSpecialite [i]=tabSpecialite [i+1];
  }
}

}
public boolean existeSpecialite (Specialite s){
  boolean existe =false;
  for(int i=0;i<=tabSpecialite .length;i++){
    if(tabSpecialite [i].getIdSpec()==s.getIdSpec()){
      existe=true;
    }
    
  }
  return existe;
}}  
