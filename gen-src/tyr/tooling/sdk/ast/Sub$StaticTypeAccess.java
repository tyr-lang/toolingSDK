/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.Pool;
import ogss.common.java.internal.NamedObj;

@SuppressWarnings("all")
public final class Sub$StaticTypeAccess extends StaticTypeAccess implements NamedObj {
    transient public final Pool<?> τp;

     public Sub$StaticTypeAccess(Pool<?> τp, int ID) {
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