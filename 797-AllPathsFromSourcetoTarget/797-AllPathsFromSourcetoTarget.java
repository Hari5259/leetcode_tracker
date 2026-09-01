// Last updated: 9/1/2026, 9:36:55 AM
1class Solution {
2
3    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6
7        List<Integer> path = new ArrayList<>();
8
9        path.add(0);
10
11        dfs(graph, 0, path, ans);
12
13        return ans;
14    }
15
16    public void dfs(int[][] graph, int node,
17                    List<Integer> path,
18                    List<List<Integer>> ans) {
19
20        if(node == graph.length - 1) {
21
22            ans.add(new ArrayList<>(path));
23
24            return;
25        }
26
27        for(int next : graph[node]) {
28
29            path.add(next);
30
31            dfs(graph, next, path, ans);
32
33            path.remove(path.size() - 1);
34        }
35    }
36}