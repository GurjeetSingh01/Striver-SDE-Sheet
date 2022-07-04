class Solution {
   public void merge(int[] A, int m, int[] B, int n) {
	for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
		if (a >= 0 && A[a] > B[b]) A[i] = A[a--]; 
		else A[i] = B[b--];
	}        
}
}