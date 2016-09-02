// Generated from de/kazkazi/simple/cliParser/simpleRPC.g4 by ANTLR 4.3
package de.kazkazi.simple.cliParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleRPCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		Identifier=17, WS=18, HELP=19, CALL=20, LIST=21, STRING=22, NUMBER=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'LIST'", "'HELP'", "'CALL'", "'true'", "':'", "'['", "'{'", 
		"'list'", "']'", "'}'", "'call'", "'help'", "'null'", "','", "'false'", 
		"'.'", "Identifier", "WS", "HELP", "CALL", "LIST", "STRING", "NUMBER"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_callCommand = 1, RULE_callInput = 2, RULE_listCommand = 3, 
		RULE_helpCommand = 4, RULE_qualifiedName = 5, RULE_json = 6, RULE_object = 7, 
		RULE_pair = 8, RULE_array = 9, RULE_value = 10;
	public static final String[] ruleNames = {
		"compilationUnit", "callCommand", "callInput", "listCommand", "helpCommand", 
		"qualifiedName", "json", "object", "pair", "array", "value"
	};

	@Override
	public String getGrammarFileName() { return "simpleRPC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleRPCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ListCommandContext listCommand() {
			return getRuleContext(ListCommandContext.class,0);
		}
		public HelpCommandContext helpCommand() {
			return getRuleContext(HelpCommandContext.class,0);
		}
		public CallCommandContext callCommand() {
			return getRuleContext(CallCommandContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case T__13:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); callCommand();
				}
				break;
			case T__15:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); listCommand();
				}
				break;
			case T__14:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); helpCommand();
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

	public static class CallCommandContext extends ParserRuleContext {
		public CallInputContext callInput() {
			return getRuleContext(CallInputContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CallCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterCallCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitCallCommand(this);
		}
	}

	public final CallCommandContext callCommand() throws RecognitionException {
		CallCommandContext _localctx = new CallCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(28); qualifiedName();
			setState(30);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__10) | (1L << T__9) | (1L << T__3) | (1L << T__1) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(29); callInput();
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

	public static class CallInputContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public CallInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterCallInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitCallInput(this);
		}
	}

	public final CallInputContext callInput() throws RecognitionException {
		CallInputContext _localctx = new CallInputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_callInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); json();
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

	public static class ListCommandContext extends ParserRuleContext {
		public ListCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterListCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitListCommand(this);
		}
	}

	public final ListCommandContext listCommand() throws RecognitionException {
		ListCommandContext _localctx = new ListCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class HelpCommandContext extends ParserRuleContext {
		public HelpCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helpCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterHelpCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitHelpCommand(this);
		}
	}

	public final HelpCommandContext helpCommand() throws RecognitionException {
		HelpCommandContext _localctx = new HelpCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_helpCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public List<TerminalNode> Identifier() { return getTokens(simpleRPCParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(simpleRPCParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(Identifier);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(39); match(T__0);
				setState(40); match(Identifier);
				}
				}
				setState(45);
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

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); value();
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

	public static class ObjectContext extends ParserRuleContext {
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_object);
		int _la;
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(T__9);
				setState(49); pair();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(50); match(T__2);
					setState(51); pair();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57); match(T__6);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(T__9);
				setState(60); match(T__6);
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

	public static class PairContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(simpleRPCParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(STRING);
			setState(64); match(T__11);
			setState(65); value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array);
		int _la;
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); match(T__10);
				setState(68); value();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69); match(T__2);
					setState(70); value();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76); match(T__7);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(T__10);
				setState(79); match(T__7);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(simpleRPCParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(simpleRPCParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleRPCListener ) ((simpleRPCListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(NUMBER);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); object();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); array();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); match(T__12);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(88); match(T__3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\7\7,\n\7\f\7\16\7/\13\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t\67"+
		"\n\t\f\t\16\t:\13\t\3\t\3\t\3\t\3\t\5\t@\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\7\13J\n\13\f\13\16\13M\13\13\3\13\3\13\3\13\3\13\5\13S\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\5\4\2\5\5\r\r\4\2\3\3\n\n\4\2\4\4\16\16`\2\33\3\2\2\2\4\35\3"+
		"\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n&\3\2\2\2\f(\3\2\2\2\16\60\3\2\2\2\20?"+
		"\3\2\2\2\22A\3\2\2\2\24R\3\2\2\2\26[\3\2\2\2\30\34\5\4\3\2\31\34\5\b\5"+
		"\2\32\34\5\n\6\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\3\3\2\2"+
		"\2\35\36\t\2\2\2\36 \5\f\7\2\37!\5\6\4\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2"+
		"\2\2\"#\5\16\b\2#\7\3\2\2\2$%\t\3\2\2%\t\3\2\2\2&\'\t\4\2\2\'\13\3\2\2"+
		"\2(-\7\23\2\2)*\7\22\2\2*,\7\23\2\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3"+
		"\2\2\2.\r\3\2\2\2/-\3\2\2\2\60\61\5\26\f\2\61\17\3\2\2\2\62\63\7\t\2\2"+
		"\638\5\22\n\2\64\65\7\20\2\2\65\67\5\22\n\2\66\64\3\2\2\2\67:\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\f\2\2<@\3\2\2\2=>\7\t\2"+
		"\2>@\7\f\2\2?\62\3\2\2\2?=\3\2\2\2@\21\3\2\2\2AB\7\30\2\2BC\7\7\2\2CD"+
		"\5\26\f\2D\23\3\2\2\2EF\7\b\2\2FK\5\26\f\2GH\7\20\2\2HJ\5\26\f\2IG\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\13\2\2OS\3"+
		"\2\2\2PQ\7\b\2\2QS\7\13\2\2RE\3\2\2\2RP\3\2\2\2S\25\3\2\2\2T\\\7\30\2"+
		"\2U\\\7\31\2\2V\\\5\20\t\2W\\\5\24\13\2X\\\7\6\2\2Y\\\7\21\2\2Z\\\7\17"+
		"\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\27\3\2\2\2\n\33 -8?KR[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}