
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 15/12/11
 * Time: 21:26
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzz {
    void iterateUntil(int finish) {
        def numbers = 1..finish
        numbers.each { number ->
            println checkFizzBuzz(number)
        }
    }

    private def checkFizzBuzz(int number) {
        if (isDividebleBy(number, 15)) {
            return 'fizzbuzz'
        } else if (isDividebleBy(number, 5)) {
            return 'buzz'
        } else if (isDividebleBy(number, 3)) {
            return 'fizz'
        } else {
            return number
        }
    }

    private boolean isDividebleBy(int number, int dividend) {
        return number % dividend == 0
    }
}
