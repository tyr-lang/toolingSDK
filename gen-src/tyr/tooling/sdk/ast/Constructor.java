/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A constructor of a type.
 *  @note  the name of a constructor is always new.
 */
@SuppressWarnings("all")
public class Constructor extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged Constructor. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Constructor() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Constructor(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 62;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams;

    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> getCTParams() {
        return CTParams;
    }

    final public void setCTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams) {
        this.CTParams = CTParams;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> RTParams;

    public java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> getRTParams() {
        return RTParams;
    }

    final public void setRTParams(java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> RTParams) {
        this.RTParams = RTParams;
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
    public Constructor self() {
        return this;
    }

}
