/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import ogss.common.java.internal.EnumProxy;


/**
 *  Files can hold imports that are visible for the type definitions in the file only. Although files are types as
 *  scopes, their name is set to null to avoid creation of wrong packages.
 */
@SuppressWarnings("all")
public class FileNode extends Node implements ScopeMember {

    /**
     * Create a new unmanaged FileNode. Allocation of objects without using the
     * access factory method is discouraged.
     */
    public FileNode() {
        super(0);
    }

    /**
     * Used for internal construction only!
     */
    FileNode(int ID) {
        super(ID);
    }

    @Override
    public int stid() {
        return 12;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> defs;

    /**
     *  Namespaces contain scopes only
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> getDefs() {
        return defs;
    }

    /**
     *  Namespaces contain scopes only
     */
    final public void setDefs(java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> defs) {
        this.defs = defs;
    }

    protected java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports;

    /**
     *  Imports visible in this file.
     */
    public java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> getImports() {
        return imports;
    }

    /**
     *  Imports visible in this file.
     */
    final public void setImports(java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports) {
        this.imports = imports;
    }

    @Override
    public FileNode self() {
        return this;
    }

}
