public class Lista<E extends Comparable<E>> {
	protected No<E> topo; // cabeça da lista
	protected No<E> Final; // cauda da lista
	protected long size; // número de nodos da lista

	public Lista() {
		size = 0;
		topo = Final = null;
	}

	public boolean isEmpty() {
		return topo == null;
	}

	public E gettopo() throws ListaVaziaException {
		if (isEmpty())
			throw new ListaVaziaException();
		return topo.getElement();
	}

	public E getFinal() throws ListaVaziaException {
		if (isEmpty())
			throw new ListaVaziaException();
		return Final.getElement();
	}

	public void addInicio(No<E> insertItem) {

		if (isEmpty()) {
			topo = Final = insertItem;
		} else {
			topo.setAnt(insertItem);
			insertItem.setProx(topo);
			topo = insertItem;
		}
		size++;
	}

	public void addFinal(No<E> insertItem) {

		if (isEmpty()) {
			topo = Final = insertItem;
		} else {
			Final.setProx(insertItem);
			insertItem.setAnt(Final);
			Final = insertItem;
		}
		size++;
	}

	public E removeTopo() throws ListaVaziaException {
		if (isEmpty()) {
			throw new ListaVaziaException();
		}
		E removedItem = topo.getElement();
		if (topo == Final) {
			topo = Final = null;
		} else {
			topo = topo.getProx();
			topo.setAnt(null);
		}
		size--;
		return removedItem;
	}

	public E removeFinal() throws ListaVaziaException {
		if (isEmpty()) {
			throw new ListaVaziaException();
		}
		E removedItem = Final.getElement();
		if (topo == Final) {
			topo = Final = null;
		} else {
			No<E> penultimo = Final.getAnt();
			Final = penultimo;
			Final.setProx(null);
		}
		size--;
		return removedItem;
	}

	public String toString() {
		String str = "\nExibindo a lista: ";
		No<E> current = topo;
		while (current != null) {
			str += current.getElement() + " - ";
			current = current.getProx();
		}
		return str;
	}

	// insere ordenado
	public void insereOrd(No<E> no) {
		E elemento = no.getElement();
		// a lista esta vazia
		if (topo == null) {
			topo = no;
			Final = no;
			size += 1;
		}
		
		// insere no inicio da lista
		else if (elemento.compareTo(topo.getElement() )<= 0){
			addInicio(no);

		// insere no final da lista
		}else if (elemento.compareTo(Final.getElement()) > 0){
			addFinal(no);
		// insere no meio
		}else {

			No<E> nodoIterador = topo.getProx();

			// procura um elemento na lista maior ou igual que o elemento a ser
			// inserido
			while (nodoIterador.getElement().compareTo(elemento) < 0) {
				nodoIterador = nodoIterador.getProx();

				No<E> nodoAnterior = nodoIterador.getAnt();

				// [anterior]--->[elemento]
				nodoAnterior.setProx(no);

				// [anterior]<-->[elemento]
			nodoAnterior.setAnt(nodoAnterior);

				// [elemento]--->[proximo == nodoIterador]
				nodoAnterior.setProx(nodoIterador);

				// [elemento]<-->[proximo == nodoIterador]
				//nodoIterador.setAnt(elemento);

				size += 1;

			}
            }
		}
}
