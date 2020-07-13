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

@Entity
@Table(name = "tb_plano_contratual")
public class PlanoContratualVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pln_id;
	
	@Column (length = 25)
	private String pln_descricao;
	
	@Column (nullable = true, length = 100)
	private String pln_descricao_adicional;
	
	@Column (precision = 2)
	private Double pln_valor;
	
	@Column
	private boolean status;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "planoContratual")
	private List<PlanoContratualModuloVO> modulos = new ArrayList<PlanoContratualModuloVO>();
	
	public PlanoContratualVO() {}

	public PlanoContratualVO(String pln_descricao, String pln_descricao_adicional, Double pln_valor,
			List<PlanoContratualModuloVO> modulos, boolean status) {
		super();
		this.pln_descricao = pln_descricao;
		this.pln_descricao_adicional = pln_descricao_adicional;
		this.pln_valor = pln_valor;
		this.modulos = modulos;
		this.status = status;
	}

	public Long getPln_id() {
		return pln_id;
	}

	public String getPln_descricao() {
		return pln_descricao;
	}

	public void setPln_descricao(String pln_descricao) {
		this.pln_descricao = pln_descricao;
	}

	public String getPln_descricao_adicional() {
		return pln_descricao_adicional;
	}

	public void setPln_descricao_adicional(String pln_descricao_adicional) {
		this.pln_descricao_adicional = pln_descricao_adicional;
	}

	public Double getPln_valor() {
		return pln_valor;
	}

	public void setPln_valor(Double pln_valor) {
		this.pln_valor = pln_valor;
	}

	public List<PlanoContratualModuloVO> getModulos() {
		return modulos;
	}

	public void setModulos(List<PlanoContratualModuloVO> modulos) {
		this.modulos = modulos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
