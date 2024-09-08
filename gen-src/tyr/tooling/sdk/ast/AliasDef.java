/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 * 
 *  @note  AliasDef must never receive formal parameters. Because, this would introduce type-level lambdas. This, in
 *  turn, is a serious issue for almost anything going on in the bifröst phase.
 */
@SuppressWarnings("all")
public class AliasDef extends TopLevelNode {

    /**
     * Create a new unmanaged AliasDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public AliasDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    AliasDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 67;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    /**
     *  The expression must yield a type.
     */
    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    /**
     *  The expression must yield a type.
     */
    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

}
