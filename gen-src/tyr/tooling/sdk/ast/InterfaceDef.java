/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The definition of an interface.
 */
@SuppressWarnings("all")
public class InterfaceDef extends TypeWithMembers {

    /**
     * Create a new unmanaged InterfaceDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public InterfaceDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    InterfaceDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 75;
    }

}
