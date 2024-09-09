/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class BinderApplication extends Expression {

    /**
     * Create a new unmanaged BinderApplication. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public BinderApplication() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    BinderApplication(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 39;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> locals;

    public java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> getLocals() {
        return locals;
    }

    final public void setLocals(java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> locals) {
        this.locals = locals;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> blocks;

    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getBlocks() {
        return blocks;
    }

    final public void setBlocks(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> blocks) {
        this.blocks = blocks;
    }

}
