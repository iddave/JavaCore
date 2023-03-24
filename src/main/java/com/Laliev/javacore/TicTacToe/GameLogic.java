package com.Laliev.javacore.TicTacToe;

import java.util.Scanner;

public class GameLogic {
    Field field;
    boolean draw = true;
    GameLogic(){
        field = new Field();
    }

    public boolean IsGameOver(){
        boolean emptySpace = false;
        for(char c : field.gameField){
            if(Character.isDigit(c)) emptySpace = true;
        }
        if(emptySpace) return false;
        return true;
    }
//    012
//    345
//    678
    public boolean IsWin(int p){
        char[] f = field.gameField;
        if(     (f[0] == f[1] && f[0]==f[2]) ||
                (f[3] == f[4] && f[3]==f[5]) ||
                (f[6] == f[7] && f[6]==f[8]) ||
                (f[0] == f[3] && f[0]==f[6]) ||
                (f[1] == f[4] && f[1]==f[7]) ||
                (f[2] == f[5] && f[2]==f[8]) ||
                (f[0] == f[4] && f[0]==f[8]) ||
                (f[2] == f[4] && f[2]==f[6]))
        {

            System.out.format("Игрок%d победил:\n", p);
            field.PrintField();
            draw=false;
            return true;
        }
        return false;
    }

    boolean RegisterMove(int i, char c){
        if(field.gameField[i] == 'X' || field.gameField[i] == 'O')
        {
            System.out.println("Выберете другую клетку");
            return false;
        }
        field.gameField[i] = c;
        return true;
    }

    public int GetCorrectInput(String msg){
        Scanner in = new Scanner(System.in);
        int pos;
        while(true)
            try {
                System.out.print(msg);
                pos = in.nextInt();
                //in.close();
                return --pos;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Некорректный ввод, введите еще раз номер(1-9)");
            }
    }

    public boolean MakeCorrectMove(String msg, char sym){
        int pos = GetCorrectInput(msg);
        if((pos>0 || pos<8) && RegisterMove(pos, sym))
            return true;
        else System.out.println("Туда нельзя поставить, выберете другой номер ячейки:");
            return false;
    }
}
