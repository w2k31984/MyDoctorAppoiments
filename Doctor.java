
import java.util.Scanner;

public class Doctor {
  // Atributos
  static int id = 0; // Autoincrementable
 // int id = 0;
  String name;
  String speciality;

   /*public Doctor() {
    System.out.println("Construyendo el Objeto Doctor");
    id++;
  }
  public  Doctor() {
    this.name = "Nombre por defecto";
    this.speciality = "Especialidad por defecto";
  }*/

  public  Doctor(String name,String speciality) {
    System.out.println("El nombre del Doctor asignado es: " + name);
    id++;
    this.name = name;
    this.speciality = speciality;
  }
    
   
  // Comportamientos
  public void showName() {
    System.out.println(name);
  }

  // MUestra el Id actualizado
  public void showId() {
    System.out.println("ID Doctor :" + " " + id);
  }

}
