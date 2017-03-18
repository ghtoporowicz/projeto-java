package projeto.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import projeto.dao.LoginDao;
import projeto.dao.TokenAcessoDao;
import projeto.entity.Login;
import projeto.entity.TokenAcesso;

@Path("/loginrest")
public class LoginRest {
	
	// post para cadastro de uma nova cidade.
	@POST
	@Path("/postlogin")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TokenAcesso validarLogin(Login login) {
		LoginDao logDao = new LoginDao();
		TokenAcesso token;
		TokenAcessoDao tokenDao = new TokenAcessoDao();

		
		int retornoLogin = logDao.verificaLogin(login);
		System.out.println("login = " +retornoLogin);
		if(retornoLogin > 0){
			token = tokenDao.criarToken(retornoLogin);
		}
		else{
			token = tokenDao.criarTokenSemUser();
		}
		return token;
	}

}
