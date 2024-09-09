/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An explicit super constructor call.
 *  @note  Heimdahl will rewrite the parse tree and insert empty ctArgs and rtArgs if required.
 *  @note  Bifröst will check that this happens within a constructor and targets a direct super type.
 */
@SuppressWarnings("all")
public class SuperConstructorCall extends Expression {

    /**
     * Create a new unmanaged SuperConstructorCall. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public SuperConstructorCall() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    SuperConstructorCall(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 55;
    }

    protected tyr.tooling.sdk.ast.Expression target;

    /**
     *  the expression yielding the type to be instantiated
     */
    public tyr.tooling.sdk.ast.Expression getTarget() {
        return target;
    }

    /**
     *  the expression yielding the type to be instantiated
     */
    final public void setTarget(tyr.tooling.sdk.ast.Expression target) {
        this.target = target;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> first;

    /**
     *  first CT args
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getFirst() {
        return first;
    }

    /**
     *  first CT args
     */
    final public void setFirst(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> first) {
        this.first = first;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> second;

    /**
     *  second CT args
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getSecond() {
        return second;
    }

    /**
     *  second CT args
     */
    final public void setSecond(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> second) {
        this.second = second;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> args;

    /**
     *  RT args
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getArgs() {
        return args;
    }

    /**
     *  RT args
     */
    final public void setArgs(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> args) {
        this.args = args;
    }

}
