INSERT INTO languages
    (id, name) VALUES
(1, 'English'),
(2, 'Norwegian'),
(3, 'Czech');

INSERT INTO keys
(id, name) VALUES
(1, 'gui.employee.first_name'),
(2, 'gui.employee.last_name'),
(3, 'gui.employee.address');

INSERT INTO translations
(key_id, language_id, value) VALUES
(1, 1, 'First name'),
(1, 2, 'Last name'),
(1, 3, 'Address'),
(2, 1, 'Ime'),
(2, 2, 'Prezime'),
(2, 3, 'Adresa'),
(3, 1, 'Jméno'),
(3, 2, 'Příjmení'),
(3, 3, 'Adresa');
