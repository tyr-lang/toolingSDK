/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The definition of a class.
 */
@SuppressWarnings("all")
public class ClassDef extends TypeWithMembers {

    /**
     * Create a new unmanaged ClassDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ClassDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ClassDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 74;
    }

}
