package gen;// Generated from /Users/darth_sky/Teaching/CSE232B-Database System Implementation/JavaXQuery/src/main/antlr4/XQuery.g4 by ANTLR 4.13.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		ESCAPE=25, DOC=26, LPR=27, RPR=28, NAME=29, TXT=30, WS=31, INT=32, FILENAME=33, 
		SLASH=34, DOUBLE_SLASH=35, TAGNAME=36, ATTNAME=37, STAR=38, DOT=39, EQUALS=40, 
		EQ=41, DOUBLE_EQUALS=42, IS=43, AND=44, OR=45, NOT=46, LPAREN=47, RPAREN=48, 
		LBRACKET=49, RBRACKET=50, COMMA=51;
	public static final int
		RULE_xq = 0, RULE_var = 1, RULE_forClause = 2, RULE_letClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_ap = 7, RULE_rp = 8, RULE_f = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "var", "forClause", "letClause", "whereClause", "returnClause", 
			"cond", "ap", "rp", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'<'", "'>'", "'{'", "'}'", "'$'", "'for'", "'in'", "'let'", 
			"':='", "'where'", "'return'", "'='", "'eq'", "'=='", "'is'", "'empty'", 
			"'some'", "'satisfies'", "'and'", "'or'", "'not'", "'\"'", null, null, 
			"'document'", null, null, null, "'text()'", null, null, null, "'/'", 
			"'//'", null, null, "'*'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "ESCAPE", "DOC", "LPR", "RPR", "NAME", "TXT", "WS", "INT", 
			"FILENAME", "SLASH", "DOUBLE_SLASH", "TAGNAME", "ATTNAME", "STAR", "DOT", 
			"EQUALS", "EQ", "DOUBLE_EQUALS", "IS", "AND", "OR", "NOT", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "COMMA"
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(XQueryParser.STRING, 0); }
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode DOUBLE_SLASH() { return getToken(XQueryParser.DOUBLE_SLASH, 0); }
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(21);
				var();
				}
				break;
			case STRING:
				{
				setState(22);
				match(STRING);
				}
				break;
			case FILENAME:
				{
				setState(23);
				ap();
				}
				break;
			case LPR:
				{
				setState(24);
				match(LPR);
				setState(25);
				xq(0);
				setState(26);
				match(RPR);
				}
				break;
			case T__1:
				{
				setState(28);
				match(T__1);
				setState(29);
				match(NAME);
				setState(30);
				match(T__2);
				setState(31);
				match(T__3);
				setState(32);
				xq(0);
				setState(33);
				match(T__4);
				setState(34);
				match(T__1);
				setState(35);
				match(SLASH);
				setState(36);
				match(NAME);
				setState(37);
				match(T__2);
				}
				break;
			case T__6:
				{
				setState(39);
				forClause();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(40);
					letClause();
					}
				}

				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(43);
					whereClause();
					}
				}

				setState(46);
				returnClause();
				}
				break;
			case T__8:
				{
				setState(48);
				letClause();
				setState(49);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(53);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(54);
						match(T__0);
						setState(55);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						match(SLASH);
						setState(58);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						match(DOUBLE_SLASH);
						setState(61);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(NAME);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(WS);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(76);
				match(WS);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					var();
					setState(83);
					match(T__7);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(84);
						match(WS);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(90);
					xq(0);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(91);
						match(WS);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(97);
					match(T__0);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(98);
						match(WS);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(109);
			var();
			setState(110);
			match(T__7);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(111);
				match(WS);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			xq(0);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__8);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(120);
				match(WS);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					var();
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(127);
						match(WS);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(133);
					match(T__9);
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(134);
						match(WS);
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(140);
					xq(0);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(141);
						match(WS);
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(147);
					match(T__0);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(148);
						match(WS);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(159);
			var();
			setState(160);
			match(T__9);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(161);
				match(WS);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			xq(0);
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
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__10);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(170);
				match(WS);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			cond(0);
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
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__11);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(179);
				match(WS);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			xq(0);
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
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(XQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(XQueryParser.WS, i);
		}
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(188);
				xq(0);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(189);
					match(WS);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(T__12);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(196);
					match(WS);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				xq(0);
				}
				break;
			case 2:
				{
				setState(204);
				xq(0);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(205);
					match(WS);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__13);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(212);
					match(WS);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				xq(0);
				}
				break;
			case 3:
				{
				setState(220);
				xq(0);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(221);
					match(WS);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__14);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(228);
					match(WS);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				xq(0);
				}
				break;
			case 4:
				{
				setState(236);
				xq(0);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(237);
					match(WS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__15);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(244);
					match(WS);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				xq(0);
				}
				break;
			case 5:
				{
				setState(252);
				match(T__16);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(253);
					match(WS);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(LPR);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(260);
					match(WS);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				xq(0);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(267);
					match(WS);
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(RPR);
				}
				break;
			case 6:
				{
				setState(275);
				match(T__17);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(276);
					match(WS);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				var();
				setState(283);
				match(T__7);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(284);
					match(WS);
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				xq(0);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(291);
						match(WS);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(297);
					match(T__0);
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(298);
						match(WS);
						}
						}
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(304);
					var();
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(305);
						match(WS);
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(T__7);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(312);
						match(WS);
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(318);
					xq(0);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(T__18);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(326);
					match(WS);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				cond(5);
				}
				break;
			case 7:
				{
				setState(334);
				match(LPR);
				setState(335);
				cond(0);
				setState(336);
				match(RPR);
				}
				break;
			case 8:
				{
				setState(338);
				match(T__21);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(339);
					match(WS);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(348);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(349);
							match(WS);
							}
							}
							setState(354);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(355);
						match(T__19);
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(356);
							match(WS);
							}
							}
							setState(361);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(362);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(363);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(367);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(364);
							match(WS);
							}
							}
							setState(369);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(370);
						match(T__20);
						setState(374);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(371);
							match(WS);
							}
							}
							setState(376);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(377);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ap);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(383);
				match(FILENAME);
				setState(384);
				match(SLASH);
				setState(385);
				rp(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(386);
				match(FILENAME);
				setState(387);
				match(DOUBLE_SLASH);
				setState(388);
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
		public TerminalNode TXT() { return getToken(XQueryParser.TXT, 0); }
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
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitRp(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(392);
				match(STRING);
				}
				break;
			case STAR:
				{
				setState(393);
				match(STAR);
				}
				break;
			case DOT:
				{
				setState(394);
				match(DOT);
				}
				break;
			case ATTNAME:
				{
				setState(395);
				match(ATTNAME);
				}
				break;
			case LPAREN:
				{
				setState(396);
				match(LPAREN);
				setState(397);
				rp(0);
				setState(398);
				match(RPAREN);
				}
				break;
			case TXT:
				{
				setState(400);
				match(TXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(403);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(404);
						match(SLASH);
						setState(405);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(406);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(407);
						match(DOUBLE_SLASH);
						setState(408);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(409);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(410);
						match(COMMA);
						setState(411);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						match(LBRACKET);
						setState(414);
						f(0);
						setState(415);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener) ((XQueryListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor) return ((XQueryVisitor<? extends T>)visitor).visitF(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(423);
				rp(0);
				}
				break;
			case 2:
				{
				setState(424);
				rp(0);
				setState(425);
				match(EQUALS);
				setState(426);
				rp(0);
				}
				break;
			case 3:
				{
				setState(428);
				rp(0);
				setState(429);
				match(EQ);
				setState(430);
				rp(0);
				}
				break;
			case 4:
				{
				setState(432);
				rp(0);
				setState(433);
				match(DOUBLE_EQUALS);
				setState(434);
				rp(0);
				}
				break;
			case 5:
				{
				setState(436);
				rp(0);
				setState(437);
				match(IS);
				setState(438);
				rp(0);
				}
				break;
			case 6:
				{
				setState(440);
				match(LPAREN);
				setState(441);
				f(0);
				setState(442);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(444);
				rp(0);
				setState(445);
				match(EQUALS);
				setState(446);
				match(T__22);
				setState(447);
				match(STRING);
				setState(448);
				match(T__22);
				}
				break;
			case 8:
				{
				setState(450);
				match(NOT);
				setState(451);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(454);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(455);
						match(AND);
						setState(456);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(457);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(458);
						match(OR);
						setState(459);
						f(3);
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 8:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 9:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u01d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"*\b\u0000\u0001\u0000\u0003\u0000-\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u00004\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002"+
		"\f\u0002Y\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002]\b\u0002\n\u0002"+
		"\f\u0002`\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002d\b\u0002\n\u0002"+
		"\f\u0002g\t\u0002\u0005\u0002i\b\u0002\n\u0002\f\u0002l\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002q\b\u0002\n\u0002\f\u0002t\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003z\b"+
		"\u0003\n\u0003\f\u0003}\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0081"+
		"\b\u0003\n\u0003\f\u0003\u0084\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0088\b\u0003\n\u0003\f\u0003\u008b\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u008f\b\u0003\n\u0003\f\u0003\u0092\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0096\b\u0003\n\u0003\f\u0003\u0099\t\u0003\u0005\u0003\u009b"+
		"\b\u0003\n\u0003\f\u0003\u009e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00a3\b\u0003\n\u0003\f\u0003\u00a6\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004\f\u0004"+
		"\u00af\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00b5\b\u0005\n\u0005\f\u0005\u00b8\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bf\b\u0006\n\u0006\f\u0006"+
		"\u00c2\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c6\b\u0006\n\u0006"+
		"\f\u0006\u00c9\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00cf\b\u0006\n\u0006\f\u0006\u00d2\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00d6\b\u0006\n\u0006\f\u0006\u00d9\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00df\b\u0006\n\u0006"+
		"\f\u0006\u00e2\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e6\b\u0006"+
		"\n\u0006\f\u0006\u00e9\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00ef\b\u0006\n\u0006\f\u0006\u00f2\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00f6\b\u0006\n\u0006\f\u0006\u00f9\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ff\b\u0006\n"+
		"\u0006\f\u0006\u0102\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0106"+
		"\b\u0006\n\u0006\f\u0006\u0109\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u010d\b\u0006\n\u0006\f\u0006\u0110\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0116\b\u0006\n\u0006\f\u0006\u0119\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u011e\b\u0006\n\u0006"+
		"\f\u0006\u0121\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0125\b\u0006"+
		"\n\u0006\f\u0006\u0128\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u012c"+
		"\b\u0006\n\u0006\f\u0006\u012f\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0133\b\u0006\n\u0006\f\u0006\u0136\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u013a\b\u0006\n\u0006\f\u0006\u013d\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0141\b\u0006\n\u0006\f\u0006\u0144\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0148\b\u0006\n\u0006\f\u0006\u014b\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0155\b\u0006\n\u0006\f\u0006\u0158\t\u0006\u0001"+
		"\u0006\u0003\u0006\u015b\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u015f"+
		"\b\u0006\n\u0006\f\u0006\u0162\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0166\b\u0006\n\u0006\f\u0006\u0169\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u016e\b\u0006\n\u0006\f\u0006\u0171\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0175\b\u0006\n\u0006\f\u0006\u0178\t\u0006\u0001"+
		"\u0006\u0005\u0006\u017b\b\u0006\n\u0006\f\u0006\u017e\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0186\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0192\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u01a2\b\b\n\b\f\b\u01a5\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u01c5\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u01cd\b\t\n\t\f\t\u01d0\t\t\u0001\t\u0000\u0004\u0000\f\u0010\u0012"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u0216\u0000"+
		"3\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000"+
		"\u0000\u0000\n\u00b2\u0001\u0000\u0000\u0000\f\u015a\u0001\u0000\u0000"+
		"\u0000\u000e\u0185\u0001\u0000\u0000\u0000\u0010\u0191\u0001\u0000\u0000"+
		"\u0000\u0012\u01c4\u0001\u0000\u0000\u0000\u0014\u0015\u0006\u0000\uffff"+
		"\uffff\u0000\u00154\u0003\u0002\u0001\u0000\u00164\u0005\u0018\u0000\u0000"+
		"\u00174\u0003\u000e\u0007\u0000\u0018\u0019\u0005\u001b\u0000\u0000\u0019"+
		"\u001a\u0003\u0000\u0000\u0000\u001a\u001b\u0005\u001c\u0000\u0000\u001b"+
		"4\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e"+
		"\u0005\u001d\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f \u0005"+
		"\u0004\u0000\u0000 !\u0003\u0000\u0000\u0000!\"\u0005\u0005\u0000\u0000"+
		"\"#\u0005\u0002\u0000\u0000#$\u0005\"\u0000\u0000$%\u0005\u001d\u0000"+
		"\u0000%&\u0005\u0003\u0000\u0000&4\u0001\u0000\u0000\u0000\')\u0003\u0004"+
		"\u0002\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+-\u0003\b\u0004\u0000,+\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		"./\u0003\n\u0005\u0000/4\u0001\u0000\u0000\u000001\u0003\u0006\u0003\u0000"+
		"12\u0003\u0000\u0000\u000124\u0001\u0000\u0000\u00003\u0014\u0001\u0000"+
		"\u0000\u00003\u0016\u0001\u0000\u0000\u00003\u0017\u0001\u0000\u0000\u0000"+
		"3\u0018\u0001\u0000\u0000\u00003\u001c\u0001\u0000\u0000\u00003\'\u0001"+
		"\u0000\u0000\u000030\u0001\u0000\u0000\u00004@\u0001\u0000\u0000\u0000"+
		"56\n\u0006\u0000\u000067\u0005\u0001\u0000\u00007?\u0003\u0000\u0000\u0007"+
		"89\n\u0005\u0000\u00009:\u0005\"\u0000\u0000:?\u0003\u0010\b\u0000;<\n"+
		"\u0004\u0000\u0000<=\u0005#\u0000\u0000=?\u0003\u0010\b\u0000>5\u0001"+
		"\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u0001\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0006\u0000\u0000DH\u0005\u001d\u0000\u0000EG\u0005\u001f\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KO\u0005\u0007\u0000\u0000LN\u0005\u001f\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000Pj\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RS\u0003\u0002\u0001\u0000SW\u0005\b\u0000\u0000TV\u0005\u001f"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Z^\u0003\u0000\u0000\u0000[]\u0005\u001f\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ae\u0005\u0001\u0000\u0000bd\u0005\u001f\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hR\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000mn\u0003\u0002\u0001\u0000nr\u0005\b\u0000\u0000"+
		"oq\u0005\u001f\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003\u0000\u0000\u0000v\u0005"+
		"\u0001\u0000\u0000\u0000w{\u0005\t\u0000\u0000xz\u0005\u001f\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u009c\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0082\u0003\u0002\u0001\u0000\u007f\u0081\u0005\u001f"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0089\u0005\n\u0000\u0000\u0086\u0088\u0005\u001f\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u0090\u0003\u0000\u0000\u0000\u008d\u008f\u0005\u001f\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0097\u0005\u0001\u0000\u0000\u0094\u0096\u0005\u001f\u0000"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a~\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0003\u0002\u0001\u0000\u00a0\u00a4\u0005\n\u0000\u0000\u00a1"+
		"\u00a3\u0005\u001f\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u0000\u0000\u0000\u00a8"+
		"\u0007\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005\u000b\u0000\u0000\u00aa"+
		"\u00ac\u0005\u001f\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\f\u0006\u0000\u00b1\t"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b6\u0005\f\u0000\u0000\u00b3\u00b5\u0005"+
		"\u001f\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\u0000\u0000\u0000\u00ba\u000b\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0006\u0006\uffff\uffff\u0000\u00bc\u00c0"+
		"\u0003\u0000\u0000\u0000\u00bd\u00bf\u0005\u001f\u0000\u0000\u00be\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c7"+
		"\u0005\r\u0000\u0000\u00c4\u00c6\u0005\u001f\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003"+
		"\u0000\u0000\u0000\u00cb\u015b\u0001\u0000\u0000\u0000\u00cc\u00d0\u0003"+
		"\u0000\u0000\u0000\u00cd\u00cf\u0005\u001f\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d7\u0005"+
		"\u000e\u0000\u0000\u00d4\u00d6\u0005\u001f\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		"\u0000\u0000\u0000\u00db\u015b\u0001\u0000\u0000\u0000\u00dc\u00e0\u0003"+
		"\u0000\u0000\u0000\u00dd\u00df\u0005\u001f\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e7\u0005"+
		"\u000f\u0000\u0000\u00e4\u00e6\u0005\u001f\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"\u0000\u0000\u0000\u00eb\u015b\u0001\u0000\u0000\u0000\u00ec\u00f0\u0003"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0005\u001f\u0000\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f7\u0005"+
		"\u0010\u0000\u0000\u00f4\u00f6\u0005\u001f\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003"+
		"\u0000\u0000\u0000\u00fb\u015b\u0001\u0000\u0000\u0000\u00fc\u0100\u0005"+
		"\u0011\u0000\u0000\u00fd\u00ff\u0005\u001f\u0000\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0107\u0005"+
		"\u001b\u0000\u0000\u0104\u0106\u0005\u001f\u0000\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010e\u0003"+
		"\u0000\u0000\u0000\u010b\u010d\u0005\u001f\u0000\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u001c\u0000\u0000\u0112\u015b\u0001\u0000\u0000\u0000\u0113\u0117\u0005"+
		"\u0012\u0000\u0000\u0114\u0116\u0005\u001f\u0000\u0000\u0115\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0003"+
		"\u0002\u0001\u0000\u011b\u011f\u0005\b\u0000\u0000\u011c\u011e\u0005\u001f"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0142\u0003\u0000\u0000\u0000\u0123\u0125\u0005\u001f"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012d\u0005\u0001\u0000\u0000\u012a\u012c\u0005\u001f"+
		"\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u0130\u0134\u0003\u0002\u0001\u0000\u0131\u0133\u0005\u001f"+
		"\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u013b\u0005\b\u0000\u0000\u0138\u013a\u0005\u001f\u0000"+
		"\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0003\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000"+
		"\u0000\u0140\u0126\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0149\u0005\u0013\u0000\u0000\u0146\u0148\u0005\u001f\u0000"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0003\f\u0006\u0005\u014d\u015b\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\u001b\u0000\u0000\u014f\u0150\u0003\f\u0006\u0000\u0150"+
		"\u0151\u0005\u001c\u0000\u0000\u0151\u015b\u0001\u0000\u0000\u0000\u0152"+
		"\u0156\u0005\u0016\u0000\u0000\u0153\u0155\u0005\u001f\u0000\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0003\f\u0006\u0001\u015a\u00bb\u0001\u0000\u0000\u0000\u015a\u00cc"+
		"\u0001\u0000\u0000\u0000\u015a\u00dc\u0001\u0000\u0000\u0000\u015a\u00ec"+
		"\u0001\u0000\u0000\u0000\u015a\u00fc\u0001\u0000\u0000\u0000\u015a\u0113"+
		"\u0001\u0000\u0000\u0000\u015a\u014e\u0001\u0000\u0000\u0000\u015a\u0152"+
		"\u0001\u0000\u0000\u0000\u015b\u017c\u0001\u0000\u0000\u0000\u015c\u0160"+
		"\n\u0003\u0000\u0000\u015d\u015f\u0005\u001f\u0000\u0000\u015e\u015d\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0167\u0005"+
		"\u0014\u0000\u0000\u0164\u0166\u0005\u001f\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u017b\u0003"+
		"\f\u0006\u0004\u016b\u016f\n\u0002\u0000\u0000\u016c\u016e\u0005\u001f"+
		"\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0176\u0005\u0015\u0000\u0000\u0173\u0175\u0005\u001f"+
		"\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0179\u017b\u0003\f\u0006\u0003\u017a\u015c\u0001\u0000\u0000"+
		"\u0000\u017a\u016b\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\r\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005!\u0000\u0000\u0180\u0181\u0005\"\u0000\u0000\u0181"+
		"\u0186\u0003\u0010\b\u0000\u0182\u0183\u0005!\u0000\u0000\u0183\u0184"+
		"\u0005#\u0000\u0000\u0184\u0186\u0003\u0010\b\u0000\u0185\u017f\u0001"+
		"\u0000\u0000\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u000f\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0006\b\uffff\uffff\u0000\u0188\u0192\u0005"+
		"\u0018\u0000\u0000\u0189\u0192\u0005&\u0000\u0000\u018a\u0192\u0005\'"+
		"\u0000\u0000\u018b\u0192\u0005%\u0000\u0000\u018c\u018d\u0005/\u0000\u0000"+
		"\u018d\u018e\u0003\u0010\b\u0000\u018e\u018f\u00050\u0000\u0000\u018f"+
		"\u0192\u0001\u0000\u0000\u0000\u0190\u0192\u0005\u001e\u0000\u0000\u0191"+
		"\u0187\u0001\u0000\u0000\u0000\u0191\u0189\u0001\u0000\u0000\u0000\u0191"+
		"\u018a\u0001\u0000\u0000\u0000\u0191\u018b\u0001\u0000\u0000\u0000\u0191"+
		"\u018c\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u01a3\u0001\u0000\u0000\u0000\u0193\u0194\n\u0004\u0000\u0000\u0194\u0195"+
		"\u0005\"\u0000\u0000\u0195\u01a2\u0003\u0010\b\u0005\u0196\u0197\n\u0003"+
		"\u0000\u0000\u0197\u0198\u0005#\u0000\u0000\u0198\u01a2\u0003\u0010\b"+
		"\u0004\u0199\u019a\n\u0001\u0000\u0000\u019a\u019b\u00053\u0000\u0000"+
		"\u019b\u01a2\u0003\u0010\b\u0002\u019c\u019d\n\u0002\u0000\u0000\u019d"+
		"\u019e\u00051\u0000\u0000\u019e\u019f\u0003\u0012\t\u0000\u019f\u01a0"+
		"\u00052\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u0193\u0001"+
		"\u0000\u0000\u0000\u01a1\u0196\u0001\u0000\u0000\u0000\u01a1\u0199\u0001"+
		"\u0000\u0000\u0000\u01a1\u019c\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u0011\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0006\t\uffff\uffff\u0000\u01a7\u01c5\u0003"+
		"\u0010\b\u0000\u01a8\u01a9\u0003\u0010\b\u0000\u01a9\u01aa\u0005(\u0000"+
		"\u0000\u01aa\u01ab\u0003\u0010\b\u0000\u01ab\u01c5\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0003\u0010\b\u0000\u01ad\u01ae\u0005)\u0000\u0000\u01ae"+
		"\u01af\u0003\u0010\b\u0000\u01af\u01c5\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0003\u0010\b\u0000\u01b1\u01b2\u0005*\u0000\u0000\u01b2\u01b3\u0003"+
		"\u0010\b\u0000\u01b3\u01c5\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003\u0010"+
		"\b\u0000\u01b5\u01b6\u0005+\u0000\u0000\u01b6\u01b7\u0003\u0010\b\u0000"+
		"\u01b7\u01c5\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005/\u0000\u0000\u01b9"+
		"\u01ba\u0003\u0012\t\u0000\u01ba\u01bb\u00050\u0000\u0000\u01bb\u01c5"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003\u0010\b\u0000\u01bd\u01be\u0005"+
		"(\u0000\u0000\u01be\u01bf\u0005\u0017\u0000\u0000\u01bf\u01c0\u0005\u0018"+
		"\u0000\u0000\u01c0\u01c1\u0005\u0017\u0000\u0000\u01c1\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0005.\u0000\u0000\u01c3\u01c5\u0003\u0012\t"+
		"\u0001\u01c4\u01a6\u0001\u0000\u0000\u0000\u01c4\u01a8\u0001\u0000\u0000"+
		"\u0000\u01c4\u01ac\u0001\u0000\u0000\u0000\u01c4\u01b0\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b4\u0001\u0000\u0000\u0000\u01c4\u01b8\u0001\u0000\u0000"+
		"\u0000\u01c4\u01bc\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01ce\u0001\u0000\u0000\u0000\u01c6\u01c7\n\u0003\u0000\u0000"+
		"\u01c7\u01c8\u0005,\u0000\u0000\u01c8\u01cd\u0003\u0012\t\u0004\u01c9"+
		"\u01ca\n\u0002\u0000\u0000\u01ca\u01cb\u0005-\u0000\u0000\u01cb\u01cd"+
		"\u0003\u0012\t\u0003\u01cc\u01c6\u0001\u0000\u0000\u0000\u01cc\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u0013\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u00007),3>@HOW^ejr{\u0082"+
		"\u0089\u0090\u0097\u009c\u00a4\u00ad\u00b6\u00c0\u00c7\u00d0\u00d7\u00e0"+
		"\u00e7\u00f0\u00f7\u0100\u0107\u010e\u0117\u011f\u0126\u012d\u0134\u013b"+
		"\u0142\u0149\u0156\u015a\u0160\u0167\u016f\u0176\u017a\u017c\u0185\u0191"+
		"\u01a1\u01a3\u01c4\u01cc\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}