
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 12/01/12
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumber {
    static final ONE_TO_TEN = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
    static final TEN_TO_HUNDRED = ['X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']
    static final HUNDRED_TO_THOUSAND = ['C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM']
    static final THOUSANDS = ['M', 'MM', 'MMM']
    static final ROMAN_BY_POS = [ONE_TO_TEN, TEN_TO_HUNDRED, HUNDRED_TO_THOUSAND, THOUSANDS]

    String convertToRoman(Integer number) {
        String stringNumber = number
        int length = stringNumber.length()
        def result = ''

        def chars = stringNumber.toList()
        chars.eachWithIndex { character, index ->
            def digit = character.toInteger()
            if (digit) {
                def listIndex = length - index - 1
                def list = ROMAN_BY_POS[listIndex]
                result += list[--digit]
            }
        }
        result
    }
}
