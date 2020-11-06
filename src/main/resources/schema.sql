CREATE TABLE IF NOT EXISTS GAME(
    id int auto_increment primary key,
    PLAYER1 VARCHAR(255) NOT NULL,
    PLAYER2 VARCHAR(255) NOT NULL,
    ROUND_NO INT NOT NULL,
    DECISION VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS ROUND(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    GAME_ID INT NOT NULL,
    THROW1 VARCHAR(255) NOT NULL,
    THROW2 VARCHAR(255) NOT NULL,
    RESULT VARCHAR(255) NOT NULL
);