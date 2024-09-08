/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 * 
 *  @note  There is no way to identify parameters of an instantiation with a parser. However, the AST build can perform
 *  a context-sensitive look into target to extract up to two CT arguments and a runtime argument. The first application
 *  is taken and subsequent applications are only taken if they can be fit into this object.
 */
@SuppressWarnings("all")
public class Allocation extends Expression {

    /**
     * Create a new unmanaged Allocation. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Allocation() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Allocation(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 28;
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
