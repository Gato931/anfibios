package co.edu.uniquindio.poo;

public class Avion implements Aereo {
  @Override
  public void despegar() {
      System.out.println("El avión despega.");
  }
  @Override
  public void aterrizar() {
      System.out.println("El avión aterriza.");
  }
}