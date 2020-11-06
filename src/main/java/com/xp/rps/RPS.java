package com.xp.rps;

import static com.xp.rps.Result.P2_WINS;
import static com.xp.rps.Result.*;
public class RPS {
    public static Result play(Throw p1, Throw p2) {

        if (p1 == Throw.PAPER && p2 == Throw.ROCK || p1 == Throw.ROCK && p2 == Throw.SCISSOR || p1 == Throw.SCISSOR && p2 == Throw.PAPER) {
            return P1_WINS;
        }

        if (p1 == Throw.PAPER && p2 == Throw.SCISSOR || p1 == Throw.SCISSOR && p2 == Throw.ROCK || p1 == Throw.ROCK && p2 == Throw.PAPER) {
            return P2_WINS;
        }

        if (p1 == Throw.PAPER && p2 == Throw.PAPER || p1 == Throw.ROCK && p2 == Throw.ROCK || p1 == Throw.SCISSOR && p2 == Throw.SCISSOR) {
            return DRAW;
        }
        return null;
    }
}