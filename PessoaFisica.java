package unipe.br.projeto.java.seguradora;

public class PessoaFisica extends Cliente{
	private static final long serialVersionUID = 1L;
	public String cpf;
	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
