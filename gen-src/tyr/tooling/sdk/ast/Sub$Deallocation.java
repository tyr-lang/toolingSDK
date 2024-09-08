/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.Pool;
import ogss.common.java.internal.NamedObj;

@SuppressWarnings("all")
public final class Sub$Deallocation extends Deallocation implements NamedObj {
    transient public final Pool<?> τp;

     public Sub$Deallocation(Pool<?> τp, int ID) {
        super(ID);
        this.τp = τp;
    }

    @Override
    public int stid() {
        return -1;
    }

    @Override
    public Pool<?> τp() {
        return τp;
    }
}