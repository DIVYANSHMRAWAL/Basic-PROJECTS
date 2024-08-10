import java.util.Random;
import java.util.Scanner;

class TicTacToe{
    static char[][] board;

    public TicTacToe(){
        board=new char[3][3];
        initBoard();
    }

    void initBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
    }

    static void dispBoard(){

        System.out.println("-------------");
        for(int i=0;i<board.length;i++){
            System.out.print("| ");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

   static void placeMark(int row,int col,char mark){
        if(row>=0 && row<=2 && col>=0 && col<=2){
        board[row][col]=mark;
        }
        else{
            System.out.println("Invalid number.");
        }
    }

    static boolean CheckColWin(){
        for(int j=0;j<=2;j++){
            if(board[0][j]!=' '&& board[0][j]==board[1][j] && board[1][j]==board[2][j] ){
        return true;
            }
        }
        return false;
    }

    static boolean CheckRowWin(){
        for(int j=0;j<2;j++){
            if(board[j][0]!=' '&& board[j][0]==board[j][1] && board[j][1]==board[j][2]){
          return true;
            }
        }
        return false;
    }

    static boolean CheckDiagWin(){
    if (board[0][0]!=' '&& board[0][0]==board[1][1] && board[1][1]==board[2][2] || board[0][2]!=' '&& board[2][0]==board[1][1] && board[1][1]==board[0][2]) {
        return true;
    }

    else{
        return false;
    }
    }

    static boolean CheckDraw(){
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}

abstract class player{
    String name;
    char mark;

    abstract void makeMove();

    boolean isValidMove( int row ,int col){
        if(row>=0&& row<=2 && col>=0 && col<=2){
           if(TicTacToe.board[row][col]==' '){
               return true;
           }
        }
        return false;
       }

}

class HumanPlayer extends player{

    HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }

    void makeMove(){
    Scanner scan=new Scanner(System.in);
    int  row;
    int col;
do {
    System.out.println("Enter the row and column.");
    row=scan.nextInt();
    col=scan.nextInt();
} while (!isValidMove(row, col));
TicTacToe.placeMark(row, col, mark);

    }

}


class AIPlayer extends player{

    AIPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }

    void makeMove(){
    Scanner scan=new Scanner(System.in);
    int  row;
    int col;
do {
    Random r=new Random();
     row = r.nextInt(3);
     col =r.nextInt(3);

} while (!isValidMove(row, col));
TicTacToe.placeMark(row, col, mark);

    }
}


public class Tic_Tac_toe {

    public static void main (String[] args){
        TicTacToe t =new TicTacToe();
        HumanPlayer p1=new HumanPlayer("Your",'X');
        AIPlayer p2=new AIPlayer("AI", '0');
        

        player cp;
        cp=p1;
       while (true) {
        System.out.println(cp.name+"Turn");
        cp.makeMove();
        TicTacToe.dispBoard();
        if (TicTacToe.CheckColWin() || TicTacToe.CheckRowWin() || TicTacToe.CheckDiagWin()) {
            System.out.println(cp.name+"Has won.");
            break;
        }

         else if (TicTacToe.CheckDraw()) {
            System.out.println("Game is a draw.");
            break;
         }

        else{
            if(cp==p1){
                cp=p2;
            }
            else{
                cp=p1;
            }
        }
       }
    }
}