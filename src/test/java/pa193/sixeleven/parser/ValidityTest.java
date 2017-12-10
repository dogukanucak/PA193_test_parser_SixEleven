/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193.sixeleven.parser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import pa193.sixeleven.parser.SixElevenBlock;

/**
 *
 * @author dogukan
 */
public class ValidityTest {
    
    public ValidityTest() {
    Result result = JUnitCore.runClasses(ValidityTest.class);
    System.out.println("Result "+result.wasSuccessful());
    blockValidityTest();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void blockValidityTest() {
       SixElevenBlock validtestblock = new SixElevenBlock("f9beb611d700000001000100524c85a744672dd9a3c2e794c5ed473f1d98c6d493801572529bc8c3960000006e318b64ee63ac50723af6ccb324a4a84f1fcd8e25f185a7e527b3568f1daca2c86fd655f0ff0f1e000351520101000000010000000000000000000000000000000000000000000000000000000000000000ffffffff0704f0ff0f1e0108ffffffff010003d8390e0000004341043d85d6355c84738ca498482525e6ac032a4bce87ec3b4d97104eaa8be708591d5acdfca0fc1d0c940e5a33223bf4b158816ee3492fbc00b2a26ba9ef12b44cbfac00000000");
       SixElevenBlock invalidtestblock = new SixElevenBlock("f9beb6114DbdDdD5a7EDD3a96615ECfE1eEbbbEEe89758eea1baFeD9b4b46BeDD2dFEB1852fABACd42A99DDE5E35fEEE03E36BA2FE444E7aEEC5F2Ae43DC40E01C14bE02CdFb47B5358fdBf2483CFb10d813c3e39656F7Ed9ABCD7cB572B39F7EDFb9A7b0e0eaE9ecDBf45d32dF83169Df96f3AbC24ABcB32534d99774a636D27CcdcBaEcEFbad62BECb8C0b007dec06a2e64BeC0FB1Dce41ea0376ddFe9Ca7afd018977FE7A038dA5593dE61DA69eCaaed3bb5e5Db4388B1DEce57F1Dd6abD2f9EF7cA34604a988a030431e2bAdDE34a04B2ed7FddCCc03e5C5EEE7bC0d32");
        validtestblock.Parse_Hex(validtestblock.getblockhexstring());
        invalidtestblock.Parse_Hex(invalidtestblock.getblockhexstring());
        // assert statements
        Assert.assertEquals(true,validtestblock.ifValid());
        Assert.assertEquals(false,invalidtestblock.ifValid());
    }
}
