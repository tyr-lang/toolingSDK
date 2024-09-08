/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An enum definition
 */
@SuppressWarnings("all")
public class EnumDef extends TypeLike {

    /**
     * Create a new unmanaged EnumDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public EnumDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    EnumDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 69;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> instances;

    public java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> getInstances() {
        return instances;
    }

    final public void setInstances(java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> instances) {
        this.instances = instances;
    }

}
