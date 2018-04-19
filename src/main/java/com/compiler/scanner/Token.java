package com.compiler.scanner;

/**
 * Class Token representing token with symbol and color
 */
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

    private Token getOuterType() {
      return Token.this;
    }
    
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + getOuterType().hashCode();
      result = prime * result + ((color == null) ? 0 : color.hashCode());
      result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Content other = (Content) obj;
      if (!getOuterType().equals(other.getOuterType()))
        return false;
      if (color == null) {
        if (other.color != null)
          return false;
      } else if (!color.equals(other.color))
        return false;
      if (symbol == null) {
        if (other.symbol != null)
          return false;
      } else if (!symbol.equals(other.symbol))
        return false;
      return true;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((content == null) ? 0 : content.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Token other = (Token) obj;
    if (content == null) {
      if (other.content != null)
        return false;
    } else if (!content.equals(other.content))
      return false;
    if (name != other.name)
      return false;
    return true;
  }
  
}

