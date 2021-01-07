
import java.util.Scanner;

public class Doctor {
  // Atributos
  static int id = 0; // Autoincrementable
 // int id = 0;
  String name;
  String speciality;

  Doctor() {
    System.out.println("Construyendo el Objeto Doctor");
    id++;
  }

  Doctor(String name) {
    System.out.println("El nombre del Doctor asignado es: " + name);
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
