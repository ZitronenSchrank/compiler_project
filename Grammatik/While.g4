grammar While;

prog            : (defFunction)* (statement)+ EOF;

// Read/Write mit beliebig vielen Parametern
read            : READ '(' callParameters ')' SEMICOLON
                ;

write           : WRITE '(' callParameters ')' SEMICOLON
                ;

succ            : SUCC '(' ID ')' SEMICOLON
                ;

pred            : PRED '(' ID ')' SEMICOLON
                ;

callFunction    : ID '(' callParameters ')'
                ;

defFunction     : DEFINE ID '(' defParameters ')' BEGIN ':' (statement)* retStatement END
                ;

defVar          : VARIABLE assign
                ;

defParameters   : ID (',' ID)*
                ;

callParameters  : (ID | NUM) (',' (ID | NUM))*
                ;

whl             : WHILE '(' ID ')' BEGIN ':' (statement)* END
                ;

loop            : LOOP '(' ID ')' BEGIN ':' (statement)* END
                ;

assign          : ID ASSIGN expr SEMICOLON
                ;

expr            : callFunction
                | ID
                | NUM 
                ;

statement       : read
                | write
                | succ
                | pred
                | whl
                | loop
                | defVar
                | assign;

retStatement    : 'return' ID SEMICOLON;

WRITE: 'write';
READ: 'read';
WHILE: 'while';
SUCC: 'succ';
PRED: 'pred';
LOOP: 'loop';
DEFINE: 'def';
VARIABLE: 'var';
BEGIN: 'begin';
END: 'end';
RETURN: 'return';
ASSIGN: ':=';
SEMICOLON: ';';

ID: [a-zA-Z][a-zA-Z0-9]*;
NUM: '0' | [1-9][0-9]*;