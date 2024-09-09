/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A try-catch block as known from most other languages. In contrast to other languages, the declaration order of
 *  handlers is irrelevant.
 */
@SuppressWarnings("all")
public class TryExpression extends SwitchLike {

    /**
     * Create a new unmanaged TryExpression. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TryExpression() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TryExpression(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 43;
    }

    protected tyr.tooling.sdk.ast.Position catchPos;

    /**
     *  the sloc of the catch token
     */
    public tyr.tooling.sdk.ast.Position getCatchPos() {
        return catchPos;
    }

    /**
     *  the sloc of the catch token
     */
    final public void setCatchPos(tyr.tooling.sdk.ast.Position catchPos) {
        this.catchPos = catchPos;
    }

    protected tyr.tooling.sdk.ast.Position finallyPos;

    /**
     *  the sloc of the finally token
     */
    public tyr.tooling.sdk.ast.Position getFinallyPos() {
        return finallyPos;
    }

    /**
     *  the sloc of the finally token
     */
    final public void setFinallyPos(tyr.tooling.sdk.ast.Position finallyPos) {
        this.finallyPos = finallyPos;
    }

    protected tyr.tooling.sdk.ast.Expression body;

    /**
     *  the expression guarded by the try block
     */
    public tyr.tooling.sdk.ast.Expression getBody() {
        return body;
    }

    /**
     *  the expression guarded by the try block
     */
    final public void setBody(tyr.tooling.sdk.ast.Expression body) {
        this.body = body;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> cases;

    /**
     * 
     *  @note  the case labels act as exception types
     *  @note  empty is not allowed but heimdahl will parse them anyway
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> getCases() {
        return cases;
    }

    /**
     * 
     *  @note  the case labels act as exception types
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

    protected tyr.tooling.sdk.ast.Expression Zfinally;

    /**
     *  An optional expression executed after all other effects
     */
    public tyr.tooling.sdk.ast.Expression getFinally() {
        return Zfinally;
    }

    /**
     *  An optional expression executed after all other effects
     */
    final public void setFinally(tyr.tooling.sdk.ast.Expression Zfinally) {
        this.Zfinally = Zfinally;
    }

}
