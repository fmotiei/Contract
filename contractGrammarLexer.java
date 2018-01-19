// Generated from contractGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class contractGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, N=20, T=21, VI=22, DT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "N", "T", "VI", "DT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "') -> '", "')'", "'.'", "'mkdate ('", "'and'", "'then'", 
		"'scaleX'", "'scale'", "'truncate'", "'one()'", "'give('", "'+'", "'-'", 
		"'*'", "'/'", "'::'", "'='", null, null, null, "'TimeFunc(Date) -> Double'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "N", "T", "VI", "DT", 
		"WS"
	};
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


	public contractGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "contractGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\6\25\u0084\n\25\r\25\16\25\u0085\3\25\7\25\u0089\n\25\f\25\16\25\u008c"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a3\n\26\3\27\6\27\u00a6"+
		"\n\27\r\27\16\27\u00a7\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\6\31\u00c4\n\31\r\31\16\31\u00c5\3\31\3\31\2\2\32\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\4\4\2\62;c|\4\2\13\f\"\"\2"+
		"\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t=\3\2\2"+
		"\2\13?\3\2\2\2\rA\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23S\3\2\2\2\25Z\3\2"+
		"\2\2\27`\3\2\2\2\31i\3\2\2\2\33o\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2"+
		"\2\2#{\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2\2\2+\u00a2\3\2\2\2"+
		"-\u00a5\3\2\2\2/\u00a9\3\2\2\2\61\u00c3\3\2\2\2\63\64\7.\2\2\64\4\3\2"+
		"\2\2\65\66\7*\2\2\66\6\3\2\2\2\678\7+\2\289\7\"\2\29:\7/\2\2:;\7@\2\2"+
		";<\7\"\2\2<\b\3\2\2\2=>\7+\2\2>\n\3\2\2\2?@\7\60\2\2@\f\3\2\2\2AB\7o\2"+
		"\2BC\7m\2\2CD\7f\2\2DE\7c\2\2EF\7v\2\2FG\7g\2\2GH\7\"\2\2HI\7*\2\2I\16"+
		"\3\2\2\2JK\7c\2\2KL\7p\2\2LM\7f\2\2M\20\3\2\2\2NO\7v\2\2OP\7j\2\2PQ\7"+
		"g\2\2QR\7p\2\2R\22\3\2\2\2ST\7u\2\2TU\7e\2\2UV\7c\2\2VW\7n\2\2WX\7g\2"+
		"\2XY\7Z\2\2Y\24\3\2\2\2Z[\7u\2\2[\\\7e\2\2\\]\7c\2\2]^\7n\2\2^_\7g\2\2"+
		"_\26\3\2\2\2`a\7v\2\2ab\7t\2\2bc\7w\2\2cd\7p\2\2de\7e\2\2ef\7c\2\2fg\7"+
		"v\2\2gh\7g\2\2h\30\3\2\2\2ij\7q\2\2jk\7p\2\2kl\7g\2\2lm\7*\2\2mn\7+\2"+
		"\2n\32\3\2\2\2op\7i\2\2pq\7k\2\2qr\7x\2\2rs\7g\2\2st\7*\2\2t\34\3\2\2"+
		"\2uv\7-\2\2v\36\3\2\2\2wx\7/\2\2x \3\2\2\2yz\7,\2\2z\"\3\2\2\2{|\7\61"+
		"\2\2|$\3\2\2\2}~\7<\2\2~\177\7<\2\2\177&\3\2\2\2\u0080\u0081\7?\2\2\u0081"+
		"(\3\2\2\2\u0082\u0084\4c|\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2\2\2\u0087\u0089\t\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b*\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7K\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u00a3\7v\2\2\u0090\u0091\7F\2\2\u0091\u0092\7q\2\2"+
		"\u0092\u0093\7w\2\2\u0093\u0094\7d\2\2\u0094\u0095\7n\2\2\u0095\u00a3"+
		"\7g\2\2\u0096\u0097\7F\2\2\u0097\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u00a3\7g\2\2\u009a\u009b\7E\2\2\u009b\u009c\7q\2\2\u009c\u009d\7p\2\2"+
		"\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7e\2\2\u00a1\u00a3\7v\2\2\u00a2\u008d\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a2\u009a\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a6\4\62;\2"+
		"\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7o\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7H\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7*\2\2\u00b2\u00b3\7F\2\2"+
		"\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7+\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7@\2\2\u00ba"+
		"\u00bb\7\"\2\2\u00bb\u00bc\7F\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7w\2"+
		"\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\60\3"+
		"\2\2\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\31"+
		"\2\2\u00c8\62\3\2\2\2\b\2\u0085\u008a\u00a2\u00a7\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}