public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Elemento 1");
        lista.agregar("Elemento 2");
        lista.agregar("Elemento 3");

        System.out.println("Elementos en la lista:");
        lista.recorrerLista();

        String elementoABuscar = "Elemento 2";
        if (lista.seEncuentraElemento(elementoABuscar)) {
            System.out.println("El elemento '" + elementoABuscar + "' está en la lista.");
        } else {
            System.out.println("El elemento '" + elementoABuscar + "' no está en la lista.");
        }

        Nodo nodoEncontrado = lista.buscarElemento("Elemento 3");
        if (nodoEncontrado != null) {
            System.out.println("Se encontró el nodo con el dato: " + nodoEncontrado.dato);
        } else {
            System.out.println("No se encontró el nodo.");
        }
    }
}