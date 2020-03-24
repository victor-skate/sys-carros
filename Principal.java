package br;

public class Principal {

	
	public static void main(String[] args) {	
		Carro[] lista = new Carro[10];
		while(true) {
			int op = Teclado.lerInt("(1)Criar (2)Consultar (3)Sair");
			switch (op) {
			case 1:
				String marca = Teclado.lerString("Digite a marca:");
				String placa = Teclado.lerString("Digite a placa:");
				Carro c = new Carro(marca, placa);
				for (int i = 0; i < lista.length; i++) {
					if(lista[i]==null) {
						lista[i] = c;
						break;
					}
				}
				break;
			case 2:
				for (int i = 0; i < lista.length; i++) {
					if(lista[i]!=null) {
						System.out.println(lista[i].verInfo());
					}
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
			
		}
		
	}
}
