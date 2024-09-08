/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 * 
 *  @note  literals will not be unified in the AST
 */
@SuppressWarnings("all")
public class IntLiteral extends Literal {

    /**
     * Create a new unmanaged IntLiteral. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public IntLiteral() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    IntLiteral(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 22;
    }

    protected long value;

    /**
     *  the long representation of the value
     */
    public long getValue() {
        return value;
    }

    /**
     *  the long representation of the value
     */
    final public void setValue(long value) {
        this.value = value;
    }

    protected java.lang.String image;

    /**
     *  the representation of the literal as found in the source
     */
    public java.lang.String getImage() {
        return image;
    }

    /**
     *  the representation of the literal as found in the source
     */
    final public void setImage(java.lang.String image) {
        this.image = image;
    }

    protected boolean signed;

    /**
     *  true if IntegerLiteral else UnsignedLiteral
     */
    public boolean getSigned() {
        return signed;
    }

    /**
     *  true if IntegerLiteral else UnsignedLiteral
     */
    final public void setSigned(boolean signed) {
        this.signed = signed;
    }

    protected int size;

    /**
     *  the size of the literal type in bits
     */
    public int getSize() {
        return size;
    }

    /**
     *  the size of the literal type in bits
     */
    final public void setSize(int size) {
        this.size = size;
    }

}
