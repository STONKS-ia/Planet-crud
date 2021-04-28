package model;

public class Planetas {

	//atributos
	private int id;
	private String nome;
	private String tamanho;
	private String tipoPlaneta;
	private String velocidadeRotacao;
	private String velocidadeTranslacao;
	private String galaxia;
	
	
	//construtor
	public Planetas( String nome, String tamanho, String tipoPlaneta,
			String velocidadeRotacao, String velocidadeTranslacao, String galaxia) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.tipoPlaneta = tipoPlaneta;
		this.velocidadeRotacao = velocidadeRotacao;
		this.velocidadeTranslacao = velocidadeTranslacao;
		this.galaxia = galaxia;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	public String getTipoPlaneta() {
		return tipoPlaneta;
	}



	public void setTipoPlaneta(String tipoPlaneta) {
		this.tipoPlaneta = tipoPlaneta;
	}





	public String getVelocidadeRotacao() {
		return velocidadeRotacao;
	}



	public void setVelocidadeRotacao(String velocidadeRotacao) {
		this.velocidadeRotacao = velocidadeRotacao;
	}



	public String getVelocidadeTranslacao() {
		return velocidadeTranslacao;
	}



	public void setVelocidadeTranslacao(String velocidadeTranslacao) {
		this.velocidadeTranslacao = velocidadeTranslacao;
	}



	public String getGalaxia() {
		return galaxia;
	}



	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}
	
	
	

}
