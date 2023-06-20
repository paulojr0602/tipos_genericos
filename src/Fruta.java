import java.util.List;

public class Fruta {
	
	public Fruta(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fruta (nome=" + nome + ")";
	}
	
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		

	
	
	
	
}
