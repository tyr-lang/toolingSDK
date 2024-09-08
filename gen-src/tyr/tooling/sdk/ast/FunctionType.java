/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A literal function type
 *  @note  either ctParams or rtParams is not null
 *  @note  name can be null for parameters from both parameter lists
 *  @note  value is interpreted as type for parameters from both parameter lists
 */
@SuppressWarnings("all")
public class FunctionType extends Expression {

    /**
     * Create a new unmanaged FunctionType. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FunctionType() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FunctionType(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 31;
    }

    protected Object kind;// = tyr.tooling.sdk.ast.FunctionTypeKind.Def;

    final public EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind> getKind() {
        if (kind instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>) kind;
        throw new IllegalStateException("kind is currently not a proxy: " + kind);
    }
    final public tyr.tooling.sdk.ast.FunctionTypeKind getKindAsEnum() {
        if (null == kind)
            return (tyr.tooling.sdk.ast.FunctionTypeKind) (kind = tyr.tooling.sdk.ast.FunctionTypeKind.Cls);
        if (kind instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>) kind).target;
        return (tyr.tooling.sdk.ast.FunctionTypeKind) kind;
    }

    final public void setKind(EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind> kind) {
        this.kind = kind;
    }
    final public void setKind(tyr.tooling.sdk.ast.FunctionTypeKind kind) {
        if (null != this.kind && this.kind instanceof EnumProxy<?>)
            this.kind = ((EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>) this.kind).owner.proxy(kind);
        else
            this.kind = kind;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> ctParams;

    /**
     *  note: null if not present
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getCtParams() {
        return ctParams;
    }

    /**
     *  note: null if not present
     */
    final public void setCtParams(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> ctParams) {
        this.ctParams = ctParams;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> rtParams;

    /**
     *  note: null if not present and ctParams is not null
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> getRtParams() {
        return rtParams;
    }

    /**
     *  note: null if not present and ctParams is not null
     */
    final public void setRtParams(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> rtParams) {
        this.rtParams = rtParams;
    }

    protected tyr.tooling.sdk.ast.Expression result;

    /**
     *  the result type
     */
    public tyr.tooling.sdk.ast.Expression getResult() {
        return result;
    }

    /**
     *  the result type
     */
    final public void setResult(tyr.tooling.sdk.ast.Expression result) {
        this.result = result;
    }

}
