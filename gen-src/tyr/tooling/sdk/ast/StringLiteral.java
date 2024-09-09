/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class StringLiteral extends Literal {

    /**
     * Create a new unmanaged StringLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public StringLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    StringLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 27;
    }

    protected java.lang.String value;

    public java.lang.String getValue() {
        return value;
    }

    final public void setValue(java.lang.String value) {
        this.value = value;
    }

}
