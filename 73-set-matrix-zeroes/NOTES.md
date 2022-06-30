​Solution 1:

Approach: **Using brute force**
Time Complexity:O((N*M)*(N + M)). O(N*M) for traversing through each element and (N+M)for traversing to row and column of elements having value 0.

Space Complexity:O(1)

Approach: **Better approach** using two dummy array

Time Complexity: O(N*M + N*M)

Space Complexity: O(N)

Approach: **Optimizing the better approach.**
Instead of taking two separate dummy array,take first row and column of the matrix as the array for checking whether the particular column or row has the value 0 or not.Since matrix[0][0] are overlapping.Therefore take separate variable col0(say) to check if the 0th column has 0 or not and use matrix[0][0] to check if the 0th row has 0 or not.Now traverse from last element to the first element and check if matrix[i][0]==0 || matrix[0][j]==0 and if true set matrix[i][j]=0,else continue.

Time Complexity: O(2*(N*M)), as we are traversing two times in a matrix,

Space Complexity: O(1). 
