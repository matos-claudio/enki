package br.com.enki.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_plano_contratual_modulo")
public class PlanoContratualModuloVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pln_mod_id;
	
	@ManyToOne
	@JoinColumn(name = "pln_id")
	private PlanoContratualVO planoContratual;
	
	@Column (length = 1)
	private String modulo;
	
	@Column
	private boolean status;
	
	public PlanoContratualModuloVO() {}

	public PlanoContratualModuloVO(PlanoContratualVO planoContratual, String modulo, boolean status) {
		super();
		this.planoContratual = planoContratual;
		this.modulo = modulo;
		this.status = status;
	}

	public Long getPln_mod_id() {
		return pln_mod_id;
	}

	public PlanoContratualVO getPlanoContratual() {
		return planoContratual;
	}

	public void setPlanoContratual(PlanoContratualVO planoContratual) {
		this.planoContratual = planoContratual;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
