/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Unifies file properties.
 *  @author  Timm Felden
 */
@SuppressWarnings("all")
public class File extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged File. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public File() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    File(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 10;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    protected tyr.tooling.sdk.ast.File parent;

    /**
     *  null iff package root directory
     */
    public tyr.tooling.sdk.ast.File getParent() {
        return parent;
    }

    /**
     *  null iff package root directory
     */
    final public void setParent(tyr.tooling.sdk.ast.File parent) {
        this.parent = parent;
    }

}
