/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class Block extends Expression {

    /**
     * Create a new unmanaged Block. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Block() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Block(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 20;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> statements;

    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getStatements() {
        return statements;
    }

    final public void setStatements(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> statements) {
        this.statements = statements;
    }

}
