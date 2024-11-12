class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                list.add(matrix[i][j]);
            }
        }
        if(list.contains(target))
        {
            return true;
        }
        return false;
    }
}