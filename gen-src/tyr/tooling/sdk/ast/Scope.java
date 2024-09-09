/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;
import ogss.common.java.internal.Pool;


/**
 *  Any node that may hold a scope member.
 */
@SuppressWarnings("all")
public interface Scope extends ScopeMember {

    /**
     * cast to concrete type
     */
    @Override
    public default tyr.tooling.sdk.ast.Node self() {
        return (tyr.tooling.sdk.ast.Node) this;
    }

    /**
     *  Not null iff the node has a defined position. As this is a global AST, there will be some nodes without
     *  position. Also, an annotated AST may point to extern objects who will also not have positions.
     *  @note  Template instances will inherit their position from their definition.
     */
    public tyr.tooling.sdk.ast.Position getPos();

    /**
     *  Not null iff the node has a defined position. As this is a global AST, there will be some nodes without
     *  position. Also, an annotated AST may point to extern objects who will also not have positions.
     *  @note  Template instances will inherit their position from their definition.
     */
    public void setPos(tyr.tooling.sdk.ast.Position pos);

    /**
     *  declarations in this scope
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> getDeclarations();

    /**
     *  declarations in this scope
     */
    public void setDeclarations(java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> declarations);

    /**
     *  Parents can be accessed for all nodes but the global root. The other direction is not created automatically, as
     *  neither benefit nor order are obvious.
     */
    public tyr.tooling.sdk.ast.Node getParent();

    /**
     *  Parents can be accessed for all nodes but the global root. The other direction is not created automatically, as
     *  neither benefit nor order are obvious.
     */
    public void setParent(tyr.tooling.sdk.ast.Node parent);
}
