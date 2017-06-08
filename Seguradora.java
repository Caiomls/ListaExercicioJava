package unipe.br.projeto.java.seguradora;

import java.util.*;

public class Seguradora {
	
	public static void imprimeMenu(){
		System.out.println("\n--- SEGURADORA DE IMOVEIS - HAC ---\n");
		System.out.println("1 - Cadastrar Pessoa Fisica");
		System.out.println("2 - Cadastrar Pessoa Juridica");
		System.out.println("3 - Listar Cliente");
		System.out.println("4 - Listar Contrato");
		System.out.println("5 - Gravar em Arquivo");
		System.out.println("6 - Ler do Arquivo");
		System.out.println("0 - Sair\n");
		
		System.out.println("Entre com uma opcao: ");
	}
	
	public static int tipoCliente(int opt){
		
		Scanner scan = new Scanner(System.in);
		
		
		scan.close();
		return opt;
	}

	public static void main(String[] args) {
		
		ArrayList<Cliente>  listaClienteJ  = new ArrayList<Cliente>();
        ArrayList<Cliente>  listaClienteF  = new ArrayList<Cliente>();
        ArrayList<CadastroRes>  listaCadastroR  = new ArrayList<CadastroRes>();
        ArrayList<CadastroEmp>  listaCadastroE  = new ArrayList<CadastroEmp>();
        
        Grava grava = new Grava();


		Scanner scan = new Scanner(System.in);
		
		int opcao = 10;
		
		while (opcao != 0){
			imprimeMenu();
			try{
			opcao = scan.nextInt();
			scan.nextLine();
			}catch(java.util.InputMismatchException e){
				scan.nextLine();
				System.out.println("Apenas valores numericos!");
			}
			switch(opcao){
				
				case 1:{
					Cliente clienteF = new Cliente();
					CadastroRes cadRes = new CadastroRes();
					cadRes.valorImovel = -1;
						
					System.out.println("Digite o nome: ");
					clienteF.nome = scan.nextLine();
					clienteF.setNome(clienteF.nome);
					System.out.println("Nome " + clienteF.getNome());
						
					System.out.println("Digite o CPF (apenas os numeros): ");
					cadRes.cpf = scan.nextLine();
					cadRes.setCpf(cadRes.cpf);
					System.out.println("CPF " + cadRes.getCpf());
					
					System.out.println("Digite o endereco da residencia: ");
					cadRes.endereco = scan.nextLine();
					cadRes.setEndereco(cadRes.endereco);
					System.out.println("Endereco " + cadRes.getEndereco());
					
					System.out.println("Digite o valor do Imovel: ");
					while(cadRes.valorImovel <= 0.0){
						try{
							cadRes.valorImovel = scan.nextFloat();
							scan.nextLine();
							if (cadRes.valorImovel <= 0){
								System.out.println("Apenas valores positivos!");
							}
						}catch (java.util.InputMismatchException e){
							scan.nextLine();
							System.out.println("Apenas valores numericos!");
						}
					}
					cadRes.setValorImovel(cadRes.valorImovel);
					System.out.println("Valor " + cadRes.getValorImovel());
					
					System.out.println("Digite o numero correspondente a zona na qual esta localizada a residencia, Urbana[1], Suburbana[2] ou Rural[3]? ");
					while(cadRes.zona < 1 || cadRes.zona >3 ){
						try{
							cadRes.zona = scan.nextInt();
							scan.nextLine();
						}catch(java.util.InputMismatchException exception){
							scan.nextLine();
						}
						if ((cadRes.zona == 1) || (cadRes.zona ==2) || (cadRes.zona ==3)){
							break;
						}
						if ((cadRes.zona !=1) && (cadRes.zona !=2) && (cadRes.zona !=3)){
							System.out.println("Opcao invalida, por favor escolher entre 1, 2 e 3.");
							
						}
					}
					cadRes.setZona(cadRes.zona);
					System.out.println("Zona " + cadRes.getZona());
					
					System.out.println("Digite o numero correspondente ao tipo de residencia, Apartamento[1]ou Casa[2]? ");
					while(cadRes.tipo < 1 || cadRes.tipo >2 ){
						try{
							cadRes.tipo = scan.nextInt();
							scan.nextLine();
						}catch(java.util.InputMismatchException exception){
							scan.nextLine();
						}
						if ((cadRes.tipo == 1) || (cadRes.tipo ==2)){
							break;
						}
						if ((cadRes.tipo !=1) && (cadRes.tipo !=2)){
							System.out.println("Opcao invalida, por favor escolher entre 1 e 2.");
							
						}
					}
					cadRes.setTipo(cadRes.tipo);
					System.out.println("Tipo " + cadRes.getTipo());
					
					cadRes.valorSeguroRes = cadRes.calcularSeguroRes(cadRes.getValorImovel(), cadRes.getZona(),cadRes.getTipo());
					cadRes.setValorSeguroRes(cadRes.valorSeguroRes);
					System.out.println("Valor do Seguro R$" + cadRes.getValorSeguroRes());
					
					listaClienteF.add(clienteF);
					listaCadastroR.add(cadRes);
					
					
				
					break;
				}
				
				case 2:{

					Cliente clienteJ = new Cliente();
					CadastroEmp cadEmp = new CadastroEmp();
					cadEmp.valorImovel = -1;
					cadEmp.funcionarios = -1;
					cadEmp.visitasDiarias = -1;
					
					System.out.println("Digite o nome: ");
					clienteJ.nome = scan.nextLine();
					clienteJ.setNome(clienteJ.nome);
					System.out.println("Nome " + clienteJ.getNome());
					
					System.out.println("Digite o CNPJ (apenas os numeros): ");
					cadEmp.cnpj = scan.nextLine();
					cadEmp.setCnpj(cadEmp.cnpj);
					System.out.println("CNPJ " + cadEmp.getCnpj());
					
					System.out.println("Digite o valor do Imovel: ");
					while(cadEmp.valorImovel <= 0.0){
						try{
							cadEmp.valorImovel = scan.nextFloat();
							scan.nextLine();
							if (cadEmp.valorImovel <= 0.0){
								System.out.println("Apenas valores acima de 0 (zero)!");
							}
						}catch (java.util.InputMismatchException e){
							scan.nextLine();
							System.out.println("Apenas valores numericos!");
						}
					}
					cadEmp.setValorImovel(cadEmp.valorImovel);
					System.out.println("Valor " + cadEmp.getValorImovel());
					
					System.out.println("Digite o numero de funcionarios (numero inteiro): ");
					while(cadEmp.funcionarios < 0 ){
						try{
							cadEmp.funcionarios = scan.nextInt();
							scan.hasNextLine();
							if (cadEmp.funcionarios < 0){
								System.out.println("Apenas valores positivos!");
							}
						}catch(java.util.InputMismatchException e){
							scan.nextLine();
							System.out.println("Apenas valores numericos!");
						}
					}
					cadEmp.setFuncionarios(cadEmp.funcionarios);
					System.out.println("Funcionarios " + cadEmp.getFuncionarios());
					
					
					
					System.out.println("Digite o numero de visitas diarias (numero inteiro): ");
					while(cadEmp.visitasDiarias < 0){
						try{
							cadEmp.visitasDiarias = scan.nextInt();
							scan.nextLine();
							if (cadEmp.visitasDiarias < 0){
								System.out.println("Apenas valores positivos!");
							}
						}catch (java.util.InputMismatchException e){
							scan.nextLine();
							System.out.println("Apenas valores numericos!");
						}
					}
					cadEmp.setVisitasDiarias(cadEmp.visitasDiarias);
					System.out.println("Visitas Diarias " + cadEmp.getVisitasDiarias());
					
					System.out.println("Digite o numero correspondente ao ramo, Comercio[1], Industria[2] ou Agropecuaria[3]? ");
					while(cadEmp.ramo < 1 || cadEmp.ramo >3 ){
						try{
							cadEmp.ramo = scan.nextInt();
							scan.nextLine();
						}catch(java.util.InputMismatchException exception){
							scan.nextLine();
						}
						if ((cadEmp.ramo == 1) || (cadEmp.ramo == 2) || (cadEmp.ramo == 3)){
							break;
						}
						if ((cadEmp.ramo !=1) && (cadEmp.ramo !=2) && (cadEmp.ramo !=3)){
							System.out.println("Opcao invalida, por favor escolher entre 1, 2 e 3.");
							
						}
					}
					cadEmp.setRamo(cadEmp.ramo);
					System.out.println("Ramo " + cadEmp.getRamo());
					
					cadEmp.valorSeguroEmp = cadEmp.calcularSeguroEmp(cadEmp.getValorImovel(), cadEmp.getFuncionarios(), cadEmp.getVisitasDiarias(), cadEmp.getRamo());
					cadEmp.setValorSeguroEmp(cadEmp.valorSeguroEmp);
					System.out.println("Valor do Seguro R$" + cadEmp.getValorSeguroEmp());
					
					listaClienteJ.add(clienteJ);
					listaCadastroE.add(cadEmp);
					break;
				}
					
				case 3:{
					
					int opcao3 = 0;
					while (opcao3<1 || opcao3>3){
						System.out.println("Listar: Pessoas Fisicas [1] ou Pessoas Juridicas [2] ou Todos[3]");
						try{
							opcao3 = scan.nextInt();
							scan.nextLine();
						}catch(java.util.InputMismatchException exception){
							scan.nextLine();
						}
						if (opcao3 >= 1 && opcao3 <=3){
							break;
						}else{
							System.out.println("Opcao invalida, por favor escolher entre 1 ,2 e 3.");
						}
					}
					if (opcao3 == 1){
						System.out.println("\n--- Clientes Pessoa Fisica ---\n");
						for (int i = 0; i<listaClienteF.size(); i++){
							System.out.println("Nome do cliente " + (i+1) + ": " +listaClienteF.get(i).getNome()+ "\n");
							
						}
					}
					if (opcao3 == 2){
						System.out.println("\n--- Clientes Pessoa Juridica ---\n");
						for (int i = 0; i<listaClienteJ.size(); i++){
							System.out.println("Nome do cliente " + (i+1) + ": " +listaClienteJ.get(i).getNome()+ "\n");
						}
					}
					if (opcao3 == 3){
						System.out.println("\n--- Lista de Clientes ---\n");
						System.out.println("\n--- Clientes Pessoa Fisica ---\n");
						for (int i = 0; i<listaClienteF.size(); i++){
							System.out.println("Nome do cliente " + (i+1) + ": " +listaClienteF.get(i).getNome()+ "\n");
						}
						System.out.println("\n--- Clientes Pessoa Juridica ---\n");
						for (int i = 0; i<listaClienteJ.size(); i++){
							System.out.println("Nome do cliente " + (i+1) + ": " +listaClienteJ.get(i).getNome() + "\n");
						}
					}
					
					break;
				}
				case 4:{
					int opcao4 = 0;
					while (opcao4<1 || opcao4>3){
						System.out.println("Listar: Contratos Residenciais [1] ou Contratos Empresariais [2] ou Todos[3]");
						try{
							opcao4 = scan.nextInt();
							scan.nextLine();
						}catch(java.util.InputMismatchException exception){
							scan.nextLine();
						}
						if (opcao4 >= 1 && opcao4 <=3){
							break;
						}else{
							System.out.println("Opcao invalida, por favor escolher entre 1 ,2 e 3.");
						}
					}
					if (opcao4 == 1){
						System.out.println("\n--- Contratos Residenciais ---\n");
						for (int i = 0; i<listaCadastroR.size(); i++){
							System.out.println("# Contrato numero " + (i+1) + " #\n");
							System.out.println("Nome do Cliente: " +listaClienteF.get(i).getNome());
							System.out.println("Valor do Imovel R$" +listaCadastroR.get(i).getValorImovel() + "\n" + "Valor do Seguro R$" + listaCadastroR.get(i).getValorSeguroRes()+ "\n");
						}
					}
					if (opcao4 == 2){
						System.out.println("\n--- Contratos Empresariais ---\n");
						for (int i = 0; i<listaCadastroE.size(); i++){
							System.out.println("# Contrato numero " + (i+1) + " #\n");
							System.out.println("Nome do Cliente: " +listaClienteJ.get(i).getNome());
							System.out.println("Valor do Imovel R$" +listaCadastroE.get(i).getValorImovel() + "\n" + "Valor do Seguro R$" +listaCadastroE.get(i).getValorSeguroEmp()+ "\n");
						}
					}
					if (opcao4 == 3) {
						System.out.println("\n--- Lista de Contratos ---\n");
						System.out.println("\n--- Pessoa Fisica ---\n");
						for (int i = 0; i<listaCadastroR.size(); i++){
							System.out.println("# Contrato numero " + (i+1)+ " #\n");
							System.out.println("Nome do Cliente: " +listaClienteF.get(i).getNome());
							System.out.println("Valor do Imovel R$" +listaCadastroR.get(i).getValorImovel() + "\n" + "Valor do Seguro R$" + listaCadastroR.get(i).getValorSeguroRes()+ "\n");
						}
						System.out.println("\n--- Pessoa Juridica ---\n");
						for (int i = 0; i<listaCadastroE.size(); i++){
							System.out.println("# Contrato numero " + (i+1)+ " #\n");
							System.out.println("Nome do Cliente: " +listaClienteJ.get(i).getNome());
							System.out.println("Valor do Imovel R$" +listaCadastroE.get(i).getValorImovel() +"\n" + "Valor do Seguro R$" +listaCadastroE.get(i).getValorSeguroEmp()+ "\n");
						}
					}
					break;
				}
				case 5:{
					grava.Gravar(listaClienteF);
					break;
				}
				case 6:{
					listaClienteF = Grava.Ler();
					break;
				}
			}
			
			if (opcao < 0 || opcao > 6){
				System.out.println("Opcao invalida, por favor, tente um numero entre 0 e 6!");
			}
			
		}
		scan.close();

	}

}
