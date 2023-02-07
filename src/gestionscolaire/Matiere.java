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
}
