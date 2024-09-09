/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Realization by a C function loaded from a shared object.
 */
@SuppressWarnings("all")
public class ExternFunction extends FunctionRealization {

    /**
     * Create a new unmanaged ExternFunction. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ExternFunction() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ExternFunction(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 81;
    }

    protected tyr.tooling.sdk.ast.Expression source;

    public tyr.tooling.sdk.ast.Expression getSource() {
        return source;
    }

    final public void setSource(tyr.tooling.sdk.ast.Expression source) {
        this.source = source;
    }

}
