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
		T__0=1, T__1=2, T__2=3, STRING=4, CHARACTER_CHAIN=5, COMMENT=6, SINGLE_APOSTROPHE=7, 
		APOSTROPHE=8, SINGLE_SEMICOLON=9, WHILE_LOOP_BEGIN=10, UNTIL_LOOP_BEGIN=11, 
		FOR_LOOP_BEGIN=12, LOOP_MIDDLE=13, LOOP_END=14, IF_START=15, IF_MIDDLE=16, 
		IF_END=17, LOOP_IN=18, CONDITION_LEFT_SINGLE=19, CONDITION_RIGHT_SINGLE=20, 
		CONDITION_EQ=21, EQ=22, CONDITION_NEQ=23, CONDITION_GT=24, CONDITION_GE=25, 
		CONDITION_LT=26, CONDITION_LE=27, MODULO=28, CONDITION_DOUBLE_AMPERSAND=29, 
		CONDITION_DOUBLE_PIPE=30, ELSE=31, ELSE_IF=32, CASE_START=33, CASE_DEFAULT=34, 
		BRAKE_CONTINUATION=35, BRAKE_WITH_NEXT_EXEC=36, CASE_END=37, DOLLAR_SIGN=38, 
		VARIABLE=39, SCRIPT_ARGUMENT_NUMBER=40, SCRIPT_ARGUMENT=41, BOOL=42, HEX_NUMBER_WITHOUT_SIGN=43, 
		OCTAL_NUMBER_WITHOUT_SIGN=44, NEW_LINE=45, PIPE=46, PLUS=47, WILDCARD_OR_MULTIPLY=48, 
		WILDCARD=49, MINUS=50, DIVIDE=51, LEFT_SLASH=52, AMPERSAN=53, L_PARENTH_ROUND=54, 
		R_PARENTH_ROUND=55, L_PARENTH_CURLY=56, R_PARENTH_CURLY=57, POINTER_RIGHT=58, 
		POINTER_LEFT=59, BOOL_NEGATION=60, FUNCTION_START=61, SELECT=62, COPROCESS_START=63, 
		TIME=64, CREATE_VARABLE=65, TILDA=66, LAST_FOLDER=67, THIS_FOLDER=68, 
		NUMBER=69, ALPHA=70, MINUSP=71, UNDERSCORE=72, SPACE=73;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_symbols = 2, RULE_argument = 3, 
		RULE_word = 4, RULE_command = 5, RULE_pipe_symbol = 6, RULE_case_statement = 7, 
		RULE_single_case = 8, RULE_pipeline = 9, RULE_pipeline_list = 10, RULE_assign = 11, 
		RULE_var = 12, RULE_until_loop = 13, RULE_if_statement = 14, RULE_if_elsif = 15, 
		RULE_if_else = 16, RULE_while_loop = 17, RULE_for_loop = 18, RULE_for_loop_argument = 19, 
		RULE_numbers_pipeline_list_for_loop = 20, RULE_signed_number = 21, RULE_number_float = 22, 
		RULE_variable_from_command = 23, RULE_splitter_end_command = 24, RULE_block = 25, 
		RULE_expr_maker = 26, RULE_d_round_expr_maker = 27, RULE_d_round_expr = 28, 
		RULE_variable_or_number = 29, RULE_expr = 30, RULE_function = 31, RULE_select = 32, 
		RULE_coprocess = 33, RULE_alphanumeric = 34, RULE_id = 35, RULE_case_break = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "symbols", "argument", "word", "command", "pipe_symbol", 
			"case_statement", "single_case", "pipeline", "pipeline_list", "assign", 
			"var", "until_loop", "if_statement", "if_elsif", "if_else", "while_loop", 
			"for_loop", "for_loop_argument", "numbers_pipeline_list_for_loop", "signed_number", 
			"number_float", "variable_from_command", "splitter_end_command", "block", 
			"expr_maker", "d_round_expr_maker", "d_round_expr", "variable_or_number", 
			"expr", "function", "select", "coprocess", "alphanumeric", "id", "case_break"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'-e'", "';;'", null, null, null, null, "'\"'", "';'", "'while'", 
			"'until'", "'for'", "'do'", "'done'", "'if'", "'then'", "'fi'", "'in'", 
			"'['", "']'", "'-eq'", "'='", null, "'-gt'", null, "'-lt'", null, "'%'", 
			"'&&'", "'||'", "'else'", "'elif'", "'case'", "'*)'", "';&'", "';;&'", 
			"'esac'", "'$'", null, "'$#'", null, null, null, null, null, "'|'", "'+'", 
			"'*'", "'?'", "'-'", "'/'", "'\\'", "'&'", "'('", "')'", "'{'", "'}'", 
			"'>'", "'<'", "'!'", "'function'", "'select'", "'coproc'", "'time'", 
			"'declare'", "'~'", "'..'", "'.'", null, null, "'-p'", "'_'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING", "CHARACTER_CHAIN", "COMMENT", "SINGLE_APOSTROPHE", 
			"APOSTROPHE", "SINGLE_SEMICOLON", "WHILE_LOOP_BEGIN", "UNTIL_LOOP_BEGIN", 
			"FOR_LOOP_BEGIN", "LOOP_MIDDLE", "LOOP_END", "IF_START", "IF_MIDDLE", 
			"IF_END", "LOOP_IN", "CONDITION_LEFT_SINGLE", "CONDITION_RIGHT_SINGLE", 
			"CONDITION_EQ", "EQ", "CONDITION_NEQ", "CONDITION_GT", "CONDITION_GE", 
			"CONDITION_LT", "CONDITION_LE", "MODULO", "CONDITION_DOUBLE_AMPERSAND", 
			"CONDITION_DOUBLE_PIPE", "ELSE", "ELSE_IF", "CASE_START", "CASE_DEFAULT", 
			"BRAKE_CONTINUATION", "BRAKE_WITH_NEXT_EXEC", "CASE_END", "DOLLAR_SIGN", 
			"VARIABLE", "SCRIPT_ARGUMENT_NUMBER", "SCRIPT_ARGUMENT", "BOOL", "HEX_NUMBER_WITHOUT_SIGN", 
			"OCTAL_NUMBER_WITHOUT_SIGN", "NEW_LINE", "PIPE", "PLUS", "WILDCARD_OR_MULTIPLY", 
			"WILDCARD", "MINUS", "DIVIDE", "LEFT_SLASH", "AMPERSAN", "L_PARENTH_ROUND", 
			"R_PARENTH_ROUND", "L_PARENTH_CURLY", "R_PARENTH_CURLY", "POINTER_RIGHT", 
			"POINTER_LEFT", "BOOL_NEGATION", "FUNCTION_START", "SELECT", "COPROCESS_START", 
			"TIME", "CREATE_VARABLE", "TILDA", "LAST_FOLDER", "THIS_FOLDER", "NUMBER", 
			"ALPHA", "MINUSP", "UNDERSCORE", "SPACE"
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
			setState(74);
			match(COMMENT);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(75);
				instruction();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				until_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				select();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				coprocess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				pipeline_list();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
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
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_symbols);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97);
					alphanumeric();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(BashGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BashGrammarParser.MINUS, i);
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
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(102);
				match(MINUS);
				}
				break;
			case 2:
				{
				{
				setState(103);
				match(MINUS);
				setState(104);
				match(MINUS);
				}
				}
				break;
			}
			setState(107);
			symbols();
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
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109);
					command();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(STRING);
				}
				break;
			case CHARACTER_CHAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(CHARACTER_CHAIN);
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				variable_from_command();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				argument();
				}
				break;
			case NUMBER:
			case ALPHA:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				symbols();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(VARIABLE);
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
	}

	public final Pipe_symbolContext pipe_symbol() throws RecognitionException {
		Pipe_symbolContext _localctx = new Pipe_symbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pipe_symbol);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(PIPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(PIPE);
				setState(124);
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
	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE_START() { return getToken(BashGrammarParser.CASE_START, 0); }
		public TerminalNode LOOP_IN() { return getToken(BashGrammarParser.LOOP_IN, 0); }
		public TerminalNode CASE_END() { return getToken(BashGrammarParser.CASE_END, 0); }
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
		public TerminalNode STRING() { return getToken(BashGrammarParser.STRING, 0); }
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public List<Single_caseContext> single_case() {
			return getRuleContexts(Single_caseContext.class);
		}
		public Single_caseContext single_case(int i) {
			return getRuleContext(Single_caseContext.class,i);
		}
		public TerminalNode CASE_DEFAULT() { return getToken(BashGrammarParser.CASE_DEFAULT, 0); }
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
		enterRule(_localctx, 14, RULE_case_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CASE_START);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(128);
				match(VARIABLE);
				}
				break;
			case STRING:
				{
				setState(129);
				match(STRING);
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(130);
				variable_from_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(LOOP_IN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(134);
				splitter_end_command();
				}
			}

			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				single_case();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE_DEFAULT) {
				{
				setState(142);
				match(CASE_DEFAULT);
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						instruction();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(151);
				splitter_end_command();
				}
			}

			setState(154);
			match(CASE_END);
			setState(155);
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
		public Case_breakContext case_break() {
			return getRuleContext(Case_breakContext.class,0);
		}
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(BashGrammarParser.NEW_LINE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(BashGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BashGrammarParser.STRING, i);
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
	}

	public final Single_caseContext single_case() throws RecognitionException {
		Single_caseContext _localctx = new Single_caseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_single_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ALPHA:
			case UNDERSCORE:
				{
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					alphanumeric();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				}
				break;
			case STRING:
				{
				setState(162);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(165);
				match(PIPE);
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case ALPHA:
				case UNDERSCORE:
					{
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(166);
						alphanumeric();
						}
						}
						setState(169); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
					}
					break;
				case STRING:
					{
					setState(171);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(179);
			match(R_PARENTH_ROUND);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180);
				match(NEW_LINE);
				}
				break;
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(183);
				instruction();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			case_break();
			setState(190);
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
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
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
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(192);
				match(TIME);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSP) {
					{
					setState(193);
					match(MINUSP);
					}
				}

				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL_NEGATION) {
				{
				setState(198);
				match(BOOL_NEGATION);
				}
			}

			setState(201);
			word();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(202);
				pipe_symbol();
				setState(203);
				word();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(210);
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
	}

	public final Pipeline_listContext pipeline_list() throws RecognitionException {
		Pipeline_listContext _localctx = new Pipeline_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pipeline_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(213);
					pipeline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			var();
			setState(219);
			match(EQ);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(220);
				pipeline();
				}
				break;
			case 2:
				{
				{
				setState(221);
				number_float();
				setState(222);
				splitter_end_command();
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(BashGrammarParser.ALPHA, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(BashGrammarParser.DOLLAR_SIGN, 0); }
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(BashGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BashGrammarParser.NUMBER, i);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR_SIGN) {
				{
				setState(226);
				match(DOLLAR_SIGN);
				}
			}

			setState(229);
			match(ALPHA);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(230);
					alphanumeric();
					}
					break;
				case 2:
					{
					setState(231);
					match(NUMBER);
					}
					break;
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
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
		enterRule(_localctx, 26, RULE_until_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(UNTIL_LOOP_BEGIN);
			setState(237);
			expr_maker(0);
			setState(238);
			splitter_end_command();
			setState(239);
			match(LOOP_MIDDLE);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(240);
				instruction();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(LOOP_END);
			setState(247);
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
		public Expr_makerContext expr_maker() {
			return getRuleContext(Expr_makerContext.class,0);
		}
		public List<Splitter_end_commandContext> splitter_end_command() {
			return getRuleContexts(Splitter_end_commandContext.class);
		}
		public Splitter_end_commandContext splitter_end_command(int i) {
			return getRuleContext(Splitter_end_commandContext.class,i);
		}
		public TerminalNode IF_MIDDLE() { return getToken(BashGrammarParser.IF_MIDDLE, 0); }
		public TerminalNode IF_END() { return getToken(BashGrammarParser.IF_END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<If_elsifContext> if_elsif() {
			return getRuleContexts(If_elsifContext.class);
		}
		public If_elsifContext if_elsif(int i) {
			return getRuleContext(If_elsifContext.class,i);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF_START);
			setState(250);
			expr_maker(0);
			setState(251);
			splitter_end_command();
			setState(252);
			match(IF_MIDDLE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(253);
				instruction();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(259);
				if_elsif();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(265);
				if_else();
				}
			}

			setState(268);
			match(IF_END);
			setState(269);
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
	public static class If_elsifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(BashGrammarParser.ELSE_IF, 0); }
		public Expr_makerContext expr_maker() {
			return getRuleContext(Expr_makerContext.class,0);
		}
		public Splitter_end_commandContext splitter_end_command() {
			return getRuleContext(Splitter_end_commandContext.class,0);
		}
		public TerminalNode IF_MIDDLE() { return getToken(BashGrammarParser.IF_MIDDLE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public If_elsifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterIf_elsif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitIf_elsif(this);
		}
	}

	public final If_elsifContext if_elsif() throws RecognitionException {
		If_elsifContext _localctx = new If_elsifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_elsif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ELSE_IF);
			setState(272);
			expr_maker(0);
			setState(273);
			splitter_end_command();
			setState(274);
			match(IF_MIDDLE);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(275);
				instruction();
				}
				}
				setState(280);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BashGrammarParser.ELSE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitIf_else(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ELSE);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(282);
				instruction();
				}
				}
				setState(287);
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
		enterRule(_localctx, 34, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(WHILE_LOOP_BEGIN);
			setState(289);
			expr_maker(0);
			setState(290);
			splitter_end_command();
			setState(291);
			match(LOOP_MIDDLE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(292);
				instruction();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(LOOP_END);
			setState(299);
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
		enterRule(_localctx, 36, RULE_for_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FOR_LOOP_BEGIN);
			setState(302);
			for_loop_argument();
			setState(303);
			match(LOOP_MIDDLE);
			setState(304);
			splitter_end_command();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					instruction();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(311);
				splitter_end_command();
				}
			}

			setState(314);
			match(LOOP_END);
			setState(315);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public D_round_exprContext d_round_expr() {
			return getRuleContext(D_round_exprContext.class,0);
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
	}

	public final For_loop_argumentContext for_loop_argument() throws RecognitionException {
		For_loop_argumentContext _localctx = new For_loop_argumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop_argument);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(L_PARENTH_ROUND);
				setState(318);
				match(L_PARENTH_ROUND);
				setState(319);
				expr(0);
				setState(320);
				match(SINGLE_SEMICOLON);
				setState(321);
				expr_maker(0);
				setState(322);
				match(SINGLE_SEMICOLON);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(323);
					expr(0);
					}
					break;
				case 2:
					{
					setState(324);
					assign();
					}
					break;
				case 3:
					{
					setState(325);
					d_round_expr();
					}
					break;
				}
				setState(328);
				match(R_PARENTH_ROUND);
				setState(329);
				match(R_PARENTH_ROUND);
				setState(330);
				splitter_end_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(332);
					alphanumeric();
					}
					}
					setState(335); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				setState(337);
				match(LOOP_IN);
				setState(338);
				numbers_pipeline_list_for_loop();
				setState(339);
				splitter_end_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(341);
					alphanumeric();
					}
					}
					setState(344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				setState(346);
				match(LOOP_IN);
				setState(347);
				variable_from_command();
				setState(348);
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
		public TerminalNode L_PARENTH_CURLY() { return getToken(BashGrammarParser.L_PARENTH_CURLY, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode LAST_FOLDER() { return getToken(BashGrammarParser.LAST_FOLDER, 0); }
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
		enterRule(_localctx, 40, RULE_numbers_pipeline_list_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(L_PARENTH_CURLY);
			setState(353);
			signed_number();
			setState(354);
			match(LAST_FOLDER);
			setState(355);
			signed_number();
			setState(356);
			match(R_PARENTH_CURLY);
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
		enterRule(_localctx, 42, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(358);
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

			setState(361);
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
		public List<TerminalNode> NUMBER() { return getTokens(BashGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BashGrammarParser.NUMBER, i);
		}
		public TerminalNode THIS_FOLDER() { return getToken(BashGrammarParser.THIS_FOLDER, 0); }
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
		enterRule(_localctx, 44, RULE_number_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(NUMBER);
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(364);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==THIS_FOLDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				match(NUMBER);
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
		enterRule(_localctx, 46, RULE_variable_from_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(DOLLAR_SIGN);
			setState(369);
			match(L_PARENTH_ROUND);
			setState(370);
			pipeline_list();
			setState(371);
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
		enterRule(_localctx, 48, RULE_splitter_end_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		public TerminalNode L_PARENTH_ROUND() { return getToken(BashGrammarParser.L_PARENTH_ROUND, 0); }
		public TerminalNode R_PARENTH_ROUND() { return getToken(BashGrammarParser.R_PARENTH_ROUND, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode L_PARENTH_CURLY() { return getToken(BashGrammarParser.L_PARENTH_CURLY, 0); }
		public TerminalNode R_PARENTH_CURLY() { return getToken(BashGrammarParser.R_PARENTH_CURLY, 0); }
		public TerminalNode NEW_LINE() { return getToken(BashGrammarParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 50, RULE_block);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(L_PARENTH_ROUND);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
					{
					{
					setState(376);
					instruction();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				match(R_PARENTH_ROUND);
				}
				break;
			case L_PARENTH_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(L_PARENTH_CURLY);
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(384);
					match(NEW_LINE);
					}
					break;
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
					{
					{
					setState(387);
					instruction();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
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
	}

	public final Expr_makerContext expr_maker() throws RecognitionException {
		return expr_maker(0);
	}

	private Expr_makerContext expr_maker(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_makerContext _localctx = new Expr_makerContext(_ctx, _parentState);
		Expr_makerContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr_maker, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(397);
				match(BOOL_NEGATION);
				setState(398);
				expr_maker(7);
				}
				break;
			case 2:
				{
				setState(399);
				match(TILDA);
				setState(400);
				expr(0);
				}
				break;
			case 3:
				{
				setState(401);
				match(L_PARENTH_ROUND);
				setState(402);
				d_round_expr_maker();
				setState(403);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				{
				setState(405);
				match(L_PARENTH_ROUND);
				setState(406);
				match(L_PARENTH_ROUND);
				setState(407);
				d_round_expr_maker();
				setState(408);
				match(R_PARENTH_ROUND);
				setState(409);
				match(R_PARENTH_ROUND);
				}
				break;
			case 5:
				{
				setState(411);
				match(CONDITION_LEFT_SINGLE);
				setState(412);
				match(CONDITION_LEFT_SINGLE);
				setState(413);
				d_round_expr_maker();
				setState(414);
				match(CONDITION_RIGHT_SINGLE);
				setState(415);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 6:
				{
				setState(417);
				match(CONDITION_LEFT_SINGLE);
				setState(418);
				d_round_expr_maker();
				setState(419);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_makerContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_maker);
					setState(423);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(424);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077569609531392L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(425);
					expr_maker(6);
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 54, RULE_d_round_expr_maker);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				d_round_expr();
				setState(432);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077569609531392L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
				d_round_expr_maker();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(L_PARENTH_ROUND);
				setState(436);
				d_round_expr_maker();
				setState(437);
				match(R_PARENTH_ROUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
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
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(BashGrammarParser.VARIABLE, 0); }
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
		enterRule(_localctx, 56, RULE_d_round_expr);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				expr(0);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(443);
					match(EQ);
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(444);
						match(EQ);
						}
					}

					}
					break;
				case 2:
					{
					setState(447);
					match(POINTER_RIGHT);
					}
					break;
				case 3:
					{
					setState(448);
					match(POINTER_RIGHT);
					setState(449);
					match(POINTER_RIGHT);
					}
					break;
				case 4:
					{
					setState(450);
					match(POINTER_LEFT);
					}
					break;
				case 5:
					{
					setState(451);
					match(POINTER_LEFT);
					setState(452);
					match(POINTER_LEFT);
					}
					break;
				case 6:
					{
					setState(453);
					match(CONDITION_LE);
					}
					break;
				case 7:
					{
					setState(454);
					match(CONDITION_EQ);
					}
					break;
				case 8:
					{
					setState(455);
					match(CONDITION_GE);
					}
					break;
				case 9:
					{
					setState(456);
					match(CONDITION_GT);
					}
					break;
				case 10:
					{
					setState(457);
					match(CONDITION_LT);
					}
					break;
				case 11:
					{
					setState(458);
					match(CONDITION_NEQ);
					}
					break;
				}
				setState(461);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				expr(0);
				setState(470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POINTER_LEFT:
					{
					setState(464);
					match(POINTER_LEFT);
					setState(465);
					match(EQ);
					}
					break;
				case POINTER_RIGHT:
					{
					setState(466);
					match(POINTER_RIGHT);
					setState(467);
					match(EQ);
					}
					break;
				case BOOL_NEGATION:
					{
					setState(468);
					match(BOOL_NEGATION);
					setState(469);
					match(EQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				variable_or_number();
				setState(480);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(476);
					match(PLUS);
					setState(477);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(478);
					match(MINUS);
					setState(479);
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
				setState(486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(482);
					match(PLUS);
					setState(483);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(484);
					match(MINUS);
					setState(485);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488);
				variable_or_number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				match(STRING);
				setState(490);
				match(EQ);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(491);
					match(EQ);
					}
				}

				setState(494);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(495);
				match(T__1);
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOLLAR_SIGN:
					{
					setState(496);
					variable_from_command();
					}
					break;
				case STRING:
					{
					setState(497);
					match(STRING);
					}
					break;
				case VARIABLE:
					{
					setState(498);
					match(VARIABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 58, RULE_variable_or_number);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(VARIABLE);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				id();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
		public TerminalNode STRING() { return getToken(BashGrammarParser.STRING, 0); }
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				{
				setState(509);
				match(L_PARENTH_ROUND);
				setState(510);
				expr(0);
				setState(511);
				match(R_PARENTH_ROUND);
				}
				break;
			case VARIABLE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case ALPHA:
				{
				setState(513);
				variable_or_number();
				}
				break;
			case STRING:
				{
				setState(514);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(517);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(518);
						match(PLUS);
						}
						break;
					case 2:
						{
						setState(519);
						match(MINUS);
						}
						break;
					case 3:
						{
						setState(520);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					case 4:
						{
						setState(521);
						match(DIVIDE);
						}
						break;
					case 5:
						{
						setState(522);
						match(MODULO);
						}
						break;
					case 6:
						{
						setState(523);
						match(WILDCARD_OR_MULTIPLY);
						setState(524);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					}
					setState(527);
					expr(5);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ALPHA:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533);
					alphanumeric();
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				setState(538);
				match(L_PARENTH_ROUND);
				setState(539);
				match(R_PARENTH_ROUND);
				setState(540);
				block();
				}
				break;
			case FUNCTION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(FUNCTION_START);
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(543);
					alphanumeric();
					}
					}
					setState(546); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(548);
					match(L_PARENTH_ROUND);
					setState(549);
					match(R_PARENTH_ROUND);
					}
					break;
				}
				setState(552);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
		enterRule(_localctx, 64, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(SELECT);
			setState(558); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557);
				alphanumeric();
				}
				}
				setState(560); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0) );
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP_IN) {
				{
				setState(562);
				match(LOOP_IN);
				setState(563);
				word();
				}
			}

			setState(566);
			splitter_end_command();
			setState(567);
			match(LOOP_MIDDLE);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1151759587104219536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 353L) != 0)) {
				{
				{
				setState(568);
				instruction();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
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
	}

	public final CoprocessContext coprocess() throws RecognitionException {
		CoprocessContext _localctx = new CoprocessContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_coprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(COPROCESS_START);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					alphanumeric();
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(583);
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
		public TerminalNode NUMBER() { return getToken(BashGrammarParser.NUMBER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(BashGrammarParser.UNDERSCORE, 0); }
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
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 11L) != 0)) ) {
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(ALPHA);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					alphanumeric();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
	public static class Case_breakContext extends ParserRuleContext {
		public Case_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).enterCase_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BashGrammarListener ) ((BashGrammarListener)listener).exitCase_break(this);
		}
	}

	public final Case_breakContext case_break() throws RecognitionException {
		Case_breakContext _localctx = new Case_breakContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_case_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__2);
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
		case 26:
			return expr_maker_sempred((Expr_makerContext)_localctx, predIndex);
		case 30:
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u0255\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0005\u0000M\b\u0000\n"+
		"\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001`\b\u0001"+
		"\u0001\u0002\u0004\u0002c\b\u0002\u000b\u0002\f\u0002d\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004o\b\u0004\u000b\u0004\f\u0004p\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005y\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001\u0007\u0004\u0007\u008b\b"+
		"\u0007\u000b\u0007\f\u0007\u008c\u0001\u0007\u0001\u0007\u0005\u0007\u0091"+
		"\b\u0007\n\u0007\f\u0007\u0094\t\u0007\u0003\u0007\u0096\b\u0007\u0001"+
		"\u0007\u0003\u0007\u0099\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0004\b\u009f\b\b\u000b\b\f\b\u00a0\u0001\b\u0003\b\u00a4\b\b\u0001"+
		"\b\u0001\b\u0004\b\u00a8\b\b\u000b\b\f\b\u00a9\u0001\b\u0003\b\u00ad\b"+
		"\b\u0005\b\u00af\b\b\n\b\f\b\u00b2\t\b\u0001\b\u0001\b\u0003\b\u00b6\b"+
		"\b\u0001\b\u0005\b\u00b9\b\b\n\b\f\b\u00bc\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0003\t\u00c3\b\t\u0003\t\u00c5\b\t\u0001\t\u0003\t\u00c8"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ce\b\t\n\t\f\t\u00d1\t"+
		"\t\u0001\t\u0003\t\u00d4\b\t\u0001\n\u0004\n\u00d7\b\n\u000b\n\f\n\u00d8"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e1\b\u000b\u0001\f\u0003\f\u00e4\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0004\f\u00e9\b\f\u000b\f\f\f\u00ea\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u00f2\b\r\n\r\f\r\u00f5\t\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ff"+
		"\b\u000e\n\u000e\f\u000e\u0102\t\u000e\u0001\u000e\u0005\u000e\u0105\b"+
		"\u000e\n\u000e\f\u000e\u0108\t\u000e\u0001\u000e\u0003\u000e\u010b\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0115\b\u000f\n\u000f\f\u000f\u0118"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u011c\b\u0010\n\u0010\f\u0010"+
		"\u011f\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0126\b\u0011\n\u0011\f\u0011\u0129\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0133\b\u0012\n\u0012\f\u0012\u0136\t\u0012\u0001\u0012"+
		"\u0003\u0012\u0139\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0147\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u014e\b\u0013\u000b\u0013"+
		"\f\u0013\u014f\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u0157\b\u0013\u000b\u0013\f\u0013\u0158\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015f\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003"+
		"\u0015\u0168\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u016f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u017a\b\u0019\n\u0019\f\u0019\u017d\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0182\b\u0019\u0001\u0019\u0005\u0019\u0185\b"+
		"\u0019\n\u0019\f\u0019\u0188\t\u0019\u0001\u0019\u0003\u0019\u018b\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01a6\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01ab\b\u001a\n\u001a\f\u001a\u01ae\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01b9\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01be\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01cc\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01d7\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01e1\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01e7\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01ed\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01f4\b\u001c\u0003\u001c\u01f6\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01fb\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0204\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u020e\b\u001e\u0001\u001e"+
		"\u0005\u001e\u0211\b\u001e\n\u001e\f\u001e\u0214\t\u001e\u0001\u001f\u0004"+
		"\u001f\u0217\b\u001f\u000b\u001f\f\u001f\u0218\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u0221\b\u001f"+
		"\u000b\u001f\f\u001f\u0222\u0001\u001f\u0001\u001f\u0003\u001f\u0227\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u022b\b\u001f\u0001 \u0001"+
		" \u0004 \u022f\b \u000b \f \u0230\u0001 \u0001 \u0003 \u0235\b \u0001"+
		" \u0001 \u0001 \u0005 \u023a\b \n \f \u023d\t \u0001 \u0001 \u0001!\u0001"+
		"!\u0005!\u0243\b!\n!\f!\u0246\t!\u0001!\u0001!\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0005#\u024e\b#\n#\f#\u0251\t#\u0001$\u0001$\u0001$\u0000\u0002"+
		"4<%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0005\u0002\u0000//22\u0002"+
		"\u0000\u0001\u0001DD\u0002\u0000\t\t--\u0003\u0000\u001d\u001e..55\u0002"+
		"\u0000EFHH\u02a4\u0000J\u0001\u0000\u0000\u0000\u0002_\u0001\u0000\u0000"+
		"\u0000\u0004b\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\b"+
		"n\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000"+
		"\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00c4\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000\u0000"+
		"\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00e3\u0001\u0000\u0000"+
		"\u0000\u001a\u00ec\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000\u0000"+
		"\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u0119\u0001\u0000\u0000\u0000"+
		"\"\u0120\u0001\u0000\u0000\u0000$\u012d\u0001\u0000\u0000\u0000&\u015e"+
		"\u0001\u0000\u0000\u0000(\u0160\u0001\u0000\u0000\u0000*\u0167\u0001\u0000"+
		"\u0000\u0000,\u016b\u0001\u0000\u0000\u0000.\u0170\u0001\u0000\u0000\u0000"+
		"0\u0175\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000\u00004\u01a5"+
		"\u0001\u0000\u0000\u00006\u01b8\u0001\u0000\u0000\u00008\u01f5\u0001\u0000"+
		"\u0000\u0000:\u01fa\u0001\u0000\u0000\u0000<\u0203\u0001\u0000\u0000\u0000"+
		">\u022a\u0001\u0000\u0000\u0000@\u022c\u0001\u0000\u0000\u0000B\u0240"+
		"\u0001\u0000\u0000\u0000D\u0249\u0001\u0000\u0000\u0000F\u024b\u0001\u0000"+
		"\u0000\u0000H\u0252\u0001\u0000\u0000\u0000JN\u0005\u0006\u0000\u0000"+
		"KM\u0003\u0002\u0001\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0000\u0000\u0001R\u0001"+
		"\u0001\u0000\u0000\u0000S`\u0005\u0006\u0000\u0000T`\u0003>\u001f\u0000"+
		"U`\u0003\u001c\u000e\u0000V`\u0003$\u0012\u0000W`\u0003\"\u0011\u0000"+
		"X`\u0003\u001a\r\u0000Y`\u0003\u000e\u0007\u0000Z`\u0003@ \u0000[`\u0003"+
		"B!\u0000\\`\u0003\u0016\u000b\u0000]`\u0003\u0014\n\u0000^`\u00030\u0018"+
		"\u0000_S\u0001\u0000\u0000\u0000_T\u0001\u0000\u0000\u0000_U\u0001\u0000"+
		"\u0000\u0000_V\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_X\u0001"+
		"\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000"+
		"_[\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_^\u0001\u0000\u0000\u0000`\u0003\u0001\u0000\u0000\u0000ac\u0003"+
		"D\"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0005\u0001\u0000\u0000"+
		"\u0000fj\u00052\u0000\u0000gh\u00052\u0000\u0000hj\u00052\u0000\u0000"+
		"if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0003\u0004\u0002\u0000l\u0007\u0001\u0000\u0000\u0000mo\u0003"+
		"\n\u0005\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\t\u0001\u0000\u0000\u0000"+
		"ry\u0005\u0004\u0000\u0000sy\u0005\u0005\u0000\u0000ty\u0003.\u0017\u0000"+
		"uy\u0003\u0006\u0003\u0000vy\u0003\u0004\u0002\u0000wy\u0005\'\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z~\u0005.\u0000\u0000{|\u0005"+
		".\u0000\u0000|~\u00055\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~\r\u0001\u0000\u0000\u0000\u007f\u0083\u0005!\u0000\u0000"+
		"\u0080\u0084\u0005\'\u0000\u0000\u0081\u0084\u0005\u0004\u0000\u0000\u0082"+
		"\u0084\u0003.\u0017\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u0012\u0000\u0000\u0086\u0088"+
		"\u00030\u0018\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0003"+
		"\u0010\b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0095\u0001\u0000\u0000\u0000\u008e\u0092\u0005\"\u0000"+
		"\u0000\u008f\u0091\u0003\u0002\u0001\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u00030\u0018\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005%\u0000\u0000\u009b\u009c\u00030\u0018\u0000\u009c\u000f"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0003D\"\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0005\u0004\u0000\u0000\u00a3\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00b0\u0001"+
		"\u0000\u0000\u0000\u00a5\u00ac\u0005.\u0000\u0000\u00a6\u00a8\u0003D\""+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0004\u0000"+
		"\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u00057\u0000\u0000"+
		"\u00b4\u00b6\u0005-\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00ba\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0003\u0002\u0001\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0003H$\u0000\u00be\u00bf\u0003"+
		"0\u0018\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005@\u0000"+
		"\u0000\u00c1\u00c3\u0005G\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005<\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cf\u0003\b\u0004\u0000\u00ca\u00cb"+
		"\u0003\f\u0006\u0000\u00cb\u00cc\u0003\b\u0004\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u00030\u0018\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0013\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u0003\u0012\t\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0015\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0003\u0018\f\u0000\u00db\u00e0\u0005\u0016\u0000\u0000"+
		"\u00dc\u00e1\u0003\u0012\t\u0000\u00dd\u00de\u0003,\u0016\u0000\u00de"+
		"\u00df\u00030\u0018\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1\u0017"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005&\u0000\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e8\u0005F\u0000\u0000\u00e6\u00e9\u0003D\""+
		"\u0000\u00e7\u00e9\u0005E\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u0019\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u000b\u0000\u0000"+
		"\u00ed\u00ee\u00034\u001a\u0000\u00ee\u00ef\u00030\u0018\u0000\u00ef\u00f3"+
		"\u0005\r\u0000\u0000\u00f0\u00f2\u0003\u0002\u0001\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"\u000e\u0000\u0000\u00f7\u00f8\u00030\u0018\u0000\u00f8\u001b\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fb\u00034\u001a"+
		"\u0000\u00fb\u00fc\u00030\u0018\u0000\u00fc\u0100\u0005\u0010\u0000\u0000"+
		"\u00fd\u00ff\u0003\u0002\u0001\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0106\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0105\u0003\u001e\u000f\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0003 \u0010\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u0011\u0000\u0000\u010d\u010e\u00030\u0018\u0000\u010e\u001d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005 \u0000\u0000\u0110\u0111\u0003"+
		"4\u001a\u0000\u0111\u0112\u00030\u0018\u0000\u0112\u0116\u0005\u0010\u0000"+
		"\u0000\u0113\u0115\u0003\u0002\u0001\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u001f\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011d\u0005\u001f\u0000"+
		"\u0000\u011a\u011c\u0003\u0002\u0001\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e!\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121"+
		"\u0122\u00034\u001a\u0000\u0122\u0123\u00030\u0018\u0000\u0123\u0127\u0005"+
		"\r\u0000\u0000\u0124\u0126\u0003\u0002\u0001\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u000e"+
		"\u0000\u0000\u012b\u012c\u00030\u0018\u0000\u012c#\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005\f\u0000\u0000\u012e\u012f\u0003&\u0013\u0000\u012f"+
		"\u0130\u0005\r\u0000\u0000\u0130\u0134\u00030\u0018\u0000\u0131\u0133"+
		"\u0003\u0002\u0001\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u0139\u00030\u0018\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005\u000e\u0000\u0000\u013b\u013c\u0003"+
		"0\u0018\u0000\u013c%\u0001\u0000\u0000\u0000\u013d\u013e\u00056\u0000"+
		"\u0000\u013e\u013f\u00056\u0000\u0000\u013f\u0140\u0003<\u001e\u0000\u0140"+
		"\u0141\u0005\t\u0000\u0000\u0141\u0142\u00034\u001a\u0000\u0142\u0146"+
		"\u0005\t\u0000\u0000\u0143\u0147\u0003<\u001e\u0000\u0144\u0147\u0003"+
		"\u0016\u000b\u0000\u0145\u0147\u00038\u001c\u0000\u0146\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u00057\u0000"+
		"\u0000\u0149\u014a\u00057\u0000\u0000\u014a\u014b\u00030\u0018\u0000\u014b"+
		"\u015f\u0001\u0000\u0000\u0000\u014c\u014e\u0003D\"\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0012\u0000\u0000\u0152\u0153"+
		"\u0003(\u0014\u0000\u0153\u0154\u00030\u0018\u0000\u0154\u015f\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0003D\"\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005\u0012\u0000\u0000\u015b\u015c\u0003.\u0017\u0000"+
		"\u015c\u015d\u00030\u0018\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e"+
		"\u013d\u0001\u0000\u0000\u0000\u015e\u014d\u0001\u0000\u0000\u0000\u015e"+
		"\u0156\u0001\u0000\u0000\u0000\u015f\'\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u00058\u0000\u0000\u0161\u0162\u0003*\u0015\u0000\u0162\u0163\u0005C"+
		"\u0000\u0000\u0163\u0164\u0003*\u0015\u0000\u0164\u0165\u00059\u0000\u0000"+
		"\u0165)\u0001\u0000\u0000\u0000\u0166\u0168\u0007\u0000\u0000\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0003,\u0016\u0000\u016a+\u0001"+
		"\u0000\u0000\u0000\u016b\u016e\u0005E\u0000\u0000\u016c\u016d\u0007\u0001"+
		"\u0000\u0000\u016d\u016f\u0005E\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f-\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005&\u0000\u0000\u0171\u0172\u00056\u0000\u0000\u0172\u0173"+
		"\u0003\u0014\n\u0000\u0173\u0174\u00057\u0000\u0000\u0174/\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0007\u0002\u0000\u0000\u01761\u0001\u0000\u0000"+
		"\u0000\u0177\u017b\u00056\u0000\u0000\u0178\u017a\u0003\u0002\u0001\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u018b\u00057\u0000\u0000\u017f\u0181\u00058\u0000\u0000\u0180\u0182"+
		"\u0005-\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0186\u0001\u0000\u0000\u0000\u0183\u0185\u0003"+
		"\u0002\u0001\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u00059\u0000\u0000\u018a\u0177\u0001\u0000"+
		"\u0000\u0000\u018a\u017f\u0001\u0000\u0000\u0000\u018b3\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0006\u001a\uffff\uffff\u0000\u018d\u018e\u0005<\u0000"+
		"\u0000\u018e\u01a6\u00034\u001a\u0007\u018f\u0190\u0005B\u0000\u0000\u0190"+
		"\u01a6\u0003<\u001e\u0000\u0191\u0192\u00056\u0000\u0000\u0192\u0193\u0003"+
		"6\u001b\u0000\u0193\u0194\u00057\u0000\u0000\u0194\u01a6\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u00056\u0000\u0000\u0196\u0197\u00056\u0000\u0000\u0197"+
		"\u0198\u00036\u001b\u0000\u0198\u0199\u00057\u0000\u0000\u0199\u019a\u0005"+
		"7\u0000\u0000\u019a\u01a6\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0013"+
		"\u0000\u0000\u019c\u019d\u0005\u0013\u0000\u0000\u019d\u019e\u00036\u001b"+
		"\u0000\u019e\u019f\u0005\u0014\u0000\u0000\u019f\u01a0\u0005\u0014\u0000"+
		"\u0000\u01a0\u01a6\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0013\u0000"+
		"\u0000\u01a2\u01a3\u00036\u001b\u0000\u01a3\u01a4\u0005\u0014\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u018c\u0001\u0000\u0000\u0000"+
		"\u01a5\u018f\u0001\u0000\u0000\u0000\u01a5\u0191\u0001\u0000\u0000\u0000"+
		"\u01a5\u0195\u0001\u0000\u0000\u0000\u01a5\u019b\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a6\u01ac\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\n\u0005\u0000\u0000\u01a8\u01a9\u0007\u0003\u0000\u0000\u01a9"+
		"\u01ab\u00034\u001a\u0006\u01aa\u01a7\u0001\u0000\u0000\u0000\u01ab\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad5\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u00038\u001c\u0000\u01b0\u01b1\u0007\u0003"+
		"\u0000\u0000\u01b1\u01b2\u00036\u001b\u0000\u01b2\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u00056\u0000\u0000\u01b4\u01b5\u00036\u001b\u0000\u01b5"+
		"\u01b6\u00057\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b9"+
		"\u00038\u001c\u0000\u01b8\u01af\u0001\u0000\u0000\u0000\u01b8\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b97\u0001\u0000"+
		"\u0000\u0000\u01ba\u01cb\u0003<\u001e\u0000\u01bb\u01bd\u0005\u0016\u0000"+
		"\u0000\u01bc\u01be\u0005\u0016\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01cc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01cc\u0005:\u0000\u0000\u01c0\u01c1\u0005:\u0000\u0000\u01c1"+
		"\u01cc\u0005:\u0000\u0000\u01c2\u01cc\u0005;\u0000\u0000\u01c3\u01c4\u0005"+
		";\u0000\u0000\u01c4\u01cc\u0005;\u0000\u0000\u01c5\u01cc\u0005\u001b\u0000"+
		"\u0000\u01c6\u01cc\u0005\u0015\u0000\u0000\u01c7\u01cc\u0005\u0019\u0000"+
		"\u0000\u01c8\u01cc\u0005\u0018\u0000\u0000\u01c9\u01cc\u0005\u001a\u0000"+
		"\u0000\u01ca\u01cc\u0005\u0017\u0000\u0000\u01cb\u01bb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cb\u01c0\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c2\u0001\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c6\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0003<\u001e\u0000"+
		"\u01ce\u01f6\u0001\u0000\u0000\u0000\u01cf\u01d6\u0003<\u001e\u0000\u01d0"+
		"\u01d1\u0005;\u0000\u0000\u01d1\u01d7\u0005\u0016\u0000\u0000\u01d2\u01d3"+
		"\u0005:\u0000\u0000\u01d3\u01d7\u0005\u0016\u0000\u0000\u01d4\u01d5\u0005"+
		"<\u0000\u0000\u01d5\u01d7\u0005\u0016\u0000\u0000\u01d6\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d2\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003<\u001e"+
		"\u0000\u01d9\u01f6\u0001\u0000\u0000\u0000\u01da\u01f6\u0005*\u0000\u0000"+
		"\u01db\u01e0\u0003:\u001d\u0000\u01dc\u01dd\u0005/\u0000\u0000\u01dd\u01e1"+
		"\u0005/\u0000\u0000\u01de\u01df\u00052\u0000\u0000\u01df\u01e1\u00052"+
		"\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e1\u01f6\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005/\u0000"+
		"\u0000\u01e3\u01e7\u0005/\u0000\u0000\u01e4\u01e5\u00052\u0000\u0000\u01e5"+
		"\u01e7\u00052\u0000\u0000\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01f6"+
		"\u0003:\u001d\u0000\u01e9\u01ea\u0005\u0004\u0000\u0000\u01ea\u01ec\u0005"+
		"\u0016\u0000\u0000\u01eb\u01ed\u0005\u0016\u0000\u0000\u01ec\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f6\u0005\u0004\u0000\u0000\u01ef\u01f3\u0005"+
		"\u0002\u0000\u0000\u01f0\u01f4\u0003.\u0017\u0000\u01f1\u01f4\u0005\u0004"+
		"\u0000\u0000\u01f2\u01f4\u0005\'\u0000\u0000\u01f3\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01ba\u0001\u0000\u0000"+
		"\u0000\u01f5\u01cf\u0001\u0000\u0000\u0000\u01f5\u01da\u0001\u0000\u0000"+
		"\u0000\u01f5\u01db\u0001\u0000\u0000\u0000\u01f5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01f5\u01e9\u0001\u0000\u0000\u0000\u01f5\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f69\u0001\u0000\u0000\u0000\u01f7\u01fb\u0005\'\u0000\u0000"+
		"\u01f8\u01fb\u0003F#\u0000\u01f9\u01fb\u0003*\u0015\u0000\u01fa\u01f7"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fb;\u0001\u0000\u0000\u0000\u01fc\u01fd\u0006"+
		"\u001e\uffff\uffff\u0000\u01fd\u01fe\u00056\u0000\u0000\u01fe\u01ff\u0003"+
		"<\u001e\u0000\u01ff\u0200\u00057\u0000\u0000\u0200\u0204\u0001\u0000\u0000"+
		"\u0000\u0201\u0204\u0003:\u001d\u0000\u0202\u0204\u0005\u0004\u0000\u0000"+
		"\u0203\u01fc\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0212\u0001\u0000\u0000\u0000"+
		"\u0205\u020d\n\u0004\u0000\u0000\u0206\u020e\u0005/\u0000\u0000\u0207"+
		"\u020e\u00052\u0000\u0000\u0208\u020e\u00050\u0000\u0000\u0209\u020e\u0005"+
		"3\u0000\u0000\u020a\u020e\u0005\u001c\u0000\u0000\u020b\u020c\u00050\u0000"+
		"\u0000\u020c\u020e\u00050\u0000\u0000\u020d\u0206\u0001\u0000\u0000\u0000"+
		"\u020d\u0207\u0001\u0000\u0000\u0000\u020d\u0208\u0001\u0000\u0000\u0000"+
		"\u020d\u0209\u0001\u0000\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000"+
		"\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u0003<\u001e\u0005\u0210\u0205\u0001\u0000\u0000\u0000\u0211"+
		"\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213=\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0215\u0217\u0003D\"\u0000\u0216\u0215\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0216\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u00056\u0000\u0000\u021b\u021c\u00057\u0000"+
		"\u0000\u021c\u021d\u00032\u0019\u0000\u021d\u022b\u0001\u0000\u0000\u0000"+
		"\u021e\u0220\u0005=\u0000\u0000\u021f\u0221\u0003D\"\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0226"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u00056\u0000\u0000\u0225\u0227\u0005"+
		"7\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u00032\u0019"+
		"\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0216\u0001\u0000\u0000"+
		"\u0000\u022a\u021e\u0001\u0000\u0000\u0000\u022b?\u0001\u0000\u0000\u0000"+
		"\u022c\u022e\u0005>\u0000\u0000\u022d\u022f\u0003D\"\u0000\u022e\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0234"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0005\u0012\u0000\u0000\u0233\u0235"+
		"\u0003\b\u0004\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0003"+
		"0\u0018\u0000\u0237\u023b\u0005\r\u0000\u0000\u0238\u023a\u0003\u0002"+
		"\u0001\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000"+
		"\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000"+
		"\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0005\u000e\u0000\u0000\u023fA\u0001\u0000\u0000"+
		"\u0000\u0240\u0244\u0005?\u0000\u0000\u0241\u0243\u0003D\"\u0000\u0242"+
		"\u0241\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247"+
		"\u0248\u0003\b\u0004\u0000\u0248C\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0007\u0004\u0000\u0000\u024aE\u0001\u0000\u0000\u0000\u024b\u024f\u0005"+
		"F\u0000\u0000\u024c\u024e\u0003D\"\u0000\u024d\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250G\u0001\u0000\u0000\u0000"+
		"\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u0003\u0000\u0000"+
		"\u0253I\u0001\u0000\u0000\u0000IN_dipx}\u0083\u0087\u008c\u0092\u0095"+
		"\u0098\u00a0\u00a3\u00a9\u00ac\u00b0\u00b5\u00ba\u00c2\u00c4\u00c7\u00cf"+
		"\u00d3\u00d8\u00e0\u00e3\u00e8\u00ea\u00f3\u0100\u0106\u010a\u0116\u011d"+
		"\u0127\u0134\u0138\u0146\u014f\u0158\u015e\u0167\u016e\u017b\u0181\u0186"+
		"\u018a\u01a5\u01ac\u01b8\u01bd\u01cb\u01d6\u01e0\u01e6\u01ec\u01f3\u01f5"+
		"\u01fa\u0203\u020d\u0212\u0218\u0222\u0226\u022a\u0230\u0234\u023b\u0244"+
		"\u024f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}