
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 12/01/12
 * Time: 09:08 PM
 * To change this template use File | Settings | File Templates.
 */
class PrimeTester {
    int getPrimes() {
        int numberOfPrimes = 0
        def integers = 1..100
        integers.each { number ->
            def result = isPrimes(number)
            println "$number is prime $result"
            if (result) {
                numberOfPrimes++
            }
        }
        println "Number of primes $numberOfPrimes"
        numberOfPrimes
    }

    boolean isPrimes(int number) {
        def range = 2..Math.sqrt(number) + 1
        println "Range $range"
        range.each {
             if (number % it == 0) {
                 return false;
             }
        }
        true
    }
}
