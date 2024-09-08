/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  An entity defined in another library for the sake of creating links only.
 *  @note  name for such entities is a canonical name relative to package. Thus, "$package/$name" results in a
 *  reportable entity name.
 */
@SuppressWarnings("all")
public class ExtEntity extends Node implements NamedMember {

    /**
     * Create a new unmanaged ExtEntity. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public ExtEntity() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    ExtEntity(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 13;
    }

    protected java.lang.String Zpackage;

    /**
     *  the package name creating this entity
     */
    public java.lang.String getPackage() {
        return Zpackage;
    }

    /**
     *  the package name creating this entity
     */
    final public void setPackage(java.lang.String Zpackage) {
        this.Zpackage = Zpackage;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public ExtEntity self() {
        return this;
    }

}
