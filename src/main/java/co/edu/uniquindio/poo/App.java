package co.edu.uniquindio.poo;

public class App {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Barco barco = new Barco();
		Avion avion = new Avion();
		Anfibio anfibio = new Anfibio();

		System.out.println("Pruebas de Carro:");
		carro.avanzar();
		carro.retroceder();
		carro.girar();
		carro.detenerse();

		System.out.println("\nPruebas de Barco:");
		barco.encender();
		barco.apagar();

		System.out.println("\nPruebas de Avión:");
		avion.despegar();
		avion.aterrizar();

		System.out.println("\nPruebas de Anfibio:");
		anfibio.avanzar();
		anfibio.retroceder();
		anfibio.girar();
		anfibio.detenerse();
		anfibio.encender();
		anfibio.apagar();
	}
}