/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Represents all forms of switch expressions
 */
@SuppressWarnings("all")
public class SwitchExpression extends SwitchLike {

    /**
     * Create a new unmanaged SwitchExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public SwitchExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    SwitchExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 44;
    }

    protected Object kind;// = tyr.tooling.sdk.ast.Kind.Typ;

    /**
     *  The kind specified in the code. It is legal for obj to be implicitly a switch class.
     */
    final public EnumProxy<tyr.tooling.sdk.ast.Kind> getKind() {
        if (kind instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Kind>) kind;
        throw new IllegalStateException("kind is currently not a proxy: " + kind);
    }
    /**
     *  The kind specified in the code. It is legal for obj to be implicitly a switch class.
     */
    final public tyr.tooling.sdk.ast.Kind getKindAsEnum() {
        if (null == kind)
            return (tyr.tooling.sdk.ast.Kind) (kind = tyr.tooling.sdk.ast.Kind.Cls);
        if (kind instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Kind>) kind).target;
        return (tyr.tooling.sdk.ast.Kind) kind;
    }

    /**
     *  The kind specified in the code. It is legal for obj to be implicitly a switch class.
     */
    final public void setKind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
        this.kind = kind;
    }
    /**
     *  The kind specified in the code. It is legal for obj to be implicitly a switch class.
     */
    final public void setKind(tyr.tooling.sdk.ast.Kind kind) {
        if (null != this.kind && this.kind instanceof EnumProxy<?>)
            this.kind = ((EnumProxy<tyr.tooling.sdk.ast.Kind>) this.kind).owner.proxy(kind);
        else
            this.kind = kind;
    }

    protected tyr.tooling.sdk.ast.Expression guard;

    public tyr.tooling.sdk.ast.Expression getGuard() {
        return guard;
    }

    final public void setGuard(tyr.tooling.sdk.ast.Expression guard) {
        this.guard = guard;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> cases;

    /**
     * 
     *  @note  empty is not allowed but heimdahl will parse them anyway
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> getCases() {
        return cases;
    }

    /**
     * 
     *  @note  empty is not allowed but heimdahl will parse them anyway
     */
    final public void setCases(java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> cases) {
        this.cases = cases;
    }

    protected tyr.tooling.sdk.ast.Expression others;

    /**
     * 
     *  @note  null not allowed but heimdahl will parse them anyway
     */
    public tyr.tooling.sdk.ast.Expression getOthers() {
        return others;
    }

    /**
     * 
     *  @note  null not allowed but heimdahl will parse them anyway
     */
    final public void setOthers(tyr.tooling.sdk.ast.Expression others) {
        this.others = others;
    }

}
