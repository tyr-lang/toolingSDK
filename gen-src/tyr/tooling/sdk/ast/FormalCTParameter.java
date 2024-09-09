/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A formal CT parameter can be variant and may have a raw value.
 */
@SuppressWarnings("all")
public class FormalCTParameter extends FormalParameter {

    /**
     * Create a new unmanaged FormalCTParameter. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FormalCTParameter() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FormalCTParameter(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 77;
    }

    protected Object variance;// = tyr.tooling.sdk.ast.Variance.Co;

    /**
     *  invariant if not present
     */
    final public EnumProxy<tyr.tooling.sdk.ast.Variance> getVariance() {
        if (variance instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Variance>) variance;
        throw new IllegalStateException("variance is currently not a proxy: " + variance);
    }
    /**
     *  invariant if not present
     */
    final public tyr.tooling.sdk.ast.Variance getVarianceAsEnum() {
        if (null == variance)
            return (tyr.tooling.sdk.ast.Variance) (variance = tyr.tooling.sdk.ast.Variance.Co);
        if (variance instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Variance>) variance).target;
        return (tyr.tooling.sdk.ast.Variance) variance;
    }

    /**
     *  invariant if not present
     */
    final public void setVariance(EnumProxy<tyr.tooling.sdk.ast.Variance> variance) {
        this.variance = variance;
    }
    /**
     *  invariant if not present
     */
    final public void setVariance(tyr.tooling.sdk.ast.Variance variance) {
        if (null != this.variance && this.variance instanceof EnumProxy<?>)
            this.variance = ((EnumProxy<tyr.tooling.sdk.ast.Variance>) this.variance).owner.proxy(variance);
        else
            this.variance = variance;
    }

    protected tyr.tooling.sdk.ast.Expression raw;

    /**
     *  null if not present
     */
    public tyr.tooling.sdk.ast.Expression getRaw() {
        return raw;
    }

    /**
     *  null if not present
     */
    final public void setRaw(tyr.tooling.sdk.ast.Expression raw) {
        this.raw = raw;
    }

}
