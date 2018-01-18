package pa193.sixeleven.parser;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dogukan
 */
public class ValidityTest {

    public static final String VALID_BLOCK_HEX_STRING =
            "f9beb611d700000001000100524c85a744672dd9a3c2e794c5ed473f1d98c6d493801572529bc8c3960000006e318b64ee63ac" +
            "50723af6ccb324a4a84f1fcd8e25f185a7e527b3568f1daca2c86fd655f0ff0f1e000351520101000000010000000000000000" +
            "000000000000000000000000000000000000000000000000ffffffff0704f0ff0f1e0108ffffffff010003d8390e0000004341" +
            "043d85d6355c84738ca498482525e6ac032a4bce87ec3b4d97104eaa8be708591d5acdfca0fc1d0c940e5a33223bf4b158816e" +
            "e3492fbc00b2a26ba9ef12b44cbfac00000000";

    public static final String INVALID_BLOCK_HEX_STRING =
            "f9beb6114DbdDdD5a7EDD3a96615ECfE1eEbbbEEe89758eea1baFeD9b4b46BeDD2dFEB1852fABACd42A99DDE5E35fEEE03E36B" +
            "A2FE444E7aEEC5F2Ae43DC40E01C14bE02CdFb47B5358fdBf2483CFb10d813c3e39656F7Ed9ABCD7cB572B39F7EDFb9A7b0e0e" +
            "aE9ecDBf45d32dF83169Df96f3AbC24ABcB32534d99774a636D27CcdcBaEcEFbad62BECb8C0b007dec06a2e64BeC0FB1Dce41e" +
            "a0376ddFe9Ca7afd018977FE7A038dA5593dE61DA69eCaaed3bb5e5Db4388B1DEce57F1Dd6abD2f9EF7cA34604a988a030431e" +
            "2bAdDE34a04B2ed7FddCCc03e5C5EEE7bC0d32";

    public ValidityTest() {}

    @Test
    public void blockValidityTest() {
        SixElevenBlock validBlock = new SixElevenBlock(VALID_BLOCK_HEX_STRING);
        SixElevenBlock invalidBlock = new SixElevenBlock(INVALID_BLOCK_HEX_STRING);

        validBlock.Parse_Hex(validBlock.getblockhexstring());
        invalidBlock.Parse_Hex(invalidBlock.getblockhexstring());

        Assert.assertTrue(validBlock.ifValid());
        Assert.assertFalse(invalidBlock.ifValid());
    }
}
