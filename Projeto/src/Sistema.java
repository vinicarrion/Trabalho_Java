import java.util.Scanner;
import java.util.InputMismatchException;


public class Sistema {
public static void main(String [] args) {
	int option = 0;
	Financas financas = new Financas();
	
	String menuInicio = "-------MENU--------\n"
			+"1 - Despesas\n"
			+"2 - Receitas\n";
	
	String textoMenu ="------------- Despesas -------------\n"
			+ "1 - Adicionar Despesa \n"
			+ "2 - Remover Despesas \n"
			+ "3 - Modificar Despesas \n"
			+ "4 - Listar Despesas \n"
			+ "5 - Procurar Despesas \n" 
			+ "0 - Voltar Menu \n"
			+ "------------------------------------\n";
	
	String textoMenuRec ="------------- Receita -------------\n"
			+ "1 - Adicionar Receita \n"
			+ "2 - Remover Receitas \n"
			+ "3 - Modificar Receitas \n"
			+ "4 - Listar Receitas \n"
			+ "5 - Listar Receita Especifica\n"
			+ "0 - Voltar Menu \n"
			+ "------------------------------------\n";
	
	String textoMenuMod = "--- Modificar Despesas ---\n"
			+ "1 - Modificar Valor \n"
			+ "2 - Modificar Tipo de Despesa \n"
			+ "3 - Incluir Obs \n"
			+ "4 - Modificar tudo e incluir Obs \n"
			+ "------------------------------------\n";
	
	String textoMenuModRec = "--- Modificar Receitas ---\n"
			+ "1 - Modificar Valor \n"
			+ "2 - Modificar Tipo de Receita \n"
			+ "3-  Modificar tudo\n"
			+ "0 - Sair \n"
			+ "------------------------------------\n";
	
	Scanner sc = new Scanner(System.in);		

	do {
try{	 
	System.out.println(menuInicio);   // Menu Despesa
	int optionInicio = sc.nextInt();	
 if(optionInicio == 1) {
	do {
		System.out.println(textoMenu);
		option = sc.nextInt();	
		switch(option) {
		case 1: 
			System.out.println("\n Adicionar Despesa \n");
			Despesa despesa = new Despesa(); 
			System.out.println("Digite a descricao da Despesa");
			despesa.setDescricao(sc.next());
			sc.reset();
		    System.out.println("Digite o valor da Despesa: " + despesa.getDescricao());
		    despesa.setValor(sc.nextDouble());
			sc.reset();
			System.out.println("Digite o tipo da Despesa: " + despesa.getDescricao());
			despesa.setTpDespesa(sc.next());
			sc.reset();
			System.out.println("O tipo de pagamento da Despesa: " + despesa.getDescricao() + " vai ser parcelado ou a vista");
			System.out.println("Digite P para Parcelado ou V para Vista");
	        despesa.setTpPagamento(sc.next());
	            
	        if(despesa.getTpPagamento().equals("P")) {
	        	System.out.println("Digite a Quantidade que vai ser parcelado do Valor Total R$" + despesa.getValor() + "da Despesa: " + despesa.getDescricao());
	            despesa.setQtdParcelas(sc.nextInt());
	            despesa.calcParcela();
	        }
				
	        System.out.println("Digite Sim ou Nao para adicionar Observacao");
	        String addResposta = sc.next();
	        if(addResposta.equals("Sim")) {
	        	System.out.println("Adicionar Observacao");
	        	despesa.setObs(sc.next());
	        }
	        
	        financas.adicionarDespesas(despesa); 
		    System.out.println("\n" + "Despesa " + despesa.getDescricao() + " adicionada com sucesso!" + "\n");
		    break;
		case 2:
			System.out.println("\n Remover Despesa \n");
			Despesa desp_remo = new Despesa();
			System.out.println("Digite a Descricao da Despesa");
			desp_remo.setDescricao(sc.next());
			sc.reset();
			financas.removerDespesas(desp_remo.getDescricao());
			System.out.println("\n" + "Despesa " + desp_remo.getDescricao() + " removida com sucesso!" + "\n");
			financas.listarDespesas();
			break;
		case 3:	 
			System.out.println("\n Modificar Despesa \n");
			Despesa desp_mod = new Despesa();
			System.out.println("Digite a Descricao da Despesa");
			desp_mod.setDescricao(sc.next());
			System.out.println(textoMenuMod);
			option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Digite o valor da Despesa: " + desp_mod.getDescricao());
				desp_mod.setValor(sc.nextDouble());
				sc.reset();
				break;
			case 2:	
				System.out.println("Digite o tipo da Despesa: " + desp_mod.getDescricao());
				desp_mod.setTpDespesa(sc.next());
				sc.reset();
				break;
			case 3: 
				System.out.println("Adicionar Observacao");
				desp_mod.setObs(sc.next());
				sc.reset();
				break;
			case 4:
				System.out.println("Digite o valor da Despesa: " + desp_mod.getDescricao());
				desp_mod.setValor(sc.nextDouble());
				sc.reset();
				System.out.println("Digite o tipo da Despesa: " + desp_mod.getDescricao());
				desp_mod.setTpDespesa(sc.next());
				sc.reset();
				System.out.println("Adicionar Observacao");
				desp_mod.setObs(sc.next());
				sc.reset();
				break;
			}
			financas.modificarDespesas(desp_mod.getDescricao(), desp_mod);
			sc.reset();
		case 4:
			System.out.println("\n Listar Despesas \n");
			financas.listarDespesas();
			break;
		case 5: 
			System.out.println("\n Procurar Despesa \n");
			Despesa proc_desp = new Despesa();
			System.out.println("Digite a descricao para procurar a Despesa");
			proc_desp.setDescricao(sc.next());
			financas.procurarDespesaEsp(proc_desp.getDescricao());
	    case 0:
			break;
		}
	  }while(option != 0);
	}
	if(optionInicio == 2) {
		do {
			
			//Menu Receita
		
		System.out.println(textoMenuRec);
		option = sc.nextInt();
		switch(option) {
		case 1: 
			System.out.println("\n Adicionar Receita \n");
			Receita receita = new Receita(); 
			System.out.println("Digite a descricao da receita");
			receita.setDescricao(sc.next());
			sc.reset();
			System.out.println("Digite o valor da receita: " + receita.getDescricao());
			receita.setValor(sc.nextDouble());
			sc.reset();
			System.out.println("Digite o tipo da receita: " + receita.getDescricao());
			receita.setTpReceita(sc.next());
			sc.reset();
			System.out.println("\n" + "Receita " + receita.getDescricao() + " adicionada com sucesso!" + "\n");
			financas.adicionarReceitas(receita); 
			break;
		case 2:	
			System.out.println("\n Remover Receita \n");
			Receita rec_remo = new Receita();
			System.out.println("Digite a Descricao da Despesa");
			rec_remo.setDescricao(sc.next());
			sc.reset();
			financas.removerDespesas(rec_remo.getDescricao());
			System.out.println("\n" + "Receita " + rec_remo.getDescricao() + " removida com sucesso!" + "\n");
			financas.listarDespesas();
			break;
		case 3:
			System.out.println("\n Modificar Receita \n");
			Receita rec_mod = new Receita();
			System.out.println("Digite a Descricao da Receita");
			rec_mod.setDescricao(sc.next());
			do{
				System.out.println(textoMenuModRec);
				option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Digite o valor da Receita: " + rec_mod.getDescricao());
					rec_mod.setValor(sc.nextDouble());
					sc.reset();
					financas.modificarReceitas(rec_mod.getDescricao(), rec_mod);
					break;
				case 2:	
					System.out.println("Digite o tipo da Receita: " + rec_mod.getDescricao());
					rec_mod.setTpReceita(sc.next());
					sc.reset();
					financas.modificarReceitas(rec_mod.getDescricao(), rec_mod);
					break;
				case 3: 
					System.out.println("Digite o valor da Receita: " + rec_mod.getDescricao());
					rec_mod.setValor(sc.nextDouble());
					sc.reset();
					System.out.println("Digite o tipo da Receita: " + rec_mod.getDescricao());
					rec_mod.setTpReceita(sc.next());
					sc.reset();
					financas.modificarReceitas(rec_mod.getDescricao(), rec_mod);
					break;			
				
				case 0:
					break;
				}
				sc.reset();
			}while(option != 0);
	case 4:
			financas.listarReceitas();
			break;
	case 5: 
		System.out.println("\n Buscar Receita Especifica\n");
		Receita rec_esp = new Receita();
		System.out.println("Digite a Descricao da Receita");
		rec_esp.setDescricao(sc.next());
		sc.reset();
		financas.procurarEspecifica(rec_esp.getDescricao());
		//System.out.println("\n" + "Receita " + rec_esp.toString() + " listada com sucesso!" + "\n"); 
		 
		break;
	case 0:
		}}while(option !=0);
		
	}
	    }catch(InputMismatchException Ie) {
			System.out.println("Digite apenas valores numericos!");
	    }
	}while(option == 0);
	System.out.println(menuInicio);
}
	
}