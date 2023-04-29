//6 questão

public class Funcionario2 {
private String nome;
private String setor;
private int id_funcionario;
private Endereco endereco;
public Funcionario2(String nome,String setor,int id_funcionario,Endereco endereco) {
	this.nome = nome;
	this.setor = setor;
	this.id_funcionario = id_funcionario;
	this.endereco = endereco;
	
}
public Funcionario2() {
	
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSetor() {
	return setor;
}
public void setSetor(String setor) {
	this.setor = setor;
}
public int  getId_funcionario() {
	return id_funcionario;
}
public void setId_funcionario(int id_funcionario) {
	this.id_funcionario = id_funcionario;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
}
