package bitoflife.chatterbean.aiml;

import bitoflife.chatterbean.Match;
import org.xml.sax.Attributes;

public class Br extends TemplateElement
{
  /*
  Constructors
  */

  public Br(Attributes attributes)
  {
  }

  public Br(Object... children)
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