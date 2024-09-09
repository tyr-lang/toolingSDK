/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The base class of all AST nodes.
 */
@SuppressWarnings("all")
public class Node extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged Node. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Node() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Node(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 11;
    }

    protected tyr.tooling.sdk.ast.Node parent;

    /**
     *  Parents can be accessed for all nodes but the global root. The other direction is not created automatically, as
     *  neither benefit nor order are obvious.
     */
    public tyr.tooling.sdk.ast.Node getParent() {
        return parent;
    }

    /**
     *  Parents can be accessed for all nodes but the global root. The other direction is not created automatically, as
     *  neither benefit nor order are obvious.
     */
    final public void setParent(tyr.tooling.sdk.ast.Node parent) {
        this.parent = parent;
    }

    protected tyr.tooling.sdk.ast.Position pos;

    /**
     *  Not null iff the node has a defined position. As this is a global AST, there will be some nodes without
     *  position. Also, an annotated AST may point to extern objects who will also not have positions.
     *  @note  Template instances will inherit their position from their definition.
     */
    public tyr.tooling.sdk.ast.Position getPos() {
        return pos;
    }

    /**
     *  Not null iff the node has a defined position. As this is a global AST, there will be some nodes without
     *  position. Also, an annotated AST may point to extern objects who will also not have positions.
     *  @note  Template instances will inherit their position from their definition.
     */
    final public void setPos(tyr.tooling.sdk.ast.Position pos) {
        this.pos = pos;
    }

}
