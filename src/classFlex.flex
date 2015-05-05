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
	
%%

%{
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
%} 

%class analisadorLexico
%cup
%line
%char
%state COMMENT
%full




/* Inteiros */
INTEIRO=[0-9]+

/* palavras IDENTIFICADOR*/
IDENTIFICADOR=[_a-zA-Z][_a-zA-Z0-9]*

/* quebra de linha e tab */
QUEBRA=[ \t\r\n]

/* comentario */
COMENTARIO= "/*" + [ \t\r\n]* ~"*/" | "/*" "*"+ "/" | \{[^}]*\}

/* Operadores Aritméticos */
OPERADOR_ARITMETICO=( "+" | "-" | "*" | "/" | "%" )

/* Operadores Lógicos */
OPERADOR_LOGICO=("&&" | "||" | "!" | "&" | "|" )

/*Operadores Relacionais */
OP_RELACIONAL=(">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>")

/* Operadores Atribuição */
OP_ATRIBUICAO=("+=" | "-="  | "*=" | "/=" | "%=" | "++" | "--" | "=")

/*Separadores */
SEPARADOR=("(" | ")" | "{" | "}" | "[" | "]" | ";" | "," |  "." )

/*Strings */ 
STRING = "\"" + [ \t\r\n]* ~"\"" 

/*Invalido */ 
INVALIDO=[0-9a-zA-Z]*



%% 

<YYINITIAL> {

	/* keywords - DEFINIR TODAS AS PALAVRAS CHAVES ESPECIFICADAS */
	"program" { return (new Yytoken(0,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
	"let" { return (new Yytoken(1,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
	"in" { return (new Yytoken(2,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
	"end" { return (new Yytoken(3,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "final" { return (new Yytoken(4,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "int" { return (new Yytoken(5,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "string" { return (new Yytoken(6,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "while" { return (new Yytoken(7,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "if" { return (new Yytoken(8,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "begin" { return (new Yytoken(9,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "readln" { return (new Yytoken(10,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "write" { return (new Yytoken(11,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "writeln" { return (new Yytoken(12,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "true" { return (new Yytoken(13,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "false" { return (new Yytoken(14,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "boolean" { return (new Yytoken(15,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "for" { return (new Yytoken(16,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "byte" { return (new Yytoken(16,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "else" { return (new Yytoken(17,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "and" { return (new Yytoken(18,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "or" { return (new Yytoken(19,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }
        "not" { return (new Yytoken(20,yytext(),yyline,yychar,yychar + yytext().length(), "PALAVRA_RESERVADA")); }


/* TOKENS DEFINIDOS PELAS EXPRESSOS REGULARES */ 
{INTEIRO} { return (new Yytoken(40,yytext(),yyline,yychar,yychar+yylength(), "Integer Constant")); } 
{IDENTIFICADOR} { return (new Yytoken(41,yytext(),yyline,yychar,yychar+yylength(), "IDENTIFICADOR")); } 
{OPERADOR_ARITMETICO} { return (new Yytoken(42,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR ARITMETICO")); }
{OPERADOR_LOGICO} { return (new Yytoken(43,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR LOGICO")); }
{OP_RELACIONAL} { return (new Yytoken(44,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR Relacional")); }
{OP_ATRIBUICAO} { return (new Yytoken(45,yytext(),yyline,yychar,yychar+yylength(), "OPERADOR ATRIBUICAO")); }
{SEPARADOR} { return (new Yytoken(47,yytext(),yyline,yychar,yychar+yylength(), "SEPARADOR")); }
{STRING} { return (new Yytoken(48,yytext(),yyline,yychar,yychar+yylength(), "STRING")); }
{QUEBRA} {/*Ignore*/}
{COMENTARIO} {/*Ignore*/}
{INVALIDO} {  System.out.println("Linha: <" + yyline +  ">" + " Caracter Invalido: <" + yytext() +  ">"); System.exit(-1);  }

 
  	

 
}



. {
  System.out.println("Linha: <" + yyline +  ">" + " Caracter Invalido: <" + yytext() +  ">");
 // System.exit(-1);

} 

  
