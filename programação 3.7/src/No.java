
public class No<E> {
    private E elemento;
    private No<E> prox;
    private No<E> ant;

    public No(E element) {
        this (element, null, null);
    }
    public No(E element, No<E> next, No<E> previous) {
        super();
        this.elemento = element;
        this.prox = next;
        this.ant = previous;
    }
    public E getElement() {
        return elemento;
    }
    public void setElement(E element) {
        this.elemento = element;
    }
    public No<E> getProx() {
        return prox;
    }
    public void setProx(No<E> next) {
        this.prox = next;
    }
    public No<E> getAnt() {
        return ant;
    }
    public void setAnt(No<E> previous) {
        this.ant = previous;
    }

    
    //public int compareTo(E element)
    //{
    //	int valor1=1;
    //	return valor1;
    //}


}