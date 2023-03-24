package com.Laliev.javacore.TicTacToe;

public class Field {
    public char[] gameField;
    Field(){
        gameField = new char[9];
        for(int i = 0; i<9; i++){
            gameField[i] = (char)(i+1+'0');
        }
        PrintField();
    }

    public void PrintField(){
        for(int i = 0; i<9; i+=3)
            System.out.format("%c%c%c\n", gameField[i], gameField[i+1], gameField[i+2]);
    }


}
