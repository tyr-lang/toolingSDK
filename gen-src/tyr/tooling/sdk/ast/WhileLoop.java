/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class WhileLoop extends BreakContinueTarget {

    /**
     * Create a new unmanaged WhileLoop. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public WhileLoop() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    WhileLoop(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 51;
    }

    protected tyr.tooling.sdk.ast.Expression guard;

    public tyr.tooling.sdk.ast.Expression getGuard() {
        return guard;
    }

    final public void setGuard(tyr.tooling.sdk.ast.Expression guard) {
        this.guard = guard;
    }

}
