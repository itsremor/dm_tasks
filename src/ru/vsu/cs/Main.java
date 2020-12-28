package ru.vsu.cs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        /*
        MyGraph graph = new MyGraph();
        graph.addAdge(0, 1);
        graph.addAdge(0, 2);
        graph.addAdge(2, 4);
        graph.addAdge(4, 8);
        graph.addAdge(4, 9);
        graph.addAdge(1, 3);
        graph.addAdge(3, 5);
        graph.addAdge(3, 6);
        graph.addAdge(5, 7);


        Iterable<Integer> bfs = graph.bfs(0);
        Iterable<Integer> dfs = graph.dfs(0);

        System.out.print("Обход в глубину: \n| ");
        for (Integer vertex : dfs){
            System.out.print(vertex + " -> ");
        }
        System.out.print("|");

        System.out.print("\nОбход в ширину: \n| ");
        for (Integer vertex : bfs){
            System.out.print(vertex + " -> ");
        }
        System.out.print("|\n\n-------------\n");

        int[] shellArrWorst = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] shellArr = {2, 41, 13, 17, 8, 19, 22, 21, 25, 55};
        int[] insArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] bInsArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] bigArrI = new int[1000];
        int[] bigArrBI = new int[1000];

        for (int i = 0; i < 1000; i++) {
            bigArrI[i] = rnd.nextInt(2000);
        }

        bigArrBI = Arrays.copyOf(bigArrI, 1000);

        ShellSort shellSorting = new ShellSort();
        shellSorting.sort(shellArr);

        Sorting.insertionSort(insArr);
        System.out.print("\nНа большом объёме (1000): ");
        Sorting.insertionSort(bigArrI);
        System.out.print("\nНа отсортированном массиве:");
        Sorting.insertionSort(insArr);

        System.out.print('\n');

        Sorting.binarySort(bInsArr);
        System.out.print("\nНа большом объёме (1000): ");
        Sorting.binarySort(bigArrBI);
        System.out.print("\nНа отсортированном массиве:");
        Sorting.binarySort(bInsArr);
        System.out.print("\n\nКол-во сравнений (с.Шелла): " + shellSorting.getCount());
        System.out.print("\nНа отсортированном массиве:");
        shellSorting.sort(insArr);
        System.out.print("\nКол-во сравнений (с.Шелла): " + shellSorting.getCount());
        shellSorting.sort(shellArrWorst);
        System.out.print("\nКол-во сравнений (с.Шелла, худ.): " + shellSorting.getCount() + '\n');
         */


        WGraph k = new WGraph();


        Edge e1 = new Edge(1, 2, 12);
        Edge e2 = new Edge(2, 3, 15);
        Edge e3 = new Edge(3, 4, 17);
        Edge e4 = new Edge(4, 1, 26);
        Edge e5 = new Edge(1, 3, 9);
        Edge e6 = new Edge(2, 0, 13);


        Edge[] edges = {e1, e2, e3, e4, e5, e6};
        System.out.println("\nМин.вес = " + k.kruskal(edges, 5));
    }
}
