/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package osorioespinoza_20251124;

import java.util.*;
/**
 *
 */
public class GrafoRecursivo {
    private final char[] labels;
    private final int[][] matriz;
    private final Nodo[] nodos;
    private final int n;

    public GrafoRecursivo(char[] labels, int[][] matriz) {
        if (labels == null || matriz == null) {
            throw new IllegalArgumentException("labels y matriz no pueden ser null");
        }
        if (labels.length != matriz.length) {
            throw new IllegalArgumentException("labels y dimension de matriz deben coincidir");
        }
        this.labels = labels;
        this.matriz = matriz;
        this.n = labels.length;
        this.nodos = new Nodo[n];

        for (int i = 0; i < n; i++) {
            nodos[i] = new Nodo(labels[i]);
        }

    }

    public void imprimirMatrizAdyacencia() {
        System.out.println("   " + Arrays.toString(labels));
        for (int i = 0; i < n; i++) {
            System.out.print(labels[i] + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    private void dfsRecursivo(int idx, boolean[] visitados, List<Character> orden) {
        if (idx < 0 || idx >= n) return;
        if (visitados[idx]) return;

        visitados[idx] = true;
        orden.add(nodos[idx].getValue());

        for (int vecino = 0; vecino < n; vecino++) {
            if (matriz[idx][vecino] == 1 && !visitados[vecino]) {
                dfsRecursivo(vecino, visitados, orden);
            }
        }
    }

    public List<Character> recorrerDFS() {
        boolean[] visitados = new boolean[n];
        List<Character> orden = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visitados[i]) {
                dfsRecursivo(i, visitados, orden);
            }
        }
        return orden;
    }
}
