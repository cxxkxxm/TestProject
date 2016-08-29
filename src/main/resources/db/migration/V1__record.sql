CREATE TABLE record (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  date VARCHAR(255) NOT NULL,
  stock VARCHAR(255) NOT NULL,
  symbol VARCHAR(255) NOT NULL,
  currency VARCHAR(255) NOT NULL,
  buyprice DOUBLE PRECISION NOT NULL,
  stocksize DOUBLE PRECISION NOT NULL,
  networth DOUBLE PRECISION NOT NULL,
  comments VARCHAR(255) NOT NULL
);

insert into record (date, stock, symbol, currency, buyprice, stocksize, networth, comments) values ('May 20', 'Apple', 'AAPL', 'USD', 50.00, 100.00, 5000.00, 'Apple Inc. Stock');
insert into record (date, stock, symbol, currency, buyprice, stocksize, networth, comments) values ('June 20', 'Alibaba', 'BABA', 'CNY', 1000.00, 1000.00, 1000000.00, 'Alibaba Corp. Stock');
insert into record (date, stock, symbol, currency, buyprice, stocksize, networth, comments) values ('July 20', 'Bayerische Moteren Werke AG', 'BMW', 'EUR', 100.00, 10.00, 1000.00, 'Little-to-no Idea Stock');
insert into record (date, stock, symbol, currency, buyprice, stocksize, networth, comments) values ('August 20', 'Infosys', 'INFY', 'INR', 1500.00, 1000.00, 1500000.00, 'InfoSYS Stock');