package com.eli.numeros.racionales;

public class Main {

    public static void main(String[] args) {

        NumeroRacional racionalOnceTreceavos = new NumeroRacional(121, 143);
        NumeroRacional sumatoria = racionalOnceTreceavos.sumar(new NumeroRacional(2, 3));


        try {
            NumeroRacional denominadorCero = new NumeroRacional(11, 0);
        } catch (ArithmeticException excepcion) {
            System.out.println(excepcion.getMessage());
        }

        System.out.println(racionalOnceTreceavos.getNumerador() + "/" + racionalOnceTreceavos.getDenominador());
        System.out.println(racionalOnceTreceavos.obtenerValorDecimal());
        System.out.println(sumatoria.getNumerador() + "/" + sumatoria.getDenominador());
    }
}

