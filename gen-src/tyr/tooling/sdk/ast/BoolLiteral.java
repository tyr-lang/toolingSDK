/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class BoolLiteral extends Literal {

    /**
     * Create a new unmanaged BoolLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public BoolLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    BoolLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 23;
    }

    protected boolean value;

    public boolean getValue() {
        return value;
    }

    final public void setValue(boolean value) {
        this.value = value;
    }

}
