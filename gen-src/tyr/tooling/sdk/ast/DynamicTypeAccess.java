/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class DynamicTypeAccess extends Expression {

    /**
     * Create a new unmanaged DynamicTypeAccess. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public DynamicTypeAccess() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    DynamicTypeAccess(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 40;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

}
