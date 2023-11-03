package ex2_entrega;

public class UTI implements Observer {
    @Override
    public void update(String message) {
        System.out.println("UTI foi notificada: " + message);
    }
}
