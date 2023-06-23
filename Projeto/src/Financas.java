import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Financas {
	private ArrayList<Despesa> listaDespesas = new ArrayList<>();
	private ArrayList<Receita> listaReceitas = new ArrayList<>();
	private double totalDespesas = 0;
	private double totalReceita  = 0;
	
	//Metodos de Despesa

	public ArrayList<Despesa> getListaDespesas() {
		return listaDespesas;
	}

	public void setListaDespesas(ArrayList<Despesa> listaDespesas) {
		this.listaDespesas = listaDespesas;
	}
	
	public void adicionarDespesas(Despesa desp) {
		listaDespesas.add(desp);
	}
	
	public void removerDespesas(String descricao) {
		Despesa despesaRemover = null;
		for (Despesa despesa : listaDespesas) {
	        if (despesa.getDescricao().equals(descricao)) {
	            despesaRemover = despesa;
	            break;
	        }
	    }

	    if (despesaRemover != null) {
	        listaDespesas.remove(despesaRemover);
	    }

	}
	
	public void modificarDespesas(String descricao, Despesa desp_mod) {
		for(int i = 0; i < listaDespesas.size(); i++) {
			Despesa despesa = listaDespesas.get(i);
			if(despesa.getDescricao().equals(descricao)) {
				listaDespesas.set(i, desp_mod);
			}
		}
	}
	
	public ArrayList<Despesa> procurarDespesas(String descricao) {
		ArrayList<Despesa> despesaEncontrada = new ArrayList<>();
		for(Despesa despesa : listaDespesas) {
			if(despesa.getDescricao().equals(descricao)) {
				despesaEncontrada.add(despesa);
			}
		}
		return despesaEncontrada;
	}
	
	public void listarDespesas() {
		for(Despesa desp : listaDespesas) {
			System.out.println(desp.toString());
			totalDespesas = totalDespesas + desp.getValor();
		}
		System.out.println(" \n Valor Total das Despesas: " + totalDespesas );
	}
	
	public void procurarDespesaEsp(String descricao) {
	    for (Despesa despesa : listaDespesas) {
	        if (despesa.getDescricao().equals(descricao)) {
	            System.out.println(despesa.toString());
	            return;
	        }
	    }
	    System.out.println("Despesa nao encontrada com a descricao: " + descricao);
	}
	
	
	@Override
	public String toString() {
		return " \t Financas \t" + 
	           "\n Lista Despesas" + listaDespesas;
	}
	
	
	//Metodos de Recieita
	
	public ArrayList<Receita> getListaReceitas() {
		return listaReceitas;
	}
	public void setListaReceitas(ArrayList<Receita> listaReceitas) {
		this.listaReceitas = listaReceitas;
	}
	public void adicionarReceitas(Receita rec) {
		listaReceitas.add(rec);
	}
	public void removerReceitas(String descricao) {
		Receita receitaRemover = null;
		for (Receita receita : listaReceitas) {
	        if (receita.getDescricao().equals(descricao)) {
	            receitaRemover = receita;
	            break;
	        }
	    } 

    if (receitaRemover != null) {
        listaReceitas.remove(receitaRemover);
    }

}
	public void modificarReceitas(String descricao, Receita rec_mod) {
	for(int i = 0; i < listaReceitas.size(); i++) {
		Receita receita = listaReceitas.get(i);
		if(receita.getDescricao().equals(descricao)) {
			listaReceitas.set(i, rec_mod);
		}
	}
}
	public ArrayList<Receita> procurarReceitas(String descricao) {
		ArrayList<Receita> receitaEncontrada = new ArrayList<>();
		for(Receita receita : listaReceitas) {
			if(receita.getDescricao().equals(descricao)) {
				receitaEncontrada.add(receita);
			}
		}
		return receitaEncontrada;
	}
	
	public void listarReceitas() {
		for(Receita rec : listaReceitas) {
			System.out.println(rec.toString());
			totalReceita = totalReceita + rec.getValor();
		}
	}
	 
	public void procurarEspecifica(String descricao) {
		for(Receita receita : listaReceitas) {
			if(receita.getDescricao().equals(descricao)) {
				System.out.println(listaReceitas.toString());
				return;
			}
			
		}
				
	 
	}	
}
