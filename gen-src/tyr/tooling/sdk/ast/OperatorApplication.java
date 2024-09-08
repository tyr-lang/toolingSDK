/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class OperatorApplication extends Expression {

    /**
     * Create a new unmanaged OperatorApplication. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public OperatorApplication() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    OperatorApplication(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 53;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets;

    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getTargets() {
        return targets;
    }

    final public void setTargets(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets) {
        this.targets = targets;
    }

}
