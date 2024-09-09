/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class NullLiteral extends Literal {

    /**
     * Create a new unmanaged NullLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public NullLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    NullLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 25;
    }

}
