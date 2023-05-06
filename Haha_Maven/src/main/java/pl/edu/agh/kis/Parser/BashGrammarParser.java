package pl.edu.agh.kis.Parser;// Generated from BashGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BashGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SPACE=3, TAB=4, COMMENT=5, SINGLE_APOSTROPHE=6, APOSTROPHE=7, 
		SINGLE_SEMICOLON=8, WHILE_LOOP_BEGIN=9, UNTIL_LOOP_BEGIN=10, FOR_LOOP_BEGIN=11, 
		LOOP_MIDDLE=12, LOOP_END=13, IF_START=14, IF_MIDDLE=15, IF_END=16, LOOP_IN=17, 
		CONDITION_LEFT_SINGLE=18, CONDITION_RIGHT_SINGLE=19, CONDITION_EQ=20, 
		EQ=21, CONDITION_NEQ=22, CONDITION_GT=23, CONDITION_GE=24, CONDITION_LT=25, 
		CONDITION_LE=26, MODULO=27, CONDITION_DOUBLE_AMPERSAND=28, CONDITION_DOUBLE_PIPE=29, 
		ELSE=30, ELSE_IF=31, CASE_START=32, CASE_DEFAULT=33, BRAKE_ABSOLUTE=34, 
		BRAKE_CONTINUATION=35, BRAKE_WITH_NEXT_EXEC=36, CASE_END=37, DOLLAR_SIGN=38, 
		VARIABLE=39, SCRIPT_ARGUMENT_NUMBER=40, SCRIPT_ARGUMENT=41, BOOL=42, HEX_NUMBER_WITHOUT_SIGN=43, 
		OCTAL_NUMBER_WITHOUT_SIGN=44, NEW_LINE=45, PIPE=46, PLUS=47, WILDCARD_OR_MULTIPLY=48, 
		WILDCARD=49, MINUS=50, DIVIDE=51, LEFT_SLASH=52, AMPERSAN=53, L_PARENTH_ROUND=54, 
		R_PARENTH_ROUND=55, L_PARENTH_CURLY=56, R_PARENTH_CURLY=57, POINTER_RIGHT=58, 
		POINTER_LEFT=59, BOOL_NEGATION=60, FUNCTION_START=61, SELECT=62, COPROCESS_START=63, 
		TIME=64, CREATE_VARABLE=65, TILDA=66, LAST_FOLDER=67, THIS_FOLDER=68, 
		NUMBER=69, ALPHANUMERIC=70, ALPHA=71, DIGIT=72;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_case_statement = 2, RULE_single_case = 3, 
		RULE_until_loop = 4, RULE_if_statement = 5, RULE_while_loop = 6, RULE_for_loop = 7, 
		RULE_for_loop_argument = 8, RULE_numbers_pipeline_list_for_loop = 9, RULE_signed_number = 10, 
		RULE_number_float = 11, RULE_variable_from_command = 12, RULE_splitter_end_command = 13, 
		RULE_block = 14, RULE_expr_maker = 15, RULE_d_round_expr_maker = 16, RULE_d_round_expr = 17, 
		RULE_variable_or_number = 18, RULE_expr = 19, RULE_word = 20, RULE_pipe_symbol = 21, 
		RULE_pipeline = 22, RULE_pipeline_list = 23, RULE_function = 24, RULE_select = 25, 
		RULE_coprocess = 26, RULE_id = 27, RULE_string = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "case_statement", "single_case", "until_loop", 
			"if_statement", "while_loop", "for_loop", "for_loop_argument", "numbers_pipeline_list_for_loop", 
			"signed_number", "number_float", "variable_from_command", "splitter_end_command", 
			"block", "expr_maker", "d_round_expr_maker", "d_round_expr", "variable_or_number", 
			"expr", "word", "pipe_symbol", "pipeline", "pipeline_list", "function", 
			"select", "coprocess", "id", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'-p'", "' '", null, null, null, "'\"'", "';'", "'while'", 
			"'until'", "'for'", "'do'", "'done'", "'if'", "'then'", "'fi'", "'in'", 
			"'['", "']'", "'-eq'", "'='", null, "'-gt'", null, "'-lt'", null, "'%'", 
			"'&&'", "'||'", "'else'", "'elif'", "'case'", "'*)'", "';;'", "';&'", 
			"';;&'", "'esac'", "'$'", null, "'$#'", null, null, null, null, "'\\n'", 
			"'|'", "'+'", "'*'", "'?'", "'-'", "'/'", "'\\'", "'&'", "'('", "')'", 
			"'{'", "'}'", "'>'", "'<'", "'!'", "'function'", "'select'", "'coproc'", 
			"'time'", "'declare'", "'~'", "'..'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SPACE", "TAB", "COMMENT", "SINGLE_APOSTROPHE", "APOSTROPHE", 
			"SINGLE_SEMICOLON", "WHILE_LOOP_BEGIN", "UNTIL_LOOP_BEGIN", "FOR_LOOP_BEGIN", 
			"LOOP_MIDDLE", "LOOP_END", "IF_START", "IF_MIDDLE", "IF_END", "LOOP_IN", 
			"CONDITION_LEFT_SINGLE", "CONDITION_RIGHT_SINGLE", "CONDITION_EQ", "EQ", 
			"CONDITION_NEQ", "CONDITION_GT", "CONDITION_GE", "CONDITION_LT", "CONDITION_LE", 
			"MODULO", "CONDITION_DOUBLE_AMPERSAND", "CONDITION_DOUBLE_PIPE", "ELSE", 
			"ELSE_IF", "CASE_START", "CASE_DEFAULT", "BRAKE_ABSOLUTE", "BRAKE_CONTINUATION", 
			"BRAKE_WITH_NEXT_EXEC", "CASE_END", "DOLLAR_SIGN", "VARIABLE", "SCRIPT_ARGUMENT_NUMBER", 
			"SCRIPT_ARGUMENT", "BOOL", "HEX_NUMBER_WITHOUT_SIGN", "OCTAL_NUMBER_WITHOUT_SIGN", 
			"NEW_LINE", "PIPE", "PLUS", "WILDCARD_OR_MULTIPLY", "WILDCARD", "MINUS", 
			"DIVIDE", "LEFT_SLASH", "AMPERSAN", "L_PARENTH_ROUND", "R_PARENTH_ROUND", 
			"L_PARENTH_CURLY", "R_PARENTH_CURLY", "POINTER_RIGHT", "POINTER_LEFT", 
			"BOOL_NEGATION", "FUNCTION_START", "SELECT", "COPROCESS_START", "TIME", 
			"CREATE_VARABLE", "TILDA", "LAST_FOLDER", "THIS_FOLDER", "NUMBER", "ALPHANUMERIC", 
			"ALPHA", "DIGIT"
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
	public String getGrammarFileName() { return "BashGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BashGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(BashGrammarParser.COMMENT, 0); }
		public TerminalNode EOF() { return getToken(BashGrammarParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(COMMENT);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -927812032642912282L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 509L) != 0)) {
				{
				{
				setState(59);
				instruction();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(EOF);
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
	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(BashGrammarParser.COMMENT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Until_loopContext until_loop() {
			return getRuleContext(Until_loopContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public CoprocessContext coprocess() {
			return getRuleContext(CoprocessContext.class,0);
		}
		public Pipeline_listContext pipeline_list() {
			return getRuleContext(Pipeline_listContext.class,0);
		}
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				until_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				select();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				coprocess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(76);
				pipeline_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
				splitter_end_command();
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
	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE_START() { return getToken(BashGrammarParser.CASE_START, 0); }
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
		public TerminalNode LOOP_IN() { return getToken(BashGrammarParser.LOOP_IN, 0); }
		public TerminalNode CASE_END() { return getToken(BashGrammarParser.CASE_END, 0); }
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public List<Single_caseContext> single_case() {
			return getRuleContexts(Single_caseContext.class);
		}
		public Single_caseContext single_case(int i) {
			return getRuleContext(Single_caseContext.class,i);
		}
		public TerminalNode CASE_DEFAULT() { return getToken(BashGrammarParser.CASE_DEFAULT, 0); }
		public TerminalNode BRAKE_ABSOLUTE() { return getToken(BashGrammarParser.BRAKE_ABSOLUTE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitCase_statement(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_case_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CASE_START);
			setState(81);
			match(VARIABLE);
			setState(82);
			match(LOOP_IN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(83);
				splitter_end_command();
				}
			}

			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				single_case();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APOSTROPHE || _la==ALPHANUMERIC );
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE_DEFAULT) {
				{
				setState(91);
				match(CASE_DEFAULT);
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						instruction();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(98);
				match(BRAKE_ABSOLUTE);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(101);
				splitter_end_command();
				}
			}

			setState(104);
			match(CASE_END);
			setState(105);
			splitter_end_command();
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
	public static class Single_caseContext extends ParserRuleContext {
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public TerminalNode BRAKE_ABSOLUTE() { return getToken(BashGrammarParser.BRAKE_ABSOLUTE, 0); }
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(BashGrammarParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(BashGrammarParser.PIPE, i);
		}
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public Single_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterSingle_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitSingle_case(this);
		}
	}

	public final Single_caseContext single_case() throws RecognitionException {
		Single_caseContext _localctx = new Single_caseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_case);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				{
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					match(ALPHANUMERIC);
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				}
				break;
			case APOSTROPHE:
				{
				setState(112);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(115);
				match(PIPE);
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALPHANUMERIC:
					{
					setState(117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(116);
						match(ALPHANUMERIC);
						}
						}
						setState(119); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ALPHANUMERIC );
					}
					break;
				case APOSTROPHE:
					{
					setState(121);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(129);
			match(R_PARENTH_ROUND);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(130);
				splitter_end_command();
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					instruction();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(139);
			match(BRAKE_ABSOLUTE);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(140);
				splitter_end_command();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Until_loopContext extends ParserRuleContext {
		public TerminalNode UNTIL_LOOP_BEGIN() { return getToken(BashGrammarParser.UNTIL_LOOP_BEGIN, 0); }
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public TerminalNode LOOP_MIDDLE() { return getToken(BashGrammarParser.LOOP_MIDDLE, 0); }
		public TerminalNode LOOP_END() { return getToken(BashGrammarParser.LOOP_END, 0); }
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public Expr_makerContext expr_maker() {
			return getRuleContext(Expr_makerContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Until_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterUntil_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitUntil_loop(this);
		}
	}

	public final Until_loopContext until_loop() throws RecognitionException {
		Until_loopContext _localctx = new Until_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_until_loop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(UNTIL_LOOP_BEGIN);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(144);
				match(VARIABLE);
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(145);
				variable_from_command();
				setState(146);
				expr_maker(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
			splitter_end_command();
			setState(151);
			match(LOOP_MIDDLE);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					instruction();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(158);
			match(LOOP_END);
			setState(159);
			splitter_end_command();
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_START() { return getToken(BashGrammarParser.IF_START, 0); }
		public List<Expr_makerContext> expr_maker() {
			return getRuleContexts(Expr_makerContext.class);
		}
		public Expr_makerContext expr_maker(int i) {
			return getRuleContext(Expr_makerContext.class,i);
		}
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public List<TerminalNode> IF_MIDDLE() { return getTokens(BashGrammarParser.IF_MIDDLE); }
		public TerminalNode IF_MIDDLE(int i) {
			return getToken(BashGrammarParser.IF_MIDDLE, i);
		}
		public TerminalNode IF_END() { return getToken(BashGrammarParser.IF_END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(BashGrammarParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(BashGrammarParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(BashGrammarParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IF_START);
			setState(162);
			expr_maker(0);
			setState(163);
			splitter_end_command();
			setState(164);
			match(IF_MIDDLE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -927812032642912282L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 509L) != 0)) {
				{
				{
				setState(165);
				instruction();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(171);
				match(ELSE_IF);
				setState(172);
				expr_maker(0);
				setState(173);
				splitter_end_command();
				setState(174);
				match(IF_MIDDLE);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -927812032642912282L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 509L) != 0)) {
					{
					{
					setState(175);
					instruction();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(186);
				match(ELSE);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -927812032642912282L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 509L) != 0)) {
					{
					{
					setState(187);
					instruction();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(195);
			match(IF_END);
			setState(196);
			splitter_end_command();
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP_BEGIN() { return getToken(BashGrammarParser.WHILE_LOOP_BEGIN, 0); }
		public Expr_makerContext expr_maker() {
			return getRuleContext(Expr_makerContext.class,0);
		}
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public TerminalNode LOOP_MIDDLE() { return getToken(BashGrammarParser.LOOP_MIDDLE, 0); }
		public TerminalNode LOOP_END() { return getToken(BashGrammarParser.LOOP_END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(WHILE_LOOP_BEGIN);
			setState(199);
			expr_maker(0);
			setState(200);
			splitter_end_command();
			setState(201);
			match(LOOP_MIDDLE);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					instruction();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(208);
			match(LOOP_END);
			setState(209);
			splitter_end_command();
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP_BEGIN() { return getToken(BashGrammarParser.FOR_LOOP_BEGIN, 0); }
		public For_loop_argumentContext for_loop_argument() {
			return getRuleContext(For_loop_argumentContext.class,0);
		}
		public TerminalNode LOOP_MIDDLE() { return getToken(BashGrammarParser.LOOP_MIDDLE, 0); }
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public TerminalNode LOOP_END() { return getToken(BashGrammarParser.LOOP_END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR_LOOP_BEGIN);
			setState(212);
			for_loop_argument();
			setState(213);
			match(LOOP_MIDDLE);
			setState(214);
			splitter_end_command();
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					instruction();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(221);
				splitter_end_command();
				}
			}

			setState(224);
			match(LOOP_END);
			setState(225);
			splitter_end_command();
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
	public static class For_loop_argumentContext extends ParserRuleContext {
		public List<TerminalNode> L_PARENTH_ROUND() { return getTokens(BashGrammarParser.L_PARENTH_ROUND); }
		public TerminalNode L_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.L_PARENTH_ROUND, i);
		}
		public List<TerminalNode> SINGLE_SEMICOLON() { return getTokens(BashGrammarParser.SINGLE_SEMICOLON); }
		public TerminalNode SINGLE_SEMICOLON(int i) {
			return getToken(BashGrammarParser.SINGLE_SEMICOLON, i);
		}
		public Expr_makerContext expr_maker() {
			return getRuleContext(Expr_makerContext.class,0);
		}
		public List<TerminalNode> R_PARENTH_ROUND() { return getTokens(BashGrammarParser.R_PARENTH_ROUND); }
		public TerminalNode R_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.R_PARENTH_ROUND, i);
		}
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public TerminalNode LOOP_IN() { return getToken(BashGrammarParser.LOOP_IN, 0); }
		public Numbers_pipeline_list_for_loopContext numbers_pipeline_list_for_loop() {
			return getRuleContext(Numbers_pipeline_list_for_loopContext.class,0);
		}
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public For_loop_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterFor_loop_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitFor_loop_argument(this);
		}
	}

	public final For_loop_argumentContext for_loop_argument() throws RecognitionException {
		For_loop_argumentContext _localctx = new For_loop_argumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop_argument);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(L_PARENTH_ROUND);
				setState(228);
				match(L_PARENTH_ROUND);
				setState(229);
				match(SINGLE_SEMICOLON);
				setState(230);
				expr_maker(0);
				setState(231);
				match(SINGLE_SEMICOLON);
				setState(232);
				match(R_PARENTH_ROUND);
				setState(233);
				match(R_PARENTH_ROUND);
				setState(234);
				splitter_end_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					match(ALPHANUMERIC);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(241);
				match(LOOP_IN);
				setState(242);
				numbers_pipeline_list_for_loop();
				setState(243);
				splitter_end_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					match(ALPHANUMERIC);
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(250);
				match(LOOP_IN);
				setState(251);
				variable_from_command();
				setState(252);
				splitter_end_command();
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
	public static class Numbers_pipeline_list_for_loopContext extends ParserRuleContext {
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<TerminalNode> LAST_FOLDER() { return getTokens(BashGrammarParser.LAST_FOLDER); }
		public TerminalNode LAST_FOLDER(int i) {
			return getToken(BashGrammarParser.LAST_FOLDER, i);
		}
		public TerminalNode L_PARENTH_CURLY() { return getToken(BashGrammarParser.L_PARENTH_CURLY, 0); }
		public TerminalNode R_PARENTH_CURLY() { return getToken(BashGrammarParser.R_PARENTH_CURLY, 0); }
		public Numbers_pipeline_list_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers_pipeline_list_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterNumbers_pipeline_list_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitNumbers_pipeline_list_for_loop(this);
		}
	}

	public final Numbers_pipeline_list_for_loopContext numbers_pipeline_list_for_loop() throws RecognitionException {
		Numbers_pipeline_list_for_loopContext _localctx = new Numbers_pipeline_list_for_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numbers_pipeline_list_for_loop);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					signed_number();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 4194313L) != 0) );
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(261);
					match(LAST_FOLDER);
					setState(262);
					signed_number();
					}
				}

				}
				break;
			case L_PARENTH_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(L_PARENTH_CURLY);
				setState(266);
				signed_number();
				setState(267);
				match(LAST_FOLDER);
				setState(268);
				signed_number();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(269);
					match(LAST_FOLDER);
					setState(270);
					signed_number();
					}
				}

				setState(273);
				match(R_PARENTH_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public Number_floatContext number_float() {
			return getRuleContext(Number_floatContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BashGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BashGrammarParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(280);
			number_float();
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
	public static class Number_floatContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BashGrammarParser.NUMBER, 0); }
		public TerminalNode THIS_FOLDER() { return getToken(BashGrammarParser.THIS_FOLDER, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(BashGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(BashGrammarParser.DIGIT, i);
		}
		public Number_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterNumber_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitNumber_float(this);
		}
	}

	public final Number_floatContext number_float() throws RecognitionException {
		Number_floatContext _localctx = new Number_floatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number_float);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(NUMBER);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==THIS_FOLDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(284);
						match(DIGIT);
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_from_commandContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN() { return getToken(BashGrammarParser.DOLLAR_SIGN, 0); }
		public TerminalNode L_PARENTH_ROUND() { return getToken(BashGrammarParser.L_PARENTH_ROUND, 0); }
		public Pipeline_listContext pipeline_list() {
			return getRuleContext(Pipeline_listContext.class,0);
		}
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public Variable_from_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_from_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterVariable_from_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitVariable_from_command(this);
		}
	}

	public final Variable_from_commandContext variable_from_command() throws RecognitionException {
		Variable_from_commandContext _localctx = new Variable_from_commandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_from_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(DOLLAR_SIGN);
			setState(293);
			match(L_PARENTH_ROUND);
			setState(294);
			pipeline_list();
			setState(295);
			match(R_PARENTH_ROUND);
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
	public static class Splitter_end_commandContext extends ParserRuleContext {
		public TerminalNode SINGLE_SEMICOLON() { return getToken(BashGrammarParser.SINGLE_SEMICOLON, 0); }
		public TerminalNode NEW_LINE() { return getToken(BashGrammarParser.NEW_LINE, 0); }
		public Splitter_end_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitter_end_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterSplitter_end_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitSplitter_end_command(this);
		}
	}

	public final Splitter_end_commandContext splitter_end_command() throws RecognitionException {
		Splitter_end_commandContext _localctx = new Splitter_end_commandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_splitter_end_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_SEMICOLON || _la==NEW_LINE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> L_PARENTH_ROUND() { return getTokens(BashGrammarParser.L_PARENTH_ROUND); }
		public TerminalNode L_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.L_PARENTH_ROUND, i);
		}
		public Pipeline_listContext pipeline_list() {
			return getRuleContext(Pipeline_listContext.class,0);
		}
		public List<TerminalNode> R_PARENTH_ROUND() { return getTokens(BashGrammarParser.R_PARENTH_ROUND); }
		public TerminalNode R_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.R_PARENTH_ROUND, i);
		}
		public TerminalNode L_PARENTH_CURLY() { return getToken(BashGrammarParser.L_PARENTH_CURLY, 0); }
		public TerminalNode R_PARENTH_CURLY() { return getToken(BashGrammarParser.R_PARENTH_CURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CONDITION_LEFT_SINGLE() { return getTokens(BashGrammarParser.CONDITION_LEFT_SINGLE); }
		public TerminalNode CONDITION_LEFT_SINGLE(int i) {
			return getToken(BashGrammarParser.CONDITION_LEFT_SINGLE, i);
		}
		public List<TerminalNode> CONDITION_RIGHT_SINGLE() { return getTokens(BashGrammarParser.CONDITION_RIGHT_SINGLE); }
		public TerminalNode CONDITION_RIGHT_SINGLE(int i) {
			return getToken(BashGrammarParser.CONDITION_RIGHT_SINGLE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(L_PARENTH_ROUND);
				setState(300);
				pipeline_list();
				setState(301);
				match(R_PARENTH_ROUND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(L_PARENTH_CURLY);
				setState(304);
				pipeline_list();
				setState(305);
				match(R_PARENTH_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(L_PARENTH_ROUND);
				setState(308);
				match(L_PARENTH_ROUND);
				setState(309);
				expr(0);
				setState(310);
				match(R_PARENTH_ROUND);
				setState(311);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(CONDITION_LEFT_SINGLE);
				setState(314);
				expr(0);
				setState(315);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				match(CONDITION_LEFT_SINGLE);
				setState(318);
				match(CONDITION_LEFT_SINGLE);
				setState(319);
				expr(0);
				setState(320);
				match(CONDITION_RIGHT_SINGLE);
				setState(321);
				match(CONDITION_RIGHT_SINGLE);
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
	public static class Expr_makerContext extends ParserRuleContext {
		public TerminalNode BOOL_NEGATION() { return getToken(BashGrammarParser.BOOL_NEGATION, 0); }
		public List<Expr_makerContext> expr_maker() {
			return getRuleContexts(Expr_makerContext.class);
		}
		public Expr_makerContext expr_maker(int i) {
			return getRuleContext(Expr_makerContext.class,i);
		}
		public TerminalNode TILDA() { return getToken(BashGrammarParser.TILDA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> L_PARENTH_ROUND() { return getTokens(BashGrammarParser.L_PARENTH_ROUND); }
		public TerminalNode L_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.L_PARENTH_ROUND, i);
		}
		public D_round_expr_makerContext d_round_expr_maker() {
			return getRuleContext(D_round_expr_makerContext.class,0);
		}
		public List<TerminalNode> R_PARENTH_ROUND() { return getTokens(BashGrammarParser.R_PARENTH_ROUND); }
		public TerminalNode R_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.R_PARENTH_ROUND, i);
		}
		public TerminalNode CONDITION_DOUBLE_AMPERSAND() { return getToken(BashGrammarParser.CONDITION_DOUBLE_AMPERSAND, 0); }
		public TerminalNode CONDITION_DOUBLE_PIPE() { return getToken(BashGrammarParser.CONDITION_DOUBLE_PIPE, 0); }
		public TerminalNode PIPE() { return getToken(BashGrammarParser.PIPE, 0); }
		public TerminalNode AMPERSAN() { return getToken(BashGrammarParser.AMPERSAN, 0); }
		public Expr_makerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_maker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterExpr_maker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitExpr_maker(this);
		}
	}

	public final Expr_makerContext expr_maker() throws RecognitionException {
		return expr_maker(0);
	}

	private Expr_makerContext expr_maker(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_makerContext _localctx = new Expr_makerContext(_ctx, _parentState);
		Expr_makerContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr_maker, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(326);
				match(BOOL_NEGATION);
				setState(327);
				expr_maker(5);
				}
				break;
			case 2:
				{
				setState(328);
				match(TILDA);
				setState(329);
				expr(0);
				}
				break;
			case 3:
				{
				setState(330);
				match(L_PARENTH_ROUND);
				setState(331);
				match(L_PARENTH_ROUND);
				setState(332);
				d_round_expr_maker();
				setState(333);
				match(R_PARENTH_ROUND);
				setState(334);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_makerContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_maker);
					setState(339);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(340);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077568804225024L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(341);
					expr_maker(4);
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class D_round_expr_makerContext extends ParserRuleContext {
		public D_round_exprContext d_round_expr() {
			return getRuleContext(D_round_exprContext.class,0);
		}
		public D_round_expr_makerContext d_round_expr_maker() {
			return getRuleContext(D_round_expr_makerContext.class,0);
		}
		public TerminalNode CONDITION_DOUBLE_AMPERSAND() { return getToken(BashGrammarParser.CONDITION_DOUBLE_AMPERSAND, 0); }
		public TerminalNode CONDITION_DOUBLE_PIPE() { return getToken(BashGrammarParser.CONDITION_DOUBLE_PIPE, 0); }
		public TerminalNode PIPE() { return getToken(BashGrammarParser.PIPE, 0); }
		public TerminalNode AMPERSAN() { return getToken(BashGrammarParser.AMPERSAN, 0); }
		public TerminalNode L_PARENTH_ROUND() { return getToken(BashGrammarParser.L_PARENTH_ROUND, 0); }
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public D_round_expr_makerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_round_expr_maker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterD_round_expr_maker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitD_round_expr_maker(this);
		}
	}

	public final D_round_expr_makerContext d_round_expr_maker() throws RecognitionException {
		D_round_expr_makerContext _localctx = new D_round_expr_makerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_d_round_expr_maker);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				d_round_expr();
				setState(348);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077568804225024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				d_round_expr_maker();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(L_PARENTH_ROUND);
				setState(352);
				d_round_expr_maker();
				setState(353);
				match(R_PARENTH_ROUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				d_round_expr();
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
	public static class D_round_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(BashGrammarParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(BashGrammarParser.EQ, i);
		}
		public List<TerminalNode> POINTER_RIGHT() { return getTokens(BashGrammarParser.POINTER_RIGHT); }
		public TerminalNode POINTER_RIGHT(int i) {
			return getToken(BashGrammarParser.POINTER_RIGHT, i);
		}
		public List<TerminalNode> POINTER_LEFT() { return getTokens(BashGrammarParser.POINTER_LEFT); }
		public TerminalNode POINTER_LEFT(int i) {
			return getToken(BashGrammarParser.POINTER_LEFT, i);
		}
		public TerminalNode BOOL_NEGATION() { return getToken(BashGrammarParser.BOOL_NEGATION, 0); }
		public TerminalNode BOOL() { return getToken(BashGrammarParser.BOOL, 0); }
		public Variable_or_numberContext variable_or_number() {
			return getRuleContext(Variable_or_numberContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(BashGrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BashGrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BashGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BashGrammarParser.MINUS, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public D_round_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_round_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterD_round_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitD_round_expr(this);
		}
	}

	public final D_round_exprContext d_round_expr() throws RecognitionException {
		D_round_exprContext _localctx = new D_round_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_d_round_expr);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				expr(0);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(359);
					match(EQ);
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(360);
						match(EQ);
						}
					}

					}
					break;
				case 2:
					{
					setState(363);
					match(POINTER_RIGHT);
					}
					break;
				case 3:
					{
					setState(364);
					match(POINTER_RIGHT);
					setState(365);
					match(POINTER_RIGHT);
					}
					break;
				case 4:
					{
					setState(366);
					match(POINTER_LEFT);
					}
					break;
				case 5:
					{
					setState(367);
					match(POINTER_LEFT);
					setState(368);
					match(POINTER_LEFT);
					}
					break;
				}
				setState(371);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				expr(0);
				setState(380);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POINTER_LEFT:
					{
					setState(374);
					match(POINTER_LEFT);
					setState(375);
					match(EQ);
					}
					break;
				case POINTER_RIGHT:
					{
					setState(376);
					match(POINTER_RIGHT);
					setState(377);
					match(EQ);
					}
					break;
				case BOOL_NEGATION:
					{
					setState(378);
					match(BOOL_NEGATION);
					setState(379);
					match(EQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				variable_or_number();
				setState(390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(386);
					match(PLUS);
					setState(387);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(388);
					match(MINUS);
					setState(389);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(392);
					match(PLUS);
					setState(393);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(394);
					match(MINUS);
					setState(395);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(398);
				variable_or_number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				string();
				setState(400);
				match(EQ);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(401);
					match(EQ);
					}
				}

				setState(404);
				string();
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
	public static class Variable_or_numberContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Variable_or_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_or_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterVariable_or_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitVariable_or_number(this);
		}
	}

	public final Variable_or_numberContext variable_or_number() throws RecognitionException {
		Variable_or_numberContext _localctx = new Variable_or_numberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable_or_number);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(VARIABLE);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				id();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				signed_number();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode L_PARENTH_ROUND() { return getToken(BashGrammarParser.L_PARENTH_ROUND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public Variable_or_numberContext variable_or_number() {
			return getRuleContext(Variable_or_numberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BashGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BashGrammarParser.MINUS, 0); }
		public List<TerminalNode> WILDCARD_OR_MULTIPLY() { return getTokens(BashGrammarParser.WILDCARD_OR_MULTIPLY); }
		public TerminalNode WILDCARD_OR_MULTIPLY(int i) {
			return getToken(BashGrammarParser.WILDCARD_OR_MULTIPLY, i);
		}
		public TerminalNode DIVIDE() { return getToken(BashGrammarParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(BashGrammarParser.MODULO, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				{
				setState(414);
				match(L_PARENTH_ROUND);
				setState(415);
				expr(0);
				setState(416);
				match(R_PARENTH_ROUND);
				}
				break;
			case VARIABLE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case ALPHA:
				{
				setState(418);
				variable_or_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(421);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(422);
						match(PLUS);
						}
						break;
					case 2:
						{
						setState(423);
						match(MINUS);
						}
						break;
					case 3:
						{
						setState(424);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					case 4:
						{
						setState(425);
						match(DIVIDE);
						}
						break;
					case 5:
						{
						setState(426);
						match(MODULO);
						}
						break;
					case 6:
						{
						setState(427);
						match(WILDCARD_OR_MULTIPLY);
						setState(428);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					}
					setState(431);
					expr(4);
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class WordContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(BashGrammarParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(BashGrammarParser.PIPE, i);
		}
		public List<TerminalNode> AMPERSAN() { return getTokens(BashGrammarParser.AMPERSAN); }
		public TerminalNode AMPERSAN(int i) {
			return getToken(BashGrammarParser.AMPERSAN, i);
		}
		public List<TerminalNode> SINGLE_SEMICOLON() { return getTokens(BashGrammarParser.SINGLE_SEMICOLON); }
		public TerminalNode SINGLE_SEMICOLON(int i) {
			return getToken(BashGrammarParser.SINGLE_SEMICOLON, i);
		}
		public List<TerminalNode> L_PARENTH_ROUND() { return getTokens(BashGrammarParser.L_PARENTH_ROUND); }
		public TerminalNode L_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.L_PARENTH_ROUND, i);
		}
		public List<TerminalNode> R_PARENTH_ROUND() { return getTokens(BashGrammarParser.R_PARENTH_ROUND); }
		public TerminalNode R_PARENTH_ROUND(int i) {
			return getToken(BashGrammarParser.R_PARENTH_ROUND, i);
		}
		public List<TerminalNode> POINTER_LEFT() { return getTokens(BashGrammarParser.POINTER_LEFT); }
		public TerminalNode POINTER_LEFT(int i) {
			return getToken(BashGrammarParser.POINTER_LEFT, i);
		}
		public List<TerminalNode> POINTER_RIGHT() { return getTokens(BashGrammarParser.POINTER_RIGHT); }
		public TerminalNode POINTER_RIGHT(int i) {
			return getToken(BashGrammarParser.POINTER_RIGHT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(BashGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(BashGrammarParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(BashGrammarParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(BashGrammarParser.TAB, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(BashGrammarParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(BashGrammarParser.NEW_LINE, i);
		}
		public List<TerminalNode> WHILE_LOOP_BEGIN() { return getTokens(BashGrammarParser.WHILE_LOOP_BEGIN); }
		public TerminalNode WHILE_LOOP_BEGIN(int i) {
			return getToken(BashGrammarParser.WHILE_LOOP_BEGIN, i);
		}
		public List<TerminalNode> UNTIL_LOOP_BEGIN() { return getTokens(BashGrammarParser.UNTIL_LOOP_BEGIN); }
		public TerminalNode UNTIL_LOOP_BEGIN(int i) {
			return getToken(BashGrammarParser.UNTIL_LOOP_BEGIN, i);
		}
		public List<TerminalNode> FOR_LOOP_BEGIN() { return getTokens(BashGrammarParser.FOR_LOOP_BEGIN); }
		public TerminalNode FOR_LOOP_BEGIN(int i) {
			return getToken(BashGrammarParser.FOR_LOOP_BEGIN, i);
		}
		public List<TerminalNode> LOOP_MIDDLE() { return getTokens(BashGrammarParser.LOOP_MIDDLE); }
		public TerminalNode LOOP_MIDDLE(int i) {
			return getToken(BashGrammarParser.LOOP_MIDDLE, i);
		}
		public List<TerminalNode> IF_START() { return getTokens(BashGrammarParser.IF_START); }
		public TerminalNode IF_START(int i) {
			return getToken(BashGrammarParser.IF_START, i);
		}
		public List<TerminalNode> IF_MIDDLE() { return getTokens(BashGrammarParser.IF_MIDDLE); }
		public TerminalNode IF_MIDDLE(int i) {
			return getToken(BashGrammarParser.IF_MIDDLE, i);
		}
		public List<TerminalNode> IF_END() { return getTokens(BashGrammarParser.IF_END); }
		public TerminalNode IF_END(int i) {
			return getToken(BashGrammarParser.IF_END, i);
		}
		public List<TerminalNode> LOOP_IN() { return getTokens(BashGrammarParser.LOOP_IN); }
		public TerminalNode LOOP_IN(int i) {
			return getToken(BashGrammarParser.LOOP_IN, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(BashGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(BashGrammarParser.ELSE, i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(BashGrammarParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(BashGrammarParser.ELSE_IF, i);
		}
		public List<TerminalNode> CASE_START() { return getTokens(BashGrammarParser.CASE_START); }
		public TerminalNode CASE_START(int i) {
			return getToken(BashGrammarParser.CASE_START, i);
		}
		public List<TerminalNode> CASE_END() { return getTokens(BashGrammarParser.CASE_END); }
		public TerminalNode CASE_END(int i) {
			return getToken(BashGrammarParser.CASE_END, i);
		}
		public List<TerminalNode> FUNCTION_START() { return getTokens(BashGrammarParser.FUNCTION_START); }
		public TerminalNode FUNCTION_START(int i) {
			return getToken(BashGrammarParser.FUNCTION_START, i);
		}
		public List<TerminalNode> SELECT() { return getTokens(BashGrammarParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(BashGrammarParser.SELECT, i);
		}
		public List<TerminalNode> COPROCESS_START() { return getTokens(BashGrammarParser.COPROCESS_START); }
		public TerminalNode COPROCESS_START(int i) {
			return getToken(BashGrammarParser.COPROCESS_START, i);
		}
		public List<TerminalNode> TIME() { return getTokens(BashGrammarParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(BashGrammarParser.TIME, i);
		}
		public List<TerminalNode> CREATE_VARABLE() { return getTokens(BashGrammarParser.CREATE_VARABLE); }
		public TerminalNode CREATE_VARABLE(int i) {
			return getToken(BashGrammarParser.CREATE_VARABLE, i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_word);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(437);
					_la = _input.LA(1);
					if ( _la <= 0 || (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 9051122563366812643L) != 0)) ) {
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
				setState(440); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pipe_symbolContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(BashGrammarParser.PIPE, 0); }
		public TerminalNode AMPERSAN() { return getToken(BashGrammarParser.AMPERSAN, 0); }
		public Pipe_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterPipe_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitPipe_symbol(this);
		}
	}

	public final Pipe_symbolContext pipe_symbol() throws RecognitionException {
		Pipe_symbolContext _localctx = new Pipe_symbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pipe_symbol);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(PIPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(PIPE);
				setState(444);
				match(AMPERSAN);
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
	public static class PipelineContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public TerminalNode TIME() { return getToken(BashGrammarParser.TIME, 0); }
		public TerminalNode BOOL_NEGATION() { return getToken(BashGrammarParser.BOOL_NEGATION, 0); }
		public List<Pipe_symbolContext> pipe_symbol() {
			return getRuleContexts(Pipe_symbolContext.class);
		}
		public Pipe_symbolContext pipe_symbol(int i) {
			return getRuleContext(Pipe_symbolContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(447);
				match(TIME);
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(448);
					match(T__1);
					}
					break;
				}
				}
			}

			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(453);
				match(BOOL_NEGATION);
				}
				break;
			}
			setState(456);
			word();
			setState(461); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(457);
					pipe_symbol();
					}
				}

				setState(460);
				word();
				}
				}
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1378066156647882982L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 127L) != 0) );
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
	public static class Pipeline_listContext extends ParserRuleContext {
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
		}
		public List<TerminalNode> SINGLE_SEMICOLON() { return getTokens(BashGrammarParser.SINGLE_SEMICOLON); }
		public TerminalNode SINGLE_SEMICOLON(int i) {
			return getToken(BashGrammarParser.SINGLE_SEMICOLON, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(BashGrammarParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(BashGrammarParser.NEW_LINE, i);
		}
		public Pipeline_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterPipeline_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitPipeline_list(this);
		}
	}

	public final Pipeline_listContext pipeline_list() throws RecognitionException {
		Pipeline_listContext _localctx = new Pipeline_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pipeline_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
						{
						setState(465);
						_la = _input.LA(1);
						if ( !(_la==SINGLE_SEMICOLON || _la==NEW_LINE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(468);
					pipeline();
					setState(469);
					_la = _input.LA(1);
					if ( !(_la==SINGLE_SEMICOLON || _la==NEW_LINE) ) {
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
				setState(473); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode L_PARENTH_ROUND() { return getToken(BashGrammarParser.L_PARENTH_ROUND, 0); }
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public TerminalNode FUNCTION_START() { return getToken(BashGrammarParser.FUNCTION_START, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					match(ALPHANUMERIC);
					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(480);
				match(L_PARENTH_ROUND);
				setState(481);
				match(R_PARENTH_ROUND);
				setState(482);
				block();
				}
				break;
			case FUNCTION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(FUNCTION_START);
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484);
					match(ALPHANUMERIC);
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(489);
					match(L_PARENTH_ROUND);
					setState(490);
					match(R_PARENTH_ROUND);
					}
					break;
				}
				setState(493);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(BashGrammarParser.SELECT, 0); }
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public TerminalNode LOOP_MIDDLE() { return getToken(BashGrammarParser.LOOP_MIDDLE, 0); }
		public Pipeline_listContext pipeline_list() {
			return getRuleContext(Pipeline_listContext.class,0);
		}
		public TerminalNode LOOP_END() { return getToken(BashGrammarParser.LOOP_END, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public TerminalNode LOOP_IN() { return getToken(BashGrammarParser.LOOP_IN, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(SELECT);
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(497);
				match(ALPHANUMERIC);
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP_IN) {
				{
				setState(502);
				match(LOOP_IN);
				setState(503);
				word();
				}
			}

			setState(506);
			splitter_end_command();
			setState(507);
			match(LOOP_MIDDLE);
			setState(508);
			pipeline_list();
			setState(509);
			match(LOOP_END);
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
	public static class CoprocessContext extends ParserRuleContext {
		public TerminalNode COPROCESS_START() { return getToken(BashGrammarParser.COPROCESS_START, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public CoprocessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterCoprocess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitCoprocess(this);
		}
	}

	public final CoprocessContext coprocess() throws RecognitionException {
		CoprocessContext _localctx = new CoprocessContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_coprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(COPROCESS_START);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(512);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(518);
			word();
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(BashGrammarParser.ALPHA, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(ALPHA);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> APOSTROPHE() { return getTokens(BashGrammarParser.APOSTROPHE); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(BashGrammarParser.APOSTROPHE, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(APOSTROPHE);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -130L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) {
				{
				{
				setState(528);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==APOSTROPHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(APOSTROPHE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_maker_sempred((Expr_makerContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_maker_sempred(Expr_makerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0219\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0005\u0000=\b\u0000"+
		"\n\u0000\f\u0000@\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002"+
		"\u0004\u0002X\b\u0002\u000b\u0002\f\u0002Y\u0001\u0002\u0001\u0002\u0005"+
		"\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0002\u0003\u0002d\b\u0002"+
		"\u0001\u0002\u0003\u0002g\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003m\b\u0003\u000b\u0003\f\u0003n\u0001\u0003\u0003"+
		"\u0003r\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003v\b\u0003\u000b\u0003"+
		"\f\u0003w\u0001\u0003\u0003\u0003{\b\u0003\u0005\u0003}\b\u0003\n\u0003"+
		"\f\u0003\u0080\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003"+
		"\u0001\u0003\u0005\u0003\u0087\b\u0003\n\u0003\f\u0003\u008a\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u008e\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0095\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u009a\b\u0004\n\u0004\f\u0004\u009d\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00b1\b\u0005\n\u0005\f\u0005\u00b4\t\u0005\u0005\u0005\u00b6\b"+
		"\u0005\n\u0005\f\u0005\u00b9\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00bd\b\u0005\n\u0005\f\u0005\u00c0\t\u0005\u0003\u0005\u00c2\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00cc\b\u0006\n\u0006\f\u0006\u00cf"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d9\b\u0007\n\u0007\f\u0007"+
		"\u00dc\t\u0007\u0001\u0007\u0003\u0007\u00df\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u00ee\b\b\u000b\b\f\b\u00ef\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00f7\b\b\u000b\b\f\b\u00f8\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ff\b\b\u0001\t\u0004\t\u0102\b\t"+
		"\u000b\t\f\t\u0103\u0001\t\u0001\t\u0003\t\u0108\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0110\b\t\u0001\t\u0001\t\u0003\t\u0114"+
		"\b\t\u0001\n\u0003\n\u0117\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u011e\b\u000b\n\u000b\f\u000b\u0121\t\u000b\u0003"+
		"\u000b\u0123\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0144\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0152\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0157\b\u000f\n\u000f\f\u000f\u015a\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u016a\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0172\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u017d\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0187\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u018d\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0193\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0197"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019c\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01a4\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ae\b\u0013"+
		"\u0001\u0013\u0005\u0013\u01b1\b\u0013\n\u0013\f\u0013\u01b4\t\u0013\u0001"+
		"\u0014\u0004\u0014\u01b7\b\u0014\u000b\u0014\f\u0014\u01b8\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01be\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01c2\b\u0016\u0003\u0016\u01c4\b\u0016\u0001\u0016\u0003"+
		"\u0016\u01c7\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01cb\b\u0016"+
		"\u0001\u0016\u0004\u0016\u01ce\b\u0016\u000b\u0016\f\u0016\u01cf\u0001"+
		"\u0017\u0003\u0017\u01d3\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u01d8\b\u0017\u000b\u0017\f\u0017\u01d9\u0001\u0018\u0004\u0018"+
		"\u01dd\b\u0018\u000b\u0018\f\u0018\u01de\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u01e6\b\u0018\u000b\u0018\f"+
		"\u0018\u01e7\u0001\u0018\u0001\u0018\u0003\u0018\u01ec\b\u0018\u0001\u0018"+
		"\u0003\u0018\u01ef\b\u0018\u0001\u0019\u0001\u0019\u0004\u0019\u01f3\b"+
		"\u0019\u000b\u0019\f\u0019\u01f4\u0001\u0019\u0001\u0019\u0003\u0019\u01f9"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0202\b\u001a\n\u001a\f\u001a\u0205\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u020b\b\u001b"+
		"\n\u001b\f\u001b\u020e\t\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u0212"+
		"\b\u001c\n\u001c\f\u001c\u0215\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0000\u0002\u001e&\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0006\u0002\u0000"+
		"//22\u0002\u0000\u0001\u0001DD\u0002\u0000\b\b--\u0003\u0000\u001c\u001d"+
		"..55\t\u0000\u0003\u0004\b\f\u000e\u0011\u001e %%-.57:;=A\u0001\u0000"+
		"\u0007\u0007\u025c\u0000:\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000"+
		"\u0000\u0004P\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000\b"+
		"\u008f\u0001\u0000\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00c6"+
		"\u0001\u0000\u0000\u0000\u000e\u00d3\u0001\u0000\u0000\u0000\u0010\u00fe"+
		"\u0001\u0000\u0000\u0000\u0012\u0113\u0001\u0000\u0000\u0000\u0014\u0116"+
		"\u0001\u0000\u0000\u0000\u0016\u011a\u0001\u0000\u0000\u0000\u0018\u0124"+
		"\u0001\u0000\u0000\u0000\u001a\u0129\u0001\u0000\u0000\u0000\u001c\u0143"+
		"\u0001\u0000\u0000\u0000\u001e\u0151\u0001\u0000\u0000\u0000 \u0164\u0001"+
		"\u0000\u0000\u0000\"\u0196\u0001\u0000\u0000\u0000$\u019b\u0001\u0000"+
		"\u0000\u0000&\u01a3\u0001\u0000\u0000\u0000(\u01b6\u0001\u0000\u0000\u0000"+
		"*\u01bd\u0001\u0000\u0000\u0000,\u01c3\u0001\u0000\u0000\u0000.\u01d7"+
		"\u0001\u0000\u0000\u00000\u01ee\u0001\u0000\u0000\u00002\u01f0\u0001\u0000"+
		"\u0000\u00004\u01ff\u0001\u0000\u0000\u00006\u0208\u0001\u0000\u0000\u0000"+
		"8\u020f\u0001\u0000\u0000\u0000:>\u0005\u0005\u0000\u0000;=\u0003\u0002"+
		"\u0001\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000"+
		"\u0000\u0000CO\u0005\u0005\u0000\u0000DO\u00030\u0018\u0000EO\u0003\n"+
		"\u0005\u0000FO\u0003\u000e\u0007\u0000GO\u0003\f\u0006\u0000HO\u0003\b"+
		"\u0004\u0000IO\u0003\u0004\u0002\u0000JO\u00032\u0019\u0000KO\u00034\u001a"+
		"\u0000LO\u0003.\u0017\u0000MO\u0003\u001a\r\u0000NC\u0001\u0000\u0000"+
		"\u0000ND\u0001\u0000\u0000\u0000NE\u0001\u0000\u0000\u0000NF\u0001\u0000"+
		"\u0000\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NI\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0003\u0001\u0000"+
		"\u0000\u0000PQ\u0005 \u0000\u0000QR\u0005\'\u0000\u0000RT\u0005\u0011"+
		"\u0000\u0000SU\u0003\u001a\r\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UW\u0001\u0000\u0000\u0000VX\u0003\u0006\u0003\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Zc\u0001\u0000\u0000\u0000[_\u0005!\u0000\u0000"+
		"\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0005\"\u0000\u0000c[\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0003"+
		"\u001a\r\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0005%\u0000\u0000ij\u0003\u001a\r\u0000j\u0005\u0001"+
		"\u0000\u0000\u0000km\u0005F\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pr\u00038\u001c\u0000ql\u0001\u0000\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000r~\u0001\u0000\u0000\u0000sz\u0005.\u0000\u0000"+
		"tv\u0005F\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000y{\u00038\u001c\u0000zu\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{}\u0001\u0000\u0000\u0000|s\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u00057\u0000\u0000\u0082\u0084\u0003\u001a\r\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u0002\u0001\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0005\"\u0000\u0000\u008c\u008e\u0003\u001a\r\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0007"+
		"\u0001\u0000\u0000\u0000\u008f\u0094\u0005\n\u0000\u0000\u0090\u0095\u0005"+
		"\'\u0000\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0003\u001e"+
		"\u000f\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000"+
		"\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u009b\u0005\f\u0000"+
		"\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\r\u0000\u0000"+
		"\u009f\u00a0\u0003\u001a\r\u0000\u00a0\t\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u000e\u0000\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3"+
		"\u00a4\u0003\u001a\r\u0000\u00a4\u00a8\u0005\u000f\u0000\u0000\u00a5\u00a7"+
		"\u0003\u0002\u0001\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00b7\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac\u00ad"+
		"\u0003\u001e\u000f\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00b2\u0005"+
		"\u000f\u0000\u0000\u00af\u00b1\u0003\u0002\u0001\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00c1\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00be\u0005"+
		"\u001e\u0000\u0000\u00bb\u00bd\u0003\u0002\u0001\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005\u0010\u0000\u0000\u00c4\u00c5\u0003"+
		"\u001a\r\u0000\u00c5\u000b\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\t"+
		"\u0000\u0000\u00c7\u00c8\u0003\u001e\u000f\u0000\u00c8\u00c9\u0003\u001a"+
		"\r\u0000\u00c9\u00cd\u0005\f\u0000\u0000\u00ca\u00cc\u0003\u0002\u0001"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1\u00d2\u0003\u001a\r\u0000"+
		"\u00d2\r\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000\u00d4"+
		"\u00d5\u0003\u0010\b\u0000\u00d5\u00d6\u0005\f\u0000\u0000\u00d6\u00da"+
		"\u0003\u001a\r\u0000\u00d7\u00d9\u0003\u0002\u0001\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0003"+
		"\u001a\r\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\r\u0000"+
		"\u0000\u00e1\u00e2\u0003\u001a\r\u0000\u00e2\u000f\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u00056\u0000\u0000\u00e4\u00e5\u00056\u0000\u0000\u00e5\u00e6"+
		"\u0005\b\u0000\u0000\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e7\u00e8\u0005"+
		"\b\u0000\u0000\u00e8\u00e9\u00057\u0000\u0000\u00e9\u00ea\u00057\u0000"+
		"\u0000\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ee\u0005F\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0011\u0000\u0000\u00f2\u00f3\u0003\u0012\t\u0000\u00f3\u00f4"+
		"\u0003\u001a\r\u0000\u00f4\u00ff\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005"+
		"F\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0011"+
		"\u0000\u0000\u00fb\u00fc\u0003\u0018\f\u0000\u00fc\u00fd\u0003\u001a\r"+
		"\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00e3\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ed\u0001\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000"+
		"\u0000\u00ff\u0011\u0001\u0000\u0000\u0000\u0100\u0102\u0003\u0014\n\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0106\u0005C\u0000\u0000\u0106"+
		"\u0108\u0003\u0014\n\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0114\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u00058\u0000\u0000\u010a\u010b\u0003\u0014\n\u0000\u010b\u010c\u0005"+
		"C\u0000\u0000\u010c\u010f\u0003\u0014\n\u0000\u010d\u010e\u0005C\u0000"+
		"\u0000\u010e\u0110\u0003\u0014\n\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u00059\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u0101\u0001\u0000\u0000\u0000\u0113\u0109\u0001\u0000\u0000\u0000\u0114"+
		"\u0013\u0001\u0000\u0000\u0000\u0115\u0117\u0007\u0000\u0000\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0003\u0016\u000b\u0000\u0119"+
		"\u0015\u0001\u0000\u0000\u0000\u011a\u0122\u0005E\u0000\u0000\u011b\u011f"+
		"\u0007\u0001\u0000\u0000\u011c\u011e\u0005H\u0000\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u011b\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0017\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005&\u0000\u0000\u0125\u0126\u00056\u0000"+
		"\u0000\u0126\u0127\u0003.\u0017\u0000\u0127\u0128\u00057\u0000\u0000\u0128"+
		"\u0019\u0001\u0000\u0000\u0000\u0129\u012a\u0007\u0002\u0000\u0000\u012a"+
		"\u001b\u0001\u0000\u0000\u0000\u012b\u012c\u00056\u0000\u0000\u012c\u012d"+
		"\u0003.\u0017\u0000\u012d\u012e\u00057\u0000\u0000\u012e\u0144\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u00058\u0000\u0000\u0130\u0131\u0003.\u0017\u0000"+
		"\u0131\u0132\u00059\u0000\u0000\u0132\u0144\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u00056\u0000\u0000\u0134\u0135\u00056\u0000\u0000\u0135\u0136\u0003"+
		"&\u0013\u0000\u0136\u0137\u00057\u0000\u0000\u0137\u0138\u00057\u0000"+
		"\u0000\u0138\u0144\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0012\u0000"+
		"\u0000\u013a\u013b\u0003&\u0013\u0000\u013b\u013c\u0005\u0013\u0000\u0000"+
		"\u013c\u0144\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000"+
		"\u013e\u013f\u0005\u0012\u0000\u0000\u013f\u0140\u0003&\u0013\u0000\u0140"+
		"\u0141\u0005\u0013\u0000\u0000\u0141\u0142\u0005\u0013\u0000\u0000\u0142"+
		"\u0144\u0001\u0000\u0000\u0000\u0143\u012b\u0001\u0000\u0000\u0000\u0143"+
		"\u012f\u0001\u0000\u0000\u0000\u0143\u0133\u0001\u0000\u0000\u0000\u0143"+
		"\u0139\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0144"+
		"\u001d\u0001\u0000\u0000\u0000\u0145\u0146\u0006\u000f\uffff\uffff\u0000"+
		"\u0146\u0147\u0005<\u0000\u0000\u0147\u0152\u0003\u001e\u000f\u0005\u0148"+
		"\u0149\u0005B\u0000\u0000\u0149\u0152\u0003&\u0013\u0000\u014a\u014b\u0005"+
		"6\u0000\u0000\u014b\u014c\u00056\u0000\u0000\u014c\u014d\u0003 \u0010"+
		"\u0000\u014d\u014e\u00057\u0000\u0000\u014e\u014f\u00057\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151"+
		"\u0145\u0001\u0000\u0000\u0000\u0151\u0148\u0001\u0000\u0000\u0000\u0151"+
		"\u014a\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0158\u0001\u0000\u0000\u0000\u0153\u0154\n\u0003\u0000\u0000\u0154\u0155"+
		"\u0007\u0003\u0000\u0000\u0155\u0157\u0003\u001e\u000f\u0004\u0156\u0153"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u001f"+
		"\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0003\"\u0011\u0000\u015c\u015d\u0007\u0003\u0000\u0000\u015d\u015e\u0003"+
		" \u0010\u0000\u015e\u0165\u0001\u0000\u0000\u0000\u015f\u0160\u00056\u0000"+
		"\u0000\u0160\u0161\u0003 \u0010\u0000\u0161\u0162\u00057\u0000\u0000\u0162"+
		"\u0165\u0001\u0000\u0000\u0000\u0163\u0165\u0003\"\u0011\u0000\u0164\u015b"+
		"\u0001\u0000\u0000\u0000\u0164\u015f\u0001\u0000\u0000\u0000\u0164\u0163"+
		"\u0001\u0000\u0000\u0000\u0165!\u0001\u0000\u0000\u0000\u0166\u0171\u0003"+
		"&\u0013\u0000\u0167\u0169\u0005\u0015\u0000\u0000\u0168\u016a\u0005\u0015"+
		"\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u0172\u0001\u0000\u0000\u0000\u016b\u0172\u0005:\u0000"+
		"\u0000\u016c\u016d\u0005:\u0000\u0000\u016d\u0172\u0005:\u0000\u0000\u016e"+
		"\u0172\u0005;\u0000\u0000\u016f\u0170\u0005;\u0000\u0000\u0170\u0172\u0005"+
		";\u0000\u0000\u0171\u0167\u0001\u0000\u0000\u0000\u0171\u016b\u0001\u0000"+
		"\u0000\u0000\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0003&\u0013\u0000\u0174\u0197\u0001\u0000\u0000"+
		"\u0000\u0175\u017c\u0003&\u0013\u0000\u0176\u0177\u0005;\u0000\u0000\u0177"+
		"\u017d\u0005\u0015\u0000\u0000\u0178\u0179\u0005:\u0000\u0000\u0179\u017d"+
		"\u0005\u0015\u0000\u0000\u017a\u017b\u0005<\u0000\u0000\u017b\u017d\u0005"+
		"\u0015\u0000\u0000\u017c\u0176\u0001\u0000\u0000\u0000\u017c\u0178\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0003&\u0013\u0000\u017f\u0197\u0001\u0000"+
		"\u0000\u0000\u0180\u0197\u0005*\u0000\u0000\u0181\u0186\u0003$\u0012\u0000"+
		"\u0182\u0183\u0005/\u0000\u0000\u0183\u0187\u0005/\u0000\u0000\u0184\u0185"+
		"\u00052\u0000\u0000\u0185\u0187\u00052\u0000\u0000\u0186\u0182\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0197\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005/\u0000\u0000\u0189\u018d\u0005/\u0000\u0000"+
		"\u018a\u018b\u00052\u0000\u0000\u018b\u018d\u00052\u0000\u0000\u018c\u0188"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u0197\u0003$\u0012\u0000\u018f\u0190\u0003"+
		"8\u001c\u0000\u0190\u0192\u0005\u0015\u0000\u0000\u0191\u0193\u0005\u0015"+
		"\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u00038\u001c"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0166\u0001\u0000\u0000"+
		"\u0000\u0196\u0175\u0001\u0000\u0000\u0000\u0196\u0180\u0001\u0000\u0000"+
		"\u0000\u0196\u0181\u0001\u0000\u0000\u0000\u0196\u018c\u0001\u0000\u0000"+
		"\u0000\u0196\u018f\u0001\u0000\u0000\u0000\u0197#\u0001\u0000\u0000\u0000"+
		"\u0198\u019c\u0005\'\u0000\u0000\u0199\u019c\u00036\u001b\u0000\u019a"+
		"\u019c\u0003\u0014\n\u0000\u019b\u0198\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c%\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0006\u0013\uffff\uffff\u0000\u019e\u019f"+
		"\u00056\u0000\u0000\u019f\u01a0\u0003&\u0013\u0000\u01a0\u01a1\u00057"+
		"\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003$\u0012"+
		"\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01b2\u0001\u0000\u0000\u0000\u01a5\u01ad\n\u0003\u0000\u0000"+
		"\u01a6\u01ae\u0005/\u0000\u0000\u01a7\u01ae\u00052\u0000\u0000\u01a8\u01ae"+
		"\u00050\u0000\u0000\u01a9\u01ae\u00053\u0000\u0000\u01aa\u01ae\u0005\u001b"+
		"\u0000\u0000\u01ab\u01ac\u00050\u0000\u0000\u01ac\u01ae\u00050\u0000\u0000"+
		"\u01ad\u01a6\u0001\u0000\u0000\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000"+
		"\u01ad\u01a8\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0003&\u0013\u0004\u01b0"+
		"\u01a5\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\'\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b7"+
		"\b\u0004\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9)\u0001\u0000\u0000\u0000\u01ba\u01be\u0005.\u0000"+
		"\u0000\u01bb\u01bc\u0005.\u0000\u0000\u01bc\u01be\u00055\u0000\u0000\u01bd"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"+\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005@\u0000\u0000\u01c0\u01c2\u0005"+
		"\u0002\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c7\u0005<\u0000\u0000\u01c6\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cd\u0003(\u0014\u0000\u01c9\u01cb\u0003*\u0015\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0003(\u0014\u0000\u01cd"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"-\u0001\u0000\u0000\u0000\u01d1\u01d3\u0007\u0002\u0000\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003,\u0016\u0000\u01d5\u01d6\u0007"+
		"\u0002\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da/\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0005F\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u00056\u0000\u0000\u01e1\u01e2\u00057\u0000\u0000\u01e2"+
		"\u01ef\u0003\u001c\u000e\u0000\u01e3\u01e5\u0005=\u0000\u0000\u01e4\u01e6"+
		"\u0005F\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		"6\u0000\u0000\u01ea\u01ec\u00057\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0003\u001c\u000e\u0000\u01ee\u01dc\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e3\u0001\u0000\u0000\u0000\u01ef1\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f2\u0005>\u0000\u0000\u01f1\u01f3\u0005F\u0000\u0000\u01f2\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0011\u0000\u0000\u01f7\u01f9"+
		"\u0003(\u0014\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"\u001a\r\u0000\u01fb\u01fc\u0005\f\u0000\u0000\u01fc\u01fd\u0003.\u0017"+
		"\u0000\u01fd\u01fe\u0005\r\u0000\u0000\u01fe3\u0001\u0000\u0000\u0000"+
		"\u01ff\u0203\u0005?\u0000\u0000\u0200\u0202\u0005F\u0000\u0000\u0201\u0200"+
		"\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206"+
		"\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0003(\u0014\u0000\u02075\u0001\u0000\u0000\u0000\u0208\u020c\u0005G"+
		"\u0000\u0000\u0209\u020b\u0005F\u0000\u0000\u020a\u0209\u0001\u0000\u0000"+
		"\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d7\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0213\u0005\u0007\u0000\u0000"+
		"\u0210\u0212\b\u0005\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215"+
		"\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0007\u0000\u0000\u0217"+
		"9\u0001\u0000\u0000\u0000D>NTY_cfnqwz~\u0083\u0088\u008d\u0094\u009b\u00a8"+
		"\u00b2\u00b7\u00be\u00c1\u00cd\u00da\u00de\u00ef\u00f8\u00fe\u0103\u0107"+
		"\u010f\u0113\u0116\u011f\u0122\u0143\u0151\u0158\u0164\u0169\u0171\u017c"+
		"\u0186\u018c\u0192\u0196\u019b\u01a3\u01ad\u01b2\u01b8\u01bd\u01c1\u01c3"+
		"\u01c6\u01ca\u01cf\u01d2\u01d9\u01de\u01e7\u01eb\u01ee\u01f4\u01f8\u0203"+
		"\u020c\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}