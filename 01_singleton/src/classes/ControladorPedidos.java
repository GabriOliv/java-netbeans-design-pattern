package classes;

public class ControladorPedidos {
    private String mostrarPedidos = "";
    public String getMostrarPedidos() {
        return mostrarPedidos;
    }

    public void setMostrarPedidos(String mostrarPedidos) {
        this.mostrarPedidos += mostrarPedidos + "\n";
    }
}
