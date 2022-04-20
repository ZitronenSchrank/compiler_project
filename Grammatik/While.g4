grammar While;

prog            : (defFunction | statement)* EOF;

read            : READ '(' ')'
                ;

write           : WRITE '(' ID (',' ID)* ')' SEMICOLON
                ;

succ            : SUCC '(' ID ')' SEMICOLON
                ;

pred            : PRED '(' ID ')' SEMICOLON
                ;

callFunction    : ID '(' callParameters ')'
                ;

defFunction     : DEFINE ID '(' defParameters ')' BEGIN ':' (statement)* retStatement END
                | DEFINE ID '(' defParameters ')' SEMICOLON
                | ID '(' defParameters ')' BEGIN ':' (statement)* retStatement END
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
                | read
                | ID
                | NUM 
                ;

statement       : succ
                | pred
                | whl
                | loop
                | defVar
                | write
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