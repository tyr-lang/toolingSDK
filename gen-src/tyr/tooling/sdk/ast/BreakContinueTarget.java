/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Within the bodies of these entities, using a break or continue is allowed.
 */
@SuppressWarnings("all")
public class BreakContinueTarget extends BranchingExpression {

    /**
     * Create a new unmanaged BreakContinueTarget. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public BreakContinueTarget() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    BreakContinueTarget(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 50;
    }

    protected tyr.tooling.sdk.ast.Expression body;

    public tyr.tooling.sdk.ast.Expression getBody() {
        return body;
    }

    final public void setBody(tyr.tooling.sdk.ast.Expression body) {
        this.body = body;
    }

}
