// Generated from /Users/darth_sky/Teaching/CSE232B-Database System Implementation/JavaXQuery/src/main/antlr4/XQuery.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Var=10, FOR=11, WHERE=12, IN=13, RETURN=14, LET=15, INT=16, STRING=17, 
		FILENAME=18, SLASH=19, DOUBLE_SLASH=20, TAGNAME=21, ATTNAME=22, STAR=23, 
		DOT=24, EQUALS=25, EQ=26, DOUBLE_EQUALS=27, IS=28, AND=29, OR=30, NOT=31, 
		LPAREN=32, RPAREN=33, LBRACKET=34, RBRACKET=35, COMMA=36, WS=37;
	public static final int
		RULE_xq = 0, RULE_primaryXq = 1, RULE_forClause = 2, RULE_varBindings = 3, 
		RULE_varBinding = 4, RULE_letClause = 5, RULE_whereClause = 6, RULE_returnClause = 7, 
		RULE_cond = 8, RULE_primaryCond = 9, RULE_ap = 10, RULE_rp = 11, RULE_f = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "primaryXq", "forClause", "varBindings", "varBinding", "letClause", 
			"whereClause", "returnClause", "cond", "primaryCond", "ap", "rp", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'{'", "'}'", "'</'", "'some'", "'satisfies'", "'text()'", 
			"'\"'", null, null, null, null, null, null, null, null, null, "'/'", 
			"'//'", null, null, "'*'", "'.'", null, null, null, null, null, null, 
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Var", "FOR", 
			"WHERE", "IN", "RETURN", "LET", "INT", "STRING", "FILENAME", "SLASH", 
			"DOUBLE_SLASH", "TAGNAME", "ATTNAME", "STAR", "DOT", "EQUALS", "EQ", 
			"DOUBLE_EQUALS", "IS", "AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "COMMA", "WS"
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
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqContext extends ParserRuleContext {
		public PrimaryXqContext primaryXq() {
			return getRuleContext(PrimaryXqContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public TerminalNode DOUBLE_SLASH() { return getToken(XQueryParser.DOUBLE_SLASH, 0); }
		public List<TerminalNode> STRING() { return getTokens(XQueryParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(XQueryParser.STRING, i);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		XqContext _localctx = new XqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xq);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case FILENAME:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				primaryXq();
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(27);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68721049600L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(28);
					xq();
					}
					break;
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(STRING);
				setState(33);
				match(T__1);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(34);
					match(WS);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(T__2);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(41);
					match(WS);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				xq();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(48);
					match(WS);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__3);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(55);
					match(WS);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__4);
				setState(62);
				match(STRING);
				setState(63);
				match(T__1);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				forClause();
				setState(66);
				letClause();
				setState(67);
				whereClause();
				setState(68);
				returnClause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				letClause();
				setState(71);
				primaryXq();
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68721049600L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(73);
					xq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryXqContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public PrimaryXqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryXq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPrimaryXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPrimaryXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPrimaryXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryXqContext primaryXq() throws RecognitionException {
		PrimaryXqContext _localctx = new PrimaryXqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryXq);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Var);
				}
				break;
			case FILENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				ap();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(LPAREN);
				setState(81);
				xq();
				setState(82);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(XQueryParser.FOR, 0); }
		public VarBindingsContext varBindings() {
			return getRuleContext(VarBindingsContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FOR);
			setState(87);
			varBindings();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarBindingsContext extends ParserRuleContext {
		public List<VarBindingContext> varBinding() {
			return getRuleContexts(VarBindingContext.class);
		}
		public VarBindingContext varBinding(int i) {
			return getRuleContext(VarBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public VarBindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBindingsContext varBindings() throws RecognitionException {
		VarBindingsContext _localctx = new VarBindingsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varBindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			varBinding();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90);
				match(COMMA);
				setState(91);
				varBinding();
				}
				}
				setState(96);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarBindingContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public TerminalNode IN() { return getToken(XQueryParser.IN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public VarBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBindingContext varBinding() throws RecognitionException {
		VarBindingContext _localctx = new VarBindingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Var);
			setState(98);
			match(IN);
			setState(99);
			xq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XQueryParser.LET, 0); }
		public VarBindingsContext varBindings() {
			return getRuleContext(VarBindingsContext.class,0);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LET);
			setState(102);
			varBindings();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XQueryParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(WHERE);
				setState(105);
				cond();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(106);
					match(WS);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XQueryParser.RETURN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(RETURN);
			setState(116);
			xq();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					match(WS);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public PrimaryCondContext primaryCond() {
			return getRuleContext(PrimaryCondContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode AND() { return getToken(XQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQueryParser.OR, 0); }
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public TerminalNode IN() { return getToken(XQueryParser.IN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				primaryCond();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(125);
					cond();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(NOT);
				setState(129);
				cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__5);
				setState(131);
				match(Var);
				setState(132);
				match(IN);
				setState(133);
				xq();
				setState(134);
				match(T__6);
				setState(135);
				cond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(LPAREN);
				setState(138);
				cond();
				setState(139);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryCondContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQueryParser.EQ, 0); }
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public TerminalNode DOUBLE_EQUALS() { return getToken(XQueryParser.DOUBLE_EQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(XQueryParser.EQUALS, 0); }
		public PrimaryCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterPrimaryCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitPrimaryCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitPrimaryCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryCondContext primaryCond() throws RecognitionException {
		PrimaryCondContext _localctx = new PrimaryCondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			xq();
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			xq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode DOUBLE_SLASH() { return getToken(XQueryParser.DOUBLE_SLASH, 0); }
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ap);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(147);
				match(FILENAME);
				setState(148);
				match(SLASH);
				setState(149);
				rp(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(150);
				match(FILENAME);
				setState(151);
				match(DOUBLE_SLASH);
				setState(152);
				rp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XQueryParser.STRING, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public TerminalNode DOT() { return getToken(XQueryParser.DOT, 0); }
		public TerminalNode ATTNAME() { return getToken(XQueryParser.ATTNAME, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public TerminalNode DOUBLE_SLASH() { return getToken(XQueryParser.DOUBLE_SLASH, 0); }
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public TerminalNode LBRACKET() { return getToken(XQueryParser.LBRACKET, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(156);
				match(STRING);
				}
				break;
			case STAR:
				{
				setState(157);
				match(STAR);
				}
				break;
			case DOT:
				{
				setState(158);
				match(DOT);
				}
				break;
			case ATTNAME:
				{
				setState(159);
				match(ATTNAME);
				}
				break;
			case LPAREN:
				{
				setState(160);
				match(LPAREN);
				setState(161);
				rp(0);
				setState(162);
				match(RPAREN);
				}
				break;
			case T__7:
				{
				setState(164);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(SLASH);
						setState(169);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(DOUBLE_SLASH);
						setState(172);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(COMMA);
						setState(175);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(LBRACKET);
						setState(178);
						f(0);
						setState(179);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(XQueryParser.EQUALS, 0); }
		public TerminalNode EQ() { return getToken(XQueryParser.EQ, 0); }
		public TerminalNode DOUBLE_EQUALS() { return getToken(XQueryParser.DOUBLE_EQUALS, 0); }
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(XQueryParser.STRING, 0); }
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public TerminalNode AND() { return getToken(XQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQueryParser.OR, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(187);
				rp(0);
				}
				break;
			case 2:
				{
				setState(188);
				rp(0);
				setState(189);
				match(EQUALS);
				setState(190);
				rp(0);
				}
				break;
			case 3:
				{
				setState(192);
				rp(0);
				setState(193);
				match(EQ);
				setState(194);
				rp(0);
				}
				break;
			case 4:
				{
				setState(196);
				rp(0);
				setState(197);
				match(DOUBLE_EQUALS);
				setState(198);
				rp(0);
				}
				break;
			case 5:
				{
				setState(200);
				rp(0);
				setState(201);
				match(IS);
				setState(202);
				rp(0);
				}
				break;
			case 6:
				{
				setState(204);
				match(LPAREN);
				setState(205);
				f(0);
				setState(206);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(208);
				rp(0);
				setState(209);
				match(EQUALS);
				setState(210);
				match(T__8);
				setState(211);
				match(STRING);
				setState(212);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(214);
				match(NOT);
				setState(215);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(218);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(219);
						match(AND);
						setState(220);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(221);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(222);
						match(OR);
						setState(223);
						f(3);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 12:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001e\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000"+
		"\n\u0000\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0005\u00002\b\u0000"+
		"\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0005\u00009\b\u0000"+
		"\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000K\b\u0000\u0003\u0000"+
		"M\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003]\b\u0003\n\u0003\f\u0003"+
		"`\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007w\b\u0007\n\u0007\f\u0007z\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u007f\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a6\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00b6\b\u000b\n\u000b\f\u000b\u00b9\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00e1\b\f\n\f\f\f\u00e4\t\f\u0001\f\u0000\u0002\u0016"+
		"\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u0000\u0003\u0002\u0000\u0013\u0014$$\u0001\u0000\u001d\u001e\u0001\u0000"+
		"\u0019\u001c\u00fe\u0000L\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000"+
		"\u0000\u0004V\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b"+
		"a\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000"+
		"\u0000\u000es\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000"+
		"\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u0099\u0001\u0000\u0000\u0000"+
		"\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001c\u0007\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001eM\u0001\u0000\u0000\u0000\u001f"+
		" \u0005\u0001\u0000\u0000 !\u0005\u0011\u0000\u0000!%\u0005\u0002\u0000"+
		"\u0000\"$\u0005%\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(,\u0005\u0003\u0000\u0000"+
		")+\u0005%\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/3\u0003\u0000\u0000\u000002\u0005%\u0000"+
		"\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006:\u0005\u0004\u0000\u000079\u0005%\u0000\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0005\u0000\u0000>?\u0005\u0011\u0000\u0000?@\u0005\u0002"+
		"\u0000\u0000@M\u0001\u0000\u0000\u0000AB\u0003\u0004\u0002\u0000BC\u0003"+
		"\n\u0005\u0000CD\u0003\f\u0006\u0000DE\u0003\u000e\u0007\u0000EM\u0001"+
		"\u0000\u0000\u0000FG\u0003\n\u0005\u0000GJ\u0003\u0002\u0001\u0000HI\u0007"+
		"\u0000\u0000\u0000IK\u0003\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000L\u001a\u0001\u0000"+
		"\u0000\u0000L\u001f\u0001\u0000\u0000\u0000LA\u0001\u0000\u0000\u0000"+
		"LF\u0001\u0000\u0000\u0000M\u0001\u0001\u0000\u0000\u0000NU\u0005\n\u0000"+
		"\u0000OU\u0003\u0014\n\u0000PQ\u0005 \u0000\u0000QR\u0003\u0000\u0000"+
		"\u0000RS\u0005!\u0000\u0000SU\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000"+
		"\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000U\u0003\u0001"+
		"\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0003\u0006\u0003\u0000"+
		"X\u0005\u0001\u0000\u0000\u0000Y^\u0003\b\u0004\u0000Z[\u0005$\u0000\u0000"+
		"[]\u0003\b\u0004\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0007\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\n\u0000\u0000bc\u0005"+
		"\r\u0000\u0000cd\u0003\u0000\u0000\u0000d\t\u0001\u0000\u0000\u0000ef"+
		"\u0005\u000f\u0000\u0000fg\u0003\u0006\u0003\u0000g\u000b\u0001\u0000"+
		"\u0000\u0000hi\u0005\f\u0000\u0000im\u0003\u0010\b\u0000jl\u0005%\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000nr\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005\u000e\u0000"+
		"\u0000tx\u0003\u0000\u0000\u0000uw\u0005%\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\u000f\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{~\u0003\u0012\t\u0000|}\u0007\u0001\u0000\u0000}\u007f\u0003\u0010\b"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u008e\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001f\u0000\u0000\u0081"+
		"\u008e\u0003\u0010\b\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084"+
		"\u0005\n\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0086\u0003"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088\u0003"+
		"\u0010\b\u0000\u0088\u008e\u0001\u0000\u0000\u0000\u0089\u008a\u0005 "+
		"\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c\u0005!\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d{\u0001\u0000\u0000\u0000"+
		"\u008d\u0080\u0001\u0000\u0000\u0000\u008d\u0082\u0001\u0000\u0000\u0000"+
		"\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0003\u0000\u0000\u0000\u0090\u0091\u0007\u0002\u0000\u0000"+
		"\u0091\u0092\u0003\u0000\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\u0012\u0000\u0000\u0094\u0095\u0005\u0013\u0000\u0000"+
		"\u0095\u009a\u0003\u0016\u000b\u0000\u0096\u0097\u0005\u0012\u0000\u0000"+
		"\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u009a\u0003\u0016\u000b\u0000"+
		"\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u000b\uffff\uffff"+
		"\u0000\u009c\u00a6\u0005\u0011\u0000\u0000\u009d\u00a6\u0005\u0017\u0000"+
		"\u0000\u009e\u00a6\u0005\u0018\u0000\u0000\u009f\u00a6\u0005\u0016\u0000"+
		"\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000"+
		"\u00a2\u00a3\u0005!\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0005\b\u0000\u0000\u00a5\u009b\u0001\u0000\u0000\u0000\u00a5\u009d"+
		"\u0001\u0000\u0000\u0000\u00a5\u009e\u0001\u0000\u0000\u0000\u00a5\u009f"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00b7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\n\u0004\u0000\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00b6\u0003"+
		"\u0016\u000b\u0005\u00aa\u00ab\n\u0003\u0000\u0000\u00ab\u00ac\u0005\u0014"+
		"\u0000\u0000\u00ac\u00b6\u0003\u0016\u000b\u0004\u00ad\u00ae\n\u0001\u0000"+
		"\u0000\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b6\u0003\u0016\u000b\u0002"+
		"\u00b0\u00b1\n\u0002\u0000\u0000\u00b1\u00b2\u0005\"\u0000\u0000\u00b2"+
		"\u00b3\u0003\u0018\f\u0000\u00b3\u00b4\u0005#\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u0017"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0006\f\uffff\uffff\u0000\u00bb\u00d9\u0003\u0016\u000b\u0000\u00bc\u00bd"+
		"\u0003\u0016\u000b\u0000\u00bd\u00be\u0005\u0019\u0000\u0000\u00be\u00bf"+
		"\u0003\u0016\u000b\u0000\u00bf\u00d9\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0003\u0016\u000b\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u00c3"+
		"\u0003\u0016\u000b\u0000\u00c3\u00d9\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0016\u000b\u0000\u00c5\u00c6\u0005\u001b\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0016\u000b\u0000\u00c7\u00d9\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0003\u0016\u000b\u0000\u00c9\u00ca\u0005\u001c\u0000\u0000\u00ca\u00cb"+
		"\u0003\u0016\u000b\u0000\u00cb\u00d9\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005 \u0000\u0000\u00cd\u00ce\u0003\u0018\f\u0000\u00ce\u00cf\u0005"+
		"!\u0000\u0000\u00cf\u00d9\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0016"+
		"\u000b\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00d3\u0005\t\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4\u00d5\u0005\t\u0000\u0000"+
		"\u00d5\u00d9\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001f\u0000\u0000"+
		"\u00d7\u00d9\u0003\u0018\f\u0001\u00d8\u00ba\u0001\u0000\u0000\u0000\u00d8"+
		"\u00bc\u0001\u0000\u0000\u0000\u00d8\u00c0\u0001\u0000\u0000\u0000\u00d8"+
		"\u00c4\u0001\u0000\u0000\u0000\u00d8\u00c8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00e2\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\n\u0003\u0000\u0000\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc\u00e1"+
		"\u0003\u0018\f\u0004\u00dd\u00de\n\u0002\u0000\u0000\u00de\u00df\u0005"+
		"\u001e\u0000\u0000\u00df\u00e1\u0003\u0018\f\u0003\u00e0\u00da\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u0015\u001d%,3:JLT^mqx~\u008d\u0099\u00a5\u00b5\u00b7\u00d8"+
		"\u00e0\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}