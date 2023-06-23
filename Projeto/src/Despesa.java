public class Despesa implements Parcelas{
	private String descricao;
	private double valor;
	private String tpDespesa;
    private String TpPagamento;
    private int qtdParcelas;
    private double valoresParcelas;

	private String obs;

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

	public String getTpDespesa() {
		return tpDespesa;
	}

	public void setTpDespesa(String tpDespesa) {
		this.tpDespesa = tpDespesa;
	}
	
	public String getTpPagamento() {
		return TpPagamento;
	}

	public void setTpPagamento(String tpPagamento) {
		TpPagamento = tpPagamento;
	}
	
	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
	 public double getValoresParcelas() {
			return valoresParcelas;
	}

    public void setValoresParcelas(double valoresParcelas) {
			this.valoresParcelas = valoresParcelas;
    }
	
	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public void calcParcela() {
		valoresParcelas = valor / qtdParcelas;
	}
	
	@Override
	public String toString() {
		return "\n" +
			   " \t Despesas \t" +
	           "\n Descricao: " + descricao + 
	           "\n Valor: " + valor + 
	           "\n Tipo Despesa: " + tpDespesa + 
		       "\n Tipo de Pagamento: " + TpPagamento +
		       "\n Quantidade de Parcelas " + qtdParcelas +
		       "\n Valores da Parcelas " + valoresParcelas +
		       "\n Obs: " + obs;
	}
	
}