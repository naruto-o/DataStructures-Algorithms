public class Queen_permutation {
    public static void main(String[] args) {
        int n =4;
        int tq =2;
        boolean [] board = new boolean[n];
        Printanswer(board, tq, "", 0);
    }
  public static void Printanswer(boolean[]board,int tq,String ans,int qpsf){
            if (qpsf == tq) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < board.length; i++) {
                if (board[i]==false) {
                    board[i] = true;
                    Printanswer(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1);//b0q0,b0q0b1q1,b0q0b2q1,boqob3q1
                    
                }
            }

    }
}
