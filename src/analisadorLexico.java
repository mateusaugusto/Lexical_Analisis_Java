/* The following code was generated by JFlex 1.4.3 on 22/05/14 19:06 */

import java_cup.runtime.Symbol;

class Yytoken {
	Yytoken (int index, String text, int line, int charBegin, int charEnd)
	 {
		m_index = index;
		m_text = new String(text);
		m_line = line;
		m_charBegin = charBegin;
		m_charEnd = charEnd;
	 }
	 
	 Yytoken (int index, String text, int line, int charBegin, int charEnd, String type)
	 {
		m_index = index;
		m_text = new String(text);
		m_line = line;
		m_charBegin = charBegin;
		m_charEnd = charEnd;
		m_typeToken = new String(type);
	 }

	public int m_index;
	public String m_text;
	public int m_line;
	public int m_charBegin;
	public int m_charEnd;
	
	public String m_typeToken;
	
	public String toString() {
	  return "Token #"+m_index+": < "+m_typeToken +" , "+m_text + " > (linha "+m_line+")";
	}
}
	

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/05/14 19:06 from the specification file
 * <tt>C:/Users/Mateus/Documents/Facul/6º Periodo/Automatos/AnalisadorLexicoJflex/src/classFlex.flex</tt>
 */
class analisadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3, 39,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 13, 18,  0,  0, 10, 11,  0, 17, 17,  5,  8, 17,  9, 17,  4, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0, 17, 15, 16, 14,  0, 
     0, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 
    19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 17,  0, 17,  0,  2, 
     0, 24, 36, 19, 31, 27, 32, 23, 35, 29, 19, 19, 26, 25, 30, 22, 
    20, 19, 21, 33, 28, 37, 19, 34, 19, 38, 19,  6, 12,  7,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\2\1\3\1\4\1\5\2\6\2\7"+
    "\2\6\3\10\2\11\1\12\1\2\15\4\1\1\1\0"+
    "\1\12\1\0\1\10\1\11\1\0\1\13\2\4\1\14"+
    "\5\4\1\15\1\16\12\4\3\0\1\13\2\4\1\17"+
    "\1\20\1\4\1\21\1\4\1\22\1\23\1\24\10\4"+
    "\1\0\2\4\1\25\1\26\7\4\1\5\2\4\1\27"+
    "\1\30\1\4\1\31\1\32\1\4\1\33\1\4\1\34"+
    "\1\35\2\4\1\36\1\37\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
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
    "\0\0\0\50\0\120\0\170\0\240\0\120\0\310\0\360"+
    "\0\u0118\0\120\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208"+
    "\0\u0230\0\u01e0\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320"+
    "\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460"+
    "\0\u0488\0\u04b0\0\120\0\u0118\0\120\0\120\0\u04d8\0\u0258"+
    "\0\u0500\0\u0528\0\240\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0"+
    "\0\u0618\0\240\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708"+
    "\0\u0730\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8\0\u0820\0\120"+
    "\0\u0848\0\u0870\0\240\0\240\0\u0898\0\240\0\u08c0\0\240"+
    "\0\240\0\240\0\u08e8\0\u0910\0\u0938\0\u0960\0\u0988\0\u09b0"+
    "\0\u09d8\0\u0a00\0\u0a28\0\u0a50\0\u0a78\0\240\0\240\0\u0aa0"+
    "\0\u0ac8\0\u0af0\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u07f8\0\u0bb8"+
    "\0\u0be0\0\240\0\240\0\u0c08\0\u0c30\0\240\0\u0c58\0\240"+
    "\0\u0c80\0\240\0\240\0\u0ca8\0\u0cd0\0\240\0\240\0\240";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\10\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\12\1\23\1\5\1\24\1\25\1\26\1\5"+
    "\1\27\1\5\1\30\1\31\1\32\1\33\1\34\1\5"+
    "\1\35\1\36\1\37\1\5\1\40\2\5\1\6\47\3"+
    "\52\0\1\4\21\0\24\41\2\0\2\5\20\0\24\5"+
    "\6\0\1\42\12\0\1\43\47\0\1\43\27\0\7\44"+
    "\1\6\40\44\10\0\1\43\7\0\1\43\40\0\1\43"+
    "\6\0\1\43\42\0\1\45\50\0\1\45\53\0\1\46"+
    "\45\0\1\46\1\0\1\46\46\0\2\46\27\0\22\47"+
    "\1\50\25\47\1\0\2\5\20\0\2\5\1\51\21\5"+
    "\2\0\2\5\20\0\10\5\1\52\13\5\2\0\2\5"+
    "\20\0\2\5\1\53\21\5\2\0\2\5\20\0\13\5"+
    "\1\54\10\5\2\0\2\5\20\0\10\5\1\55\13\5"+
    "\2\0\2\5\20\0\7\5\1\56\3\5\1\57\10\5"+
    "\2\0\2\5\20\0\2\5\1\60\21\5\2\0\2\5"+
    "\20\0\13\5\1\61\1\5\1\62\6\5\2\0\2\5"+
    "\20\0\3\5\1\63\20\5\2\0\2\5\20\0\3\5"+
    "\1\64\1\5\1\65\4\5\1\66\11\5\2\0\2\5"+
    "\20\0\11\5\1\67\12\5\2\0\2\5\20\0\2\5"+
    "\1\70\15\5\1\71\3\5\2\0\2\5\20\0\3\5"+
    "\1\72\4\5\1\73\12\5\1\74\2\0\1\41\21\0"+
    "\24\41\1\0\4\75\1\76\1\77\42\75\22\47\1\100"+
    "\25\47\1\0\2\5\20\0\3\5\1\101\20\5\2\0"+
    "\2\5\20\0\5\5\1\102\16\5\2\0\2\5\20\0"+
    "\14\5\1\103\7\5\2\0\2\5\20\0\11\5\1\104"+
    "\12\5\2\0\2\5\20\0\16\5\1\105\5\5\2\0"+
    "\2\5\20\0\14\5\1\106\7\5\2\0\2\5\20\0"+
    "\22\5\1\107\1\5\2\0\2\5\20\0\11\5\1\110"+
    "\12\5\2\0\2\5\20\0\11\5\1\111\12\5\2\0"+
    "\2\5\20\0\2\5\1\112\21\5\2\0\2\5\20\0"+
    "\7\5\1\113\14\5\2\0\2\5\20\0\13\5\1\114"+
    "\10\5\2\0\2\5\20\0\2\5\1\115\21\5\2\0"+
    "\2\5\20\0\12\5\1\116\11\5\2\0\2\5\20\0"+
    "\12\5\1\117\11\5\2\0\2\5\20\0\3\5\1\120"+
    "\20\5\2\0\2\5\20\0\4\5\1\121\17\5\2\0"+
    "\2\5\20\0\11\5\1\122\12\5\1\0\5\75\1\77"+
    "\47\75\1\123\46\75\1\6\1\77\42\75\1\0\2\5"+
    "\20\0\4\5\1\124\17\5\2\0\2\5\20\0\14\5"+
    "\1\125\7\5\2\0\2\5\20\0\10\5\1\126\13\5"+
    "\2\0\2\5\20\0\10\5\1\127\13\5\2\0\2\5"+
    "\20\0\16\5\1\130\5\5\2\0\2\5\20\0\5\5"+
    "\1\131\16\5\2\0\2\5\20\0\12\5\1\132\11\5"+
    "\2\0\2\5\20\0\11\5\1\133\12\5\2\0\2\5"+
    "\20\0\7\5\1\134\14\5\2\0\2\5\20\0\7\5"+
    "\1\135\14\5\2\0\2\5\20\0\12\5\1\136\11\5"+
    "\2\0\2\5\20\0\10\5\1\112\13\5\1\0\4\75"+
    "\1\137\1\77\42\75\1\0\2\5\20\0\2\5\1\140"+
    "\21\5\2\0\2\5\20\0\7\5\1\141\14\5\2\0"+
    "\2\5\20\0\10\5\1\142\13\5\2\0\2\5\20\0"+
    "\7\5\1\143\14\5\2\0\2\5\20\0\13\5\1\144"+
    "\10\5\2\0\2\5\20\0\10\5\1\145\13\5\2\0"+
    "\2\5\20\0\10\5\1\146\13\5\2\0\2\5\20\0"+
    "\10\5\1\147\13\5\2\0\2\5\20\0\13\5\1\150"+
    "\10\5\2\0\2\5\20\0\5\5\1\151\16\5\2\0"+
    "\2\5\20\0\13\5\1\152\10\5\2\0\2\5\20\0"+
    "\4\5\1\153\17\5\2\0\2\5\20\0\7\5\1\154"+
    "\14\5\2\0\2\5\20\0\5\5\1\155\16\5\2\0"+
    "\2\5\20\0\6\5\1\156\15\5\2\0\2\5\20\0"+
    "\13\5\1\157\10\5\2\0\2\5\20\0\13\5\1\160"+
    "\10\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3320];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\1\11\2\1\1\11\3\1\1\11\27\1"+
    "\1\0\1\11\1\0\2\11\1\0\25\1\3\0\1\11"+
    "\22\1\1\0\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int count_comentarios = 0;
  
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java analisadorLexico <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        analisadorLexico scanner = null;
        try {
          scanner = new analisadorLexico( new java.io.FileReader(argv[i]) );
          do {
            System.out.println(scanner.yylex());
          } while (!scanner.zzAtEOF);

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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  analisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  analisadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { return (new Yytoken(8,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 33: break;
        case 31: 
          { return (new Yytoken(12,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 34: break;
        case 30: 
          { return (new Yytoken(0,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 35: break;
        case 23: 
          { return (new Yytoken(14,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 36: break;
        case 11: 
          { return (new Yytoken(48,yytext(),yyline,yychar,yychar+yylength(), "STRING"));
          }
        case 37: break;
        case 8: 
          { return (new Yytoken(43,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR LOGICO"));
          }
        case 38: break;
        case 1: 
          { System.out.println("Linha: <" + yyline +  ">" + " Caracter Invalido: <" + yytext() +  ">"); System.exit(-1);
          }
        case 39: break;
        case 20: 
          { return (new Yytoken(16,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 40: break;
        case 13: 
          { return (new Yytoken(2,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 41: break;
        case 24: 
          { return (new Yytoken(4,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 42: break;
        case 22: 
          { return (new Yytoken(13,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 43: break;
        case 29: 
          { return (new Yytoken(6,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 44: break;
        case 32: 
          { return (new Yytoken(15,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 45: break;
        case 9: 
          { return (new Yytoken(44,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR Relacional"));
          }
        case 46: break;
        case 21: 
          { return (new Yytoken(17,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 47: break;
        case 17: 
          { return (new Yytoken(3,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 48: break;
        case 18: 
          { return (new Yytoken(5,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 49: break;
        case 12: 
          { return (new Yytoken(19,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 50: break;
        case 19: 
          { return (new Yytoken(20,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 51: break;
        case 26: 
          { return (new Yytoken(7,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 52: break;
        case 25: 
          { return (new Yytoken(11,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 53: break;
        case 4: 
          { return (new Yytoken(41,yytext(),yyline,yychar,yychar+yylength(), "IDENTIFICADOR"));
          }
        case 54: break;
        case 27: 
          { return (new Yytoken(9,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 55: break;
        case 15: 
          { return (new Yytoken(18,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 56: break;
        case 3: 
          { return (new Yytoken(40,yytext(),yyline,yychar,yychar+yylength(), "Integer Constant"));
          }
        case 57: break;
        case 5: 
          { /*Ignore*/
          }
        case 58: break;
        case 2: 
          { System.out.println("Linha: <" + yyline +  ">" + " Caracter Invalido: <" + yytext() +  ">");
 // System.exit(-1);
          }
        case 59: break;
        case 16: 
          { return (new Yytoken(1,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 60: break;
        case 6: 
          { return (new Yytoken(42,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR ARITMETICO"));
          }
        case 61: break;
        case 10: 
          { return (new Yytoken(45,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR ATRIBUICAO"));
          }
        case 62: break;
        case 7: 
          { return (new Yytoken(47,yytext(),yyline,yychar,yychar+yylength(), "SEPARADOR"));
          }
        case 63: break;
        case 28: 
          { return (new Yytoken(10,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA"));
          }
        case 64: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}