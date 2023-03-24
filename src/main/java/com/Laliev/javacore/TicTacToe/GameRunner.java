package com.Laliev.javacore.TicTacToe;

public class GameRunner {
    public static void main(String[] args) {

        boolean p1Turn = true;
        GameLogic logic = new GameLogic();
        Field field = logic.field;
        String  p1Msg = "Игрок1 ставит Х, выберете номер ячейки: ",
                p2Msg = "Игрок2 ставит O, выберете номер ячейки: ";
        while(!logic.IsGameOver()){
            if(p1Turn){
                if(logic.MakeCorrectMove(p1Msg, 'X')){
                    p1Turn = false;
                    if(logic.IsWin()){
                        System.out.println("Игрок1(X) победил:");
                        field.PrintField();
                        break;
                    }
                }
                else continue;
            }
            else {
                if (logic.MakeCorrectMove(p2Msg, 'O')) {
                    p1Turn = true;
                    if (logic.IsWin()) {
                        System.out.println("Игрок2(O) победил:");
                        field.PrintField();
                        break;
                    }
                }
                else continue;
            }
            field.PrintField();
        }
        if(logic.draw)
            System.out.println("Ничья ¯\\_(ツ)_/¯");
    }
}
