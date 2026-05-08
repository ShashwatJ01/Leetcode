class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>(); 

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                int curr = board[i][j];

                if(curr == '.'){
                    continue; 
                }

                String row = curr + " in row " + i; 
                String col = curr + " in col " + j; 
                String box = curr + " in box " + (i/3) + " ," + (j / 3); 

                if(seen.contains(row) || seen.contains(col) || seen.contains(box)){
                    return false; 
                }

                seen.add(row); 
                seen.add(col); 
                seen.add(box); 
            }
        }

        return true; 
    }
}