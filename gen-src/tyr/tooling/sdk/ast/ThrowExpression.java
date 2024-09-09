/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class ThrowExpression extends BranchingExpression {

    /**
     * Create a new unmanaged ThrowExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ThrowExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ThrowExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 47;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    /**
     *  the expression to be thrown
     */
    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    /**
     *  the expression to be thrown
     */
    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

}
