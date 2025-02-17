// Generated from /Users/darth_sky/Teaching/CSE232B-Database System Implementation/JavaXQuery/src/main/antlr4/XQuery.g4 by ANTLR 4.13.2
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
		Var=10, FOR=11, WHERE=12, IN=13, RETURN=14, LET=15, INT=16, STRING=17, 
		FILENAME=18, SLASH=19, DOUBLE_SLASH=20, TAGNAME=21, ATTNAME=22, STAR=23, 
		DOT=24, EQUALS=25, EQ=26, DOUBLE_EQUALS=27, IS=28, AND=29, OR=30, NOT=31, 
		LPAREN=32, RPAREN=33, LBRACKET=34, RBRACKET=35, COMMA=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Var", "FOR", "WHERE", "IN", "RETURN", "LET", "INT", "STRING", "FILENAME", 
			"SLASH", "DOUBLE_SLASH", "TAGNAME", "ATTNAME", "STAR", "DOT", "EQUALS", 
			"EQ", "DOUBLE_EQUALS", "IS", "AND", "OR", "NOT", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "COMMA", "WS"
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
		"\u0004\u0000%\u0166\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tr\b\t\n\t"+
		"\f\tu\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n"+
		"\u007f\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0088\b\u000b\n\u000b\f\u000b\u008b"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0091\b\f\n\f\f\f\u0094"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u009e\b\r\n\r\f\r\u00a1\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00a8\b\u000e\n\u000e\f\u000e\u00ab\t\u000e"+
		"\u0001\u000f\u0004\u000f\u00ae\b\u000f\u000b\u000f\f\u000f\u00af\u0001"+
		"\u0010\u0004\u0010\u00b3\b\u0010\u000b\u0010\f\u0010\u00b4\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018"+
		"\u00d5\b\u0018\n\u0018\f\u0018\u00d8\t\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00dc\b\u0018\n\u0018\f\u0018\u00df\t\u0018\u0001\u0019\u0005\u0019"+
		"\u00e2\b\u0019\n\u0019\f\u0019\u00e5\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00eb\b\u0019\n\u0019\f\u0019\u00ee\t\u0019"+
		"\u0001\u001a\u0005\u001a\u00f1\b\u001a\n\u001a\f\u001a\u00f4\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00fa\b\u001a\n"+
		"\u001a\f\u001a\u00fd\t\u001a\u0001\u001b\u0005\u001b\u0100\b\u001b\n\u001b"+
		"\f\u001b\u0103\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u0109\b\u001b\n\u001b\f\u001b\u010c\t\u001b\u0001\u001c\u0005"+
		"\u001c\u010f\b\u001c\n\u001c\f\u001c\u0112\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0119\b\u001c\n\u001c"+
		"\f\u001c\u011c\t\u001c\u0001\u001d\u0005\u001d\u011f\b\u001d\n\u001d\f"+
		"\u001d\u0122\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0128\b\u001d\n\u001d\f\u001d\u012b\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0132\b\u001e\n\u001e"+
		"\f\u001e\u0135\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0005"+
		"!\u013c\b!\n!\f!\u013f\t!\u0001!\u0001!\u0005!\u0143\b!\n!\f!\u0146\t"+
		"!\u0001\"\u0005\"\u0149\b\"\n\"\f\"\u014c\t\"\u0001\"\u0001\"\u0005\""+
		"\u0150\b\"\n\"\f\"\u0153\t\"\u0001#\u0005#\u0156\b#\n#\f#\u0159\t#\u0001"+
		"#\u0001#\u0005#\u015d\b#\n#\f#\u0160\t#\u0001$\u0004$\u0163\b$\u000b$"+
		"\f$\u0164\u0000\u0000%\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%\u0001\u0000\u0003\u0001\u000009\u0005\u0000"+
		"\n\n09AZ__az\u0003\u0000\t\n\r\r  \u0181\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0001K\u0001\u0000\u0000\u0000\u0003M"+
		"\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000"+
		"\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000"+
		"\r[\u0001\u0000\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011l\u0001"+
		"\u0000\u0000\u0000\u0013n\u0001\u0000\u0000\u0000\u0015v\u0001\u0000\u0000"+
		"\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u008c\u0001\u0000\u0000"+
		"\u0000\u001b\u0095\u0001\u0000\u0000\u0000\u001d\u00a2\u0001\u0000\u0000"+
		"\u0000\u001f\u00ad\u0001\u0000\u0000\u0000!\u00b2\u0001\u0000\u0000\u0000"+
		"#\u00b6\u0001\u0000\u0000\u0000%\u00c5\u0001\u0000\u0000\u0000\'\u00c7"+
		"\u0001\u0000\u0000\u0000)\u00ca\u0001\u0000\u0000\u0000+\u00cc\u0001\u0000"+
		"\u0000\u0000-\u00cf\u0001\u0000\u0000\u0000/\u00d1\u0001\u0000\u0000\u0000"+
		"1\u00d6\u0001\u0000\u0000\u00003\u00e3\u0001\u0000\u0000\u00005\u00f2"+
		"\u0001\u0000\u0000\u00007\u0101\u0001\u0000\u0000\u00009\u0110\u0001\u0000"+
		"\u0000\u0000;\u0120\u0001\u0000\u0000\u0000=\u012c\u0001\u0000\u0000\u0000"+
		"?\u0136\u0001\u0000\u0000\u0000A\u0138\u0001\u0000\u0000\u0000C\u013d"+
		"\u0001\u0000\u0000\u0000E\u014a\u0001\u0000\u0000\u0000G\u0157\u0001\u0000"+
		"\u0000\u0000I\u0162\u0001\u0000\u0000\u0000KL\u0005<\u0000\u0000L\u0002"+
		"\u0001\u0000\u0000\u0000MN\u0005>\u0000\u0000N\u0004\u0001\u0000\u0000"+
		"\u0000OP\u0005{\u0000\u0000P\u0006\u0001\u0000\u0000\u0000QR\u0005}\u0000"+
		"\u0000R\b\u0001\u0000\u0000\u0000ST\u0005<\u0000\u0000TU\u0005/\u0000"+
		"\u0000U\n\u0001\u0000\u0000\u0000VW\u0005s\u0000\u0000WX\u0005o\u0000"+
		"\u0000XY\u0005m\u0000\u0000YZ\u0005e\u0000\u0000Z\f\u0001\u0000\u0000"+
		"\u0000[\\\u0005s\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005t\u0000\u0000"+
		"^_\u0005i\u0000\u0000_`\u0005s\u0000\u0000`a\u0005f\u0000\u0000ab\u0005"+
		"i\u0000\u0000bc\u0005e\u0000\u0000cd\u0005s\u0000\u0000d\u000e\u0001\u0000"+
		"\u0000\u0000ef\u0005t\u0000\u0000fg\u0005e\u0000\u0000gh\u0005x\u0000"+
		"\u0000hi\u0005t\u0000\u0000ij\u0005(\u0000\u0000jk\u0005)\u0000\u0000"+
		"k\u0010\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000m\u0012\u0001\u0000"+
		"\u0000\u0000no\u0005$\u0000\u0000os\u0003!\u0010\u0000pr\u0003I$\u0000"+
		"qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u0014\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005f\u0000\u0000wx\u0005o\u0000\u0000xy\u0005r"+
		"\u0000\u0000y}\u0001\u0000\u0000\u0000z|\u0003I$\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0016\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005w\u0000\u0000\u0081\u0082\u0005h\u0000\u0000\u0082"+
		"\u0083\u0005e\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005"+
		"e\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088\u0003I$"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u0018\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005i\u0000\u0000\u008d\u008e\u0005n\u0000\u0000\u008e"+
		"\u0092\u0001\u0000\u0000\u0000\u008f\u0091\u0003I$\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001a\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"r\u0000\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005t\u0000"+
		"\u0000\u0098\u0099\u0005u\u0000\u0000\u0099\u009a\u0005r\u0000\u0000\u009a"+
		"\u009b\u0005n\u0000\u0000\u009b\u009f\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0003I$\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u001c\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005l\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000"+
		"\u00a4\u00a5\u0005t\u0000\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0003I$\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u001e\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0007\u0000\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0 \u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0007\u0001\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\"\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005d\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8"+
		"\u00b9\u0005c\u0000\u0000\u00b9\u00ba\u0005(\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\"\u0000\u0000\u00bc\u00bd\u0003!"+
		"\u0010\u0000\u00bd\u00be\u0005.\u0000\u0000\u00be\u00bf\u0005x\u0000\u0000"+
		"\u00bf\u00c0\u0005m\u0000\u0000\u00c0\u00c1\u0005l\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\"\u0000\u0000\u00c3\u00c4\u0005"+
		")\u0000\u0000\u00c4$\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005/\u0000"+
		"\u0000\u00c6&\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8"+
		"\u00c9\u0005/\u0000\u0000\u00c9(\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003"+
		"!\u0010\u0000\u00cb*\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005@\u0000"+
		"\u0000\u00cd\u00ce\u0003!\u0010\u0000\u00ce,\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005*\u0000\u0000\u00d0.\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		".\u0000\u0000\u00d20\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003I$\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dd\u0005=\u0000\u0000\u00da\u00dc\u0003I$\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de2\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003"+
		"I$\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005e\u0000\u0000\u00e7\u00e8\u0005q\u0000\u0000\u00e8"+
		"\u00ec\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003I$\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed4\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1\u0003I$\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005=\u0000\u0000\u00f6\u00f7\u0005=\u0000\u0000\u00f7\u00fb"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003I$\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc6\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0003I$\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005i\u0000\u0000\u0105\u0106\u0005s\u0000\u0000\u0106\u010a\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0003I$\u0000\u0108\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b8\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f\u0003I$\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005a\u0000\u0000\u0114\u0115\u0005n\u0000\u0000\u0115\u0116\u0005d"+
		"\u0000\u0000\u0116\u011a\u0001\u0000\u0000\u0000\u0117\u0119\u0003I$\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b:\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u011f\u0003I$\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005o\u0000\u0000\u0124\u0125\u0005r\u0000"+
		"\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126\u0128\u0003I$\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"<\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005n\u0000\u0000\u012d\u012e\u0005o\u0000\u0000\u012e\u012f\u0005t"+
		"\u0000\u0000\u012f\u0133\u0001\u0000\u0000\u0000\u0130\u0132\u0003I$\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134>\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005(\u0000\u0000\u0137@\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		")\u0000\u0000\u0139B\u0001\u0000\u0000\u0000\u013a\u013c\u0003I$\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0144\u0005[\u0000\u0000\u0141\u0143\u0003I$\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145D\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0149\u0003"+
		"I$\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u0151\u0005]\u0000\u0000\u014e\u0150\u0003I$\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152"+
		"F\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u0003I$\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000"+
		"\u0000\u0000\u015a\u015e\u0005,\u0000\u0000\u015b\u015d\u0003I$\u0000"+
		"\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015fH\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u0163\u0007\u0002\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165J\u0001\u0000\u0000\u0000\u001d\u0000"+
		"s}\u0089\u0092\u009f\u00a9\u00af\u00b4\u00d6\u00dd\u00e3\u00ec\u00f2\u00fb"+
		"\u0101\u010a\u0110\u011a\u0120\u0129\u0133\u013d\u0144\u014a\u0151\u0157"+
		"\u015e\u0164\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}