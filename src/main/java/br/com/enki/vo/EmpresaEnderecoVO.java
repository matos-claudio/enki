package br.com.enki.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_empresa_endereco")
public class EmpresaEnderecoVO extends PanacheEntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emp_end_id;
	
	@ManyToOne
	@JoinColumn(name = "emp_cnpj")
	private EmpresaVO empresa;
	
	@Column (length = 20)
	private String emp_end_logradouro;
	
	@Column (length = 10)
	private String emp_end_numero;
	
	@Column (length = 20)
	private String emp_end_bairro;
	
	@Column (length = 20)
	private String emp_end_cidade;
	
	@Column (length = 8)
	private String emp_end_cep;
	
	@Column (nullable = true, length = 50)
	private String emp_end_complemento;
	
	public EmpresaEnderecoVO() {}

	public EmpresaEnderecoVO(Long emp_end_id, EmpresaVO empresa, String emp_end_logradouro,
			String emp_end_numero, String emp_end_bairro, String emp_end_cidade, String emp_end_cep,
			String emp_end_complemento) {
		super();
		this.emp_end_id = emp_end_id;
		this.empresa = empresa;
		this.emp_end_logradouro = emp_end_logradouro;
		this.emp_end_numero = emp_end_numero;
		this.emp_end_bairro = emp_end_bairro;
		this.emp_end_cidade = emp_end_cidade;
		this.emp_end_cep = emp_end_cep;
		this.emp_end_complemento = emp_end_complemento;
	}

	public Long getEmp_end_id() {
		return emp_end_id;
	}

	public EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaVO empresa) {
		this.empresa = empresa;
	}

	public String getEmp_end_logradouro() {
		return emp_end_logradouro;
	}

	public void setEmp_end_logradouro(String emp_end_logradouro) {
		this.emp_end_logradouro = emp_end_logradouro;
	}

	public String getEmp_end_numero() {
		return emp_end_numero;
	}

	public void setEmp_end_numero(String emp_end_numero) {
		this.emp_end_numero = emp_end_numero;
	}

	public String getEmp_end_bairro() {
		return emp_end_bairro;
	}

	public void setEmp_end_bairro(String emp_end_bairro) {
		this.emp_end_bairro = emp_end_bairro;
	}

	public String getEmp_end_cidade() {
		return emp_end_cidade;
	}

	public void setEmp_end_cidade(String emp_end_cidade) {
		this.emp_end_cidade = emp_end_cidade;
	}

	public String getEmp_end_cep() {
		return emp_end_cep;
	}

	public void setEmp_end_cep(String emp_end_cep) {
		this.emp_end_cep = emp_end_cep;
	}

	public String getEmp_end_complemento() {
		return emp_end_complemento;
	}

	public void setEmp_end_complemento(String emp_end_complemento) {
		this.emp_end_complemento = emp_end_complemento;
	}
}
