package com.xp.rps;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

//@Repository
public class InMemoryRepo implements RpsRepo {

    int id = 0;
    HashMap<Integer,Game> games = new HashMap<>();

    @Override
    public int createGame(Game game) {
        game.setId(++id);
        games.put(id,game);
        return game.getId();
    }

    @Override
    public Game getGame(int gameId) {
        return games.get(gameId);
    }

    @Override
    public int addRound(int gameId, Round round) {
        Game game = games.get(gameId);
        int roundNo=id++;
        round.setId(id);
        game.addRound(round);
        return roundNo;
    }
}
