public class Rock extends  Piece {
    public boolean isLegalMove (Position a, Position b){
        return (Math.abs(a.x-b.x)==0 || Math.abs(a.y-b.y)== 0);
    }
}
