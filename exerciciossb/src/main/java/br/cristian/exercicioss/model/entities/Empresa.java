package br.cristian.exercicioss.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 

@Entity
@Table(name = "empresa")
public class Empresa {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_empresa")
    private String cod_empresa; 
    @Column
    private String Emp_Nome; 
    @Column
    private String Emp_CPF_CNPJ; 
    @Column
    private String Emp_Endereco;
    @Column
    private String Emp_End_Numero;
    @Column
    private String Emp_End_Complemento;
    @Column
    private String Emp_End_Bairro;
    @Column
    private String Emp_End_Cidade;
    @Column
    private String Emp_End_UF;
    @Column
    private String Emp_End_CEP;
    @Column
    private String Emp_Site;
    @Column
    private String Emp_Telefone;
    @Column
    private String Emp_Email;
    @Column
    private String Emp_Contato;
    @Column
    private String Emp_Descricao;
    @Column
    private String Emp_Segmento;
    @Column
    private String Emp_Numero_Funcionarios;
    @Column
    private String Emp_Ano_Fundacao;
    @Column
    private String Emp_Visao;
    @Column
    private String Emp_Valores;
    
    public Empresa(){
		
	}
    
    public Empresa(String nome) {
		super();
		this.Emp_Nome = nome;
    }
    
    
   
    public String getCod_empresa() {
		return cod_empresa;
	}

	public void setCod_empresa(String cod_empresa) {
		this.cod_empresa = cod_empresa;
	}

	public String getNome() {
		return Emp_Nome;
	}

	public void setNome(String nome) {
		this.Emp_Nome = nome;
	}

	public String getEmp_CPF_CNPJ() {
		return Emp_CPF_CNPJ;
	}

	public void setEmp_CPF_CNPJ(String emp_CPF_CNPJ) {
		Emp_CPF_CNPJ = emp_CPF_CNPJ;
	}

	public String getEmp_Endereco() {
		return Emp_Endereco;
	}

	public void setEmp_Endereco(String emp_Endereco) {
		Emp_Endereco = emp_Endereco;
	}

	public String getEmp_End_Numero() {
		return Emp_End_Numero;
	}

	public void setEmp_End_Numero(String emp_End_Numero) {
		Emp_End_Numero = emp_End_Numero;
	}

	public String getEmp_End_Complemento() {
		return Emp_End_Complemento;
	}

	public void setEmp_End_Complemento(String emp_End_Complemento) {
		Emp_End_Complemento = emp_End_Complemento;
	}

	public String getEmp_End_Bairro() {
		return Emp_End_Bairro;
	}

	public void setEmp_End_Bairro(String emp_End_Bairro) {
		Emp_End_Bairro = emp_End_Bairro;
	}

	public String getEmp_End_Cidade() {
		return Emp_End_Cidade;
	}

	public void setEmp_End_Cidade(String emp_End_Cidade) {
		Emp_End_Cidade = emp_End_Cidade;
	}

	public String getEmp_End_UF() {
		return Emp_End_UF;
	}

	public void setEmp_End_UF(String emp_End_UF) {
		Emp_End_UF = emp_End_UF;
	}

	public String getEmp_End_CEP() {
		return Emp_End_CEP;
	}

	public void setEmp_End_CEP(String emp_End_CEP) {
		Emp_End_CEP = emp_End_CEP;
	}

	public String getEmp_Site() {
		return Emp_Site;
	}

	public void setEmp_Site(String emp_Site) {
		Emp_Site = emp_Site;
	}

	public String getEmp_Telefone() {
		return Emp_Telefone;
	}

	public void setEmp_Telefone(String emp_Telefone) {
		Emp_Telefone = emp_Telefone;
	}

	public String getEmp_Email() {
		return Emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}

	public String getEmp_Contato() {
		return Emp_Contato;
	}

	public void setEmp_Contato(String emp_Contato) {
		Emp_Contato = emp_Contato;
	}

	public String getEmp_Descricao() {
		return Emp_Descricao;
	}

	public void setEmp_Descricao(String emp_Descricao) {
		Emp_Descricao = emp_Descricao;
	}

	public String getEmp_Segmento() {
		return Emp_Segmento;
	}

	public void setEmp_Segmento(String emp_Segmento) {
		Emp_Segmento = emp_Segmento;
	}

	public String getEmp_Numero_Funcionarios() {
		return Emp_Numero_Funcionarios;
	}

	public void setEmp_Numero_Funcionarios(String emp_Numero_Funcionarios) {
		Emp_Numero_Funcionarios = emp_Numero_Funcionarios;
	}

	public String getEmp_Ano_Fundacao() {
		return Emp_Ano_Fundacao;
	}

	public void setEmp_Ano_Fundacao(String emp_Ano_Fundacao) {
		Emp_Ano_Fundacao = emp_Ano_Fundacao;
	}

	public String getEmp_Visao() {
		return Emp_Visao;
	}

	public void setEmp_Visao(String emp_Visao) {
		Emp_Visao = emp_Visao;
	}

	public String getEmp_Valores() {
		return Emp_Valores;
	}

	public void setEmp_Valores(String emp_Valores) {
		Emp_Valores = emp_Valores;
	}

	@Override
	public String toString() {
		return "Empresa [cod_empresa=" + cod_empresa + ", Emp_Nome=" + Emp_Nome + ", Emp_CPF_CNPJ=" + Emp_CPF_CNPJ
				+ ", Emp_Endereco=" + Emp_Endereco + ", Emp_End_Numero=" + Emp_End_Numero + ", Emp_End_Complemento="
				+ Emp_End_Complemento + ", Emp_End_Bairro=" + Emp_End_Bairro + ", Emp_End_Cidade=" + Emp_End_Cidade
				+ ", Emp_End_UF=" + Emp_End_UF + ", Emp_End_CEP=" + Emp_End_CEP + ", Emp_Site=" + Emp_Site
				+ ", Emp_Telefone=" + Emp_Telefone + ", Emp_Email=" + Emp_Email + ", Emp_Contato=" + Emp_Contato
				+ ", Emp_Descricao=" + Emp_Descricao + ", Emp_Segmento=" + Emp_Segmento + ", Emp_Numero_Funcionarios="
				+ Emp_Numero_Funcionarios + ", Emp_Ano_Fundacao=" + Emp_Ano_Fundacao + ", Emp_Visao=" + Emp_Visao
				+ ", Emp_Valores=" + Emp_Valores + "]";
	}
	
	
		
}