/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An entity that holds procted or private restrictions.
 *  @note  this is an AST, hence we do not resolve the semantics from missing CT args
 *  @note  If not CT args are provided, the parent of the restricted entity is chosen. Surprisingly, this is always what
 *  one wants.
 *  @inv  isProtected | isPrivate
 */
@SuppressWarnings("all")
public class RestrictedVisible extends Visibility {

    /**
     * Create a new unmanaged RestrictedVisible. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public RestrictedVisible() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    RestrictedVisible(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 92;
    }

    protected boolean isProtected;

    public boolean getIsProtected() {
        return isProtected;
    }

    final public void setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }

    protected tyr.tooling.sdk.ast.Expression Zprotected;

    public tyr.tooling.sdk.ast.Expression getProtected() {
        return Zprotected;
    }

    final public void setProtected(tyr.tooling.sdk.ast.Expression Zprotected) {
        this.Zprotected = Zprotected;
    }

    protected boolean isPrivate;

    public boolean getIsPrivate() {
        return isPrivate;
    }

    final public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    protected tyr.tooling.sdk.ast.Expression Zprivate;

    public tyr.tooling.sdk.ast.Expression getPrivate() {
        return Zprivate;
    }

    final public void setPrivate(tyr.tooling.sdk.ast.Expression Zprivate) {
        this.Zprivate = Zprivate;
    }

}
