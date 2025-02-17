package gen;// Generated from /Users/darth_sky/Teaching/CSE232B-Database System Implementation/JavaXQuery/src/main/antlr4/XQuery.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XQueryLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "STRING", "ESCAPE", 
			"DOC", "LPR", "RPR", "NAME", "TXT", "WS", "INT", "FILENAME", "SLASH", 
			"DOUBLE_SLASH", "TAGNAME", "ATTNAME", "STAR", "DOT", "EQUALS", "EQ", 
			"DOUBLE_EQUALS", "IS", "AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "COMMA"
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00003\u01a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00bf\b\u0017\n\u0017\f\u0017\u00c2\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u00c8\b\u0017\n\u0017\f\u0017\u00cb"+
		"\t\u0017\u0001\u0017\u0003\u0017\u00ce\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00e1\b\u001c\u000b\u001c"+
		"\f\u001c\u00e2\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u00ed\b\u001e\u000b\u001e"+
		"\f\u001e\u00ee\u0001\u001f\u0004\u001f\u00f2\b\u001f\u000b\u001f\f\u001f"+
		"\u00f3\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0005\'\u0114\b\'\n\'\f\'\u0117\t\'\u0001\'\u0001\'\u0005\'"+
		"\u011b\b\'\n\'\f\'\u011e\t\'\u0001(\u0005(\u0121\b(\n(\f(\u0124\t(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u012a\b(\n(\f(\u012d\t(\u0001)\u0005)\u0130"+
		"\b)\n)\f)\u0133\t)\u0001)\u0001)\u0001)\u0001)\u0005)\u0139\b)\n)\f)\u013c"+
		"\t)\u0001*\u0005*\u013f\b*\n*\f*\u0142\t*\u0001*\u0001*\u0001*\u0001*"+
		"\u0005*\u0148\b*\n*\f*\u014b\t*\u0001+\u0005+\u014e\b+\n+\f+\u0151\t+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0158\b+\n+\f+\u015b\t+\u0001"+
		",\u0005,\u015e\b,\n,\f,\u0161\t,\u0001,\u0001,\u0001,\u0001,\u0005,\u0167"+
		"\b,\n,\f,\u016a\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0171\b-"+
		"\n-\f-\u0174\t-\u0001.\u0001.\u0001/\u0001/\u00010\u00050\u017b\b0\n0"+
		"\f0\u017e\t0\u00010\u00010\u00050\u0182\b0\n0\f0\u0185\t0\u00011\u0005"+
		"1\u0188\b1\n1\f1\u018b\t1\u00011\u00011\u00051\u018f\b1\n1\f1\u0192\t"+
		"1\u00012\u00052\u0195\b2\n2\f2\u0198\t2\u00012\u00012\u00052\u019c\b2"+
		"\n2\f2\u019f\t2\u0000\u00003\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3\u0001\u0000\u0006"+
		"\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0003\u0000\"\"\'\'\\\\\u0005"+
		"\u0000--09AZ__az\u0003\u0000\t\n\r\r  \u0001\u000009\u01ba\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000"+
		"_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001"+
		"\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001g\u0001\u0000\u0000"+
		"\u0000\u0003i\u0001\u0000\u0000\u0000\u0005k\u0001\u0000\u0000\u0000\u0007"+
		"m\u0001\u0000\u0000\u0000\to\u0001\u0000\u0000\u0000\u000bq\u0001\u0000"+
		"\u0000\u0000\rs\u0001\u0000\u0000\u0000\u000fw\u0001\u0000\u0000\u0000"+
		"\u0011z\u0001\u0000\u0000\u0000\u0013~\u0001\u0000\u0000\u0000\u0015\u0081"+
		"\u0001\u0000\u0000\u0000\u0017\u0087\u0001\u0000\u0000\u0000\u0019\u008e"+
		"\u0001\u0000\u0000\u0000\u001b\u0090\u0001\u0000\u0000\u0000\u001d\u0093"+
		"\u0001\u0000\u0000\u0000\u001f\u0096\u0001\u0000\u0000\u0000!\u0099\u0001"+
		"\u0000\u0000\u0000#\u009f\u0001\u0000\u0000\u0000%\u00a4\u0001\u0000\u0000"+
		"\u0000\'\u00ae\u0001\u0000\u0000\u0000)\u00b2\u0001\u0000\u0000\u0000"+
		"+\u00b5\u0001\u0000\u0000\u0000-\u00b9\u0001\u0000\u0000\u0000/\u00cd"+
		"\u0001\u0000\u0000\u00001\u00cf\u0001\u0000\u0000\u00003\u00d2\u0001\u0000"+
		"\u0000\u00005\u00db\u0001\u0000\u0000\u00007\u00dd\u0001\u0000\u0000\u0000"+
		"9\u00e0\u0001\u0000\u0000\u0000;\u00e4\u0001\u0000\u0000\u0000=\u00ec"+
		"\u0001\u0000\u0000\u0000?\u00f1\u0001\u0000\u0000\u0000A\u00f5\u0001\u0000"+
		"\u0000\u0000C\u0104\u0001\u0000\u0000\u0000E\u0106\u0001\u0000\u0000\u0000"+
		"G\u0109\u0001\u0000\u0000\u0000I\u010b\u0001\u0000\u0000\u0000K\u010e"+
		"\u0001\u0000\u0000\u0000M\u0110\u0001\u0000\u0000\u0000O\u0115\u0001\u0000"+
		"\u0000\u0000Q\u0122\u0001\u0000\u0000\u0000S\u0131\u0001\u0000\u0000\u0000"+
		"U\u0140\u0001\u0000\u0000\u0000W\u014f\u0001\u0000\u0000\u0000Y\u015f"+
		"\u0001\u0000\u0000\u0000[\u016b\u0001\u0000\u0000\u0000]\u0175\u0001\u0000"+
		"\u0000\u0000_\u0177\u0001\u0000\u0000\u0000a\u017c\u0001\u0000\u0000\u0000"+
		"c\u0189\u0001\u0000\u0000\u0000e\u0196\u0001\u0000\u0000\u0000gh\u0005"+
		",\u0000\u0000h\u0002\u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000j\u0004"+
		"\u0001\u0000\u0000\u0000kl\u0005>\u0000\u0000l\u0006\u0001\u0000\u0000"+
		"\u0000mn\u0005{\u0000\u0000n\b\u0001\u0000\u0000\u0000op\u0005}\u0000"+
		"\u0000p\n\u0001\u0000\u0000\u0000qr\u0005$\u0000\u0000r\f\u0001\u0000"+
		"\u0000\u0000st\u0005f\u0000\u0000tu\u0005o\u0000\u0000uv\u0005r\u0000"+
		"\u0000v\u000e\u0001\u0000\u0000\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000"+
		"\u0000y\u0010\u0001\u0000\u0000\u0000z{\u0005l\u0000\u0000{|\u0005e\u0000"+
		"\u0000|}\u0005t\u0000\u0000}\u0012\u0001\u0000\u0000\u0000~\u007f\u0005"+
		":\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080\u0014\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005w\u0000\u0000\u0082\u0083\u0005h\u0000\u0000\u0083"+
		"\u0084\u0005e\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0086\u0005"+
		"e\u0000\u0000\u0086\u0016\u0001\u0000\u0000\u0000\u0087\u0088\u0005r\u0000"+
		"\u0000\u0088\u0089\u0005e\u0000\u0000\u0089\u008a\u0005t\u0000\u0000\u008a"+
		"\u008b\u0005u\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c\u008d\u0005"+
		"n\u0000\u0000\u008d\u0018\u0001\u0000\u0000\u0000\u008e\u008f\u0005=\u0000"+
		"\u0000\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0091\u0005e\u0000\u0000"+
		"\u0091\u0092\u0005q\u0000\u0000\u0092\u001c\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005=\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u0095\u001e\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098\u0005s\u0000"+
		"\u0000\u0098 \u0001\u0000\u0000\u0000\u0099\u009a\u0005e\u0000\u0000\u009a"+
		"\u009b\u0005m\u0000\u0000\u009b\u009c\u0005p\u0000\u0000\u009c\u009d\u0005"+
		"t\u0000\u0000\u009d\u009e\u0005y\u0000\u0000\u009e\"\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1"+
		"\u00a2\u0005m\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3$\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005a\u0000"+
		"\u0000\u00a6\u00a7\u0005t\u0000\u0000\u00a7\u00a8\u0005i\u0000\u0000\u00a8"+
		"\u00a9\u0005s\u0000\u0000\u00a9\u00aa\u0005f\u0000\u0000\u00aa\u00ab\u0005"+
		"i\u0000\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac\u00ad\u0005s\u0000"+
		"\u0000\u00ad&\u0001\u0000\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af"+
		"\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005d\u0000\u0000\u00b1(\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005r\u0000"+
		"\u0000\u00b4*\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6"+
		"\u00b7\u0005o\u0000\u0000\u00b7\u00b8\u0005t\u0000\u0000\u00b8,\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005\"\u0000\u0000\u00ba.\u0001\u0000"+
		"\u0000\u0000\u00bb\u00c0\u0005\"\u0000\u0000\u00bc\u00bf\u00031\u0018"+
		"\u0000\u00bd\u00bf\b\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00ce\u0005\"\u0000\u0000\u00c4\u00c9\u0005\'\u0000\u0000\u00c5"+
		"\u00c8\u00031\u0018\u0000\u00c6\u00c8\b\u0001\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\'\u0000\u0000\u00cd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00ce0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\\\u0000\u0000\u00d0\u00d1\u0007\u0002\u0000"+
		"\u0000\u00d12\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005d\u0000\u0000\u00d3"+
		"\u00d4\u0005o\u0000\u0000\u00d4\u00d5\u0005c\u0000\u0000\u00d5\u00d6\u0005"+
		"u\u0000\u0000\u00d6\u00d7\u0005m\u0000\u0000\u00d7\u00d8\u0005e\u0000"+
		"\u0000\u00d8\u00d9\u0005n\u0000\u0000\u00d9\u00da\u0005t\u0000\u0000\u00da"+
		"4\u0001\u0000\u0000\u0000\u00db\u00dc\u0005(\u0000\u0000\u00dc6\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005)\u0000\u0000\u00de8\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0007\u0003\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3:\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005t\u0000\u0000\u00e5\u00e6\u0005e\u0000\u0000\u00e6\u00e7"+
		"\u0005x\u0000\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005("+
		"\u0000\u0000\u00e9\u00ea\u0005)\u0000\u0000\u00ea<\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0007\u0004\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef>\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0007\u0005\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4@\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005d\u0000\u0000\u00f6\u00f7\u0005o\u0000\u0000\u00f7\u00f8\u0005c"+
		"\u0000\u0000\u00f8\u00f9\u0005(\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\"\u0000\u0000\u00fb\u00fc\u0003/\u0017\u0000"+
		"\u00fc\u00fd\u0005.\u0000\u0000\u00fd\u00fe\u0005x\u0000\u0000\u00fe\u00ff"+
		"\u0005m\u0000\u0000\u00ff\u0100\u0005l\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\"\u0000\u0000\u0102\u0103\u0005)\u0000"+
		"\u0000\u0103B\u0001\u0000\u0000\u0000\u0104\u0105\u0005/\u0000\u0000\u0105"+
		"D\u0001\u0000\u0000\u0000\u0106\u0107\u0005/\u0000\u0000\u0107\u0108\u0005"+
		"/\u0000\u0000\u0108F\u0001\u0000\u0000\u0000\u0109\u010a\u0003/\u0017"+
		"\u0000\u010aH\u0001\u0000\u0000\u0000\u010b\u010c\u0005@\u0000\u0000\u010c"+
		"\u010d\u0003/\u0017\u0000\u010dJ\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"*\u0000\u0000\u010fL\u0001\u0000\u0000\u0000\u0110\u0111\u0005.\u0000"+
		"\u0000\u0111N\u0001\u0000\u0000\u0000\u0112\u0114\u0003=\u001e\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u011c\u0005=\u0000\u0000\u0119\u011b\u0003=\u001e\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011dP\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0121\u0003=\u001e"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005e\u0000\u0000\u0126\u0127\u0005q\u0000\u0000\u0127"+
		"\u012b\u0001\u0000\u0000\u0000\u0128\u012a\u0003=\u001e\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012cR\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0130\u0003"+
		"=\u001e\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005=\u0000\u0000\u0135\u0136\u0005=\u0000\u0000"+
		"\u0136\u013a\u0001\u0000\u0000\u0000\u0137\u0139\u0003=\u001e\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"T\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0003=\u001e\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005i\u0000\u0000\u0144\u0145\u0005s\u0000"+
		"\u0000\u0145\u0149\u0001\u0000\u0000\u0000\u0146\u0148\u0003=\u001e\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014aV\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0003=\u001e\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151"+
		"\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005a\u0000\u0000\u0153\u0154\u0005"+
		"n\u0000\u0000\u0154\u0155\u0005d\u0000\u0000\u0155\u0159\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0003=\u001e\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015aX\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015e\u0003=\u001e\u0000\u015d\u015c"+
		"\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0005o\u0000\u0000\u0163\u0164\u0005r\u0000\u0000\u0164\u0168\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0003=\u001e\u0000\u0166\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169Z\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0005n\u0000\u0000\u016c"+
		"\u016d\u0005o\u0000\u0000\u016d\u016e\u0005t\u0000\u0000\u016e\u0172\u0001"+
		"\u0000\u0000\u0000\u016f\u0171\u0003=\u001e\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\\\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005(\u0000\u0000"+
		"\u0176^\u0001\u0000\u0000\u0000\u0177\u0178\u0005)\u0000\u0000\u0178`"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0003=\u001e\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0183\u0005"+
		"[\u0000\u0000\u0180\u0182\u0003=\u001e\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184b\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0188\u0003=\u001e\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c"+
		"\u0190\u0005]\u0000\u0000\u018d\u018f\u0003=\u001e\u0000\u018e\u018d\u0001"+
		"\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191d\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0195\u0003=\u001e"+
		"\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u019d\u0005,\u0000\u0000\u019a\u019c\u0003=\u001e\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"f\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u001c\u0000"+
		"\u00be\u00c0\u00c7\u00c9\u00cd\u00e2\u00ee\u00f3\u0115\u011c\u0122\u012b"+
		"\u0131\u013a\u0140\u0149\u014f\u0159\u015f\u0168\u0172\u017c\u0183\u0189"+
		"\u0190\u0196\u019d\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}