package co.edu.uniquindio.poo;

public class Anfibio implements Terrestre, Acuatico {
  @Override
  public void avanzar() {
      System.out.println("El anfibio avanza en tierra.");
  }
  @Override
  public void retroceder() {
      System.out.println("El anfibio retrocede en tierra.");
  }
  @Override
  public void girar() {
      System.out.println("El anfibio gira en tierra.");
  }
  @Override
  public void detenerse() {
      System.out.println("El anfibio se detiene en tierra.");
  }
  @Override
  public void encender() {
      System.out.println("El anfibio enciende en agua.");
  }
  @Override
  public void apagar() {
      System.out.println("El anfibio se apaga en agua.");
  }
}
