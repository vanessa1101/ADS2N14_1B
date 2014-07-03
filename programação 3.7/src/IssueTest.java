import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;



public class IssueTest {

	Projeto p = new Projeto();
	String titulo = "teste";
	String desc = "teste;";
	String dinicial = "teste";
	int critici = 1;
	int tipo = 1;
	Issue i = new Issue(p, titulo, desc, dinicial, critici, tipo);

	@Before
	public void inicializar() {

		i.AlterStatusNovo();
	}

	@Test
	public void testenovoIssue() {

		assertNotNull(i);
		assertEquals(i.getStatus(), 1);

	}
	@Test
	public void testealterIssue() {
	
		i.alterIssue(p, titulo, desc, critici, tipo);
	
	assertNotNull(p);
	assertNotNull(titulo);
	assertNotNull(desc);
	assertNotNull(critici);
	assertNotNull(tipo);
	}

	@Test
	public void testeAlterStatusNovo() {
		assertFalse(i.getStatus() != 1);
		i.AlterStatusAtribuido();
		i.AlterStatusNovo();
		assertEquals(i.getStatus(), 1);

	}

	@Test
	public void testeAlterStatusAberto() {
		i.AlterStatusAberto();
		assertEquals(i.getStatus(), 2);

	}

	@Test
	public void testeAlterStatusDesenv() {
		i.AlterStatusDesenv();
		assertEquals(i.getStatus(), 3);
	}

	@Test
	public void testeAlterStatusFechado() {
		i.AlterStatusFechado();
		assertEquals(i.getStatus(), 4);

	}
    @Test
	public void testeAlterStatusDuplicado() {
		i.AlterStatusDuplicado();
		assertEquals(i.getStatus(), 5);

	}
    @Test
	public void testeAlterStatusAtribuido() {
		i.AlterStatusAtribuido();
		assertEquals(i.getStatus(), 6);
	}

}
