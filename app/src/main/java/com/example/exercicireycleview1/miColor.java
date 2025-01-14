package com.example.exercicireycleview1;

public class miColor {
    String color;
    int imagenV;
    String nombre;
    String hexadecimal;


    public miColor(String hexadecimal, String nombre, String color, int imagenV) {
        this.hexadecimal = hexadecimal;
        this.nombre = nombre;
        this.imagenV = imagenV;
        this.color = color;
    }

    public int getImagenV() {
        return imagenV;
    }

    public String getColor() {
        return color;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public String getNombre() {
        return nombre;
    }
}
