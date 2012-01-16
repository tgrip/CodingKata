/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 12/01/12
 * Time: 09:16 PM
 * To change this template use File | Settings | File Templates.
 */
class PrimeTest extends GroovyTestCase {
    void testPrimes() {
        def prime = new PrimeTester()
        prime.getPrimes()
    }
}
