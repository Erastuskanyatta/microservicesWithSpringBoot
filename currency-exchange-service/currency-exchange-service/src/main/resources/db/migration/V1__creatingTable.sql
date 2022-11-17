CREATE TABLE exchangevalue(
                        id          bigint(20) not null AUTO_INCREMENT,
                        currency_from          varchar(50) not null,
                        currency_to           varchar(50) not null,
                        conversion_multiple               varchar(50) not null,
                        port             int(50) not null,
                        primary key (id)
)   ENGINE=InnoDB DEFAULT CHARSET=utf8;