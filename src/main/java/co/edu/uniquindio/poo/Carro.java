package co.edu.uniquindio.poo;

public class Carro extends Vehiculo implements Terrestre {
  @Override
  public void encender() {
      System.out.println("El carro está encendido.");
  }

  @Override
  public void apagar() {
      System.out.println("El carro está apagado.");
  }

  @Override
  public void avanzar() {
      System.out.println("El carro avanza.");
  }

  @Override
  public void retroceder() {
      System.out.println("El carro retrocede.");
  }

  @Override
  public void girar() {
      System.out.println("El carro gira.");
  }

  @Override
  public void detener() {
      System.out.println("El carro se detiene.");
  }
}