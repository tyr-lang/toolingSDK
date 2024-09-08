/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class BranchingExpression extends Expression {

    /**
     * Create a new unmanaged BranchingExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public BranchingExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    BranchingExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 41;
    }

}
