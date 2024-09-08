/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class ContinueExpression extends BranchingExpression {

    /**
     * Create a new unmanaged ContinueExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ContinueExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ContinueExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 49;
    }

    protected tyr.tooling.sdk.ast.Expression result;

    /**
     *  null iff void is returned
     */
    public tyr.tooling.sdk.ast.Expression getResult() {
        return result;
    }

    /**
     *  null iff void is returned
     */
    final public void setResult(tyr.tooling.sdk.ast.Expression result) {
        this.result = result;
    }

}
