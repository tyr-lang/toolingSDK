/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The definition of a property.
 *  @note  Properties have no members.
 */
@SuppressWarnings("all")
public class PropertyDef extends TypeLike {

    /**
     * Create a new unmanaged PropertyDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public PropertyDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    PropertyDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 70;
    }

}
