/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Abstract functions are functions without implementations. Native functions are also realized by abstract functions.
 */
@SuppressWarnings("all")
public class AbstractFunction extends FunctionRealization {

    /**
     * Create a new unmanaged AbstractFunction. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public AbstractFunction() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    AbstractFunction(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 82;
    }

}
