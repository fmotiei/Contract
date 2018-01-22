// Generated from contractGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class contractGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, N=22, T=23, VI=24, DT=25, WS=26;
	public static final int
		RULE_r = 0, RULE_va = 1, RULE_df = 2, RULE_vb = 3, RULE_vj = 4, RULE_ve = 5, 
		RULE_ar = 6, RULE_ars = 7, RULE_vd = 8, RULE_vf = 9, RULE_vc = 10, RULE_b = 11, 
		RULE_ex = 12, RULE_vg = 13;
	public static final String[] ruleNames = {
		"r", "va", "df", "vb", "vj", "ve", "ar", "ars", "vd", "vf", "vc", "b", 
		"ex", "vg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "') -> '", "')'", "'.'", "'mkdate'", "'and'", "'then'", 
		"'scaleX'", "'scale'", "'truncate'", "'['", "']'", "'one()'", "'give'", 
		"'+'", "'-'", "'*'", "'/'", "'::'", "'='", null, null, null, "'TimeFunc(Date) -> Double'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "N", "T", 
		"VI", "DT", "WS"
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

	@Override
	public String getGrammarFileName() { return "contractGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public contractGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public List<TerminalNode> N() { return getTokens(contractGrammarParser.N); }
		public TerminalNode N(int i) {
			return getToken(contractGrammarParser.N, i);
		}
		public List<VgContext> vg() {
			return getRuleContexts(VgContext.class);
		}
		public VgContext vg(int i) {
			return getRuleContext(VgContext.class,i);
		}
		public List<VfContext> vf() {
			return getRuleContexts(VfContext.class);
		}
		public VfContext vf(int i) {
			return getRuleContext(VfContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << N))) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case N:
					{
					setState(28);
					match(N);
					setState(29);
					vg();
					}
					break;
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__13:
				case T__14:
					{
					setState(30);
					vf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
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

	public static class VaContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(contractGrammarParser.T, 0); }
		public VaContext va() {
			return getRuleContext(VaContext.class,0);
		}
		public VaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVa(this);
		}
	}

	public final VaContext va() throws RecognitionException {
		VaContext _localctx = new VaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_va);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(T);
				setState(38);
				va();
				}
				break;
			case T__2:
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

	public static class DfContext extends ParserRuleContext {
		public List<TerminalNode> T() { return getTokens(contractGrammarParser.T); }
		public TerminalNode T(int i) {
			return getToken(contractGrammarParser.T, i);
		}
		public VaContext va() {
			return getRuleContext(VaContext.class,0);
		}
		public DfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_df; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterDf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitDf(this);
		}
	}

	public final DfContext df() throws RecognitionException {
		DfContext _localctx = new DfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_df);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			match(T);
			setState(44);
			va();
			setState(45);
			match(T__2);
			setState(46);
			match(T);
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

	public static class VbContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(contractGrammarParser.T, 0); }
		public DfContext df() {
			return getRuleContext(DfContext.class,0);
		}
		public TerminalNode DT() { return getToken(contractGrammarParser.DT, 0); }
		public VbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVb(this);
		}
	}

	public final VbContext vb() throws RecognitionException {
		VbContext _localctx = new VbContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vb);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				df();
				}
				break;
			case DT:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(DT);
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

	public static class VjContext extends ParserRuleContext {
		public TerminalNode VI() { return getToken(contractGrammarParser.VI, 0); }
		public VjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVj(this);
		}
	}

	public final VjContext vj() throws RecognitionException {
		VjContext _localctx = new VjContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vj);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VI:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(VI);
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case N:
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

	public static class VeContext extends ParserRuleContext {
		public ArsContext ars() {
			return getRuleContext(ArsContext.class,0);
		}
		public VeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVe(this);
		}
	}

	public final VeContext ve() throws RecognitionException {
		VeContext _localctx = new VeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ve);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case N:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__1);
				setState(59);
				ars();
				setState(60);
				match(T__3);
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

	public static class ArContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ArContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitAr(this);
		}
	}

	public final ArContext ar() throws RecognitionException {
		ArContext _localctx = new ArContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			ex();
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

	public static class ArsContext extends ParserRuleContext {
		public List<ArContext> ar() {
			return getRuleContexts(ArContext.class);
		}
		public ArContext ar(int i) {
			return getRuleContext(ArContext.class,i);
		}
		public ArsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterArs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitArs(this);
		}
	}

	public final ArsContext ars() throws RecognitionException {
		ArsContext _localctx = new ArsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			ar();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(67);
				match(T__0);
				setState(68);
				ar();
				}
				}
				setState(73);
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

	public static class VdContext extends ParserRuleContext {
		public VjContext vj() {
			return getRuleContext(VjContext.class,0);
		}
		public VdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVd(this);
		}
	}

	public final VdContext vd() throws RecognitionException {
		VdContext _localctx = new VdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vd);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case N:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__4);
				setState(76);
				vj();
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

	public static class VfContext extends ParserRuleContext {
		public List<ArContext> ar() {
			return getRuleContexts(ArContext.class);
		}
		public ArContext ar(int i) {
			return getRuleContext(ArContext.class,i);
		}
		public VfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVf(this);
		}
	}

	public final VfContext vf() throws RecognitionException {
		VfContext _localctx = new VfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vf);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__5);
				setState(80);
				match(T__1);
				setState(81);
				ar();
				setState(82);
				match(T__0);
				setState(83);
				ar();
				setState(84);
				match(T__3);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				match(T__11);
				setState(88);
				ar();
				setState(89);
				match(T__0);
				setState(90);
				ar();
				setState(91);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__14);
				setState(95);
				match(T__1);
				setState(96);
				ar();
				setState(97);
				match(T__3);
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

	public static class VcContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(contractGrammarParser.N, 0); }
		public VeContext ve() {
			return getRuleContext(VeContext.class,0);
		}
		public TerminalNode VI() { return getToken(contractGrammarParser.VI, 0); }
		public VdContext vd() {
			return getRuleContext(VdContext.class,0);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public VfContext vf() {
			return getRuleContext(VfContext.class,0);
		}
		public VcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVc(this);
		}
	}

	public final VcContext vc() throws RecognitionException {
		VcContext _localctx = new VcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vc);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(N);
				setState(102);
				ve();
				}
				break;
			case VI:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(VI);
				setState(104);
				vd();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__1);
				setState(106);
				ex();
				setState(107);
				match(T__3);
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				vf();
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

	public static class BContext extends ParserRuleContext {
		public VcContext vc() {
			return getRuleContext(VcContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_b);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case N:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				vc();
				setState(115);
				b();
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

	public static class ExContext extends ParserRuleContext {
		public VcContext vc() {
			return getRuleContext(VcContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitEx(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			vc();
			setState(120);
			b();
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

	public static class VgContext extends ParserRuleContext {
		public VbContext vb() {
			return getRuleContext(VbContext.class,0);
		}
		public ArsContext ars() {
			return getRuleContext(ArsContext.class,0);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public VgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).enterVg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof contractGrammarListener ) ((contractGrammarListener)listener).exitVg(this);
		}
	}

	public final VgContext vg() throws RecognitionException {
		VgContext _localctx = new VgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vg);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__19);
				setState(123);
				vb();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__1);
				setState(125);
				ars();
				setState(126);
				match(T__3);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__20);
				setState(129);
				ex();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\66\n\5\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\n\3\n\3\n\5\nP\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fq\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\rx\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0085\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\4\3\2\t\r\3\2\22\25\2\u008a\2#\3\2\2\2\4*\3\2\2\2\6,\3\2\2"+
		"\2\b\65\3\2\2\2\n9\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22O\3\2"+
		"\2\2\24e\3\2\2\2\26p\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34\u0084\3\2\2\2"+
		"\36\37\7\30\2\2\37\"\5\34\17\2 \"\5\24\13\2!\36\3\2\2\2! \3\2\2\2\"%\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'\7\3\2\2\'(\7\31\2\2"+
		"(+\5\4\3\2)+\3\2\2\2*&\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\4\2\2-.\7\31\2"+
		"\2./\5\4\3\2/\60\7\5\2\2\60\61\7\31\2\2\61\7\3\2\2\2\62\66\7\31\2\2\63"+
		"\66\5\6\4\2\64\66\7\33\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66"+
		"\t\3\2\2\2\67:\7\32\2\28:\3\2\2\29\67\3\2\2\298\3\2\2\2:\13\3\2\2\2;A"+
		"\3\2\2\2<=\7\4\2\2=>\5\20\t\2>?\7\6\2\2?A\3\2\2\2@;\3\2\2\2@<\3\2\2\2"+
		"A\r\3\2\2\2BC\5\32\16\2C\17\3\2\2\2DI\5\16\b\2EF\7\3\2\2FH\5\16\b\2GE"+
		"\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KI\3\2\2\2LP\3\2\2\2"+
		"MN\7\7\2\2NP\5\n\6\2OL\3\2\2\2OM\3\2\2\2P\23\3\2\2\2QR\7\b\2\2RS\7\4\2"+
		"\2ST\5\16\b\2TU\7\3\2\2UV\5\16\b\2VW\7\6\2\2Wf\3\2\2\2XY\t\2\2\2YZ\7\16"+
		"\2\2Z[\5\16\b\2[\\\7\3\2\2\\]\5\16\b\2]^\7\17\2\2^f\3\2\2\2_f\7\20\2\2"+
		"`a\7\21\2\2ab\7\4\2\2bc\5\16\b\2cd\7\6\2\2df\3\2\2\2eQ\3\2\2\2eX\3\2\2"+
		"\2e_\3\2\2\2e`\3\2\2\2f\25\3\2\2\2gh\7\30\2\2hq\5\f\7\2ij\7\32\2\2jq\5"+
		"\22\n\2kl\7\4\2\2lm\5\32\16\2mn\7\6\2\2nq\3\2\2\2oq\5\24\13\2pg\3\2\2"+
		"\2pi\3\2\2\2pk\3\2\2\2po\3\2\2\2q\27\3\2\2\2rx\3\2\2\2st\t\3\2\2tu\5\26"+
		"\f\2uv\5\30\r\2vx\3\2\2\2wr\3\2\2\2ws\3\2\2\2x\31\3\2\2\2yz\5\26\f\2z"+
		"{\5\30\r\2{\33\3\2\2\2|}\7\26\2\2}\u0085\5\b\5\2~\177\7\4\2\2\177\u0080"+
		"\5\20\t\2\u0080\u0081\7\6\2\2\u0081\u0085\3\2\2\2\u0082\u0083\7\27\2\2"+
		"\u0083\u0085\5\32\16\2\u0084|\3\2\2\2\u0084~\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085\35\3\2\2\2\16!#*\659@IOepw\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}