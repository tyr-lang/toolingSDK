/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The destructor of a type.
 *  @note  the name of a constructor is always delete.
 *  @note  there is at most one destructor in a valid TopLevelNode
 */
@SuppressWarnings("all")
public class Destructor extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged Destructor. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Destructor() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Destructor(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 61;
    }

    protected tyr.tooling.sdk.ast.Block body;

    public tyr.tooling.sdk.ast.Block getBody() {
        return body;
    }

    final public void setBody(tyr.tooling.sdk.ast.Block body) {
        this.body = body;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties;

    /**
     * 
     *  @note  null if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getProperties() {
        return properties;
    }

    /**
     * 
     *  @note  null if none have been defined
     */
    final public void setProperties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
        this.properties = properties;
    }

    @Override
    public Destructor self() {
        return this;
    }

}
