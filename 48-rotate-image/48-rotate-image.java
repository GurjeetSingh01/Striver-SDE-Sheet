class Solution{
public void rotate(int[][] matrix){
for(int i =0; i<=matrix.length-1; i++){
for(int j =i; j<matrix[0].length; j++){
int temp = matrix[i][j];
matrix[i][j] = matrix[j][i];
matrix[j][i] = temp;
}}

// rvrse evry rw in the matrix 
for(int row = 0; row<matrix.length; row++){
int i =0; 
int j = matrix[0].length -1;
while(i<j){
int temp = matrix[row][i];
matrix[row][i] = matrix[row][j];
matrix[row][j] = temp;
i++;
j--;
}}}}
