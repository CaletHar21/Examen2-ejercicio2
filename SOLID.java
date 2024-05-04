package com.itca.solid;

// Clase base para todos los tipos de empleados
abstract class Empleado {
    abstract double calcularSalario();
}

// Clase para empleados a tiempo completo
class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    double calcularSalario() {
        return salarioMensual;
    }
}

// Clase para empleados por contrato
class EmpleadoContrato extends Empleado {
    private double salarioDiario;

    public EmpleadoContrato(double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    @Override
    double calcularSalario() {
        return salarioDiario;
    }
}

// Clase para empleados temporales
class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(double tarifaPorHora, int horasTrabajadas) {
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }
}

public class SOLID {
    public static void main(String[] args) {
         // Crear instancias de diferentes tipos de empleados
        Empleado empleado1 = new EmpleadoTiempoCompleto(3000.0);
        Empleado empleado2 = new EmpleadoContrato(100.0);
        Empleado empleado3 = new EmpleadoTemporal(10.0, 40);

        // Calcular salario para cada tipo de empleado
        double salario1 = empleado1.calcularSalario();
        double salario2 = empleado2.calcularSalario();
        double salario3 = empleado3.calcularSalario();

        // Imprimir salarios
        System.out.println("Salario del empleado a tiempo completo: " + salario1);
        System.out.println("Salario del empleado por contrato: " + salario2);
        System.out.println("Salario del empleado temporal: " + salario3);
    }
}
