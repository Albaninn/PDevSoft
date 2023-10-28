package Observer_ex;

import java.util.Scanner;

public class teste {
    private static OrderTracker tracker = new OrderTracker();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar novo pedido");
            System.out.println("2. Atualizar status do pedido");
            System.out.println("3. Atualizar localização do pedido");
            System.out.println("4. Listar todos os pedidos");
            System.out.println("5. Procurar pedido pelo número");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addNewOrder();
                    break;
                case 2:
                    updateOrderStatus();
                    break;
                case 3:
                    updateOrderLocation();
                    break;
                case 4:
                    tracker.listOrders();
                    break;
                case 5:
                    searchOrder();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void addNewOrder() {
        System.out.print("Digite o número do pedido: ");
        String orderId = scanner.nextLine();
        System.out.print("Digite o status do pedido: ");
        String status = scanner.nextLine();
        System.out.print("Digite a localização do pedido: ");
        String location = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String customerName = scanner.nextLine();
        Order order = new Order(orderId, status, location, customerName);
        tracker.addOrder(order);
    }

    private static void updateOrderStatus() {
        System.out.print("Digite o número do pedido que deseja atualizar: ");
        String orderId = scanner.nextLine();
        System.out.print("Digite o novo status: ");
        String newStatus = scanner.nextLine();
        tracker.updateOrderStatus(orderId, newStatus);
    }

    private static void updateOrderLocation() {
        System.out.print("Digite o número do pedido que deseja atualizar: ");
        String orderId = scanner.nextLine();
        System.out.print("Digite a nova localização: ");
        String newLocation = scanner.nextLine();
        tracker.updateOrderLocation(orderId, newLocation);
    }

    private static void searchOrder() {
        System.out.print("Digite o número do pedido que deseja procurar: ");
        String orderId = scanner.nextLine();
        tracker.findOrder(orderId);
    }
}
