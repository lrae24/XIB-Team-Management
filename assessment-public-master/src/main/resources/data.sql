
DROP TABLE IF EXISTS Managers;

CREATE TABLE Managers (
  id INT PRIMARY KEY ,
  last_name VARCHAR(250) NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  team_id INT DEFAULT 0
);
