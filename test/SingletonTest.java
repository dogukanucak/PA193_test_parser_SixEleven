/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dogukan
 */
import org.apache.log4j.Logger;
import junit.framework.Assert;
import junit.framework.TestCase;
import pa193_test_parser_sixeleven.SixElevenHttpClient;
public class SingletonTest extends TestCase {
   private SixElevenHttpClient sixelevenclient = null, stwo = null;
   private static Logger logger = Logger.getRootLogger();
   public SingletonTest(String name) {
      super(name);
   }
   public void setUp() {
      logger.info("getting singleton...");
      sixelevenclient =  SixElevenHttpClient.getInstance();
      logger.info("...got singleton: " + sixelevenclient);
      logger.info("getting singleton...");
      stwo =  SixElevenHttpClient.getInstance();
      logger.info("...got singleton: " + stwo);
   }
   public void testUnique() {
      logger.info("checking singletons for equality");
      Assert.assertEquals(true, sixelevenclient == stwo);
   }
}
