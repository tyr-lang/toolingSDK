/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class TypeWithMembers extends TypeLike {

    /**
     * Create a new unmanaged TypeWithMembers. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public TypeWithMembers() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    TypeWithMembers(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 72;
    }

    protected boolean flat;

    /**
     *  if true, the definition was a flat definition that covers the entire file
     */
    public boolean getFlat() {
        return flat;
    }

    /**
     *  if true, the definition was a flat definition that covers the entire file
     */
    final public void setFlat(boolean flat) {
        this.flat = flat;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> members;

    public java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> getMembers() {
        return members;
    }

    final public void setMembers(java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> members) {
        this.members = members;
    }

}
