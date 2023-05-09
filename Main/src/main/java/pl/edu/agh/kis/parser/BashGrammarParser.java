// Generated from BashGrammar.g4 by ANTLR 4.12.0
package pl.edu.agh.kis.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_variable_or_number = 18, RULE_expr = 19, RULE_symbols = 20, RULE_argument = 21, 
		RULE_word = 22, RULE_pipe_symbol = 23, RULE_pipeline = 24, RULE_pipeline_list = 25, 
		RULE_function = 26, RULE_select = 27, RULE_coprocess = 28, RULE_id = 29, 
		RULE_string = 30, RULE_character_chain = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "case_statement", "single_case", "until_loop", 
			"if_statement", "while_loop", "for_loop", "for_loop_argument", "numbers_pipeline_list_for_loop", 
			"signed_number", "number_float", "variable_from_command", "splitter_end_command", 
			"block", "expr_maker", "d_round_expr_maker", "d_round_expr", "variable_or_number", 
			"expr", "symbols", "argument", "word", "pipe_symbol", "pipeline", "pipeline_list", 
			"function", "select", "coprocess", "id", "string", "character_chain"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'-p'", "' '", null, null, null, "'\"'", "';'", "'while'", 
			"'until'", "'for'", "'do'", "'done'", "'if'", "'then'", "'fi'", "'in'", 
			"'['", "']'", "'-eq'", "'='", null, "'-gt'", null, "'-lt'", null, "'%'", 
			"'&&'", "'||'", "'else'", "'elif'", "'case'", "'*)'", "';;'", "';&'", 
			"';;&'", "'esac'", "'$'", null, "'$#'", null, null, null, null, null, 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(COMMENT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
				{
				{
				setState(65);
				instruction();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				until_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				select();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				coprocess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				pipeline_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CASE_START);
			setState(87);
			match(VARIABLE);
			setState(88);
			match(LOOP_IN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(89);
				splitter_end_command();
				}
			}

			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				single_case();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APOSTROPHE || _la==ALPHANUMERIC );
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE_DEFAULT) {
				{
				setState(97);
				match(CASE_DEFAULT);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
					{
					{
					setState(98);
					instruction();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(BRAKE_ABSOLUTE);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(107);
				splitter_end_command();
				}
			}

			setState(110);
			match(CASE_END);
			setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitSingle_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_caseContext single_case() throws RecognitionException {
		Single_caseContext _localctx = new Single_caseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(ALPHANUMERIC);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				}
				break;
			case APOSTROPHE:
				{
				setState(118);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(121);
				match(PIPE);
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALPHANUMERIC:
					{
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(122);
						match(ALPHANUMERIC);
						}
						}
						setState(125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ALPHANUMERIC );
					}
					break;
				case APOSTROPHE:
					{
					setState(127);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(135);
			match(R_PARENTH_ROUND);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(136);
				splitter_end_command();
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
				{
				{
				setState(139);
				instruction();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(BRAKE_ABSOLUTE);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(146);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitUntil_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Until_loopContext until_loop() throws RecognitionException {
		Until_loopContext _localctx = new Until_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_until_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(UNTIL_LOOP_BEGIN);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(150);
				match(VARIABLE);
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(151);
				variable_from_command();
				setState(152);
				expr_maker(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			splitter_end_command();
			setState(157);
			match(LOOP_MIDDLE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
				{
				{
				setState(158);
				instruction();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(LOOP_END);
			setState(165);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IF_START);
			setState(168);
			expr_maker(0);
			setState(169);
			splitter_end_command();
			setState(170);
			match(IF_MIDDLE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
				{
				{
				setState(171);
				instruction();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(177);
				match(ELSE_IF);
				setState(178);
				expr_maker(0);
				setState(179);
				splitter_end_command();
				setState(180);
				match(IF_MIDDLE);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
					{
					{
					setState(181);
					instruction();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(192);
				match(ELSE);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
					{
					{
					setState(193);
					instruction();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(IF_END);
			setState(202);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WHILE_LOOP_BEGIN);
			setState(205);
			expr_maker(0);
			setState(206);
			splitter_end_command();
			setState(207);
			match(LOOP_MIDDLE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151760141155020832L) != 0) || _la==TIME || _la==ALPHANUMERIC) {
				{
				{
				setState(208);
				instruction();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(LOOP_END);
			setState(215);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
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
			setState(217);
			match(FOR_LOOP_BEGIN);
			setState(218);
			for_loop_argument();
			setState(219);
			match(LOOP_MIDDLE);
			setState(220);
			splitter_end_command();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					instruction();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(227);
				splitter_end_command();
				}
			}

			setState(230);
			match(LOOP_END);
			setState(231);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitFor_loop_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_argumentContext for_loop_argument() throws RecognitionException {
		For_loop_argumentContext _localctx = new For_loop_argumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop_argument);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(L_PARENTH_ROUND);
				setState(234);
				match(L_PARENTH_ROUND);
				setState(235);
				match(SINGLE_SEMICOLON);
				setState(236);
				expr_maker(0);
				setState(237);
				match(SINGLE_SEMICOLON);
				setState(238);
				match(R_PARENTH_ROUND);
				setState(239);
				match(R_PARENTH_ROUND);
				setState(240);
				splitter_end_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					match(ALPHANUMERIC);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(247);
				match(LOOP_IN);
				setState(248);
				numbers_pipeline_list_for_loop();
				setState(249);
				splitter_end_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(251);
					match(ALPHANUMERIC);
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(256);
				match(LOOP_IN);
				setState(257);
				variable_from_command();
				setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitNumbers_pipeline_list_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numbers_pipeline_list_for_loopContext numbers_pipeline_list_for_loop() throws RecognitionException {
		Numbers_pipeline_list_for_loopContext _localctx = new Numbers_pipeline_list_for_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numbers_pipeline_list_for_loop);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					signed_number();
					}
					}
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 4194313L) != 0) );
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(267);
					match(LAST_FOLDER);
					setState(268);
					signed_number();
					}
				}

				}
				break;
			case L_PARENTH_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(L_PARENTH_CURLY);
				setState(272);
				signed_number();
				setState(273);
				match(LAST_FOLDER);
				setState(274);
				signed_number();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(275);
					match(LAST_FOLDER);
					setState(276);
					signed_number();
					}
				}

				setState(279);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(283);
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

			setState(286);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitNumber_float(this);
			else return visitor.visitChildren(this);
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
			setState(288);
			match(NUMBER);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==THIS_FOLDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(DIGIT);
						}
						} 
					}
					setState(295);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitVariable_from_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_from_commandContext variable_from_command() throws RecognitionException {
		Variable_from_commandContext _localctx = new Variable_from_commandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_from_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DOLLAR_SIGN);
			setState(299);
			match(L_PARENTH_ROUND);
			setState(300);
			pipeline_list();
			setState(301);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitSplitter_end_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Splitter_end_commandContext splitter_end_command() throws RecognitionException {
		Splitter_end_commandContext _localctx = new Splitter_end_commandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_splitter_end_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(L_PARENTH_ROUND);
				setState(306);
				pipeline_list();
				setState(307);
				match(R_PARENTH_ROUND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(L_PARENTH_CURLY);
				setState(310);
				pipeline_list();
				setState(311);
				match(R_PARENTH_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(L_PARENTH_ROUND);
				setState(314);
				match(L_PARENTH_ROUND);
				setState(315);
				expr(0);
				setState(316);
				match(R_PARENTH_ROUND);
				setState(317);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(CONDITION_LEFT_SINGLE);
				setState(320);
				expr(0);
				setState(321);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(CONDITION_LEFT_SINGLE);
				setState(324);
				match(CONDITION_LEFT_SINGLE);
				setState(325);
				expr(0);
				setState(326);
				match(CONDITION_RIGHT_SINGLE);
				setState(327);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitExpr_maker(this);
			else return visitor.visitChildren(this);
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
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(332);
				match(BOOL_NEGATION);
				setState(333);
				expr_maker(5);
				}
				break;
			case 2:
				{
				setState(334);
				match(TILDA);
				setState(335);
				expr(0);
				}
				break;
			case 3:
				{
				setState(336);
				match(L_PARENTH_ROUND);
				setState(337);
				match(L_PARENTH_ROUND);
				setState(338);
				d_round_expr_maker();
				setState(339);
				match(R_PARENTH_ROUND);
				setState(340);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
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
					setState(345);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(346);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077568804225024L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(347);
					expr_maker(4);
					}
					} 
				}
				setState(352);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitD_round_expr_maker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_round_expr_makerContext d_round_expr_maker() throws RecognitionException {
		D_round_expr_makerContext _localctx = new D_round_expr_makerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_d_round_expr_maker);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				d_round_expr();
				setState(354);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077568804225024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				d_round_expr_maker();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(L_PARENTH_ROUND);
				setState(358);
				d_round_expr_maker();
				setState(359);
				match(R_PARENTH_ROUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitD_round_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_round_exprContext d_round_expr() throws RecognitionException {
		D_round_exprContext _localctx = new D_round_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_d_round_expr);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				expr(0);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(365);
					match(EQ);
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(366);
						match(EQ);
						}
					}

					}
					break;
				case 2:
					{
					setState(369);
					match(POINTER_RIGHT);
					}
					break;
				case 3:
					{
					setState(370);
					match(POINTER_RIGHT);
					setState(371);
					match(POINTER_RIGHT);
					}
					break;
				case 4:
					{
					setState(372);
					match(POINTER_LEFT);
					}
					break;
				case 5:
					{
					setState(373);
					match(POINTER_LEFT);
					setState(374);
					match(POINTER_LEFT);
					}
					break;
				}
				setState(377);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				expr(0);
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POINTER_LEFT:
					{
					setState(380);
					match(POINTER_LEFT);
					setState(381);
					match(EQ);
					}
					break;
				case POINTER_RIGHT:
					{
					setState(382);
					match(POINTER_RIGHT);
					setState(383);
					match(EQ);
					}
					break;
				case BOOL_NEGATION:
					{
					setState(384);
					match(BOOL_NEGATION);
					setState(385);
					match(EQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(388);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				variable_or_number();
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
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(398);
					match(PLUS);
					setState(399);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(400);
					match(MINUS);
					setState(401);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404);
				variable_or_number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				string();
				setState(406);
				match(EQ);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(407);
					match(EQ);
					}
				}

				setState(410);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitVariable_or_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_or_numberContext variable_or_number() throws RecognitionException {
		Variable_or_numberContext _localctx = new Variable_or_numberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable_or_number);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(VARIABLE);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				id();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				{
				setState(420);
				match(L_PARENTH_ROUND);
				setState(421);
				expr(0);
				setState(422);
				match(R_PARENTH_ROUND);
				}
				break;
			case VARIABLE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case ALPHA:
				{
				setState(424);
				variable_or_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
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
					setState(427);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(428);
						match(PLUS);
						}
						break;
					case 2:
						{
						setState(429);
						match(MINUS);
						}
						break;
					case 3:
						{
						setState(430);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					case 4:
						{
						setState(431);
						match(DIVIDE);
						}
						break;
					case 5:
						{
						setState(432);
						match(MODULO);
						}
						break;
					case 6:
						{
						setState(433);
						match(WILDCARD_OR_MULTIPLY);
						setState(434);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					}
					setState(437);
					expr(4);
					}
					} 
				}
				setState(442);
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
	public static class SymbolsContext extends ParserRuleContext {
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_symbols);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(443);
					match(ALPHANUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
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
	public static class ArgumentContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(BashGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BashGrammarParser.MINUS, i);
		}
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(BashGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(BashGrammarParser.ALPHANUMERIC, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(448);
				match(MINUS);
				}
				break;
			case 2:
				{
				{
				setState(449);
				match(MINUS);
				setState(450);
				match(MINUS);
				}
				}
				break;
			}
			setState(454); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(453);
					match(ALPHANUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
	public static class WordContext extends ParserRuleContext {
		public List<SymbolsContext> symbols() {
			return getRuleContexts(SymbolsContext.class);
		}
		public SymbolsContext symbols(int i) {
			return getRuleContext(SymbolsContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<Character_chainContext> character_chain() {
			return getRuleContexts(Character_chainContext.class);
		}
		public Character_chainContext character_chain(int i) {
			return getRuleContext(Character_chainContext.class,i);
		}
		public List<Variable_from_commandContext> variable_from_command() {
			return getRuleContexts(Variable_from_commandContext.class);
		}
		public Variable_from_commandContext variable_from_command(int i) {
			return getRuleContext(Variable_from_commandContext.class,i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(463);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALPHANUMERIC:
						{
						setState(458);
						symbols();
						}
						break;
					case APOSTROPHE:
						{
						setState(459);
						string();
						}
						break;
					case SINGLE_APOSTROPHE:
						{
						setState(460);
						character_chain();
						}
						break;
					case DOLLAR_SIGN:
						{
						setState(461);
						variable_from_command();
						}
						break;
					case MINUS:
						{
						setState(462);
						argument();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(465); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitPipe_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pipe_symbolContext pipe_symbol() throws RecognitionException {
		Pipe_symbolContext _localctx = new Pipe_symbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pipe_symbol);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(PIPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(PIPE);
				setState(469);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitPipeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(472);
				match(TIME);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(473);
					match(T__1);
					}
				}

				}
			}

			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL_NEGATION) {
				{
				setState(478);
				match(BOOL_NEGATION);
				}
			}

			setState(481);
			word();
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIPE) {
					{
					setState(482);
					pipe_symbol();
					}
				}

				setState(485);
				word();
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1196543528927424L) != 0) || _la==ALPHANUMERIC );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitPipeline_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pipeline_listContext pipeline_list() throws RecognitionException {
		Pipeline_listContext _localctx = new Pipeline_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pipeline_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(490);
					pipeline();
					setState(491);
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
				setState(495); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
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
				setState(502);
				match(L_PARENTH_ROUND);
				setState(503);
				match(R_PARENTH_ROUND);
				setState(504);
				block();
				}
				break;
			case FUNCTION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(FUNCTION_START);
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(506);
					match(ALPHANUMERIC);
					}
					}
					setState(509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(511);
					match(L_PARENTH_ROUND);
					setState(512);
					match(R_PARENTH_ROUND);
					}
					break;
				}
				setState(515);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(SELECT);
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				match(ALPHANUMERIC);
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP_IN) {
				{
				setState(524);
				match(LOOP_IN);
				setState(525);
				word();
				}
			}

			setState(528);
			splitter_end_command();
			setState(529);
			match(LOOP_MIDDLE);
			setState(530);
			pipeline_list();
			setState(531);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitCoprocess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoprocessContext coprocess() throws RecognitionException {
		CoprocessContext _localctx = new CoprocessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_coprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(COPROCESS_START);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(540);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(ALPHA);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(APOSTROPHE);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -130L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) {
				{
				{
				setState(550);
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
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Character_chainContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_APOSTROPHE() { return getTokens(BashGrammarParser.SINGLE_APOSTROPHE); }
		public TerminalNode SINGLE_APOSTROPHE(int i) {
			return getToken(BashGrammarParser.SINGLE_APOSTROPHE, i);
		}
		public Character_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterCharacter_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitCharacter_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitCharacter_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_chainContext character_chain() throws RecognitionException {
		Character_chainContext _localctx = new Character_chainContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_character_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(SINGLE_APOSTROPHE);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -66L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) {
				{
				{
				setState(559);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SINGLE_APOSTROPHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(SINGLE_APOSTROPHE);
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
		"\u0004\u0001H\u0238\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000C\b\u0000"+
		"\n\u0000\f\u0000F\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0002"+
		"\u0004\u0002^\b\u0002\u000b\u0002\f\u0002_\u0001\u0002\u0001\u0002\u0005"+
		"\u0002d\b\u0002\n\u0002\f\u0002g\t\u0002\u0001\u0002\u0003\u0002j\b\u0002"+
		"\u0001\u0002\u0003\u0002m\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003s\b\u0003\u000b\u0003\f\u0003t\u0001\u0003\u0003"+
		"\u0003x\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003|\b\u0003\u000b\u0003"+
		"\f\u0003}\u0001\u0003\u0003\u0003\u0081\b\u0003\u0005\u0003\u0083\b\u0003"+
		"\n\u0003\f\u0003\u0086\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008a"+
		"\b\u0003\u0001\u0003\u0005\u0003\u008d\b\u0003\n\u0003\f\u0003\u0090\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009b\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a0\b\u0004\n\u0004\f\u0004"+
		"\u00a3\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ad\b\u0005\n\u0005"+
		"\f\u0005\u00b0\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00b7\b\u0005\n\u0005\f\u0005\u00ba\t\u0005\u0005"+
		"\u0005\u00bc\b\u0005\n\u0005\f\u0005\u00bf\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00c3\b\u0005\n\u0005\f\u0005\u00c6\t\u0005\u0003\u0005\u00c8"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d2\b\u0006\n\u0006\f\u0006"+
		"\u00d5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00df\b\u0007\n\u0007"+
		"\f\u0007\u00e2\t\u0007\u0001\u0007\u0003\u0007\u00e5\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00f4\b\b\u000b\b\f\b\u00f5"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00fd\b\b\u000b\b\f\b"+
		"\u00fe\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0105\b\b\u0001\t\u0004"+
		"\t\u0108\b\t\u000b\t\f\t\u0109\u0001\t\u0001\t\u0003\t\u010e\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0116\b\t\u0001\t\u0001"+
		"\t\u0003\t\u011a\b\t\u0001\n\u0003\n\u011d\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0124\b\u000b\n\u000b\f\u000b\u0127"+
		"\t\u000b\u0003\u000b\u0129\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u014a\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0158\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u015d\b\u000f\n\u000f\f\u000f"+
		"\u0160\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u016b\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0170\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0178\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0183\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u018d\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0193\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0199\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u019d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01a2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01aa\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01b4\b\u0013\u0001\u0013\u0005\u0013\u01b7\b\u0013\n\u0013\f\u0013\u01ba"+
		"\t\u0013\u0001\u0014\u0004\u0014\u01bd\b\u0014\u000b\u0014\f\u0014\u01be"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01c4\b\u0015\u0001\u0015"+
		"\u0004\u0015\u01c7\b\u0015\u000b\u0015\f\u0015\u01c8\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u01d0\b\u0016\u000b"+
		"\u0016\f\u0016\u01d1\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d7"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u01db\b\u0018\u0003\u0018"+
		"\u01dd\b\u0018\u0001\u0018\u0003\u0018\u01e0\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01e4\b\u0018\u0001\u0018\u0004\u0018\u01e7\b\u0018"+
		"\u000b\u0018\f\u0018\u01e8\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019"+
		"\u01ee\b\u0019\u000b\u0019\f\u0019\u01ef\u0001\u001a\u0004\u001a\u01f3"+
		"\b\u001a\u000b\u001a\f\u001a\u01f4\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0004\u001a\u01fc\b\u001a\u000b\u001a\f\u001a"+
		"\u01fd\u0001\u001a\u0001\u001a\u0003\u001a\u0202\b\u001a\u0001\u001a\u0003"+
		"\u001a\u0205\b\u001a\u0001\u001b\u0001\u001b\u0004\u001b\u0209\b\u001b"+
		"\u000b\u001b\f\u001b\u020a\u0001\u001b\u0001\u001b\u0003\u001b\u020f\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0218\b\u001c\n\u001c\f\u001c\u021b\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u0221\b\u001d"+
		"\n\u001d\f\u001d\u0224\t\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0228"+
		"\b\u001e\n\u001e\f\u001e\u022b\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0231\b\u001f\n\u001f\f\u001f\u0234\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0000\u0002\u001e& \u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>\u0000\u0006\u0002\u0000//22\u0002\u0000\u0001\u0001DD\u0002\u0000"+
		"\b\b--\u0003\u0000\u001c\u001d..55\u0001\u0000\u0007\u0007\u0001\u0000"+
		"\u0006\u0006\u027f\u0000@\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000"+
		"\u0000\u0004V\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\b"+
		"\u0095\u0001\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00cc"+
		"\u0001\u0000\u0000\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u0104"+
		"\u0001\u0000\u0000\u0000\u0012\u0119\u0001\u0000\u0000\u0000\u0014\u011c"+
		"\u0001\u0000\u0000\u0000\u0016\u0120\u0001\u0000\u0000\u0000\u0018\u012a"+
		"\u0001\u0000\u0000\u0000\u001a\u012f\u0001\u0000\u0000\u0000\u001c\u0149"+
		"\u0001\u0000\u0000\u0000\u001e\u0157\u0001\u0000\u0000\u0000 \u016a\u0001"+
		"\u0000\u0000\u0000\"\u019c\u0001\u0000\u0000\u0000$\u01a1\u0001\u0000"+
		"\u0000\u0000&\u01a9\u0001\u0000\u0000\u0000(\u01bc\u0001\u0000\u0000\u0000"+
		"*\u01c3\u0001\u0000\u0000\u0000,\u01cf\u0001\u0000\u0000\u0000.\u01d6"+
		"\u0001\u0000\u0000\u00000\u01dc\u0001\u0000\u0000\u00002\u01ed\u0001\u0000"+
		"\u0000\u00004\u0204\u0001\u0000\u0000\u00006\u0206\u0001\u0000\u0000\u0000"+
		"8\u0215\u0001\u0000\u0000\u0000:\u021e\u0001\u0000\u0000\u0000<\u0225"+
		"\u0001\u0000\u0000\u0000>\u022e\u0001\u0000\u0000\u0000@D\u0005\u0005"+
		"\u0000\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0000\u0000"+
		"\u0001H\u0001\u0001\u0000\u0000\u0000IU\u0005\u0005\u0000\u0000JU\u0003"+
		"4\u001a\u0000KU\u0003\n\u0005\u0000LU\u0003\u000e\u0007\u0000MU\u0003"+
		"\f\u0006\u0000NU\u0003\b\u0004\u0000OU\u0003\u0004\u0002\u0000PU\u0003"+
		"6\u001b\u0000QU\u00038\u001c\u0000RU\u00032\u0019\u0000SU\u0003\u001a"+
		"\r\u0000TI\u0001\u0000\u0000\u0000TJ\u0001\u0000\u0000\u0000TK\u0001\u0000"+
		"\u0000\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0005 \u0000\u0000WX\u0005\'\u0000"+
		"\u0000XZ\u0005\u0011\u0000\u0000Y[\u0003\u001a\r\u0000ZY\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0003\u0006"+
		"\u0003\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`i\u0001\u0000\u0000\u0000"+
		"ae\u0005!\u0000\u0000bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0005\"\u0000"+
		"\u0000ia\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000km\u0003\u001a\r\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005%\u0000\u0000op\u0003\u001a"+
		"\r\u0000p\u0005\u0001\u0000\u0000\u0000qs\u0005F\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vx\u0003<\u001e\u0000wr\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0084\u0001\u0000\u0000"+
		"\u0000y\u0080\u0005.\u0000\u0000z|\u0005F\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0003<\u001e\u0000"+
		"\u0080{\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u00057\u0000\u0000\u0088\u008a\u0003"+
		"\u001a\r\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008e\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u0002"+
		"\u0001\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0005\"\u0000\u0000\u0092\u0094\u0003\u001a\r"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0007\u0001\u0000\u0000\u0000\u0095\u009a\u0005\n\u0000\u0000"+
		"\u0096\u009b\u0005\'\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098"+
		"\u0099\u0003\u001e\u000f\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a"+
		"\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u001a\r\u0000\u009d\u00a1"+
		"\u0005\f\u0000\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"\r\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\t\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8\u00a9\u0003\u001e\u000f"+
		"\u0000\u00a9\u00aa\u0003\u001a\r\u0000\u00aa\u00ae\u0005\u000f\u0000\u0000"+
		"\u00ab\u00ad\u0003\u0002\u0001\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00bd\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001f\u0000\u0000"+
		"\u00b2\u00b3\u0003\u001e\u000f\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4"+
		"\u00b8\u0005\u000f\u0000\u0000\u00b5\u00b7\u0003\u0002\u0001\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b1\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c7\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c4\u0005\u001e\u0000\u0000\u00c1\u00c3\u0003\u0002\u0001\u0000\u00c2"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca"+
		"\u00cb\u0003\u001a\r\u0000\u00cb\u000b\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\t\u0000\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce\u00cf\u0003"+
		"\u001a\r\u0000\u00cf\u00d3\u0005\f\u0000\u0000\u00d0\u00d2\u0003\u0002"+
		"\u0001\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005\r\u0000\u0000\u00d7\u00d8\u0003\u001a\r"+
		"\u0000\u00d8\r\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000b\u0000\u0000"+
		"\u00da\u00db\u0003\u0010\b\u0000\u00db\u00dc\u0005\f\u0000\u0000\u00dc"+
		"\u00e0\u0003\u001a\r\u0000\u00dd\u00df\u0003\u0002\u0001\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0003\u001a\r\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\r\u0000\u0000\u00e7\u00e8\u0003\u001a\r\u0000\u00e8\u000f\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u00056\u0000\u0000\u00ea\u00eb\u00056\u0000\u0000"+
		"\u00eb\u00ec\u0005\b\u0000\u0000\u00ec\u00ed\u0003\u001e\u000f\u0000\u00ed"+
		"\u00ee\u0005\b\u0000\u0000\u00ee\u00ef\u00057\u0000\u0000\u00ef\u00f0"+
		"\u00057\u0000\u0000\u00f0\u00f1\u0003\u001a\r\u0000\u00f1\u0105\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f4\u0005F\u0000\u0000\u00f3\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00f9\u0003\u0012"+
		"\t\u0000\u00f9\u00fa\u0003\u001a\r\u0000\u00fa\u0105\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0005F\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\u0011\u0000\u0000\u0101\u0102\u0003\u0018\f\u0000\u0102"+
		"\u0103\u0003\u001a\r\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00e9"+
		"\u0001\u0000\u0000\u0000\u0104\u00f3\u0001\u0000\u0000\u0000\u0104\u00fc"+
		"\u0001\u0000\u0000\u0000\u0105\u0011\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0003\u0014\n\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"C\u0000\u0000\u010c\u010e\u0003\u0014\n\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u011a\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u00058\u0000\u0000\u0110\u0111\u0003\u0014\n"+
		"\u0000\u0111\u0112\u0005C\u0000\u0000\u0112\u0115\u0003\u0014\n\u0000"+
		"\u0113\u0114\u0005C\u0000\u0000\u0114\u0116\u0003\u0014\n\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u00059\u0000\u0000\u0118\u011a"+
		"\u0001\u0000\u0000\u0000\u0119\u0107\u0001\u0000\u0000\u0000\u0119\u010f"+
		"\u0001\u0000\u0000\u0000\u011a\u0013\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0007\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0003\u0016\u000b\u0000\u011f\u0015\u0001\u0000\u0000\u0000\u0120\u0128"+
		"\u0005E\u0000\u0000\u0121\u0125\u0007\u0001\u0000\u0000\u0122\u0124\u0005"+
		"H\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u0121\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u0017\u0001\u0000\u0000\u0000\u012a\u012b\u0005&\u0000"+
		"\u0000\u012b\u012c\u00056\u0000\u0000\u012c\u012d\u00032\u0019\u0000\u012d"+
		"\u012e\u00057\u0000\u0000\u012e\u0019\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0007\u0002\u0000\u0000\u0130\u001b\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u00056\u0000\u0000\u0132\u0133\u00032\u0019\u0000\u0133\u0134\u00057"+
		"\u0000\u0000\u0134\u014a\u0001\u0000\u0000\u0000\u0135\u0136\u00058\u0000"+
		"\u0000\u0136\u0137\u00032\u0019\u0000\u0137\u0138\u00059\u0000\u0000\u0138"+
		"\u014a\u0001\u0000\u0000\u0000\u0139\u013a\u00056\u0000\u0000\u013a\u013b"+
		"\u00056\u0000\u0000\u013b\u013c\u0003&\u0013\u0000\u013c\u013d\u00057"+
		"\u0000\u0000\u013d\u013e\u00057\u0000\u0000\u013e\u014a\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u0012\u0000\u0000\u0140\u0141\u0003&\u0013\u0000"+
		"\u0141\u0142\u0005\u0013\u0000\u0000\u0142\u014a\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005\u0012\u0000\u0000\u0144\u0145\u0005\u0012\u0000\u0000"+
		"\u0145\u0146\u0003&\u0013\u0000\u0146\u0147\u0005\u0013\u0000\u0000\u0147"+
		"\u0148\u0005\u0013\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0131\u0001\u0000\u0000\u0000\u0149\u0135\u0001\u0000\u0000\u0000\u0149"+
		"\u0139\u0001\u0000\u0000\u0000\u0149\u013f\u0001\u0000\u0000\u0000\u0149"+
		"\u0143\u0001\u0000\u0000\u0000\u014a\u001d\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0006\u000f\uffff\uffff\u0000\u014c\u014d\u0005<\u0000\u0000\u014d"+
		"\u0158\u0003\u001e\u000f\u0005\u014e\u014f\u0005B\u0000\u0000\u014f\u0158"+
		"\u0003&\u0013\u0000\u0150\u0151\u00056\u0000\u0000\u0151\u0152\u00056"+
		"\u0000\u0000\u0152\u0153\u0003 \u0010\u0000\u0153\u0154\u00057\u0000\u0000"+
		"\u0154\u0155\u00057\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u014b\u0001\u0000\u0000\u0000\u0157"+
		"\u014e\u0001\u0000\u0000\u0000\u0157\u0150\u0001\u0000\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u015e\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\n\u0003\u0000\u0000\u015a\u015b\u0007\u0003\u0000\u0000\u015b\u015d"+
		"\u0003\u001e\u000f\u0004\u015c\u0159\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u001f\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0003\"\u0011\u0000\u0162\u0163\u0007"+
		"\u0003\u0000\u0000\u0163\u0164\u0003 \u0010\u0000\u0164\u016b\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u00056\u0000\u0000\u0166\u0167\u0003 \u0010\u0000"+
		"\u0167\u0168\u00057\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u016b\u0003\"\u0011\u0000\u016a\u0161\u0001\u0000\u0000\u0000\u016a\u0165"+
		"\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b!\u0001"+
		"\u0000\u0000\u0000\u016c\u0177\u0003&\u0013\u0000\u016d\u016f\u0005\u0015"+
		"\u0000\u0000\u016e\u0170\u0005\u0015\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0178\u0001\u0000"+
		"\u0000\u0000\u0171\u0178\u0005:\u0000\u0000\u0172\u0173\u0005:\u0000\u0000"+
		"\u0173\u0178\u0005:\u0000\u0000\u0174\u0178\u0005;\u0000\u0000\u0175\u0176"+
		"\u0005;\u0000\u0000\u0176\u0178\u0005;\u0000\u0000\u0177\u016d\u0001\u0000"+
		"\u0000\u0000\u0177\u0171\u0001\u0000\u0000\u0000\u0177\u0172\u0001\u0000"+
		"\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0003&\u0013"+
		"\u0000\u017a\u019d\u0001\u0000\u0000\u0000\u017b\u0182\u0003&\u0013\u0000"+
		"\u017c\u017d\u0005;\u0000\u0000\u017d\u0183\u0005\u0015\u0000\u0000\u017e"+
		"\u017f\u0005:\u0000\u0000\u017f\u0183\u0005\u0015\u0000\u0000\u0180\u0181"+
		"\u0005<\u0000\u0000\u0181\u0183\u0005\u0015\u0000\u0000\u0182\u017c\u0001"+
		"\u0000\u0000\u0000\u0182\u017e\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0003"+
		"&\u0013\u0000\u0185\u019d\u0001\u0000\u0000\u0000\u0186\u019d\u0005*\u0000"+
		"\u0000\u0187\u018c\u0003$\u0012\u0000\u0188\u0189\u0005/\u0000\u0000\u0189"+
		"\u018d\u0005/\u0000\u0000\u018a\u018b\u00052\u0000\u0000\u018b\u018d\u0005"+
		"2\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u019d\u0001\u0000\u0000\u0000\u018e\u018f\u0005/\u0000"+
		"\u0000\u018f\u0193\u0005/\u0000\u0000\u0190\u0191\u00052\u0000\u0000\u0191"+
		"\u0193\u00052\u0000\u0000\u0192\u018e\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u019d"+
		"\u0003$\u0012\u0000\u0195\u0196\u0003<\u001e\u0000\u0196\u0198\u0005\u0015"+
		"\u0000\u0000\u0197\u0199\u0005\u0015\u0000\u0000\u0198\u0197\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0003<\u001e\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u016c\u0001\u0000\u0000\u0000\u019c\u017b\u0001\u0000\u0000"+
		"\u0000\u019c\u0186\u0001\u0000\u0000\u0000\u019c\u0187\u0001\u0000\u0000"+
		"\u0000\u019c\u0192\u0001\u0000\u0000\u0000\u019c\u0195\u0001\u0000\u0000"+
		"\u0000\u019d#\u0001\u0000\u0000\u0000\u019e\u01a2\u0005\'\u0000\u0000"+
		"\u019f\u01a2\u0003:\u001d\u0000\u01a0\u01a2\u0003\u0014\n\u0000\u01a1"+
		"\u019e\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2%\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0006\u0013\uffff\uffff\u0000\u01a4\u01a5\u00056\u0000\u0000\u01a5\u01a6"+
		"\u0003&\u0013\u0000\u01a6\u01a7\u00057\u0000\u0000\u01a7\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0003$\u0012\u0000\u01a9\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01b3\n\u0003\u0000\u0000\u01ac\u01b4\u0005/\u0000\u0000"+
		"\u01ad\u01b4\u00052\u0000\u0000\u01ae\u01b4\u00050\u0000\u0000\u01af\u01b4"+
		"\u00053\u0000\u0000\u01b0\u01b4\u0005\u001b\u0000\u0000\u01b1\u01b2\u0005"+
		"0\u0000\u0000\u01b2\u01b4\u00050\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000"+
		"\u0000\u01b3\u01ad\u0001\u0000\u0000\u0000\u01b3\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b7\u0003&\u0013\u0004\u01b6\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\'\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bd\u0005F\u0000\u0000\u01bc\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf)\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c4\u00052\u0000\u0000\u01c1\u01c2\u00052\u0000"+
		"\u0000\u01c2\u01c4\u00052\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c7\u0005F\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c9+\u0001\u0000\u0000\u0000\u01ca\u01d0"+
		"\u0003(\u0014\u0000\u01cb\u01d0\u0003<\u001e\u0000\u01cc\u01d0\u0003>"+
		"\u001f\u0000\u01cd\u01d0\u0003\u0018\f\u0000\u01ce\u01d0\u0003*\u0015"+
		"\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2-\u0001\u0000\u0000\u0000\u01d3\u01d7\u0005.\u0000\u0000\u01d4"+
		"\u01d5\u0005.\u0000\u0000\u01d5\u01d7\u00055\u0000\u0000\u01d6\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7/\u0001\u0000"+
		"\u0000\u0000\u01d8\u01da\u0005@\u0000\u0000\u01d9\u01db\u0005\u0002\u0000"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01e0\u0005<\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e6\u0003,\u0016\u0000\u01e2\u01e4\u0003.\u0017\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e7\u0003,\u0016\u0000\u01e6\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e91\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u00030\u0018\u0000\u01eb\u01ec\u0007\u0002\u0000"+
		"\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f03\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0005F\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u00056\u0000\u0000\u01f7\u01f8\u00057\u0000\u0000\u01f8\u0205\u0003"+
		"\u001c\u000e\u0000\u01f9\u01fb\u0005=\u0000\u0000\u01fa\u01fc\u0005F\u0000"+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u0200\u00056\u0000\u0000"+
		"\u0200\u0202\u00057\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0205\u0003\u001c\u000e\u0000\u0204\u01f2\u0001\u0000\u0000\u0000\u0204"+
		"\u01f9\u0001\u0000\u0000\u0000\u02055\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0005>\u0000\u0000\u0207\u0209\u0005F\u0000\u0000\u0208\u0207\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005\u0011\u0000\u0000\u020d\u020f\u0003,\u0016"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0003\u001a\r\u0000"+
		"\u0211\u0212\u0005\f\u0000\u0000\u0212\u0213\u00032\u0019\u0000\u0213"+
		"\u0214\u0005\r\u0000\u0000\u02147\u0001\u0000\u0000\u0000\u0215\u0219"+
		"\u0005?\u0000\u0000\u0216\u0218\u0005F\u0000\u0000\u0217\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0001\u0000"+
		"\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021d\u0003,\u0016"+
		"\u0000\u021d9\u0001\u0000\u0000\u0000\u021e\u0222\u0005G\u0000\u0000\u021f"+
		"\u0221\u0005F\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0224"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0001\u0000\u0000\u0000\u0223;\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0225\u0229\u0005\u0007\u0000\u0000\u0226\u0228\b\u0004"+
		"\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u022b\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000"+
		"\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0005\u0007\u0000\u0000\u022d=\u0001\u0000\u0000"+
		"\u0000\u022e\u0232\u0005\u0006\u0000\u0000\u022f\u0231\b\u0005\u0000\u0000"+
		"\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000"+
		"\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0005\u0006\u0000\u0000\u0236?\u0001\u0000\u0000\u0000HD"+
		"TZ_eiltw}\u0080\u0084\u0089\u008e\u0093\u009a\u00a1\u00ae\u00b8\u00bd"+
		"\u00c4\u00c7\u00d3\u00e0\u00e4\u00f5\u00fe\u0104\u0109\u010d\u0115\u0119"+
		"\u011c\u0125\u0128\u0149\u0157\u015e\u016a\u016f\u0177\u0182\u018c\u0192"+
		"\u0198\u019c\u01a1\u01a9\u01b3\u01b8\u01be\u01c3\u01c8\u01cf\u01d1\u01d6"+
		"\u01da\u01dc\u01df\u01e3\u01e8\u01ef\u01f4\u01fd\u0201\u0204\u020a\u020e"+
		"\u0219\u0222\u0229\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}