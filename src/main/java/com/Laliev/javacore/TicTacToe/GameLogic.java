package com.Laliev.javacore.TicTacToe;

import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);
    GameLogic(){}

    public void start() {
        boolean p1Active = true;
        String msg;
        while ((msg = checkWinner()) == null) {
            printField();
            if (p1Active) makeMove(field.s1);
            else makeMove(field.s2);
            p1Active = p1Active? false :  true;
        }
        printField();
        System.out.println(msg);
    }
//    012
//    345
//    678
    private String checkWinner() {
        boolean isFilled = true;
        int[][] winPos = {{0,1,2},{3,4,5},{6,7,8},{1,4,7},{0,3,6},{2,5,8},{0,4,8},{2,4,6}};
        for (int i = 0; i < 8; i++){
            if (       field.getVal(winPos[i][0]) == field.getVal(winPos[i][1])
                    && field.getVal(winPos[i][1]) == field.getVal(winPos[i][2]))
                return field.getVal(winPos[i][0]) == field.s1? "Первый игрок победил!" : "Второй игрок победил!";
            if(Character.isDigit(field.getVal(i))) isFilled = false;
        }
        if(isFilled) return "Ничья!";
        return  null;
    }

    private void makeMove(char sym) {
        int input;
        do{
            System.out.print("Введите ячейку(1-9): ");
            input = scanner.nextInt() - 1;
        }while(!validateInput(input));
        field.setVal(input, sym);
    }

    private boolean validateInput(int input) {
        if(input >= 0 && input <= 8 && Character.isDigit(field.getVal(input)))
            return true;
        return false;
    }

    private void printField(){
        for(int i = 0; i<9; i+=3)
            System.out.format("%c%c%c\n", field.getVal(i), field.getVal(i+1), field.getVal(i+2));
    }
}


