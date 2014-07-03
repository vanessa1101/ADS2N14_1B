import java.util.Date;

public class Issue {
	private Projeto proj;
	private String titulo;
	private String desc;
	private String Dinicial;
	private String DFinal;
	private int critici;
	private int tipo;
	private int status;

	// tipo
	// 1 -bug
	// 2 -ether...

	// criticidade
	// 1 - low
	// 2 - medium
	// 3 - high
	// 4 - critical
	// 5 - blocker

	// status
	// 1 - novo
	// 2 - aberto
	// 3 - em desenv
	// 4 - fechado
	// 5 - duplicado
	// 6 - atribuido

	public Issue(Projeto proj, String titulo, String desc, String dinicial,
			int critici, int tipo) {
		super();
		this.proj = proj;
		this.titulo = titulo;
		this.desc = desc;
		Dinicial = dinicial;
		this.critici = critici;
		this.tipo = tipo;
		status = 1;
	}

	public Projeto getProj() {
		return proj;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDesc() {
		return desc;
	}

	public String getDinicial() {
		return Dinicial;
	}

	public String getDFinal() {
		return DFinal;
	}

	public int getCritici() {
		return critici;
	}

	public int getTipo() {
		return tipo;
	}

	public int getStatus() {
		return status;
	}

	public void alterIssue(Projeto proj, String titulo, String desc,
			int critici, int tipo) {
		this.proj = proj;
		this.titulo = titulo;
		this.desc = desc;
		this.critici = critici;
		this.tipo = tipo;
	}

	public void AlterStatusNovo() {
		this.status = 1;
	}

	public void AlterStatusAberto() {
		this.status = 2;
	}

	public void AlterStatusDesenv() {
		this.status = 3;
	}

	public void AlterStatusFechado() {
		this.status = 4;
	}

	public void AlterStatusDuplicado() {
		this.status = 5;
	}

	public void AlterStatusAtribuido() {
		this.status = 6;
	}

	public String imprimeCriticidade() {

		String criti = " ";
		switch (getCritici()) {
		case 1:
			criti = "low";
			break;
		case 2:
			criti = "medium";
			break;
		case 3:
			criti = "high";
			break;
		case 4:
			criti = "critical";
			break;
		case 5:
			criti = "blocker";
			break;

		}

		return criti;
	}

	public String imprimeTipo() {
		String tipos = " ";
		if (getTipo() == 1) {
			tipos = "bug";
		} else {
			tipos = "ether";
		}
		
		return tipos;
	}
	public String imprimeStatus() {


		String status = " ";
		switch (getCritici()) {
		case 1:
			status = "novo";
			break;
		case 2:
			status = "aberto";
			break;
		case 3:
			status = "em desenvolvimento";
			break;
		case 4:
			status= "fechado";
			break;
		case 5:
			status = "dublicado";
			break;
		case 6:
			status = "atribuido";
			break;

		}

		return status;
	}

}
