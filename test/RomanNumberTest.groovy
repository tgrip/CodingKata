
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 12/01/12
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumberTest extends GroovyTestCase {
    def romanNumber = new RomanNumber()

    void testShouldConvertOne() {
        assert 'I' == romanNumber.convertToRoman(1)
    }

    void testShouldConvertTwo() {
        assert 'II' == romanNumber.convertToRoman(2)
    }

     void testShouldConvertFive() {
        assert 'V' == romanNumber.convertToRoman(5)
    }

     void testShouldConvertFour() {
        assert 'IV' == romanNumber.convertToRoman(4)
    }

    void testShouldConvertSix() {
        assert 'VI' == romanNumber.convertToRoman(6)
    }

     void testShouldConvertTen() {
        assert 'X' == romanNumber.convertToRoman(10)
    }

     void testShouldConvertEleven() {
        assert 'XI' == romanNumber.convertToRoman(11)
    }

     void testShouldConvertTwentyNine() {
        assert 'XXIX' == romanNumber.convertToRoman(29)
    }

    void testShouldConvert_248() {
        assert 'CCXLVIII' == romanNumber.convertToRoman(248)
    }

     void testShouldConvert_1954() {
        assert 'MCMLIV' == romanNumber.convertToRoman(1954)
    }

     void testShouldConvert_1990() {
        assert 'MCMXC' == romanNumber.convertToRoman(1990)
    }
}
