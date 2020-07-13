package br.com.enki.dao;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.enki.vo.EmpresaVO;

public interface IEmpresaDAO {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EmpresaVO> buscaEmpresas();
	public EmpresaVO insereEmpresa(EmpresaVO empresaVO);
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmpresaVO buscaEmpresa(String cnpj);
	public boolean atualizaEmpresa(String cnpj, EmpresaVO empresaVO);
	public boolean ativaDesativaEmpresa(String cnpj);
}
