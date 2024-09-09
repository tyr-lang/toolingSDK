/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class Literal extends Expression {

    /**
     * Create a new unmanaged Literal. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Literal() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Literal(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 21;
    }

}
