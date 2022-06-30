class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> colList = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();
        
        //eg. matrix = [[1,1,1],[1,0,1],[1,1,1]]
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                if(matrix[i][j]==0){
                    // Add column no. to the list if not present already
                    if(!colList.contains(j)){
                        colList.add(j);
                    }
                    // Add row no. to the list if not present already
                    if(!rowList.contains(i)){
                        rowList.add(i);
                    }
                }
            }
        }
        
        // Set entire row 0
        for(int i=0;i<rowList.size();i++){
            for(int j=0;j<colSize;j++){
                matrix[rowList.get(i)][j]=0;
            }
        }
        
        // Set entire column 0
         for(int i=0;i<rowSize;i++){
            for(int j=0;j<colList.size();j++){
                matrix[i][colList.get(j)]=0;
            }
        }      
    }
}