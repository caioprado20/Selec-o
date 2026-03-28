package entities;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private static int contadorId = 1;

    private int id;
    private Customer cliente;
    private List<Item> lista;
    private String status;

    public Order(Customer cliente) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.lista = new ArrayList<>();
        this.status = "PENDENTE";
    }

    public void adicionarItem(Item item) {
        lista.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : lista) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public Customer getCliente() {
        return cliente;
    }

    public List<Item> getLista() {
        return lista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}