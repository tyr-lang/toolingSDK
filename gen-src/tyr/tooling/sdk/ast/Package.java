/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Tyr comes in packages.
 *  @author  Timm Felden
 */
@SuppressWarnings("all")
public class Package extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged Package. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Package() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Package(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 86;
    }

    protected java.util.ArrayList<java.lang.String> name;

    /**
     *  name separated by dots to achieve some compression
     */
    public java.util.ArrayList<java.lang.String> getName() {
        return name;
    }

    /**
     *  name separated by dots to achieve some compression
     */
    final public void setName(java.util.ArrayList<java.lang.String> name) {
        this.name = name;
    }

    protected tyr.tooling.sdk.ast.Namespace root;

    /**
     *  The global root scope as seen from this packages perspective.
     */
    public tyr.tooling.sdk.ast.Namespace getRoot() {
        return root;
    }

    /**
     *  The global root scope as seen from this packages perspective.
     */
    final public void setRoot(tyr.tooling.sdk.ast.Namespace root) {
        this.root = root;
    }

    protected tyr.tooling.sdk.ast.Namespace packageRoot;

    /**
     *  The root scope of this package, i.e. the package denoted by name.
     */
    public tyr.tooling.sdk.ast.Namespace getPackageRoot() {
        return packageRoot;
    }

    /**
     *  The root scope of this package, i.e. the package denoted by name.
     */
    final public void setPackageRoot(tyr.tooling.sdk.ast.Namespace packageRoot) {
        this.packageRoot = packageRoot;
    }

}
