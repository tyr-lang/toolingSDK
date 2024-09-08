/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The base class of all AST nodes.
 *  @note  the parent is the documentable node
 */
@SuppressWarnings("all")
public class DocComment extends Node {

    /**
     * Create a new unmanaged DocComment. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public DocComment() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    DocComment(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 18;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> details;

    /**
     *  A list of detailed descriptions. The first serves as overview.
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> getDetails() {
        return details;
    }

    /**
     *  A list of detailed descriptions. The first serves as overview.
     */
    final public void setDetails(java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> details) {
        this.details = details;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> tags;

    /**
     *  A list of tags
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> getTags() {
        return tags;
    }

    /**
     *  A list of tags
     */
    final public void setTags(java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> tags) {
        this.tags = tags;
    }

}
