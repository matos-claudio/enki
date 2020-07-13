package br.com.enki.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.enki.vo.EmpresaVO;

@Path("/empresa/v1")
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

	@Override
	public EmpresaVO insereEmpresa(EmpresaVO empresaVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@GET()
	@Path("/query")
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
