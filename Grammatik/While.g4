grammar While;

prog            : (decFunction | defFunction | statement)* EOF;

read            : READ '(' ')'
                ;

write           : WRITE '(' defParameters ')' SEMICOLON
                ;

succ            : SUCC '(' ID ')' SEMICOLON
                ;

pred            : PRED '(' ID ')' SEMICOLON 
                ;

callFunction    : ID '(' callParameters ')'
                ; 

defFunction     : DEFINE ID '(' defParameters ')' BEGIN COLON (statement)* retStatement END
                | ID '(' defParameters ')' BEGIN COLON (statement)* retStatement END
                ;

decFunction     : DEFINE ID '(' defParameters ')' SEMICOLON
                ;

defVar          : VARIABLE ID ASSIGN expr SEMICOLON
                ;

defParameters   : ID (',' ID)*
                ;

callParameters  : (ID | NUM) (',' (ID | NUM))*
                ;

whl             : WHILE '(' ID ')' BEGIN COLON (statement)* END
                ;

loop            : LOOP '(' ID ')' BEGIN COLON (statement)* END
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

retStatement    : RETURN ID SEMICOLON;

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
COLON: ':';
EQUAL: '=';
COMMA: ',';
ASSIGN: COLON EQUAL;
SEMICOLON: ';';
MINUS: '-';
PLUS: '+';

ID: [a-zA-Z_][a-zA-Z0-9_-]*;
NUM: '0' | [1-9][0-9]*;

COMMENT: '//' ~[\r\n]* -> skip;
WS : ([\t\n\r]|' ')+ -> skip;