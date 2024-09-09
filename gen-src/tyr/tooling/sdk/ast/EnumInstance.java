/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An enum instance is a node holding a name and an optional initializer.
 */
@SuppressWarnings("all")
public class EnumInstance extends Node implements NamedMember {

    /**
     * Create a new unmanaged EnumInstance. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public EnumInstance() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    EnumInstance(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 65;
    }

    protected tyr.tooling.sdk.ast.Expression initializer;

    public tyr.tooling.sdk.ast.Expression getInitializer() {
        return initializer;
    }

    final public void setInitializer(tyr.tooling.sdk.ast.Expression initializer) {
        this.initializer = initializer;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public EnumInstance self() {
        return this;
    }

}
