package com.example;// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: B:/to_Git/Automata-theory/v3/src/com/example/jflex/lexic.flex

import java.util.ArrayList;
import java.util.List;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int NUMBERS = 2;
  public static final int BODY = 4;
  public static final int BODYTEXT = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\26\0\1\2\3\0\1\2\5\0\1\3"+
    "\1\4\1\0\1\2\1\0\12\5\1\6\1\7\1\0"+
    "\1\10\1\0\1\11\1\0\32\2\6\0\1\12\1\13"+
    "\1\2\1\14\1\15\1\16\5\2\1\17\1\20\1\2"+
    "\1\21\3\2\1\22\1\23\3\2\1\24\1\25\1\2"+
    "\u0385\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\7\1\1\2\1\3\2\1\36\0\1\4\33\0"+
    "\1\5\4\0\1\6\11\0\1\7\60\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\26\0\54\0\102\0\130\0\156\0\204\0\232"+
    "\0\260\0\306\0\334\0\130\0\130\0\362\0\u0108\0\u011e"+
    "\0\u0134\0\u014a\0\u0160\0\u0176\0\u018c\0\u01a2\0\u01b8\0\u01ce"+
    "\0\u01e4\0\u01fa\0\u0210\0\u0226\0\u023c\0\u0252\0\u0268\0\u027e"+
    "\0\u0294\0\u02aa\0\u02c0\0\u02d6\0\u02ec\0\u0302\0\u0318\0\u032e"+
    "\0\u0344\0\u035a\0\u0370\0\u0386\0\u039c\0\130\0\u03b2\0\u03c8"+
    "\0\u03de\0\u03f4\0\u040a\0\u0420\0\u0436\0\u044c\0\u0462\0\u0478"+
    "\0\u048e\0\u04a4\0\u04ba\0\u04d0\0\u04e6\0\u04fc\0\u0512\0\u0528"+
    "\0\u053e\0\u0554\0\u056a\0\u0580\0\u0596\0\u05ac\0\u05c2\0\u05d8"+
    "\0\u05ee\0\130\0\u0604\0\u061a\0\u0630\0\u0646\0\130\0\u065c"+
    "\0\u0672\0\u0688\0\334\0\u069e\0\u06b4\0\u06ca\0\u06e0\0\u06f6"+
    "\0\130\0\u070c\0\u0722\0\u0738\0\u074e\0\u0764\0\u077a\0\u0790"+
    "\0\u07a6\0\u07bc\0\u07d2\0\u07e8\0\u07fe\0\u0814\0\u082a\0\u0840"+
    "\0\u0856\0\u086c\0\u0882\0\u0898\0\u08ae\0\u08c4\0\u08da\0\u08f0"+
    "\0\u0906\0\u091c\0\u0932\0\u0948\0\u095e\0\u0974\0\u098a\0\u09a0"+
    "\0\u09b6\0\u09cc\0\u09e2\0\u09f8\0\u0a0e\0\u0a24\0\u0a3a\0\u0a50"+
    "\0\u0a66\0\u0a7c\0\u0a92\0\u0aa8\0\u0abe\0\u0ad4\0\u0aea\0\u0b00"+
    "\0\u0b16";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\16\5\1\6\3\5\1\7\1\10\5\5\1\11\1\12"+
    "\1\5\1\13\1\14\17\5\1\15\7\5\1\16\15\5"+
    "\1\15\1\17\1\5\2\17\3\5\15\17\40\0\1\20"+
    "\33\0\1\21\22\0\1\22\15\0\1\23\23\0\1\24"+
    "\25\0\1\25\35\0\1\26\13\0\1\15\1\27\1\0"+
    "\2\27\3\0\15\27\24\0\1\30\23\0\1\30\22\0"+
    "\1\30\13\0\1\31\25\0\1\32\25\0\1\33\41\0"+
    "\1\34\5\0\1\15\1\35\1\0\2\35\3\0\15\35"+
    "\6\0\1\36\24\0\1\37\25\0\1\40\25\0\1\41"+
    "\34\0\1\42\12\0\1\15\1\43\1\0\2\43\3\0"+
    "\15\43\3\0\1\44\27\0\1\45\25\0\1\46\25\0"+
    "\1\47\45\0\1\50\1\0\1\15\1\51\1\0\2\51"+
    "\3\0\15\51\5\0\1\52\25\0\1\53\25\0\1\54"+
    "\25\0\1\55\30\0\1\56\16\0\1\15\1\57\1\0"+
    "\2\57\3\0\15\57\5\0\1\60\25\0\1\61\25\0"+
    "\1\62\25\0\1\63\21\0\1\15\1\64\1\0\2\64"+
    "\3\0\15\64\5\0\1\65\25\0\1\66\25\0\1\67"+
    "\25\0\1\70\21\0\1\15\1\71\1\0\2\71\3\0"+
    "\15\71\5\0\1\72\25\0\1\73\25\0\1\74\25\0"+
    "\1\75\21\0\1\15\1\76\1\0\2\76\3\0\15\76"+
    "\5\0\1\77\25\0\1\100\25\0\1\101\25\0\1\102"+
    "\21\0\1\15\1\103\1\0\2\103\3\0\15\103\5\0"+
    "\1\104\25\0\1\105\25\0\1\106\25\0\1\107\21\0"+
    "\1\15\1\110\1\0\2\110\3\0\15\110\5\0\1\111"+
    "\25\0\1\112\25\0\1\113\25\0\1\114\21\0\1\15"+
    "\1\115\1\0\2\115\3\0\15\115\5\0\1\116\25\0"+
    "\1\117\25\0\1\120\21\0\1\15\1\121\1\0\2\121"+
    "\3\0\15\121\5\0\1\122\24\0\1\123\2\0\1\117"+
    "\17\0\1\15\1\124\1\0\2\124\3\0\15\124\5\0"+
    "\1\125\21\0\1\15\1\126\1\0\2\126\3\0\15\126"+
    "\5\0\1\127\21\0\1\15\1\130\1\0\2\130\3\0"+
    "\15\130\4\0\1\36\2\0\1\131\17\0\1\15\1\132"+
    "\1\0\2\132\3\0\15\132\1\0\1\15\1\133\1\0"+
    "\2\133\3\0\15\133\1\0\1\15\1\134\1\0\2\134"+
    "\3\0\15\134\1\0\1\15\1\135\1\0\2\135\3\0"+
    "\15\135\1\0\1\15\1\136\1\0\2\136\3\0\15\136"+
    "\1\0\1\15\1\137\1\0\2\137\3\0\15\137\1\0"+
    "\1\15\1\140\1\0\2\140\3\0\15\140\1\0\1\15"+
    "\1\141\1\0\2\141\3\0\15\141\1\0\1\15\1\142"+
    "\1\0\2\142\3\0\15\142\1\0\1\15\1\143\1\0"+
    "\2\143\3\0\15\143\1\0\1\15\1\144\1\0\2\144"+
    "\3\0\15\144\1\0\1\15\1\145\1\0\2\145\3\0"+
    "\15\145\1\0\1\15\1\146\1\0\2\146\3\0\15\146"+
    "\1\0\1\15\1\147\1\0\2\147\3\0\15\147\1\0"+
    "\1\15\1\150\1\0\2\150\3\0\15\150\1\0\1\15"+
    "\1\151\1\0\2\151\3\0\15\151\1\0\1\15\1\152"+
    "\1\0\2\152\3\0\15\152\1\0\1\15\1\153\1\0"+
    "\2\153\3\0\15\153\1\0\1\15\1\154\1\0\2\154"+
    "\3\0\15\154\1\0\1\15\1\155\1\0\2\155\3\0"+
    "\15\155\1\0\1\15\1\156\1\0\2\156\3\0\15\156"+
    "\1\0\1\15\1\157\1\0\2\157\3\0\15\157\1\0"+
    "\1\15\1\160\1\0\2\160\3\0\15\160\1\0\1\15"+
    "\1\161\1\0\2\161\3\0\15\161\1\0\1\15\1\162"+
    "\1\0\2\162\3\0\15\162\1\0\1\15\1\163\1\0"+
    "\2\163\3\0\15\163\1\0\1\15\1\164\1\0\2\164"+
    "\3\0\15\164\1\0\1\15\1\165\1\0\2\165\3\0"+
    "\15\165\1\0\1\15\1\166\1\0\2\166\3\0\15\166"+
    "\1\0\1\15\1\167\1\0\2\167\3\0\15\167\1\0"+
    "\1\15\1\170\1\0\2\170\3\0\15\170\1\0\1\15"+
    "\1\171\1\0\2\171\3\0\15\171\1\0\1\15\1\172"+
    "\1\0\2\172\3\0\15\172\1\0\1\15\1\173\1\0"+
    "\2\173\3\0\15\173\1\0\1\15\1\174\1\0\2\174"+
    "\3\0\15\174\1\0\1\15\1\175\1\0\2\175\3\0"+
    "\15\175\1\0\1\15\1\176\1\0\2\176\3\0\15\176"+
    "\1\0\1\15\1\177\1\0\2\177\3\0\15\177\1\0"+
    "\1\15\1\200\1\0\2\200\3\0\15\200\1\0\1\15"+
    "\1\201\1\0\2\201\3\0\15\201\1\0\1\15\1\202"+
    "\1\0\2\202\3\0\15\202\1\0\1\15\1\203\1\0"+
    "\2\203\3\0\15\203\1\0\1\15\1\204\1\0\2\204"+
    "\3\0\15\204\1\0\1\15\1\205\1\0\2\205\3\0"+
    "\15\205\1\0\1\15\1\206\1\0\2\206\3\0\15\206"+
    "\1\0\1\15\1\207\1\0\2\207\3\0\15\207\1\0"+
    "\1\15\1\210\1\0\2\210\3\0\15\210\1\0\1\15"+
    "\1\211\1\0\2\211\3\0\15\211\1\0\1\15\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2860];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\6\1\2\11\2\1\36\0\1\11\33\0"+
    "\1\11\4\0\1\11\11\0\1\11\60\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private boolean _is_acceptable = false;
    private String messageType = null;
    private final List<String> numbers = new ArrayList<String>();
    private String messageBody = null;
    private final StringBuilder buffer = new StringBuilder();

    public Boolean isSMS() {
            return messageType.equals("sms");
        }

    public List<String> getNumbers() {
            return List.copyOf(numbers);
        }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { _is_acceptable = false; return 0;
            }
            // fall through
          case 8: break;
          case 2:
            { yybegin(BODY);
            }
            // fall through
          case 9: break;
          case 3:
            { _is_acceptable = true; return 1;
            }
            // fall through
          case 10: break;
          case 4:
            { if (isSMS()) {
                      yybegin(BODYTEXT);
                } else {
                    _is_acceptable = false; return 0;
                }
            }
            // fall through
          case 11: break;
          case 5:
            { numbers.add(yytext());
            }
            // fall through
          case 12: break;
          case 6:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { 
            }
            // fall through
          case 13: break;
          case 7:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 3);
            { messageType = yytext(); yybegin(NUMBERS);
            }
            // fall through
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
