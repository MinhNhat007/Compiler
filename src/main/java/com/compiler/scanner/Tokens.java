package com.compiler.scanner;

import java.util.HashMap;
import java.util.Map;

import com.compiler.scanner.Token.Content;

public class Tokens {
    private HashMap<Identifier, Content> tokenMap = null;

    public Tokens() {
        tokenMap = new HashMap<Identifier, Token.Content>();
        addTokens();
    }
    
    public void addTokens() {
      addToken(new Token(Identifier.SPACE_SYM,        " ",        ""));
      addToken(new Token(Identifier.NEWLINE_SYM,      "\n",       ""));
      addToken(new Token(Identifier.LBRACKET_SYM,     "(",        "black"));
      addToken(new Token(Identifier.RBRACKET_SYM,     ")",        "black"));
      addToken(new Token(Identifier.PLUS_SYM,         "+",        "black"));
      addToken(new Token(Identifier.MINUS_SYM,        "-",        "black"));
      addToken(new Token(Identifier.STAR_SYM,         "*",        "black"));
      addToken(new Token(Identifier.SLASH_SYM,        "/",        "black"));
      addToken(new Token(Identifier.PERCENT_SYM,      "%",        "black"));
      addToken(new Token(Identifier.ATTRIBUTION_SYM,  "=",        "black"));
      addToken(new Token(Identifier.EQUALS_SYM,       "==",       "black"));
      addToken(new Token(Identifier.BIGGER_SYM,       ">",        "black"));
      addToken(new Token(Identifier.BIGGEREQUAL_SYM,  ">=",       "black"));
      addToken(new Token(Identifier.LESS_SYM,         "<",        "black"));
      addToken(new Token(Identifier.LESSEQUAL_SYM,    "<=",       "black"));
      addToken(new Token(Identifier.EXCLAMATION_SYM,  "!",        "black"));
      addToken(new Token(Identifier.DIFF_SYM,         "!=",       "black"));
      addToken(new Token(Identifier.BIT_OR_SYM,       "|",        "black"));
      addToken(new Token(Identifier.OR_SYM,           "||",       "black"));
      addToken(new Token(Identifier.AND_SYM,          "&&",       "black"));
      addToken(new Token(Identifier.GETADDR_SYM,      "&",        "black"));
      addToken(new Token(Identifier.DOT_SYM,          ".",        "black"));
      addToken(new Token(Identifier.ARROW_SYM,        "->",       "black"));
      addToken(new Token(Identifier.SEMICOLON_SYM,    ";",        "black"));
      addToken(new Token(Identifier.SINGLE_COMM_SYM,  "//",       "green"));
      addToken(new Token(Identifier.BEGIN_COMM_SYM,   "/*",       "green"));
      addToken(new Token(Identifier.END_COMM_SYM,     "*/",       "green"));
      addToken(new Token(Identifier.CHAR_SYM,         "char",     "blue"));
      addToken(new Token(Identifier.DOUBLE_SYM,       "double",   "blue"));
      addToken(new Token(Identifier.FLOAT_SYM,        "float",    "blue"));
      addToken(new Token(Identifier.INT_SYM,          "int",      "blue"));
      addToken(new Token(Identifier.LONG_SYM,         "long",     "blue"));
      addToken(new Token(Identifier.VOID_SYM,         "void",     "blue"));
      addToken(new Token(Identifier.TRUE_SYM,         "true",     "blue"));
      addToken(new Token(Identifier.FALSE_SYM,        "false",    "blue"));
      addToken(new Token(Identifier.BREAK_SYM,        "break",    "blue"));
      addToken(new Token(Identifier.CONST_SYM,        "const",    "blue"));
      addToken(new Token(Identifier.CONTINUE_SYM,     "continue", "blue"));
      addToken(new Token(Identifier.ELSE_SYM,         "else",     "blue"));
      addToken(new Token(Identifier.ElSEIF_SYM,       "elseif",   "blue"));
      addToken(new Token(Identifier.BEGIN_FOR_SYM,    "for",      "blue"));
      addToken(new Token(Identifier.END_FOR_SYM,      "rof",      "blue"));
      addToken(new Token(Identifier.IF_SYM,           "if",       "blue"));
      addToken(new Token(Identifier.END_IF_SYM,       "fi",       "blue"));
      addToken(new Token(Identifier.BEGIN_FUNCTION_SYM, "fun",    "blue"));
      addToken(new Token(Identifier.END_FUNCTION_SYM,   "nuf",    "blue"));
      addToken(new Token(Identifier.RETURN_SYM,       "return",   "blue"));
      addToken(new Token(Identifier.RETURNS_SYM,      "returns",  "blue"));
      addToken(new Token(Identifier.SHORT_SYM,        "short",    "blue"));
      addToken(new Token(Identifier.SIZEOF_SYM,       "sizeof",   "blue"));
      addToken(new Token(Identifier.BEGIN_WHILE_SYM,  "while",    "blue"));
      addToken(new Token(Identifier.END_WHILE_SYM,    "eliwh",    "blue"));
      addToken(new Token(Identifier.ERROR_SYM,        "ERROR",    "red"));
      //addToken(new Token(Identifier.LBRACE_SYM,     new Token.Content("{", "black")));
      //addToken(new Token(Identifier.RBRACE_SYM,     new Token.Content("}", "black")));
      //addToken(new Token(Identifier.LSBRACKET_SYM,  new Token.Content("[", "black")));
      //addToken(new Token(Identifier.RSBRACKET_SYM,  new Token.Content("]", "black")));
      //addToken(new Token(Identifier.STATIC_SYM,     new Token.Content("static", "blue")));
      //addToken(new Token(Identifier.STRUCT_SYM,     new Token.Content("struct", "blue")));
      //addToken(new Token(Identifier.SWITCH_SYM,     new Token.Content("switch", "blue")));
      //addToken(new Token(Identifier.TYPEDEF_SYM,    new Token.Content("typedef", "blue")));
      //addToken(new Token(Identifier.DEFAULT_SYM,    new Token.Content("default", "blue")));
      //addToken(new Token(Identifier.DO_SYM,         new Token.Content("do", "blue")));
      //addToken(new Token(Identifier.CASE_SYM,       new Token.Content("case", "blue")));
      //addToken(new Token(Identifier.INCREM_SYM,     new Token.Content("++", "black")));
      //addToken(new Token(Identifier.DECREM_SYM,     new Token.Content("--", "black")));
    }
    
    public boolean addToken(Token _token) {
      if (tokenMap.containsKey(_token.getName()))
        return false;
      else {
        tokenMap.put(_token.getName(), _token.getContent());
        return true;
      }
    }

    public Token.Content get(Identifier _key) {
        return tokenMap.get(_key);
    }

    public Identifier getTokenByText(String _symbol) {
        for (Map.Entry<Identifier, Token.Content> elem : tokenMap.entrySet()) {
            if (elem.getValue().getSymbol().equals(_symbol)) {
                return elem.getKey();
            }
        }
        return Identifier.ERROR_SYM;
    }
}
