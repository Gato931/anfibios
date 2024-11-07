package co.edu.uniquindio.poo;

public class Barco implements Acuatico {
  @Override
  public void encender() {
      System.out.println("El barco enciende.");
  }
  @Override
  public void apagar() {
      System.out.println("El barco se apaga.");
  }
}
