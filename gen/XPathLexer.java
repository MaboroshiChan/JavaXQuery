// Generated from /Users/darth_sky/Teaching/CSE232B-Database System Implementation/JavaXQuery/src/main/antlr4/XPath.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, STRING=4, FILENAME=5, SLASH=6, DOUBLE_SLASH=7, 
		TAGNAME=8, ATTNAME=9, STAR=10, DOT=11, EQUALS=12, EQ=13, DOUBLE_EQUALS=14, 
		IS=15, AND=16, OR=17, NOT=18, LPAREN=19, RPAREN=20, LBRACKET=21, RBRACKET=22, 
		COMMA=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "INT", "STRING", "FILENAME", "SLASH", "DOUBLE_SLASH", 
			"TAGNAME", "ATTNAME", "STAR", "DOT", "EQUALS", "EQ", "DOUBLE_EQUALS", 
			"IS", "AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"COMMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text()'", "'\"'", null, null, null, "'/'", "'//'", null, null, 
			"'*'", "'.'", null, null, null, null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INT", "STRING", "FILENAME", "SLASH", "DOUBLE_SLASH", 
			"TAGNAME", "ATTNAME", "STAR", "DOT", "EQUALS", "EQ", "DOUBLE_EQUALS", 
			"IS", "AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"COMMA", "WS"
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

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
		"\u0004\u0000\u0018\u00f4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002<\b\u0002"+
		"\u000b\u0002\f\u0002=\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003"+
		"B\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0005\u000bc\b\u000b\n"+
		"\u000b\f\u000bf\t\u000b\u0001\u000b\u0001\u000b\u0005\u000bj\b\u000b\n"+
		"\u000b\f\u000bm\t\u000b\u0001\f\u0005\fp\b\f\n\f\f\fs\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fy\b\f\n\f\f\f|\t\f\u0001\r\u0005\r\u007f\b\r"+
		"\n\r\f\r\u0082\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0088\b\r\n"+
		"\r\f\r\u008b\t\r\u0001\u000e\u0005\u000e\u008e\b\u000e\n\u000e\f\u000e"+
		"\u0091\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0097\b\u000e\n\u000e\f\u000e\u009a\t\u000e\u0001\u000f\u0005\u000f\u009d"+
		"\b\u000f\n\u000f\f\u000f\u00a0\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00a7\b\u000f\n\u000f\f\u000f\u00aa"+
		"\t\u000f\u0001\u0010\u0005\u0010\u00ad\b\u0010\n\u0010\f\u0010\u00b0\t"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00b6"+
		"\b\u0010\n\u0010\f\u0010\u00b9\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00c0\b\u0011\n\u0011\f\u0011\u00c3"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0005"+
		"\u0014\u00ca\b\u0014\n\u0014\f\u0014\u00cd\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00d1\b\u0014\n\u0014\f\u0014\u00d4\t\u0014\u0001\u0015\u0005"+
		"\u0015\u00d7\b\u0015\n\u0015\f\u0015\u00da\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00de\b\u0015\n\u0015\f\u0015\u00e1\t\u0015\u0001\u0016\u0005"+
		"\u0016\u00e4\b\u0016\n\u0016\f\u0016\u00e7\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u00eb\b\u0016\n\u0016\f\u0016\u00ee\t\u0016\u0001\u0017\u0004"+
		"\u0017\u00f1\b\u0017\u000b\u0017\f\u0017\u00f2\u0000\u0000\u0018\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u0018\u0001\u0000\u0003\u0001\u000009\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\r\r  \u0109\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"8\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007@\u0001"+
		"\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000"+
		"\u0000\rU\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000\u0000\u0011"+
		"Z\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_\u0001"+
		"\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000"+
		"\u0000\u001b\u0080\u0001\u0000\u0000\u0000\u001d\u008f\u0001\u0000\u0000"+
		"\u0000\u001f\u009e\u0001\u0000\u0000\u0000!\u00ae\u0001\u0000\u0000\u0000"+
		"#\u00ba\u0001\u0000\u0000\u0000%\u00c4\u0001\u0000\u0000\u0000\'\u00c6"+
		"\u0001\u0000\u0000\u0000)\u00cb\u0001\u0000\u0000\u0000+\u00d8\u0001\u0000"+
		"\u0000\u0000-\u00e5\u0001\u0000\u0000\u0000/\u00f0\u0001\u0000\u0000\u0000"+
		"12\u0005t\u0000\u000023\u0005e\u0000\u000034\u0005x\u0000\u000045\u0005"+
		"t\u0000\u000056\u0005(\u0000\u000067\u0005)\u0000\u00007\u0002\u0001\u0000"+
		"\u0000\u000089\u0005\"\u0000\u00009\u0004\u0001\u0000\u0000\u0000:<\u0007"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0006\u0001\u0000"+
		"\u0000\u0000?A\u0007\u0001\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"C\b\u0001\u0000\u0000\u0000DE\u0005d\u0000\u0000EF\u0005o\u0000\u0000"+
		"FG\u0005c\u0000\u0000GH\u0005(\u0000\u0000HI\u0001\u0000\u0000\u0000I"+
		"J\u0005\"\u0000\u0000JK\u0003\u0007\u0003\u0000KL\u0005.\u0000\u0000L"+
		"M\u0005x\u0000\u0000MN\u0005m\u0000\u0000NO\u0005l\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0005\"\u0000\u0000QR\u0005)\u0000\u0000R\n\u0001"+
		"\u0000\u0000\u0000ST\u0005/\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005"+
		"/\u0000\u0000VW\u0005/\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0007\u0003\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005@\u0000\u0000"+
		"[\\\u0003\u0007\u0003\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005*\u0000"+
		"\u0000^\u0014\u0001\u0000\u0000\u0000_`\u0005.\u0000\u0000`\u0016\u0001"+
		"\u0000\u0000\u0000ac\u0003/\u0017\u0000ba\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gk\u0005=\u0000\u0000"+
		"hj\u0003/\u0017\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0018\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0003/\u0017\u0000on\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u0005e\u0000\u0000uv\u0005q\u0000\u0000vz\u0001\u0000\u0000\u0000w"+
		"y\u0003/\u0017\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u001a\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003/\u0017\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005=\u0000"+
		"\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0003/\u0017\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0003/\u0017\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005i\u0000\u0000\u0093\u0094\u0005s\u0000\u0000\u0094\u0098\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0003/\u0017\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001e\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0003/\u0017\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4"+
		"\u0005d\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003"+
		"/\u0017\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9 \u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0003/\u0017\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005o\u0000\u0000\u00b2"+
		"\u00b3\u0005r\u0000\u0000\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0003/\u0017\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005n\u0000\u0000\u00bb\u00bc\u0005o\u0000\u0000"+
		"\u00bc\u00bd\u0005t\u0000\u0000\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0003/\u0017\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2$\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005(\u0000\u0000\u00c5&\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005)\u0000\u0000\u00c7(\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0003/\u0017\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d2\u0005[\u0000\u0000\u00cf\u00d1\u0003"+
		"/\u0017\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3*\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0003/\u0017\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00df\u0005]\u0000\u0000\u00dc"+
		"\u00de\u0003/\u0017\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0,\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0003/\u0017\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005,\u0000"+
		"\u0000\u00e9\u00eb\u0003/\u0017\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed.\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1\u0007\u0002\u0000\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"0\u0001\u0000\u0000\u0000\u0017\u0000=Bdkqz\u0080\u0089\u008f\u0098\u009e"+
		"\u00a8\u00ae\u00b7\u00c1\u00cb\u00d2\u00d8\u00df\u00e5\u00ec\u00f2\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}