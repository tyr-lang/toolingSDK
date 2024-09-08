/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  A position inside a file.
 *  @author  Timm Felden
 */
@SuppressWarnings("all")
public class Position extends ogss.common.java.internal.Obj {

    /**
     * Create a new unmanaged Position. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public Position() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    Position(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 87;
    }

    protected tyr.tooling.sdk.ast.File file;

    public tyr.tooling.sdk.ast.File getFile() {
        return file;
    }

    final public void setFile(tyr.tooling.sdk.ast.File file) {
        this.file = file;
    }

    protected long beginLine;

    public long getBeginLine() {
        return beginLine;
    }

    final public void setBeginLine(long beginLine) {
        this.beginLine = beginLine;
    }

    protected long beginColumn;

    public long getBeginColumn() {
        return beginColumn;
    }

    final public void setBeginColumn(long beginColumn) {
        this.beginColumn = beginColumn;
    }

    protected long endLine;

    public long getEndLine() {
        return endLine;
    }

    final public void setEndLine(long endLine) {
        this.endLine = endLine;
    }

    protected long endColumn;

    public long getEndColumn() {
        return endColumn;
    }

    final public void setEndColumn(long endColumn) {
        this.endColumn = endColumn;
    }

}
