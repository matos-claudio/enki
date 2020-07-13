package br.com.enki.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.enki.vo.EmpresaVO;

@ApplicationScoped
public class EmpresaDAO implements IEmpresaDAO {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmpresaVO listaDadosEmpresaV1() {
		return null;
	}

	@Override
	public List<EmpresaVO> buscaEmpresas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Response insereEmpresaDAO(EmpresaVO empresaVO) {
		EmpresaVO.persist(empresaVO);
		return Response.ok(empresaVO).status(201).build();
	}

	@GET()
	@Override
	public EmpresaVO buscaEmpresa(String cnpj) {
		return null;
	}

	@Override
	public boolean atualizaEmpresa(String cnpj, EmpresaVO empresaVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ativaDesativaEmpresa(String cnpj) {
		// TODO Auto-generated method stub
		return false;
	}
}
