package co.edu.uniquindio.poo;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {
	@Override
	public void encender() {
			System.out.println("El vehículo anfibio está encendido.");
	}

	@Override
	public void apagar() {
			System.out.println("El vehículo anfibio está apagado.");
	}

	@Override
	public void avanzar() {
			System.out.println("El vehículo anfibio avanza en tierra.");
	}

	@Override
	public void retroceder() {
			System.out.println("El vehículo anfibio retrocede en tierra.");
	}

	@Override
	public void girar() {
			System.out.println("El vehículo anfibio gira en tierra.");
	}

	@Override
	public void detener() {
			System.out.println("El vehículo anfibio se detiene en tierra.");
	}
}