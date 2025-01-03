// https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            list.add(i);
        }

        int idx = 0;
        while (list.size() > 1) {
            int size = list.size();
            idx = (idx + k - 1) % size;
            list.remove(idx);
        }

        return list.get(0);
    }
}