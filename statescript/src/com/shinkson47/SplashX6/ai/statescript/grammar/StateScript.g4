grammar StateScript;
import Java;

// KEYWORDS
STATE		: 'state';
BEHAVIOUR	: 'behaviour';
ENTER		: 'enter';
EXIT		: 'exit';
CODE		: 'code';

NAME 		: 'name';
DESCRIPTION	: 'description';

FROM 		: 'from';
TO 			: 'to';

// ignore whitespace & comments.
WS : (' ' | '\t' | '\n')+ -> skip;
CMT: COMMENT -> channel(HIDDEN);

name: NAME ASSIGN Identifier SEMI;
description: DESCRIPTION ASSIGN StringLiteral SEMI;

defaultState: DEFAULT ASSIGN Identifier SEMI;

behaviour   : BEHAVIOUR block;
enterScript : ENTER block;
exitScript  : EXIT block;

code:
	CODE
	classBody
	;

switchState: SWITCH FROM Identifier TO Identifier (IF parExpression)? SEMI;

state: STATE Identifier
	LBRACE
	behaviour
	enterScript?
	exitScript?
	RBRACE;

script:
	name
	description?
	defaultState

	(code|state|switchState)*;