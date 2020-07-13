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
@Table(name = "tb_empresa_contato")
public class EmpresaContatoVO extends PanacheEntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_cont_id;
	
	@ManyToOne
	@JoinColumn(name = "emp_cnpj")
	private EmpresaVO empresa;
	
	@Column (length = 15)
	private String emp_cont_telefone;
	
	@Column (length = 30)
	private String emp_cont_email;
	
	public EmpresaContatoVO() {}

	public EmpresaContatoVO(EmpresaVO empresa, String emp_cont_telefone, String emp_cont_email) {
		super();
		this.empresa = empresa;
		this.emp_cont_telefone = emp_cont_telefone;
		this.emp_cont_email = emp_cont_email;
	}

	public Long getEmp_cont_id() {
		return emp_cont_id;
	}

	public EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaVO empresa) {
		this.empresa = empresa;
	}

	public String getEmp_cont_telefone() {
		return emp_cont_telefone;
	}

	public void setEmp_cont_telefone(String emp_cont_telefone) {
		this.emp_cont_telefone = emp_cont_telefone;
	}

	public String getEmp_cont_email() {
		return emp_cont_email;
	}

	public void setEmp_cont_email(String emp_cont_email) {
		this.emp_cont_email = emp_cont_email;
	}
}
