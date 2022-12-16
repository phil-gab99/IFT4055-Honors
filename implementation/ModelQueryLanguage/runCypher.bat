@ECHO OFF
SET file=%1%
SET cypher=%2%
SET protocol=%3%
SET host=%4%
SET port=%5%
SET uname=%6%
SET passwd=%7%
TYPE %file% | %cypher% -a "%protocol%://%host%:%port%" -u "%uname%" -p "%passwd%"
