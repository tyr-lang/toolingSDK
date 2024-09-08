/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Override visibility. Overrides cannot change the visibility of an entity. On conflict, public will be chosen iff one
 *  target is public. On conflict, the largest common visibility will be chosen.
 *  @note  Increasing visibility on conflict is not an issue, as visibility cannot be used for security anyway. Also,
 *  access via the increased visibility is only granted if the precise type is known, i.e. there is no general removal
 *  of visibility of a super type.
 *  @note  It does not make sense to reduce the visibility for an overridden entity as it would not reduce the access to
 *  it.
 */
@SuppressWarnings("all")
public class OverrideVisible extends Visibility {

    /**
     * Create a new unmanaged OverrideVisible. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public OverrideVisible() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    OverrideVisible(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 91;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets;

    /**
     *  targets can be set explicitly and is null otherwise
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> getTargets() {
        return targets;
    }

    /**
     *  targets can be set explicitly and is null otherwise
     */
    final public void setTargets(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets) {
        this.targets = targets;
    }

}
