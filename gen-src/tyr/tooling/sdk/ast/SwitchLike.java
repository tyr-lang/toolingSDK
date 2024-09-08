/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The parent class of everything that can hold a switch case.
 */
@SuppressWarnings("all")
public class SwitchLike extends BranchingExpression {

    /**
     * Create a new unmanaged SwitchLike. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public SwitchLike() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    SwitchLike(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 42;
    }

    protected java.lang.String guardName;

    /**
     *  the name the guard's value is bound to
     *  @note  null if not bound
     *  @note  for catch, this is never null as it is the name of the exception
     */
    public java.lang.String getGuardName() {
        return guardName;
    }

    /**
     *  the name the guard's value is bound to
     *  @note  null if not bound
     *  @note  for catch, this is never null as it is the name of the exception
     */
    final public void setGuardName(java.lang.String guardName) {
        this.guardName = guardName;
    }

}
