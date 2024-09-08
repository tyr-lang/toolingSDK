/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A field definition.
 */
@SuppressWarnings("all")
public class Field extends TypeMember implements WithMemberProperties {

    /**
     * Create a new unmanaged Field. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Field() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Field(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 59;
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

    protected Object kind;// = tyr.tooling.sdk.ast.Kind.Typ;

    final public EnumProxy<tyr.tooling.sdk.ast.Kind> getKind() {
        if (kind instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Kind>) kind;
        throw new IllegalStateException("kind is currently not a proxy: " + kind);
    }
    final public tyr.tooling.sdk.ast.Kind getKindAsEnum() {
        if (null == kind)
            return (tyr.tooling.sdk.ast.Kind) (kind = tyr.tooling.sdk.ast.Kind.Cls);
        if (kind instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Kind>) kind).target;
        return (tyr.tooling.sdk.ast.Kind) kind;
    }

    final public void setKind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
        this.kind = kind;
    }
    final public void setKind(tyr.tooling.sdk.ast.Kind kind) {
        if (null != this.kind && this.kind instanceof EnumProxy<?>)
            this.kind = ((EnumProxy<tyr.tooling.sdk.ast.Kind>) this.kind).owner.proxy(kind);
        else
            this.kind = kind;
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

    protected tyr.tooling.sdk.ast.Expression extern;

    public tyr.tooling.sdk.ast.Expression getExtern() {
        return extern;
    }

    final public void setExtern(tyr.tooling.sdk.ast.Expression extern) {
        this.extern = extern;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties;

    /**
     * 
     *  @note  null if none have been defined
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getProperties() {
        return properties;
    }

    /**
     * 
     *  @note  null if none have been defined
     */
    final public void setProperties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
        this.properties = properties;
    }

    @Override
    public Field self() {
        return this;
    }

}
