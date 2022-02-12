class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            if (queue.contains(endWord)) {
                return level;
            }
            for (int k = 0; k < size; k++) {
                String cur = queue.poll();
                StringBuilder sb = new StringBuilder(cur);
                for (int i = 0; i < cur.length(); i++) {
                    for (char j = 'a'; j <= 'z'; j++) {
                        sb.setCharAt(i, j);
                        if (dic.contains(sb.toString())) {
                            queue.offer(sb.toString());
                            dic.remove(sb.toString()); //remove for not creating duplicate results
                        }
                    }
                    sb.setCharAt(i, cur.charAt(i));
                }
            }
        }
        return 0;
    }
}