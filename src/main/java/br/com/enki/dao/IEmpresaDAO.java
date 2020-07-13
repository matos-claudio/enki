package br.com.enki.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import br.com.enki.vo.EmpresaVO;

public interface IEmpresaDAO {
	public List<EmpresaVO> buscaEmpresas();
	public Response insereEmpresaDAO(EmpresaVO empresaVO);
	public EmpresaVO buscaEmpresa(String cnpj);
	public boolean atualizaEmpresa(String cnpj, EmpresaVO empresaVO);
	public boolean ativaDesativaEmpresa(String cnpj);
}
