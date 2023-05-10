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
		T__0=1, SPACE=2, TAB=3, COMMENT=4, SINGLE_APOSTROPHE=5, APOSTROPHE=6, 
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
		NUMBER=68, ALPHANUMERIC=69, ALPHA=70, DIGIT=71, MINUSP=72;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_case_statement = 2, RULE_single_case = 3, 
		RULE_until_loop = 4, RULE_if_statement = 5, RULE_while_loop = 6, RULE_for_loop = 7, 
		RULE_for_loop_argument = 8, RULE_numbers_pipeline_list_for_loop = 9, RULE_signed_number = 10, 
		RULE_number_float = 11, RULE_variable_from_command = 12, RULE_splitter_end_command = 13, 
		RULE_block = 14, RULE_expr_maker = 15, RULE_d_round_expr_maker = 16, RULE_d_round_expr = 17, 
		RULE_variable_or_number = 18, RULE_expr = 19, RULE_symbols = 20, RULE_argument = 21, 
		RULE_word = 22, RULE_command = 23, RULE_pipe_symbol = 24, RULE_pipeline = 25, 
		RULE_pipeline_list = 26, RULE_function = 27, RULE_select = 28, RULE_coprocess = 29, 
		RULE_id = 30, RULE_string = 31, RULE_character_chain = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "case_statement", "single_case", "until_loop", 
			"if_statement", "while_loop", "for_loop", "for_loop_argument", "numbers_pipeline_list_for_loop", 
			"signed_number", "number_float", "variable_from_command", "splitter_end_command", 
			"block", "expr_maker", "d_round_expr_maker", "d_round_expr", "variable_or_number", 
			"expr", "symbols", "argument", "word", "command", "pipe_symbol", "pipeline", 
			"pipeline_list", "function", "select", "coprocess", "id", "string", "character_chain"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "' '", null, null, null, "'\"'", "';'", "'while'", "'until'", 
			"'for'", "'do'", "'done'", "'if'", "'then'", "'fi'", "'in'", "'['", "']'", 
			"'-eq'", "'='", null, "'-gt'", null, "'-lt'", null, "'%'", "'&&'", "'||'", 
			"'else'", "'elif'", "'case'", "'*)'", "';;'", "';&'", "';;&'", "'esac'", 
			"'$'", null, "'$#'", null, null, null, null, null, "'|'", "'+'", "'*'", 
			"'?'", "'-'", "'/'", "'\\'", "'&'", "'('", "')'", "'{'", "'}'", "'>'", 
			"'<'", "'!'", "'function'", "'select'", "'coproc'", "'time'", "'declare'", 
			"'~'", "'..'", "'.'", null, null, null, null, "'-p'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SPACE", "TAB", "COMMENT", "SINGLE_APOSTROPHE", "APOSTROPHE", 
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
			"ALPHA", "DIGIT", "MINUSP"
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
			setState(66);
			match(COMMENT);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
				{
				{
				setState(67);
				instruction();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				until_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				select();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				coprocess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				pipeline_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
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
			setState(88);
			match(CASE_START);
			setState(89);
			match(VARIABLE);
			setState(90);
			match(LOOP_IN);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(91);
				splitter_end_command();
				}
			}

			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				single_case();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APOSTROPHE || _la==ALPHANUMERIC );
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE_DEFAULT) {
				{
				setState(99);
				match(CASE_DEFAULT);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
					{
					{
					setState(100);
					instruction();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(BRAKE_ABSOLUTE);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(109);
				splitter_end_command();
				}
			}

			setState(112);
			match(CASE_END);
			setState(113);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				{
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(ALPHANUMERIC);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				}
				break;
			case APOSTROPHE:
				{
				setState(120);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(123);
				match(PIPE);
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALPHANUMERIC:
					{
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(124);
						match(ALPHANUMERIC);
						}
						}
						setState(127); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ALPHANUMERIC );
					}
					break;
				case APOSTROPHE:
					{
					setState(129);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
			setState(137);
			match(R_PARENTH_ROUND);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				splitter_end_command();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
				{
				{
				setState(141);
				instruction();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(BRAKE_ABSOLUTE);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(148);
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
			setState(151);
			match(UNTIL_LOOP_BEGIN);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(152);
				match(VARIABLE);
				}
				break;
			case DOLLAR_SIGN:
				{
				setState(153);
				variable_from_command();
				setState(154);
				expr_maker(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			splitter_end_command();
			setState(159);
			match(LOOP_MIDDLE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
				{
				{
				setState(160);
				instruction();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(LOOP_END);
			setState(167);
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
			setState(169);
			match(IF_START);
			setState(170);
			expr_maker(0);
			setState(171);
			splitter_end_command();
			setState(172);
			match(IF_MIDDLE);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
				{
				{
				setState(173);
				instruction();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(179);
				match(ELSE_IF);
				setState(180);
				expr_maker(0);
				setState(181);
				splitter_end_command();
				setState(182);
				match(IF_MIDDLE);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
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
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(194);
				match(ELSE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
					{
					{
					setState(195);
					instruction();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			match(IF_END);
			setState(204);
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
			setState(206);
			match(WHILE_LOOP_BEGIN);
			setState(207);
			expr_maker(0);
			setState(208);
			splitter_end_command();
			setState(209);
			match(LOOP_MIDDLE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -575880070577510416L) != 0) || _la==ALPHANUMERIC) {
				{
				{
				setState(210);
				instruction();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(LOOP_END);
			setState(217);
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
			setState(219);
			match(FOR_LOOP_BEGIN);
			setState(220);
			for_loop_argument();
			setState(221);
			match(LOOP_MIDDLE);
			setState(222);
			splitter_end_command();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					instruction();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_SEMICOLON || _la==NEW_LINE) {
				{
				setState(229);
				splitter_end_command();
				}
			}

			setState(232);
			match(LOOP_END);
			setState(233);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(L_PARENTH_ROUND);
				setState(236);
				match(L_PARENTH_ROUND);
				setState(237);
				match(SINGLE_SEMICOLON);
				setState(238);
				expr_maker(0);
				setState(239);
				match(SINGLE_SEMICOLON);
				setState(240);
				match(R_PARENTH_ROUND);
				setState(241);
				match(R_PARENTH_ROUND);
				setState(242);
				splitter_end_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					match(ALPHANUMERIC);
					}
					}
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(249);
				match(LOOP_IN);
				setState(250);
				numbers_pipeline_list_for_loop();
				setState(251);
				splitter_end_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					match(ALPHANUMERIC);
					}
					}
					setState(256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(258);
				match(LOOP_IN);
				setState(259);
				variable_from_command();
				setState(260);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					signed_number();
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 4194313L) != 0) );
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

				}
				break;
			case L_PARENTH_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(L_PARENTH_CURLY);
				setState(274);
				signed_number();
				setState(275);
				match(LAST_FOLDER);
				setState(276);
				signed_number();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAST_FOLDER) {
					{
					setState(277);
					match(LAST_FOLDER);
					setState(278);
					signed_number();
					}
				}

				setState(281);
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
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(285);
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

			setState(288);
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
			setState(290);
			match(NUMBER);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==THIS_FOLDER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						match(DIGIT);
						}
						} 
					}
					setState(297);
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
			setState(300);
			match(DOLLAR_SIGN);
			setState(301);
			match(L_PARENTH_ROUND);
			setState(302);
			pipeline_list();
			setState(303);
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
			setState(305);
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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(L_PARENTH_ROUND);
				setState(308);
				pipeline_list();
				setState(309);
				match(R_PARENTH_ROUND);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(L_PARENTH_CURLY);
				setState(312);
				pipeline_list();
				setState(313);
				match(R_PARENTH_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(L_PARENTH_ROUND);
				setState(316);
				match(L_PARENTH_ROUND);
				setState(317);
				expr(0);
				setState(318);
				match(R_PARENTH_ROUND);
				setState(319);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(CONDITION_LEFT_SINGLE);
				setState(322);
				expr(0);
				setState(323);
				match(CONDITION_RIGHT_SINGLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(CONDITION_LEFT_SINGLE);
				setState(326);
				match(CONDITION_LEFT_SINGLE);
				setState(327);
				expr(0);
				setState(328);
				match(CONDITION_RIGHT_SINGLE);
				setState(329);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(334);
				match(BOOL_NEGATION);
				setState(335);
				expr_maker(5);
				}
				break;
			case 2:
				{
				setState(336);
				match(TILDA);
				setState(337);
				expr(0);
				}
				break;
			case 3:
				{
				setState(338);
				match(L_PARENTH_ROUND);
				setState(339);
				match(L_PARENTH_ROUND);
				setState(340);
				d_round_expr_maker();
				setState(341);
				match(R_PARENTH_ROUND);
				setState(342);
				match(R_PARENTH_ROUND);
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
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
					setState(347);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(348);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4538784402112512L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					expr_maker(4);
					}
					} 
				}
				setState(354);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				d_round_expr();
				setState(356);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4538784402112512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				d_round_expr_maker();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(L_PARENTH_ROUND);
				setState(360);
				d_round_expr_maker();
				setState(361);
				match(R_PARENTH_ROUND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				expr(0);
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(367);
					match(EQ);
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(368);
						match(EQ);
						}
					}

					}
					break;
				case 2:
					{
					setState(371);
					match(POINTER_RIGHT);
					}
					break;
				case 3:
					{
					setState(372);
					match(POINTER_RIGHT);
					setState(373);
					match(POINTER_RIGHT);
					}
					break;
				case 4:
					{
					setState(374);
					match(POINTER_LEFT);
					}
					break;
				case 5:
					{
					setState(375);
					match(POINTER_LEFT);
					setState(376);
					match(POINTER_LEFT);
					}
					break;
				}
				setState(379);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				expr(0);
				setState(388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POINTER_LEFT:
					{
					setState(382);
					match(POINTER_LEFT);
					setState(383);
					match(EQ);
					}
					break;
				case POINTER_RIGHT:
					{
					setState(384);
					match(POINTER_RIGHT);
					setState(385);
					match(EQ);
					}
					break;
				case BOOL_NEGATION:
					{
					setState(386);
					match(BOOL_NEGATION);
					setState(387);
					match(EQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(390);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				variable_or_number();
				setState(398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(394);
					match(PLUS);
					setState(395);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(396);
					match(MINUS);
					setState(397);
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
				setState(404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(400);
					match(PLUS);
					setState(401);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(402);
					match(MINUS);
					setState(403);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406);
				variable_or_number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				string();
				setState(408);
				match(EQ);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(409);
					match(EQ);
					}
				}

				setState(412);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(VARIABLE);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				id();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
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
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARENTH_ROUND:
				{
				setState(422);
				match(L_PARENTH_ROUND);
				setState(423);
				expr(0);
				setState(424);
				match(R_PARENTH_ROUND);
				}
				break;
			case VARIABLE:
			case PLUS:
			case MINUS:
			case NUMBER:
			case ALPHA:
				{
				setState(426);
				variable_or_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
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
					setState(429);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(430);
						match(PLUS);
						}
						break;
					case 2:
						{
						setState(431);
						match(MINUS);
						}
						break;
					case 3:
						{
						setState(432);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					case 4:
						{
						setState(433);
						match(DIVIDE);
						}
						break;
					case 5:
						{
						setState(434);
						match(MODULO);
						}
						break;
					case 6:
						{
						setState(435);
						match(WILDCARD_OR_MULTIPLY);
						setState(436);
						match(WILDCARD_OR_MULTIPLY);
						}
						break;
					}
					setState(439);
					expr(4);
					}
					} 
				}
				setState(444);
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
			setState(446); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(445);
					match(ALPHANUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448); 
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
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(450);
				match(MINUS);
				}
				break;
			case 2:
				{
				{
				setState(451);
				match(MINUS);
				setState(452);
				match(MINUS);
				}
				}
				break;
			}
			setState(456); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(455);
					match(ALPHANUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(458); 
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
		enterRule(_localctx, 44, RULE_word);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(460);
					command();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(463); 
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
	public static class CommandContext extends ParserRuleContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Character_chainContext character_chain() {
			return getRuleContext(Character_chainContext.class,0);
		}
		public Variable_from_commandContext variable_from_command() {
			return getRuleContext(Variable_from_commandContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
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
		enterRule(_localctx, 46, RULE_command);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				symbols();
				}
				break;
			case APOSTROPHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				string();
				}
				break;
			case SINGLE_APOSTROPHE:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				character_chain();
				}
				break;
			case DOLLAR_SIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				variable_from_command();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				argument();
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
		enterRule(_localctx, 48, RULE_pipe_symbol);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(PIPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(PIPE);
				setState(474);
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
		enterRule(_localctx, 50, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(477);
				match(TIME);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUSP) {
					{
					setState(478);
					match(MINUSP);
					}
				}

				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL_NEGATION) {
				{
				setState(483);
				match(BOOL_NEGATION);
				}
			}

			setState(486);
			word();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(487);
				pipe_symbol();
				setState(488);
				word();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
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
		enterRule(_localctx, 52, RULE_pipeline_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(497);
					pipeline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 54, RULE_function);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(502);
					match(ALPHANUMERIC);
					}
					}
					setState(505); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(507);
				match(L_PARENTH_ROUND);
				setState(508);
				match(R_PARENTH_ROUND);
				setState(509);
				block();
				}
				break;
			case FUNCTION_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(FUNCTION_START);
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(511);
					match(ALPHANUMERIC);
					}
					}
					setState(514); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHANUMERIC );
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(516);
					match(L_PARENTH_ROUND);
					setState(517);
					match(R_PARENTH_ROUND);
					}
					break;
				}
				setState(520);
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
		enterRule(_localctx, 56, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(SELECT);
			setState(525); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(524);
				match(ALPHANUMERIC);
				}
				}
				setState(527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHANUMERIC );
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOOP_IN) {
				{
				setState(529);
				match(LOOP_IN);
				setState(530);
				word();
				}
			}

			setState(533);
			splitter_end_command();
			setState(534);
			match(LOOP_MIDDLE);
			setState(535);
			pipeline_list();
			setState(536);
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
		enterRule(_localctx, 58, RULE_coprocess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(COPROCESS_START);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(545);
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
		enterRule(_localctx, 60, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(ALPHA);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					match(ALPHANUMERIC);
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		enterRule(_localctx, 62, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(APOSTROPHE);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -66L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) {
				{
				{
				setState(555);
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
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
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
		enterRule(_localctx, 64, RULE_character_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(SINGLE_APOSTROPHE);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -34L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 511L) != 0)) {
				{
				{
				setState(564);
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
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
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
		"\u0004\u0001H\u023d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002"+
		"\u0001\u0002\u0004\u0002`\b\u0002\u000b\u0002\f\u0002a\u0001\u0002\u0001"+
		"\u0002\u0005\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002\u0001\u0002\u0003"+
		"\u0002l\b\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0004\u0003u\b\u0003\u000b\u0003\f\u0003v\u0001"+
		"\u0003\u0003\u0003z\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003~\b\u0003"+
		"\u000b\u0003\f\u0003\u007f\u0001\u0003\u0003\u0003\u0083\b\u0003\u0005"+
		"\u0003\u0085\b\u0003\n\u0003\f\u0003\u0088\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u008c\b\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n\u0003"+
		"\f\u0003\u0092\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0096\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a2\b"+
		"\u0004\n\u0004\f\u0004\u00a5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00af\b\u0005\n\u0005\f\u0005\u00b2\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b9\b\u0005\n\u0005\f\u0005"+
		"\u00bc\t\u0005\u0005\u0005\u00be\b\u0005\n\u0005\f\u0005\u00c1\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00c5\b\u0005\n\u0005\f\u0005\u00c8"+
		"\t\u0005\u0003\u0005\u00ca\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00d4\b\u0006\n\u0006\f\u0006\u00d7\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00e1\b\u0007\n\u0007\f\u0007\u00e4\t\u0007\u0001\u0007\u0003\u0007"+
		"\u00e7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00f6"+
		"\b\b\u000b\b\f\b\u00f7\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b"+
		"\u00ff\b\b\u000b\b\f\b\u0100\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0107"+
		"\b\b\u0001\t\u0004\t\u010a\b\t\u000b\t\f\t\u010b\u0001\t\u0001\t\u0003"+
		"\t\u0110\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0118"+
		"\b\t\u0001\t\u0001\t\u0003\t\u011c\b\t\u0001\n\u0003\n\u011f\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0126\b\u000b"+
		"\n\u000b\f\u000b\u0129\t\u000b\u0003\u000b\u012b\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014c\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u015a\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u015f"+
		"\b\u000f\n\u000f\f\u000f\u0162\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u016d\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0172\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u017a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0185\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u018f\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0195\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u019b\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u019f\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01a4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ac\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01b6\b\u0013\u0001\u0013\u0005\u0013\u01b9\b"+
		"\u0013\n\u0013\f\u0013\u01bc\t\u0013\u0001\u0014\u0004\u0014\u01bf\b\u0014"+
		"\u000b\u0014\f\u0014\u01c0\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01c6\b\u0015\u0001\u0015\u0004\u0015\u01c9\b\u0015\u000b\u0015\f\u0015"+
		"\u01ca\u0001\u0016\u0004\u0016\u01ce\b\u0016\u000b\u0016\f\u0016\u01cf"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01d7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01dc\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01e0\b\u0019\u0003\u0019\u01e2"+
		"\b\u0019\u0001\u0019\u0003\u0019\u01e5\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01eb\b\u0019\n\u0019\f\u0019\u01ee"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u01f3\b\u001a"+
		"\u000b\u001a\f\u001a\u01f4\u0001\u001b\u0004\u001b\u01f8\b\u001b\u000b"+
		"\u001b\f\u001b\u01f9\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u0201\b\u001b\u000b\u001b\f\u001b\u0202\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0207\b\u001b\u0001\u001b\u0003\u001b\u020a\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u020e\b\u001c\u000b\u001c\f"+
		"\u001c\u020f\u0001\u001c\u0001\u001c\u0003\u001c\u0214\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u021d\b\u001d\n\u001d\f\u001d\u0220\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0226\b\u001e\n\u001e\f\u001e"+
		"\u0229\t\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u022d\b\u001f\n\u001f"+
		"\f\u001f\u0230\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u0236"+
		"\b \n \f \u0239\t \u0001 \u0001 \u0001 \u0000\u0002\u001e&!\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@\u0000\u0006\u0002\u0000..11\u0002\u0000\u0001\u0001"+
		"CC\u0002\u0000\u0007\u0007,,\u0003\u0000\u001b\u001c--44\u0001\u0000\u0006"+
		"\u0006\u0001\u0000\u0005\u0005\u0282\u0000B\u0001\u0000\u0000\u0000\u0002"+
		"V\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006y\u0001"+
		"\u0000\u0000\u0000\b\u0097\u0001\u0000\u0000\u0000\n\u00a9\u0001\u0000"+
		"\u0000\u0000\f\u00ce\u0001\u0000\u0000\u0000\u000e\u00db\u0001\u0000\u0000"+
		"\u0000\u0010\u0106\u0001\u0000\u0000\u0000\u0012\u011b\u0001\u0000\u0000"+
		"\u0000\u0014\u011e\u0001\u0000\u0000\u0000\u0016\u0122\u0001\u0000\u0000"+
		"\u0000\u0018\u012c\u0001\u0000\u0000\u0000\u001a\u0131\u0001\u0000\u0000"+
		"\u0000\u001c\u014b\u0001\u0000\u0000\u0000\u001e\u0159\u0001\u0000\u0000"+
		"\u0000 \u016c\u0001\u0000\u0000\u0000\"\u019e\u0001\u0000\u0000\u0000"+
		"$\u01a3\u0001\u0000\u0000\u0000&\u01ab\u0001\u0000\u0000\u0000(\u01be"+
		"\u0001\u0000\u0000\u0000*\u01c5\u0001\u0000\u0000\u0000,\u01cd\u0001\u0000"+
		"\u0000\u0000.\u01d6\u0001\u0000\u0000\u00000\u01db\u0001\u0000\u0000\u0000"+
		"2\u01e1\u0001\u0000\u0000\u00004\u01f2\u0001\u0000\u0000\u00006\u0209"+
		"\u0001\u0000\u0000\u00008\u020b\u0001\u0000\u0000\u0000:\u021a\u0001\u0000"+
		"\u0000\u0000<\u0223\u0001\u0000\u0000\u0000>\u022a\u0001\u0000\u0000\u0000"+
		"@\u0233\u0001\u0000\u0000\u0000BF\u0005\u0004\u0000\u0000CE\u0003\u0002"+
		"\u0001\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IJ\u0005\u0000\u0000\u0001J\u0001\u0001\u0000"+
		"\u0000\u0000KW\u0005\u0004\u0000\u0000LW\u00036\u001b\u0000MW\u0003\n"+
		"\u0005\u0000NW\u0003\u000e\u0007\u0000OW\u0003\f\u0006\u0000PW\u0003\b"+
		"\u0004\u0000QW\u0003\u0004\u0002\u0000RW\u00038\u001c\u0000SW\u0003:\u001d"+
		"\u0000TW\u00034\u001a\u0000UW\u0003\u001a\r\u0000VK\u0001\u0000\u0000"+
		"\u0000VL\u0001\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000VN\u0001\u0000"+
		"\u0000\u0000VO\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0003\u0001\u0000"+
		"\u0000\u0000XY\u0005\u001f\u0000\u0000YZ\u0005&\u0000\u0000Z\\\u0005\u0010"+
		"\u0000\u0000[]\u0003\u001a\r\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0003\u0006\u0003\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bk\u0001\u0000\u0000\u0000cg\u0005 \u0000"+
		"\u0000df\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005!\u0000\u0000kc\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mo\u0003\u001a\r\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0005$\u0000\u0000qr\u0003\u001a\r\u0000"+
		"r\u0005\u0001\u0000\u0000\u0000su\u0005E\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xz\u0003>\u001f\u0000yt\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0086\u0001\u0000\u0000\u0000"+
		"{\u0082\u0005-\u0000\u0000|~\u0005E\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003>\u001f\u0000\u0082}\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u00056\u0000\u0000"+
		"\u008a\u008c\u0003\u001a\r\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0090\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0003\u0002\u0001\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0005!\u0000\u0000\u0094\u0096"+
		"\u0003\u001a\r\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0007\u0001\u0000\u0000\u0000\u0097\u009c\u0005"+
		"\t\u0000\u0000\u0098\u009d\u0005&\u0000\u0000\u0099\u009a\u0003\u0018"+
		"\f\u0000\u009a\u009b\u0003\u001e\u000f\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000"+
		"\u009f\u00a3\u0005\u000b\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8"+
		"\t\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\r\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001e\u000f\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00b0\u0005"+
		"\u000e\u0000\u0000\u00ad\u00af\u0003\u0002\u0001\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u001e\u0000\u0000\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00b6\u0003"+
		"\u001a\r\u0000\u00b6\u00ba\u0005\u000e\u0000\u0000\u00b7\u00b9\u0003\u0002"+
		"\u0001\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b3\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c9\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c6\u0005\u001d\u0000\u0000\u00c3\u00c5\u0003\u0002"+
		"\u0001\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u000f"+
		"\u0000\u0000\u00cc\u00cd\u0003\u001a\r\u0000\u00cd\u000b\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf\u00d0\u0003\u001e\u000f\u0000"+
		"\u00d0\u00d1\u0003\u001a\r\u0000\u00d1\u00d5\u0005\u000b\u0000\u0000\u00d2"+
		"\u00d4\u0003\u0002\u0001\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\f\u0000\u0000\u00d9\u00da"+
		"\u0003\u001a\r\u0000\u00da\r\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\n\u0000\u0000\u00dc\u00dd\u0003\u0010\b\u0000\u00dd\u00de\u0005\u000b"+
		"\u0000\u0000\u00de\u00e2\u0003\u001a\r\u0000\u00df\u00e1\u0003\u0002\u0001"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u0003\u001a\r\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\f\u0000\u0000\u00e9\u00ea\u0003\u001a\r\u0000\u00ea"+
		"\u000f\u0001\u0000\u0000\u0000\u00eb\u00ec\u00055\u0000\u0000\u00ec\u00ed"+
		"\u00055\u0000\u0000\u00ed\u00ee\u0005\u0007\u0000\u0000\u00ee\u00ef\u0003"+
		"\u001e\u000f\u0000\u00ef\u00f0\u0005\u0007\u0000\u0000\u00f0\u00f1\u0005"+
		"6\u0000\u0000\u00f1\u00f2\u00056\u0000\u0000\u00f2\u00f3\u0003\u001a\r"+
		"\u0000\u00f3\u0107\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005E\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0010\u0000\u0000"+
		"\u00fa\u00fb\u0003\u0012\t\u0000\u00fb\u00fc\u0003\u001a\r\u0000\u00fc"+
		"\u0107\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005E\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0010\u0000\u0000\u0103\u0104"+
		"\u0003\u0018\f\u0000\u0104\u0105\u0003\u001a\r\u0000\u0105\u0107\u0001"+
		"\u0000\u0000\u0000\u0106\u00eb\u0001\u0000\u0000\u0000\u0106\u00f5\u0001"+
		"\u0000\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0107\u0011\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0003\u0014\n\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005B\u0000\u0000\u010e\u0110\u0003\u0014\n"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u011c\u0001\u0000\u0000\u0000\u0111\u0112\u00057\u0000\u0000"+
		"\u0112\u0113\u0003\u0014\n\u0000\u0113\u0114\u0005B\u0000\u0000\u0114"+
		"\u0117\u0003\u0014\n\u0000\u0115\u0116\u0005B\u0000\u0000\u0116\u0118"+
		"\u0003\u0014\n\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"8\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0109\u0001\u0000"+
		"\u0000\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011c\u0013\u0001\u0000"+
		"\u0000\u0000\u011d\u011f\u0007\u0000\u0000\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0003\u0016\u000b\u0000\u0121\u0015\u0001\u0000"+
		"\u0000\u0000\u0122\u012a\u0005D\u0000\u0000\u0123\u0127\u0007\u0001\u0000"+
		"\u0000\u0124\u0126\u0005G\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0123\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0017\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005%\u0000\u0000\u012d\u012e\u00055\u0000\u0000\u012e\u012f"+
		"\u00034\u001a\u0000\u012f\u0130\u00056\u0000\u0000\u0130\u0019\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0007\u0002\u0000\u0000\u0132\u001b\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u00055\u0000\u0000\u0134\u0135\u00034\u001a\u0000"+
		"\u0135\u0136\u00056\u0000\u0000\u0136\u014c\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u00057\u0000\u0000\u0138\u0139\u00034\u001a\u0000\u0139\u013a\u0005"+
		"8\u0000\u0000\u013a\u014c\u0001\u0000\u0000\u0000\u013b\u013c\u00055\u0000"+
		"\u0000\u013c\u013d\u00055\u0000\u0000\u013d\u013e\u0003&\u0013\u0000\u013e"+
		"\u013f\u00056\u0000\u0000\u013f\u0140\u00056\u0000\u0000\u0140\u014c\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005\u0011\u0000\u0000\u0142\u0143\u0003"+
		"&\u0013\u0000\u0143\u0144\u0005\u0012\u0000\u0000\u0144\u014c\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u0011\u0000\u0000\u0146\u0147\u0005\u0011"+
		"\u0000\u0000\u0147\u0148\u0003&\u0013\u0000\u0148\u0149\u0005\u0012\u0000"+
		"\u0000\u0149\u014a\u0005\u0012\u0000\u0000\u014a\u014c\u0001\u0000\u0000"+
		"\u0000\u014b\u0133\u0001\u0000\u0000\u0000\u014b\u0137\u0001\u0000\u0000"+
		"\u0000\u014b\u013b\u0001\u0000\u0000\u0000\u014b\u0141\u0001\u0000\u0000"+
		"\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014c\u001d\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0006\u000f\uffff\uffff\u0000\u014e\u014f\u0005;\u0000"+
		"\u0000\u014f\u015a\u0003\u001e\u000f\u0005\u0150\u0151\u0005A\u0000\u0000"+
		"\u0151\u015a\u0003&\u0013\u0000\u0152\u0153\u00055\u0000\u0000\u0153\u0154"+
		"\u00055\u0000\u0000\u0154\u0155\u0003 \u0010\u0000\u0155\u0156\u00056"+
		"\u0000\u0000\u0156\u0157\u00056\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u014d\u0001\u0000\u0000"+
		"\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u0152\u0001\u0000\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u0160\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\n\u0003\u0000\u0000\u015c\u015d\u0007\u0003\u0000\u0000"+
		"\u015d\u015f\u0003\u001e\u000f\u0004\u015e\u015b\u0001\u0000\u0000\u0000"+
		"\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u001f\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0003\"\u0011\u0000\u0164"+
		"\u0165\u0007\u0003\u0000\u0000\u0165\u0166\u0003 \u0010\u0000\u0166\u016d"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u00055\u0000\u0000\u0168\u0169\u0003"+
		" \u0010\u0000\u0169\u016a\u00056\u0000\u0000\u016a\u016d\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0003\"\u0011\u0000\u016c\u0163\u0001\u0000\u0000\u0000"+
		"\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016d!\u0001\u0000\u0000\u0000\u016e\u0179\u0003&\u0013\u0000\u016f\u0171"+
		"\u0005\u0014\u0000\u0000\u0170\u0172\u0005\u0014\u0000\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u017a"+
		"\u0001\u0000\u0000\u0000\u0173\u017a\u00059\u0000\u0000\u0174\u0175\u0005"+
		"9\u0000\u0000\u0175\u017a\u00059\u0000\u0000\u0176\u017a\u0005:\u0000"+
		"\u0000\u0177\u0178\u0005:\u0000\u0000\u0178\u017a\u0005:\u0000\u0000\u0179"+
		"\u016f\u0001\u0000\u0000\u0000\u0179\u0173\u0001\u0000\u0000\u0000\u0179"+
		"\u0174\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0003&\u0013\u0000\u017c\u019f\u0001\u0000\u0000\u0000\u017d\u0184"+
		"\u0003&\u0013\u0000\u017e\u017f\u0005:\u0000\u0000\u017f\u0185\u0005\u0014"+
		"\u0000\u0000\u0180\u0181\u00059\u0000\u0000\u0181\u0185\u0005\u0014\u0000"+
		"\u0000\u0182\u0183\u0005;\u0000\u0000\u0183\u0185\u0005\u0014\u0000\u0000"+
		"\u0184\u017e\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0003&\u0013\u0000\u0187\u019f\u0001\u0000\u0000\u0000\u0188"+
		"\u019f\u0005)\u0000\u0000\u0189\u018e\u0003$\u0012\u0000\u018a\u018b\u0005"+
		".\u0000\u0000\u018b\u018f\u0005.\u0000\u0000\u018c\u018d\u00051\u0000"+
		"\u0000\u018d\u018f\u00051\u0000\u0000\u018e\u018a\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u019f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0005.\u0000\u0000\u0191\u0195\u0005.\u0000\u0000\u0192\u0193"+
		"\u00051\u0000\u0000\u0193\u0195\u00051\u0000\u0000\u0194\u0190\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u019f\u0003$\u0012\u0000\u0197\u0198\u0003>\u001f\u0000"+
		"\u0198\u019a\u0005\u0014\u0000\u0000\u0199\u019b\u0005\u0014\u0000\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0003>\u001f\u0000\u019d"+
		"\u019f\u0001\u0000\u0000\u0000\u019e\u016e\u0001\u0000\u0000\u0000\u019e"+
		"\u017d\u0001\u0000\u0000\u0000\u019e\u0188\u0001\u0000\u0000\u0000\u019e"+
		"\u0189\u0001\u0000\u0000\u0000\u019e\u0194\u0001\u0000\u0000\u0000\u019e"+
		"\u0197\u0001\u0000\u0000\u0000\u019f#\u0001\u0000\u0000\u0000\u01a0\u01a4"+
		"\u0005&\u0000\u0000\u01a1\u01a4\u0003<\u001e\u0000\u01a2\u01a4\u0003\u0014"+
		"\n\u0000\u01a3\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4%\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0006\u0013\uffff\uffff\u0000\u01a6\u01a7\u00055\u0000\u0000"+
		"\u01a7\u01a8\u0003&\u0013\u0000\u01a8\u01a9\u00056\u0000\u0000\u01a9\u01ac"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003$\u0012\u0000\u01ab\u01a5\u0001"+
		"\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b5\n\u0003\u0000\u0000\u01ae\u01b6\u0005."+
		"\u0000\u0000\u01af\u01b6\u00051\u0000\u0000\u01b0\u01b6\u0005/\u0000\u0000"+
		"\u01b1\u01b6\u00052\u0000\u0000\u01b2\u01b6\u0005\u001a\u0000\u0000\u01b3"+
		"\u01b4\u0005/\u0000\u0000\u01b4\u01b6\u0005/\u0000\u0000\u01b5\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b9\u0003&\u0013\u0004\u01b8\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\'\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005E\u0000\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1)\u0001\u0000\u0000\u0000\u01c2\u01c6\u00051\u0000\u0000\u01c3\u01c4"+
		"\u00051\u0000\u0000\u01c4\u01c6\u00051\u0000\u0000\u01c5\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c9\u0005E\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb+\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0003.\u0017\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0-\u0001\u0000\u0000\u0000\u01d1\u01d7"+
		"\u0003(\u0014\u0000\u01d2\u01d7\u0003>\u001f\u0000\u01d3\u01d7\u0003@"+
		" \u0000\u01d4\u01d7\u0003\u0018\f\u0000\u01d5\u01d7\u0003*\u0015\u0000"+
		"\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7/\u0001\u0000\u0000\u0000\u01d8"+
		"\u01dc\u0005-\u0000\u0000\u01d9\u01da\u0005-\u0000\u0000\u01da\u01dc\u0005"+
		"4\u0000\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01dc1\u0001\u0000\u0000\u0000\u01dd\u01df\u0005?\u0000\u0000"+
		"\u01de\u01e0\u0005H\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005;\u0000\u0000\u01e4\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e6\u01ec\u0003,\u0016\u0000\u01e7\u01e8\u0003"+
		"0\u0018\u0000\u01e8\u01e9\u0003,\u0016\u0000\u01e9\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0007\u0002\u0000\u0000\u01f03\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u00032\u0019\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f55\u0001\u0000\u0000\u0000\u01f6\u01f8"+
		"\u0005E\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"5\u0000\u0000\u01fc\u01fd\u00056\u0000\u0000\u01fd\u020a\u0003\u001c\u000e"+
		"\u0000\u01fe\u0200\u0005<\u0000\u0000\u01ff\u0201\u0005E\u0000\u0000\u0200"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0206\u0001\u0000\u0000\u0000\u0204\u0205\u00055\u0000\u0000\u0205\u0207"+
		"\u00056\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0003"+
		"\u001c\u000e\u0000\u0209\u01f7\u0001\u0000\u0000\u0000\u0209\u01fe\u0001"+
		"\u0000\u0000\u0000\u020a7\u0001\u0000\u0000\u0000\u020b\u020d\u0005=\u0000"+
		"\u0000\u020c\u020e\u0005E\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0005\u0010\u0000\u0000\u0212\u0214\u0003,\u0016\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0003\u001a\r\u0000\u0216\u0217"+
		"\u0005\u000b\u0000\u0000\u0217\u0218\u00034\u001a\u0000\u0218\u0219\u0005"+
		"\f\u0000\u0000\u02199\u0001\u0000\u0000\u0000\u021a\u021e\u0005>\u0000"+
		"\u0000\u021b\u021d\u0005E\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0003,\u0016\u0000\u0222"+
		";\u0001\u0000\u0000\u0000\u0223\u0227\u0005F\u0000\u0000\u0224\u0226\u0005"+
		"E\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000"+
		"\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228=\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022e\u0005\u0006\u0000\u0000\u022b\u022d\b\u0004\u0000\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005\u0006\u0000\u0000\u0232?\u0001\u0000\u0000\u0000\u0233"+
		"\u0237\u0005\u0005\u0000\u0000\u0234\u0236\b\u0005\u0000\u0000\u0235\u0234"+
		"\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a"+
		"\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0005\u0005\u0000\u0000\u023bA\u0001\u0000\u0000\u0000GFV\\agknvy\u007f"+
		"\u0082\u0086\u008b\u0090\u0095\u009c\u00a3\u00b0\u00ba\u00bf\u00c6\u00c9"+
		"\u00d5\u00e2\u00e6\u00f7\u0100\u0106\u010b\u010f\u0117\u011b\u011e\u0127"+
		"\u012a\u014b\u0159\u0160\u016c\u0171\u0179\u0184\u018e\u0194\u019a\u019e"+
		"\u01a3\u01ab\u01b5\u01ba\u01c0\u01c5\u01ca\u01cf\u01d6\u01db\u01df\u01e1"+
		"\u01e4\u01ec\u01f4\u01f9\u0202\u0206\u0209\u020f\u0213\u021e\u0227\u022e"+
		"\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}