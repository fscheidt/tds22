package entidades;

public class Veiculo {
	// Atributos
	String cor; // branco, azul,...
	String fabricante; // ford, vw, 
	Integer ano; // 2022, 1999
	String modelo; // Gol, Uno, Palio
	String placa; // AAA-2929, AAA-AAAA
	Integer velocidade = 0;
	
	// Comportamentos (mundo java eh um método)
	void travar(){
		System.out.println("Portas travadas!");
	}
	void buzinar(){
		System.out.println("Buzina acionada");
	}
	void acelerar(){
		System.out.println("Pisar no acelerador");
		// aqui o atributo velocidade é modificado
		velocidade += 1;
	}
	void freiar(){
		System.out.println("Pisar no freio");
		velocidade -= 1;
	}
	void ligar(){
		System.out.println("Acionar ignição");
	}
				
	public static void main(String[] args) {
		Veiculo gol = new Veiculo();
		gol.ligar();
		gol.acelerar();
		gol.freiar();		
	}
	
	
	
}
