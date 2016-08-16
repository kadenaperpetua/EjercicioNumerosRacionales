package com.eli.numeros.racionales;

public class NumeroRacional {

    private int numerador, denominador;

    public NumeroRacional(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador > 0) {
            this.denominador = denominador;
        } else if (denominador < 0) {
            this.denominador = Math.abs(denominador);
            this.numerador *= -1;
        } else {
            throw new ArithmeticException("El denominador no puede ser cero");
        }
        simplificarFraccion();
    }

    public NumeroRacional sumar(NumeroRacional sumador) {
        int numeradorSuma = this.numerador * sumador.denominador + this.denominador * sumador.numerador;
        int denominadorSuma = this.denominador * sumador.denominador;
        NumeroRacional suma = new NumeroRacional(numeradorSuma, denominadorSuma);
        return suma;
    }

    public NumeroRacional multiplicar(NumeroRacional multiplicador) {
        int numeradorMultiplicacion = this.numerador * multiplicador.numerador;
        int denominadorMultiplicacion = this.denominador * multiplicador.denominador;
        NumeroRacional multiplicacion = new NumeroRacional(numeradorMultiplicacion, denominadorMultiplicacion);
        return multiplicacion;
    }

    public double obtenerValorDecimal() {
        double numero = (double) numerador / (double) denominador;
        return numero;
    }

    private void simplificarFraccion() {

        int factor = 2;

        while (numerador >= factor || denominador >= factor) {
            if (numerador % factor == 0 && denominador % factor == 0) {
                numerador /= factor;
                denominador /= factor;
            } else {
                factor++;
            }
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }


}
