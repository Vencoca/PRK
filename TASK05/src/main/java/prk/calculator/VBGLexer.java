// Generated from C:/Users/vacla/Documents/Github/PRK/TASK05/grammar\VBG.g4 by ANTLR 4.10.1
package prk.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VBGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, SUM=2, MULTIPLY=3, POWER=4, LEFTBRACKET=5, RIGHTBRACKET=6, COMPARE=7, 
		DECIMAL=8, HEXA=9, BINARY=10, FLOAT=11, BOOL=12, STRING=13, NLINE=14, 
		WS=15, COM=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "SUM", "MULTIPLY", "POWER", "LEFTBRACKET", "RIGHTBRACKET", "COMPARE", 
			"DECIMAL", "HEXA", "BINARY", "FLOAT", "BOOL", "STRING", "NLINE", "WS", 
			"COM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'*'", "'^'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "SUM", "MULTIPLY", "POWER", "LEFTBRACKET", "RIGHTBRACKET", 
			"COMPARE", "DECIMAL", "HEXA", "BINARY", "FLOAT", "BOOL", "STRING", "NLINE", 
			"WS", "COM"
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


	public VBGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VBG.g4"; }

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
		"\u0004\u0000\u0010\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006;\b\u0006\u0001\u0007"+
		"\u0003\u0007>\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007B\b\u0007\n\u0007"+
		"\f\u0007E\t\u0007\u0001\u0007\u0003\u0007H\b\u0007\u0001\u0007\u0003\u0007"+
		"K\b\u0007\u0001\b\u0003\bN\b\b\u0001\b\u0001\b\u0001\b\u0005\bS\b\b\n"+
		"\b\f\bV\t\b\u0001\t\u0003\tY\b\t\u0001\t\u0001\t\u0001\t\u0005\t^\b\t"+
		"\n\t\f\ta\t\t\u0001\n\u0001\n\u0001\n\u0005\nf\b\n\n\n\f\ni\t\n\u0001"+
		"\n\u0001\n\u0004\nm\b\n\u000b\n\f\nn\u0001\n\u0001\n\u0001\n\u0004\nt"+
		"\b\n\u000b\n\f\nu\u0003\nx\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u008a\b\u000b\u0001\f\u0001\f\u0005\f\u008e\b\f\n\f"+
		"\f\f\u0091\t\f\u0001\f\u0001\f\u0001\r\u0004\r\u0096\b\r\u000b\r\f\r\u0097"+
		"\u0001\u000e\u0004\u000e\u009b\b\u000e\u000b\u000e\f\u000e\u009c\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00a5\b\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\f\u0002\u0000<<>>\u0001\u000019\u0003\u000009__||\u0001\u0000"+
		"--\u0003\u000009AFaf\u0005\u000009AF__af||\u0002\u000001__\u0003\u0000"+
		",,..||\u0001\u0000\"\"\u0003\u0000\n\n\r\r||\u0002\u0000\t\t  \u0002\u0000"+
		"!!**\u00cd\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005"+
		"+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000"+
		"\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000"+
		"\u000fJ\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013X"+
		"\u0001\u0000\u0000\u0000\u0015w\u0001\u0000\u0000\u0000\u0017\u0089\u0001"+
		"\u0000\u0000\u0000\u0019\u008b\u0001\u0000\u0000\u0000\u001b\u0095\u0001"+
		"\u0000\u0000\u0000\u001d\u009a\u0001\u0000\u0000\u0000\u001f\u00a0\u0001"+
		"\u0000\u0000\u0000!(\u0003\u000f\u0007\u0000\"(\u0003\u0011\b\u0000#("+
		"\u0003\u0013\t\u0000$(\u0003\u0015\n\u0000%(\u0003\u0017\u000b\u0000&"+
		"(\u0003\u0019\f\u0000\'!\u0001\u0000\u0000\u0000\'\"\u0001\u0000\u0000"+
		"\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005+\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005*\u0000"+
		"\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005^\u0000\u0000.\b\u0001\u0000"+
		"\u0000\u0000/0\u0005(\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005)"+
		"\u0000\u00002\f\u0001\u0000\u0000\u00003;\u0007\u0000\u0000\u000045\u0005"+
		"=\u0000\u00005;\u0005=\u0000\u000067\u0005<\u0000\u00007;\u0005=\u0000"+
		"\u000089\u0005>\u0000\u00009;\u0005=\u0000\u0000:3\u0001\u0000\u0000\u0000"+
		":4\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;\u000e\u0001\u0000\u0000\u0000<>\u0005-\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?C\u0007"+
		"\u0001\u0000\u0000@B\u0007\u0002\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DK\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0003"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IK\u00050\u0000\u0000J=\u0001\u0000\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LN\u0005-\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0005h\u0000\u0000PT\u0007\u0004\u0000\u0000QS\u0007\u0005\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0012\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WY\u0005-\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005b\u0000\u0000"+
		"[_\u000201\u0000\\^\u0007\u0006\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u0014\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bx\u0007"+
		"\u0007\u0000\u0000cg\u0007\u0001\u0000\u0000df\u0007\u0002\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jl\u0007\u0007\u0000\u0000km\u0007\u0002\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000ox\u0001\u0000\u0000\u0000pq\u00050\u0000\u0000"+
		"qs\u0007\u0007\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wb\u0001\u0000\u0000\u0000wc\u0001"+
		"\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000x\u0016\u0001\u0000\u0000"+
		"\u0000yz\u0005J\u0000\u0000z\u008a\u0005o\u0000\u0000{|\u0005N\u0000\u0000"+
		"|\u008a\u0005e\u0000\u0000}~\u0005J\u0000\u0000~\u008a\u0005O\u0000\u0000"+
		"\u007f\u0080\u0005N\u0000\u0000\u0080\u008a\u0005E\u0000\u0000\u0081\u0082"+
		"\u0005j\u0000\u0000\u0082\u008a\u0005o\u0000\u0000\u0083\u0084\u0005n"+
		"\u0000\u0000\u0084\u008a\u0005e\u0000\u0000\u0085\u0086\u0005j\u0000\u0000"+
		"\u0086\u008a\u0005O\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088\u008a"+
		"\u0005E\u0000\u0000\u0089y\u0001\u0000\u0000\u0000\u0089{\u0001\u0000"+
		"\u0000\u0000\u0089}\u0001\u0000\u0000\u0000\u0089\u007f\u0001\u0000\u0000"+
		"\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000"+
		"\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0018\u0001\u0000\u0000\u0000\u008b\u008f\u0005\"\u0000\u0000"+
		"\u008c\u008e\b\b\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093\u001a"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0007\t\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u001c\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0007\n\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0006\u000e\u0000\u0000\u009f\u001e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005!\u0000\u0000\u00a1\u00a2\u0005*\u0000\u0000"+
		"\u00a2\u00a6\u0001\u0000\u0000\u0000\u00a3\u00a5\b\u000b\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005*\u0000\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0006\u000f\u0000\u0000\u00ad \u0001\u0000"+
		"\u0000\u0000\u0014\u0000\':=CGJMTX_gnuw\u0089\u008f\u0097\u009c\u00a6"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}