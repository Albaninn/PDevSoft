package ex2_entrega;

public class Enfermaria implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Enfermaria foi notificada: " + message);
    }
}
