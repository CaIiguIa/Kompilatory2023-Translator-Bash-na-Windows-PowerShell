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
		T__0=1, STRING=2, CHARACTER_CHAIN=3, COMMENT=4, SINGLE_APOSTROPHE=5, APOSTROPHE=6, 
		SINGLE_SEMICOLON=7, WHILE_LOOP_BEGIN=8, UNTIL_LOOP_BEGIN=9, FOR_LOOP_BEGIN=10, 
		LOOP_MIDDLE=11, LOOP_END=12, IF_START=13, IF_MIDDLE=14, IF_END=15, LOOP_IN=16, 
		CONDITION_LEFT_SINGLE=17, CONDITION_RIGHT_SINGLE=18, CONDITION_EQ=19, 
		EQ=20, CONDITION_NEQ=21, CONDITION_GT=22, CONDITION_GE=23, CONDITION_LT=24, 
		CONDITION_LE=25, MODULO=26, CONDITION_DOUBLE_AMPERSAND=27, CONDITION_DOUBLE_PIPE=28, 
		ELSE=29, ELSE_IF=30, CASE_START=31, CASE_DEFAULT=32, BRAKE_ABSOLUTE=33, 
		BRAKE_CONTINUATION=34, BRAKE_WITH_NEXT_EXEC=35, CASE_END=36, DOLLAR_SIGN=37, 
		VARIABLE=38, SCRIPT_ARGUMENT_NUMBER=39, SCRIPT_ARGUMENT=40, BOOL=41, HEX_NUMBER_WITHOUT_SIGN=42, 
		OCTAL_NUMBER_WITHOUT_SIGN=43, NEW_LINE=44, PIPE=45, PLUS=46, WILDCARD_OR_MULTIPLY=47, 
		WILDCARD=48, MINUS=49, DIVIDE=50, LEFT_SLASH=51, AMPERSAN=52, L_PARENTH_ROUND=53, 
		R_PARENTH_ROUND=54, L_PARENTH_CURLY=55, R_PARENTH_CURLY=56, POINTER_RIGHT=57, 
		POINTER_LEFT=58, BOOL_NEGATION=59, FUNCTION_START=60, SELECT=61, COPROCESS_START=62, 
		TIME=63, CREATE_VARABLE=64, TILDA=65, LAST_FOLDER=66, THIS_FOLDER=67, 
		NUMBER=68, ALPHA=69, NUMERIC=70, MINUSP=71, SPACE=72, TAB=73;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_assign = 2, RULE_var = 3, 
		RULE_case_statement = 4, RULE_single_case = 5, RULE_until_loop = 6, RULE_if_statement = 7, 
		RULE_while_loop = 8, RULE_for_loop = 9, RULE_for_loop_argument = 10, RULE_numbers_pipeline_list_for_loop = 11, 
		RULE_signed_number = 12, RULE_number_float = 13, RULE_variable_from_command = 14, 
		RULE_splitter_end_command = 15, RULE_block = 16, RULE_expr_maker = 17, 
		RULE_d_round_expr_maker = 18, RULE_d_round_expr = 19, RULE_variable_or_number = 20, 
		RULE_expr = 21, RULE_symbols = 22, RULE_argument = 23, RULE_word = 24, 
		RULE_command = 25, RULE_pipe_symbol = 26, RULE_pipeline = 27, RULE_pipeline_list = 28, 
		RULE_function = 29, RULE_select = 30, RULE_coprocess = 31, RULE_alphanumeric = 32, 
		RULE_id = 33, RULE_string = 34, RULE_character_chain = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "assign", "var", "case_statement", "single_case", 
			"until_loop", "if_statement", "while_loop", "for_loop", "for_loop_argument", 
			"numbers_pipeline_list_for_loop", "signed_number", "number_float", "variable_from_command", 
			"splitter_end_command", "block", "expr_maker", "d_round_expr_maker", 
			"d_round_expr", "variable_or_number", "expr", "symbols", "argument", 
			"word", "command", "pipe_symbol", "pipeline", "pipeline_list", "function", 
			"select", "coprocess", "alphanumeric", "id", "string", "character_chain"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, "'\"'", "';'", "'while'", "'until'", 
			"'for'", "'do'", "'done'", "'if'", "'then'", "'fi'", "'in'", "'['", "']'", 
			"'-eq'", "'='", null, "'-gt'", null, "'-lt'", null, "'%'", "'&&'", "'||'", 
			"'else'", "'elif'", "'case'", "'*)'", "';;'", "';&'", "';;&'", "'esac'", 
			"'$'", null, "'$#'", null, null, null, null, null, "'|'", "'+'", "'*'", 
			"'?'", "'-'", "'/'", "'\\'", "'&'", "'('", "')'", "'{'", "'}'", "'>'", 
			"'<'", "'!'", "'function'", "'select'", "'coproc'", "'time'", "'declare'", 
			"'~'", "'..'", "'.'", null, null, null, "'-p'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRING", "CHARACTER_CHAIN", "COMMENT", "SINGLE_APOSTROPHE", 
			"APOSTROPHE", "SINGLE_SEMICOLON", "WHILE_LOOP_BEGIN", "UNTIL_LOOP_BEGIN", 
			"FOR_LOOP_BEGIN", "LOOP_MIDDLE", "LOOP_END", "IF_START", "IF_MIDDLE", 
			"IF_END", "LOOP_IN", "CONDITION_LEFT_SINGLE", "CONDITION_RIGHT_SINGLE", 
			"CONDITION_EQ", "EQ", "CONDITION_NEQ", "CONDITION_GT", "CONDITION_GE", 
			"CONDITION_LT", "CONDITION_LE", "MODULO", "CONDITION_DOUBLE_AMPERSAND", 
			"CONDITION_DOUBLE_PIPE", "ELSE", "ELSE_IF", "CASE_START", "CASE_DEFAULT", 
			"BRAKE_ABSOLUTE", "BRAKE_CONTINUATION", "BRAKE_WITH_NEXT_EXEC", "CASE_END", 
			"DOLLAR_SIGN", "VARIABLE", "SCRIPT_ARGUMENT_NUMBER", "SCRIPT_ARGUMENT", 
			"BOOL", "HEX_NUMBER_WITHOUT_SIGN", "OCTAL_NUMBER_WITHOUT_SIGN", "NEW_LINE", 
			"PIPE", "PLUS", "WILDCARD_OR_MULTIPLY", "WILDCARD", "MINUS", "DIVIDE", 
			"LEFT_SLASH", "AMPERSAN", "L_PARENTH_ROUND", "R_PARENTH_ROUND", "L_PARENTH_CURLY", 
			"R_PARENTH_CURLY", "POINTER_RIGHT", "POINTER_LEFT", "BOOL_NEGATION", 
			"FUNCTION_START", "SELECT", "COPROCESS_START", "TIME", "CREATE_VARABLE", 
			"TILDA", "LAST_FOLDER", "THIS_FOLDER", "NUMBER", "ALPHA", "NUMERIC", 
			"MINUSP", "SPACE", "TAB"
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
			setState(72);
			match(COMMENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
				{
				{
				setState(73);
				instruction();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				until_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				select();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				coprocess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				pipeline_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				assign();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
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
	public static class AssignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQ() { return getToken(BashGrammarParser.EQ, 0); }
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public Number_floatContext number_float() {
			return getRuleContext(Number_floatContext.class,0);
		}
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			var();
			setState(96);
			match(EQ);
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case CHARACTER_CHAIN:
			case DOLLAR_SIGN:
			case MINUS:
			case BOOL_NEGATION:
			case TIME:
			case ALPHA:
			case NUMERIC:
				{
				setState(97);
				pipeline();
				}
				break;
			case NUMBER:
				{
				{
				setState(98);
				number_float();
				setState(99);
				splitter_end_command();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(BashGrammarParser.ALPHA, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(BashGrammarParser.DOLLAR_SIGN, 0); }
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR_SIGN) {
				{
				setState(103);
				match(DOLLAR_SIGN);
				}
			}

			setState(106);
			match(ALPHA);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				alphanumeric();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA || _la==NUMERIC );
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
		enterRule(_localctx, 8, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CASE_START);
			setState(113);
			match(VARIABLE);
			setState(114);
			match(LOOP_IN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(115);
				splitter_end_command();
				}
			}

			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				single_case();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APOSTROPHE || _la==ALPHA || _la==NUMERIC );
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE_DEFAULT) {
				{
				setState(123);
				match(CASE_DEFAULT);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
					{
					{
					setState(124);
					instruction();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(BRAKE_ABSOLUTE);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(133);
				splitter_end_command();
				}
			}

			setState(136);
			match(CASE_END);
			setState(137);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 10, RULE_single_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
			case NUMERIC:
				{
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					alphanumeric();
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA || _la==NUMERIC );
				}
				break;
			case APOSTROPHE:
				{
				setState(144);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(147);
				match(PIPE);
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALPHA:
				case NUMERIC:
					{
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(148);
						alphanumeric();
						}
						}
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ALPHA || _la==NUMERIC );
					}
					break;
				case APOSTROPHE:
					{
					setState(153);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(161);
			match(R_PARENTH_ROUND);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(162);
				splitter_end_command();
				}
				break;
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
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
			setState(171);
			match(BRAKE_ABSOLUTE);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(172);
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
		enterRule(_localctx, 12, RULE_until_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(UNTIL_LOOP_BEGIN);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(176);
				match(VARIABLE);
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(177);
				variable_from_command();
				setState(178);
				expr_maker(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			splitter_end_command();
			setState(183);
			match(LOOP_MIDDLE);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
				{
				{
				setState(184);
				instruction();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(LOOP_END);
			setState(191);
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
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IF_START);
			setState(194);
			expr_maker(0);
			setState(195);
			splitter_end_command();
			setState(196);
			match(IF_MIDDLE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
				{
				{
				setState(197);
				instruction();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(203);
				match(ELSE_IF);
				setState(204);
				expr_maker(0);
				setState(205);
				splitter_end_command();
				setState(206);
				match(IF_MIDDLE);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
					{
					{
					setState(207);
					instruction();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(218);
				match(ELSE);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
					{
					{
					setState(219);
					instruction();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(227);
			match(IF_END);
			setState(228);
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
		enterRule(_localctx, 16, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(WHILE_LOOP_BEGIN);
			setState(231);
			expr_maker(0);
			setState(232);
			splitter_end_command();
			setState(233);
			match(LOOP_MIDDLE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510500L) != 0) || _la==ALPHA || _la==NUMERIC) {
				{
				{
				setState(234);
				instruction();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(LOOP_END);
			setState(241);
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
		enterRule(_localctx, 18, RULE_for_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FOR_LOOP_BEGIN);
			setState(244);
			for_loop_argument();
			setState(245);
			match(LOOP_MIDDLE);
			setState(246);
			splitter_end_command();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					instruction();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(253);
				splitter_end_command();
				}
			}

			setState(256);
			match(LOOP_END);
			setState(257);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 20, RULE_for_loop_argument);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(L_PARENTH_ROUND);
				setState(260);
				match(L_PARENTH_ROUND);
				setState(261);
				match(SINGLE_SEMICOLON);
				setState(262);
				expr_maker(0);
				setState(263);
				match(SINGLE_SEMICOLON);
				setState(264);
				match(R_PARENTH_ROUND);
				setState(265);
				match(R_PARENTH_ROUND);
				setState(266);
				splitter_end_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					alphanumeric();
					}
					}
					setState(271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA || _la==NUMERIC );
				setState(273);
				match(LOOP_IN);
				setState(274);
				numbers_pipeline_list_for_loop();
				setState(275);
				splitter_end_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(277);
					alphanumeric();
					}
					}
					setState(280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA || _la==NUMERIC );
				setState(282);
				match(LOOP_IN);
				setState(283);
				variable_from_command();
				setState(284);
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
		enterRule(_localctx, 22, RULE_numbers_pipeline_list_for_loop);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					signed_number();
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 4194313L) != 0) );
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(293);
					match(LAST_FOLDER);
					setState(294);
					signed_number();
					}
				}

				}
				break;
			case L_PARENTH_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(L_PARENTH_CURLY);
				setState(298);
				signed_number();
				setState(299);
				match(LAST_FOLDER);
				setState(300);
				signed_number();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(301);
					match(LAST_FOLDER);
					setState(302);
					signed_number();
					}
				}

				setState(305);
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
		enterRule(_localctx, 24, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(309);
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

			setState(312);
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
		public List<TerminalNode> NUMERIC() { return getTokens(BashGrammarParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(BashGrammarParser.NUMERIC, i);
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
		enterRule(_localctx, 26, RULE_number_float);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(NUMBER);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(315);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==THIS_FOLDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						match(NUMERIC);
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 28, RULE_variable_from_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DOLLAR_SIGN);
			setState(325);
			match(L_PARENTH_ROUND);
			setState(326);
			pipeline_list();
			setState(327);
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
		enterRule(_localctx, 30, RULE_splitter_end_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 32, RULE_block);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(L_PARENTH_ROUND);
				setState(332);
				pipeline_list();
				setState(333);
				match(R_PARENTH_ROUND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(L_PARENTH_CURLY);
				setState(336);
				pipeline_list();
				setState(337);
				match(R_PARENTH_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(L_PARENTH_ROUND);
				setState(340);
				match(L_PARENTH_ROUND);
				setState(341);
				expr(0);
				setState(342);
				match(R_PARENTH_ROUND);
				setState(343);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(CONDITION_LEFT_SINGLE);
				setState(346);
				expr(0);
				setState(347);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				match(CONDITION_LEFT_SINGLE);
				setState(350);
				match(CONDITION_LEFT_SINGLE);
				setState(351);
				expr(0);
				setState(352);
				match(CONDITION_RIGHT_SINGLE);
				setState(353);
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
		public List<TerminalNode> CONDITION_LEFT_SINGLE() { return getTokens(BashGrammarParser.CONDITION_LEFT_SINGLE); }
		public TerminalNode CONDITION_LEFT_SINGLE(int i) {
			return getToken(BashGrammarParser.CONDITION_LEFT_SINGLE, i);
		}
		public List<TerminalNode> CONDITION_RIGHT_SINGLE() { return getTokens(BashGrammarParser.CONDITION_RIGHT_SINGLE); }
		public TerminalNode CONDITION_RIGHT_SINGLE(int i) {
			return getToken(BashGrammarParser.CONDITION_RIGHT_SINGLE, i);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr_maker, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(358);
				match(BOOL_NEGATION);
				setState(359);
				expr_maker(7);
				}
				break;
			case 2:
				{
				setState(360);
				match(TILDA);
				setState(361);
				expr(0);
				}
				break;
			case 3:
				{
				setState(362);
				match(L_PARENTH_ROUND);
				setState(363);
				d_round_expr_maker();
				setState(364);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				{
				setState(366);
				match(L_PARENTH_ROUND);
				setState(367);
				match(L_PARENTH_ROUND);
				setState(368);
				d_round_expr_maker();
				setState(369);
				match(R_PARENTH_ROUND);
				setState(370);
				match(R_PARENTH_ROUND);
				}
				break;
			case 5:
				{
				setState(372);
				match(CONDITION_LEFT_SINGLE);
				setState(373);
				match(CONDITION_LEFT_SINGLE);
				setState(374);
				d_round_expr_maker();
				setState(375);
				match(CONDITION_RIGHT_SINGLE);
				setState(376);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 6:
				{
				setState(378);
				match(CONDITION_LEFT_SINGLE);
				setState(379);
				d_round_expr_maker();
				setState(380);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_makerContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_maker);
					setState(384);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(385);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4538784402112512L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(386);
					expr_maker(6);
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 36, RULE_d_round_expr_maker);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				d_round_expr();
				setState(393);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4538784402112512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				d_round_expr_maker();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(L_PARENTH_ROUND);
				setState(397);
				d_round_expr_maker();
				setState(398);
				match(R_PARENTH_ROUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
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
		public TerminalNode CONDITION_LE() { return getToken(BashGrammarParser.CONDITION_LE, 0); }
		public TerminalNode CONDITION_EQ() { return getToken(BashGrammarParser.CONDITION_EQ, 0); }
		public TerminalNode CONDITION_GE() { return getToken(BashGrammarParser.CONDITION_GE, 0); }
		public TerminalNode CONDITION_GT() { return getToken(BashGrammarParser.CONDITION_GT, 0); }
		public TerminalNode CONDITION_LT() { return getToken(BashGrammarParser.CONDITION_LT, 0); }
		public TerminalNode CONDITION_NEQ() { return getToken(BashGrammarParser.CONDITION_NEQ, 0); }
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
		public List<TerminalNode> STRING() { return getTokens(BashGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BashGrammarParser.STRING, i);
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
		enterRule(_localctx, 38, RULE_d_round_expr);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				expr(0);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(404);
					match(EQ);
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(405);
						match(EQ);
						}
					}

					}
					break;
				case 2:
					{
					setState(408);
					match(POINTER_RIGHT);
					}
					break;
				case 3:
					{
					setState(409);
					match(POINTER_RIGHT);
					setState(410);
					match(POINTER_RIGHT);
					}
					break;
				case 4:
					{
					setState(411);
					match(POINTER_LEFT);
					}
					break;
				case 5:
					{
					setState(412);
					match(POINTER_LEFT);
					setState(413);
					match(POINTER_LEFT);
					}
					break;
				case 6:
					{
					setState(414);
					match(CONDITION_LE);
					}
					break;
				case 7:
					{
					setState(415);
					match(CONDITION_EQ);
					}
					break;
				case 8:
					{
					setState(416);
					match(CONDITION_GE);
					}
					break;
				case 9:
					{
					setState(417);
					match(CONDITION_GT);
					}
					break;
				case 10:
					{
					setState(418);
					match(CONDITION_LT);
					}
					break;
				case 11:
					{
					setState(419);
					match(CONDITION_NEQ);
					}
					break;
				}
				setState(422);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				expr(0);
				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POINTER_LEFT:
					{
					setState(425);
					match(POINTER_LEFT);
					setState(426);
					match(EQ);
					}
					break;
				case POINTER_RIGHT:
					{
					setState(427);
					match(POINTER_RIGHT);
					setState(428);
					match(EQ);
					}
					break;
				case BOOL_NEGATION:
					{
					setState(429);
					match(BOOL_NEGATION);
					setState(430);
					match(EQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				variable_or_number();
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(437);
					match(PLUS);
					setState(438);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(439);
					match(MINUS);
					setState(440);
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
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(443);
					match(PLUS);
					setState(444);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(445);
					match(MINUS);
					setState(446);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449);
				variable_or_number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(STRING);
				setState(451);
				match(EQ);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(452);
					match(EQ);
					}
				}

				setState(455);
				match(STRING);
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
		enterRule(_localctx, 40, RULE_variable_or_number);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(VARIABLE);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				id();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				{
				setState(464);
				match(L_PARENTH_ROUND);
				setState(465);
				expr(0);
				setState(466);
				match(R_PARENTH_ROUND);
				}
				break;
			case VARIABLE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case ALPHA:
				{
				setState(468);
				variable_or_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(471);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(472);
						match(PLUS);
						}
						break;
					case 2:
						{
						setState(473);
						match(MINUS);
						}
						break;
					case 3:
						{
						setState(474);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					case 4:
						{
						setState(475);
						match(DIVIDE);
						}
						break;
					case 5:
						{
						setState(476);
						match(MODULO);
						}
						break;
					case 6:
						{
						setState(477);
						match(WILDCARD_OR_MULTIPLY);
						setState(478);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					}
					setState(481);
					expr(4);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 44, RULE_symbols);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(488); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(487);
					alphanumeric();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(490); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 46, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(492);
				match(MINUS);
				}
				break;
			case 2:
				{
				{
				setState(493);
				match(MINUS);
				setState(494);
				match(MINUS);
				}
				}
				break;
			}
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(497);
					alphanumeric();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
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
		enterRule(_localctx, 48, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(502);
					command();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BashGrammarParser.STRING, 0); }
		public TerminalNode CHARACTER_CHAIN() { return getToken(BashGrammarParser.CHARACTER_CHAIN, 0); }
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_command);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(STRING);
				}
				break;
			case CHARACTER_CHAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(CHARACTER_CHAIN);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				variable_from_command();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				argument();
				}
				break;
			case ALPHA:
			case NUMERIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				symbols();
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
		enterRule(_localctx, 52, RULE_pipe_symbol);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(PIPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(PIPE);
				setState(516);
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
		public TerminalNode SINGLE_SEMICOLON() { return getToken(BashGrammarParser.SINGLE_SEMICOLON, 0); }
		public TerminalNode NEW_LINE() { return getToken(BashGrammarParser.NEW_LINE, 0); }
		public TerminalNode TIME() { return getToken(BashGrammarParser.TIME, 0); }
		public TerminalNode BOOL_NEGATION() { return getToken(BashGrammarParser.BOOL_NEGATION, 0); }
		public List<Pipe_symbolContext> pipe_symbol() {
			return getRuleContexts(Pipe_symbolContext.class);
		}
		public Pipe_symbolContext pipe_symbol(int i) {
			return getRuleContext(Pipe_symbolContext.class,i);
		}
		public TerminalNode MINUSP() { return getToken(BashGrammarParser.MINUSP, 0); }
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
		enterRule(_localctx, 54, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(519);
				match(TIME);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSP) {
					{
					setState(520);
					match(MINUSP);
					}
				}

				}
			}

			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL_NEGATION) {
				{
				setState(525);
				match(BOOL_NEGATION);
				}
			}

			setState(528);
			word();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(529);
				pipe_symbol();
				setState(530);
				word();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
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
	public static class Pipeline_listContext extends ParserRuleContext {
		public List<PipelineContext> pipeline() {
			return getRuleContexts(PipelineContext.class);
		}
		public PipelineContext pipeline(int i) {
			return getRuleContext(PipelineContext.class,i);
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
		enterRule(_localctx, 56, RULE_pipeline_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(539);
					pipeline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(542); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 58, RULE_function);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(544);
					alphanumeric();
					}
					}
					setState(547); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA || _la==NUMERIC );
				setState(549);
				match(L_PARENTH_ROUND);
				setState(550);
				match(R_PARENTH_ROUND);
				setState(551);
				block();
				}
				break;
			case FUNCTION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(FUNCTION_START);
				setState(555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(554);
					alphanumeric();
					}
					}
					setState(557); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA || _la==NUMERIC );
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(559);
					match(L_PARENTH_ROUND);
					setState(560);
					match(R_PARENTH_ROUND);
					}
					break;
				}
				setState(563);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 60, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(SELECT);
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568);
				alphanumeric();
				}
				}
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA || _la==NUMERIC );
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP_IN) {
				{
				setState(573);
				match(LOOP_IN);
				setState(574);
				word();
				}
			}

			setState(577);
			splitter_end_command();
			setState(578);
			match(LOOP_MIDDLE);
			setState(579);
			pipeline_list();
			setState(580);
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
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 62, RULE_coprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(COPROCESS_START);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					alphanumeric();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(589);
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
	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(BashGrammarParser.ALPHA, 0); }
		public TerminalNode NUMERIC() { return getToken(BashGrammarParser.NUMERIC, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitAlphanumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BashGrammarVisitor ) return ((BashGrammarVisitor<? extends T>)visitor).visitAlphanumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_la = _input.LA(1);
			if ( !(_la==ALPHA || _la==NUMERIC) ) {
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(BashGrammarParser.ALPHA, 0); }
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
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
		enterRule(_localctx, 66, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(ALPHA);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					alphanumeric();
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		public List<TerminalNode> SPACE() { return getTokens(BashGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(BashGrammarParser.SPACE, i);
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
		enterRule(_localctx, 68, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(APOSTROPHE);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -66L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1023L) != 0)) {
				{
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(601);
					match(SPACE);
					}
					break;
				case 2:
					{
					setState(602);
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
					break;
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
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
		public List<TerminalNode> SPACE() { return getTokens(BashGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(BashGrammarParser.SPACE, i);
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
		enterRule(_localctx, 70, RULE_character_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(SINGLE_APOSTROPHE);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -34L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1023L) != 0)) {
				{
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(611);
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
					break;
				case 2:
					{
					setState(612);
					match(SPACE);
					}
					break;
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
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
		case 17:
			return expr_maker_sempred((Expr_makerContext)_localctx, predIndex);
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_maker_sempred(Expr_makerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
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
		"\u0004\u0001I\u026d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f\u0000"+
		"N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"f\b\u0002\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003m\b\u0003\u000b\u0003\f\u0003n\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0004\u0004\u0004x\b\u0004\u000b"+
		"\u0004\f\u0004y\u0001\u0004\u0001\u0004\u0005\u0004~\b\u0004\n\u0004\f"+
		"\u0004\u0081\t\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0087\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0004\u0005\u008d\b\u0005\u000b\u0005\f\u0005\u008e\u0001\u0005\u0003"+
		"\u0005\u0092\b\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0096\b\u0005"+
		"\u000b\u0005\f\u0005\u0097\u0001\u0005\u0003\u0005\u009b\b\u0005\u0005"+
		"\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00a4\b\u0005\u0001\u0005\u0005\u0005\u00a7\b\u0005\n\u0005"+
		"\f\u0005\u00aa\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ae\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b5\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ba\b"+
		"\u0006\n\u0006\f\u0006\u00bd\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00c7\b\u0007\n\u0007\f\u0007\u00ca\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007"+
		"\u00d4\t\u0007\u0005\u0007\u00d6\b\u0007\n\u0007\f\u0007\u00d9\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00dd\b\u0007\n\u0007\f\u0007\u00e0"+
		"\t\u0007\u0003\u0007\u00e2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ec\b\b\n\b\f\b\u00ef"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00f9\b\t\n\t\f\t\u00fc\t\t\u0001\t\u0003\t\u00ff\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u010e\b\n\u000b\n\f\n\u010f\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u0117\b\n\u000b\n\f\n\u0118\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u011f\b\n\u0001\u000b\u0004\u000b\u0122\b\u000b"+
		"\u000b\u000b\f\u000b\u0123\u0001\u000b\u0001\u000b\u0003\u000b\u0128\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0130\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0134"+
		"\b\u000b\u0001\f\u0003\f\u0137\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u013e\b\r\n\r\f\r\u0141\t\r\u0003\r\u0143\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0164\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u017f\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0184\b\u0011\n\u0011\f\u0011\u0187\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0192\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0197\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a5\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01b0\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01ba\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01c0\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01c6\b\u0013\u0001\u0013\u0003\u0013\u01c9\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ce\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01d6\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e0\b\u0015\u0001"+
		"\u0015\u0005\u0015\u01e3\b\u0015\n\u0015\f\u0015\u01e6\t\u0015\u0001\u0016"+
		"\u0004\u0016\u01e9\b\u0016\u000b\u0016\f\u0016\u01ea\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01f0\b\u0017\u0001\u0017\u0004\u0017\u01f3"+
		"\b\u0017\u000b\u0017\f\u0017\u01f4\u0001\u0018\u0004\u0018\u01f8\b\u0018"+
		"\u000b\u0018\f\u0018\u01f9\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0201\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0206\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u020a\b"+
		"\u001b\u0003\u001b\u020c\b\u001b\u0001\u001b\u0003\u001b\u020f\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0215\b\u001b"+
		"\n\u001b\f\u001b\u0218\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004"+
		"\u001c\u021d\b\u001c\u000b\u001c\f\u001c\u021e\u0001\u001d\u0004\u001d"+
		"\u0222\b\u001d\u000b\u001d\f\u001d\u0223\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u022c\b\u001d\u000b"+
		"\u001d\f\u001d\u022d\u0001\u001d\u0001\u001d\u0003\u001d\u0232\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0236\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u023a\b\u001e\u000b\u001e\f\u001e\u023b\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0240\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u0249\b\u001f\n"+
		"\u001f\f\u001f\u024c\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0005!\u0254\b!\n!\f!\u0257\t!\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u025c\b\"\n\"\f\"\u025f\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005"+
		"#\u0266\b#\n#\f#\u0269\t#\u0001#\u0001#\u0001#\u0000\u0002\"*$\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDF\u0000\u0007\u0002\u0000..11\u0002\u0000\u0001\u0001"+
		"CC\u0002\u0000\u0007\u0007,,\u0003\u0000\u001b\u001c--44\u0001\u0000E"+
		"F\u0001\u0000\u0006\u0006\u0001\u0000\u0005\u0005\u02bd\u0000H\u0001\u0000"+
		"\u0000\u0000\u0002]\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000"+
		"\u0006h\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000\n\u0091\u0001"+
		"\u0000\u0000\u0000\f\u00af\u0001\u0000\u0000\u0000\u000e\u00c1\u0001\u0000"+
		"\u0000\u0000\u0010\u00e6\u0001\u0000\u0000\u0000\u0012\u00f3\u0001\u0000"+
		"\u0000\u0000\u0014\u011e\u0001\u0000\u0000\u0000\u0016\u0133\u0001\u0000"+
		"\u0000\u0000\u0018\u0136\u0001\u0000\u0000\u0000\u001a\u013a\u0001\u0000"+
		"\u0000\u0000\u001c\u0144\u0001\u0000\u0000\u0000\u001e\u0149\u0001\u0000"+
		"\u0000\u0000 \u0163\u0001\u0000\u0000\u0000\"\u017e\u0001\u0000\u0000"+
		"\u0000$\u0191\u0001\u0000\u0000\u0000&\u01c8\u0001\u0000\u0000\u0000("+
		"\u01cd\u0001\u0000\u0000\u0000*\u01d5\u0001\u0000\u0000\u0000,\u01e8\u0001"+
		"\u0000\u0000\u0000.\u01ef\u0001\u0000\u0000\u00000\u01f7\u0001\u0000\u0000"+
		"\u00002\u0200\u0001\u0000\u0000\u00004\u0205\u0001\u0000\u0000\u00006"+
		"\u020b\u0001\u0000\u0000\u00008\u021c\u0001\u0000\u0000\u0000:\u0235\u0001"+
		"\u0000\u0000\u0000<\u0237\u0001\u0000\u0000\u0000>\u0246\u0001\u0000\u0000"+
		"\u0000@\u024f\u0001\u0000\u0000\u0000B\u0251\u0001\u0000\u0000\u0000D"+
		"\u0258\u0001\u0000\u0000\u0000F\u0262\u0001\u0000\u0000\u0000HL\u0005"+
		"\u0004\u0000\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0000"+
		"\u0000\u0001P\u0001\u0001\u0000\u0000\u0000Q^\u0005\u0004\u0000\u0000"+
		"R^\u0003:\u001d\u0000S^\u0003\u000e\u0007\u0000T^\u0003\u0012\t\u0000"+
		"U^\u0003\u0010\b\u0000V^\u0003\f\u0006\u0000W^\u0003\b\u0004\u0000X^\u0003"+
		"<\u001e\u0000Y^\u0003>\u001f\u0000Z^\u00038\u001c\u0000[^\u0003\u0004"+
		"\u0002\u0000\\^\u0003\u001e\u000f\u0000]Q\u0001\u0000\u0000\u0000]R\u0001"+
		"\u0000\u0000\u0000]S\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000"+
		"]U\u0001\u0000\u0000\u0000]V\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]X\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0003"+
		"\u0001\u0000\u0000\u0000_`\u0003\u0006\u0003\u0000`e\u0005\u0014\u0000"+
		"\u0000af\u00036\u001b\u0000bc\u0003\u001a\r\u0000cd\u0003\u001e\u000f"+
		"\u0000df\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000"+
		"\u0000\u0000f\u0005\u0001\u0000\u0000\u0000gi\u0005%\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0005E\u0000\u0000km\u0003@ \u0000lk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u0007\u0001\u0000\u0000\u0000pq\u0005\u001f\u0000\u0000qr\u0005&\u0000"+
		"\u0000rt\u0005\u0010\u0000\u0000su\u0003\u001e\u000f\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vx\u0003"+
		"\n\u0005\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0083\u0001\u0000\u0000"+
		"\u0000{\u007f\u0005 \u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0005!\u0000\u0000\u0083"+
		"{\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u001e\u000f\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005$\u0000\u0000\u0089\u008a\u0003"+
		"\u001e\u000f\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008d\u0003@"+
		" \u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0003D\"\u0000"+
		"\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u009e\u0001\u0000\u0000\u0000\u0093\u009a\u0005-\u0000\u0000\u0094"+
		"\u0096\u0003@ \u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u009b\u0003"+
		"D\"\u0000\u009a\u0095\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u00056\u0000"+
		"\u0000\u00a2\u00a4\u0003\u001e\u000f\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0002\u0001\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005!\u0000\u0000"+
		"\u00ac\u00ae\u0003\u001e\u000f\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u000b\u0001\u0000\u0000\u0000"+
		"\u00af\u00b4\u0005\t\u0000\u0000\u00b0\u00b5\u0005&\u0000\u0000\u00b1"+
		"\u00b2\u0003\u001c\u000e\u0000\u00b2\u00b3\u0003\"\u0011\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0003\u001e\u000f\u0000\u00b7\u00bb\u0005\u000b\u0000\u0000\u00b8\u00ba"+
		"\u0003\u0002\u0001\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\f\u0000\u0000\u00bf\u00c0\u0003"+
		"\u001e\u000f\u0000\u00c0\r\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\r"+
		"\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c4\u0003\u001e\u000f"+
		"\u0000\u00c4\u00c8\u0005\u000e\u0000\u0000\u00c5\u00c7\u0003\u0002\u0001"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00d7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005\u001e\u0000\u0000\u00cc\u00cd\u0003\"\u0011\u0000"+
		"\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce\u00d2\u0005\u000e\u0000\u0000"+
		"\u00cf\u00d1\u0003\u0002\u0001\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00e1\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de\u0005\u001d\u0000\u0000"+
		"\u00db\u00dd\u0003\u0002\u0001\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u000f\u0000\u0000\u00e4\u00e5\u0003\u001e\u000f\u0000"+
		"\u00e5\u000f\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\b\u0000\u0000\u00e7"+
		"\u00e8\u0003\"\u0011\u0000\u00e8\u00e9\u0003\u001e\u000f\u0000\u00e9\u00ed"+
		"\u0005\u000b\u0000\u0000\u00ea\u00ec\u0003\u0002\u0001\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\f\u0000\u0000\u00f1\u00f2\u0003\u001e\u000f\u0000\u00f2\u0011\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000\u00f4\u00f5\u0003\u0014"+
		"\n\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6\u00fa\u0003\u001e\u000f"+
		"\u0000\u00f7\u00f9\u0003\u0002\u0001\u0000\u00f8\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u001e\u000f"+
		"\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\f\u0000\u0000"+
		"\u0101\u0102\u0003\u001e\u000f\u0000\u0102\u0013\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u00055\u0000\u0000\u0104\u0105\u00055\u0000\u0000\u0105\u0106"+
		"\u0005\u0007\u0000\u0000\u0106\u0107\u0003\"\u0011\u0000\u0107\u0108\u0005"+
		"\u0007\u0000\u0000\u0108\u0109\u00056\u0000\u0000\u0109\u010a\u00056\u0000"+
		"\u0000\u010a\u010b\u0003\u001e\u000f\u0000\u010b\u011f\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0003@ \u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005\u0010\u0000\u0000\u0112\u0113\u0003\u0016\u000b\u0000\u0113"+
		"\u0114\u0003\u001e\u000f\u0000\u0114\u011f\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0003@ \u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"\u0010\u0000\u0000\u011b\u011c\u0003\u001c\u000e\u0000\u011c\u011d\u0003"+
		"\u001e\u000f\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0103\u0001"+
		"\u0000\u0000\u0000\u011e\u010d\u0001\u0000\u0000\u0000\u011e\u0116\u0001"+
		"\u0000\u0000\u0000\u011f\u0015\u0001\u0000\u0000\u0000\u0120\u0122\u0003"+
		"\u0018\f\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0126\u0005B\u0000"+
		"\u0000\u0126\u0128\u0003\u0018\f\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0134\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u00057\u0000\u0000\u012a\u012b\u0003\u0018\f\u0000\u012b"+
		"\u012c\u0005B\u0000\u0000\u012c\u012f\u0003\u0018\f\u0000\u012d\u012e"+
		"\u0005B\u0000\u0000\u012e\u0130\u0003\u0018\f\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u00058\u0000\u0000\u0132\u0134\u0001\u0000"+
		"\u0000\u0000\u0133\u0121\u0001\u0000\u0000\u0000\u0133\u0129\u0001\u0000"+
		"\u0000\u0000\u0134\u0017\u0001\u0000\u0000\u0000\u0135\u0137\u0007\u0000"+
		"\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0003\u001a"+
		"\r\u0000\u0139\u0019\u0001\u0000\u0000\u0000\u013a\u0142\u0005D\u0000"+
		"\u0000\u013b\u013f\u0007\u0001\u0000\u0000\u013c\u013e\u0005F\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0142\u013b\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u001b\u0001\u0000\u0000\u0000\u0144\u0145\u0005%\u0000\u0000\u0145"+
		"\u0146\u00055\u0000\u0000\u0146\u0147\u00038\u001c\u0000\u0147\u0148\u0005"+
		"6\u0000\u0000\u0148\u001d\u0001\u0000\u0000\u0000\u0149\u014a\u0007\u0002"+
		"\u0000\u0000\u014a\u001f\u0001\u0000\u0000\u0000\u014b\u014c\u00055\u0000"+
		"\u0000\u014c\u014d\u00038\u001c\u0000\u014d\u014e\u00056\u0000\u0000\u014e"+
		"\u0164\u0001\u0000\u0000\u0000\u014f\u0150\u00057\u0000\u0000\u0150\u0151"+
		"\u00038\u001c\u0000\u0151\u0152\u00058\u0000\u0000\u0152\u0164\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u00055\u0000\u0000\u0154\u0155\u00055\u0000\u0000"+
		"\u0155\u0156\u0003*\u0015\u0000\u0156\u0157\u00056\u0000\u0000\u0157\u0158"+
		"\u00056\u0000\u0000\u0158\u0164\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0011\u0000\u0000\u015a\u015b\u0003*\u0015\u0000\u015b\u015c\u0005\u0012"+
		"\u0000\u0000\u015c\u0164\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0011"+
		"\u0000\u0000\u015e\u015f\u0005\u0011\u0000\u0000\u015f\u0160\u0003*\u0015"+
		"\u0000\u0160\u0161\u0005\u0012\u0000\u0000\u0161\u0162\u0005\u0012\u0000"+
		"\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u014b\u0001\u0000\u0000"+
		"\u0000\u0163\u014f\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000\u0000"+
		"\u0000\u0163\u0159\u0001\u0000\u0000\u0000\u0163\u015d\u0001\u0000\u0000"+
		"\u0000\u0164!\u0001\u0000\u0000\u0000\u0165\u0166\u0006\u0011\uffff\uffff"+
		"\u0000\u0166\u0167\u0005;\u0000\u0000\u0167\u017f\u0003\"\u0011\u0007"+
		"\u0168\u0169\u0005A\u0000\u0000\u0169\u017f\u0003*\u0015\u0000\u016a\u016b"+
		"\u00055\u0000\u0000\u016b\u016c\u0003$\u0012\u0000\u016c\u016d\u00056"+
		"\u0000\u0000\u016d\u017f\u0001\u0000\u0000\u0000\u016e\u016f\u00055\u0000"+
		"\u0000\u016f\u0170\u00055\u0000\u0000\u0170\u0171\u0003$\u0012\u0000\u0171"+
		"\u0172\u00056\u0000\u0000\u0172\u0173\u00056\u0000\u0000\u0173\u017f\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\u0011\u0000\u0000\u0175\u0176\u0005"+
		"\u0011\u0000\u0000\u0176\u0177\u0003$\u0012\u0000\u0177\u0178\u0005\u0012"+
		"\u0000\u0000\u0178\u0179\u0005\u0012\u0000\u0000\u0179\u017f\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u0011\u0000\u0000\u017b\u017c\u0003$\u0012"+
		"\u0000\u017c\u017d\u0005\u0012\u0000\u0000\u017d\u017f\u0001\u0000\u0000"+
		"\u0000\u017e\u0165\u0001\u0000\u0000\u0000\u017e\u0168\u0001\u0000\u0000"+
		"\u0000\u017e\u016a\u0001\u0000\u0000\u0000\u017e\u016e\u0001\u0000\u0000"+
		"\u0000\u017e\u0174\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000\u0000"+
		"\u0000\u017f\u0185\u0001\u0000\u0000\u0000\u0180\u0181\n\u0005\u0000\u0000"+
		"\u0181\u0182\u0007\u0003\u0000\u0000\u0182\u0184\u0003\"\u0011\u0006\u0183"+
		"\u0180\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"#\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0003&\u0013\u0000\u0189\u018a\u0007\u0003\u0000\u0000\u018a\u018b\u0003"+
		"$\u0012\u0000\u018b\u0192\u0001\u0000\u0000\u0000\u018c\u018d\u00055\u0000"+
		"\u0000\u018d\u018e\u0003$\u0012\u0000\u018e\u018f\u00056\u0000\u0000\u018f"+
		"\u0192\u0001\u0000\u0000\u0000\u0190\u0192\u0003&\u0013\u0000\u0191\u0188"+
		"\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0191\u0190"+
		"\u0001\u0000\u0000\u0000\u0192%\u0001\u0000\u0000\u0000\u0193\u01a4\u0003"+
		"*\u0015\u0000\u0194\u0196\u0005\u0014\u0000\u0000\u0195\u0197\u0005\u0014"+
		"\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u01a5\u0001\u0000\u0000\u0000\u0198\u01a5\u00059\u0000"+
		"\u0000\u0199\u019a\u00059\u0000\u0000\u019a\u01a5\u00059\u0000\u0000\u019b"+
		"\u01a5\u0005:\u0000\u0000\u019c\u019d\u0005:\u0000\u0000\u019d\u01a5\u0005"+
		":\u0000\u0000\u019e\u01a5\u0005\u0019\u0000\u0000\u019f\u01a5\u0005\u0013"+
		"\u0000\u0000\u01a0\u01a5\u0005\u0017\u0000\u0000\u01a1\u01a5\u0005\u0016"+
		"\u0000\u0000\u01a2\u01a5\u0005\u0018\u0000\u0000\u01a3\u01a5\u0005\u0015"+
		"\u0000\u0000\u01a4\u0194\u0001\u0000\u0000\u0000\u01a4\u0198\u0001\u0000"+
		"\u0000\u0000\u01a4\u0199\u0001\u0000\u0000\u0000\u01a4\u019b\u0001\u0000"+
		"\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000"+
		"\u0000\u0000\u01a4\u019f\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0003*\u0015\u0000\u01a7\u01c9\u0001\u0000\u0000"+
		"\u0000\u01a8\u01af\u0003*\u0015\u0000\u01a9\u01aa\u0005:\u0000\u0000\u01aa"+
		"\u01b0\u0005\u0014\u0000\u0000\u01ab\u01ac\u00059\u0000\u0000\u01ac\u01b0"+
		"\u0005\u0014\u0000\u0000\u01ad\u01ae\u0005;\u0000\u0000\u01ae\u01b0\u0005"+
		"\u0014\u0000\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af\u01ab\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0003*\u0015\u0000\u01b2\u01c9\u0001\u0000"+
		"\u0000\u0000\u01b3\u01c9\u0005)\u0000\u0000\u01b4\u01b9\u0003(\u0014\u0000"+
		"\u01b5\u01b6\u0005.\u0000\u0000\u01b6\u01ba\u0005.\u0000\u0000\u01b7\u01b8"+
		"\u00051\u0000\u0000\u01b8\u01ba\u00051\u0000\u0000\u01b9\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01c9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0005.\u0000\u0000\u01bc\u01c0\u0005.\u0000\u0000"+
		"\u01bd\u01be\u00051\u0000\u0000\u01be\u01c0\u00051\u0000\u0000\u01bf\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c9\u0003(\u0014\u0000\u01c2\u01c3\u0005"+
		"\u0002\u0000\u0000\u01c3\u01c5\u0005\u0014\u0000\u0000\u01c4\u01c6\u0005"+
		"\u0014\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005"+
		"\u0002\u0000\u0000\u01c8\u0193\u0001\u0000\u0000\u0000\u01c8\u01a8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01b3\u0001\u0000\u0000\u0000\u01c8\u01b4\u0001"+
		"\u0000\u0000\u0000\u01c8\u01bf\u0001\u0000\u0000\u0000\u01c8\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c9\'\u0001\u0000\u0000\u0000\u01ca\u01ce\u0005&"+
		"\u0000\u0000\u01cb\u01ce\u0003B!\u0000\u01cc\u01ce\u0003\u0018\f\u0000"+
		"\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce)\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0006\u0015\uffff\uffff\u0000\u01d0\u01d1\u00055\u0000\u0000\u01d1"+
		"\u01d2\u0003*\u0015\u0000\u01d2\u01d3\u00056\u0000\u0000\u01d3\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d6\u0003(\u0014\u0000\u01d5\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01d7\u01df\n\u0003\u0000\u0000\u01d8\u01e0\u0005.\u0000"+
		"\u0000\u01d9\u01e0\u00051\u0000\u0000\u01da\u01e0\u0005/\u0000\u0000\u01db"+
		"\u01e0\u00052\u0000\u0000\u01dc\u01e0\u0005\u001a\u0000\u0000\u01dd\u01de"+
		"\u0005/\u0000\u0000\u01de\u01e0\u0005/\u0000\u0000\u01df\u01d8\u0001\u0000"+
		"\u0000\u0000\u01df\u01d9\u0001\u0000\u0000\u0000\u01df\u01da\u0001\u0000"+
		"\u0000\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01df\u01dc\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0003*\u0015\u0004\u01e2\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5+\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003@ \u0000\u01e8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb-\u0001"+
		"\u0000\u0000\u0000\u01ec\u01f0\u00051\u0000\u0000\u01ed\u01ee\u00051\u0000"+
		"\u0000\u01ee\u01f0\u00051\u0000\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0003@ \u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5/\u0001\u0000\u0000\u0000\u01f6\u01f8\u0003"+
		"2\u0019\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa1\u0001\u0000\u0000\u0000\u01fb\u0201\u0005\u0002\u0000"+
		"\u0000\u01fc\u0201\u0005\u0003\u0000\u0000\u01fd\u0201\u0003\u001c\u000e"+
		"\u0000\u01fe\u0201\u0003.\u0017\u0000\u01ff\u0201\u0003,\u0016\u0000\u0200"+
		"\u01fb\u0001\u0000\u0000\u0000\u0200\u01fc\u0001\u0000\u0000\u0000\u0200"+
		"\u01fd\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200"+
		"\u01ff\u0001\u0000\u0000\u0000\u02013\u0001\u0000\u0000\u0000\u0202\u0206"+
		"\u0005-\u0000\u0000\u0203\u0204\u0005-\u0000\u0000\u0204\u0206\u00054"+
		"\u0000\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000"+
		"\u0000\u0000\u02065\u0001\u0000\u0000\u0000\u0207\u0209\u0005?\u0000\u0000"+
		"\u0208\u020a\u0005G\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b"+
		"\u0207\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u020e\u0001\u0000\u0000\u0000\u020d\u020f\u0005;\u0000\u0000\u020e\u020d"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0216\u00030\u0018\u0000\u0211\u0212\u0003"+
		"4\u001a\u0000\u0212\u0213\u00030\u0018\u0000\u0213\u0215\u0001\u0000\u0000"+
		"\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000"+
		"\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0007\u0002\u0000\u0000\u021a7\u0001\u0000\u0000\u0000"+
		"\u021b\u021d\u00036\u001b\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021f9\u0001\u0000\u0000\u0000\u0220\u0222"+
		"\u0003@ \u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u00055\u0000"+
		"\u0000\u0226\u0227\u00056\u0000\u0000\u0227\u0228\u0003 \u0010\u0000\u0228"+
		"\u0236\u0001\u0000\u0000\u0000\u0229\u022b\u0005<\u0000\u0000\u022a\u022c"+
		"\u0003@ \u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000"+
		"\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000"+
		"\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f\u0230\u00055\u0000"+
		"\u0000\u0230\u0232\u00056\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0003 \u0010\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235"+
		"\u0221\u0001\u0000\u0000\u0000\u0235\u0229\u0001\u0000\u0000\u0000\u0236"+
		";\u0001\u0000\u0000\u0000\u0237\u0239\u0005=\u0000\u0000\u0238\u023a\u0003"+
		"@ \u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023e\u0005\u0010\u0000"+
		"\u0000\u023e\u0240\u00030\u0018\u0000\u023f\u023d\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0003\u001e\u000f\u0000\u0242\u0243\u0005\u000b\u0000\u0000"+
		"\u0243\u0244\u00038\u001c\u0000\u0244\u0245\u0005\f\u0000\u0000\u0245"+
		"=\u0001\u0000\u0000\u0000\u0246\u024a\u0005>\u0000\u0000\u0247\u0249\u0003"+
		"@ \u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024c\u0001\u0000\u0000"+
		"\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u00030\u0018\u0000\u024e?\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0007\u0004\u0000\u0000\u0250A\u0001\u0000\u0000\u0000\u0251\u0255"+
		"\u0005E\u0000\u0000\u0252\u0254\u0003@ \u0000\u0253\u0252\u0001\u0000"+
		"\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256C\u0001\u0000\u0000"+
		"\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u025d\u0005\u0006\u0000"+
		"\u0000\u0259\u025c\u0005H\u0000\u0000\u025a\u025c\b\u0005\u0000\u0000"+
		"\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000"+
		"\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0006\u0000\u0000"+
		"\u0261E\u0001\u0000\u0000\u0000\u0262\u0267\u0005\u0005\u0000\u0000\u0263"+
		"\u0266\b\u0006\u0000\u0000\u0264\u0266\u0005H\u0000\u0000\u0265\u0263"+
		"\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269"+
		"\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u026a\u026b\u0005\u0005\u0000\u0000\u026bG\u0001"+
		"\u0000\u0000\u0000LL]ehnty\u007f\u0083\u0086\u008e\u0091\u0097\u009a\u009e"+
		"\u00a3\u00a8\u00ad\u00b4\u00bb\u00c8\u00d2\u00d7\u00de\u00e1\u00ed\u00fa"+
		"\u00fe\u010f\u0118\u011e\u0123\u0127\u012f\u0133\u0136\u013f\u0142\u0163"+
		"\u017e\u0185\u0191\u0196\u01a4\u01af\u01b9\u01bf\u01c5\u01c8\u01cd\u01d5"+
		"\u01df\u01e4\u01ea\u01ef\u01f4\u01f9\u0200\u0205\u0209\u020b\u020e\u0216"+
		"\u021e\u0223\u022d\u0231\u0235\u023b\u023f\u024a\u0255\u025b\u025d\u0265"+
		"\u0267";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}