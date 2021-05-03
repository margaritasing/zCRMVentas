package com.company.myapp;

public class Producto implements Item{
    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public String getDescripcion() {
        return null;
    }
}