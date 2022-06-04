package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo {
	private String nivel;

	public Desafio() {
	}

	public Desafio(String titulo, String descricao) {
		super(titulo, descricao);
		this.nivel = "basico";
	}

	public Desafio(String titulo, String descricao, String nivel) {
		super(titulo, descricao);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Desafio [nivel=" + nivel + "]";
	}

	@Override
	public double calcularXp() {
		if (nivel == "intermediario")
			return XP_PADRAO + 30d;

		if (nivel == "avancado")
			return XP_PADRAO + 50d;

		return XP_PADRAO + 10d;
	}

}
