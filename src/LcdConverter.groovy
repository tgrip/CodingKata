
/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 8/03/12
 * Time: 09:20 PM
 * To change this template use File | Settings | File Templates.
 */
class LcdConverter {
    def one = '''

            |

            |

        '''
    def two =  '''
            --
              |
            ---
            |
            ---
        '''
    def three = '''
            --
              |
            ---
              |
            ---
        '''
    def four = '''

            | |
            ---
              |

        '''
    def five = '''
            ---
            |
            ---
              |
            ---
        '''

    def six = '''
            ---
            |
            ---
            | |
            ---
        '''
    def seven = '''
            ---
              |

              |

        '''
    def eight = '''
            ---
            | |
            ---
            | |
            ---
        '''
    def nine = '''
            ---
            | |
            ---
              |
            ---
        '''
    def zero = '''
            ---
            | |

            | |
            ---
        '''

    def numberToLcd = [zero, one, two, three, four, five, six, seven, eight, nine]

    def lcdRules = [1: [true, true, false, true], 2: [false, false, true, false]]

    String convertNumber(Integer number) {
        numberToLcd[number]
    }

    String convertToNumberElegant(Integer number) {
        def rules = lcdRules.get(number)
        def hasHeader = rules[0]
        def firstLine = lines(hasHeader)
        def thirdLineSep = rules[1]
        def thirdLine = lines(thirdLineSep)
        def fourthLineLeft = rules[2]
        def fourthLine = fourthLineLeft ? '|  ' : '  |'
        def footer = rules[3]
        def fifthLine = lines(footer)
        firstLine + '\n  |\n'+ thirdLine + '\n' + fourthLine + '\n' + fifthLine
    }

    String lines(boolean isEmpty) {
        isEmpty ?  '   ' : '---'
    }
}