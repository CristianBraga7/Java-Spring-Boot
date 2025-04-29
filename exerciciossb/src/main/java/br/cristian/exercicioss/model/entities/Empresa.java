package br.cristian.exercicioss.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity
public class Empresa {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; 
 
    private String nome;
    
    private String descricao;
    
    private double preco;
    
    public Empresa() {
    	
    }
    
    public Empresa( String nome) {
		super();
		this.nome = nome;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
    
    
    
    
    
    //private String Emp_CPF_CNPJ; 
    
    //private String Emp_Endereco;
 
    //private String Emp_End_Numero;
    
   // private String Emp_End_Complemento;
    
    //private String Emp_End_Bairro;
 
     //private String Emp_End_Cidade;
    
    //private String Emp_End_UF;
    
    //private String Emp_End_CEP;
   
    //private String Emp_Site;
    
    //private String Emp_Telefone;
    
    //private String Emp_Email;
    
    //private String Emp_Contato;
    
   //private String Emp_Descricao;
   
    //private String Emp_Segmento;
    
   // private String Emp_Numero_Funcionarios;
   
   // private String Emp_Ano_Fundacao;
    
    //private String Emp_Visao;
    
   // private String Emp_Valores;
    
    
  	
}