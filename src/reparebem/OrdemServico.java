package reparebem;
import java.util.ArrayList;
public class OrdemServico {

	
	private String nome;
	private String telefone;
	private String roupa;
	private String status;
	private ArrayList <Reparo> reparos = new ArrayList<>(10);
	
	public OrdemServico(String nome, String telefone, String roupa) {
		this.nome = nome;
		this.telefone = telefone;
		this.roupa = roupa;
		this.status = "Não iniciado";
	
	}
	
	public double calculaPreco() {
		double preco = 0;
		for( Reparo r: reparos) {
			preco += r.getPreco();
		}
		return preco;
	}
	
	public void cadastraServico(Reparo r) {
		reparos.add(r);
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		int tamanho = reparos.size();
		return "Cliente: " + nome + "; Roupa: " + roupa + "; Reparos: " + tamanho + "; total: R$"+ calculaPreco() ;
	}
}
