package com.example.tareagit;

public class ModificadorDatos {

    private String texto;
    private int valor;
    private boolean estadoActivo;

    public ModificadorDatos(String texto, int valor, boolean estadoActivo) {
        this.texto = texto;
        this.valor = valor;
        this.estadoActivo = estadoActivo;
    }

    public void procesarYMostrar() {
        if (!estadoActivo) {
            System.out.println("El sistema '" + texto + "' está apagado. No se puede procesar.");
            return;
        }

        int resultado = valor * 2;
        System.out.println("Texto: " + texto + " | Resultado modificado: " + resultado);

        evaluarHomeostasis(resultado);
    }

    private void evaluarHomeostasis(int resultado) {
        System.out.println("--- Evaluando estado del sistema ---");
        if (resultado >= 20 && resultado <= 50) {
            System.out.println("Estado: El sistema mantiene su homeostasis (operación estable).");
        } else if (resultado > 50) {
            System.out.println("Estado: Advertencia, sobrecarga del sistema (sinergia excesiva).");
        } else {
            System.out.println("Estado: Alerta, niveles demasiado bajos para operar.");
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== PRUEBA 1 ===");
        ModificadorDatos prueba1 = new ModificadorDatos("Iniciando motor principal", 15, true);
        prueba1.procesarYMostrar();

        System.out.println("\n=== PRUEBA 2 ===");
        ModificadorDatos prueba2 = new ModificadorDatos("Propulsores traseros", 35, true);
        prueba2.procesarYMostrar();

        System.out.println("\n=== PRUEBA 3 ===");
        ModificadorDatos prueba3 = new ModificadorDatos("Sensores de respaldo", 10, false);
        prueba3.procesarYMostrar();
    }
}
