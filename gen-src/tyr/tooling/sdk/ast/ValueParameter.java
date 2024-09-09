/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class ValueParameter extends Parameter {

    /**
     * Create a new unmanaged ValueParameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ValueParameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ValueParameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 17;
    }

    protected tyr.tooling.sdk.ast.Expression value;

    public tyr.tooling.sdk.ast.Expression getValue() {
        return value;
    }

    final public void setValue(tyr.tooling.sdk.ast.Expression value) {
        this.value = value;
    }

}
