package com.example.tareagit;

public class ModificadorDatos {

    private String texto;
    private int valor;

    public ModificadorDatos(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }

    public void procesarYMostrar() {
        int resultado = valor * 2;
        System.out.println("Texto: " + texto + " | Resultado modificado: " + resultado);
    }

    public static void main(String[] args) {
        ModificadorDatos prueba = new ModificadorDatos("Iniciando sistema", 15);
        prueba.procesarYMostrar();
    }
}
