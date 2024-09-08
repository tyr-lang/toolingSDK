/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A parameter in a call. A placement operator can be used to assign the value to a specific formal parameter.
 */
@SuppressWarnings("all")
public class Parameter extends Node {

    /**
     * Create a new unmanaged Parameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Parameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Parameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 15;
    }

    protected java.lang.String name;

    /**
     *  null iff no placement has been used
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     *  null iff no placement has been used
     */
    final public void setName(java.lang.String name) {
        this.name = name;
    }

}
