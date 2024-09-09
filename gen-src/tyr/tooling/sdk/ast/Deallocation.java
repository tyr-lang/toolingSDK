/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  delete target
 */
@SuppressWarnings("all")
public class Deallocation extends Expression {

    /**
     * Create a new unmanaged Deallocation. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Deallocation() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Deallocation(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 30;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> target;

    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getTarget() {
        return target;
    }

    final public void setTarget(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> target) {
        this.target = target;
    }

}
