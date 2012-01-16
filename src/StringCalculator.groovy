/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 15/12/11
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */
class StringCalculator {
    int add(String numbers) {
        if (!numbers) {
            return 0
        }
        if (numbers.isInteger()) {
            def result = numbers.toInteger()
            if (result < 0) {
                throwException()
            }
            return result
        }
        addWithSeparator(numbers)
    }

    private def throwException(String message = 'No negative numbers allowed') {
        throw new IllegalArgumentException(message)
    }

    private def addWithSeparator(String numbers) {
        def lines = numbers.readLines()
        def firstLine = lines.first()
        def delimiter = ','
        if (firstLine.startsWith('//')) {
            delimiter = firstLine[2]
            numbers = lines.tail().sum()
        }
        def parts = numbers.tokenize()
        if (parts.size() == 1) {
            parts = numbers.tokenize(delimiter)
        }
        def intList = parts.collect {it.toInteger()}
        def negativeNumbers = intList.findAll {it < 0}
        if (negativeNumbers) {
            if (negativeNumbers.size() == 1) {
                throwException()
            }  else {
                throwException("No negative numbers like ${negativeNumbers.join(',')} allowed")
            }

        }
        return intList.sum()
    }
}
