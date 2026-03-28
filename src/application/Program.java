package application;

import java.util.Scanner;

import entities.Customer;
import entities.Item;
import entities.Order;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CLIENTE
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Tipo (NORMAL ou VIP): ");
        String tipo = sc.nextLine();

        System.out.print("Saldo disponível: ");
        double saldo = sc.nextDouble();

        Customer cliente = new Customer(nome, tipo, saldo);

        // PEDIDO
        Order pedido = new Order(cliente);

        // ITENS
        System.out.print("Quantos itens deseja adicionar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // limpar buffer

            System.out.println("\nItem " + (i + 1));

            System.out.print("Nome: ");
            String nomeItem = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            pedido.adicionarItem(new Item(nomeItem, preco, quantidade));
        }

        double total = pedido.calcularTotal();

        // ===== REGRAS =====
        if (pedido.getLista().isEmpty()) {
            pedido.setStatus("REJEITADO");
        }
        else if (total > cliente.getSaldo()) {
            pedido.setStatus("REJEITADO");
        }
        else if (cliente.getTipo().equalsIgnoreCase("VIP")) {

            if (total <= 2000) {
                pedido.setStatus("APROVADO");
            } else {
                pedido.setStatus("PENDENTE");
            }

        } else { // NORMAL

            if (total > 1000) {
                pedido.setStatus("PENDENTE");
            } else {
                pedido.setStatus("APROVADO");
            }
        }

        // SAÍDA
        System.out.println("\n===== RESULTADO =====");
        System.out.println("ID do pedido: " + pedido.getId());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Tipo: " + cliente.getTipo());
        System.out.println("Saldo: " + cliente.getSaldo());
        System.out.println("Total do pedido: " + total);
        System.out.println("Status: " + pedido.getStatus());

        sc.close();
    }
}