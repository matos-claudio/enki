package br.com.enki.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_empresa_plano_contratual")
public class EmpresaPlanoContratualVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_pln_id;
}
