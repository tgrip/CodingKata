
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 15/12/11
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
class StringCalculatorTest extends GroovyTestCase {
    StringCalculator calc = new StringCalculator()

    void testCalculateEmpty() {
        assert 0 == calc.add('')
    }

    void testReturnSameNumber() {
        assert 7 == calc.add('7')
    }

    void testAdd() {
        assert 3 == calc.add('2,1')
    }

    void testAddALotOfNumbers() {
        assert 6 == calc.add('2,1,3')
    }

    void testAllowNewLine(){
        def variable = '''1
        2'''
        assert 3 == calc.add(variable)
    }

    void testAllowSeparatorToBeConfigurable() {
        String variable = '''//+
        1+2'''
        assert 3 == calc.add(variable)
    }

    void testDoNotAllowNegativeNumbers() {
        shouldFail (IllegalArgumentException) {
            calc.add('-7')
        }
    }

    void testDoNotAllowNegativeNumbersInSum() {
        shouldFail (IllegalArgumentException) {
            calc.add('-7,2')
        }
    }

    void testGetNegativeNumbers() {
        try {
            calc.add('-3,-4')
            fail()
        } catch (IllegalArgumentException e) {
            def message = e.getMessage()
            assert message.contains('-3')
            assert message.contains('-4')
        }
    }

    void testIgnoreBiggerThanThousand(){
        assert 0 == calc.add('1001' )
    }

    void testDelimiterWithAnyLength() {

    }

    void testMoreThanOneDelimiter() {

    }

    void testVariousDelimitersWithAnyLength() {

    }
}
