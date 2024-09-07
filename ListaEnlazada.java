public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para encontrar un elemento en la lista
    @Override
    public boolean seEncuentraElemento(Object elementoaEncontrar) {
        return buscarElemento(elementoaEncontrar) != null;
    }

    // Método para buscar un elemento en la lista
    @Override
    public Nodo buscarElemento(Object elementoaBuscar) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(elementoaBuscar)) {
                return actual; // Retorna el nodo que contiene el elemento
            }
            actual = actual.siguiente;
        }
        return null; // Retorna null si no se encuentra el elemento
    }

    // Método para recorrer la lista (opcional)
    public void recorrerLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}