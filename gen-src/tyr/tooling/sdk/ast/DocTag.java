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
public class DocTag extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged DocTag. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public DocTag() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    DocTag(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 84;
    }

    protected java.lang.String name;

    /**
     *  the first word after the @
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     *  the first word after the @
     */
    final public void setName(java.lang.String name) {
        this.name = name;
    }

    protected java.util.ArrayList<java.lang.String> words;

    /**
     *  words thereafter until the first double blank
     */
    public java.util.ArrayList<java.lang.String> getWords() {
        return words;
    }

    /**
     *  words thereafter until the first double blank
     */
    final public void setWords(java.util.ArrayList<java.lang.String> words) {
        this.words = words;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> content;

    /**
     *  all words after the first double blank until the next tag
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> getContent() {
        return content;
    }

    /**
     *  all words after the first double blank until the next tag
     */
    final public void setContent(java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> content) {
        this.content = content;
    }

}
