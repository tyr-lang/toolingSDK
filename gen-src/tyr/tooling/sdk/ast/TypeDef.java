/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The definition of a type.
 */
@SuppressWarnings("all")
public class TypeDef extends TypeWithMembers {

    /**
     * Create a new unmanaged TypeDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TypeDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TypeDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 73;
    }

}
