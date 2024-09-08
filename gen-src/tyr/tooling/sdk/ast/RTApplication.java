/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class RTApplication extends Expression {

    /**
     * Create a new unmanaged RTApplication. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public RTApplication() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    RTApplication(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 36;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> params;

    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getParams() {
        return params;
    }

    final public void setParams(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> params) {
        this.params = params;
    }

}
