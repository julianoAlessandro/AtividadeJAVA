

public class TestarFuncionario {
// 6 questão
	public static void main(String[] args) {
		Funcionario2 f1 = new Funcionario2();
		f1.setNome("juliano");
		f1.setSetor("Auxiliar de produção");
		f1.setId_funcionario(22);
		Endereco enderecoFuncionario = new Endereco("Penha rio do Peixe",1234,"fidencio","Itapira");
		f1.setEndereco(enderecoFuncionario);
		// trabalahando com composição
		System.out.println("Seu nome e:"+f1.getNome());
		System.out.println("Seu setor e:"+f1.getSetor());
		System.out.println("Seu id e:"+f1.getId_funcionario());
		System.out.println("Sua rua e:"+f1.getEndereco().getRua());
		System.out.println("Seu cep e:"+f1.getEndereco().getCep());
		System.out.println("Seu bairro e:"+f1.getEndereco().getBairro());
		System.out.println("Sua cidade e:"+f1.getEndereco().getCidade());
		
	
	}

}
