/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class ReturnExpression extends BranchingExpression {

    /**
     * Create a new unmanaged ReturnExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ReturnExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ReturnExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 48;
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
