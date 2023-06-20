import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Cesta<E> {
	
	private List<E> lista = new ArrayList<>();

	public void adiciona(E elemento) {
		lista.add(elemento);
	}
	
	public E retira() {
		Random r = new Random(System.currentTimeMillis());
		return lista.remove(r.nextInt(lista.size()));
	}
	
	public boolean temItens() {
		return !lista.isEmpty();
	}
	//usando o coringa para aceitar os tipos que estende E e Fruta
	public void adicionaTodos(Collection<? extends E> elementos) {
		for(E e : elementos) {
			adiciona(e);
		}
	}
	
	private Set<? extends Number> parametro;
}
