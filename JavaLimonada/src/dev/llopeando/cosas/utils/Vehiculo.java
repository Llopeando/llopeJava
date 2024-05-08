package dev.llopeando.cosas.utils;

public class Vehiculo {
    private boolean powered;
    private final int maxFuel;
    protected int fuel;

    public Vehiculo(int maxFuel) {
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
        this.powered = false;
    }

    public void enable() {
        this.fuel -= 5;
        this.powered = true;
    }

    public void disable() {
        this.powered = true;
    }

    public void rellenar() {
        this.fuel = this.maxFuel;
    }
}
