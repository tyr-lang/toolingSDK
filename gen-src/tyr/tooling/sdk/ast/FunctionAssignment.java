/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Realization by placing another function into this function.
 */
@SuppressWarnings("all")
public class FunctionAssignment extends FunctionRealization {

    /**
     * Create a new unmanaged FunctionAssignment. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FunctionAssignment() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FunctionAssignment(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 83;
    }

    protected tyr.tooling.sdk.ast.Expression source;

    public tyr.tooling.sdk.ast.Expression getSource() {
        return source;
    }

    final public void setSource(tyr.tooling.sdk.ast.Expression source) {
        this.source = source;
    }

}
