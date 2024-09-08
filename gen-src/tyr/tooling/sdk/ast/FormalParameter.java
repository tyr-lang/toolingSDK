/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  The declaration of a parameter.
 */
@SuppressWarnings("all")
public class FormalParameter extends Node implements NamedMember {

    /**
     * Create a new unmanaged FormalParameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FormalParameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FormalParameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 76;
    }

    protected boolean varArg;

    /**
     *  true for variable argument list parameters
     */
    public boolean getVarArg() {
        return varArg;
    }

    /**
     *  true for variable argument list parameters
     */
    final public void setVarArg(boolean varArg) {
        this.varArg = varArg;
    }

    protected tyr.tooling.sdk.ast.Expression typ;

    /**
     *  The declared type of the parameter.
     */
    public tyr.tooling.sdk.ast.Expression getTyp() {
        return typ;
    }

    /**
     *  The declared type of the parameter.
     */
    final public void setTyp(tyr.tooling.sdk.ast.Expression typ) {
        this.typ = typ;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties;

    /**
     *  Properties of this parameter.
     *  @note  null if none have been provided
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getProperties() {
        return properties;
    }

    /**
     *  Properties of this parameter.
     *  @note  null if none have been provided
     */
    final public void setProperties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
        this.properties = properties;
    }

    protected tyr.tooling.sdk.ast.Expression Zdefault;

    /**
     *  The default value of the parameter used if no value is supplied on call.
     *  @note  null, iff no default is defined.
     */
    public tyr.tooling.sdk.ast.Expression getDefault() {
        return Zdefault;
    }

    /**
     *  The default value of the parameter used if no value is supplied on call.
     *  @note  null, iff no default is defined.
     */
    final public void setDefault(tyr.tooling.sdk.ast.Expression Zdefault) {
        this.Zdefault = Zdefault;
    }

    protected java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    final public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public FormalParameter self() {
        return this;
    }

}
