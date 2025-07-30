	package reparebem;

import java.util.Objects;

public class Reparo {

	private String identificador;
	private String descricao;
	private double preco;
	
	public Reparo(String identificador, String descricao, double preco) {
		this.identificador = identificador;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reparo other = (Reparo) obj;
		return Objects.equals(identificador, other.identificador);
	}
	
	@Override
	public String toString() {
		return "id: " + identificador + "; Descrição:" + descricao + "; Preço: R$"+preco;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
