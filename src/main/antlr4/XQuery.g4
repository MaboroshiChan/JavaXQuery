grammar XQuery;
import XPath;

// Parser Rules
xq: primaryXq ( (COMMA | SLASH | DOUBLE_SLASH) xq )?
    | '<' STRING '>' WS* '{' WS* xq WS* '}' WS* '</' STRING '>'
    | forClause letClause whereClause returnClause
    | letClause primaryXq ( (COMMA | SLASH | DOUBLE_SLASH) xq )?;

primaryXq: Var | ap | LPAREN xq RPAREN;

// for binding list
forClause: FOR varBindings;

varBindings: varBinding (COMMA varBinding)*;
varBinding: Var IN xq;

// let binding listener
letClause: LET varBindings;

whereClause: WHERE cond WS* | ;
returnClause: RETURN xq WS*;

cond: primaryCond ( (AND | OR) cond )?
    | NOT cond
    | 'some' Var IN xq 'satisfies' cond
    | LPAREN cond RPAREN;

primaryCond: xq (EQ | IS | DOUBLE_EQUALS | EQUALS) xq;

// Lexer Rules
// Variables
Var: '$' STRING WS*;

// Keywords
FOR: 'for' WS*;
WHERE: 'where' WS*;
IN: 'in' WS*;
RETURN: 'return' WS*;
LET: 'let' WS*;