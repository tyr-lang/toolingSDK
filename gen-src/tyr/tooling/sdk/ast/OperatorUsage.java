/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  usage of an operator in an operator application
 */
@SuppressWarnings("all")
public class OperatorUsage extends Expression {

    /**
     * Create a new unmanaged OperatorUsage. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public OperatorUsage() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    OperatorUsage(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 35;
    }

    protected java.lang.String name;

    /**
     *  the name of the operator, e.g. +
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     *  the name of the operator, e.g. +
     */
    final public void setName(java.lang.String name) {
        this.name = name;
    }

}
