create table if not exists blacklist
(
    id                int8 primary key not null,
    first_name        varchar(100),
    last_name         varchar(100),
    date_of_including timestamp,
    sum_of_debt       varchar(100),
    passport_number   varchar(20)
);

create sequence blacklist_sequence;

INSERT INTO blacklist (id, first_name, last_name, date_of_including, sum_of_debt, passport_number)
VALUES (nextval('blacklist_sequence'), 'Иван', 'Иванов', '2023-04-28 10:30:00', '10000', 'АБ123456'),
       (nextval('blacklist_sequence'), 'Елена', 'Петрова', '2023-04-29 15:45:00', '5000', 'ВГ789012'),
       (nextval('blacklist_sequence'), 'Дмитрий', 'Смирнов', '2023-04-30 11:20:00', '15000', 'ДЕ345678'),
       (nextval('blacklist_sequence'), 'Анна', 'Кузнецова', '2023-05-01 14:10:00', '8000', 'ЖЗ901234'),
       (nextval('blacklist_sequence'), 'Михаил', 'Попов', '2023-05-02 09:00:00', '12000', 'ИЙ567890'),
       (nextval('blacklist_sequence'), 'Екатерина', 'Новикова', '2023-05-03 12:30:00', '7000', 'КЛ123456'),
       (nextval('blacklist_sequence'), 'Александр', 'Морозов', '2023-05-04 16:15:00', '9000', 'МН789012'),
       (nextval('blacklist_sequence'), 'Ольга', 'Волкова', '2023-05-05 13:00:00', '11000', 'ОП345678'),
       (nextval('blacklist_sequence'), 'Константин', 'Лебедев', '2023-05-06 10:45:00', '6000', 'РС901234'),
       (nextval('blacklist_sequence'), 'Татьяна', 'Соколова', '2023-05-07 14:20:00', '1000', 'ТУ567890'),
       (nextval('blacklist_sequence'), 'Игорь', 'Павлов', '2023-05-08 11:10:00', '17000', 'ФХ123456'),
       (nextval('blacklist_sequence'), 'Наталья', 'Семенова', '2023-05-09 16:00:00', '2000', 'ЦЧ789012'),
       (nextval('blacklist_sequence'), 'Владимир', 'Голубев', '2023-05-10 12:45:00', '13000', 'ШЩ345678'),
       (nextval('blacklist_sequence'), 'Анастасия', 'Виноградова', '2023-05-11 09:30:00', '4000', 'ЪЫ901234'),
       (nextval('blacklist_sequence'), 'Максим', 'Куликов', '2023-05-12 14:15:00', '1500', 'ЭЮ567890'),
       (nextval('blacklist_sequence'), 'Евгения', 'Александрова', '2023-05-13 11:05:00', '18000', 'ЯА123456')