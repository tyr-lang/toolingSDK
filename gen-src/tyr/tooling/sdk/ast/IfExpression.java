/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class IfExpression extends BranchingExpression {

    /**
     * Create a new unmanaged IfExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public IfExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    IfExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 45;
    }

    protected tyr.tooling.sdk.ast.Expression guard;

    public tyr.tooling.sdk.ast.Expression getGuard() {
        return guard;
    }

    final public void setGuard(tyr.tooling.sdk.ast.Expression guard) {
        this.guard = guard;
    }

    protected tyr.tooling.sdk.ast.Expression tb;

    /**
     *  then branch
     */
    public tyr.tooling.sdk.ast.Expression getTb() {
        return tb;
    }

    /**
     *  then branch
     */
    final public void setTb(tyr.tooling.sdk.ast.Expression tb) {
        this.tb = tb;
    }

    protected tyr.tooling.sdk.ast.Expression eb;

    /**
     *  else branch; can be null
     */
    public tyr.tooling.sdk.ast.Expression getEb() {
        return eb;
    }

    /**
     *  else branch; can be null
     */
    final public void setEb(tyr.tooling.sdk.ast.Expression eb) {
        this.eb = eb;
    }

}
