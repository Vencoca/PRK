// Generated from \\wsl$\Ubuntu20.04LTS\home\vencoca\PRK\Grammar\VBG.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VBGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		BOOL=39, STRING=40, WS=41, COM=42;
	public static final int
		RULE_soubor = 0, RULE_vyraz = 1, RULE_porovnej = 2, RULE_konecPorovnej = 3, 
		RULE_vyrazPorovnej = 4, RULE_plus = 5, RULE_konecPlus = 6, RULE_vyrazPlus = 7, 
		RULE_krat = 8, RULE_konecKrat = 9, RULE_vyrazKrat = 10, RULE_mocnina = 11, 
		RULE_konecMocnina = 12, RULE_vyrazMocnina = 13, RULE_type = 14, RULE_number = 15, 
		RULE_integer = 16, RULE_signed = 17, RULE_unsigned = 18, RULE_decimal = 19, 
		RULE_hexa = 20, RULE_binary = 21, RULE_nonz = 22, RULE_digit = 23, RULE_hexnz = 24, 
		RULE_hexdigit = 25, RULE_flt = 26, RULE_bool = 27, RULE_string = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"soubor", "vyraz", "porovnej", "konecPorovnej", "vyrazPorovnej", "plus", 
			"konecPlus", "vyrazPlus", "krat", "konecKrat", "vyrazKrat", "mocnina", 
			"konecMocnina", "vyrazMocnina", "type", "number", "integer", "signed", 
			"unsigned", "decimal", "hexa", "binary", "nonz", "digit", "hexnz", "hexdigit", 
			"flt", "bool", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'<'", "'>'", "'=='", "'<='", "'>='", "'('", "')'", "'+'", 
			"'*'", "'^'", "'-'", "'h'", "'b'", "'0'", "'1'", "'_'", "'2'", "'3'", 
			"'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'a'", "'c'", "'d'", "'e'", 
			"'f'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOL", "STRING", "WS", "COM"
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
	public String getGrammarFileName() { return "VBG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VBGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SouborContext extends ParserRuleContext {
		public List<VyrazContext> vyraz() {
			return getRuleContexts(VyrazContext.class);
		}
		public VyrazContext vyraz(int i) {
			return getRuleContext(VyrazContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public SouborContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soubor; }
	}

	public final SouborContext soubor() throws RecognitionException {
		SouborContext _localctx = new SouborContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_soubor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					vyraz();
					}
					break;
				case 2:
					{
					setState(59);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(60);
					type();
					}
					break;
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__36) | (1L << T__37) | (1L << BOOL) | (1L << STRING))) != 0) );
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

	public static class VyrazContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public KratContext krat() {
			return getRuleContext(KratContext.class,0);
		}
		public MocninaContext mocnina() {
			return getRuleContext(MocninaContext.class,0);
		}
		public PorovnejContext porovnej() {
			return getRuleContext(PorovnejContext.class,0);
		}
		public VyrazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vyraz; }
	}

	public final VyrazContext vyraz() throws RecognitionException {
		VyrazContext _localctx = new VyrazContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vyraz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				plus();
				}
				break;
			case 2:
				{
				setState(66);
				krat();
				}
				break;
			case 3:
				{
				setState(67);
				mocnina();
				}
				break;
			case 4:
				{
				setState(68);
				porovnej();
				}
				break;
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

	public static class PorovnejContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<KonecPorovnejContext> konecPorovnej() {
			return getRuleContexts(KonecPorovnejContext.class);
		}
		public KonecPorovnejContext konecPorovnej(int i) {
			return getRuleContext(KonecPorovnejContext.class,i);
		}
		public PorovnejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porovnej; }
	}

	public final PorovnejContext porovnej() throws RecognitionException {
		PorovnejContext _localctx = new PorovnejContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_porovnej);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			type();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(72);
				konecPorovnej();
				}
				}
				setState(77);
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

	public static class KonecPorovnejContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KonecPorovnejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konecPorovnej; }
	}

	public final KonecPorovnejContext konecPorovnej() throws RecognitionException {
		KonecPorovnejContext _localctx = new KonecPorovnejContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_konecPorovnej);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			type();
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

	public static class VyrazPorovnejContext extends ParserRuleContext {
		public PorovnejContext porovnej() {
			return getRuleContext(PorovnejContext.class,0);
		}
		public VyrazPorovnejContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vyrazPorovnej; }
	}

	public final VyrazPorovnejContext vyrazPorovnej() throws RecognitionException {
		VyrazPorovnejContext _localctx = new VyrazPorovnejContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vyrazPorovnej);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__6);
			setState(82);
			porovnej();
			setState(83);
			match(T__7);
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

	public static class PlusContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<KonecPlusContext> konecPlus() {
			return getRuleContexts(KonecPlusContext.class);
		}
		public KonecPlusContext konecPlus(int i) {
			return getRuleContext(KonecPlusContext.class,i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_plus);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					konecPlus();
					}
					} 
				}
				setState(91);
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
			exitRule();
		}
		return _localctx;
	}

	public static class KonecPlusContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KonecPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konecPlus; }
	}

	public final KonecPlusContext konecPlus() throws RecognitionException {
		KonecPlusContext _localctx = new KonecPlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_konecPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(93);
			type();
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

	public static class VyrazPlusContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public VyrazPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vyrazPlus; }
	}

	public final VyrazPlusContext vyrazPlus() throws RecognitionException {
		VyrazPlusContext _localctx = new VyrazPlusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vyrazPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__6);
			setState(96);
			plus();
			setState(97);
			match(T__7);
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

	public static class KratContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VyrazPlusContext vyrazPlus() {
			return getRuleContext(VyrazPlusContext.class,0);
		}
		public List<KonecKratContext> konecKrat() {
			return getRuleContexts(KonecKratContext.class);
		}
		public KonecKratContext konecKrat(int i) {
			return getRuleContext(KonecKratContext.class,i);
		}
		public KratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krat; }
	}

	public final KratContext krat() throws RecognitionException {
		KratContext _localctx = new KratContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_krat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__36:
			case T__37:
			case BOOL:
			case STRING:
				{
				setState(99);
				type();
				}
				break;
			case T__6:
				{
				setState(100);
				vyrazPlus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(103);
				konecKrat();
				}
				}
				setState(108);
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

	public static class KonecKratContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VyrazPlusContext vyrazPlus() {
			return getRuleContext(VyrazPlusContext.class,0);
		}
		public KonecKratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konecKrat; }
	}

	public final KonecKratContext konecKrat() throws RecognitionException {
		KonecKratContext _localctx = new KonecKratContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_konecKrat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__9);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__36:
			case T__37:
			case BOOL:
			case STRING:
				{
				setState(110);
				type();
				}
				break;
			case T__6:
				{
				setState(111);
				vyrazPlus();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VyrazKratContext extends ParserRuleContext {
		public KratContext krat() {
			return getRuleContext(KratContext.class,0);
		}
		public VyrazKratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vyrazKrat; }
	}

	public final VyrazKratContext vyrazKrat() throws RecognitionException {
		VyrazKratContext _localctx = new VyrazKratContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vyrazKrat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__6);
			setState(115);
			krat();
			setState(116);
			match(T__7);
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

	public static class MocninaContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VyrazPlusContext vyrazPlus() {
			return getRuleContext(VyrazPlusContext.class,0);
		}
		public VyrazKratContext vyrazKrat() {
			return getRuleContext(VyrazKratContext.class,0);
		}
		public List<KonecMocninaContext> konecMocnina() {
			return getRuleContexts(KonecMocninaContext.class);
		}
		public KonecMocninaContext konecMocnina(int i) {
			return getRuleContext(KonecMocninaContext.class,i);
		}
		public MocninaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mocnina; }
	}

	public final MocninaContext mocnina() throws RecognitionException {
		MocninaContext _localctx = new MocninaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mocnina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(118);
				type();
				}
				break;
			case 2:
				{
				setState(119);
				vyrazPlus();
				}
				break;
			case 3:
				{
				setState(120);
				vyrazKrat();
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(123);
				konecMocnina();
				}
				}
				setState(128);
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

	public static class KonecMocninaContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VyrazPlusContext vyrazPlus() {
			return getRuleContext(VyrazPlusContext.class,0);
		}
		public VyrazKratContext vyrazKrat() {
			return getRuleContext(VyrazKratContext.class,0);
		}
		public KonecMocninaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konecMocnina; }
	}

	public final KonecMocninaContext konecMocnina() throws RecognitionException {
		KonecMocninaContext _localctx = new KonecMocninaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_konecMocnina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__10);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(130);
				type();
				}
				break;
			case 2:
				{
				setState(131);
				vyrazPlus();
				}
				break;
			case 3:
				{
				setState(132);
				vyrazKrat();
				}
				break;
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

	public static class VyrazMocninaContext extends ParserRuleContext {
		public MocninaContext mocnina() {
			return getRuleContext(MocninaContext.class,0);
		}
		public VyrazMocninaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vyrazMocnina; }
	}

	public final VyrazMocninaContext vyrazMocnina() throws RecognitionException {
		VyrazMocninaContext _localctx = new VyrazMocninaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vyrazMocnina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__6);
			setState(136);
			mocnina();
			setState(137);
			match(T__7);
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

	public static class TypeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				number();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				string();
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FltContext flt() {
			return getRuleContext(FltContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				flt();
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

	public static class IntegerContext extends ParserRuleContext {
		public SignedContext signed() {
			return getRuleContext(SignedContext.class,0);
		}
		public UnsignedContext unsigned() {
			return getRuleContext(UnsignedContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integer);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				signed();
				}
				break;
			case T__12:
			case T__13:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				unsigned();
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

	public static class SignedContext extends ParserRuleContext {
		public UnsignedContext unsigned() {
			return getRuleContext(UnsignedContext.class,0);
		}
		public SignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed; }
	}

	public final SignedContext signed() throws RecognitionException {
		SignedContext _localctx = new SignedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			unsigned();
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

	public static class UnsignedContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public HexaContext hexa() {
			return getRuleContext(HexaContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public UnsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned; }
	}

	public final UnsignedContext unsigned() throws RecognitionException {
		UnsignedContext _localctx = new UnsignedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unsigned);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				decimal();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				hexa();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				binary();
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

	public static class DecimalContext extends ParserRuleContext {
		public NonzContext nonz() {
			return getRuleContext(NonzContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decimal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			nonz();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					digit();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class HexaContext extends ParserRuleContext {
		public HexnzContext hexnz() {
			return getRuleContext(HexnzContext.class,0);
		}
		public List<HexdigitContext> hexdigit() {
			return getRuleContexts(HexdigitContext.class);
		}
		public HexdigitContext hexdigit(int i) {
			return getRuleContext(HexdigitContext.class,i);
		}
		public HexaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexa; }
	}

	public final HexaContext hexa() throws RecognitionException {
		HexaContext _localctx = new HexaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hexa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__12);
			setState(168);
			hexnz();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					hexdigit();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BinaryContext extends ParserRuleContext {
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__13);
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(177);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NonzContext extends ParserRuleContext {
		public NonzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonz; }
	}

	public final NonzContext nonz() throws RecognitionException {
		NonzContext _localctx = new NonzContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nonz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DigitContext extends ParserRuleContext {
		public NonzContext nonz() {
			return getRuleContext(NonzContext.class,0);
		}
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_digit);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__14);
				}
				break;
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				nonz();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__16);
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

	public static class HexnzContext extends ParserRuleContext {
		public NonzContext nonz() {
			return getRuleContext(NonzContext.class,0);
		}
		public HexnzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexnz; }
	}

	public final HexnzContext hexnz() throws RecognitionException {
		HexnzContext _localctx = new HexnzContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hexnz);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				nonz();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__25);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(T__13);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 11);
				{
				setState(199);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 12);
				{
				setState(200);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 13);
				{
				setState(201);
				match(T__35);
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

	public static class HexdigitContext extends ParserRuleContext {
		public HexnzContext hexnz() {
			return getRuleContext(HexnzContext.class,0);
		}
		public HexdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexdigit; }
	}

	public final HexdigitContext hexdigit() throws RecognitionException {
		HexdigitContext _localctx = new HexdigitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hexdigit);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__14);
				}
				break;
			case T__13:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				hexnz();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__16);
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

	public static class FltContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public List<DecimalContext> decimal() {
			return getRuleContexts(DecimalContext.class);
		}
		public DecimalContext decimal(int i) {
			return getRuleContext(DecimalContext.class,i);
		}
		public FltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flt; }
	}

	public final FltContext flt() throws RecognitionException {
		FltContext _localctx = new FltContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_flt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(209);
				match(T__14);
				}
				break;
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__36:
			case T__37:
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
					{
					{
					setState(210);
					decimal();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					digit();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(VBGParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(BOOL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VBGParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\5\nh\n\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3"+
		"\13\3\13\5\13s\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r|\n\r\3\r\7\r\177\n"+
		"\r\f\r\16\r\u0082\13\r\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\5\20\u0091\n\20\3\21\3\21\5\21\u0095\n\21\3\22"+
		"\3\22\5\22\u0099\n\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00a1\n\24\3"+
		"\25\3\25\7\25\u00a5\n\25\f\25\16\25\u00a8\13\25\3\26\3\26\3\26\7\26\u00ad"+
		"\n\26\f\26\16\26\u00b0\13\26\3\27\3\27\3\27\6\27\u00b5\n\27\r\27\16\27"+
		"\u00b6\3\30\3\30\3\31\3\31\3\31\5\31\u00be\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00cd\n\32\3\33\3\33"+
		"\3\33\5\33\u00d2\n\33\3\34\3\34\7\34\u00d6\n\34\f\34\16\34\u00d9\13\34"+
		"\5\34\u00db\n\34\3\34\3\34\7\34\u00df\n\34\f\34\16\34\u00e2\13\34\3\35"+
		"\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\b\3\2\4\b\4\2\13\13\16\16\3\2\21\22\3\2\21\23\4"+
		"\2\22\22\24\33\3\2\'(\2\u00f6\2?\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bP\3\2"+
		"\2\2\nS\3\2\2\2\fW\3\2\2\2\16^\3\2\2\2\20a\3\2\2\2\22g\3\2\2\2\24o\3\2"+
		"\2\2\26t\3\2\2\2\30{\3\2\2\2\32\u0083\3\2\2\2\34\u0089\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u0094\3\2\2\2\"\u0098\3\2\2\2$\u009a\3\2\2\2&\u00a0\3\2\2\2"+
		"(\u00a2\3\2\2\2*\u00a9\3\2\2\2,\u00b1\3\2\2\2.\u00b8\3\2\2\2\60\u00bd"+
		"\3\2\2\2\62\u00cc\3\2\2\2\64\u00d1\3\2\2\2\66\u00da\3\2\2\28\u00e3\3\2"+
		"\2\2:\u00e5\3\2\2\2<@\5\4\3\2=@\7\3\2\2>@\5\36\20\2?<\3\2\2\2?=\3\2\2"+
		"\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CH\5\f\7\2DH\5\22"+
		"\n\2EH\5\30\r\2FH\5\6\4\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\5\3"+
		"\2\2\2IM\5\36\20\2JL\5\b\5\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N"+
		"\7\3\2\2\2OM\3\2\2\2PQ\t\2\2\2QR\5\36\20\2R\t\3\2\2\2ST\7\t\2\2TU\5\6"+
		"\4\2UV\7\n\2\2V\13\3\2\2\2W[\5\36\20\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^_\7\13\2\2_`\5\36\20\2`\17"+
		"\3\2\2\2ab\7\t\2\2bc\5\f\7\2cd\7\n\2\2d\21\3\2\2\2eh\5\36\20\2fh\5\20"+
		"\t\2ge\3\2\2\2gf\3\2\2\2hl\3\2\2\2ik\5\24\13\2ji\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2m\23\3\2\2\2nl\3\2\2\2or\7\f\2\2ps\5\36\20\2qs\5\20\t"+
		"\2rp\3\2\2\2rq\3\2\2\2s\25\3\2\2\2tu\7\t\2\2uv\5\22\n\2vw\7\n\2\2w\27"+
		"\3\2\2\2x|\5\36\20\2y|\5\20\t\2z|\5\26\f\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2"+
		"\2|\u0080\3\2\2\2}\177\5\32\16\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\31\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0087\7\r\2\2\u0084\u0088\5\36\20\2\u0085\u0088\5\20\t\2\u0086\u0088"+
		"\5\26\f\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\33\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\30\r\2\u008b\u008c"+
		"\7\n\2\2\u008c\35\3\2\2\2\u008d\u0091\5 \21\2\u008e\u0091\58\35\2\u008f"+
		"\u0091\5:\36\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\37\3\2\2\2\u0092\u0095\5\"\22\2\u0093\u0095\5\66\34\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095!\3\2\2\2\u0096\u0099\5$\23\2"+
		"\u0097\u0099\5&\24\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099#\3"+
		"\2\2\2\u009a\u009b\t\3\2\2\u009b\u009c\5&\24\2\u009c%\3\2\2\2\u009d\u00a1"+
		"\5(\25\2\u009e\u00a1\5*\26\2\u009f\u00a1\5,\27\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\'\3\2\2\2\u00a2\u00a6\5.\30\2"+
		"\u00a3\u00a5\5\60\31\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7)\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7\17\2\2\u00aa\u00ae\5\62\32\2\u00ab\u00ad\5\64\33\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"+\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b4\t\4\2\2"+
		"\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7-\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9"+
		"/\3\2\2\2\u00ba\u00be\7\21\2\2\u00bb\u00be\5.\30\2\u00bc\u00be\7\23\2"+
		"\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\61"+
		"\3\2\2\2\u00bf\u00cd\5.\30\2\u00c0\u00cd\7\34\2\2\u00c1\u00cd\7\20\2\2"+
		"\u00c2\u00cd\7\35\2\2\u00c3\u00cd\7\36\2\2\u00c4\u00cd\7\37\2\2\u00c5"+
		"\u00cd\7 \2\2\u00c6\u00cd\7!\2\2\u00c7\u00cd\7\"\2\2\u00c8\u00cd\7#\2"+
		"\2\u00c9\u00cd\7$\2\2\u00ca\u00cd\7%\2\2\u00cb\u00cd\7&\2\2\u00cc\u00bf"+
		"\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\63\3\2\2\2\u00ce\u00d2\7\21\2"+
		"\2\u00cf\u00d2\5\62\32\2\u00d0\u00d2\7\23\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\65\3\2\2\2\u00d3\u00db\7\21\2"+
		"\2\u00d4\u00d6\5(\25\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00d3\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\t\7"+
		"\2\2\u00dd\u00df\5\60\31\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\67\3\2\2\2\u00e2\u00e0\3\2\2"+
		"\2\u00e3\u00e4\7)\2\2\u00e49\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6;\3\2\2\2"+
		"\32?AGM[glr{\u0080\u0087\u0090\u0094\u0098\u00a0\u00a6\u00ae\u00b6\u00bd"+
		"\u00cc\u00d1\u00d7\u00da\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}