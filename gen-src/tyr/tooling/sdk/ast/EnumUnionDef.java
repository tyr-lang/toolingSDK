/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The definition of an enum union.
 */
@SuppressWarnings("all")
public class EnumUnionDef extends TypeLike {

    /**
     * Create a new unmanaged EnumUnionDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public EnumUnionDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    EnumUnionDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 71;
    }

    protected java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> cases;

    /**
     *  Holds all cases. Source locations can be taken from expressions.
     */
    public java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> getCases() {
        return cases;
    }

    /**
     *  Holds all cases. Source locations can be taken from expressions.
     */
    final public void setCases(java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> cases) {
        this.cases = cases;
    }

    protected tyr.tooling.sdk.ast.Expression others;

    /**
     *  Holds the else case. Can be null in which case it is void.
     */
    public tyr.tooling.sdk.ast.Expression getOthers() {
        return others;
    }

    /**
     *  Holds the else case. Can be null in which case it is void.
     */
    final public void setOthers(tyr.tooling.sdk.ast.Expression others) {
        this.others = others;
    }

}
