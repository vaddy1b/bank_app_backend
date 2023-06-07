create table if not exists consumer (
    id int8 primary key not null,
    first_name varchar(100),
    last_name varchar(100),
    phone_number varchar(15),
    passport_serial varchar(20),
    passport_who_give varchar(200),
    date_of_birth varchar(20),
    place_of_birth varchar(100),
    marital_status varchar(100),
    address_of_registration varchar(100),
    is_address_match boolean,
    education varchar(200),
    last_place_of_work varchar(100),
    period_of_work varchar(10),
    income_per_month int8,
    position_of_counsumer varchar (100)
    );

create sequence consumer_sequence start 4 increment 1;