/*
Copyleft (C) 2005 H�lio Perroni Filho
xperroni@yahoo.com
ICQ: 2490863

This file is part of ChatterBean.

ChatterBean is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.

ChatterBean is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with ChatterBean (look at the Documents/ directory); if not, either write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA, or visit (http://www.gnu.org/licenses/gpl.txt).
 */

package bitoflife.chatterbean;

import bitoflife.chatterbean.parser.AliceBotParser;
import bitoflife.chatterbean.parser.AliceBotParserConfigurationException;
import bitoflife.chatterbean.parser.AliceBotParserException;
import bitoflife.chatterbean.util.Searcher;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AliceBotMother {
	/*
	 * Attribute Section
	 */

	private ByteArrayOutputStream gossip = null;

	/*
	 * Event Section
	 */

	public void setUp() {
		// gossip = new ByteArrayOutputStream();
	}

	/*
	 * Method Section
	 */

	public String gossip() {
		return gossip.toString();
	}

	public AliceBot newInstance() {
		Searcher searcher = new Searcher();
		AliceBotParser parser;
		AliceBot bot = null;
		try {
			parser = new AliceBotParser();
			bot = parser.parse(new FileInputStream(System.getProperty("alice.context.path")),
					new FileInputStream(System.getProperty("alice.splitters.path")),
					new FileInputStream(System.getProperty("alice.substitutions.path")),
					searcher.search(System.getProperty("alice.aiml"), ".*\\.aiml"));
		} catch (AliceBotParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("[ExceptionInfo]相关文件没有找到。", e);
		} catch (AliceBotParserException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// Context context = bot.getContext();
		// context.outputStream(gossip);
		return bot;
	}
}
