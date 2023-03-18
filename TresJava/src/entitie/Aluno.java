package entitie;


public class Aluno {
	
	private String nome;
	private double media;
	private String situacao;
	
	public Aluno() {
	}

	public Aluno(String nome, double media, String situacao) {
		this.nome = nome;
		this.media = media;
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Aluno(a): " + nome + "\n media: " + media + " situacao: "
				+ situacao;
	}
	
	
}
