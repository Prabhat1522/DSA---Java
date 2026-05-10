public class OOPS {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Rook r= new Rook();
        r.moves();

    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal- by 1 steps ");
    }
}
