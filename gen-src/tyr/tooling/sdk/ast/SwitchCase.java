/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An if case of a switch expression
 *  @note  this is simply a node within the SwitchExpression as it is required as node during IR generation but will not
 *  result itself in any IR entity
 */
@SuppressWarnings("all")
public class SwitchCase extends Node {

    /**
     * Create a new unmanaged SwitchCase. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public SwitchCase() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    SwitchCase(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 56;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> labels;

    /**
     *  multiple labels will be represented as a list here
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getLabels() {
        return labels;
    }

    /**
     *  multiple labels will be represented as a list here
     */
    final public void setLabels(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> labels) {
        this.labels = labels;
    }

    protected tyr.tooling.sdk.ast.Expression body;

    public tyr.tooling.sdk.ast.Expression getBody() {
        return body;
    }

    final public void setBody(tyr.tooling.sdk.ast.Expression body) {
        this.body = body;
    }

	 @Override
    public tyr.tooling.sdk.ast.SwitchLike getParent() { return (tyr.tooling.sdk.ast.SwitchLike) parent; }

}
