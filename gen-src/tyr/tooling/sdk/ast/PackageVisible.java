/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Entities with this visibility can be accessed from inside the same package.
 */
@SuppressWarnings("all")
public class PackageVisible extends Visibility {

    /**
     * Create a new unmanaged PackageVisible. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public PackageVisible() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    PackageVisible(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 90;
    }

}
