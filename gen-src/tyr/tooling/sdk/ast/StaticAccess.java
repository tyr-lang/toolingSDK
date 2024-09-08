/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class StaticAccess extends Expression {

    /**
     * Create a new unmanaged StaticAccess. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public StaticAccess() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    StaticAccess(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 33;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

}
