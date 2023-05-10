package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color colour) {
		super(board, colour);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
