package com.xp.rps;

import java.util.ArrayList;
import java.util.List;

public class Game {
    int id;
    String player1;
    String player2;
    int roundNo;
    String decision;

    List<Round> roundList = new ArrayList<>();

    public Game() {
    }

    public Game(String player1, String player2, int roundNo, String decision) {
        this.player1 = player1;
        this.player2 = player2;
        this.roundNo = roundNo;
        this.decision = decision;
    }

    public Game(int id, String player1, String player2, int round_no, String decision) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
        this.roundNo = roundNo;
        this.decision = decision;
    }

    public Result getResult(List<Round> roundList) {
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < roundList.size(); i++) {
            Round round = roundList.get(i);
            if (Result.P1_WINS.equals(round.getResult())) {
                p1++;
            } else if (Result.P2_WINS.equals(round.getResult())) {
                p2++;
            }
        }
        if (p1 > p2) {
            return Result.P1_WINS;
        } else if (p2 > p1) {
            return Result.P2_WINS;
        } else {
            return Result.DRAW;
        }
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public int getRoundNo() {
        return roundNo;
    }

    public void setRoundNo(int roundNo) {
        this.roundNo = roundNo;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public List<Round> getRoundList() {
        return roundList;
    }

    public void addRound(Round round) {
        roundList.add(round);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRountList(List<Round> roundList) { this.roundList = roundList;
    }
}
