/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Global initializers construct the type.
 *  @note  conceptually, they cannot be called. But they are materialized as a function "new" like constructors and
 *  behave like them. The signatures cannot overlap as global initializers cannot define parameters.
 */
@SuppressWarnings("all")
public class GlobalInitializer extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged GlobalInitializer. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public GlobalInitializer() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    GlobalInitializer(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 64;
    }

    protected boolean isClass;

    /**
     *  Class initializers have the class as implicit parameter; type initializers take no parameter.
     */
    public boolean getIsClass() {
        return isClass;
    }

    /**
     *  Class initializers have the class as implicit parameter; type initializers take no parameter.
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
    public GlobalInitializer self() {
        return this;
    }

}
