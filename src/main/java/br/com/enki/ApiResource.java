package br.com.enki;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.enki.dao.EmpresaDAO;
import br.com.enki.vo.EmpresaVO;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiResource {

	@Inject
	private EmpresaDAO empresaDAO;
	
    @GET
    public String hello() {
        return "hello";
    }
    
    @Path("/empresa/insere")
	@POST
	public Response insereEmpresa(EmpresaVO empresaVO) {
		System.out.println("EmpresaVO "+empresaVO.getEmp_nome_fantasia());
		return empresaDAO.insereEmpresaDAO(empresaVO);
		//return Response.ok(empresaVO).status(201).build();
	}
}