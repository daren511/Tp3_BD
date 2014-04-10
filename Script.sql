CREATE TABLE ArtisteDisques
  (
    NumeroArtiste NUMBER NOT NULL ,
    NumeroDisque  NUMBER NOT NULL
  ) ;
ALTER TABLE ArtisteDisques ADD CONSTRAINT ArtisteDisques_PK PRIMARY KEY
(
  NumeroArtiste, NumeroDisque
)
;

CREATE TABLE Artistes
  (
    NumeroArtiste NUMBER NOT NULL ,
    NomArtiste    VARCHAR2 (40) NOT NULL ,
    PrenomArtiste VARCHAR2 (40) ,
    Nationalite   VARCHAR2 (20)
  ) ;
ALTER TABLE Artistes ADD CONSTRAINT Artistes_PK PRIMARY KEY
(
  NumeroArtiste
)
;

CREATE TABLE Disques
  (
    NumeroDisque NUMBER NOT NULL ,
    TitreDisque  VARCHAR2 (40) NOT NULL ,
    Prix         NUMBER (2,4) ,
    NumGenre     NUMBER NOT NULL ,
    AnneeDisque  NUMBER ,
    Langue       VARCHAR2 (40) ,
    NbChansons   NUMBER
  ) ;
ALTER TABLE Disques ADD CONSTRAINT Disques_PK PRIMARY KEY
(
  NumeroDisque
)
;

CREATE TABLE Genres
  (
    NumGenre NUMBER NOT NULL ,
    NomGenre VARCHAR2 (40) NOT NULL
  ) ;
ALTER TABLE Genres ADD CONSTRAINT Genres_PK PRIMARY KEY
(
  NumGenre
)
;

ALTER TABLE ArtisteDisques ADD CONSTRAINT ArtisteDisques_Artistes_FK FOREIGN KEY ( NumeroArtiste ) REFERENCES Artistes ( NumeroArtiste ) ;

ALTER TABLE ArtisteDisques ADD CONSTRAINT ArtisteDisques_Disques_FK FOREIGN KEY ( NumeroDisque ) REFERENCES Disques ( NumeroDisque ) ;

ALTER TABLE Disques ADD CONSTRAINT Disques_Genres_FK FOREIGN KEY ( NumGenre ) REFERENCES Genres ( NumGenre ) ;