package com.Laliev.javacore.TicTacToe;

public class Field {
    private char[] gameField;
    public final char s1 = 'X', s2 = 'O';

    public char getVal(int pos){ return gameField[pos]; }
    public void setVal(int pos, char sym){ gameField[pos] = sym; }
    Field(){
        gameField = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
