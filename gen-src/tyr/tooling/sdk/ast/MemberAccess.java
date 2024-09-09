/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class MemberAccess extends Expression {

    /**
     * Create a new unmanaged MemberAccess. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public MemberAccess() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    MemberAccess(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 32;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

}
