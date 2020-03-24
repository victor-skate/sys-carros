

public class Principal{
	static Carro[] lista = new Carro[10];
	
		public static void cadastrar(){
			String marca = Teclado.lerString("digite a marca:");
			String placa = Teclado.lerString("digite a placa:");
			Carro carro = new Carro(marca,placa);
			for (int i = 0; i < lista.length; i++){
				if(lista[i]==null){
					lista[i]=carro;
					break;
				}
			}
		System.out.println("cadastrado com sucesso");
		menu();
		}
		
		public static void consultar(){
			for (int i = 0; i < lista.length; i++){
				if(lista[i]!=null){
					System.out.println(lista[i].verInfo());
				}
			}
		menu();
		}
		
		public static void acelerar(){
			String placa = Teclado.lerString("placa:");
			for (int i = 0; i < lista.length; i++){
				if(lista[i]!=null && lista[i].getPlaca()==placa){
					System.out.println("www");
					lista[i].acelerar();
				}
			}
		System.out.println("rasgando o asfalto");	
		menu();
		}
		
		public static void main (String[]args){
			menu();
			
		}

		private static void menu() {
			int op = Teclado.lerInt("(1)cadastrar (2)consultar (3)acelerar (4)sair");
			switch (op){
			case 1:
				cadastrar();
				break;
			
			case 2:
				consultar();
				break;
			
			case 3:
				acelerar();
				break;
				
			case 4:
				System.exit(0);
				break;
			}
			
		}
}
