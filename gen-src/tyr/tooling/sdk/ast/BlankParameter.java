/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class BlankParameter extends Parameter {

    /**
     * Create a new unmanaged BlankParameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public BlankParameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    BlankParameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 16;
    }

}
