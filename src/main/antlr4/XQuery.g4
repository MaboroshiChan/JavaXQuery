grammar XQuery ;
import XPath;

/*Rules*/

xq
    :   var
    |   STRING
    |   ap
    |   LPR xq RPR
    |   xq ',' xq
    |   xq '/' rp
    |   xq '//' rp
    |   '<' NAME '>' '{' xq '}' '<''/' NAME '>'
    |   forClause letClause? whereClause? returnClause
    |   letClause xq
    ;

var
    : '$' NAME WS*
    ;

forClause
    : 'for' WS* (var 'in' WS*  xq WS* ',' WS* )* var 'in' WS* xq;

letClause
    :'let' WS* (var WS* ':=' WS* xq WS* ',' WS* )* var ':=' WS* xq
    ;

whereClause
    : 'where' WS* cond
    ;

returnClause
    : 'return' WS* xq
    ;

cond
    :   xq WS* '=' WS* xq
    |   xq  WS* 'eq' WS* xq
    |   xq  WS* '==' WS* xq
    |   xq WS* 'is' WS*  xq
    |   'empty' WS* LPR WS* xq WS* RPR
    |   'some' WS* var 'in' WS* xq (WS* ',' WS*  var WS*  'in' WS* xq)* 'satisfies' WS* cond
    |   LPR cond RPR
    |   cond WS* 'and' WS* cond
    |   cond  WS* 'or' WS* cond
    |   'not' WS* cond
    ;



/*Tokens*/
STRING
:
   '"'
   (
      ESCAPE
      | ~["\\]
   )* '"'
   | '\''
   (
      ESCAPE
      | ~['\\]
   )* '\''
;

ESCAPE
:
   '\\'
   (
      ['"\\]
   )
;

DOC: 'document';
LPR: '(';
RPR: ')';
NAME: [a-zA-Z0-9_-]+;
TXT: 'text()';

WS: [ \t\r\n]+ -> skip;