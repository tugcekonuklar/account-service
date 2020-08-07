-- CREATE LOAN APPLICATIONS TABLE
CREATE TABLE IF NOT EXISTS money_transfers
(
    id                BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    sender            VARCHAR(100) NOT NULL,
    amount  	        BIGINT NOT NULL,
    receiver          VARCHAR(100) NOT NULL,
    status            VARCHAR(100) NOT NULL,
    created_at        TIMESTAMP WITH TIME ZONE NOT NULL
);
