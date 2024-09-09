/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  definition of a variable in a block
 */
@SuppressWarnings("all")
public class VariableDef extends Expression {

    /**
     * Create a new unmanaged VariableDef. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public VariableDef() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    VariableDef(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 29;
    }

    protected Object storage;// = tyr.tooling.sdk.ast.Storage.Var;

    final public EnumProxy<tyr.tooling.sdk.ast.Storage> getStorage() {
        if (storage instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Storage>) storage;
        throw new IllegalStateException("storage is currently not a proxy: " + storage);
    }
    final public tyr.tooling.sdk.ast.Storage getStorageAsEnum() {
        if (null == storage)
            return (tyr.tooling.sdk.ast.Storage) (storage = tyr.tooling.sdk.ast.Storage.Let);
        if (storage instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Storage>) storage).target;
        return (tyr.tooling.sdk.ast.Storage) storage;
    }

    final public void setStorage(EnumProxy<tyr.tooling.sdk.ast.Storage> storage) {
        this.storage = storage;
    }
    final public void setStorage(tyr.tooling.sdk.ast.Storage storage) {
        if (null != this.storage && this.storage instanceof EnumProxy<?>)
            this.storage = ((EnumProxy<tyr.tooling.sdk.ast.Storage>) this.storage).owner.proxy(storage);
        else
            this.storage = storage;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    protected tyr.tooling.sdk.ast.Expression typ;

    public tyr.tooling.sdk.ast.Expression getTyp() {
        return typ;
    }

    final public void setTyp(tyr.tooling.sdk.ast.Expression typ) {
        this.typ = typ;
    }

    protected tyr.tooling.sdk.ast.Expression init;

    public tyr.tooling.sdk.ast.Expression getInit() {
        return init;
    }

    final public void setInit(tyr.tooling.sdk.ast.Expression init) {
        this.init = init;
    }

}
