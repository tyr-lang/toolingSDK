/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Definitions that can appear at top level.
 */
@SuppressWarnings("all")
public class TopLevelNode extends Node implements NamedMember, Scope {

    /**
     * Create a new unmanaged TopLevelNode. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TopLevelNode() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TopLevelNode(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 66;
    }

    protected tyr.tooling.sdk.ast.DocComment doc;

    public tyr.tooling.sdk.ast.DocComment getDoc() {
        return doc;
    }

    final public void setDoc(tyr.tooling.sdk.ast.DocComment doc) {
        this.doc = doc;
    }

    protected tyr.tooling.sdk.ast.Visibility visibility;

    public tyr.tooling.sdk.ast.Visibility getVisibility() {
        return visibility;
    }

    final public void setVisibility(tyr.tooling.sdk.ast.Visibility visibility) {
        this.visibility = visibility;
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
    public TopLevelNode self() {
        return this;
    }

}
