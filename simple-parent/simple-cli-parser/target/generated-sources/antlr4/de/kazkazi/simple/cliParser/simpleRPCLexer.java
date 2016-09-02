// Generated from de/kazkazi/simple/cliParser/simpleRPC.g4 by ANTLR 4.3
package de.kazkazi.simple.cliParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleRPCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		Identifier=17, WS=18, HELP=19, CALL=20, LIST=21, STRING=22, NUMBER=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "WS", "HELP", "CALL", "LIST", "STRING", 
		"ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP"
	};


	public simpleRPCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleRPC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 18: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));

		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));

		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00f7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\7\22~\n\22\f\22"+
		"\16\22\u0081\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0089\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0091\n\24\3\25\6\25\u0094\n\25\r\25\16"+
		"\25\u0095\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a2"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ac\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00b6\n\30\3\31\3\31\3\31\7\31\u00bb"+
		"\n\31\f\31\16\31\u00be\13\31\3\31\3\31\3\32\3\32\3\32\5\32\u00c5\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\5\35\u00d0\n\35\3\35\3\35"+
		"\3\35\6\35\u00d5\n\35\r\35\16\35\u00d6\3\35\5\35\u00da\n\35\3\35\5\35"+
		"\u00dd\n\35\3\35\3\35\3\35\3\35\5\35\u00e3\n\35\3\35\5\35\u00e6\n\35\3"+
		"\36\3\36\3\36\7\36\u00eb\n\36\f\36\16\36\u00ee\13\36\5\36\u00f0\n\36\3"+
		"\37\3\37\5\37\u00f4\n\37\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\24+\25-"+
		"\26/\27\61\30\63\2\65\2\67\29\31;\2=\2\3\2\17\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63"+
		";\4\2GGgg\4\2--//\u0105\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\29\3\2\2\2\3?\3\2\2\2\5D\3\2\2\2\7I\3\2\2\2\tN\3\2\2\2\13"+
		"S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27"+
		"b\3\2\2\2\31g\3\2\2\2\33l\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!y\3\2\2\2#{"+
		"\3\2\2\2%\u0088\3\2\2\2\'\u0090\3\2\2\2)\u0093\3\2\2\2+\u00a1\3\2\2\2"+
		"-\u00ab\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00c1\3\2\2\2\65\u00c6"+
		"\3\2\2\2\67\u00cc\3\2\2\29\u00e5\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2"+
		"?@\7N\2\2@A\7K\2\2AB\7U\2\2BC\7V\2\2C\4\3\2\2\2DE\7J\2\2EF\7G\2\2FG\7"+
		"N\2\2GH\7R\2\2H\6\3\2\2\2IJ\7E\2\2JK\7C\2\2KL\7N\2\2LM\7N\2\2M\b\3\2\2"+
		"\2NO\7v\2\2OP\7t\2\2PQ\7w\2\2QR\7g\2\2R\n\3\2\2\2ST\7<\2\2T\f\3\2\2\2"+
		"UV\7]\2\2V\16\3\2\2\2WX\7}\2\2X\20\3\2\2\2YZ\7n\2\2Z[\7k\2\2[\\\7u\2\2"+
		"\\]\7v\2\2]\22\3\2\2\2^_\7_\2\2_\24\3\2\2\2`a\7\177\2\2a\26\3\2\2\2bc"+
		"\7e\2\2cd\7c\2\2de\7n\2\2ef\7n\2\2f\30\3\2\2\2gh\7j\2\2hi\7g\2\2ij\7n"+
		"\2\2jk\7r\2\2k\32\3\2\2\2lm\7p\2\2mn\7w\2\2no\7n\2\2op\7n\2\2p\34\3\2"+
		"\2\2qr\7.\2\2r\36\3\2\2\2st\7h\2\2tu\7c\2\2uv\7n\2\2vw\7u\2\2wx\7g\2\2"+
		"x \3\2\2\2yz\7\60\2\2z\"\3\2\2\2{\177\5%\23\2|~\5\'\24\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080$\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0089\t\2\2\2\u0083\u0084\n\3\2\2\u0084\u0089\6\23\2\2\u0085"+
		"\u0086\t\4\2\2\u0086\u0087\t\5\2\2\u0087\u0089\6\23\3\2\u0088\u0082\3"+
		"\2\2\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0089&\3\2\2\2\u008a\u0091"+
		"\t\6\2\2\u008b\u008c\n\3\2\2\u008c\u0091\6\24\4\2\u008d\u008e\t\4\2\2"+
		"\u008e\u008f\t\5\2\2\u008f\u0091\6\24\5\2\u0090\u008a\3\2\2\2\u0090\u008b"+
		"\3\2\2\2\u0090\u008d\3\2\2\2\u0091(\3\2\2\2\u0092\u0094\t\7\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\25\2\2\u0098*\3\2\2\2\u0099\u009a"+
		"\7J\2\2\u009a\u009b\7G\2\2\u009b\u009c\7N\2\2\u009c\u00a2\7R\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a2\7r\2\2"+
		"\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7"+
		"E\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7N\2\2\u00a6\u00ac\7N\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ac\7n\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7N\2\2\u00ae"+
		"\u00af\7K\2\2\u00af\u00b0\7U\2\2\u00b0\u00b6\7V\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b6\7v\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\60\3\2\2\2\u00b7\u00bc\7$\2\2\u00b8"+
		"\u00bb\5\63\32\2\u00b9\u00bb\n\b\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0\62\3\2\2\2"+
		"\u00c1\u00c4\7^\2\2\u00c2\u00c5\t\t\2\2\u00c3\u00c5\5\65\33\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\5\67\34\2\u00c8\u00c9\5\67\34\2\u00c9\u00ca\5\67\34\2\u00ca\u00cb"+
		"\5\67\34\2\u00cb\66\3\2\2\2\u00cc\u00cd\t\n\2\2\u00cd8\3\2\2\2\u00ce\u00d0"+
		"\7/\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\5;\36\2\u00d2\u00d4\7\60\2\2\u00d3\u00d5\t\13\2\2\u00d4\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\5=\37\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00e6\3\2\2\2\u00db\u00dd\7/\2\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5;\36\2\u00df\u00e0\5="+
		"\37\2\u00e0\u00e6\3\2\2\2\u00e1\u00e3\7/\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\5;\36\2\u00e5\u00cf\3\2"+
		"\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6:\3\2\2\2\u00e7\u00f0"+
		"\7\62\2\2\u00e8\u00ec\t\f\2\2\u00e9\u00eb\t\13\2\2\u00ea\u00e9\3\2\2\2"+
		"\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00f0"+
		"<\3\2\2\2\u00f1\u00f3\t\r\2\2\u00f2\u00f4\t\16\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5;\36\2\u00f6>\3"+
		"\2\2\2\26\2\177\u0088\u0090\u0095\u00a1\u00ab\u00b5\u00ba\u00bc\u00c4"+
		"\u00cf\u00d6\u00d9\u00dc\u00e2\u00e5\u00ec\u00ef\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}