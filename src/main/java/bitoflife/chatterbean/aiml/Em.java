package bitoflife.chatterbean.aiml;


import bitoflife.chatterbean.Match;
import org.xml.sax.Attributes;


public class Em extends TemplateElement
{
  /*
  Constructors
  */

  public Em(Attributes attributes)
  {
  }

  public Em(Object... children)
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