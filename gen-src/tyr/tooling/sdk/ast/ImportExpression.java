/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Import a path into the current scope.
 */
@SuppressWarnings("all")
public class ImportExpression extends Expression {

    /**
     * Create a new unmanaged ImportExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ImportExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ImportExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 37;
    }

    protected java.lang.String name;

    /**
     *  The name under which the result shall be visible. If none is provided, the target must be a MemberAccess whose
     *  name will be used instead.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     *  The name under which the result shall be visible. If none is provided, the target must be a MemberAccess whose
     *  name will be used instead.
     */
    final public void setName(java.lang.String name) {
        this.name = name;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    /**
     *  An expression resulting in a top-level definition.
     */
    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    /**
     *  An expression resulting in a top-level definition.
     */
    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

}
