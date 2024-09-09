/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class CTApplication extends Expression {

    /**
     * Create a new unmanaged CTApplication. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public CTApplication() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    CTApplication(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 34;
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
