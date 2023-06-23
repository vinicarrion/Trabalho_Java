public class Receita {
	private String descricao;
	private double valor;
	private String tpReceita;
     
    
    
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getTpReceita() {
		return tpReceita;
	}


	public void setTpReceita(String tpReceita) {
		this.tpReceita = tpReceita;
	}


 


	@Override
	public String toString() {
		return "Receita [Descricao: " + descricao + ", valor: " + valor + ", Tipo Receita: " + tpReceita+ "]";
	}


	 

	 
	 
	    
	}
