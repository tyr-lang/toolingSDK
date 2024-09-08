/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Namespaces are implicit in Tyr and may be caused by subdirectories or by a definition in the package specification
 *  file.
 */
@SuppressWarnings("all")
public class Namespace extends Node implements NamedMember, Scope {

    /**
     * Create a new unmanaged Namespace. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Namespace() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Namespace(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 14;
    }

    protected transient java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> subspace;

    /**
     *  Child namespecase.
     */
    public java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> getSubspace() {
        return subspace;
    }

    /**
     *  Child namespecase.
     */
    final public void setSubspace(java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> subspace) {
        this.subspace = subspace;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    protected transient java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> declarations;

    /**
     *  declarations in this scope
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> getDeclarations() {
        return declarations;
    }

    /**
     *  declarations in this scope
     */
    final public void setDeclarations(java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> declarations) {
        this.declarations = declarations;
    }

    @Override
    public Namespace self() {
        return this;
    }

}
