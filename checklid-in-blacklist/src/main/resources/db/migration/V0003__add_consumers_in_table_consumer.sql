insert into consumer (id,first_name,last_name,phone_number,
                      passport_serial,passport_who_give,date_of_birth,
                      place_of_birth,marital_status,address_of_registration,is_address_match,
                      education,last_place_of_work,period_of_work,income_per_month,position_of_counsumer)
values (1,'igor','volkov',89139997775,
        '0312 234532','russia ecfo','2000-05-04',
        'erevan','married','pononova 23-100',true,
        'high full', 'internet cafe','1.5 year',30000,'manager'),

       (2,'jasy','kiro',89119947765,
        '0F24 564531','tokio ecfo','1999-02-14',
        'hirosima','not married','valino 21-160',true,
        'high full', 'google','5 years',80000,'programmer'),

       (3,'kirill','rikin',84539991172,
        '8912 231131','belarus ecfo','1993-01-12',
        'minsk','married','kirkorova 70-189',false,
        'middle', 'call centre','2 years',45000,'caller');