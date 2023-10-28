package Observer_ex;

public class Order {
    private String orderId;
    private String status;
    private String location;
    private String customerName;

    public Order(String orderId, String status, String location, String customerName) {
        this.orderId = orderId;
        this.status = status;
        this.location = location;
        this.customerName = customerName;
    }

    public void updateStatus(String newStatus) {
        System.out.println("Status do pedido " + orderId + " alterado de " + status + " para " + newStatus + ".");
        this.status = newStatus;
    }

    public void updateLocation(String newLocation) {
    	System.out.println("Localização do pedido " + orderId + " alterado de " + location + " para " + newLocation + ".");
        this.location = newLocation;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Pedido " + orderId + " - Cliente: " + customerName + " - Status: " + status + " - Localização: " + location;
    }
}