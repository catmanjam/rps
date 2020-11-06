package com.xp.rps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RpsApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void play(){
		ResponseEntity<Round> response = restTemplate.postForEntity("/play",new Round(Throw.ROCK, Throw.PAPER),Round.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(Result.P2_WINS, response.getBody().getResult());
	}

	@Test
	void createGame() {
		ResponseEntity<Integer> response = restTemplate.postForEntity("/game", new Game ("jm", "mj", 1,"Buy $5 coffee"),Integer.class);
		int gameId = response.getBody();
		ResponseEntity<Game> response2 = restTemplate.getForEntity("/game/"+gameId, Game.class);
		Game g = response2.getBody();
		assertEquals("jm", g.getPlayer1());
		ResponseEntity<Integer> response3 = restTemplate.postForEntity("/game/"+gameId+"/round", new Round(Throw.PAPER,Throw.ROCK), Integer.class);
		int roundId = response3.getBody();
	}
}
