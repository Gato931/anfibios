package co.edu.uniquindio.poo;

public class App {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.encender();
		carro.avanzar();
		carro.detener();
		carro.apagar();

		Barco barco = new Barco();
		barco.encender();

		barco.apagar();

		Avion avion = new Avion();
		avion.encender();
		avion.despegar();
		avion.aterrizar();
		avion.apagar();

		Anfibio anfibio = new Anfibio();
		anfibio.encender();
		anfibio.avanzar();
		anfibio.detener();
		anfibio.apagar();
	}
}