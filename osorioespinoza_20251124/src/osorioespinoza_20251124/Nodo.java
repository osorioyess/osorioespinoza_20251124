/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osorioespinoza_20251124;

/**
 */
public class Nodo {
     private final char value;
    public Nodo left;
    public Nodo right;
    public Nodo center;

    public Nodo(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.center = null;
    }

    public char getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
