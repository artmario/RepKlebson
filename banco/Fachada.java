public class Fachada {

	IMPLEMENTAÇÃO DO METODO SINGLETON

	private CadastroContas contas;
	private CadastroCliente clientes;
	private static Fachada instance;
	
	public Fachada (){
		IRepositorioContas repositorioContas = new RepositorioContasArray();
		contas = new CadastroContas(repositorioContas);
		IRepositorioClientes repositorioClientes = new RepositorioClientesArray();
		clientes = new CadastroClientes(repositorioClientes);
	}

	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}



	public void inserir(Cliente cliente){
		this.clientes.cadastrar(cliente);
	}


	public void inserir(Conta conta) {
		this.contas.cadastrar(conta);
	}

	public Conta procurar(String numero){
		return this.contas.procurar(numero);
	}

	public void remover (String numero){
		this.conta.remover(numero);
	}
}

 …









public class CadastroConta{
	//ESSA CLASSE TERA AS VALIDACOES.

	private IRepositorioConta contas;

	public CadastroConta(IReporitorioconta repositorio){
		this.contas = repositorio;
	}

	public void cadastrar(ContaAbstrata conta) {
		if(conta != null){
			if(!(contas.existe(conta.getNumero()))){
				contas.inserir(conta);
			}else
				syso(“CONTA JA CADASTRADA”);
		}else
			syso(“CONTA INVALIDA”);
	}

	public Conta procurar(String numero){
	   return	this.contas.procurar(numero)
     }

	public void remover (String numero) {
		//COLOCAR VALIDACAO E REGRA DE NEGOCIO
		this.contas.remover(numero);
	}
	
	public void atualizar(ContaAbstrata conta) {
		//COLOCAR VALIDACAO E REGRA DE NEGOCIO
		this.contas.atualizar(conta);
	}

}



