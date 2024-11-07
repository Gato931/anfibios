package co.edu.uniquindio.poo;

public class Avion extends Vehiculo implements Aereo {
  @Override
  public void encender() {
      System.out.println("El avión está encendido.");
  }

  @Override
  public void apagar() {
      System.out.println("El avión está apagado.");
  }

  @Override
  public void despegar() {
      System.out.println("El avión despega.");
  }

  @Override
  public void aterrizar() {
      System.out.println("El avión aterriza.");
  }
}