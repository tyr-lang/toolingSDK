/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An explicit super destructor call.
 *  @note  Heimdahl will rewrite the parse tree and insert empty ctArgs and rtArgs if required.
 *  @note  Bifröst will check that this happens within a destructor and targets a direct super type.
 */
@SuppressWarnings("all")
public class SuperDestructorCall extends Expression {

    /**
     * Create a new unmanaged SuperDestructorCall. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public SuperDestructorCall() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    SuperDestructorCall(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 54;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

}
