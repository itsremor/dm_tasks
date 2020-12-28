package ru.vsu.cs;


public class SearchConnections {
    int[] setNumber;
    int[] rank;

    SearchConnections(int size) {
        setNumber = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++)
            setNumber[i] = i;
    }

    public int set(int e) {
        if (e == setNumber[e]) {
            return e;
        } else return set(setNumber[e]);
    }

    public boolean unionWithoutCycle(int u, int v) {
        if ((u = set(u)) == (v = set(v))) {
            return false;
        }
        if (rank[u] < rank[v]) {
            setNumber[u] = v;
        } else {
            setNumber[v] = u;
        }
        return true;
    }

}
