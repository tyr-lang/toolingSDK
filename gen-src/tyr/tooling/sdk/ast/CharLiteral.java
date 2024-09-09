/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class CharLiteral extends Literal {

    /**
     * Create a new unmanaged CharLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public CharLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    CharLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 24;
    }

    protected long value;

    /**
     *  21bit unicode codepoint
     */
    public long getValue() {
        return value;
    }

    /**
     *  21bit unicode codepoint
     */
    final public void setValue(long value) {
        this.value = value;
    }

}
