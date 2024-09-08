/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Global destructors destruct the type.
 *  @note  conceptually, they cannot be called. But they are materialized as a function "delete" like destructors and
 *  behave like them. The signatures cannot overlap as global destrocturs cannot define parameters.
 */
@SuppressWarnings("all")
public class GlobalDestructor extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged GlobalDestructor. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public GlobalDestructor() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    GlobalDestructor(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 63;
    }

    protected boolean isClass;

    /**
     *  Class destructors have the class as implicit parameter; type destructors take no parameter.
     */
    public boolean getIsClass() {
        return isClass;
    }

    /**
     *  Class destructors have the class as implicit parameter; type destructors take no parameter.
     */
    final public void setIsClass(boolean isClass) {
        this.isClass = isClass;
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
    public GlobalDestructor self() {
        return this;
    }

}
