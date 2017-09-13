package jroadie.groovystatic

/**
 * you cannot use parameterized method invocation in groovy unlike kotlin
 */
class ParameterizedMethodInvocation {

    static void inovkeParameterizedMethod() {
        //parameterizedMethod("one", two: 2, three: new Date()) /* this won't compile */
        parameterizedMethod("one", 2, new Date())
    }

    static void parameterizedMethod(String one, Integer two, Date three) {
        println one
        println two
        println three
    }
}
