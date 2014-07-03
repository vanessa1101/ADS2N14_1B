import static org.junit.Assert.*;

import org.junit.Test;


public class ProjetoTest {

	Usuario u= new Usuario ("teste","teste","teste");

	Projeto p = new Projeto ("teste","teste",u );

	@Test
	public void testNovoProjeto() {
		
		assertNotNull(p.getNome());
		assertNotNull(p.getDesc());
		assertNotNull (p.getDono());
				
	
	}

}
