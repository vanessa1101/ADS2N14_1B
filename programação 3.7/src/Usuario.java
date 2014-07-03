
public class Usuario{
	private String Username;
	private String nome;
	private String senha;
	private boolean ativo;
	
	
	public Usuario(String username, String nome, String senha) {
		super();
		Username = username;
		this.nome = nome;
		this.senha = senha;
		ativo = true;
		
	}
	public Usuario()
	{
		
	}
	
	public String toString()
	{
		return nome;
	}
	
	public int compareTo(String nome)
	{
		return this.nome.compareTo(nome);
		
	}
	
	public void DesativarUser()
	{
		ativo = false;
	}
	
	public String getUsername() {
		return Username;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	
	public boolean getAtivo()
	{
		return ativo;
	}
	
    public boolean login(String user,String senha)
    {
    	
    	return true;
    }
}
