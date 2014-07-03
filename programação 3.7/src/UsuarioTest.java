import static org.junit.Assert.*;

import org.junit.Test;


public class UsuarioTest {

	Usuario u = new Usuario("teste1","teste1","teste1");
	
	
	@Test
	public void testNovoUser() {
		assertNotNull(u.getNome());
		assertNotNull(u.getSenha());
		assertNotNull(u.getUsername());
	    assertTrue(u.getAtivo()==true);	
	}


    @Test
    public void testeDesativarUser(){
    	u.DesativarUser();
    	 
    	assertTrue(u.getAtivo()==false);	
    	
    	
    }


}
