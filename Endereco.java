//6 questão 

public class Endereco {
 private String rua;
 private  int cep;
 private String Bairro;
 private String cidade;
 public Endereco(String rua,int cep,String Bairro,String cidade) {
	 this.rua = rua;
	 this.cep = cep;
	 this.Bairro = Bairro;
	 this.cidade = cidade;
	 
 }
 public Endereco() {
	 
 }
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public int getCep() {
	return cep;
}
public void setCep(int cep) {
	this.cep = cep;
}
public String getBairro() {
	return Bairro;
}
public void setBairro(String bairro) {
	Bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
}
