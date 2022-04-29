class Solution {
public boolean isBipartite(int[][] graph) {
int len = graph.length;
boolean[] set1 = new boolean[len];
boolean[] set2 = new boolean[len];

    for (int i = 0; i < len; ++i) {
        if (set1[i] || set2[i]) continue;
        if (!dfs(i, set1, set2, graph)) return false;
    }
    return true;
}

private boolean dfs(int index, boolean[] set1, boolean[] set2, int[][] graph) {
    if (set1[index]) return !set2[index];
    set1[index] = true;
    for (int n : graph[index]) {
        if (!dfs(n, set2, set1, graph)) return false;
    }
    return true;
}
}