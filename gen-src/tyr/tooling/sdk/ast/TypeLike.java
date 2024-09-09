/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A type definition that has formals and super types.
 */
@SuppressWarnings("all")
public class TypeLike extends TopLevelNode {

    /**
     * Create a new unmanaged TypeLike. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TypeLike() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TypeLike(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 68;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> params;

    /**
     *  Formal parameters of this type.
     *  @note  null if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> getParams() {
        return params;
    }

    /**
     *  Formal parameters of this type.
     *  @note  null if none have been defined
     */
    final public void setParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> params) {
        this.params = params;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> extensions;

    /**
     *  Super types and properties of this type.
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getExtensions() {
        return extensions;
    }

    /**
     *  Super types and properties of this type.
     */
    final public void setExtensions(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> extensions) {
        this.extensions = extensions;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports;

    /**
     *  Imports visible in this type's body.
     *  @note  this is always null for properties atm. as they cannot have bodies
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> getImports() {
        return imports;
    }

    /**
     *  Imports visible in this type's body.
     *  @note  this is always null for properties atm. as they cannot have bodies
     */
    final public void setImports(java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports) {
        this.imports = imports;
    }

}
