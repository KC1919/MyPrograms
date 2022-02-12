class Solution {
    
    class Pair 
    {
        int row;
        int col;
        boolean isPart;
        
        Pair(int row, int col, boolean isPart) 
        {
            this.row = row;
            this.col = col;
            this.isPart = isPart;
        }
    }

    public void solve(char[][] a) 
    {
        int n = a.length;
        int m = a[0].length;

        boolean visited[][] = new boolean[n][m];
    
        workRow(a,0,m,visited);
        workRow(a,n-1,m,visited);
        workCol(a,n,0,visited);
        workCol(a,n,m-1,visited);
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (a[i][j] == 'O' && visited[i][j] == false) 
                {
                    ArrayList<Pair> comp = new ArrayList<>();
                    island(a, i, j, n, m, comp, visited);
                    for (int k = 0; k < comp.size(); k++) 
                    {
                        Pair p = comp.get(k);
                        if (p.isPart == false)
                            a[p.row][p.col] = 'X';
                    }
                }
            }
        }
    }
    
    public void workRow(char a[][], int row, int col, boolean visited[][])
    {
        for (int j = 0; j < col; j++) 
        {
            if (a[row][j] == 'O' && visited[row][j] == false) 
            {
                ArrayList<Pair> comp = new ArrayList<>();
                island(a, row, j, a.length, a[0].length, comp, visited);
                for (int k = 0; k < comp.size(); k++) 
                {
                    Pair p = comp.get(k);
                    if (p.isPart == false)
                        a[p.row][p.col] = 'X';
                }
            }
        }
    }
    
    public void workCol(char a[][], int row, int col, boolean visited[][])
    {
        for (int j = 0; j < row; j++) 
        {
            if (a[j][col] == 'O' && visited[j][col] == false) 
            {
                ArrayList<Pair> comp = new ArrayList<>();
                island(a, j, col, a.length, a[0].length, comp, visited);
                for (int k = 0; k < comp.size(); k++) 
                {
                    Pair p = comp.get(k);
                    if (p.isPart == false)
                        a[p.row][p.col] = 'X';
                }
            }
        }
    }

    public void island(
        char a[][], int i, int j, int n, int m, ArrayList<Pair> comp, boolean visited[][]) {
        if (i < 0 || j < 0 || i > n - 1 || j > m - 1 || a[i][j] == 'X' || visited[i][j] == true)
            return;

        visited[i][j] = true;

        if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
            comp.add(new Pair(i, j, true));
        }

        else if ((i - 1 == 0 && a[i - 1][j] == 'O') || (i + 1 == n - 1 && a[i + 1][j] == 'O')
            || (j - 1 == 0 && a[i][j - 1] == 'O') || (j + 1 == m - 1 && a[i][j + 1] == 'O')) {
            comp.add(new Pair(i, j, true));
        }

        else if (comp.size() >= 1) {
            if (comp.get(comp.size() - 1).isPart == true)
                comp.add(new Pair(i, j, true));

            else
                comp.add(new Pair(i, j, false));

        } else
            comp.add(new Pair(i, j, false));

        island(a, i - 1, j, n, m, comp, visited);
        island(a, i + 1, j, n, m, comp, visited);
        island(a, i, j - 1, n, m, comp, visited);
        island(a, i, j + 1, n, m, comp, visited);
    }
}