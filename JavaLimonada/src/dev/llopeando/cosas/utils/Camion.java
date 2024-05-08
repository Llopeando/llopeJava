package dev.llopeando.cosas.utils;

public class Camion extends Vehiculo {
    public Camion() {
        super(150);
    }

    @Override
    public void enable() {
        this.fuel -= 5;
        super.enable();
    }
}
