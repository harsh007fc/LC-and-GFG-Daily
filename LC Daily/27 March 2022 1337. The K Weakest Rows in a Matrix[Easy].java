import java.util.*;

class Solution {
    //last occurence inx se number pta lg jayega
    //return occurence of 1 in array or next to last index of 1 in a row
	private int search(int[] input) {
		int l = 0;
		int r = input.length;//yahaan - 1 nhi kr rhe hum
		int mid;
		while (l < r) {
			mid = l + (r - l) / 2;
            // System.out.println(mid + "mid ");
			if (input[mid] == 1) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
        // System.out.println(l);
		return l;
	}
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
		for (int i = 0; i < mat.length; i++) {
			minHeap.add(new int[] { i, search(mat[i]) });
		}
		int[] ans = new int[k];
		for (int i = 0; i < k; i++) {
			ans[i] = minHeap.poll()[0];
		}
		return ans;
    }
}