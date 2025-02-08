// Generated from XPath.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, FILENAME=3, SLASH=4, DOUBLE_SLASH=5, TAGNAME=6, ATTNAME=7, 
		STAR=8, DOT=9, EQUALS=10, EQ=11, DOUBLE_EQUALS=12, IS=13, AND=14, OR=15, 
		NOT=16, LPAREN=17, RPAREN=18, LBRACKET=19, RBRACKET=20, COMMA=21, WS=22;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'/'", "'//'", null, null, "'*'", "'.'", null, 
			null, null, null, null, null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STRING", "FILENAME", "SLASH", "DOUBLE_SLASH", "TAGNAME", 
			"ATTNAME", "STAR", "DOT", "EQUALS", "EQ", "DOUBLE_EQUALS", "IS", "AND", 
			"OR", "NOT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COMMA", "WS"
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
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(XPathParser.FILENAME, 0); }
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode DOUBLE_SLASH() { return getToken(XPathParser.DOUBLE_SLASH, 0); }
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(6);
				match(FILENAME);
				setState(7);
				match(SLASH);
				setState(8);
				rp(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(9);
				match(FILENAME);
				setState(10);
				match(DOUBLE_SLASH);
				setState(11);
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
		public TerminalNode TAGNAME() { return getToken(XPathParser.TAGNAME, 0); }
		public TerminalNode STAR() { return getToken(XPathParser.STAR, 0); }
		public TerminalNode DOT() { return getToken(XPathParser.DOT, 0); }
		public TerminalNode ATTNAME() { return getToken(XPathParser.ATTNAME, 0); }
		public TerminalNode LPAREN() { return getToken(XPathParser.LPAREN, 0); }
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XPathParser.RPAREN, 0); }
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public TerminalNode DOUBLE_SLASH() { return getToken(XPathParser.DOUBLE_SLASH, 0); }
		public TerminalNode COMMA() { return getToken(XPathParser.COMMA, 0); }
		public TerminalNode LBRACKET() { return getToken(XPathParser.LBRACKET, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XPathParser.RBRACKET, 0); }
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitRp(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				setState(15);
				match(TAGNAME);
				}
				break;
			case STAR:
				{
				setState(16);
				match(STAR);
				}
				break;
			case DOT:
				{
				setState(17);
				match(DOT);
				}
				break;
			case ATTNAME:
				{
				setState(18);
				match(ATTNAME);
				}
				break;
			case LPAREN:
				{
				setState(19);
				match(LPAREN);
				setState(20);
				rp(0);
				setState(21);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(25);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(26);
						match(SLASH);
						setState(27);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(DOUBLE_SLASH);
						setState(30);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(31);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(32);
						match(COMMA);
						setState(33);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(34);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(35);
						match(LBRACKET);
						setState(36);
						f(0);
						setState(37);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode EQUALS() { return getToken(XPathParser.EQUALS, 0); }
		public TerminalNode EQ() { return getToken(XPathParser.EQ, 0); }
		public TerminalNode DOUBLE_EQUALS() { return getToken(XPathParser.DOUBLE_EQUALS, 0); }
		public TerminalNode IS() { return getToken(XPathParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(XPathParser.LPAREN, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(XPathParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(XPathParser.NOT, 0); }
		public TerminalNode AND() { return getToken(XPathParser.AND, 0); }
		public TerminalNode OR() { return getToken(XPathParser.OR, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XPathListener ) ((XPathListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XPathVisitor ) return ((XPathVisitor<? extends T>)visitor).visitF(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45);
				rp(0);
				}
				break;
			case 2:
				{
				setState(46);
				rp(0);
				setState(47);
				match(EQUALS);
				setState(48);
				rp(0);
				}
				break;
			case 3:
				{
				setState(50);
				rp(0);
				setState(51);
				match(EQ);
				setState(52);
				rp(0);
				}
				break;
			case 4:
				{
				setState(54);
				rp(0);
				setState(55);
				match(DOUBLE_EQUALS);
				setState(56);
				rp(0);
				}
				break;
			case 5:
				{
				setState(58);
				rp(0);
				setState(59);
				match(IS);
				setState(60);
				rp(0);
				}
				break;
			case 6:
				{
				setState(62);
				match(LPAREN);
				setState(63);
				f(0);
				setState(64);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(66);
				match(NOT);
				setState(67);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(AND);
						setState(72);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(OR);
						setState(75);
						f(3);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
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
		"\u0004\u0001\u0016R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b"+
		"\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002M\b"+
		"\u0002\n\u0002\f\u0002P\t\u0002\u0001\u0002\u0000\u0002\u0002\u0004\u0003"+
		"\u0000\u0002\u0004\u0000\u0000_\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u0017\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0005\u0003\u0000\u0000\u0007\b\u0005\u0004\u0000\u0000\b\r\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0003\u0000\u0000\n\u000b\u0005\u0005\u0000\u0000"+
		"\u000b\r\u0003\u0002\u0001\u0000\f\u0006\u0001\u0000\u0000\u0000\f\t\u0001"+
		"\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0006\u0001"+
		"\uffff\uffff\u0000\u000f\u0018\u0005\u0006\u0000\u0000\u0010\u0018\u0005"+
		"\b\u0000\u0000\u0011\u0018\u0005\t\u0000\u0000\u0012\u0018\u0005\u0007"+
		"\u0000\u0000\u0013\u0014\u0005\u0011\u0000\u0000\u0014\u0015\u0003\u0002"+
		"\u0001\u0000\u0015\u0016\u0005\u0012\u0000\u0000\u0016\u0018\u0001\u0000"+
		"\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000"+
		"\u0000\u0000\u0017\u0011\u0001\u0000\u0000\u0000\u0017\u0012\u0001\u0000"+
		"\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0018)\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\n\u0004\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000"+
		"\u001b(\u0003\u0002\u0001\u0005\u001c\u001d\n\u0003\u0000\u0000\u001d"+
		"\u001e\u0005\u0005\u0000\u0000\u001e(\u0003\u0002\u0001\u0004\u001f \n"+
		"\u0001\u0000\u0000 !\u0005\u0015\u0000\u0000!(\u0003\u0002\u0001\u0002"+
		"\"#\n\u0002\u0000\u0000#$\u0005\u0013\u0000\u0000$%\u0003\u0004\u0002"+
		"\u0000%&\u0005\u0014\u0000\u0000&(\u0001\u0000\u0000\u0000\'\u0019\u0001"+
		"\u0000\u0000\u0000\'\u001c\u0001\u0000\u0000\u0000\'\u001f\u0001\u0000"+
		"\u0000\u0000\'\"\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0006\u0002\uffff\uffff\u0000"+
		"-E\u0003\u0002\u0001\u0000./\u0003\u0002\u0001\u0000/0\u0005\n\u0000\u0000"+
		"01\u0003\u0002\u0001\u00001E\u0001\u0000\u0000\u000023\u0003\u0002\u0001"+
		"\u000034\u0005\u000b\u0000\u000045\u0003\u0002\u0001\u00005E\u0001\u0000"+
		"\u0000\u000067\u0003\u0002\u0001\u000078\u0005\f\u0000\u000089\u0003\u0002"+
		"\u0001\u00009E\u0001\u0000\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005"+
		"\r\u0000\u0000<=\u0003\u0002\u0001\u0000=E\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0011\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0012\u0000\u0000"+
		"AE\u0001\u0000\u0000\u0000BC\u0005\u0010\u0000\u0000CE\u0003\u0004\u0002"+
		"\u0001D,\u0001\u0000\u0000\u0000D.\u0001\u0000\u0000\u0000D2\u0001\u0000"+
		"\u0000\u0000D6\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000D>\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EN\u0001\u0000\u0000\u0000"+
		"FG\n\u0003\u0000\u0000GH\u0005\u000e\u0000\u0000HM\u0003\u0004\u0002\u0004"+
		"IJ\n\u0002\u0000\u0000JK\u0005\u000f\u0000\u0000KM\u0003\u0004\u0002\u0003"+
		"LF\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0005\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000\u0007\f\u0017\')DLN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}