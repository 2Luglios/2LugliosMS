package br.com.a2luglios.ms.controller;

import javax.inject.Inject;

import br.com.a2luglios.ms.dao.UsuarioDao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	@Inject
	private UsuarioDao usuarioDao;
//	
	@Inject
	private Result result;
	
	@Path("/")
	public void index() {
//		result.redirectTo(IndexController.class).list();
	}
	
	public void list() {
		
	}
	
//	@Get("/products")
//    public List<Product> list() {...}
//
//    @Post("/products")
//    public void add(Product product) {...}
//
//    @Get("/products/{product.id}")
//    public void view(Product product) {...}
//
//    @Put("/products/{product.id}")
//    public void update(Product product) {...}
//
//    @Delete("/products/{product.id}")
//    public void remove(Product product) {...}
	
}
