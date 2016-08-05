package bitoflife.chatterbean.aiml;


import bitoflife.chatterbean.Match;
import org.xml.sax.Attributes;


public class A extends TemplateElement
{
  /*
  Constructors
  */

  public A(Attributes attributes)
  {
  }

  public A(Object... children)
  {
    super(children);
  }

  /*
  Methods
  */

  public String process(Match match)
  {
    return "";
  }
}