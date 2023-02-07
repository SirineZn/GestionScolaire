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
public class Matiere {
  private int Id_mat;
  private String Nom_mat;
  private float note;
  private float coefficient;

  public int getIdMat() {
    return Id_mat;
  }

  public void setIdMat(int Id_mat) {
    this.Id_mat = Id_mat;
  }

  public String getNomMat() {
    return Nom_mat;
  }

  public void setNomMat(String Nom_mat) {
    this.Nom_mat = Nom_mat;
  }

  public float getNote() {
    return note;
  }

  public void setNote(float note) {
    this.note = note;
  }

  public float getCoefficient() {
    return coefficient;
  }

  public void setCoefficient(float coefficient) {
    this.coefficient = coefficient;
  }

  public Matiere(int id_mat, String nom_mat, float note, int coefficient) {
    this.Id_mat = id_mat;
    this.Nom_mat = nom_mat;
    this.note = note;
    this.coefficient = coefficient;
  }

  @Override
  public String toString() {
    return "Matieres[Id_mat=" + Id_mat + ", Nom_mat=" + Nom_mat + ",note=" + note + ",coefficient=" + coefficient + "]";
  }




  Matiere [] tabMatiere   = new Matiere  [50]  ;
public void AjoutMatiere  (Matiere   m ){
  if (existeMatiere(m) ==true){
    tabMatiere [tabMatiere.length] = m;
  }
  else {
    System.out.println("cette Matiere   existe déja");
  }
}
public void deleteMatiere  (Matiere   m){
for (int i=0;i<tabMatiere  .length;i++){
  if (tabMatiere[i]== m ){
    tabMatiere  [i]=tabMatiere  [i+1];
  }
}
}
public boolean existeMatiere  (Matiere m){
boolean existe =false;
for(int i=0;i<=tabMatiere  .length;i++){
  if(tabMatiere  [i].getIdMat()==m.getIdMat()){
    existe=true;
  }
}
return existe;
}
}
