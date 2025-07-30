package reparebem;
import java.util.*;

public class RepareBem {

	private ArrayList <OrdemServico> OrdensServico = new ArrayList<>(500);
	private HashMap <String, Reparo> reparos = new HashMap <>(100);
	
	public RepareBem() {
		
	}
	
	public void cadastraReparo(String id, String descricao, double preco) {
		Reparo reparo = new Reparo(id, descricao, preco);
		reparos.put(id, reparo);
	}
	
	public void reajustaPrecoReparo(String idReparo, double percentual) {
		double novoPreco = reparos.get(idReparo).getPreco() + reparos.get(idReparo).getPreco() * percentual/100;
		reparos.get(idReparo).setPreco(novoPreco);
	}
	
	public int cadastrarOrdemDeServico(String cliente , String telefone, String roupa) {
		OrdemServico ordem = new OrdemServico(cliente, telefone, roupa);
		OrdensServico.add(ordem);
		return OrdensServico.indexOf(ordem);
	}
	
	public String exibirOrdemServico(int idOs) {
		return OrdensServico.get(idOs).toString();
	}
	
	public void incluirReparoOrdemDeServico(int idOS, String idReparo) {
		OrdensServico.get(idOS).cadastraServico(reparos.get(idReparo));
	}
	
	public void mudarStatusOrdemDeServico(int idOs, String status) {
		OrdensServico.get(idOs).setStatus(status);
	}
	
	public double obterValorOrdemDeServico(int idOs) {
		return OrdensServico.get(idOs).calculaPreco();
	}
	
	public String listarOrdemDeServico(String status) {
		String lista = "";
		for (OrdemServico o: OrdensServico) {
			if( o.getStatus() == status) {
				lista += o.toString() + "\n";
			}
		}
		
		return lista;
	}
	
	public String listarOrdensDeServico() {
		
		String lista = "";
		for (OrdemServico o: OrdensServico) {	
				lista += "#"+ OrdensServico.indexOf(o)+" " + o.toString() + "\n";	
		}
		
		return lista;
	}
	
	
	
}
