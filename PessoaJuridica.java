
package unipe.br.projeto.java.seguradora;

public class PessoaJuridica extends Cliente{
	private static final long serialVersionUID = 1L;
	public String cnpj;
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
