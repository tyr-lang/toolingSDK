/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Realization by definition of a body.
 */
@SuppressWarnings("all")
public class FunctionBody extends FunctionRealization {

    /**
     * Create a new unmanaged FunctionBody. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FunctionBody() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FunctionBody(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 80;
    }

    protected tyr.tooling.sdk.ast.Expression body;

    public tyr.tooling.sdk.ast.Expression getBody() {
        return body;
    }

    final public void setBody(tyr.tooling.sdk.ast.Expression body) {
        this.body = body;
    }

}
