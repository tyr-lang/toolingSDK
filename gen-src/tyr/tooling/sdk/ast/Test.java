/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A test definition.
 *  @note  tests must always have default visibility
 */
@SuppressWarnings("all")
public class Test extends TypeMember {

    /**
     * Create a new unmanaged Test. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Test() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Test(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 58;
    }

    protected java.lang.String category;

    public java.lang.String getCategory() {
        return category;
    }

    final public void setCategory(java.lang.String category) {
        this.category = category;
    }

    protected java.util.ArrayList<java.lang.String> categoryParams;

    public java.util.ArrayList<java.lang.String> getCategoryParams() {
        return categoryParams;
    }

    final public void setCategoryParams(java.util.ArrayList<java.lang.String> categoryParams) {
        this.categoryParams = categoryParams;
    }

    protected tyr.tooling.sdk.ast.Block body;

    public tyr.tooling.sdk.ast.Block getBody() {
        return body;
    }

    final public void setBody(tyr.tooling.sdk.ast.Block body) {
        this.body = body;
    }

}
