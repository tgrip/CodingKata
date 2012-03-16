/**
 * Created by IntelliJ IDEA.
 * User: Theo
 * Date: 8/03/12
 * Time: 09:17 PM
 * To change this template use File | Settings | File Templates.
 */
class LcdConverterTest extends GroovyTestCase {
    def converter = new LcdConverter()

    void testOneElegant() {
        def result = converter.convertToNumberElegant(1)
        assert '   \n  |\n   \n  |\n   ' == result
    }

    void testOne() {
        def result = converter.convertNumber(1)
        assert '''

            |

            |

        ''' == result
    }


    void testTwo() {
        assert '''
            --
              |
            ---
            |
            ---
        ''' == converter.convertNumber(2)
    }

    void testTwoElegant() {
        def result = converter.convertToNumberElegant(2)
        assert '---\n  |\n---\n|  \n---' == result
    }

    void testThree() {
        assert '''
            --
              |
            ---
              |
            ---
        ''' == converter.convertNumber(3)
    }

    void testFour() {
        assert '''

            | |
            ---
              |

        ''' == converter.convertNumber(4)
    }

    void testFive() {
        assert '''
            ---
            |
            ---
              |
            ---
        ''' == converter.convertNumber(5)
    }

    void testSix() {
        assert '''
            ---
            |
            ---
            | |
            ---
        ''' == converter.convertNumber(6)
    }

    void testSeven() {
        assert '''
            ---
              |

              |

        ''' == converter.convertNumber(7)
    }

    void testEight() {
        assert '''
            ---
            | |
            ---
            | |
            ---
        ''' == converter.convertNumber(8)
    }

    void testNine() {
        assert '''
            ---
            | |
            ---
              |
            ---
        ''' == converter.convertNumber(9)
    }

    void testZero() {
        assert '''
            ---
            | |

            | |
            ---
        ''' == converter.convertNumber(0)
    }


}
