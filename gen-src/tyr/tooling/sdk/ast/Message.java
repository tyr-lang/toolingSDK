/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A compiler message that is neither expected nor suppressed.
 */
@SuppressWarnings("all")
public class Message extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged Message. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Message() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Message(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 85;
    }

    protected java.lang.String category;

    /**
     *  category name
     */
    public java.lang.String getCategory() {
        return category;
    }

    /**
     *  category name
     */
    final public void setCategory(java.lang.String category) {
        this.category = category;
    }

    protected Object severity;// = tyr.tooling.sdk.ast.Severity.Info;

    /**
     *  actual severity
     */
    final public EnumProxy<tyr.tooling.sdk.ast.Severity> getSeverity() {
        if (severity instanceof EnumProxy<?>)
            return (EnumProxy<tyr.tooling.sdk.ast.Severity>) severity;
        throw new IllegalStateException("severity is currently not a proxy: " + severity);
    }
    /**
     *  actual severity
     */
    final public tyr.tooling.sdk.ast.Severity getSeverityAsEnum() {
        if (null == severity)
            return (tyr.tooling.sdk.ast.Severity) (severity = tyr.tooling.sdk.ast.Severity.Info);
        if (severity instanceof EnumProxy<?>)
            return ((EnumProxy<tyr.tooling.sdk.ast.Severity>) severity).target;
        return (tyr.tooling.sdk.ast.Severity) severity;
    }

    /**
     *  actual severity
     */
    final public void setSeverity(EnumProxy<tyr.tooling.sdk.ast.Severity> severity) {
        this.severity = severity;
    }
    /**
     *  actual severity
     */
    final public void setSeverity(tyr.tooling.sdk.ast.Severity severity) {
        if (null != this.severity && this.severity instanceof EnumProxy<?>)
            this.severity = ((EnumProxy<tyr.tooling.sdk.ast.Severity>) this.severity).owner.proxy(severity);
        else
            this.severity = severity;
    }

    protected tyr.tooling.sdk.ast.Position pos;

    /**
     *  position of the message
     */
    public tyr.tooling.sdk.ast.Position getPos() {
        return pos;
    }

    /**
     *  position of the message
     */
    final public void setPos(tyr.tooling.sdk.ast.Position pos) {
        this.pos = pos;
    }

    protected java.lang.String text;

    /**
     *  text of the message including notes
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     *  text of the message including notes
     */
    final public void setText(java.lang.String text) {
        this.text = text;
    }

}
