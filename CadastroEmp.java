package unipe.br.projeto.java.seguradora;

public class CadastroEmp extends PessoaJuridica {
	private static final long serialVersionUID = 1L;
	public float valorImovel;
	public int funcionarios;
	public int visitasDiarias;
	public int ramo; //1 - ramo Comercio; 2 - ramo Industria; 3 - ramo Agropecuaria
	public float valorSeguroEmp;
	
	
	public float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	public int getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getVisitasDiarias() {
		return visitasDiarias;
	}
	public void setVisitasDiarias(int visitasDiarias) {
		this.visitasDiarias = visitasDiarias;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo(int ramo) {
		this.ramo = ramo;
	}
	public float getValorSeguroEmp() {
		return valorSeguroEmp;
	}
	public void setValorSeguroEmp(float valorSeguroEmp) {
		this.valorSeguroEmp = valorSeguroEmp;
	} 
	
	public float calcularSeguroEmp(float valorImovel, int funcionarios, int visitasDiarias, int ramo){
		
		float valorSeguro = 0;
		int somaFuncionarios;
		int somaVisitas;
		
		somaFuncionarios = (funcionarios/10);
		somaVisitas = (visitasDiarias/200);
		
		if(ramo == 1){
			valorSeguro = (valorImovel*4/100) + ((somaFuncionarios)*(valorImovel*2/1000)) + ((somaVisitas)*(valorImovel*3/1000)) + (valorImovel*5/1000);
		}
		
		if(ramo == 2){
			valorSeguro = (valorImovel*4/100) + ((somaFuncionarios)*(valorImovel*2/1000)) + ((somaVisitas)*(valorImovel*3/1000)) + (valorImovel*1/100);
		}
		
		if(ramo == 3){
			valorSeguro = (valorImovel*4/100) + ((somaFuncionarios)*(valorImovel*2/1000)) + ((somaVisitas)*(valorImovel*3/1000));
		}
		
		return valorSeguro;
	}
}
