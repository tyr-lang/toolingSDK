/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Entities with this visibility can be accessed from everywhere.
 */
@SuppressWarnings("all")
public class PublicVisible extends Visibility {

    /**
     * Create a new unmanaged PublicVisible. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public PublicVisible() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    PublicVisible(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 89;
    }

}
