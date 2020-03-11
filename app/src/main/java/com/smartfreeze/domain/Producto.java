package com.smartfreeze.domain;

public class Producto {

    private String nombre;
    private String categoria;
    private String precio;
    private int drawable;

    public Producto(String nombre, String categoria, String precio, int drawable){
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.drawable = drawable;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategorioa() {
        return categoria;
    }

    public void setCategorioa(String categorioa) {
        this.categoria = categorioa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
