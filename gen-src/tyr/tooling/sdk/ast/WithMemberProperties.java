/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;
import ogss.common.java.internal.Pool;


@SuppressWarnings("all")
public interface WithMemberProperties  {

    /**
     * cast to concrete type
     */
    public default tyr.tooling.sdk.ast.TypeMember self() {
        return (tyr.tooling.sdk.ast.TypeMember) this;
    }

    public tyr.tooling.sdk.ast.DocComment getDoc();

    public void setDoc(tyr.tooling.sdk.ast.DocComment doc);

    public tyr.tooling.sdk.ast.Visibility getVisibility();

    public void setVisibility(tyr.tooling.sdk.ast.Visibility visibility);

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
     * 
     *  @note  null if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getProperties();

    /**
     * 
     *  @note  null if none have been defined
     */
    public void setProperties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties);

    public java.lang.String getName();

    public void setName(java.lang.String name);

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
