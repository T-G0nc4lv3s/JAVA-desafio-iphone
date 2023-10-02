package desafioIPhone;

import desafioIPhone.domain.IPhone;

public class Main {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		iphone.setId(1L);
		iphone.setModelo("Iphone 14 Pro");
		iphone.setMemoria("1 TB");
		iphone.setTela("Super Retina XDR de 6,1 polegadas");
		iphone.setCamera("Câmera grande-angular de 48 MP para resolução até 4x maior");
		
		System.out.println(iphone);
		System.out.println("\n Funções de telefone \n");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		System.out.println("\n Funções de reprodutor musical \n");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		System.out.println("\n Funções de navegador \n");
		iphone.exibirPagina();
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}

}
