package com.compiler.scanner;

public class Token {
  public class Content{
    private String symbol;
    private String color;
    
    public Content(String _symbol, String _color) {
      this.symbol = _symbol;
      this.color = _color;
    }
    
    public String getSymbol() {
      return symbol;
    }

    public void setSymbol(String symbol) {
      this.symbol = symbol;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }
  }
  
  private Identifier name;
  private Content content;
  
  public Token(Identifier _name, String _symbol, String _color) {
    setName(_name);
    setContent(new Content(_symbol, _color));
  }

  public Token(Identifier _name, Content _content) {
      setName(_name);
      setContent(_content);
  }

  public Identifier getName() {
    return name;
  }

  public void setName(Identifier name) {
    this.name = name;
  }

  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }
  
}

