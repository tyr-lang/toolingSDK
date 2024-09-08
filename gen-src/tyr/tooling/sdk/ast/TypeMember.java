/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class TypeMember extends Node implements NamedMember {

    /**
     * Create a new unmanaged TypeMember. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TypeMember() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TypeMember(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 57;
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

    @Override
    public TypeMember self() {
        return this;
    }

}
