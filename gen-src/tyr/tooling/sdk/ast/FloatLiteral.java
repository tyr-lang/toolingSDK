/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


@SuppressWarnings("all")
public class FloatLiteral extends Literal {

    /**
     * Create a new unmanaged FloatLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FloatLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FloatLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 26;
    }

    protected double value;

    /**
     *  the double representation of the value
     */
    public double getValue() {
        return value;
    }

    /**
     *  the double representation of the value
     */
    final public void setValue(double value) {
        this.value = value;
    }

    protected java.lang.String image;

    public java.lang.String getImage() {
        return image;
    }

    final public void setImage(java.lang.String image) {
        this.image = image;
    }

    protected int size;

    public int getSize() {
        return size;
    }

    final public void setSize(int size) {
        this.size = size;
    }

}
