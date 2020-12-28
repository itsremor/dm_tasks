package ru.vsu.cs;

public class WGraph {

    public int kruskal(Edge[] edges, int vNum) {
        SearchConnections dsf = new SearchConnections(vNum);
        sort(edges);
        int result = 0;
        for (Edge e : edges) {
            if (dsf.unionWithoutCycle(e.u, e.v)){
                System.out.print("\nВключили ребро " + e.u + '-' + e.v + " с весом " + e.w);
            result += e.w;
            }
        }
        return result;
    }

    private void sort(Edge[] edges) {
        boolean isSortedArr = false;
        for (int i = 0; i < edges.length && !isSortedArr; i++) {
            isSortedArr = true;
            for (int j = 0; j < edges.length - i - 1; j++) {
                if (edges[j].w > edges[j + 1].w) {
                    swap(edges, j, j + 1);
                    isSortedArr = false;
                }
            }
        }
    }

    private static void swap(Edge[] arr, int i, int j) {
        Edge tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

class Edge {
    int u;
    int v;
    int w;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}