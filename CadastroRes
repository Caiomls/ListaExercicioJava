package unipe.br.projeto.java.seguradora;

public class CadastroRes extends PessoaFisica {
	private static final long serialVersionUID = 1L;
	public String endereco;
	public float valorImovel;
	public int zona; //1 - zona Urbana; 2 - zona Suburbana; 3 - zona Rural
	public int tipo; //1 - Apartamento; 2 - Casa
	public float valorSeguroRes;
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getValorSeguroRes() {
		return valorSeguroRes;
	}
	public void setValorSeguroRes(float valorSeguroRes) {
		this.valorSeguroRes = valorSeguroRes;
	}
	
	public float calcularSeguroRes(float valorImovel, int zona, int tipo){
		
		float valorSeguro = 0;
		
		if(zona == 1){
			if(tipo == 2){
				valorSeguro = (valorImovel*2/100) + (valorImovel*1/100) + (valorImovel*5/1000);
			}else{
				valorSeguro = (valorImovel*2/100) + (valorImovel*1/100);
			}
		}
		
		if(zona == 2){
			if(tipo == 2){
				valorSeguro = (valorImovel*2/100) + (valorImovel*5/1000) + (valorImovel*5/1000);
			}else{
				valorSeguro = (valorImovel*2/100) + (valorImovel*5/1000);
			}
		}
		
		if(zona == 3){
			if(tipo == 2){
				valorSeguro = (valorImovel*2/100) + (valorImovel*5/1000);
			}else{
				valorSeguro = (valorImovel*2/100);
			}
		}
		
		
		return valorSeguro;
		
	}
	
}
