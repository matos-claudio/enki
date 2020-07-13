package br.com.enki.vo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_empresa")
public class EmpresaVO extends PanacheEntityBase {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;
	
	@Column (length = 120)
	private String emp_razao_social;
	
	@Column (length = 120)
	private String emp_nome_fantasia;
	
	@Id
	@Column (length = 14)
	private String emp_cnpj;
	
	@Column (nullable = true, length = 20)
	private String emp_inscricao_estadual;
	
	@Column (nullable = true, length = 20)
	private String emp_inscricao_municipal;
	
	@Column (length = 50)
	private String emp_nome_responsavel;
	
	@Column 
	private boolean emp_status;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
	private List<EmpresaContatoVO> contatos = new ArrayList<EmpresaContatoVO>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
	private List<EmpresaEnderecoVO> enderecos = new ArrayList<EmpresaEnderecoVO>();

	public EmpresaVO(){}
	
	public EmpresaVO(Long emp_id, String emp_razao_social, String emp_nome_fantasia, String emp_cnpj,
			String emp_inscricao_estadual, String emp_inscricao_municipal, String emp_nome_responsavel,
			boolean emp_status, List<EmpresaContatoVO> contatos, List<EmpresaEnderecoVO> enderecos) {
		super();
		this.emp_id = emp_id;
		this.emp_razao_social = emp_razao_social;
		this.emp_nome_fantasia = emp_nome_fantasia;
		this.emp_cnpj = emp_cnpj;
		this.emp_inscricao_estadual = emp_inscricao_estadual;
		this.emp_inscricao_municipal = emp_inscricao_municipal;
		this.emp_nome_responsavel = emp_nome_responsavel;
		this.emp_status = emp_status;
		this.contatos = contatos;
		this.enderecos = enderecos;
	}
	
	public Long getEmp_id() {
		return emp_id;
	}

	public String getEmp_razao_social() {
		return emp_razao_social;
	}

	public void setEmp_razao_social(String emp_razao_social) {
		this.emp_razao_social = emp_razao_social;
	}

	public String getEmp_nome_fantasia() {
		return emp_nome_fantasia;
	}

	public void setEmp_nome_fantasia(String emp_nome_fantasia) {
		this.emp_nome_fantasia = emp_nome_fantasia;
	}

	public String getEmp_cnpj() {
		return emp_cnpj;
	}

	public void setEmp_cnpj(String emp_cnpj) {
		this.emp_cnpj = emp_cnpj;
	}

	public String getEmp_inscricao_estadual() {
		return emp_inscricao_estadual;
	}

	public void setEmp_inscricao_estadual(String emp_inscricao_estadual) {
		this.emp_inscricao_estadual = emp_inscricao_estadual;
	}

	public String getEmp_inscricao_municipal() {
		return emp_inscricao_municipal;
	}

	public void setEmp_inscricao_municipal(String emp_inscricao_municipal) {
		this.emp_inscricao_municipal = emp_inscricao_municipal;
	}

	public String getEmp_nome_responsavel() {
		return emp_nome_responsavel;
	}

	public void setEmp_nome_responsavel(String emp_nome_responsavel) {
		this.emp_nome_responsavel = emp_nome_responsavel;
	}

	public boolean isEmp_status() {
		return emp_status;
	}

	public void setEmp_status(boolean emp_status) {
		this.emp_status = emp_status;
	}

	public List<EmpresaContatoVO> getContatos() {
		return contatos;
	}

	public void setContatos(List<EmpresaContatoVO> contatos) {
		this.contatos = contatos;
	}

	public List<EmpresaEnderecoVO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EmpresaEnderecoVO> enderecos) {
		this.enderecos = enderecos;
	}
	
}
