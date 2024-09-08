/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A function definition.
 */
@SuppressWarnings("all")
public class Function extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged Function. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Function() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Function(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 60;
    }

    protected Object kind;// = tyr.tooling.sdk.ast.Kind.Typ;

    final public EnumProxy<tyr.tooling.sdk.ast.Kind> getKind() {
        if (kind instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Kind>) kind;
        throw new IllegalStateException("kind is currently not a proxy: " + kind);
    }
    final public tyr.tooling.sdk.ast.Kind getKindAsEnum() {
        if (null == kind)
            return (tyr.tooling.sdk.ast.Kind) (kind = tyr.tooling.sdk.ast.Kind.Cls);
        if (kind instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Kind>) kind).target;
        return (tyr.tooling.sdk.ast.Kind) kind;
    }

    final public void setKind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
        this.kind = kind;
    }
    final public void setKind(tyr.tooling.sdk.ast.Kind kind) {
        if (null != this.kind && this.kind instanceof EnumProxy<?>)
            this.kind = ((EnumProxy<tyr.tooling.sdk.ast.Kind>) this.kind).owner.proxy(kind);
        else
            this.kind = kind;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams;

    /**
     * 
     *  @note  null if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> getCTParams() {
        return CTParams;
    }

    /**
     * 
     *  @note  null if none have been defined
     */
    final public void setCTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams) {
        this.CTParams = CTParams;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> RTParams;

    /**
     * 
     *  @note  empty if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> getRTParams() {
        return RTParams;
    }

    /**
     * 
     *  @note  empty if none have been defined
     */
    final public void setRTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> RTParams) {
        this.RTParams = RTParams;
    }

    protected tyr.tooling.sdk.ast.Expression returnType;

    public tyr.tooling.sdk.ast.Expression getReturnType() {
        return returnType;
    }

    final public void setReturnType(tyr.tooling.sdk.ast.Expression returnType) {
        this.returnType = returnType;
    }

    protected tyr.tooling.sdk.ast.FunctionRealization realization;

    public tyr.tooling.sdk.ast.FunctionRealization getRealization() {
        return realization;
    }

    final public void setRealization(tyr.tooling.sdk.ast.FunctionRealization realization) {
        this.realization = realization;
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
    public Function self() {
        return this;
    }

}
