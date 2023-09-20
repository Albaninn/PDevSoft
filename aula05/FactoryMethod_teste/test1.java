package FactoryMethod_teste;

import java.lang.reflect.InvocationTargetException;

public class test1 {

    public static void main(String[] args) {
        String classeParaInstanciar = "Factory.Circulo";

        try {
            Class<?> classe = Class.forName(classeParaInstanciar);
            Object instancia = classe.getDeclaredConstructor().newInstance();

            if (instancia instanceof IForma) {
                IForma forma = (IForma) instancia;
                forma.desenhar();
            } else {
                System.err.println("A classe não implementa a interface IForma.");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

