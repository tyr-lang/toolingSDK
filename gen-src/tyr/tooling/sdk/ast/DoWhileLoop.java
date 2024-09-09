/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class DoWhileLoop extends BreakContinueTarget {

    /**
     * Create a new unmanaged DoWhileLoop. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public DoWhileLoop() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    DoWhileLoop(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 52;
    }

    protected tyr.tooling.sdk.ast.Expression guard;

    public tyr.tooling.sdk.ast.Expression getGuard() {
        return guard;
    }

    final public void setGuard(tyr.tooling.sdk.ast.Expression guard) {
        this.guard = guard;
    }

}
