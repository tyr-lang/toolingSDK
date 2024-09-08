/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A paragraph is a list of words.
 *  @note  Here, any non-whitespace character sequence counts as word.
 */
@SuppressWarnings("all")
public class DocParagraph extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged DocParagraph. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public DocParagraph() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    DocParagraph(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 93;
    }

    protected java.util.ArrayList<java.lang.String> words;

    public java.util.ArrayList<java.lang.String> getWords() {
        return words;
    }

    final public void setWords(java.util.ArrayList<java.lang.String> words) {
        this.words = words;
    }

}
