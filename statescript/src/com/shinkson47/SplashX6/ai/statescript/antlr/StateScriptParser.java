// Generated from /Volumes/The Vault/Workspaces/Java/SplashX6/statescript/src/com/shinkson47/SplashX6/ai/statescript/grammar/StateScript.g4 by ANTLR 4.9.1
package com.shinkson47.SplashX6.ai.statescript.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATE=1, BEHAVIOUR=2, ENTER=3, EXIT=4, CODE=5, NAME=6, DESCRIPTION=7, 
		FROM=8, TO=9, WS=10, CMT=11, ABSTRACT=12, ASSERT=13, BOOLEAN=14, BREAK=15, 
		BYTE=16, CASE=17, CATCH=18, CHAR=19, CLASS=20, CONST=21, CONTINUE=22, 
		DEFAULT=23, DO=24, DOUBLE=25, ELSE=26, ENUM=27, EXTENDS=28, FINAL=29, 
		FINALLY=30, FLOAT=31, FOR=32, IF=33, GOTO=34, IMPLEMENTS=35, IMPORT=36, 
		INSTANCEOF=37, INT=38, INTERFACE=39, LONG=40, NATIVE=41, NEW=42, PACKAGE=43, 
		PRIVATE=44, PROTECTED=45, PUBLIC=46, RETURN=47, SHORT=48, STATIC=49, STRICTFP=50, 
		SUPER=51, SWITCH=52, SYNCHRONIZED=53, THIS=54, THROW=55, THROWS=56, TRANSIENT=57, 
		TRY=58, VOID=59, VOLATILE=60, WHILE=61, IntegerLiteral=62, FloatingPointLiteral=63, 
		BooleanLiteral=64, CharacterLiteral=65, StringLiteral=66, NullLiteral=67, 
		LPAREN=68, RPAREN=69, LBRACE=70, RBRACE=71, LBRACK=72, RBRACK=73, SEMI=74, 
		COMMA=75, DOT=76, ASSIGN=77, GT=78, LT=79, BANG=80, TILDE=81, QUESTION=82, 
		COLON=83, EQUAL=84, LE=85, GE=86, NOTEQUAL=87, AND=88, OR=89, INC=90, 
		DEC=91, ADD=92, SUB=93, MUL=94, DIV=95, BITAND=96, BITOR=97, CARET=98, 
		MOD=99, ADD_ASSIGN=100, SUB_ASSIGN=101, MUL_ASSIGN=102, DIV_ASSIGN=103, 
		AND_ASSIGN=104, OR_ASSIGN=105, XOR_ASSIGN=106, MOD_ASSIGN=107, LSHIFT_ASSIGN=108, 
		RSHIFT_ASSIGN=109, URSHIFT_ASSIGN=110, Identifier=111, AT=112, ELLIPSIS=113, 
		COMMENT=114, LINE_COMMENT=115;
	public static final int
		RULE_name = 0, RULE_description = 1, RULE_defaultState = 2, RULE_behaviour = 3, 
		RULE_enterScript = 4, RULE_exitScript = 5, RULE_code = 6, RULE_switchState = 7, 
		RULE_state = 8, RULE_script = 9, RULE_compilationUnit = 10, RULE_packageDeclaration = 11, 
		RULE_importDeclaration = 12, RULE_typeDeclaration = 13, RULE_classOrInterfaceDeclaration = 14, 
		RULE_classOrInterfaceModifiers = 15, RULE_classOrInterfaceModifier = 16, 
		RULE_modifiers = 17, RULE_classDeclaration = 18, RULE_normalClassDeclaration = 19, 
		RULE_typeParameters = 20, RULE_typeParameter = 21, RULE_typeBound = 22, 
		RULE_enumDeclaration = 23, RULE_enumBody = 24, RULE_enumConstants = 25, 
		RULE_enumConstant = 26, RULE_enumBodyDeclarations = 27, RULE_interfaceDeclaration = 28, 
		RULE_normalInterfaceDeclaration = 29, RULE_typeList = 30, RULE_classBody = 31, 
		RULE_interfaceBody = 32, RULE_classBodyDeclaration = 33, RULE_memberDecl = 34, 
		RULE_memberDeclaration = 35, RULE_genericMethodOrConstructorDecl = 36, 
		RULE_genericMethodOrConstructorRest = 37, RULE_methodDeclaration = 38, 
		RULE_fieldDeclaration = 39, RULE_interfaceBodyDeclaration = 40, RULE_interfaceMemberDecl = 41, 
		RULE_interfaceMethodOrFieldDecl = 42, RULE_interfaceMethodOrFieldRest = 43, 
		RULE_methodDeclaratorRest = 44, RULE_voidMethodDeclaratorRest = 45, RULE_interfaceMethodDeclaratorRest = 46, 
		RULE_interfaceGenericMethodDecl = 47, RULE_voidInterfaceMethodDeclaratorRest = 48, 
		RULE_constructorDeclaratorRest = 49, RULE_constantDeclarator = 50, RULE_variableDeclarators = 51, 
		RULE_variableDeclarator = 52, RULE_constantDeclaratorsRest = 53, RULE_constantDeclaratorRest = 54, 
		RULE_variableDeclaratorId = 55, RULE_variableInitializer = 56, RULE_arrayInitializer = 57, 
		RULE_modifier = 58, RULE_packageOrTypeName = 59, RULE_enumConstantName = 60, 
		RULE_typeName = 61, RULE_type = 62, RULE_classOrInterfaceType = 63, RULE_primitiveType = 64, 
		RULE_variableModifier = 65, RULE_typeArguments = 66, RULE_typeArgument = 67, 
		RULE_qualifiedNameList = 68, RULE_formalParameters = 69, RULE_formalParameterDecls = 70, 
		RULE_formalParameterDeclsRest = 71, RULE_methodBody = 72, RULE_constructorBody = 73, 
		RULE_qualifiedName = 74, RULE_literal = 75, RULE_annotations = 76, RULE_annotation = 77, 
		RULE_annotationName = 78, RULE_elementValuePairs = 79, RULE_elementValuePair = 80, 
		RULE_elementValue = 81, RULE_elementValueArrayInitializer = 82, RULE_annotationTypeDeclaration = 83, 
		RULE_annotationTypeBody = 84, RULE_annotationTypeElementDeclaration = 85, 
		RULE_annotationTypeElementRest = 86, RULE_annotationMethodOrConstantRest = 87, 
		RULE_annotationMethodRest = 88, RULE_annotationConstantRest = 89, RULE_defaultValue = 90, 
		RULE_block = 91, RULE_blockStatement = 92, RULE_localVariableDeclarationStatement = 93, 
		RULE_localVariableDeclaration = 94, RULE_variableModifiers = 95, RULE_statement = 96, 
		RULE_catches = 97, RULE_catchClause = 98, RULE_catchType = 99, RULE_finallyBlock = 100, 
		RULE_resourceSpecification = 101, RULE_resources = 102, RULE_resource = 103, 
		RULE_formalParameter = 104, RULE_switchBlockStatementGroups = 105, RULE_switchBlockStatementGroup = 106, 
		RULE_switchLabel = 107, RULE_forControl = 108, RULE_forInit = 109, RULE_enhancedForControl = 110, 
		RULE_forUpdate = 111, RULE_parExpression = 112, RULE_expressionList = 113, 
		RULE_statementExpression = 114, RULE_constantExpression = 115, RULE_expression = 116, 
		RULE_assignmentOperator = 117, RULE_conditionalExpression = 118, RULE_conditionalOrExpression = 119, 
		RULE_conditionalAndExpression = 120, RULE_inclusiveOrExpression = 121, 
		RULE_exclusiveOrExpression = 122, RULE_andExpression = 123, RULE_equalityExpression = 124, 
		RULE_instanceOfExpression = 125, RULE_relationalExpression = 126, RULE_relationalOp = 127, 
		RULE_shiftExpression = 128, RULE_shiftOp = 129, RULE_additiveExpression = 130, 
		RULE_multiplicativeExpression = 131, RULE_unaryExpression = 132, RULE_unaryExpressionNotPlusMinus = 133, 
		RULE_castExpression = 134, RULE_primary = 135, RULE_identifierSuffix = 136, 
		RULE_creator = 137, RULE_createdName = 138, RULE_innerCreator = 139, RULE_arrayCreatorRest = 140, 
		RULE_classCreatorRest = 141, RULE_explicitGenericInvocation = 142, RULE_nonWildcardTypeArguments = 143, 
		RULE_typeArgumentsOrDiamond = 144, RULE_nonWildcardTypeArgumentsOrDiamond = 145, 
		RULE_selector = 146, RULE_superSuffix = 147, RULE_explicitGenericInvocationSuffix = 148, 
		RULE_arguments = 149;
	private static String[] makeRuleNames() {
		return new String[] {
			"name", "description", "defaultState", "behaviour", "enterScript", "exitScript", 
			"code", "switchState", "state", "script", "compilationUnit", "packageDeclaration", 
			"importDeclaration", "typeDeclaration", "classOrInterfaceDeclaration", 
			"classOrInterfaceModifiers", "classOrInterfaceModifier", "modifiers", 
			"classDeclaration", "normalClassDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumBody", "enumConstants", "enumConstant", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
			"memberDeclaration", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
			"methodDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDecl", "interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", 
			"methodDeclaratorRest", "voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", 
			"interfaceGenericMethodDecl", "voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", 
			"constantDeclarator", "variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
			"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
			"typeName", "type", "classOrInterfaceType", "primitiveType", "variableModifier", 
			"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
			"formalParameterDecls", "formalParameterDeclsRest", "methodBody", "constructorBody", 
			"qualifiedName", "literal", "annotations", "annotation", "annotationName", 
			"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
			"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
			"annotationConstantRest", "defaultValue", "block", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "variableModifiers", 
			"statement", "catches", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "formalParameter", "switchBlockStatementGroups", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "forUpdate", "parExpression", "expressionList", 
			"statementExpression", "constantExpression", "expression", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"instanceOfExpression", "relationalExpression", "relationalOp", "shiftExpression", 
			"shiftOp", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"unaryExpressionNotPlusMinus", "castExpression", "primary", "identifierSuffix", 
			"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
			"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
			"nonWildcardTypeArgumentsOrDiamond", "selector", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'state'", "'behaviour'", "'enter'", "'exit'", "'code'", "'name'", 
			"'description'", "'from'", "'to'", null, null, "'abstract'", "'assert'", 
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", 
			"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
			"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
			"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
			"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
			"'void'", "'volatile'", "'while'", null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATE", "BEHAVIOUR", "ENTER", "EXIT", "CODE", "NAME", "DESCRIPTION", 
			"FROM", "TO", "WS", "CMT", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", 
			"BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
			"FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
			"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
			"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
			"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
			"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "StateScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(StateScriptParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(NAME);
			setState(301);
			match(ASSIGN);
			setState(302);
			match(Identifier);
			setState(303);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(StateScriptParser.DESCRIPTION, 0); }
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public TerminalNode StringLiteral() { return getToken(StateScriptParser.StringLiteral, 0); }
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(DESCRIPTION);
			setState(306);
			match(ASSIGN);
			setState(307);
			match(StringLiteral);
			setState(308);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultStateContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(StateScriptParser.DEFAULT, 0); }
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public DefaultStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterDefaultState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitDefaultState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitDefaultState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStateContext defaultState() throws RecognitionException {
		DefaultStateContext _localctx = new DefaultStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defaultState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(DEFAULT);
			setState(311);
			match(ASSIGN);
			setState(312);
			match(Identifier);
			setState(313);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BehaviourContext extends ParserRuleContext {
		public TerminalNode BEHAVIOUR() { return getToken(StateScriptParser.BEHAVIOUR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterBehaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitBehaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitBehaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviourContext behaviour() throws RecognitionException {
		BehaviourContext _localctx = new BehaviourContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_behaviour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(BEHAVIOUR);
			setState(316);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnterScriptContext extends ParserRuleContext {
		public TerminalNode ENTER() { return getToken(StateScriptParser.ENTER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EnterScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnterScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnterScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnterScriptContext enterScript() throws RecognitionException {
		EnterScriptContext _localctx = new EnterScriptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enterScript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ENTER);
			setState(319);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitScriptContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(StateScriptParser.EXIT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExitScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExitScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitScriptContext exitScript() throws RecognitionException {
		ExitScriptContext _localctx = new ExitScriptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exitScript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(EXIT);
			setState(322);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(StateScriptParser.CODE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(CODE);
			setState(325);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStateContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(StateScriptParser.SWITCH, 0); }
		public TerminalNode FROM() { return getToken(StateScriptParser.FROM, 0); }
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public TerminalNode TO() { return getToken(StateScriptParser.TO, 0); }
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TerminalNode IF() { return getToken(StateScriptParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSwitchState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSwitchState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSwitchState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStateContext switchState() throws RecognitionException {
		SwitchStateContext _localctx = new SwitchStateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switchState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(SWITCH);
			setState(328);
			match(FROM);
			setState(329);
			match(Identifier);
			setState(330);
			match(TO);
			setState(331);
			match(Identifier);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(332);
				match(IF);
				setState(333);
				parExpression();
				}
			}

			setState(336);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(StateScriptParser.STATE, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public BehaviourContext behaviour() {
			return getRuleContext(BehaviourContext.class,0);
		}
		public EnterScriptContext enterScript() {
			return getRuleContext(EnterScriptContext.class,0);
		}
		public ExitScriptContext exitScript() {
			return getRuleContext(ExitScriptContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(STATE);
			setState(339);
			match(Identifier);
			setState(340);
			match(LBRACE);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEHAVIOUR) {
				{
				setState(341);
				behaviour();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTER) {
				{
				setState(344);
				enterScript();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXIT) {
				{
				setState(347);
				exitScript();
				}
			}

			setState(350);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DefaultStateContext defaultState() {
			return getRuleContext(DefaultStateContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<SwitchStateContext> switchState() {
			return getRuleContexts(SwitchStateContext.class);
		}
		public SwitchStateContext switchState(int i) {
			return getRuleContext(SwitchStateContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			name();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(353);
				description();
				}
			}

			setState(356);
			defaultState();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STATE) | (1L << CODE) | (1L << IMPORT) | (1L << SWITCH))) != 0)) {
				{
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
					{
					setState(357);
					importDeclaration();
					}
					break;
				case CODE:
					{
					setState(358);
					code();
					}
					break;
				case STATE:
					{
					setState(359);
					state();
					}
					break;
				case SWITCH:
					{
					setState(360);
					switchState();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StateScriptParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compilationUnit);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				annotations();
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					setState(367);
					packageDeclaration();
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IMPORT) {
						{
						{
						setState(368);
						importDeclaration();
						}
						}
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
						{
						{
						setState(374);
						typeDeclaration();
						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ABSTRACT:
				case CLASS:
				case ENUM:
				case FINAL:
				case INTERFACE:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					{
					setState(380);
					classOrInterfaceDeclaration();
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
						{
						{
						setState(381);
						typeDeclaration();
						}
						}
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE) {
					{
					setState(391);
					packageDeclaration();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(394);
					importDeclaration();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
					{
					{
					setState(400);
					typeDeclaration();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(StateScriptParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(PACKAGE);
			setState(410);
			qualifiedName();
			setState(411);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(StateScriptParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(StateScriptParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(StateScriptParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(StateScriptParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IMPORT);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(414);
				match(STATIC);
				}
			}

			setState(417);
			qualifiedName();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(418);
				match(DOT);
				setState(419);
				match(MUL);
				}
			}

			setState(422);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeDeclaration);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassOrInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassOrInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classOrInterfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			classOrInterfaceModifiers();
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
				{
				setState(429);
				classDeclaration();
				}
				break;
			case INTERFACE:
			case AT:
				{
				setState(430);
				interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassOrInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassOrInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(StateScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(StateScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(StateScriptParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(StateScriptParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(StateScriptParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(StateScriptParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(StateScriptParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(443);
					modifier();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classDeclaration);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(StateScriptParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(StateScriptParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(StateScriptParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(CLASS);
			setState(454);
			match(Identifier);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(455);
				typeParameters();
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(458);
				match(EXTENDS);
				setState(459);
				type();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(462);
				match(IMPLEMENTS);
				setState(463);
				typeList();
				}
			}

			setState(466);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LT);
			setState(469);
			typeParameter();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				typeParameter();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(StateScriptParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Identifier);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(480);
				match(EXTENDS);
				setState(481);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(StateScriptParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(StateScriptParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			type();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(485);
				match(BITAND);
				setState(486);
				type();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(StateScriptParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(StateScriptParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(ENUM);
			setState(493);
			match(Identifier);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(494);
				match(IMPLEMENTS);
				setState(495);
				typeList();
				}
			}

			setState(498);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StateScriptParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(LBRACE);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(501);
				enumConstants();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(504);
				match(COMMA);
				}
			}

			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(507);
				enumBodyDeclarations();
				}
			}

			setState(510);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			enumConstant();
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					match(COMMA);
					setState(514);
					enumConstant();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(520);
				annotations();
				}
			}

			setState(523);
			match(Identifier);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(524);
				arguments();
				}
			}

			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(527);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(SEMI);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				{
				setState(531);
				classBodyDeclaration();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceDeclaration);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				normalInterfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(StateScriptParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(StateScriptParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(INTERFACE);
			setState(542);
			match(Identifier);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(543);
				typeParameters();
				}
			}

			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(546);
				match(EXTENDS);
				setState(547);
				typeList();
				}
			}

			setState(550);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			type();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(553);
				match(COMMA);
				setState(554);
				type();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LBRACE);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LBRACE - 70)) | (1L << (SEMI - 70)) | (1L << (LT - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				{
				setState(561);
				classBodyDeclaration();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LBRACE);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (LT - 74)) | (1L << (Identifier - 74)) | (1L << (AT - 74)))) != 0)) {
				{
				{
				setState(570);
				interfaceBodyDeclaration();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(StateScriptParser.STATIC, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(579);
					match(STATIC);
					}
				}

				setState(582);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				modifiers();
				setState(584);
				memberDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(StateScriptParser.VOID, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_memberDecl);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				genericMethodOrConstructorDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				memberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(VOID);
				setState(591);
				match(Identifier);
				setState(592);
				voidMethodDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				match(Identifier);
				setState(594);
				constructorDeclaratorRest();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			type();
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(600);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(601);
				fieldDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterGenericMethodOrConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitGenericMethodOrConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitGenericMethodOrConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			typeParameters();
			setState(605);
			genericMethodOrConstructorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(StateScriptParser.VOID, 0); }
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterGenericMethodOrConstructorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitGenericMethodOrConstructorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitGenericMethodOrConstructorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_genericMethodOrConstructorRest);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case Identifier:
					{
					setState(607);
					type();
					}
					break;
				case VOID:
					{
					setState(608);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(611);
				match(Identifier);
				setState(612);
				methodDeclaratorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(Identifier);
				setState(614);
				constructorDeclaratorRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(Identifier);
			setState(618);
			methodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			variableDeclarators();
			setState(621);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceBodyDeclaration);
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				modifiers();
				setState(624);
				interfaceMemberDecl();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public TerminalNode VOID() { return getToken(StateScriptParser.VOID, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceMemberDecl);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				interfaceMethodOrFieldDecl();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				interfaceGenericMethodDecl();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(VOID);
				setState(632);
				match(Identifier);
				setState(633);
				voidInterfaceMethodDeclaratorRest();
				}
				break;
			case INTERFACE:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				interfaceDeclaration();
				}
				break;
			case CLASS:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(635);
				classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			type();
			setState(639);
			match(Identifier);
			setState(640);
			interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceMethodOrFieldRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interfaceMethodOrFieldRest);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				constantDeclaratorsRest();
				setState(643);
				match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(StateScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			formalParameters();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(649);
				match(LBRACK);
				setState(650);
				match(RBRACK);
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(656);
				match(THROWS);
				setState(657);
				qualifiedNameList();
				}
			}

			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(660);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(661);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TerminalNode THROWS() { return getToken(StateScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVoidMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			formalParameters();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(665);
				match(THROWS);
				setState(666);
				qualifiedNameList();
				}
			}

			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(669);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(670);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(StateScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			formalParameters();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(674);
				match(LBRACK);
				setState(675);
				match(RBRACK);
				}
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(681);
				match(THROWS);
				setState(682);
				qualifiedNameList();
				}
			}

			setState(685);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(StateScriptParser.VOID, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInterfaceGenericMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInterfaceGenericMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			typeParameters();
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(688);
				type();
				}
				break;
			case VOID:
				{
				setState(689);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(692);
			match(Identifier);
			setState(693);
			interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TerminalNode THROWS() { return getToken(StateScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			formalParameters();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(696);
				match(THROWS);
				setState(697);
				qualifiedNameList();
				}
			}

			setState(700);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(StateScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstructorDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstructorDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstructorDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			formalParameters();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(703);
				match(THROWS);
				setState(704);
				qualifiedNameList();
				}
			}

			setState(707);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(Identifier);
			setState(710);
			constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			variableDeclarator();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(713);
				match(COMMA);
				setState(714);
				variableDeclarator();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			variableDeclaratorId();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(721);
				match(ASSIGN);
				setState(722);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstantDeclaratorsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			constantDeclaratorRest();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(726);
				match(COMMA);
				setState(727);
				constantDeclarator();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstantDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(733);
				match(LBRACK);
				setState(734);
				match(RBRACK);
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(ASSIGN);
			setState(741);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(Identifier);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(744);
				match(LBRACK);
				setState(745);
				match(RBRACK);
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableInitializer);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LBRACE);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(756);
				variableInitializer();
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						match(COMMA);
						setState(758);
						variableInitializer();
						}
						} 
					}
					setState(763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(764);
					match(COMMA);
					}
				}

				}
			}

			setState(769);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(StateScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(StateScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(StateScriptParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(StateScriptParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(StateScriptParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(StateScriptParser.FINAL, 0); }
		public TerminalNode NATIVE() { return getToken(StateScriptParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(StateScriptParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(StateScriptParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(StateScriptParser.VOLATILE, 0); }
		public TerminalNode STRICTFP() { return getToken(StateScriptParser.STRICTFP, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_modifier);
		int _la;
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_type);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				classOrInterfaceType();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(782);
					match(LBRACK);
					setState(783);
					match(RBRACK);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				primitiveType();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(790);
					match(LBRACK);
					setState(791);
					match(RBRACK);
					}
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(StateScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StateScriptParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(Identifier);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(800);
				typeArguments();
				}
			}

			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(803);
				match(DOT);
				setState(804);
				match(Identifier);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(805);
					typeArguments();
					}
				}

				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(StateScriptParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(StateScriptParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(StateScriptParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(StateScriptParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(StateScriptParser.INT, 0); }
		public TerminalNode LONG() { return getToken(StateScriptParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(StateScriptParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(StateScriptParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(StateScriptParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variableModifier);
		try {
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(LT);
			setState(820);
			typeArgument();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				typeArgument();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(StateScriptParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(StateScriptParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(StateScriptParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeArgument);
		int _la;
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(QUESTION);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(832);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(833);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			qualifiedName();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(839);
				match(COMMA);
				setState(840);
				qualifiedName();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(LPAREN);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(847);
				formalParameterDecls();
				}
			}

			setState(850);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFormalParameterDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			variableModifiers();
			setState(853);
			type();
			setState(854);
			formalParameterDeclsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StateScriptParser.COMMA, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(StateScriptParser.ELLIPSIS, 0); }
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFormalParameterDeclsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				variableDeclaratorId();
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(857);
					match(COMMA);
					setState(858);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(ELLIPSIS);
				setState(862);
				variableDeclaratorId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(StateScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StateScriptParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(Identifier);
			setState(874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(870);
					match(DOT);
					setState(871);
					match(Identifier);
					}
					} 
				}
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(StateScriptParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(StateScriptParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(StateScriptParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(StateScriptParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(StateScriptParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(StateScriptParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (IntegerLiteral - 62)) | (1L << (FloatingPointLiteral - 62)) | (1L << (BooleanLiteral - 62)) | (1L << (CharacterLiteral - 62)) | (1L << (StringLiteral - 62)) | (1L << (NullLiteral - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(880); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(879);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(882); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(StateScriptParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(AT);
			setState(885);
			annotationName();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(886);
				match(LPAREN);
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(887);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(888);
					elementValue();
					}
					break;
				}
				setState(891);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(StateScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StateScriptParser.DOT, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(Identifier);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(895);
				match(DOT);
				setState(896);
				match(Identifier);
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			elementValuePair();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(903);
				match(COMMA);
				setState(904);
				elementValuePair();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(Identifier);
			setState(911);
			match(ASSIGN);
			setState(912);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elementValue);
		try {
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(LBRACE);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(920);
				elementValue();
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(921);
						match(COMMA);
						setState(922);
						elementValue();
						}
						} 
					}
					setState(927);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
			}

			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(930);
				match(COMMA);
				}
			}

			setState(933);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(StateScriptParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(StateScriptParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(AT);
			setState(936);
			match(INTERFACE);
			setState(937);
			match(Identifier);
			setState(938);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(LBRACE);
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SEMI - 74)) | (1L << (Identifier - 74)) | (1L << (AT - 74)))) != 0)) {
				{
				{
				setState(941);
				annotationTypeElementDeclaration();
				}
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_annotationTypeElementDeclaration);
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				modifiers();
				setState(950);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_annotationTypeElementRest);
		try {
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				type();
				setState(956);
				annotationMethodOrConstantRest();
				setState(957);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				normalClassDeclaration();
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(960);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				normalInterfaceDeclaration();
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(964);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				enumDeclaration();
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(968);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(971);
				annotationTypeDeclaration();
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(972);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_annotationMethodOrConstantRest);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(Identifier);
			setState(982);
			match(LPAREN);
			setState(983);
			match(RPAREN);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(984);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(StateScriptParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(DEFAULT);
			setState(990);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(LBRACE);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(993);
				blockStatement();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(999);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_blockStatement);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			localVariableDeclaration();
			setState(1007);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			variableModifiers();
			setState(1010);
			type();
			setState(1011);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1013);
				variableModifier();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(StateScriptParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(StateScriptParser.COLON, 0); }
		public TerminalNode IF() { return getToken(StateScriptParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(StateScriptParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(StateScriptParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(StateScriptParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(StateScriptParser.DO, 0); }
		public TerminalNode TRY() { return getToken(StateScriptParser.TRY, 0); }
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(StateScriptParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(StateScriptParser.LBRACE, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(StateScriptParser.RBRACE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(StateScriptParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(StateScriptParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(StateScriptParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(StateScriptParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(StateScriptParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_statement);
		int _la;
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				match(ASSERT);
				setState(1021);
				expression();
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1022);
					match(COLON);
					setState(1023);
					expression();
					}
				}

				setState(1026);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1028);
				match(IF);
				setState(1029);
				parExpression();
				setState(1030);
				statement();
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1031);
					match(ELSE);
					setState(1032);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1035);
				match(FOR);
				setState(1036);
				match(LPAREN);
				setState(1037);
				forControl();
				setState(1038);
				match(RPAREN);
				setState(1039);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1041);
				match(WHILE);
				setState(1042);
				parExpression();
				setState(1043);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1045);
				match(DO);
				setState(1046);
				statement();
				setState(1047);
				match(WHILE);
				setState(1048);
				parExpression();
				setState(1049);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1051);
				match(TRY);
				setState(1052);
				block();
				setState(1058);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1053);
					catches();
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1054);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1057);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1060);
				match(TRY);
				setState(1061);
				resourceSpecification();
				setState(1062);
				block();
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1063);
					catches();
					}
				}

				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1066);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1069);
				match(SWITCH);
				setState(1070);
				parExpression();
				setState(1071);
				match(LBRACE);
				setState(1072);
				switchBlockStatementGroups();
				setState(1073);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1075);
				match(SYNCHRONIZED);
				setState(1076);
				parExpression();
				setState(1077);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1079);
				match(RETURN);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1080);
					expression();
					}
				}

				setState(1083);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1084);
				match(THROW);
				setState(1085);
				expression();
				setState(1086);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1088);
				match(BREAK);
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1089);
					match(Identifier);
					}
				}

				setState(1092);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1093);
				match(CONTINUE);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1094);
					match(Identifier);
					}
				}

				setState(1097);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1098);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1099);
				statementExpression();
				setState(1100);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1102);
				match(Identifier);
				setState(1103);
				match(COLON);
				setState(1104);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1107);
				catchClause();
				}
				}
				setState(1110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(StateScriptParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(CATCH);
			setState(1113);
			match(LPAREN);
			setState(1114);
			variableModifiers();
			setState(1115);
			catchType();
			setState(1116);
			match(Identifier);
			setState(1117);
			match(RPAREN);
			setState(1118);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(StateScriptParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(StateScriptParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			qualifiedName();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1121);
				match(BITOR);
				setState(1122);
				qualifiedName();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(StateScriptParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(FINALLY);
			setState(1129);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(StateScriptParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(LPAREN);
			setState(1132);
			resources();
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1133);
				match(SEMI);
				}
			}

			setState(1136);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(StateScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StateScriptParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			resource();
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1139);
					match(SEMI);
					setState(1140);
					resource();
					}
					} 
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			variableModifiers();
			setState(1147);
			classOrInterfaceType();
			setState(1148);
			variableDeclaratorId();
			setState(1149);
			match(ASSIGN);
			setState(1150);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			variableModifiers();
			setState(1153);
			type();
			setState(1154);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSwitchBlockStatementGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1156);
				switchBlockStatementGroup();
				}
				}
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1163); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1162);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1165); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1167);
				blockStatement();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(StateScriptParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StateScriptParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(StateScriptParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_switchLabel);
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				match(CASE);
				setState(1174);
				constantExpression();
				setState(1175);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				match(CASE);
				setState(1178);
				enumConstantName();
				setState(1179);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1181);
				match(DEFAULT);
				setState(1182);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(StateScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StateScriptParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_forControl);
		int _la;
		try {
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1186);
					forInit();
					}
				}

				setState(1189);
				match(SEMI);
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1190);
					expression();
					}
				}

				setState(1193);
				match(SEMI);
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1194);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_forInit);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(StateScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			variableModifiers();
			setState(1204);
			type();
			setState(1205);
			match(Identifier);
			setState(1206);
			match(COLON);
			setState(1207);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(LPAREN);
			setState(1212);
			expression();
			setState(1213);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateScriptParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			expression();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1216);
				match(COMMA);
				setState(1217);
				expression();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			conditionalExpression();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (AND_ASSIGN - 77)) | (1L << (OR_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (LSHIFT_ASSIGN - 77)) | (1L << (RSHIFT_ASSIGN - 77)) | (1L << (URSHIFT_ASSIGN - 77)))) != 0)) {
				{
				setState(1228);
				assignmentOperator();
				setState(1229);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(StateScriptParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(StateScriptParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(StateScriptParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(StateScriptParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(StateScriptParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(StateScriptParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(StateScriptParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(StateScriptParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(StateScriptParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(StateScriptParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(StateScriptParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(StateScriptParser.URSHIFT_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ASSIGN - 77)) | (1L << (ADD_ASSIGN - 77)) | (1L << (SUB_ASSIGN - 77)) | (1L << (MUL_ASSIGN - 77)) | (1L << (DIV_ASSIGN - 77)) | (1L << (AND_ASSIGN - 77)) | (1L << (OR_ASSIGN - 77)) | (1L << (XOR_ASSIGN - 77)) | (1L << (MOD_ASSIGN - 77)) | (1L << (LSHIFT_ASSIGN - 77)) | (1L << (RSHIFT_ASSIGN - 77)) | (1L << (URSHIFT_ASSIGN - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(StateScriptParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StateScriptParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			conditionalOrExpression();
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1236);
				match(QUESTION);
				setState(1237);
				expression();
				setState(1238);
				match(COLON);
				setState(1239);
				conditionalExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(StateScriptParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(StateScriptParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			conditionalAndExpression();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1244);
				match(OR);
				setState(1245);
				conditionalAndExpression();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(StateScriptParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(StateScriptParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			inclusiveOrExpression();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1252);
				match(AND);
				setState(1253);
				inclusiveOrExpression();
				}
				}
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(StateScriptParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(StateScriptParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			exclusiveOrExpression();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1260);
				match(BITOR);
				setState(1261);
				exclusiveOrExpression();
				}
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(StateScriptParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(StateScriptParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			andExpression();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1268);
				match(CARET);
				setState(1269);
				andExpression();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(StateScriptParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(StateScriptParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			equalityExpression();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1276);
				match(BITAND);
				setState(1277);
				equalityExpression();
				}
				}
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(StateScriptParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(StateScriptParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(StateScriptParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(StateScriptParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			instanceOfExpression();
			setState(1288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1284);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1285);
				instanceOfExpression();
				}
				}
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(StateScriptParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			relationalExpression();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1292);
				match(INSTANCEOF);
				setState(1293);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			shiftExpression();
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) {
				{
				{
				setState(1297);
				relationalOp();
				setState(1298);
				shiftExpression();
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(StateScriptParser.LE, 0); }
		public TerminalNode GE() { return getToken(StateScriptParser.GE, 0); }
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (GT - 78)) | (1L << (LT - 78)) | (1L << (LE - 78)) | (1L << (GE - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			additiveExpression();
			setState(1313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1308);
					shiftOp();
					setState(1309);
					additiveExpression();
					}
					} 
				}
				setState(1315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOpContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token t3;
		public List<TerminalNode> LT() { return getTokens(StateScriptParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(StateScriptParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(StateScriptParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(StateScriptParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitShiftOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_shiftOp);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(1317);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1319);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(1320);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1322);
				((ShiftOpContext)_localctx).t2 = match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(StateScriptParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(StateScriptParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(StateScriptParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(StateScriptParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			multiplicativeExpression();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1326);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1327);
				multiplicativeExpression();
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(StateScriptParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(StateScriptParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(StateScriptParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(StateScriptParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(StateScriptParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(StateScriptParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			unaryExpression();
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) {
				{
				{
				setState(1334);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (MUL - 94)) | (1L << (DIV - 94)) | (1L << (MOD - 94)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1335);
				unaryExpression();
				}
				}
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(StateScriptParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(StateScriptParser.SUB, 0); }
		public TerminalNode INC() { return getToken(StateScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(StateScriptParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_unaryExpression);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				match(ADD);
				setState(1342);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				match(SUB);
				setState(1344);
				unaryExpression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
				match(INC);
				setState(1346);
				unaryExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1347);
				match(DEC);
				setState(1348);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(1349);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(StateScriptParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(StateScriptParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode INC() { return getToken(StateScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(StateScriptParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				match(TILDE);
				setState(1353);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(BANG);
				setState(1355);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1356);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1357);
				primary();
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==DOT) {
					{
					{
					setState(1358);
					selector();
					}
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(1364);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_castExpression);
		try {
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				match(LPAREN);
				setState(1370);
				primitiveType();
				setState(1371);
				match(RPAREN);
				setState(1372);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				match(LPAREN);
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1375);
					type();
					}
					break;
				case 2:
					{
					setState(1376);
					expression();
					}
					break;
				}
				setState(1379);
				match(RPAREN);
				setState(1380);
				unaryExpressionNotPlusMinus();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(StateScriptParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(StateScriptParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(StateScriptParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(StateScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StateScriptParser.DOT, i);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(StateScriptParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(StateScriptParser.VOID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				match(THIS);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1386);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				match(SUPER);
				setState(1390);
				superSuffix();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1391);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1392);
				match(NEW);
				setState(1393);
				creator();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1394);
				nonWildcardTypeArguments();
				setState(1398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1395);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1396);
					match(THIS);
					setState(1397);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(1400);
				match(Identifier);
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1401);
						match(DOT);
						setState(1402);
						match(Identifier);
						}
						} 
					}
					setState(1407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				}
				setState(1409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1408);
					identifierSuffix();
					}
					break;
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1411);
				primitiveType();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1412);
					match(LBRACK);
					setState(1413);
					match(RBRACK);
					}
					}
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1419);
				match(DOT);
				setState(1420);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 9);
				{
				setState(1422);
				match(VOID);
				setState(1423);
				match(DOT);
				setState(1424);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(StateScriptParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(StateScriptParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode THIS() { return getToken(StateScriptParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(StateScriptParser.SUPER, 0); }
		public TerminalNode NEW() { return getToken(StateScriptParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitIdentifierSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_identifierSuffix);
		int _la;
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1427);
					match(LBRACK);
					setState(1428);
					match(RBRACK);
					}
					}
					setState(1431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(1433);
				match(DOT);
				setState(1434);
				match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(LBRACK);
				setState(1436);
				expression();
				setState(1437);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(DOT);
				setState(1441);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1442);
				match(DOT);
				setState(1443);
				explicitGenericInvocation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1444);
				match(DOT);
				setState(1445);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1446);
				match(DOT);
				setState(1447);
				match(SUPER);
				setState(1448);
				arguments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1449);
				match(DOT);
				setState(1450);
				match(NEW);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1451);
					nonWildcardTypeArguments();
					}
				}

				setState(1454);
				innerCreator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_creator);
		try {
			setState(1466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				nonWildcardTypeArguments();
				setState(1458);
				createdName();
				setState(1459);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				createdName();
				setState(1464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1462);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1463);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(StateScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(StateScriptParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(StateScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StateScriptParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_createdName);
		int _la;
		try {
			setState(1483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(Identifier);
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1469);
					typeArgumentsOrDiamond();
					}
				}

				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1472);
					match(DOT);
					setState(1473);
					match(Identifier);
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1474);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(Identifier);
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1486);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1489);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(StateScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(StateScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(StateScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(StateScriptParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(LBRACK);
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1492);
				match(RBRACK);
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1493);
					match(LBRACK);
					setState(1494);
					match(RBRACK);
					}
					}
					setState(1499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1500);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1501);
				expression();
				setState(1502);
				match(RBRACK);
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1503);
						match(LBRACK);
						setState(1504);
						expression();
						setState(1505);
						match(RBRACK);
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1512);
						match(LBRACK);
						setState(1513);
						match(RBRACK);
						}
						} 
					}
					setState(1518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			arguments();
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1522);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			nonWildcardTypeArguments();
			setState(1526);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(LT);
			setState(1529);
			typeList();
			setState(1530);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_typeArgumentsOrDiamond);
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(LT);
				setState(1533);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(StateScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(StateScriptParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				match(LT);
				setState(1538);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(StateScriptParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode THIS() { return getToken(StateScriptParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(StateScriptParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode NEW() { return getToken(StateScriptParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(StateScriptParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(StateScriptParser.RBRACK, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_selector);
		int _la;
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				match(DOT);
				setState(1543);
				match(Identifier);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1544);
					arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547);
				match(DOT);
				setState(1548);
				explicitGenericInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1549);
				match(DOT);
				setState(1550);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1551);
				match(DOT);
				setState(1552);
				match(SUPER);
				setState(1553);
				superSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1554);
				match(DOT);
				setState(1555);
				match(NEW);
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1556);
					nonWildcardTypeArguments();
					}
				}

				setState(1559);
				innerCreator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1560);
				match(LBRACK);
				setState(1561);
				expression();
				setState(1562);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(StateScriptParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_superSuffix);
		int _la;
		try {
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				match(DOT);
				setState(1568);
				match(Identifier);
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1569);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(StateScriptParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(StateScriptParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				match(SUPER);
				setState(1575);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				match(Identifier);
				setState(1577);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StateScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StateScriptParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateScriptListener ) ((StateScriptListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateScriptVisitor ) return ((StateScriptVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(LPAREN);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1581);
				expressionList();
				}
			}

			setState(1584);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u0635\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0151\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0159\n\n\3\n\5\n\u015c"+
		"\n\n\3\n\5\n\u015f\n\n\3\n\3\n\3\13\3\13\5\13\u0165\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\f\3\f\3\f\7\f\u0174"+
		"\n\f\f\f\16\f\u0177\13\f\3\f\7\f\u017a\n\f\f\f\16\f\u017d\13\f\3\f\3\f"+
		"\7\f\u0181\n\f\f\f\16\f\u0184\13\f\5\f\u0186\n\f\3\f\3\f\3\f\5\f\u018b"+
		"\n\f\3\f\7\f\u018e\n\f\f\f\16\f\u0191\13\f\3\f\7\f\u0194\n\f\f\f\16\f"+
		"\u0197\13\f\3\f\5\f\u019a\n\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u01a2\n\16"+
		"\3\16\3\16\3\16\5\16\u01a7\n\16\3\16\3\16\3\17\3\17\5\17\u01ad\n\17\3"+
		"\20\3\20\3\20\5\20\u01b2\n\20\3\21\7\21\u01b5\n\21\f\21\16\21\u01b8\13"+
		"\21\3\22\3\22\5\22\u01bc\n\22\3\23\7\23\u01bf\n\23\f\23\16\23\u01c2\13"+
		"\23\3\24\3\24\5\24\u01c6\n\24\3\25\3\25\3\25\5\25\u01cb\n\25\3\25\3\25"+
		"\5\25\u01cf\n\25\3\25\3\25\5\25\u01d3\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u01db\n\26\f\26\16\26\u01de\13\26\3\26\3\26\3\27\3\27\3\27\5"+
		"\27\u01e5\n\27\3\30\3\30\3\30\7\30\u01ea\n\30\f\30\16\30\u01ed\13\30\3"+
		"\31\3\31\3\31\3\31\5\31\u01f3\n\31\3\31\3\31\3\32\3\32\5\32\u01f9\n\32"+
		"\3\32\5\32\u01fc\n\32\3\32\5\32\u01ff\n\32\3\32\3\32\3\33\3\33\3\33\7"+
		"\33\u0206\n\33\f\33\16\33\u0209\13\33\3\34\5\34\u020c\n\34\3\34\3\34\5"+
		"\34\u0210\n\34\3\34\5\34\u0213\n\34\3\35\3\35\7\35\u0217\n\35\f\35\16"+
		"\35\u021a\13\35\3\36\3\36\5\36\u021e\n\36\3\37\3\37\3\37\5\37\u0223\n"+
		"\37\3\37\3\37\5\37\u0227\n\37\3\37\3\37\3 \3 \3 \7 \u022e\n \f \16 \u0231"+
		"\13 \3!\3!\7!\u0235\n!\f!\16!\u0238\13!\3!\3!\3\"\3\"\7\"\u023e\n\"\f"+
		"\"\16\"\u0241\13\"\3\"\3\"\3#\3#\5#\u0247\n#\3#\3#\3#\3#\5#\u024d\n#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0258\n$\3%\3%\3%\5%\u025d\n%\3&\3&\3&\3"+
		"\'\3\'\5\'\u0264\n\'\3\'\3\'\3\'\3\'\5\'\u026a\n\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3*\5*\u0276\n*\3+\3+\3+\3+\3+\3+\3+\5+\u027f\n+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\5-\u0289\n-\3.\3.\3.\7.\u028e\n.\f.\16.\u0291\13.\3.\3.\5."+
		"\u0295\n.\3.\3.\5.\u0299\n.\3/\3/\3/\5/\u029e\n/\3/\3/\5/\u02a2\n/\3\60"+
		"\3\60\3\60\7\60\u02a7\n\60\f\60\16\60\u02aa\13\60\3\60\3\60\5\60\u02ae"+
		"\n\60\3\60\3\60\3\61\3\61\3\61\5\61\u02b5\n\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\5\62\u02bd\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u02c4\n\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u02ce\n\65\f\65\16\65\u02d1\13"+
		"\65\3\66\3\66\3\66\5\66\u02d6\n\66\3\67\3\67\3\67\7\67\u02db\n\67\f\67"+
		"\16\67\u02de\13\67\38\38\78\u02e2\n8\f8\168\u02e5\138\38\38\38\39\39\3"+
		"9\79\u02ed\n9\f9\169\u02f0\139\3:\3:\5:\u02f4\n:\3;\3;\3;\3;\7;\u02fa"+
		"\n;\f;\16;\u02fd\13;\3;\5;\u0300\n;\5;\u0302\n;\3;\3;\3<\3<\5<\u0308\n"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3@\7@\u0313\n@\f@\16@\u0316\13@\3@\3@\3@\7@"+
		"\u031b\n@\f@\16@\u031e\13@\5@\u0320\n@\3A\3A\5A\u0324\nA\3A\3A\3A\5A\u0329"+
		"\nA\7A\u032b\nA\fA\16A\u032e\13A\3B\3B\3C\3C\5C\u0334\nC\3D\3D\3D\3D\7"+
		"D\u033a\nD\fD\16D\u033d\13D\3D\3D\3E\3E\3E\3E\5E\u0345\nE\5E\u0347\nE"+
		"\3F\3F\3F\7F\u034c\nF\fF\16F\u034f\13F\3G\3G\5G\u0353\nG\3G\3G\3H\3H\3"+
		"H\3H\3I\3I\3I\5I\u035e\nI\3I\3I\5I\u0362\nI\3J\3J\3K\3K\3L\3L\3L\7L\u036b"+
		"\nL\fL\16L\u036e\13L\3M\3M\3N\6N\u0373\nN\rN\16N\u0374\3O\3O\3O\3O\3O"+
		"\5O\u037c\nO\3O\5O\u037f\nO\3P\3P\3P\7P\u0384\nP\fP\16P\u0387\13P\3Q\3"+
		"Q\3Q\7Q\u038c\nQ\fQ\16Q\u038f\13Q\3R\3R\3R\3R\3S\3S\3S\5S\u0398\nS\3T"+
		"\3T\3T\3T\7T\u039e\nT\fT\16T\u03a1\13T\5T\u03a3\nT\3T\5T\u03a6\nT\3T\3"+
		"T\3U\3U\3U\3U\3U\3V\3V\7V\u03b1\nV\fV\16V\u03b4\13V\3V\3V\3W\3W\3W\3W"+
		"\5W\u03bc\nW\3X\3X\3X\3X\3X\3X\5X\u03c4\nX\3X\3X\5X\u03c8\nX\3X\3X\5X"+
		"\u03cc\nX\3X\3X\5X\u03d0\nX\5X\u03d2\nX\3Y\3Y\5Y\u03d6\nY\3Z\3Z\3Z\3Z"+
		"\5Z\u03dc\nZ\3[\3[\3\\\3\\\3\\\3]\3]\7]\u03e5\n]\f]\16]\u03e8\13]\3]\3"+
		"]\3^\3^\3^\5^\u03ef\n^\3_\3_\3_\3`\3`\3`\3`\3a\7a\u03f9\na\fa\16a\u03fc"+
		"\13a\3b\3b\3b\3b\3b\5b\u0403\nb\3b\3b\3b\3b\3b\3b\3b\5b\u040c\nb\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0422\nb\3"+
		"b\5b\u0425\nb\3b\3b\3b\3b\5b\u042b\nb\3b\5b\u042e\nb\3b\3b\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\5b\u043c\nb\3b\3b\3b\3b\3b\3b\3b\5b\u0445\nb\3b\3"+
		"b\3b\5b\u044a\nb\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0454\nb\3c\6c\u0457\nc\r"+
		"c\16c\u0458\3d\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\7e\u0466\ne\fe\16e\u0469"+
		"\13e\3f\3f\3f\3g\3g\3g\5g\u0471\ng\3g\3g\3h\3h\3h\7h\u0478\nh\fh\16h\u047b"+
		"\13h\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3k\7k\u0488\nk\fk\16k\u048b\13k\3l"+
		"\6l\u048e\nl\rl\16l\u048f\3l\7l\u0493\nl\fl\16l\u0496\13l\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\5m\u04a2\nm\3n\3n\5n\u04a6\nn\3n\3n\5n\u04aa\nn\3n"+
		"\3n\5n\u04ae\nn\5n\u04b0\nn\3o\3o\5o\u04b4\no\3p\3p\3p\3p\3p\3p\3q\3q"+
		"\3r\3r\3r\3r\3s\3s\3s\7s\u04c5\ns\fs\16s\u04c8\13s\3t\3t\3u\3u\3v\3v\3"+
		"v\3v\5v\u04d2\nv\3w\3w\3x\3x\3x\3x\3x\3x\5x\u04dc\nx\3y\3y\3y\7y\u04e1"+
		"\ny\fy\16y\u04e4\13y\3z\3z\3z\7z\u04e9\nz\fz\16z\u04ec\13z\3{\3{\3{\7"+
		"{\u04f1\n{\f{\16{\u04f4\13{\3|\3|\3|\7|\u04f9\n|\f|\16|\u04fc\13|\3}\3"+
		"}\3}\7}\u0501\n}\f}\16}\u0504\13}\3~\3~\3~\7~\u0509\n~\f~\16~\u050c\13"+
		"~\3\177\3\177\3\177\5\177\u0511\n\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u0517\n\u0080\f\u0080\16\u0080\u051a\13\u0080\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0522\n\u0082\f\u0082\16\u0082"+
		"\u0525\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u052e\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0533\n\u0084\f"+
		"\u0084\16\u0084\u0536\13\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u053b\n"+
		"\u0085\f\u0085\16\u0085\u053e\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0549\n\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0552\n\u0087"+
		"\f\u0087\16\u0087\u0555\13\u0087\3\u0087\5\u0087\u0558\n\u0087\5\u0087"+
		"\u055a\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0564\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0569\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u056e\n\u0089\3\u0089\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0579\n"+
		"\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u057e\n\u0089\f\u0089\16\u0089"+
		"\u0581\13\u0089\3\u0089\5\u0089\u0584\n\u0089\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u0589\n\u0089\f\u0089\16\u0089\u058c\13\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0594\n\u0089\3\u008a\3\u008a"+
		"\6\u008a\u0598\n\u008a\r\u008a\16\u008a\u0599\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u05af"+
		"\n\u008a\3\u008a\5\u008a\u05b2\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u05bb\n\u008b\5\u008b\u05bd\n\u008b\3"+
		"\u008c\3\u008c\5\u008c\u05c1\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u05c6"+
		"\n\u008c\7\u008c\u05c8\n\u008c\f\u008c\16\u008c\u05cb\13\u008c\3\u008c"+
		"\5\u008c\u05ce\n\u008c\3\u008d\3\u008d\5\u008d\u05d2\n\u008d\3\u008d\3"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u05da\n\u008e\f\u008e\16"+
		"\u008e\u05dd\13\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\7\u008e\u05e6\n\u008e\f\u008e\16\u008e\u05e9\13\u008e\3\u008e"+
		"\3\u008e\7\u008e\u05ed\n\u008e\f\u008e\16\u008e\u05f0\13\u008e\5\u008e"+
		"\u05f2\n\u008e\3\u008f\3\u008f\5\u008f\u05f6\n\u008f\3\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u0602\n\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u0607\n\u0093\3\u0094\3"+
		"\u0094\3\u0094\5\u0094\u060c\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0618\n\u0094\3"+
		"\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u061f\n\u0094\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u0625\n\u0095\5\u0095\u0627\n\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u062d\n\u0096\3\u0097\3\u0097\5\u0097"+
		"\u0631\n\u0097\3\u0097\3\u0097\3\u0097\2\2\u0098\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\2\r\6\2\16\16\37\37.\60\63\64\n\2\16\16\37\37"+
		"++.\60\63\64\67\67;;>>\n\2\20\20\22\22\25\25\33\33!!((**\62\62\4\2\36"+
		"\36\65\65\3\2@E\4\2OOfp\4\2VVYY\4\2PQWX\3\2^_\4\2`aee\3\2\\]\2\u068c\2"+
		"\u012e\3\2\2\2\4\u0133\3\2\2\2\6\u0138\3\2\2\2\b\u013d\3\2\2\2\n\u0140"+
		"\3\2\2\2\f\u0143\3\2\2\2\16\u0146\3\2\2\2\20\u0149\3\2\2\2\22\u0154\3"+
		"\2\2\2\24\u0162\3\2\2\2\26\u0199\3\2\2\2\30\u019b\3\2\2\2\32\u019f\3\2"+
		"\2\2\34\u01ac\3\2\2\2\36\u01ae\3\2\2\2 \u01b6\3\2\2\2\"\u01bb\3\2\2\2"+
		"$\u01c0\3\2\2\2&\u01c5\3\2\2\2(\u01c7\3\2\2\2*\u01d6\3\2\2\2,\u01e1\3"+
		"\2\2\2.\u01e6\3\2\2\2\60\u01ee\3\2\2\2\62\u01f6\3\2\2\2\64\u0202\3\2\2"+
		"\2\66\u020b\3\2\2\28\u0214\3\2\2\2:\u021d\3\2\2\2<\u021f\3\2\2\2>\u022a"+
		"\3\2\2\2@\u0232\3\2\2\2B\u023b\3\2\2\2D\u024c\3\2\2\2F\u0257\3\2\2\2H"+
		"\u0259\3\2\2\2J\u025e\3\2\2\2L\u0269\3\2\2\2N\u026b\3\2\2\2P\u026e\3\2"+
		"\2\2R\u0275\3\2\2\2T\u027e\3\2\2\2V\u0280\3\2\2\2X\u0288\3\2\2\2Z\u028a"+
		"\3\2\2\2\\\u029a\3\2\2\2^\u02a3\3\2\2\2`\u02b1\3\2\2\2b\u02b9\3\2\2\2"+
		"d\u02c0\3\2\2\2f\u02c7\3\2\2\2h\u02ca\3\2\2\2j\u02d2\3\2\2\2l\u02d7\3"+
		"\2\2\2n\u02e3\3\2\2\2p\u02e9\3\2\2\2r\u02f3\3\2\2\2t\u02f5\3\2\2\2v\u0307"+
		"\3\2\2\2x\u0309\3\2\2\2z\u030b\3\2\2\2|\u030d\3\2\2\2~\u031f\3\2\2\2\u0080"+
		"\u0321\3\2\2\2\u0082\u032f\3\2\2\2\u0084\u0333\3\2\2\2\u0086\u0335\3\2"+
		"\2\2\u0088\u0346\3\2\2\2\u008a\u0348\3\2\2\2\u008c\u0350\3\2\2\2\u008e"+
		"\u0356\3\2\2\2\u0090\u0361\3\2\2\2\u0092\u0363\3\2\2\2\u0094\u0365\3\2"+
		"\2\2\u0096\u0367\3\2\2\2\u0098\u036f\3\2\2\2\u009a\u0372\3\2\2\2\u009c"+
		"\u0376\3\2\2\2\u009e\u0380\3\2\2\2\u00a0\u0388\3\2\2\2\u00a2\u0390\3\2"+
		"\2\2\u00a4\u0397\3\2\2\2\u00a6\u0399\3\2\2\2\u00a8\u03a9\3\2\2\2\u00aa"+
		"\u03ae\3\2\2\2\u00ac\u03bb\3\2\2\2\u00ae\u03d1\3\2\2\2\u00b0\u03d5\3\2"+
		"\2\2\u00b2\u03d7\3\2\2\2\u00b4\u03dd\3\2\2\2\u00b6\u03df\3\2\2\2\u00b8"+
		"\u03e2\3\2\2\2\u00ba\u03ee\3\2\2\2\u00bc\u03f0\3\2\2\2\u00be\u03f3\3\2"+
		"\2\2\u00c0\u03fa\3\2\2\2\u00c2\u0453\3\2\2\2\u00c4\u0456\3\2\2\2\u00c6"+
		"\u045a\3\2\2\2\u00c8\u0462\3\2\2\2\u00ca\u046a\3\2\2\2\u00cc\u046d\3\2"+
		"\2\2\u00ce\u0474\3\2\2\2\u00d0\u047c\3\2\2\2\u00d2\u0482\3\2\2\2\u00d4"+
		"\u0489\3\2\2\2\u00d6\u048d\3\2\2\2\u00d8\u04a1\3\2\2\2\u00da\u04af\3\2"+
		"\2\2\u00dc\u04b3\3\2\2\2\u00de\u04b5\3\2\2\2\u00e0\u04bb\3\2\2\2\u00e2"+
		"\u04bd\3\2\2\2\u00e4\u04c1\3\2\2\2\u00e6\u04c9\3\2\2\2\u00e8\u04cb\3\2"+
		"\2\2\u00ea\u04cd\3\2\2\2\u00ec\u04d3\3\2\2\2\u00ee\u04d5\3\2\2\2\u00f0"+
		"\u04dd\3\2\2\2\u00f2\u04e5\3\2\2\2\u00f4\u04ed\3\2\2\2\u00f6\u04f5\3\2"+
		"\2\2\u00f8\u04fd\3\2\2\2\u00fa\u0505\3\2\2\2\u00fc\u050d\3\2\2\2\u00fe"+
		"\u0512\3\2\2\2\u0100\u051b\3\2\2\2\u0102\u051d\3\2\2\2\u0104\u052d\3\2"+
		"\2\2\u0106\u052f\3\2\2\2\u0108\u0537\3\2\2\2\u010a\u0548\3\2\2\2\u010c"+
		"\u0559\3\2\2\2\u010e\u0568\3\2\2\2\u0110\u0593\3\2\2\2\u0112\u05b1\3\2"+
		"\2\2\u0114\u05bc\3\2\2\2\u0116\u05cd\3\2\2\2\u0118\u05cf\3\2\2\2\u011a"+
		"\u05d5\3\2\2\2\u011c\u05f3\3\2\2\2\u011e\u05f7\3\2\2\2\u0120\u05fa\3\2"+
		"\2\2\u0122\u0601\3\2\2\2\u0124\u0606\3\2\2\2\u0126\u061e\3\2\2\2\u0128"+
		"\u0626\3\2\2\2\u012a\u062c\3\2\2\2\u012c\u062e\3\2\2\2\u012e\u012f\7\b"+
		"\2\2\u012f\u0130\7O\2\2\u0130\u0131\7q\2\2\u0131\u0132\7L\2\2\u0132\3"+
		"\3\2\2\2\u0133\u0134\7\t\2\2\u0134\u0135\7O\2\2\u0135\u0136\7D\2\2\u0136"+
		"\u0137\7L\2\2\u0137\5\3\2\2\2\u0138\u0139\7\31\2\2\u0139\u013a\7O\2\2"+
		"\u013a\u013b\7q\2\2\u013b\u013c\7L\2\2\u013c\7\3\2\2\2\u013d\u013e\7\4"+
		"\2\2\u013e\u013f\5\u00b8]\2\u013f\t\3\2\2\2\u0140\u0141\7\5\2\2\u0141"+
		"\u0142\5\u00b8]\2\u0142\13\3\2\2\2\u0143\u0144\7\6\2\2\u0144\u0145\5\u00b8"+
		"]\2\u0145\r\3\2\2\2\u0146\u0147\7\7\2\2\u0147\u0148\5@!\2\u0148\17\3\2"+
		"\2\2\u0149\u014a\7\66\2\2\u014a\u014b\7\n\2\2\u014b\u014c\7q\2\2\u014c"+
		"\u014d\7\13\2\2\u014d\u0150\7q\2\2\u014e\u014f\7#\2\2\u014f\u0151\5\u00e2"+
		"r\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7L\2\2\u0153\21\3\2\2\2\u0154\u0155\7\3\2\2\u0155\u0156\7q\2\2"+
		"\u0156\u0158\7H\2\2\u0157\u0159\5\b\5\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\5\n\6\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\5\f\7\2\u015e\u015d\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7I\2\2\u0161"+
		"\23\3\2\2\2\u0162\u0164\5\2\2\2\u0163\u0165\5\4\3\2\u0164\u0163\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016d\5\6\4\2\u0167\u016c"+
		"\5\32\16\2\u0168\u016c\5\16\b\2\u0169\u016c\5\22\n\2\u016a\u016c\5\20"+
		"\t\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\25\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0185\5\u009aN\2\u0171"+
		"\u0175\5\30\r\2\u0172\u0174\5\32\16\2\u0173\u0172\3\2\2\2\u0174\u0177"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017a\5\34\17\2\u0179\u0178\3\2\2\2\u017a\u017d\3"+
		"\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0186\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0182\5\36\20\2\u017f\u0181\5\34\17\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0171\3\2\2\2\u0185\u017e\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\2\2\3\u0188\u019a\3\2\2\2\u0189"+
		"\u018b\5\30\r\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3"+
		"\2\2\2\u018c\u018e\5\32\16\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0194\5\34\17\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019a\7\2\2\3\u0199\u0170\3\2\2\2\u0199\u018a\3\2\2\2\u019a"+
		"\27\3\2\2\2\u019b\u019c\7-\2\2\u019c\u019d\5\u0096L\2\u019d\u019e\7L\2"+
		"\2\u019e\31\3\2\2\2\u019f\u01a1\7&\2\2\u01a0\u01a2\7\63\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\5\u0096L"+
		"\2\u01a4\u01a5\7N\2\2\u01a5\u01a7\7`\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7L\2\2\u01a9\33\3\2\2\2\u01aa"+
		"\u01ad\5\36\20\2\u01ab\u01ad\7L\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3"+
		"\2\2\2\u01ad\35\3\2\2\2\u01ae\u01b1\5 \21\2\u01af\u01b2\5&\24\2\u01b0"+
		"\u01b2\5:\36\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\37\3\2\2"+
		"\2\u01b3\u01b5\5\"\22\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7!\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b9\u01bc\5\u009cO\2\u01ba\u01bc\t\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc#\3\2\2\2\u01bd\u01bf\5v<\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1%\3\2\2\2"+
		"\u01c2\u01c0\3\2\2\2\u01c3\u01c6\5(\25\2\u01c4\u01c6\5\60\31\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\'\3\2\2\2\u01c7\u01c8\7\26\2\2\u01c8"+
		"\u01ca\7q\2\2\u01c9\u01cb\5*\26\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\7\36\2\2\u01cd\u01cf\5~@\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7%"+
		"\2\2\u01d1\u01d3\5> \2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d5\5@!\2\u01d5)\3\2\2\2\u01d6\u01d7\7Q\2\2\u01d7\u01dc"+
		"\5,\27\2\u01d8\u01d9\7M\2\2\u01d9\u01db\5,\27\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7P\2\2\u01e0+\3\2\2\2\u01e1\u01e4"+
		"\7q\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e5\5.\30\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5-\3\2\2\2\u01e6\u01eb\5~@\2\u01e7\u01e8\7b\2\2\u01e8"+
		"\u01ea\5~@\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec/\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef"+
		"\7\35\2\2\u01ef\u01f2\7q\2\2\u01f0\u01f1\7%\2\2\u01f1\u01f3\5> \2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\5\62"+
		"\32\2\u01f5\61\3\2\2\2\u01f6\u01f8\7H\2\2\u01f7\u01f9\5\64\33\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\7M"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01ff\58\35\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0201\7I\2\2\u0201\63\3\2\2\2\u0202\u0207\5\66\34\2\u0203\u0204"+
		"\7M\2\2\u0204\u0206\5\66\34\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\65\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u020a\u020c\5\u009aN\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020d\u020f\7q\2\2\u020e\u0210\5\u012c\u0097\2"+
		"\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0213"+
		"\5@!\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\67\3\2\2\2\u0214"+
		"\u0218\7L\2\2\u0215\u0217\5D#\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u02199\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021e\5<\37\2\u021c\u021e\5\u00a8U\2\u021d\u021b\3\2\2"+
		"\2\u021d\u021c\3\2\2\2\u021e;\3\2\2\2\u021f\u0220\7)\2\2\u0220\u0222\7"+
		"q\2\2\u0221\u0223\5*\26\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0225\7\36\2\2\u0225\u0227\5> \2\u0226\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\5B\"\2\u0229"+
		"=\3\2\2\2\u022a\u022f\5~@\2\u022b\u022c\7M\2\2\u022c\u022e\5~@\2\u022d"+
		"\u022b\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230?\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0236\7H\2\2\u0233\u0235"+
		"\5D#\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7I"+
		"\2\2\u023aA\3\2\2\2\u023b\u023f\7H\2\2\u023c\u023e\5R*\2\u023d\u023c\3"+
		"\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7I\2\2\u0243C\3\2\2\2\u0244"+
		"\u024d\7L\2\2\u0245\u0247\7\63\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024d\5\u00b8]\2\u0249\u024a\5$\23\2\u024a"+
		"\u024b\5F$\2\u024b\u024d\3\2\2\2\u024c\u0244\3\2\2\2\u024c\u0246\3\2\2"+
		"\2\u024c\u0249\3\2\2\2\u024dE\3\2\2\2\u024e\u0258\5J&\2\u024f\u0258\5"+
		"H%\2\u0250\u0251\7=\2\2\u0251\u0252\7q\2\2\u0252\u0258\5\\/\2\u0253\u0254"+
		"\7q\2\2\u0254\u0258\5d\63\2\u0255\u0258\5:\36\2\u0256\u0258\5&\24\2\u0257"+
		"\u024e\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0250\3\2\2\2\u0257\u0253\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258G\3\2\2\2\u0259\u025c"+
		"\5~@\2\u025a\u025d\5N(\2\u025b\u025d\5P)\2\u025c\u025a\3\2\2\2\u025c\u025b"+
		"\3\2\2\2\u025dI\3\2\2\2\u025e\u025f\5*\26\2\u025f\u0260\5L\'\2\u0260K"+
		"\3\2\2\2\u0261\u0264\5~@\2\u0262\u0264\7=\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7q\2\2\u0266\u026a\5Z."+
		"\2\u0267\u0268\7q\2\2\u0268\u026a\5d\63\2\u0269\u0263\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u026aM\3\2\2\2\u026b\u026c\7q\2\2\u026c\u026d\5Z.\2\u026dO\3"+
		"\2\2\2\u026e\u026f\5h\65\2\u026f\u0270\7L\2\2\u0270Q\3\2\2\2\u0271\u0272"+
		"\5$\23\2\u0272\u0273\5T+\2\u0273\u0276\3\2\2\2\u0274\u0276\7L\2\2\u0275"+
		"\u0271\3\2\2\2\u0275\u0274\3\2\2\2\u0276S\3\2\2\2\u0277\u027f\5V,\2\u0278"+
		"\u027f\5`\61\2\u0279\u027a\7=\2\2\u027a\u027b\7q\2\2\u027b\u027f\5b\62"+
		"\2\u027c\u027f\5:\36\2\u027d\u027f\5&\24\2\u027e\u0277\3\2\2\2\u027e\u0278"+
		"\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f"+
		"U\3\2\2\2\u0280\u0281\5~@\2\u0281\u0282\7q\2\2\u0282\u0283\5X-\2\u0283"+
		"W\3\2\2\2\u0284\u0285\5l\67\2\u0285\u0286\7L\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0289\5^\60\2\u0288\u0284\3\2\2\2\u0288\u0287\3\2\2\2\u0289Y\3\2\2\2"+
		"\u028a\u028f\5\u008cG\2\u028b\u028c\7J\2\2\u028c\u028e\7K\2\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0294\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7:\2\2\u0293\u0295\5\u008a"+
		"F\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0299\5\u0092J\2\u0297\u0299\7L\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3"+
		"\2\2\2\u0299[\3\2\2\2\u029a\u029d\5\u008cG\2\u029b\u029c\7:\2\2\u029c"+
		"\u029e\5\u008aF\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a1"+
		"\3\2\2\2\u029f\u02a2\5\u0092J\2\u02a0\u02a2\7L\2\2\u02a1\u029f\3\2\2\2"+
		"\u02a1\u02a0\3\2\2\2\u02a2]\3\2\2\2\u02a3\u02a8\5\u008cG\2\u02a4\u02a5"+
		"\7J\2\2\u02a5\u02a7\7K\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ad\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ac\7:\2\2\u02ac\u02ae\5\u008aF\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\7L\2\2\u02b0_\3\2\2\2\u02b1"+
		"\u02b4\5*\26\2\u02b2\u02b5\5~@\2\u02b3\u02b5\7=\2\2\u02b4\u02b2\3\2\2"+
		"\2\u02b4\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7q\2\2\u02b7\u02b8"+
		"\5^\60\2\u02b8a\3\2\2\2\u02b9\u02bc\5\u008cG\2\u02ba\u02bb\7:\2\2\u02bb"+
		"\u02bd\5\u008aF\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02bf\7L\2\2\u02bfc\3\2\2\2\u02c0\u02c3\5\u008cG\2\u02c1"+
		"\u02c2\7:\2\2\u02c2\u02c4\5\u008aF\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3"+
		"\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\5\u0094K\2\u02c6e\3\2\2\2\u02c7"+
		"\u02c8\7q\2\2\u02c8\u02c9\5n8\2\u02c9g\3\2\2\2\u02ca\u02cf\5j\66\2\u02cb"+
		"\u02cc\7M\2\2\u02cc\u02ce\5j\66\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2"+
		"\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0i\3\2\2\2\u02d1\u02cf"+
		"\3\2\2\2\u02d2\u02d5\5p9\2\u02d3\u02d4\7O\2\2\u02d4\u02d6\5r:\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6k\3\2\2\2\u02d7\u02dc\5n8\2\u02d8"+
		"\u02d9\7M\2\2\u02d9\u02db\5f\64\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2"+
		"\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02ddm\3\2\2\2\u02de\u02dc"+
		"\3\2\2\2\u02df\u02e0\7J\2\2\u02e0\u02e2\7K\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7O\2\2\u02e7\u02e8\5r:\2\u02e8o\3"+
		"\2\2\2\u02e9\u02ee\7q\2\2\u02ea\u02eb\7J\2\2\u02eb\u02ed\7K\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02efq\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\5t;\2\u02f2\u02f4"+
		"\5\u00eav\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4s\3\2\2\2\u02f5"+
		"\u0301\7H\2\2\u02f6\u02fb\5r:\2\u02f7\u02f8\7M\2\2\u02f8\u02fa\5r:\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0300\7M\2\2\u02ff"+
		"\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02f6\3\2"+
		"\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7I\2\2\u0304"+
		"u\3\2\2\2\u0305\u0308\5\u009cO\2\u0306\u0308\t\3\2\2\u0307\u0305\3\2\2"+
		"\2\u0307\u0306\3\2\2\2\u0308w\3\2\2\2\u0309\u030a\5\u0096L\2\u030ay\3"+
		"\2\2\2\u030b\u030c\7q\2\2\u030c{\3\2\2\2\u030d\u030e\5\u0096L\2\u030e"+
		"}\3\2\2\2\u030f\u0314\5\u0080A\2\u0310\u0311\7J\2\2\u0311\u0313\7K\2\2"+
		"\u0312\u0310\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0320\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u031c\5\u0082B"+
		"\2\u0318\u0319\7J\2\2\u0319\u031b\7K\2\2\u031a\u0318\3\2\2\2\u031b\u031e"+
		"\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031f\u030f\3\2\2\2\u031f\u0317\3\2\2\2\u0320\177\3\2\2"+
		"\2\u0321\u0323\7q\2\2\u0322\u0324\5\u0086D\2\u0323\u0322\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u032c\3\2\2\2\u0325\u0326\7N\2\2\u0326\u0328\7q\2"+
		"\2\u0327\u0329\5\u0086D\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u0325\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032c\u032d\3\2\2\2\u032d\u0081\3\2\2\2\u032e\u032c\3\2\2\2\u032f"+
		"\u0330\t\4\2\2\u0330\u0083\3\2\2\2\u0331\u0334\7\37\2\2\u0332\u0334\5"+
		"\u009cO\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0085\3\2\2\2"+
		"\u0335\u0336\7Q\2\2\u0336\u033b\5\u0088E\2\u0337\u0338\7M\2\2\u0338\u033a"+
		"\5\u0088E\2\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2"+
		"\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f"+
		"\7P\2\2\u033f\u0087\3\2\2\2\u0340\u0347\5~@\2\u0341\u0344\7T\2\2\u0342"+
		"\u0343\t\5\2\2\u0343\u0345\5~@\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2"+
		"\2\u0345\u0347\3\2\2\2\u0346\u0340\3\2\2\2\u0346\u0341\3\2\2\2\u0347\u0089"+
		"\3\2\2\2\u0348\u034d\5\u0096L\2\u0349\u034a\7M\2\2\u034a\u034c\5\u0096"+
		"L\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u008b\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0352\7F"+
		"\2\2\u0351\u0353\5\u008eH\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0355\7G\2\2\u0355\u008d\3\2\2\2\u0356\u0357\5\u00c0"+
		"a\2\u0357\u0358\5~@\2\u0358\u0359\5\u0090I\2\u0359\u008f\3\2\2\2\u035a"+
		"\u035d\5p9\2\u035b\u035c\7M\2\2\u035c\u035e\5\u008eH\2\u035d\u035b\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u0362\3\2\2\2\u035f\u0360\7s\2\2\u0360"+
		"\u0362\5p9\2\u0361\u035a\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0091\3\2\2"+
		"\2\u0363\u0364\5\u00b8]\2\u0364\u0093\3\2\2\2\u0365\u0366\5\u00b8]\2\u0366"+
		"\u0095\3\2\2\2\u0367\u036c\7q\2\2\u0368\u0369\7N\2\2\u0369\u036b\7q\2"+
		"\2\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u0097\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\t\6\2\2\u0370"+
		"\u0099\3\2\2\2\u0371\u0373\5\u009cO\2\u0372\u0371\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u009b\3\2\2\2\u0376"+
		"\u0377\7r\2\2\u0377\u037e\5\u009eP\2\u0378\u037b\7F\2\2\u0379\u037c\5"+
		"\u00a0Q\2\u037a\u037c\5\u00a4S\2\u037b\u0379\3\2\2\2\u037b\u037a\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\7G\2\2\u037e\u0378"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u009d\3\2\2\2\u0380\u0385\7q\2\2\u0381"+
		"\u0382\7N\2\2\u0382\u0384\7q\2\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2"+
		"\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u009f\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0388\u038d\5\u00a2R\2\u0389\u038a\7M\2\2\u038a\u038c\5\u00a2"+
		"R\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u00a1\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391\7q"+
		"\2\2\u0391\u0392\7O\2\2\u0392\u0393\5\u00a4S\2\u0393\u00a3\3\2\2\2\u0394"+
		"\u0398\5\u00eex\2\u0395\u0398\5\u009cO\2\u0396\u0398\5\u00a6T\2\u0397"+
		"\u0394\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2\2\2\u0398\u00a5\3\2"+
		"\2\2\u0399\u03a2\7H\2\2\u039a\u039f\5\u00a4S\2\u039b\u039c\7M\2\2\u039c"+
		"\u039e\5\u00a4S\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2"+
		"\u039a\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\7M"+
		"\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03a8\7I\2\2\u03a8\u00a7\3\2\2\2\u03a9\u03aa\7r\2\2\u03aa\u03ab\7)\2"+
		"\2\u03ab\u03ac\7q\2\2\u03ac\u03ad\5\u00aaV\2\u03ad\u00a9\3\2\2\2\u03ae"+
		"\u03b2\7H\2\2\u03af\u03b1\5\u00acW\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3"+
		"\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b5\u03b6\7I\2\2\u03b6\u00ab\3\2\2\2\u03b7\u03b8\5$\23"+
		"\2\u03b8\u03b9\5\u00aeX\2\u03b9\u03bc\3\2\2\2\u03ba\u03bc\7L\2\2\u03bb"+
		"\u03b7\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc\u00ad\3\2\2\2\u03bd\u03be\5~"+
		"@\2\u03be\u03bf\5\u00b0Y\2\u03bf\u03c0\7L\2\2\u03c0\u03d2\3\2\2\2\u03c1"+
		"\u03c3\5(\25\2\u03c2\u03c4\7L\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2"+
		"\2\2\u03c4\u03d2\3\2\2\2\u03c5\u03c7\5<\37\2\u03c6\u03c8\7L\2\2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03d2\3\2\2\2\u03c9\u03cb\5\60"+
		"\31\2\u03ca\u03cc\7L\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03d2\3\2\2\2\u03cd\u03cf\5\u00a8U\2\u03ce\u03d0\7L\2\2\u03cf\u03ce\3"+
		"\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03bd\3\2\2\2\u03d1"+
		"\u03c1\3\2\2\2\u03d1\u03c5\3\2\2\2\u03d1\u03c9\3\2\2\2\u03d1\u03cd\3\2"+
		"\2\2\u03d2\u00af\3\2\2\2\u03d3\u03d6\5\u00b2Z\2\u03d4\u03d6\5\u00b4[\2"+
		"\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6\u00b1\3\2\2\2\u03d7\u03d8"+
		"\7q\2\2\u03d8\u03d9\7F\2\2\u03d9\u03db\7G\2\2\u03da\u03dc\5\u00b6\\\2"+
		"\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u00b3\3\2\2\2\u03dd\u03de"+
		"\5h\65\2\u03de\u00b5\3\2\2\2\u03df\u03e0\7\31\2\2\u03e0\u03e1\5\u00a4"+
		"S\2\u03e1\u00b7\3\2\2\2\u03e2\u03e6\7H\2\2\u03e3\u03e5\5\u00ba^\2\u03e4"+
		"\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea\7I\2\2\u03ea"+
		"\u00b9\3\2\2\2\u03eb\u03ef\5\u00bc_\2\u03ec\u03ef\5\36\20\2\u03ed\u03ef"+
		"\5\u00c2b\2\u03ee\u03eb\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2"+
		"\2\u03ef\u00bb\3\2\2\2\u03f0\u03f1\5\u00be`\2\u03f1\u03f2\7L\2\2\u03f2"+
		"\u00bd\3\2\2\2\u03f3\u03f4\5\u00c0a\2\u03f4\u03f5\5~@\2\u03f5\u03f6\5"+
		"h\65\2\u03f6\u00bf\3\2\2\2\u03f7\u03f9\5\u0084C\2\u03f8\u03f7\3\2\2\2"+
		"\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u00c1"+
		"\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0454\5\u00b8]\2\u03fe\u03ff\7\17\2"+
		"\2\u03ff\u0402\5\u00eav\2\u0400\u0401\7U\2\2\u0401\u0403\5\u00eav\2\u0402"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\7L"+
		"\2\2\u0405\u0454\3\2\2\2\u0406\u0407\7#\2\2\u0407\u0408\5\u00e2r\2\u0408"+
		"\u040b\5\u00c2b\2\u0409\u040a\7\34\2\2\u040a\u040c\5\u00c2b\2\u040b\u0409"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0454\3\2\2\2\u040d\u040e\7\"\2\2\u040e"+
		"\u040f\7F\2\2\u040f\u0410\5\u00dan\2\u0410\u0411\7G\2\2\u0411\u0412\5"+
		"\u00c2b\2\u0412\u0454\3\2\2\2\u0413\u0414\7?\2\2\u0414\u0415\5\u00e2r"+
		"\2\u0415\u0416\5\u00c2b\2\u0416\u0454\3\2\2\2\u0417\u0418\7\32\2\2\u0418"+
		"\u0419\5\u00c2b\2\u0419\u041a\7?\2\2\u041a\u041b\5\u00e2r\2\u041b\u041c"+
		"\7L\2\2\u041c\u0454\3\2\2\2\u041d\u041e\7<\2\2\u041e\u0424\5\u00b8]\2"+
		"\u041f\u0421\5\u00c4c\2\u0420\u0422\5\u00caf\2\u0421\u0420\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0425\5\u00caf\2\u0424\u041f"+
		"\3\2\2\2\u0424\u0423\3\2\2\2\u0425\u0454\3\2\2\2\u0426\u0427\7<\2\2\u0427"+
		"\u0428\5\u00ccg\2\u0428\u042a\5\u00b8]\2\u0429\u042b\5\u00c4c\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042e\5\u00ca"+
		"f\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0454\3\2\2\2\u042f"+
		"\u0430\7\66\2\2\u0430\u0431\5\u00e2r\2\u0431\u0432\7H\2\2\u0432\u0433"+
		"\5\u00d4k\2\u0433\u0434\7I\2\2\u0434\u0454\3\2\2\2\u0435\u0436\7\67\2"+
		"\2\u0436\u0437\5\u00e2r\2\u0437\u0438\5\u00b8]\2\u0438\u0454\3\2\2\2\u0439"+
		"\u043b\7\61\2\2\u043a\u043c\5\u00eav\2\u043b\u043a\3\2\2\2\u043b\u043c"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0454\7L\2\2\u043e\u043f\79\2\2\u043f"+
		"\u0440\5\u00eav\2\u0440\u0441\7L\2\2\u0441\u0454\3\2\2\2\u0442\u0444\7"+
		"\21\2\2\u0443\u0445\7q\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0454\7L\2\2\u0447\u0449\7\30\2\2\u0448\u044a\7q"+
		"\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u0454\7L\2\2\u044c\u0454\7L\2\2\u044d\u044e\5\u00e6t\2\u044e\u044f\7"+
		"L\2\2\u044f\u0454\3\2\2\2\u0450\u0451\7q\2\2\u0451\u0452\7U\2\2\u0452"+
		"\u0454\5\u00c2b\2\u0453\u03fd\3\2\2\2\u0453\u03fe\3\2\2\2\u0453\u0406"+
		"\3\2\2\2\u0453\u040d\3\2\2\2\u0453\u0413\3\2\2\2\u0453\u0417\3\2\2\2\u0453"+
		"\u041d\3\2\2\2\u0453\u0426\3\2\2\2\u0453\u042f\3\2\2\2\u0453\u0435\3\2"+
		"\2\2\u0453\u0439\3\2\2\2\u0453\u043e\3\2\2\2\u0453\u0442\3\2\2\2\u0453"+
		"\u0447\3\2\2\2\u0453\u044c\3\2\2\2\u0453\u044d\3\2\2\2\u0453\u0450\3\2"+
		"\2\2\u0454\u00c3\3\2\2\2\u0455\u0457\5\u00c6d\2\u0456\u0455\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u00c5\3\2"+
		"\2\2\u045a\u045b\7\24\2\2\u045b\u045c\7F\2\2\u045c\u045d\5\u00c0a\2\u045d"+
		"\u045e\5\u00c8e\2\u045e\u045f\7q\2\2\u045f\u0460\7G\2\2\u0460\u0461\5"+
		"\u00b8]\2\u0461\u00c7\3\2\2\2\u0462\u0467\5\u0096L\2\u0463\u0464\7c\2"+
		"\2\u0464\u0466\5\u0096L\2\u0465\u0463\3\2\2\2\u0466\u0469\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u00c9\3\2\2\2\u0469\u0467\3\2"+
		"\2\2\u046a\u046b\7 \2\2\u046b\u046c\5\u00b8]\2\u046c\u00cb\3\2\2\2\u046d"+
		"\u046e\7F\2\2\u046e\u0470\5\u00ceh\2\u046f\u0471\7L\2\2\u0470\u046f\3"+
		"\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7G\2\2\u0473"+
		"\u00cd\3\2\2\2\u0474\u0479\5\u00d0i\2\u0475\u0476\7L\2\2\u0476\u0478\5"+
		"\u00d0i\2\u0477\u0475\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2"+
		"\u0479\u047a\3\2\2\2\u047a\u00cf\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047d"+
		"\5\u00c0a\2\u047d\u047e\5\u0080A\2\u047e\u047f\5p9\2\u047f\u0480\7O\2"+
		"\2\u0480\u0481\5\u00eav\2\u0481\u00d1\3\2\2\2\u0482\u0483\5\u00c0a\2\u0483"+
		"\u0484\5~@\2\u0484\u0485\5p9\2\u0485\u00d3\3\2\2\2\u0486\u0488\5\u00d6"+
		"l\2\u0487\u0486\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u00d5\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u048e\5\u00d8"+
		"m\2\u048d\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u048d\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u0494\3\2\2\2\u0491\u0493\5\u00ba^\2\u0492\u0491"+
		"\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u00d7\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7\23\2\2\u0498\u0499\5"+
		"\u00e8u\2\u0499\u049a\7U\2\2\u049a\u04a2\3\2\2\2\u049b\u049c\7\23\2\2"+
		"\u049c\u049d\5z>\2\u049d\u049e\7U\2\2\u049e\u04a2\3\2\2\2\u049f\u04a0"+
		"\7\31\2\2\u04a0\u04a2\7U\2\2\u04a1\u0497\3\2\2\2\u04a1\u049b\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a2\u00d9\3\2\2\2\u04a3\u04b0\5\u00dep\2\u04a4\u04a6"+
		"\5\u00dco\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2"+
		"\2\u04a7\u04a9\7L\2\2\u04a8\u04aa\5\u00eav\2\u04a9\u04a8\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\7L\2\2\u04ac\u04ae\5\u00e0"+
		"q\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\3\2\2\2\u04af"+
		"\u04a3\3\2\2\2\u04af\u04a5\3\2\2\2\u04b0\u00db\3\2\2\2\u04b1\u04b4\5\u00be"+
		"`\2\u04b2\u04b4\5\u00e4s\2\u04b3\u04b1\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4"+
		"\u00dd\3\2\2\2\u04b5\u04b6\5\u00c0a\2\u04b6\u04b7\5~@\2\u04b7\u04b8\7"+
		"q\2\2\u04b8\u04b9\7U\2\2\u04b9\u04ba\5\u00eav\2\u04ba\u00df\3\2\2\2\u04bb"+
		"\u04bc\5\u00e4s\2\u04bc\u00e1\3\2\2\2\u04bd\u04be\7F\2\2\u04be\u04bf\5"+
		"\u00eav\2\u04bf\u04c0\7G\2\2\u04c0\u00e3\3\2\2\2\u04c1\u04c6\5\u00eav"+
		"\2\u04c2\u04c3\7M\2\2\u04c3\u04c5\5\u00eav\2\u04c4\u04c2\3\2\2\2\u04c5"+
		"\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u00e5\3\2"+
		"\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\5\u00eav\2\u04ca\u00e7\3\2\2\2\u04cb"+
		"\u04cc\5\u00eav\2\u04cc\u00e9\3\2\2\2\u04cd\u04d1\5\u00eex\2\u04ce\u04cf"+
		"\5\u00ecw\2\u04cf\u04d0\5\u00eav\2\u04d0\u04d2\3\2\2\2\u04d1\u04ce\3\2"+
		"\2\2\u04d1\u04d2\3\2\2\2\u04d2\u00eb\3\2\2\2\u04d3\u04d4\t\7\2\2\u04d4"+
		"\u00ed\3\2\2\2\u04d5\u04db\5\u00f0y\2\u04d6\u04d7\7T\2\2\u04d7\u04d8\5"+
		"\u00eav\2\u04d8\u04d9\7U\2\2\u04d9\u04da\5\u00eex\2\u04da\u04dc\3\2\2"+
		"\2\u04db\u04d6\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u00ef\3\2\2\2\u04dd\u04e2"+
		"\5\u00f2z\2\u04de\u04df\7[\2\2\u04df\u04e1\5\u00f2z\2\u04e0\u04de\3\2"+
		"\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u00f1\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04ea\5\u00f4{\2\u04e6\u04e7"+
		"\7Z\2\2\u04e7\u04e9\5\u00f4{\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\3\2\2\2"+
		"\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u00f3\3\2\2\2\u04ec\u04ea"+
		"\3\2\2\2\u04ed\u04f2\5\u00f6|\2\u04ee\u04ef\7c\2\2\u04ef\u04f1\5\u00f6"+
		"|\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u00f5\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04fa\5\u00f8"+
		"}\2\u04f6\u04f7\7d\2\2\u04f7\u04f9\5\u00f8}\2\u04f8\u04f6\3\2\2\2\u04f9"+
		"\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00f7\3\2"+
		"\2\2\u04fc\u04fa\3\2\2\2\u04fd\u0502\5\u00fa~\2\u04fe\u04ff\7b\2\2\u04ff"+
		"\u0501\5\u00fa~\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u00f9\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u050a\5\u00fc\177\2\u0506\u0507\t\b\2\2\u0507\u0509\5\u00fc\177\2\u0508"+
		"\u0506\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2"+
		"\2\2\u050b\u00fb\3\2\2\2\u050c\u050a\3\2\2\2\u050d\u0510\5\u00fe\u0080"+
		"\2\u050e\u050f\7\'\2\2\u050f\u0511\5~@\2\u0510\u050e\3\2\2\2\u0510\u0511"+
		"\3\2\2\2\u0511\u00fd\3\2\2\2\u0512\u0518\5\u0102\u0082\2\u0513\u0514\5"+
		"\u0100\u0081\2\u0514\u0515\5\u0102\u0082\2\u0515\u0517\3\2\2\2\u0516\u0513"+
		"\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u00ff\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051c\t\t\2\2\u051c\u0101\3\2"+
		"\2\2\u051d\u0523\5\u0106\u0084\2\u051e\u051f\5\u0104\u0083\2\u051f\u0520"+
		"\5\u0106\u0084\2\u0520\u0522\3\2\2\2\u0521\u051e\3\2\2\2\u0522\u0525\3"+
		"\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0103\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0526\u0527\7Q\2\2\u0527\u052e\7Q\2\2\u0528\u0529\7P\2"+
		"\2\u0529\u052a\7P\2\2\u052a\u052e\7P\2\2\u052b\u052c\7P\2\2\u052c\u052e"+
		"\7P\2\2\u052d\u0526\3\2\2\2\u052d\u0528\3\2\2\2\u052d\u052b\3\2\2\2\u052e"+
		"\u0105\3\2\2\2\u052f\u0534\5\u0108\u0085\2\u0530\u0531\t\n\2\2\u0531\u0533"+
		"\5\u0108\u0085\2\u0532\u0530\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3"+
		"\2\2\2\u0534\u0535\3\2\2\2\u0535\u0107\3\2\2\2\u0536\u0534\3\2\2\2\u0537"+
		"\u053c\5\u010a\u0086\2\u0538\u0539\t\13\2\2\u0539\u053b\5\u010a\u0086"+
		"\2\u053a\u0538\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u0109\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0540\7^\2\2\u0540"+
		"\u0549\5\u010a\u0086\2\u0541\u0542\7_\2\2\u0542\u0549\5\u010a\u0086\2"+
		"\u0543\u0544\7\\\2\2\u0544\u0549\5\u010a\u0086\2\u0545\u0546\7]\2\2\u0546"+
		"\u0549\5\u010a\u0086\2\u0547\u0549\5\u010c\u0087\2\u0548\u053f\3\2\2\2"+
		"\u0548\u0541\3\2\2\2\u0548\u0543\3\2\2\2\u0548\u0545\3\2\2\2\u0548\u0547"+
		"\3\2\2\2\u0549\u010b\3\2\2\2\u054a\u054b\7S\2\2\u054b\u055a\5\u010a\u0086"+
		"\2\u054c\u054d\7R\2\2\u054d\u055a\5\u010a\u0086\2\u054e\u055a\5\u010e"+
		"\u0088\2\u054f\u0553\5\u0110\u0089\2\u0550\u0552\5\u0126\u0094\2\u0551"+
		"\u0550\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2"+
		"\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0558\t\f\2\2\u0557"+
		"\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559\u054a\3\2"+
		"\2\2\u0559\u054c\3\2\2\2\u0559\u054e\3\2\2\2\u0559\u054f\3\2\2\2\u055a"+
		"\u010d\3\2\2\2\u055b\u055c\7F\2\2\u055c\u055d\5\u0082B\2\u055d\u055e\7"+
		"G\2\2\u055e\u055f\5\u010a\u0086\2\u055f\u0569\3\2\2\2\u0560\u0563\7F\2"+
		"\2\u0561\u0564\5~@\2\u0562\u0564\5\u00eav\2\u0563\u0561\3\2\2\2\u0563"+
		"\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\7G\2\2\u0566\u0567\5\u010c"+
		"\u0087\2\u0567\u0569\3\2\2\2\u0568\u055b\3\2\2\2\u0568\u0560\3\2\2\2\u0569"+
		"\u010f\3\2\2\2\u056a\u0594\5\u00e2r\2\u056b\u056d\78\2\2\u056c\u056e\5"+
		"\u012c\u0097\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0594\3\2"+
		"\2\2\u056f\u0570\7\65\2\2\u0570\u0594\5\u0128\u0095\2\u0571\u0594\5\u0098"+
		"M\2\u0572\u0573\7,\2\2\u0573\u0594\5\u0114\u008b\2\u0574\u0578\5\u0120"+
		"\u0091\2\u0575\u0579\5\u012a\u0096\2\u0576\u0577\78\2\2\u0577\u0579\5"+
		"\u012c\u0097\2\u0578\u0575\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u0594\3\2"+
		"\2\2\u057a\u057f\7q\2\2\u057b\u057c\7N\2\2\u057c\u057e\7q\2\2\u057d\u057b"+
		"\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0582\u0584\5\u0112\u008a\2\u0583\u0582"+
		"\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0594\3\2\2\2\u0585\u058a\5\u0082B"+
		"\2\u0586\u0587\7J\2\2\u0587\u0589\7K\2\2\u0588\u0586\3\2\2\2\u0589\u058c"+
		"\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c"+
		"\u058a\3\2\2\2\u058d\u058e\7N\2\2\u058e\u058f\7\26\2\2\u058f\u0594\3\2"+
		"\2\2\u0590\u0591\7=\2\2\u0591\u0592\7N\2\2\u0592\u0594\7\26\2\2\u0593"+
		"\u056a\3\2\2\2\u0593\u056b\3\2\2\2\u0593\u056f\3\2\2\2\u0593\u0571\3\2"+
		"\2\2\u0593\u0572\3\2\2\2\u0593\u0574\3\2\2\2\u0593\u057a\3\2\2\2\u0593"+
		"\u0585\3\2\2\2\u0593\u0590\3\2\2\2\u0594\u0111\3\2\2\2\u0595\u0596\7J"+
		"\2\2\u0596\u0598\7K\2\2\u0597\u0595\3\2\2\2\u0598\u0599\3\2\2\2\u0599"+
		"\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\7N"+
		"\2\2\u059c\u05b2\7\26\2\2\u059d\u059e\7J\2\2\u059e\u059f\5\u00eav\2\u059f"+
		"\u05a0\7K\2\2\u05a0\u05b2\3\2\2\2\u05a1\u05b2\5\u012c\u0097\2\u05a2\u05a3"+
		"\7N\2\2\u05a3\u05b2\7\26\2\2\u05a4\u05a5\7N\2\2\u05a5\u05b2\5\u011e\u0090"+
		"\2\u05a6\u05a7\7N\2\2\u05a7\u05b2\78\2\2\u05a8\u05a9\7N\2\2\u05a9\u05aa"+
		"\7\65\2\2\u05aa\u05b2\5\u012c\u0097\2\u05ab\u05ac\7N\2\2\u05ac\u05ae\7"+
		",\2\2\u05ad\u05af\5\u0120\u0091\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2"+
		"\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\5\u0118\u008d\2\u05b1\u0597\3\2\2"+
		"\2\u05b1\u059d\3\2\2\2\u05b1\u05a1\3\2\2\2\u05b1\u05a2\3\2\2\2\u05b1\u05a4"+
		"\3\2\2\2\u05b1\u05a6\3\2\2\2\u05b1\u05a8\3\2\2\2\u05b1\u05ab\3\2\2\2\u05b2"+
		"\u0113\3\2\2\2\u05b3\u05b4\5\u0120\u0091\2\u05b4\u05b5\5\u0116\u008c\2"+
		"\u05b5\u05b6\5\u011c\u008f\2\u05b6\u05bd\3\2\2\2\u05b7\u05ba\5\u0116\u008c"+
		"\2\u05b8\u05bb\5\u011a\u008e\2\u05b9\u05bb\5\u011c\u008f\2\u05ba\u05b8"+
		"\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05b3\3\2\2\2\u05bc"+
		"\u05b7\3\2\2\2\u05bd\u0115\3\2\2\2\u05be\u05c0\7q\2\2\u05bf\u05c1\5\u0122"+
		"\u0092\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c9\3\2\2\2\u05c2"+
		"\u05c3\7N\2\2\u05c3\u05c5\7q\2\2\u05c4\u05c6\5\u0122\u0092\2\u05c5\u05c4"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c2\3\2\2\2\u05c8"+
		"\u05cb\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05ce\3\2"+
		"\2\2\u05cb\u05c9\3\2\2\2\u05cc\u05ce\5\u0082B\2\u05cd\u05be\3\2\2\2\u05cd"+
		"\u05cc\3\2\2\2\u05ce\u0117\3\2\2\2\u05cf\u05d1\7q\2\2\u05d0\u05d2\5\u0124"+
		"\u0093\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3"+
		"\u05d4\5\u011c\u008f\2\u05d4\u0119\3\2\2\2\u05d5\u05f1\7J\2\2\u05d6\u05db"+
		"\7K\2\2\u05d7\u05d8\7J\2\2\u05d8\u05da\7K\2\2\u05d9\u05d7\3\2\2\2\u05da"+
		"\u05dd\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2"+
		"\2\2\u05dd\u05db\3\2\2\2\u05de\u05f2\5t;\2\u05df\u05e0\5\u00eav\2\u05e0"+
		"\u05e7\7K\2\2\u05e1\u05e2\7J\2\2\u05e2\u05e3\5\u00eav\2\u05e3\u05e4\7"+
		"K\2\2\u05e4\u05e6\3\2\2\2\u05e5\u05e1\3\2\2\2\u05e6\u05e9\3\2\2\2\u05e7"+
		"\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ee\3\2\2\2\u05e9\u05e7\3\2"+
		"\2\2\u05ea\u05eb\7J\2\2\u05eb\u05ed\7K\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f0"+
		"\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0"+
		"\u05ee\3\2\2\2\u05f1\u05d6\3\2\2\2\u05f1\u05df\3\2\2\2\u05f2\u011b\3\2"+
		"\2\2\u05f3\u05f5\5\u012c\u0097\2\u05f4\u05f6\5@!\2\u05f5\u05f4\3\2\2\2"+
		"\u05f5\u05f6\3\2\2\2\u05f6\u011d\3\2\2\2\u05f7\u05f8\5\u0120\u0091\2\u05f8"+
		"\u05f9\5\u012a\u0096\2\u05f9\u011f\3\2\2\2\u05fa\u05fb\7Q\2\2\u05fb\u05fc"+
		"\5> \2\u05fc\u05fd\7P\2\2\u05fd\u0121\3\2\2\2\u05fe\u05ff\7Q\2\2\u05ff"+
		"\u0602\7P\2\2\u0600\u0602\5\u0086D\2\u0601\u05fe\3\2\2\2\u0601\u0600\3"+
		"\2\2\2\u0602\u0123\3\2\2\2\u0603\u0604\7Q\2\2\u0604\u0607\7P\2\2\u0605"+
		"\u0607\5\u0120\u0091\2\u0606\u0603\3\2\2\2\u0606\u0605\3\2\2\2\u0607\u0125"+
		"\3\2\2\2\u0608\u0609\7N\2\2\u0609\u060b\7q\2\2\u060a\u060c\5\u012c\u0097"+
		"\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u061f\3\2\2\2\u060d\u060e"+
		"\7N\2\2\u060e\u061f\5\u011e\u0090\2\u060f\u0610\7N\2\2\u0610\u061f\78"+
		"\2\2\u0611\u0612\7N\2\2\u0612\u0613\7\65\2\2\u0613\u061f\5\u0128\u0095"+
		"\2\u0614\u0615\7N\2\2\u0615\u0617\7,\2\2\u0616\u0618\5\u0120\u0091\2\u0617"+
		"\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061f\5\u0118"+
		"\u008d\2\u061a\u061b\7J\2\2\u061b\u061c\5\u00eav\2\u061c\u061d\7K\2\2"+
		"\u061d\u061f\3\2\2\2\u061e\u0608\3\2\2\2\u061e\u060d\3\2\2\2\u061e\u060f"+
		"\3\2\2\2\u061e\u0611\3\2\2\2\u061e\u0614\3\2\2\2\u061e\u061a\3\2\2\2\u061f"+
		"\u0127\3\2\2\2\u0620\u0627\5\u012c\u0097\2\u0621\u0622\7N\2\2\u0622\u0624"+
		"\7q\2\2\u0623\u0625\5\u012c\u0097\2\u0624\u0623\3\2\2\2\u0624\u0625\3"+
		"\2\2\2\u0625\u0627\3\2\2\2\u0626\u0620\3\2\2\2\u0626\u0621\3\2\2\2\u0627"+
		"\u0129\3\2\2\2\u0628\u0629\7\65\2\2\u0629\u062d\5\u0128\u0095\2\u062a"+
		"\u062b\7q\2\2\u062b\u062d\5\u012c\u0097\2\u062c\u0628\3\2\2\2\u062c\u062a"+
		"\3\2\2\2\u062d\u012b\3\2\2\2\u062e\u0630\7F\2\2\u062f\u0631\5\u00e4s\2"+
		"\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633"+
		"\7G\2\2\u0633\u012d\3\2\2\2\u00b9\u0150\u0158\u015b\u015e\u0164\u016b"+
		"\u016d\u0175\u017b\u0182\u0185\u018a\u018f\u0195\u0199\u01a1\u01a6\u01ac"+
		"\u01b1\u01b6\u01bb\u01c0\u01c5\u01ca\u01ce\u01d2\u01dc\u01e4\u01eb\u01f2"+
		"\u01f8\u01fb\u01fe\u0207\u020b\u020f\u0212\u0218\u021d\u0222\u0226\u022f"+
		"\u0236\u023f\u0246\u024c\u0257\u025c\u0263\u0269\u0275\u027e\u0288\u028f"+
		"\u0294\u0298\u029d\u02a1\u02a8\u02ad\u02b4\u02bc\u02c3\u02cf\u02d5\u02dc"+
		"\u02e3\u02ee\u02f3\u02fb\u02ff\u0301\u0307\u0314\u031c\u031f\u0323\u0328"+
		"\u032c\u0333\u033b\u0344\u0346\u034d\u0352\u035d\u0361\u036c\u0374\u037b"+
		"\u037e\u0385\u038d\u0397\u039f\u03a2\u03a5\u03b2\u03bb\u03c3\u03c7\u03cb"+
		"\u03cf\u03d1\u03d5\u03db\u03e6\u03ee\u03fa\u0402\u040b\u0421\u0424\u042a"+
		"\u042d\u043b\u0444\u0449\u0453\u0458\u0467\u0470\u0479\u0489\u048f\u0494"+
		"\u04a1\u04a5\u04a9\u04ad\u04af\u04b3\u04c6\u04d1\u04db\u04e2\u04ea\u04f2"+
		"\u04fa\u0502\u050a\u0510\u0518\u0523\u052d\u0534\u053c\u0548\u0553\u0557"+
		"\u0559\u0563\u0568\u056d\u0578\u057f\u0583\u058a\u0593\u0599\u05ae\u05b1"+
		"\u05ba\u05bc\u05c0\u05c5\u05c9\u05cd\u05d1\u05db\u05e7\u05ee\u05f1\u05f5"+
		"\u0601\u0606\u060b\u0617\u061e\u0624\u0626\u062c\u0630";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}