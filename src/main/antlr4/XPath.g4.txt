grammar XPath;

// Parser Rules
ap: (FILENAME SLASH rp) | (FILENAME DOUBLE_SLASH rp);

rp: STRING
    | STAR
    | DOT
    | ATTNAME
    | LPAREN rp RPAREN
    | 'text()'
    | rp SLASH rp
    | rp DOUBLE_SLASH rp
    | rp LBRACKET f RBRACKET
    | rp COMMA rp
    ;

f: rp
    | rp EQUALS rp
    | rp EQ rp
    | rp DOUBLE_EQUALS rp
    | rp IS rp
    | LPAREN f RPAREN
    | rp EQUALS '"' STRING '"'
    | f AND f
    | f OR f
    | NOT f
    ;

// Lexer Rules
INT: [0-9]+;
STRING: [a-zA-Z0-9_\n]+;
FILENAME: 'doc(' '"' STRING '.xml' '"' ')';
SLASH: '/';
DOUBLE_SLASH: '//';
TAGNAME: STRING;
ATTNAME: '@' STRING;

// Operators and Symbols with Whitespace
STAR: '*';
DOT: '.';
EQUALS: WS* '=' WS*;
EQ: WS* 'eq' WS*;
DOUBLE_EQUALS: WS* '==' WS*;
IS: WS* 'is' WS*;
AND: WS* 'and' WS*;
OR: WS* 'or' WS*;
NOT: 'not' WS*;
LPAREN: '(';
RPAREN: ')';
LBRACKET: WS* '[' WS*;
RBRACKET: WS* ']' WS*;
COMMA: WS* ',' WS*;

// Whitespace
WS: [ \t\r\n]+;