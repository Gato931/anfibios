package co.edu.uniquindio.poo;

public class Carro implements Terrestre {
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
  public void detenerse() {
      System.out.println("El carro se detiene.");
  }
}
