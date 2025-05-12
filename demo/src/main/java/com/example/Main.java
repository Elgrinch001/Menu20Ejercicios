package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---MENÚ DE EJERCICIOS ---");
            System.out.println("1. Comparación de a y b");
            System.out.println("2. Número par o impar");
            System.out.println("3. Estado del agua");
            System.out.println("4. Descuento por precio");
            System.out.println("5. Conversión de temperatura");
            System.out.println("6. Cálculo de IMC");
            System.out.println("7. Conversión de minutos");
            System.out.println("8. Calificación con letras");
            System.out.println("9. Calculadora básica");
            System.out.println("10. Día de la semana");
            System.out.println("11. Clasificación por edad");
            System.out.println("12. Cálculo de préstamo");
            System.out.println("13. Año bisiesto");
            System.out.println("14. Descuento por lealtad");
            System.out.println("15. Operador ternario");
            System.out.println("16. Suma, multiplicación y promedio");
            System.out.println("17. Múltiplos de 2, 3 y 5");
            System.out.println("18. Nota final ponderada");
            System.out.println("19. Clasificación de triángulo");
            System.out.println("20. Número primo");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> comparacion();
                case 2 -> parImpar();
                case 3 -> estadoAgua();
                case 4 -> descuentoPrecio();
                case 5 -> conversionTemperatura();
                case 6 -> calcularIMC();
                case 7 -> conversionMinutos();
                case 8 -> calificacionLetra();
                case 9 -> calculadora();
                case 10 -> diaSemana();
                case 11 -> clasificacionEdad();
                case 12 -> calcularPrestamo();
                case 13 -> anioBisiesto();
                case 14 -> descuentoLealtad();
                case 15 -> operadorTernario();
                case 16 -> sumaPromedio();
                case 17 -> multiplos();
                case 18 -> notaFinal();
                case 19 -> clasificacionTriangulo();
                case 20 -> numeroPrimo();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    static void comparacion() {
        int a = 10, b = 10;
        if (a > b) System.out.println("a es mayor que b y son diferentes");
        else if (a == b) System.out.println("a es igual a b");
        else System.out.println("b es mayor que a y son diferentes");
    }

    static void parImpar() {
        int a = 1;
        if (a % 2 == 0) System.out.println("El número es par");
        else System.out.println("El número es impar");
    }

    static void estadoAgua() {
        int a = -10;
        if (a <= 0) System.out.println("Es sólido");
        else if (a < 100) System.out.println("Es líquido");
        else System.out.println("Es gaseoso");
    }

    static void descuentoPrecio() {
        int a = 200;
        if (a > 100) System.out.println("Tendrás un descuento del 10% y te quedaría en " + (a * 0.9));
        else if (a > 50) System.out.println("Tendrás un descuento del 5% y te quedaría en " + (a * 0.95));
        else System.out.println("No tendrás descuento");
    }

    static void conversionTemperatura() {
        String celsiusStr = "28";
        double celsius = Double.parseDouble(celsiusStr);
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        double tempF = 25.3;
        double tempC = (tempF - 32) * 5/9;
        int tempCInt = (int) tempC;
        System.out.println(tempF + "°F equivale a " + tempC + "°C");
        System.out.println("Temperatura en Celsius (redondeada): " + tempCInt + "°C");
    }

    static void calcularIMC() {
        double peso = 78.5, altura = 1.80;
        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.1f%n", imc);
        if (imc < 18.5) System.out.println("Bajo peso");
        else if (imc < 25) System.out.println("Peso normal");
        else if (imc < 30) System.out.println("Sobrepeso");
        else System.out.println("Obesidad");
    }

    static void conversionMinutos() {
        int minutosTotales = 3665;
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        System.out.printf("%d minutos equivalen a: %d horas y %d minutos%n", minutosTotales, horas, minutos);

        int dias = minutosTotales / 1440;
        horas = (minutosTotales % 1440) / 60;
        minutos = minutosTotales % 60;
        System.out.printf("%d minutos equivalen a: %d días, %d horas y %d minutos%n", minutosTotales, dias, horas, minutos);
    }

    static void calificacionLetra() {
        int nota = 70;
        if (nota >= 90) System.out.println("A");
        else if (nota >= 80) System.out.println("B");
        else if (nota >= 70) System.out.println("C");
        else if (nota >= 60) System.out.println("D");
        else System.out.println("F");
    }

    static void calculadora() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Ingresa el operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                } else {
                    resultado = num1 / num2;
                }
            }
            default -> {
                System.out.println("Operador no válido.");
                return;
            }
        }
        System.out.println("El resultado es: " + resultado);
    }

    static void diaSemana() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número fuera de rango.");
        }
    }

    static void clasificacionEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if (edad >= 0 && edad <= 2) System.out.println("Bebé");
        else if (edad <= 12) System.out.println("Niño");
        else if (edad <= 19) System.out.println("Adolescente");
        else if (edad <= 64) System.out.println("Adulto");
        else if (edad >= 65) System.out.println("Adulto mayor");
        else System.out.println("Edad no válida.");
    }

    static void calcularPrestamo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el monto del préstamo: ");
        double monto = sc.nextDouble();
        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaInteres = sc.nextDouble() / 100;
        System.out.print("Ingresa el número de años: ");
        int anos = sc.nextInt();
        double c = tasaInteres / 12;
        int n = anos * 12;
        double pagoMensual = monto * (c * Math.pow(1 + c, n)) / (Math.pow(1 + c, n) - 1);
        System.out.println("El pago mensual es: " + pagoMensual);
    }

    static void anioBisiesto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))
            System.out.println(anio + " es un año bisiesto.");
        else System.out.println(anio + " no es un año bisiesto.");
    }

    static void descuentoLealtad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa los años como cliente: ");
        int anos = sc.nextInt();
        System.out.print("Ingresa el monto de la compra: ");
        double compra = sc.nextDouble();
        double descuentoPorLealtad;
        if (anos <= 2) descuentoPorLealtad = 0.05;
        else if (anos <= 5) descuentoPorLealtad = 0.10;
        else descuentoPorLealtad = 0.15;
        double descuentoTotal = compra * descuentoPorLealtad;
        if (compra > 500) descuentoTotal += compra * 0.05;
        double precioFinal = compra - descuentoTotal;
        System.out.println("El descuento aplicado es: " + descuentoTotal);
        System.out.println("El precio final es: " + precioFinal);
    }

    static void operadorTernario() {
        int edad = 18, numero = -5;
        String estado = (edad >= 18) ? "mayor de edad" : "menor de edad";
        String resultado = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";
        System.out.println("Estado: " + estado);
        System.out.println("Resultado: " + resultado);
    }

    static void sumaPromedio() {
        int num1 = 3, num2 = 4, num3 = 5;
        int suma = num1 + num2 + num3;
        int multiplicacion = num1 * num2 * num3;
        double promedio = suma / 3.0;
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Promedio: " + promedio);
        if (promedio > suma) System.out.println("El promedio es mayor que la suma.");
        else System.out.println("La suma es mayor o igual al promedio.");
    }

    static void multiplos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) System.out.println("El número es múltiplo de 2.");
        if (numero % 3 == 0) System.out.println("El número es múltiplo de 3.");
        if (numero % 5 == 0) System.out.println("El número es múltiplo de 5.");
    }

    static void notaFinal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la nota de los exámenes: ");
        double examenes = sc.nextDouble();
        System.out.print("Ingresa la nota de los proyectos: ");
        double proyectos = sc.nextDouble();
        System.out.print("Ingresa la nota de las tareas: ");
        double tareas = sc.nextDouble();
        System.out.print("Ingresa la nota de participación: ");
        double participacion = sc.nextDouble();
        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);
        System.out.println("La nota final es: " + notaFinal);
    }

    static void clasificacionTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer lado: ");
        int lado1 = sc.nextInt();
        System.out.print("Ingresa el segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.print("Ingresa el tercer lado: ");
        int lado3 = sc.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) System.out.println("Es un triángulo equilátero.");
            else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) System.out.println("Es un triángulo isósceles.");
            else System.out.println("Es un triángulo escaleno.");
        } else {
            System.out.println("No puede formar un triángulo.");
        }
    }

    static void numeroPrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        if (numero < 2) {
            System.out.println("No es un número primo.");
            return;
        }
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) System.out.println("El número es primo.");
        else System.out.println("El número no es primo.");
    }
}
