/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Expressions can be evaluated to yield a value.
 */
@SuppressWarnings("all")
public class Expression extends Node {

    /**
     * Create a new unmanaged Expression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Expression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Expression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 19;
    }

    protected tyr.tooling.sdk.ast.Expression ET;

    /**
     *  The expected type of this expression.
     */
    public tyr.tooling.sdk.ast.Expression getET() {
        return ET;
    }

    /**
     *  The expected type of this expression.
     */
    final public void setET(tyr.tooling.sdk.ast.Expression ET) {
        this.ET = ET;
    }

    protected tyr.tooling.sdk.ast.NamedMember definition;

    /**
     *  if an expression is a use of a named member, it is linked here
     */
    public tyr.tooling.sdk.ast.NamedMember getDefinition() {
        return definition;
    }

    /**
     *  if an expression is a use of a named member, it is linked here
     */
    final public void setDefinition(tyr.tooling.sdk.ast.NamedMember definition) {
        this.definition = definition;
    }

    protected java.lang.String prettyType;

    /**
     *  the human-readable version of the type
     */
    public java.lang.String getPrettyType() {
        return prettyType;
    }

    /**
     *  the human-readable version of the type
     */
    final public void setPrettyType(java.lang.String prettyType) {
        this.prettyType = prettyType;
    }

}
