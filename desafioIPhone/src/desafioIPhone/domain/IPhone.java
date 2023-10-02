package desafioIPhone.domain;

import java.util.Objects;

public class IPhone implements ReprodutorMusical, Telefone, Navegador {

	private Long id;
	private String modelo;
	private String tela;
	private String memoria;
	private String camera;

	public IPhone() {
	}

	public IPhone(Long id, String modelo, String tela, String memoria, String camera) {
		this.id = id;
		this.modelo = modelo;
		this.tela = tela;
		this.memoria = memoria;
		this.camera = camera;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");

	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");

	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");

	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música");

	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");

	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPhone other = (IPhone) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "IPhone [id=" + id + ", modelo=" + modelo + ", tela=" + tela + ", memoria=" + memoria + ", camera="
				+ camera + "]";
	}

}
