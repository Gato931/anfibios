package co.edu.uniquindio.poo;

public class Barco extends Vehiculo implements Acuatico {
  @Override
  public void encender() {
      System.out.println("El barco está encendido.");
  }

  @Override
  public void apagar() {
      System.out.println("El barco está apagado.");
  }
}