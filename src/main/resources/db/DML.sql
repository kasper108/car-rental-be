INSERT INTO addresses (street_name, house_number, city, country, phone)
VALUES ('Žirmūnų', '2', 'Vilnius', 'Lietuva', '+37045687541');
INSERT INTO users (first_name, last_name, birth_date, address_id, admin, email, password)
VALUES ('Rapolas', 'Labutis', '1990-01-01', (SELECT max(id) FROM addresses), 1, 'admin@yahoo.com', 'gfdfgeghjisasdfghre');









