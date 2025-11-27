/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package osorioespinoza_20251124;

import java.util.List;
/**
 *
 */
public class Main {
    public static void main(String[] args) {
        
        char[] labels = { 'A', 'B', 'C', 'D' };

        int[][] matriz = {
            // A  B  C  D
            { 0, 1, 1, 0 },
            { 1, 0, 0, 1 },
            { 1, 0, 0, 1 },
            { 0, 1, 1, 0 }  
        };

        GrafoRecursivo grafo = new GrafoRecursivo(labels, matriz);

        System.out.println("Matriz de adyacencia:");
        grafo.imprimirMatrizAdyacencia();

        List<Character> recorrido = grafo.recorrerDFS();
        System.out.println("\nRecorrido DFS (orden de visita):");

        for (int i = 0; i < recorrido.size(); i++) {
            System.out.print(recorrido.get(i));
            if (i < recorrido.size() - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
