package ge.lanmaster.onmap.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * GWT JUnit <b>integration</b> tests must extend GWTTestCase.
 * Using <code>"GwtTest*"</code> naming pattern exclude them from running with
 * surefire during the test phase.
 */
public class GwtTestOnMap extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
  public String getModuleName() {
    return "ge.lanmaster.onmap.OnMapJUnit";
  }

}
