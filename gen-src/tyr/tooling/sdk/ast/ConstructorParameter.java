/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Formal parameters of constructors may additionally define a field to be initialized.
 */
@SuppressWarnings("all")
public class ConstructorParameter extends FormalParameter {

    /**
     * Create a new unmanaged ConstructorParameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ConstructorParameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ConstructorParameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 78;
    }

    protected java.lang.String initializes;

    /**
     *  Name of the field to be initialized from the formal parameter.
     */
    public java.lang.String getInitializes() {
        return initializes;
    }

    /**
     *  Name of the field to be initialized from the formal parameter.
     */
    final public void setInitializes(java.lang.String initializes) {
        this.initializes = initializes;
    }

}
