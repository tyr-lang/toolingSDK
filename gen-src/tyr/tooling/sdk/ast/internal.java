/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    generated: 08.09.2024                                                                       * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

import ogss.common.java.api.OGSSException;
import ogss.common.java.internal.AnyRefType;
import ogss.common.java.internal.EnumPool;
import ogss.common.java.internal.EnumProxy;
import ogss.common.java.internal.FieldDeclaration;
import ogss.common.java.internal.FieldType;
import ogss.common.java.internal.HullType;
import ogss.common.java.internal.InterfacePool;
import ogss.common.java.internal.Obj;
import ogss.common.java.internal.Pool;
import ogss.common.java.internal.StringPool;
import ogss.common.java.internal.SubPool;
import ogss.common.java.internal.UnrootedInterfacePool;
import ogss.common.java.internal.fieldDeclarations.AutoField;
import ogss.common.java.internal.fieldDeclarations.KnownField;
import ogss.common.java.internal.fieldTypes.*;
import ogss.common.java.restrictions.TypeRestriction;
import ogss.common.jvm.streams.BufferedOutStream;
import ogss.common.jvm.streams.FileInputStream;
import ogss.common.jvm.streams.MappedInStream;


@SuppressWarnings("all")
public final class internal {
    private internal() {}

    public static final class PB extends ogss.common.java.internal.PoolBuilder {
        PB() {
            super(116);
        }

        @Override
        protected String[] literals() {
            return new String[]{"AbstractFunction", "AliasDef", "Allocation", "Args", "BeginColumn", "BeginLine", "BinderApplication", "BlankParameter", "Block", "Blocks", "Body", "BoolLiteral", "BranchingExpression", "BreakContinueTarget", "BreakExpression", "CTApplication", "CTParams", "Cases", "CatchPos", "Category", "CategoryParams", "CharLiteral", "ClassDef", "Cls", "Co", "Constructor", "ConstructorParameter", "Content", "ContinueExpression", "Contra", "CtParams", "Deallocation", "Declarations", "Def", "Default", "Definition", "Defs", "Destructor", "Details", "DoWhileLoop", "Doc", "DocComment", "DocParagraph", "DocTag", "DynamicTypeAccess", "ET", "Eb", "EndColumn", "EndLine", "EnumDef", "EnumInstance", "EnumUnionDef", "Error", "Expression", "ExtEntity", "Extensions", "Extern", "ExternFunction", "Field", "File", "FileNode", "Finally", "FinallyPos", "First", "Flat", "FloatLiteral", "FormalCTParameter", "FormalParameter", "Function", "FunctionAssignment", "FunctionBody", "FunctionRealization", "FunctionType", "FunctionTypeKind", "GlobalDestructor", "GlobalInitializer", "Guard", "GuardName", "IfExpression", "Image", "ImportExpression", "Imports", "In", "Info", "Init", "Initializer", "Initializes", "Instances", "IntLiteral", "InterfaceDef", "IsClass", "IsPrivate", "IsProtected", "Kind", "Labels", "Let", "Literal", "Locals", "MemberAccess", "Members", "Message", "Name", "Namespace", "Node", "NullLiteral", "Obj", "OperatorApplication", "OperatorUsage", "Others", "OverrideVisible", "Package", "PackageRoot", "PackageVisible", "Parameter", "Params", "Parent", "Pos", "Position", "PrettyType", "Private", "Properties", "PropertyDef", "Protected", "PublicVisible", "RTApplication", "RTParams", "Raw", "Realization", "RestrictedVisible", "Result", "ReturnExpression", "ReturnType", "Root", "RtParams", "Second", "Severity", "Signed", "Size", "Source", "Statements", "StaticAccess", "StaticTypeAccess", "Storage", "StringLiteral", "Subspace", "SuperConstructorCall", "SuperDestructorCall", "SwitchCase", "SwitchExpression", "SwitchLike", "Tags", "Target", "Targets", "Tb", "Test", "Text", "ThrowExpression", "TopLevelNode", "TryExpression", "Typ", "TypeDef", "TypeLike", "TypeMember", "TypeWithMembers", "Val", "Value", "ValueParameter", "Var", "VarArg", "VariableDef", "Variance", "Visibility", "Warning", "WhileLoop", "Words"};
        }

        @Override
        protected int kcc(int id) {
            switch (id) {
            case 0: return 0x00000009; // String[]
            case 1: return 0x0000000b; // Node[]
            case 2: return 0xc0070009; // Map<String,Namespace>
            case 3: return 0x0000000f; // Parameter[]
            case 4: return 0x00000013; // Expression[]
            case 5: return 0x0000001d; // VariableDef[]
            case 6: return 0xc0098021; // Map<StaticAccess,Expression>
            case 7: return 0x00000025; // ImportExpression[]
            case 8: return 0x00000038; // SwitchCase[]
            case 9: return 0x00000039; // TypeMember[]
            case 10: return 0x00000041; // EnumInstance[]
            case 11: return 0x00000042; // TopLevelNode[]
            case 12: return 0x0000004c; // FormalParameter[]
            case 13: return 0x0000004d; // FormalCTParameter[]
            case 14: return 0x0000004e; // ConstructorParameter[]
            case 15: return 0x00000054; // DocTag[]
            case 16: return 0x0000005d; // DocParagraph[]
            default: return -1;
            }
        }

        @Override
        protected String name(int id) {
            switch (id) {
            case 0: return "File";
            case 1: return "Node";
            case 2: return "DocTag";
            case 3: return "Message";
            case 4: return "Package";
            case 5: return "Position";
            case 6: return "Visibility";
            case 7: return "DocParagraph";
            default: return null;
            }
        }

        @Override
        protected Pool<?> make(int id, int idx) {
            switch (id) {
            case 0: return new P0(idx);
            case 1: return new P1(idx);
            case 2: return new P2(idx);
            case 3: return new P3(idx);
            case 4: return new P4(idx);
            case 5: return new P5(idx);
            case 6: return new P6(idx);
            case 7: return new P7(idx);
            default: return null;
            }
        }

        @Override
        protected String enumName(int id) {
            switch (id) {
            case 0: return "Kind";
            case 1: return "Storage";
            case 2: return "Severity";
            case 3: return "Variance";
            case 4: return "FunctionTypeKind";
            default: return null;
            }
        }

        @Override
        protected Enum<?>[] enumMake(int id) {
            switch (id) {
            case 0: return tyr.tooling.sdk.ast.Kind.values();
            case 1: return tyr.tooling.sdk.ast.Storage.values();
            case 2: return tyr.tooling.sdk.ast.Severity.values();
            case 3: return tyr.tooling.sdk.ast.Variance.values();
            case 4: return tyr.tooling.sdk.ast.FunctionTypeKind.values();
            default: return null;
            }
        }
    }

/**
 *  Unifies file properties.
 *  @author  Timm Felden
 */
public static final class P0 extends Pool<tyr.tooling.sdk.ast.File> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P0(int idx) {
        super(idx, "File", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Parent";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.File> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f0((FieldType)SIFA[9], nextFID, this);
        case 1: return new f1((FieldType)SIFA[10], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.File(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new File instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.File make() {
        tyr.tooling.sdk.ast.File rval = new tyr.tooling.sdk.ast.File(0);
        add(rval);
        return rval;
    }

    public B0<tyr.tooling.sdk.ast.File, ?> build() {
        return new B0<>(this, new tyr.tooling.sdk.ast.File(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.File> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.File> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$File.class, this);
    }
}
/**
 *  The base class of all AST nodes.
 */
public static final class P1 extends Pool<tyr.tooling.sdk.ast.Node> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P1(int idx) {
        super(idx, "Node", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Pos";
        case 1: return "Parent";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Node> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f2((FieldType)SIFA[87], nextFID, this);
        case 1: return new f3((FieldType)SIFA[11], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Node(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Node instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Node make() {
        tyr.tooling.sdk.ast.Node rval = new tyr.tooling.sdk.ast.Node(0);
        add(rval);
        return rval;
    }

    public B1<tyr.tooling.sdk.ast.Node, ?> build() {
        return new B1<>(this, new tyr.tooling.sdk.ast.Node(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "FileNode";
        case 1: return "ExtEntity";
        case 2: return "Namespace";
        case 3: return "Parameter";
        case 4: return "DocComment";
        case 5: return "Expression";
        case 6: return "SwitchCase";
        case 7: return "TypeMember";
        case 8: return "EnumInstance";
        case 9: return "TopLevelNode";
        case 10: return "FormalParameter";
        case 11: return "FunctionRealization";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Node> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P8(idx, this);
        case 1: return new P9(idx, this);
        case 2: return new P10(idx, this);
        case 3: return new P11(idx, this);
        case 4: return new P12(idx, this);
        case 5: return new P13(idx, this);
        case 6: return new P14(idx, this);
        case 7: return new P15(idx, this);
        case 8: return new P16(idx, this);
        case 9: return new P17(idx, this);
        case 10: return new P18(idx, this);
        case 11: return new P19(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Node> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Node.class, this);
    }
}
/**
 *  Files can hold imports that are visible for the type definitions in the file only. Although files are types as
 *  scopes, their name is set to null to avoid creation of wrong packages.
 */
public static final class P8 extends Pool<tyr.tooling.sdk.ast.FileNode> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P8(int idx, P1 sup) {
        super(idx, "FileNode", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Defs";
        case 1: return "Imports";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FileNode> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f4((FieldType)SIFA[105], nextFID, this);
        case 1: return new f5((FieldType)SIFA[101], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FileNode(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FileNode instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FileNode make() {
        tyr.tooling.sdk.ast.FileNode rval = new tyr.tooling.sdk.ast.FileNode(0);
        add(rval);
        return rval;
    }

    public B8<tyr.tooling.sdk.ast.FileNode, ?> build() {
        return new B8<>(this, new tyr.tooling.sdk.ast.FileNode(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FileNode> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FileNode> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FileNode.class, this);
    }
}
/**
 *  An entity defined in another library for the sake of creating links only.
 *  @note  name for such entities is a canonical name relative to package. Thus, "$package/$name" results in a
 *  reportable entity name.
 */
public static final class P9 extends Pool<tyr.tooling.sdk.ast.ExtEntity> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P9(int idx, P1 sup) {
        super(idx, "ExtEntity", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Package";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ExtEntity> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f6((FieldType)SIFA[9], nextFID, this);
        case 1: return new f7((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ExtEntity(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ExtEntity instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ExtEntity make() {
        tyr.tooling.sdk.ast.ExtEntity rval = new tyr.tooling.sdk.ast.ExtEntity(0);
        add(rval);
        return rval;
    }

    public B9<tyr.tooling.sdk.ast.ExtEntity, ?> build() {
        return new B9<>(this, new tyr.tooling.sdk.ast.ExtEntity(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ExtEntity> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ExtEntity> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ExtEntity.class, this);
    }
}
/**
 *  Namespaces are implicit in Tyr and may be caused by subdirectories or by a definition in the package specification
 *  file.
 */
public static final class P10 extends Pool<tyr.tooling.sdk.ast.Namespace> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P10(int idx, P1 sup) {
        super(idx, "Namespace", sup, 2);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Subspace";
        case 2: return "Declarations";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Namespace> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f8((FieldType)SIFA[9], nextFID, this);
        case 1: return new f9((FieldType)SIFA[96], this);
        case 2: return new f10((FieldType)SIFA[95], this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Namespace(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Namespace instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Namespace make() {
        tyr.tooling.sdk.ast.Namespace rval = new tyr.tooling.sdk.ast.Namespace(0);
        add(rval);
        return rval;
    }

    public B10<tyr.tooling.sdk.ast.Namespace, ?> build() {
        return new B10<>(this, new tyr.tooling.sdk.ast.Namespace(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Namespace> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Namespace> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Namespace.class, this);
    }
}
/**
 *  A parameter in a call. A placement operator can be used to assign the value to a specific formal parameter.
 */
public static final class P11 extends Pool<tyr.tooling.sdk.ast.Parameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P11(int idx, P1 sup) {
        super(idx, "Parameter", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Parameter> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f11((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Parameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Parameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Parameter make() {
        tyr.tooling.sdk.ast.Parameter rval = new tyr.tooling.sdk.ast.Parameter(0);
        add(rval);
        return rval;
    }

    public B11<tyr.tooling.sdk.ast.Parameter, ?> build() {
        return new B11<>(this, new tyr.tooling.sdk.ast.Parameter(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "BlankParameter";
        case 1: return "ValueParameter";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Parameter> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P20(idx, this);
        case 1: return new P21(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Parameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Parameter.class, this);
    }
}
public static final class P20 extends Pool<tyr.tooling.sdk.ast.BlankParameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P20(int idx, P11 sup) {
        super(idx, "BlankParameter", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BlankParameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BlankParameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BlankParameter make() {
        tyr.tooling.sdk.ast.BlankParameter rval = new tyr.tooling.sdk.ast.BlankParameter(0);
        add(rval);
        return rval;
    }

    public B11<tyr.tooling.sdk.ast.BlankParameter, ?> build() {
        return new B11<>(this, new tyr.tooling.sdk.ast.BlankParameter(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BlankParameter> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BlankParameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BlankParameter.class, this);
    }
}
public static final class P21 extends Pool<tyr.tooling.sdk.ast.ValueParameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P21(int idx, P11 sup) {
        super(idx, "ValueParameter", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Value";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ValueParameter> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f12((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ValueParameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ValueParameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ValueParameter make() {
        tyr.tooling.sdk.ast.ValueParameter rval = new tyr.tooling.sdk.ast.ValueParameter(0);
        add(rval);
        return rval;
    }

    public B21<tyr.tooling.sdk.ast.ValueParameter, ?> build() {
        return new B21<>(this, new tyr.tooling.sdk.ast.ValueParameter(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ValueParameter> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ValueParameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ValueParameter.class, this);
    }
}
/**
 *  The base class of all AST nodes.
 *  @note  the parent is the documentable node
 */
public static final class P12 extends Pool<tyr.tooling.sdk.ast.DocComment> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P12(int idx, P1 sup) {
        super(idx, "DocComment", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Tags";
        case 1: return "Details";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.DocComment> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f13((FieldType)SIFA[109], nextFID, this);
        case 1: return new f14((FieldType)SIFA[110], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.DocComment(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new DocComment instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.DocComment make() {
        tyr.tooling.sdk.ast.DocComment rval = new tyr.tooling.sdk.ast.DocComment(0);
        add(rval);
        return rval;
    }

    public B12<tyr.tooling.sdk.ast.DocComment, ?> build() {
        return new B12<>(this, new tyr.tooling.sdk.ast.DocComment(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocComment> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocComment> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$DocComment.class, this);
    }
}
/**
 *  Expressions can be evaluated to yield a value.
 */
public static final class P13 extends Pool<tyr.tooling.sdk.ast.Expression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P13(int idx, P1 sup) {
        super(idx, "Expression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "ET";
        case 1: return "Definition";
        case 2: return "PrettyType";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Expression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f15((FieldType)SIFA[19], nextFID, this);
        case 1: return new f16((FieldType)SIFA[11], nextFID, this);
        case 2: return new f17((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Expression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Expression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Expression make() {
        tyr.tooling.sdk.ast.Expression rval = new tyr.tooling.sdk.ast.Expression(0);
        add(rval);
        return rval;
    }

    public B13<tyr.tooling.sdk.ast.Expression, ?> build() {
        return new B13<>(this, new tyr.tooling.sdk.ast.Expression(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "Block";
        case 1: return "Literal";
        case 2: return "Allocation";
        case 3: return "VariableDef";
        case 4: return "Deallocation";
        case 5: return "FunctionType";
        case 6: return "MemberAccess";
        case 7: return "StaticAccess";
        case 8: return "CTApplication";
        case 9: return "OperatorUsage";
        case 10: return "RTApplication";
        case 11: return "ImportExpression";
        case 12: return "StaticTypeAccess";
        case 13: return "BinderApplication";
        case 14: return "DynamicTypeAccess";
        case 15: return "BranchingExpression";
        case 16: return "OperatorApplication";
        case 17: return "SuperDestructorCall";
        case 18: return "SuperConstructorCall";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Expression> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P22(idx, this);
        case 1: return new P23(idx, this);
        case 2: return new P24(idx, this);
        case 3: return new P25(idx, this);
        case 4: return new P26(idx, this);
        case 5: return new P27(idx, this);
        case 6: return new P28(idx, this);
        case 7: return new P29(idx, this);
        case 8: return new P30(idx, this);
        case 9: return new P31(idx, this);
        case 10: return new P32(idx, this);
        case 11: return new P33(idx, this);
        case 12: return new P34(idx, this);
        case 13: return new P35(idx, this);
        case 14: return new P36(idx, this);
        case 15: return new P37(idx, this);
        case 16: return new P38(idx, this);
        case 17: return new P39(idx, this);
        case 18: return new P40(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Expression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Expression.class, this);
    }
}
public static final class P22 extends Pool<tyr.tooling.sdk.ast.Block> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P22(int idx, P13 sup) {
        super(idx, "Block", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Statements";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Block> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f18((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Block(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Block instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Block make() {
        tyr.tooling.sdk.ast.Block rval = new tyr.tooling.sdk.ast.Block(0);
        add(rval);
        return rval;
    }

    public B22<tyr.tooling.sdk.ast.Block, ?> build() {
        return new B22<>(this, new tyr.tooling.sdk.ast.Block(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Block> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Block> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Block.class, this);
    }
}
public static final class P23 extends Pool<tyr.tooling.sdk.ast.Literal> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P23(int idx, P13 sup) {
        super(idx, "Literal", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Literal(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Literal instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Literal make() {
        tyr.tooling.sdk.ast.Literal rval = new tyr.tooling.sdk.ast.Literal(0);
        add(rval);
        return rval;
    }

    public B13<tyr.tooling.sdk.ast.Literal, ?> build() {
        return new B13<>(this, new tyr.tooling.sdk.ast.Literal(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "IntLiteral";
        case 1: return "BoolLiteral";
        case 2: return "CharLiteral";
        case 3: return "NullLiteral";
        case 4: return "FloatLiteral";
        case 5: return "StringLiteral";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Literal> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P41(idx, this);
        case 1: return new P42(idx, this);
        case 2: return new P43(idx, this);
        case 3: return new P44(idx, this);
        case 4: return new P45(idx, this);
        case 5: return new P46(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Literal> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Literal.class, this);
    }
}
/**
 * 
 *  @note  literals will not be unified in the AST
 */
public static final class P41 extends Pool<tyr.tooling.sdk.ast.IntLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P41(int idx, P23 sup) {
        super(idx, "IntLiteral", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Size";
        case 1: return "Image";
        case 2: return "Value";
        case 3: return "Signed";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.IntLiteral> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f19((FieldType)SIFA[3], nextFID, this);
        case 1: return new f20((FieldType)SIFA[9], nextFID, this);
        case 2: return new f21((FieldType)SIFA[4], nextFID, this);
        case 3: return new f22((FieldType)SIFA[0], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.IntLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new IntLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.IntLiteral make() {
        tyr.tooling.sdk.ast.IntLiteral rval = new tyr.tooling.sdk.ast.IntLiteral(0);
        add(rval);
        return rval;
    }

    public B41<tyr.tooling.sdk.ast.IntLiteral, ?> build() {
        return new B41<>(this, new tyr.tooling.sdk.ast.IntLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.IntLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.IntLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$IntLiteral.class, this);
    }
}
public static final class P42 extends Pool<tyr.tooling.sdk.ast.BoolLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P42(int idx, P23 sup) {
        super(idx, "BoolLiteral", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Value";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.BoolLiteral> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f23((FieldType)SIFA[0], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BoolLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BoolLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BoolLiteral make() {
        tyr.tooling.sdk.ast.BoolLiteral rval = new tyr.tooling.sdk.ast.BoolLiteral(0);
        add(rval);
        return rval;
    }

    public B42<tyr.tooling.sdk.ast.BoolLiteral, ?> build() {
        return new B42<>(this, new tyr.tooling.sdk.ast.BoolLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BoolLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BoolLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BoolLiteral.class, this);
    }
}
public static final class P43 extends Pool<tyr.tooling.sdk.ast.CharLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P43(int idx, P23 sup) {
        super(idx, "CharLiteral", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Value";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.CharLiteral> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f24((FieldType)SIFA[5], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.CharLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new CharLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.CharLiteral make() {
        tyr.tooling.sdk.ast.CharLiteral rval = new tyr.tooling.sdk.ast.CharLiteral(0);
        add(rval);
        return rval;
    }

    public B43<tyr.tooling.sdk.ast.CharLiteral, ?> build() {
        return new B43<>(this, new tyr.tooling.sdk.ast.CharLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.CharLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.CharLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$CharLiteral.class, this);
    }
}
public static final class P44 extends Pool<tyr.tooling.sdk.ast.NullLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P44(int idx, P23 sup) {
        super(idx, "NullLiteral", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.NullLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new NullLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.NullLiteral make() {
        tyr.tooling.sdk.ast.NullLiteral rval = new tyr.tooling.sdk.ast.NullLiteral(0);
        add(rval);
        return rval;
    }

    public B13<tyr.tooling.sdk.ast.NullLiteral, ?> build() {
        return new B13<>(this, new tyr.tooling.sdk.ast.NullLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.NullLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.NullLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$NullLiteral.class, this);
    }
}
public static final class P45 extends Pool<tyr.tooling.sdk.ast.FloatLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P45(int idx, P23 sup) {
        super(idx, "FloatLiteral", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Size";
        case 1: return "Image";
        case 2: return "Value";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FloatLiteral> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f25((FieldType)SIFA[3], nextFID, this);
        case 1: return new f26((FieldType)SIFA[9], nextFID, this);
        case 2: return new f27((FieldType)SIFA[7], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FloatLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FloatLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FloatLiteral make() {
        tyr.tooling.sdk.ast.FloatLiteral rval = new tyr.tooling.sdk.ast.FloatLiteral(0);
        add(rval);
        return rval;
    }

    public B45<tyr.tooling.sdk.ast.FloatLiteral, ?> build() {
        return new B45<>(this, new tyr.tooling.sdk.ast.FloatLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FloatLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FloatLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FloatLiteral.class, this);
    }
}
public static final class P46 extends Pool<tyr.tooling.sdk.ast.StringLiteral> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P46(int idx, P23 sup) {
        super(idx, "StringLiteral", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Value";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.StringLiteral> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f28((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.StringLiteral(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new StringLiteral instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.StringLiteral make() {
        tyr.tooling.sdk.ast.StringLiteral rval = new tyr.tooling.sdk.ast.StringLiteral(0);
        add(rval);
        return rval;
    }

    public B46<tyr.tooling.sdk.ast.StringLiteral, ?> build() {
        return new B46<>(this, new tyr.tooling.sdk.ast.StringLiteral(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StringLiteral> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StringLiteral> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$StringLiteral.class, this);
    }
}
/**
 * 
 *  @note  There is no way to identify parameters of an instantiation with a parser. However, the AST build can perform
 *  a context-sensitive look into target to extract up to two CT arguments and a runtime argument. The first application
 *  is taken and subsequent applications are only taken if they can be fit into this object.
 */
public static final class P24 extends Pool<tyr.tooling.sdk.ast.Allocation> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P24(int idx, P13 sup) {
        super(idx, "Allocation", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Args";
        case 1: return "First";
        case 2: return "Second";
        case 3: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Allocation> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f29((FieldType)SIFA[97], nextFID, this);
        case 1: return new f30((FieldType)SIFA[97], nextFID, this);
        case 2: return new f31((FieldType)SIFA[97], nextFID, this);
        case 3: return new f32((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Allocation(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Allocation instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Allocation make() {
        tyr.tooling.sdk.ast.Allocation rval = new tyr.tooling.sdk.ast.Allocation(0);
        add(rval);
        return rval;
    }

    public B24<tyr.tooling.sdk.ast.Allocation, ?> build() {
        return new B24<>(this, new tyr.tooling.sdk.ast.Allocation(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Allocation> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Allocation> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Allocation.class, this);
    }
}
/**
 *  definition of a variable in a block
 */
public static final class P25 extends Pool<tyr.tooling.sdk.ast.VariableDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P25(int idx, P13 sup) {
        super(idx, "VariableDef", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Typ";
        case 1: return "Init";
        case 2: return "Name";
        case 3: return "Storage";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.VariableDef> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f33((FieldType)SIFA[19], nextFID, this);
        case 1: return new f34((FieldType)SIFA[19], nextFID, this);
        case 2: return new f35((FieldType)SIFA[9], nextFID, this);
        case 3: return new f36((FieldType)SIFA[112], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.VariableDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new VariableDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.VariableDef make() {
        tyr.tooling.sdk.ast.VariableDef rval = new tyr.tooling.sdk.ast.VariableDef(0);
        add(rval);
        return rval;
    }

    public B25<tyr.tooling.sdk.ast.VariableDef, ?> build() {
        return new B25<>(this, new tyr.tooling.sdk.ast.VariableDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.VariableDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.VariableDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$VariableDef.class, this);
    }
}
/**
 *  delete target
 */
public static final class P26 extends Pool<tyr.tooling.sdk.ast.Deallocation> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P26(int idx, P13 sup) {
        super(idx, "Deallocation", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Deallocation> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f37((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Deallocation(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Deallocation instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Deallocation make() {
        tyr.tooling.sdk.ast.Deallocation rval = new tyr.tooling.sdk.ast.Deallocation(0);
        add(rval);
        return rval;
    }

    public B26<tyr.tooling.sdk.ast.Deallocation, ?> build() {
        return new B26<>(this, new tyr.tooling.sdk.ast.Deallocation(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Deallocation> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Deallocation> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Deallocation.class, this);
    }
}
/**
 *  A literal function type
 *  @note  either ctParams or rtParams is not null
 *  @note  name can be null for parameters from both parameter lists
 *  @note  value is interpreted as type for parameters from both parameter lists
 */
public static final class P27 extends Pool<tyr.tooling.sdk.ast.FunctionType> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P27(int idx, P13 sup) {
        super(idx, "FunctionType", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Kind";
        case 1: return "Result";
        case 2: return "CtParams";
        case 3: return "RtParams";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FunctionType> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f38((FieldType)SIFA[115], nextFID, this);
        case 1: return new f39((FieldType)SIFA[19], nextFID, this);
        case 2: return new f40((FieldType)SIFA[97], nextFID, this);
        case 3: return new f41((FieldType)SIFA[97], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FunctionType(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FunctionType instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FunctionType make() {
        tyr.tooling.sdk.ast.FunctionType rval = new tyr.tooling.sdk.ast.FunctionType(0);
        add(rval);
        return rval;
    }

    public B27<tyr.tooling.sdk.ast.FunctionType, ?> build() {
        return new B27<>(this, new tyr.tooling.sdk.ast.FunctionType(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionType> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionType> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FunctionType.class, this);
    }
}
public static final class P28 extends Pool<tyr.tooling.sdk.ast.MemberAccess> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P28(int idx, P13 sup) {
        super(idx, "MemberAccess", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.MemberAccess> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f42((FieldType)SIFA[9], nextFID, this);
        case 1: return new f43((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.MemberAccess(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new MemberAccess instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.MemberAccess make() {
        tyr.tooling.sdk.ast.MemberAccess rval = new tyr.tooling.sdk.ast.MemberAccess(0);
        add(rval);
        return rval;
    }

    public B28<tyr.tooling.sdk.ast.MemberAccess, ?> build() {
        return new B28<>(this, new tyr.tooling.sdk.ast.MemberAccess(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.MemberAccess> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.MemberAccess> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$MemberAccess.class, this);
    }
}
public static final class P29 extends Pool<tyr.tooling.sdk.ast.StaticAccess> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P29(int idx, P13 sup) {
        super(idx, "StaticAccess", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.StaticAccess> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f44((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.StaticAccess(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new StaticAccess instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.StaticAccess make() {
        tyr.tooling.sdk.ast.StaticAccess rval = new tyr.tooling.sdk.ast.StaticAccess(0);
        add(rval);
        return rval;
    }

    public B29<tyr.tooling.sdk.ast.StaticAccess, ?> build() {
        return new B29<>(this, new tyr.tooling.sdk.ast.StaticAccess(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StaticAccess> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StaticAccess> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$StaticAccess.class, this);
    }
}
public static final class P30 extends Pool<tyr.tooling.sdk.ast.CTApplication> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P30(int idx, P13 sup) {
        super(idx, "CTApplication", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Params";
        case 1: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.CTApplication> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f45((FieldType)SIFA[97], nextFID, this);
        case 1: return new f46((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.CTApplication(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new CTApplication instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.CTApplication make() {
        tyr.tooling.sdk.ast.CTApplication rval = new tyr.tooling.sdk.ast.CTApplication(0);
        add(rval);
        return rval;
    }

    public B30<tyr.tooling.sdk.ast.CTApplication, ?> build() {
        return new B30<>(this, new tyr.tooling.sdk.ast.CTApplication(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.CTApplication> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.CTApplication> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$CTApplication.class, this);
    }
}
/**
 *  usage of an operator in an operator application
 */
public static final class P31 extends Pool<tyr.tooling.sdk.ast.OperatorUsage> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P31(int idx, P13 sup) {
        super(idx, "OperatorUsage", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.OperatorUsage> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f47((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.OperatorUsage(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new OperatorUsage instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.OperatorUsage make() {
        tyr.tooling.sdk.ast.OperatorUsage rval = new tyr.tooling.sdk.ast.OperatorUsage(0);
        add(rval);
        return rval;
    }

    public B31<tyr.tooling.sdk.ast.OperatorUsage, ?> build() {
        return new B31<>(this, new tyr.tooling.sdk.ast.OperatorUsage(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OperatorUsage> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OperatorUsage> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$OperatorUsage.class, this);
    }
}
public static final class P32 extends Pool<tyr.tooling.sdk.ast.RTApplication> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P32(int idx, P13 sup) {
        super(idx, "RTApplication", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Params";
        case 1: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.RTApplication> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f48((FieldType)SIFA[97], nextFID, this);
        case 1: return new f49((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.RTApplication(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new RTApplication instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.RTApplication make() {
        tyr.tooling.sdk.ast.RTApplication rval = new tyr.tooling.sdk.ast.RTApplication(0);
        add(rval);
        return rval;
    }

    public B32<tyr.tooling.sdk.ast.RTApplication, ?> build() {
        return new B32<>(this, new tyr.tooling.sdk.ast.RTApplication(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.RTApplication> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.RTApplication> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$RTApplication.class, this);
    }
}
/**
 *  Import a path into the current scope.
 */
public static final class P33 extends Pool<tyr.tooling.sdk.ast.ImportExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P33(int idx, P13 sup) {
        super(idx, "ImportExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ImportExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f50((FieldType)SIFA[9], nextFID, this);
        case 1: return new f51((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ImportExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ImportExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ImportExpression make() {
        tyr.tooling.sdk.ast.ImportExpression rval = new tyr.tooling.sdk.ast.ImportExpression(0);
        add(rval);
        return rval;
    }

    public B33<tyr.tooling.sdk.ast.ImportExpression, ?> build() {
        return new B33<>(this, new tyr.tooling.sdk.ast.ImportExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ImportExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ImportExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ImportExpression.class, this);
    }
}
public static final class P34 extends Pool<tyr.tooling.sdk.ast.StaticTypeAccess> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P34(int idx, P13 sup) {
        super(idx, "StaticTypeAccess", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.StaticTypeAccess> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f52((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.StaticTypeAccess(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new StaticTypeAccess instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.StaticTypeAccess make() {
        tyr.tooling.sdk.ast.StaticTypeAccess rval = new tyr.tooling.sdk.ast.StaticTypeAccess(0);
        add(rval);
        return rval;
    }

    public B34<tyr.tooling.sdk.ast.StaticTypeAccess, ?> build() {
        return new B34<>(this, new tyr.tooling.sdk.ast.StaticTypeAccess(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StaticTypeAccess> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.StaticTypeAccess> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$StaticTypeAccess.class, this);
    }
}
public static final class P35 extends Pool<tyr.tooling.sdk.ast.BinderApplication> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P35(int idx, P13 sup) {
        super(idx, "BinderApplication", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Blocks";
        case 1: return "Locals";
        case 2: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.BinderApplication> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f53((FieldType)SIFA[98], nextFID, this);
        case 1: return new f54((FieldType)SIFA[99], nextFID, this);
        case 2: return new f55((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BinderApplication(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BinderApplication instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BinderApplication make() {
        tyr.tooling.sdk.ast.BinderApplication rval = new tyr.tooling.sdk.ast.BinderApplication(0);
        add(rval);
        return rval;
    }

    public B35<tyr.tooling.sdk.ast.BinderApplication, ?> build() {
        return new B35<>(this, new tyr.tooling.sdk.ast.BinderApplication(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BinderApplication> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BinderApplication> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BinderApplication.class, this);
    }
}
public static final class P36 extends Pool<tyr.tooling.sdk.ast.DynamicTypeAccess> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P36(int idx, P13 sup) {
        super(idx, "DynamicTypeAccess", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.DynamicTypeAccess> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f56((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.DynamicTypeAccess(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new DynamicTypeAccess instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.DynamicTypeAccess make() {
        tyr.tooling.sdk.ast.DynamicTypeAccess rval = new tyr.tooling.sdk.ast.DynamicTypeAccess(0);
        add(rval);
        return rval;
    }

    public B36<tyr.tooling.sdk.ast.DynamicTypeAccess, ?> build() {
        return new B36<>(this, new tyr.tooling.sdk.ast.DynamicTypeAccess(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DynamicTypeAccess> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DynamicTypeAccess> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$DynamicTypeAccess.class, this);
    }
}
public static final class P37 extends Pool<tyr.tooling.sdk.ast.BranchingExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P37(int idx, P13 sup) {
        super(idx, "BranchingExpression", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BranchingExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BranchingExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BranchingExpression make() {
        tyr.tooling.sdk.ast.BranchingExpression rval = new tyr.tooling.sdk.ast.BranchingExpression(0);
        add(rval);
        return rval;
    }

    public B13<tyr.tooling.sdk.ast.BranchingExpression, ?> build() {
        return new B13<>(this, new tyr.tooling.sdk.ast.BranchingExpression(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "SwitchLike";
        case 1: return "IfExpression";
        case 2: return "BreakExpression";
        case 3: return "ThrowExpression";
        case 4: return "ReturnExpression";
        case 5: return "ContinueExpression";
        case 6: return "BreakContinueTarget";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BranchingExpression> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P47(idx, this);
        case 1: return new P48(idx, this);
        case 2: return new P49(idx, this);
        case 3: return new P50(idx, this);
        case 4: return new P51(idx, this);
        case 5: return new P52(idx, this);
        case 6: return new P53(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BranchingExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BranchingExpression.class, this);
    }
}
/**
 *  The parent class of everything that can hold a switch case.
 */
public static final class P47 extends Pool<tyr.tooling.sdk.ast.SwitchLike> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P47(int idx, P37 sup) {
        super(idx, "SwitchLike", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "GuardName";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.SwitchLike> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f57((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.SwitchLike(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new SwitchLike instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.SwitchLike make() {
        tyr.tooling.sdk.ast.SwitchLike rval = new tyr.tooling.sdk.ast.SwitchLike(0);
        add(rval);
        return rval;
    }

    public B47<tyr.tooling.sdk.ast.SwitchLike, ?> build() {
        return new B47<>(this, new tyr.tooling.sdk.ast.SwitchLike(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "TryExpression";
        case 1: return "SwitchExpression";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchLike> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P54(idx, this);
        case 1: return new P55(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchLike> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$SwitchLike.class, this);
    }
}
/**
 *  A try-catch block as known from most other languages. In contrast to other languages, the declaration order of
 *  handlers is irrelevant.
 */
public static final class P54 extends Pool<tyr.tooling.sdk.ast.TryExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P54(int idx, P47 sup) {
        super(idx, "TryExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "Cases";
        case 2: return "Others";
        case 3: return "Finally";
        case 4: return "CatchPos";
        case 5: return "FinallyPos";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.TryExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f58((FieldType)SIFA[19], nextFID, this);
        case 1: return new f59((FieldType)SIFA[102], nextFID, this);
        case 2: return new f60((FieldType)SIFA[19], nextFID, this);
        case 3: return new f61((FieldType)SIFA[19], nextFID, this);
        case 4: return new f62((FieldType)SIFA[87], nextFID, this);
        case 5: return new f63((FieldType)SIFA[87], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TryExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TryExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TryExpression make() {
        tyr.tooling.sdk.ast.TryExpression rval = new tyr.tooling.sdk.ast.TryExpression(0);
        add(rval);
        return rval;
    }

    public B54<tyr.tooling.sdk.ast.TryExpression, ?> build() {
        return new B54<>(this, new tyr.tooling.sdk.ast.TryExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TryExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TryExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TryExpression.class, this);
    }
}
/**
 *  Represents all forms of switch expressions
 */
public static final class P55 extends Pool<tyr.tooling.sdk.ast.SwitchExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P55(int idx, P47 sup) {
        super(idx, "SwitchExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Kind";
        case 1: return "Cases";
        case 2: return "Guard";
        case 3: return "Others";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.SwitchExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f64((FieldType)SIFA[111], nextFID, this);
        case 1: return new f65((FieldType)SIFA[102], nextFID, this);
        case 2: return new f66((FieldType)SIFA[19], nextFID, this);
        case 3: return new f67((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.SwitchExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new SwitchExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.SwitchExpression make() {
        tyr.tooling.sdk.ast.SwitchExpression rval = new tyr.tooling.sdk.ast.SwitchExpression(0);
        add(rval);
        return rval;
    }

    public B55<tyr.tooling.sdk.ast.SwitchExpression, ?> build() {
        return new B55<>(this, new tyr.tooling.sdk.ast.SwitchExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$SwitchExpression.class, this);
    }
}
public static final class P48 extends Pool<tyr.tooling.sdk.ast.IfExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P48(int idx, P37 sup) {
        super(idx, "IfExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Eb";
        case 1: return "Tb";
        case 2: return "Guard";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.IfExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f68((FieldType)SIFA[19], nextFID, this);
        case 1: return new f69((FieldType)SIFA[19], nextFID, this);
        case 2: return new f70((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.IfExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new IfExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.IfExpression make() {
        tyr.tooling.sdk.ast.IfExpression rval = new tyr.tooling.sdk.ast.IfExpression(0);
        add(rval);
        return rval;
    }

    public B48<tyr.tooling.sdk.ast.IfExpression, ?> build() {
        return new B48<>(this, new tyr.tooling.sdk.ast.IfExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.IfExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.IfExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$IfExpression.class, this);
    }
}
public static final class P49 extends Pool<tyr.tooling.sdk.ast.BreakExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P49(int idx, P37 sup) {
        super(idx, "BreakExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Result";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.BreakExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f71((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BreakExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BreakExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BreakExpression make() {
        tyr.tooling.sdk.ast.BreakExpression rval = new tyr.tooling.sdk.ast.BreakExpression(0);
        add(rval);
        return rval;
    }

    public B49<tyr.tooling.sdk.ast.BreakExpression, ?> build() {
        return new B49<>(this, new tyr.tooling.sdk.ast.BreakExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BreakExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BreakExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BreakExpression.class, this);
    }
}
public static final class P50 extends Pool<tyr.tooling.sdk.ast.ThrowExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P50(int idx, P37 sup) {
        super(idx, "ThrowExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ThrowExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f72((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ThrowExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ThrowExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ThrowExpression make() {
        tyr.tooling.sdk.ast.ThrowExpression rval = new tyr.tooling.sdk.ast.ThrowExpression(0);
        add(rval);
        return rval;
    }

    public B50<tyr.tooling.sdk.ast.ThrowExpression, ?> build() {
        return new B50<>(this, new tyr.tooling.sdk.ast.ThrowExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ThrowExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ThrowExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ThrowExpression.class, this);
    }
}
public static final class P51 extends Pool<tyr.tooling.sdk.ast.ReturnExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P51(int idx, P37 sup) {
        super(idx, "ReturnExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Result";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ReturnExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f73((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ReturnExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ReturnExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ReturnExpression make() {
        tyr.tooling.sdk.ast.ReturnExpression rval = new tyr.tooling.sdk.ast.ReturnExpression(0);
        add(rval);
        return rval;
    }

    public B51<tyr.tooling.sdk.ast.ReturnExpression, ?> build() {
        return new B51<>(this, new tyr.tooling.sdk.ast.ReturnExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ReturnExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ReturnExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ReturnExpression.class, this);
    }
}
public static final class P52 extends Pool<tyr.tooling.sdk.ast.ContinueExpression> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P52(int idx, P37 sup) {
        super(idx, "ContinueExpression", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Result";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ContinueExpression> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f74((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ContinueExpression(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ContinueExpression instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ContinueExpression make() {
        tyr.tooling.sdk.ast.ContinueExpression rval = new tyr.tooling.sdk.ast.ContinueExpression(0);
        add(rval);
        return rval;
    }

    public B52<tyr.tooling.sdk.ast.ContinueExpression, ?> build() {
        return new B52<>(this, new tyr.tooling.sdk.ast.ContinueExpression(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ContinueExpression> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ContinueExpression> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ContinueExpression.class, this);
    }
}
/**
 *  Within the bodies of these entities, using a break or continue is allowed.
 */
public static final class P53 extends Pool<tyr.tooling.sdk.ast.BreakContinueTarget> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P53(int idx, P37 sup) {
        super(idx, "BreakContinueTarget", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.BreakContinueTarget> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f75((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.BreakContinueTarget(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new BreakContinueTarget instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.BreakContinueTarget make() {
        tyr.tooling.sdk.ast.BreakContinueTarget rval = new tyr.tooling.sdk.ast.BreakContinueTarget(0);
        add(rval);
        return rval;
    }

    public B53<tyr.tooling.sdk.ast.BreakContinueTarget, ?> build() {
        return new B53<>(this, new tyr.tooling.sdk.ast.BreakContinueTarget(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "WhileLoop";
        case 1: return "DoWhileLoop";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BreakContinueTarget> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P56(idx, this);
        case 1: return new P57(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.BreakContinueTarget> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$BreakContinueTarget.class, this);
    }
}
public static final class P56 extends Pool<tyr.tooling.sdk.ast.WhileLoop> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P56(int idx, P53 sup) {
        super(idx, "WhileLoop", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Guard";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.WhileLoop> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f76((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.WhileLoop(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new WhileLoop instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.WhileLoop make() {
        tyr.tooling.sdk.ast.WhileLoop rval = new tyr.tooling.sdk.ast.WhileLoop(0);
        add(rval);
        return rval;
    }

    public B56<tyr.tooling.sdk.ast.WhileLoop, ?> build() {
        return new B56<>(this, new tyr.tooling.sdk.ast.WhileLoop(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.WhileLoop> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.WhileLoop> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$WhileLoop.class, this);
    }
}
public static final class P57 extends Pool<tyr.tooling.sdk.ast.DoWhileLoop> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P57(int idx, P53 sup) {
        super(idx, "DoWhileLoop", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Guard";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.DoWhileLoop> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f77((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.DoWhileLoop(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new DoWhileLoop instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.DoWhileLoop make() {
        tyr.tooling.sdk.ast.DoWhileLoop rval = new tyr.tooling.sdk.ast.DoWhileLoop(0);
        add(rval);
        return rval;
    }

    public B57<tyr.tooling.sdk.ast.DoWhileLoop, ?> build() {
        return new B57<>(this, new tyr.tooling.sdk.ast.DoWhileLoop(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DoWhileLoop> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DoWhileLoop> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$DoWhileLoop.class, this);
    }
}
public static final class P38 extends Pool<tyr.tooling.sdk.ast.OperatorApplication> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P38(int idx, P13 sup) {
        super(idx, "OperatorApplication", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Targets";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.OperatorApplication> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f78((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.OperatorApplication(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new OperatorApplication instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.OperatorApplication make() {
        tyr.tooling.sdk.ast.OperatorApplication rval = new tyr.tooling.sdk.ast.OperatorApplication(0);
        add(rval);
        return rval;
    }

    public B38<tyr.tooling.sdk.ast.OperatorApplication, ?> build() {
        return new B38<>(this, new tyr.tooling.sdk.ast.OperatorApplication(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OperatorApplication> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OperatorApplication> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$OperatorApplication.class, this);
    }
}
/**
 *  An explicit super destructor call.
 *  @note  Heimdahl will rewrite the parse tree and insert empty ctArgs and rtArgs if required.
 *  @note  Bifröst will check that this happens within a destructor and targets a direct super type.
 */
public static final class P39 extends Pool<tyr.tooling.sdk.ast.SuperDestructorCall> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P39(int idx, P13 sup) {
        super(idx, "SuperDestructorCall", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.SuperDestructorCall> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f79((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.SuperDestructorCall(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new SuperDestructorCall instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.SuperDestructorCall make() {
        tyr.tooling.sdk.ast.SuperDestructorCall rval = new tyr.tooling.sdk.ast.SuperDestructorCall(0);
        add(rval);
        return rval;
    }

    public B39<tyr.tooling.sdk.ast.SuperDestructorCall, ?> build() {
        return new B39<>(this, new tyr.tooling.sdk.ast.SuperDestructorCall(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SuperDestructorCall> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SuperDestructorCall> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$SuperDestructorCall.class, this);
    }
}
/**
 *  An explicit super constructor call.
 *  @note  Heimdahl will rewrite the parse tree and insert empty ctArgs and rtArgs if required.
 *  @note  Bifröst will check that this happens within a constructor and targets a direct super type.
 */
public static final class P40 extends Pool<tyr.tooling.sdk.ast.SuperConstructorCall> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P40(int idx, P13 sup) {
        super(idx, "SuperConstructorCall", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Args";
        case 1: return "First";
        case 2: return "Second";
        case 3: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.SuperConstructorCall> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f80((FieldType)SIFA[97], nextFID, this);
        case 1: return new f81((FieldType)SIFA[97], nextFID, this);
        case 2: return new f82((FieldType)SIFA[97], nextFID, this);
        case 3: return new f83((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.SuperConstructorCall(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new SuperConstructorCall instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.SuperConstructorCall make() {
        tyr.tooling.sdk.ast.SuperConstructorCall rval = new tyr.tooling.sdk.ast.SuperConstructorCall(0);
        add(rval);
        return rval;
    }

    public B40<tyr.tooling.sdk.ast.SuperConstructorCall, ?> build() {
        return new B40<>(this, new tyr.tooling.sdk.ast.SuperConstructorCall(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SuperConstructorCall> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SuperConstructorCall> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$SuperConstructorCall.class, this);
    }
}
/**
 *  An if case of a switch expression
 *  @note  this is simply a node within the SwitchExpression as it is required as node during IR generation but will not
 *  result itself in any IR entity
 */
public static final class P14 extends Pool<tyr.tooling.sdk.ast.SwitchCase> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P14(int idx, P1 sup) {
        super(idx, "SwitchCase", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "Labels";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.SwitchCase> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f84((FieldType)SIFA[19], nextFID, this);
        case 1: return new f85((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.SwitchCase(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new SwitchCase instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.SwitchCase make() {
        tyr.tooling.sdk.ast.SwitchCase rval = new tyr.tooling.sdk.ast.SwitchCase(0);
        add(rval);
        return rval;
    }

    public B14<tyr.tooling.sdk.ast.SwitchCase, ?> build() {
        return new B14<>(this, new tyr.tooling.sdk.ast.SwitchCase(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchCase> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.SwitchCase> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$SwitchCase.class, this);
    }
}
public static final class P15 extends Pool<tyr.tooling.sdk.ast.TypeMember> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P15(int idx, P1 sup) {
        super(idx, "TypeMember", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Doc";
        case 1: return "Name";
        case 2: return "Visibility";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.TypeMember> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f86((FieldType)SIFA[18], nextFID, this);
        case 1: return new f87((FieldType)SIFA[9], nextFID, this);
        case 2: return new f88((FieldType)SIFA[88], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TypeMember(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TypeMember instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TypeMember make() {
        tyr.tooling.sdk.ast.TypeMember rval = new tyr.tooling.sdk.ast.TypeMember(0);
        add(rval);
        return rval;
    }

    public B15<tyr.tooling.sdk.ast.TypeMember, ?> build() {
        return new B15<>(this, new tyr.tooling.sdk.ast.TypeMember(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "Test";
        case 1: return "Field";
        case 2: return "Function";
        case 3: return "Destructor";
        case 4: return "Constructor";
        case 5: return "GlobalDestructor";
        case 6: return "GlobalInitializer";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeMember> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P58(idx, this);
        case 1: return new P59(idx, this);
        case 2: return new P60(idx, this);
        case 3: return new P61(idx, this);
        case 4: return new P62(idx, this);
        case 5: return new P63(idx, this);
        case 6: return new P64(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeMember> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TypeMember.class, this);
    }
}
/**
 *  A test definition.
 *  @note  tests must always have default visibility
 */
public static final class P58 extends Pool<tyr.tooling.sdk.ast.Test> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P58(int idx, P15 sup) {
        super(idx, "Test", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "Category";
        case 2: return "CategoryParams";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Test> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f89((FieldType)SIFA[20], nextFID, this);
        case 1: return new f90((FieldType)SIFA[9], nextFID, this);
        case 2: return new f91((FieldType)SIFA[94], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Test(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Test instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Test make() {
        tyr.tooling.sdk.ast.Test rval = new tyr.tooling.sdk.ast.Test(0);
        add(rval);
        return rval;
    }

    public B58<tyr.tooling.sdk.ast.Test, ?> build() {
        return new B58<>(this, new tyr.tooling.sdk.ast.Test(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Test> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Test> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Test.class, this);
    }
}
/**
 *  A field definition.
 */
public static final class P59 extends Pool<tyr.tooling.sdk.ast.Field> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P59(int idx, P15 sup) {
        super(idx, "Field", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Typ";
        case 1: return "Init";
        case 2: return "Kind";
        case 3: return "Extern";
        case 4: return "Storage";
        case 5: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Field> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f92((FieldType)SIFA[19], nextFID, this);
        case 1: return new f93((FieldType)SIFA[19], nextFID, this);
        case 2: return new f94((FieldType)SIFA[111], nextFID, this);
        case 3: return new f95((FieldType)SIFA[19], nextFID, this);
        case 4: return new f96((FieldType)SIFA[112], nextFID, this);
        case 5: return new f97((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Field(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Field instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Field make() {
        tyr.tooling.sdk.ast.Field rval = new tyr.tooling.sdk.ast.Field(0);
        add(rval);
        return rval;
    }

    public B59<tyr.tooling.sdk.ast.Field, ?> build() {
        return new B59<>(this, new tyr.tooling.sdk.ast.Field(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Field> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Field> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Field.class, this);
    }
}
/**
 *  A function definition.
 */
public static final class P60 extends Pool<tyr.tooling.sdk.ast.Function> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P60(int idx, P15 sup) {
        super(idx, "Function", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Kind";
        case 1: return "CTParams";
        case 2: return "RTParams";
        case 3: return "Properties";
        case 4: return "ReturnType";
        case 5: return "Realization";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Function> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f98((FieldType)SIFA[111], nextFID, this);
        case 1: return new f99((FieldType)SIFA[107], nextFID, this);
        case 2: return new f100((FieldType)SIFA[106], nextFID, this);
        case 3: return new f101((FieldType)SIFA[98], nextFID, this);
        case 4: return new f102((FieldType)SIFA[19], nextFID, this);
        case 5: return new f103((FieldType)SIFA[79], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Function(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Function instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Function make() {
        tyr.tooling.sdk.ast.Function rval = new tyr.tooling.sdk.ast.Function(0);
        add(rval);
        return rval;
    }

    public B60<tyr.tooling.sdk.ast.Function, ?> build() {
        return new B60<>(this, new tyr.tooling.sdk.ast.Function(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Function> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Function> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Function.class, this);
    }
}
/**
 *  The destructor of a type.
 *  @note  the name of a constructor is always delete.
 *  @note  there is at most one destructor in a valid TopLevelNode
 */
public static final class P61 extends Pool<tyr.tooling.sdk.ast.Destructor> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P61(int idx, P15 sup) {
        super(idx, "Destructor", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Destructor> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f104((FieldType)SIFA[20], nextFID, this);
        case 1: return new f105((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Destructor(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Destructor instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Destructor make() {
        tyr.tooling.sdk.ast.Destructor rval = new tyr.tooling.sdk.ast.Destructor(0);
        add(rval);
        return rval;
    }

    public B61<tyr.tooling.sdk.ast.Destructor, ?> build() {
        return new B61<>(this, new tyr.tooling.sdk.ast.Destructor(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Destructor> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Destructor> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Destructor.class, this);
    }
}
/**
 *  A constructor of a type.
 *  @note  the name of a constructor is always new.
 */
public static final class P62 extends Pool<tyr.tooling.sdk.ast.Constructor> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P62(int idx, P15 sup) {
        super(idx, "Constructor", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "CTParams";
        case 2: return "RTParams";
        case 3: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Constructor> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f106((FieldType)SIFA[20], nextFID, this);
        case 1: return new f107((FieldType)SIFA[107], nextFID, this);
        case 2: return new f108((FieldType)SIFA[108], nextFID, this);
        case 3: return new f109((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Constructor(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Constructor instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Constructor make() {
        tyr.tooling.sdk.ast.Constructor rval = new tyr.tooling.sdk.ast.Constructor(0);
        add(rval);
        return rval;
    }

    public B62<tyr.tooling.sdk.ast.Constructor, ?> build() {
        return new B62<>(this, new tyr.tooling.sdk.ast.Constructor(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Constructor> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Constructor> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Constructor.class, this);
    }
}
/**
 *  Global destructors destruct the type.
 *  @note  conceptually, they cannot be called. But they are materialized as a function "delete" like destructors and
 *  behave like them. The signatures cannot overlap as global destrocturs cannot define parameters.
 */
public static final class P63 extends Pool<tyr.tooling.sdk.ast.GlobalDestructor> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P63(int idx, P15 sup) {
        super(idx, "GlobalDestructor", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "IsClass";
        case 2: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.GlobalDestructor> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f110((FieldType)SIFA[20], nextFID, this);
        case 1: return new f111((FieldType)SIFA[0], nextFID, this);
        case 2: return new f112((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.GlobalDestructor(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new GlobalDestructor instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.GlobalDestructor make() {
        tyr.tooling.sdk.ast.GlobalDestructor rval = new tyr.tooling.sdk.ast.GlobalDestructor(0);
        add(rval);
        return rval;
    }

    public B63<tyr.tooling.sdk.ast.GlobalDestructor, ?> build() {
        return new B63<>(this, new tyr.tooling.sdk.ast.GlobalDestructor(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.GlobalDestructor> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.GlobalDestructor> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$GlobalDestructor.class, this);
    }
}
/**
 *  Global initializers construct the type.
 *  @note  conceptually, they cannot be called. But they are materialized as a function "new" like constructors and
 *  behave like them. The signatures cannot overlap as global initializers cannot define parameters.
 */
public static final class P64 extends Pool<tyr.tooling.sdk.ast.GlobalInitializer> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P64(int idx, P15 sup) {
        super(idx, "GlobalInitializer", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        case 1: return "IsClass";
        case 2: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.GlobalInitializer> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f113((FieldType)SIFA[20], nextFID, this);
        case 1: return new f114((FieldType)SIFA[0], nextFID, this);
        case 2: return new f115((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.GlobalInitializer(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new GlobalInitializer instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.GlobalInitializer make() {
        tyr.tooling.sdk.ast.GlobalInitializer rval = new tyr.tooling.sdk.ast.GlobalInitializer(0);
        add(rval);
        return rval;
    }

    public B64<tyr.tooling.sdk.ast.GlobalInitializer, ?> build() {
        return new B64<>(this, new tyr.tooling.sdk.ast.GlobalInitializer(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.GlobalInitializer> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.GlobalInitializer> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$GlobalInitializer.class, this);
    }
}
/**
 *  An enum instance is a node holding a name and an optional initializer.
 */
public static final class P16 extends Pool<tyr.tooling.sdk.ast.EnumInstance> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P16(int idx, P1 sup) {
        super(idx, "EnumInstance", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Initializer";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.EnumInstance> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f116((FieldType)SIFA[9], nextFID, this);
        case 1: return new f117((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.EnumInstance(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new EnumInstance instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.EnumInstance make() {
        tyr.tooling.sdk.ast.EnumInstance rval = new tyr.tooling.sdk.ast.EnumInstance(0);
        add(rval);
        return rval;
    }

    public B16<tyr.tooling.sdk.ast.EnumInstance, ?> build() {
        return new B16<>(this, new tyr.tooling.sdk.ast.EnumInstance(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumInstance> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumInstance> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$EnumInstance.class, this);
    }
}
/**
 *  Definitions that can appear at top level.
 */
public static final class P17 extends Pool<tyr.tooling.sdk.ast.TopLevelNode> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P17(int idx, P1 sup) {
        super(idx, "TopLevelNode", sup, 1);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Doc";
        case 1: return "Name";
        case 2: return "Visibility";
        case 3: return "Declarations";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.TopLevelNode> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f118((FieldType)SIFA[18], nextFID, this);
        case 1: return new f119((FieldType)SIFA[9], nextFID, this);
        case 2: return new f120((FieldType)SIFA[88], nextFID, this);
        case 3: return new f121((FieldType)SIFA[95], this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TopLevelNode(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TopLevelNode instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TopLevelNode make() {
        tyr.tooling.sdk.ast.TopLevelNode rval = new tyr.tooling.sdk.ast.TopLevelNode(0);
        add(rval);
        return rval;
    }

    public B17<tyr.tooling.sdk.ast.TopLevelNode, ?> build() {
        return new B17<>(this, new tyr.tooling.sdk.ast.TopLevelNode(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "AliasDef";
        case 1: return "TypeLike";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TopLevelNode> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P65(idx, this);
        case 1: return new P66(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TopLevelNode> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TopLevelNode.class, this);
    }
}
/**
 * 
 *  @note  AliasDef must never receive formal parameters. Because, this would introduce type-level lambdas. This, in
 *  turn, is a serious issue for almost anything going on in the bifröst phase.
 */
public static final class P65 extends Pool<tyr.tooling.sdk.ast.AliasDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P65(int idx, P17 sup) {
        super(idx, "AliasDef", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Target";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.AliasDef> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f122((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.AliasDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new AliasDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.AliasDef make() {
        tyr.tooling.sdk.ast.AliasDef rval = new tyr.tooling.sdk.ast.AliasDef(0);
        add(rval);
        return rval;
    }

    public B65<tyr.tooling.sdk.ast.AliasDef, ?> build() {
        return new B65<>(this, new tyr.tooling.sdk.ast.AliasDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.AliasDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.AliasDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$AliasDef.class, this);
    }
}
/**
 *  A type definition that has formals and super types.
 */
public static final class P66 extends Pool<tyr.tooling.sdk.ast.TypeLike> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P66(int idx, P17 sup) {
        super(idx, "TypeLike", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Params";
        case 1: return "Imports";
        case 2: return "Extensions";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.TypeLike> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f123((FieldType)SIFA[107], nextFID, this);
        case 1: return new f124((FieldType)SIFA[101], nextFID, this);
        case 2: return new f125((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TypeLike(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TypeLike instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TypeLike make() {
        tyr.tooling.sdk.ast.TypeLike rval = new tyr.tooling.sdk.ast.TypeLike(0);
        add(rval);
        return rval;
    }

    public B66<tyr.tooling.sdk.ast.TypeLike, ?> build() {
        return new B66<>(this, new tyr.tooling.sdk.ast.TypeLike(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "EnumDef";
        case 1: return "PropertyDef";
        case 2: return "EnumUnionDef";
        case 3: return "TypeWithMembers";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeLike> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P67(idx, this);
        case 1: return new P68(idx, this);
        case 2: return new P69(idx, this);
        case 3: return new P70(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeLike> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TypeLike.class, this);
    }
}
/**
 *  An enum definition
 */
public static final class P67 extends Pool<tyr.tooling.sdk.ast.EnumDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P67(int idx, P66 sup) {
        super(idx, "EnumDef", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Instances";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.EnumDef> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f126((FieldType)SIFA[104], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.EnumDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new EnumDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.EnumDef make() {
        tyr.tooling.sdk.ast.EnumDef rval = new tyr.tooling.sdk.ast.EnumDef(0);
        add(rval);
        return rval;
    }

    public B67<tyr.tooling.sdk.ast.EnumDef, ?> build() {
        return new B67<>(this, new tyr.tooling.sdk.ast.EnumDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$EnumDef.class, this);
    }
}
/**
 *  The definition of a property.
 *  @note  Properties have no members.
 */
public static final class P68 extends Pool<tyr.tooling.sdk.ast.PropertyDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P68(int idx, P66 sup) {
        super(idx, "PropertyDef", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.PropertyDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new PropertyDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.PropertyDef make() {
        tyr.tooling.sdk.ast.PropertyDef rval = new tyr.tooling.sdk.ast.PropertyDef(0);
        add(rval);
        return rval;
    }

    public B66<tyr.tooling.sdk.ast.PropertyDef, ?> build() {
        return new B66<>(this, new tyr.tooling.sdk.ast.PropertyDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.PropertyDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.PropertyDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$PropertyDef.class, this);
    }
}
/**
 *  The definition of an enum union.
 */
public static final class P69 extends Pool<tyr.tooling.sdk.ast.EnumUnionDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P69(int idx, P66 sup) {
        super(idx, "EnumUnionDef", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Cases";
        case 1: return "Others";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.EnumUnionDef> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f127((FieldType)SIFA[100], nextFID, this);
        case 1: return new f128((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.EnumUnionDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new EnumUnionDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.EnumUnionDef make() {
        tyr.tooling.sdk.ast.EnumUnionDef rval = new tyr.tooling.sdk.ast.EnumUnionDef(0);
        add(rval);
        return rval;
    }

    public B69<tyr.tooling.sdk.ast.EnumUnionDef, ?> build() {
        return new B69<>(this, new tyr.tooling.sdk.ast.EnumUnionDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumUnionDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.EnumUnionDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$EnumUnionDef.class, this);
    }
}
public static final class P70 extends Pool<tyr.tooling.sdk.ast.TypeWithMembers> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P70(int idx, P66 sup) {
        super(idx, "TypeWithMembers", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Flat";
        case 1: return "Members";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.TypeWithMembers> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f129((FieldType)SIFA[0], nextFID, this);
        case 1: return new f130((FieldType)SIFA[103], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TypeWithMembers(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TypeWithMembers instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TypeWithMembers make() {
        tyr.tooling.sdk.ast.TypeWithMembers rval = new tyr.tooling.sdk.ast.TypeWithMembers(0);
        add(rval);
        return rval;
    }

    public B70<tyr.tooling.sdk.ast.TypeWithMembers, ?> build() {
        return new B70<>(this, new tyr.tooling.sdk.ast.TypeWithMembers(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "TypeDef";
        case 1: return "ClassDef";
        case 2: return "InterfaceDef";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeWithMembers> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P71(idx, this);
        case 1: return new P72(idx, this);
        case 2: return new P73(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeWithMembers> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TypeWithMembers.class, this);
    }
}
/**
 *  The definition of a type.
 */
public static final class P71 extends Pool<tyr.tooling.sdk.ast.TypeDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P71(int idx, P70 sup) {
        super(idx, "TypeDef", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.TypeDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new TypeDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.TypeDef make() {
        tyr.tooling.sdk.ast.TypeDef rval = new tyr.tooling.sdk.ast.TypeDef(0);
        add(rval);
        return rval;
    }

    public B70<tyr.tooling.sdk.ast.TypeDef, ?> build() {
        return new B70<>(this, new tyr.tooling.sdk.ast.TypeDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.TypeDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$TypeDef.class, this);
    }
}
/**
 *  The definition of a class.
 */
public static final class P72 extends Pool<tyr.tooling.sdk.ast.ClassDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P72(int idx, P70 sup) {
        super(idx, "ClassDef", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ClassDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ClassDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ClassDef make() {
        tyr.tooling.sdk.ast.ClassDef rval = new tyr.tooling.sdk.ast.ClassDef(0);
        add(rval);
        return rval;
    }

    public B70<tyr.tooling.sdk.ast.ClassDef, ?> build() {
        return new B70<>(this, new tyr.tooling.sdk.ast.ClassDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ClassDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ClassDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ClassDef.class, this);
    }
}
/**
 *  The definition of an interface.
 */
public static final class P73 extends Pool<tyr.tooling.sdk.ast.InterfaceDef> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P73(int idx, P70 sup) {
        super(idx, "InterfaceDef", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.InterfaceDef(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new InterfaceDef instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.InterfaceDef make() {
        tyr.tooling.sdk.ast.InterfaceDef rval = new tyr.tooling.sdk.ast.InterfaceDef(0);
        add(rval);
        return rval;
    }

    public B70<tyr.tooling.sdk.ast.InterfaceDef, ?> build() {
        return new B70<>(this, new tyr.tooling.sdk.ast.InterfaceDef(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.InterfaceDef> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.InterfaceDef> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$InterfaceDef.class, this);
    }
}
/**
 *  The declaration of a parameter.
 */
public static final class P18 extends Pool<tyr.tooling.sdk.ast.FormalParameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P18(int idx, P1 sup) {
        super(idx, "FormalParameter", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Typ";
        case 1: return "Name";
        case 2: return "VarArg";
        case 3: return "Default";
        case 4: return "Properties";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FormalParameter> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f131((FieldType)SIFA[19], nextFID, this);
        case 1: return new f132((FieldType)SIFA[9], nextFID, this);
        case 2: return new f133((FieldType)SIFA[0], nextFID, this);
        case 3: return new f134((FieldType)SIFA[19], nextFID, this);
        case 4: return new f135((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FormalParameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FormalParameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FormalParameter make() {
        tyr.tooling.sdk.ast.FormalParameter rval = new tyr.tooling.sdk.ast.FormalParameter(0);
        add(rval);
        return rval;
    }

    public B18<tyr.tooling.sdk.ast.FormalParameter, ?> build() {
        return new B18<>(this, new tyr.tooling.sdk.ast.FormalParameter(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "FormalCTParameter";
        case 1: return "ConstructorParameter";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FormalParameter> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P74(idx, this);
        case 1: return new P75(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FormalParameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FormalParameter.class, this);
    }
}
/**
 *  A formal CT parameter can be variant and may have a raw value.
 */
public static final class P74 extends Pool<tyr.tooling.sdk.ast.FormalCTParameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P74(int idx, P18 sup) {
        super(idx, "FormalCTParameter", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Raw";
        case 1: return "Variance";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FormalCTParameter> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f136((FieldType)SIFA[19], nextFID, this);
        case 1: return new f137((FieldType)SIFA[114], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FormalCTParameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FormalCTParameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FormalCTParameter make() {
        tyr.tooling.sdk.ast.FormalCTParameter rval = new tyr.tooling.sdk.ast.FormalCTParameter(0);
        add(rval);
        return rval;
    }

    public B74<tyr.tooling.sdk.ast.FormalCTParameter, ?> build() {
        return new B74<>(this, new tyr.tooling.sdk.ast.FormalCTParameter(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FormalCTParameter> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FormalCTParameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FormalCTParameter.class, this);
    }
}
/**
 *  Formal parameters of constructors may additionally define a field to be initialized.
 */
public static final class P75 extends Pool<tyr.tooling.sdk.ast.ConstructorParameter> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P75(int idx, P18 sup) {
        super(idx, "ConstructorParameter", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Initializes";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ConstructorParameter> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f138((FieldType)SIFA[9], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ConstructorParameter(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ConstructorParameter instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ConstructorParameter make() {
        tyr.tooling.sdk.ast.ConstructorParameter rval = new tyr.tooling.sdk.ast.ConstructorParameter(0);
        add(rval);
        return rval;
    }

    public B75<tyr.tooling.sdk.ast.ConstructorParameter, ?> build() {
        return new B75<>(this, new tyr.tooling.sdk.ast.ConstructorParameter(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ConstructorParameter> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ConstructorParameter> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ConstructorParameter.class, this);
    }
}
public static final class P19 extends Pool<tyr.tooling.sdk.ast.FunctionRealization> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P19(int idx, P1 sup) {
        super(idx, "FunctionRealization", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FunctionRealization(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FunctionRealization instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FunctionRealization make() {
        tyr.tooling.sdk.ast.FunctionRealization rval = new tyr.tooling.sdk.ast.FunctionRealization(0);
        add(rval);
        return rval;
    }

    public B1<tyr.tooling.sdk.ast.FunctionRealization, ?> build() {
        return new B1<>(this, new tyr.tooling.sdk.ast.FunctionRealization(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "FunctionBody";
        case 1: return "ExternFunction";
        case 2: return "AbstractFunction";
        case 3: return "FunctionAssignment";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionRealization> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P76(idx, this);
        case 1: return new P77(idx, this);
        case 2: return new P78(idx, this);
        case 3: return new P79(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionRealization> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FunctionRealization.class, this);
    }
}
/**
 *  Realization by definition of a body.
 */
public static final class P76 extends Pool<tyr.tooling.sdk.ast.FunctionBody> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P76(int idx, P19 sup) {
        super(idx, "FunctionBody", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Body";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FunctionBody> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f139((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FunctionBody(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FunctionBody instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FunctionBody make() {
        tyr.tooling.sdk.ast.FunctionBody rval = new tyr.tooling.sdk.ast.FunctionBody(0);
        add(rval);
        return rval;
    }

    public B76<tyr.tooling.sdk.ast.FunctionBody, ?> build() {
        return new B76<>(this, new tyr.tooling.sdk.ast.FunctionBody(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionBody> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionBody> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FunctionBody.class, this);
    }
}
/**
 *  Realization by a C function loaded from a shared object.
 */
public static final class P77 extends Pool<tyr.tooling.sdk.ast.ExternFunction> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P77(int idx, P19 sup) {
        super(idx, "ExternFunction", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Source";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.ExternFunction> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f140((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.ExternFunction(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new ExternFunction instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.ExternFunction make() {
        tyr.tooling.sdk.ast.ExternFunction rval = new tyr.tooling.sdk.ast.ExternFunction(0);
        add(rval);
        return rval;
    }

    public B77<tyr.tooling.sdk.ast.ExternFunction, ?> build() {
        return new B77<>(this, new tyr.tooling.sdk.ast.ExternFunction(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ExternFunction> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.ExternFunction> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$ExternFunction.class, this);
    }
}
/**
 *  Abstract functions are functions without implementations. Native functions are also realized by abstract functions.
 */
public static final class P78 extends Pool<tyr.tooling.sdk.ast.AbstractFunction>
        implements ogss.common.java.internal.SingletonPool<tyr.tooling.sdk.ast.AbstractFunction> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P78(int idx, P19 sup) {
        super(idx, "AbstractFunction", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo;

        if (staticDataInstances > 1) {
            throw new OGSSException("class "+name+" is a singleton, but has "+staticDataInstances+" instances");
        }
        if (1 == staticDataInstances) {
            // create a new object, claiming that there is none in data
            staticDataInstances = 0;
            tyr.tooling.sdk.ast.AbstractFunction v = get();
            // instance is not a new object and make the object an object obtained from file
            this.newObjects.clear();
            staticDataInstances = 1;

            data[i] = v;
            setID(v, i + 1);
        }
    }

    /**
     * @return a new AbstractFunction instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.AbstractFunction make() {
        if(0 != size()) {
            throw new OGSSException("class "+name+" is a singleton with "+size()+" instance; use get to access the instance.");
        }

        tyr.tooling.sdk.ast.AbstractFunction rval = new tyr.tooling.sdk.ast.AbstractFunction(0);
        add(rval);
        return rval;
    }

    private tyr.tooling.sdk.ast.AbstractFunction instance;

    @Override
    public synchronized tyr.tooling.sdk.ast.AbstractFunction get() {
        if(null == instance){
            instance = make();
        }
        return instance;
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.AbstractFunction> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$AbstractFunction.class, this);
    }
}
/**
 *  Realization by placing another function into this function.
 */
public static final class P79 extends Pool<tyr.tooling.sdk.ast.FunctionAssignment> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P79(int idx, P19 sup) {
        super(idx, "FunctionAssignment", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Source";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.FunctionAssignment> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f141((FieldType)SIFA[19], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.FunctionAssignment(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new FunctionAssignment instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.FunctionAssignment make() {
        tyr.tooling.sdk.ast.FunctionAssignment rval = new tyr.tooling.sdk.ast.FunctionAssignment(0);
        add(rval);
        return rval;
    }

    public B79<tyr.tooling.sdk.ast.FunctionAssignment, ?> build() {
        return new B79<>(this, new tyr.tooling.sdk.ast.FunctionAssignment(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionAssignment> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.FunctionAssignment> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$FunctionAssignment.class, this);
    }
}
/**
 *  A paragraph is a list of words.
 *  @note  Here, any non-whitespace character sequence counts as word.
 */
public static final class P2 extends Pool<tyr.tooling.sdk.ast.DocTag> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P2(int idx) {
        super(idx, "DocTag", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Words";
        case 2: return "Content";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.DocTag> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f142((FieldType)SIFA[9], nextFID, this);
        case 1: return new f143((FieldType)SIFA[94], nextFID, this);
        case 2: return new f144((FieldType)SIFA[110], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.DocTag(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new DocTag instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.DocTag make() {
        tyr.tooling.sdk.ast.DocTag rval = new tyr.tooling.sdk.ast.DocTag(0);
        add(rval);
        return rval;
    }

    public B2<tyr.tooling.sdk.ast.DocTag, ?> build() {
        return new B2<>(this, new tyr.tooling.sdk.ast.DocTag(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocTag> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocTag> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$DocTag.class, this);
    }
}
/**
 *  A compiler message that is neither expected nor suppressed.
 */
public static final class P3 extends Pool<tyr.tooling.sdk.ast.Message> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P3(int idx) {
        super(idx, "Message", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Pos";
        case 1: return "Text";
        case 2: return "Category";
        case 3: return "Severity";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Message> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f145((FieldType)SIFA[87], nextFID, this);
        case 1: return new f146((FieldType)SIFA[9], nextFID, this);
        case 2: return new f147((FieldType)SIFA[9], nextFID, this);
        case 3: return new f148((FieldType)SIFA[113], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Message(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Message instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Message make() {
        tyr.tooling.sdk.ast.Message rval = new tyr.tooling.sdk.ast.Message(0);
        add(rval);
        return rval;
    }

    public B3<tyr.tooling.sdk.ast.Message, ?> build() {
        return new B3<>(this, new tyr.tooling.sdk.ast.Message(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Message> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Message> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Message.class, this);
    }
}
/**
 *  Tyr comes in packages.
 *  @author  Timm Felden
 */
public static final class P4 extends Pool<tyr.tooling.sdk.ast.Package>
        implements ogss.common.java.internal.SingletonPool<tyr.tooling.sdk.ast.Package> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P4(int idx) {
        super(idx, "Package", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Name";
        case 1: return "Root";
        case 2: return "PackageRoot";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Package> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f149((FieldType)SIFA[94], nextFID, this);
        case 1: return new f150((FieldType)SIFA[14], nextFID, this);
        case 2: return new f151((FieldType)SIFA[14], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo;

        if (staticDataInstances > 1) {
            throw new OGSSException("class "+name+" is a singleton, but has "+staticDataInstances+" instances");
        }
        if (1 == staticDataInstances) {
            // create a new object, claiming that there is none in data
            staticDataInstances = 0;
            tyr.tooling.sdk.ast.Package v = get();
            // instance is not a new object and make the object an object obtained from file
            this.newObjects.clear();
            staticDataInstances = 1;

            data[i] = v;
            setID(v, i + 1);
        }
    }

    /**
     * @return a new Package instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Package make() {
        if(0 != size()) {
            throw new OGSSException("class "+name+" is a singleton with "+size()+" instance; use get to access the instance.");
        }

        tyr.tooling.sdk.ast.Package rval = new tyr.tooling.sdk.ast.Package(0);
        add(rval);
        return rval;
    }

    private tyr.tooling.sdk.ast.Package instance;

    @Override
    public synchronized tyr.tooling.sdk.ast.Package get() {
        if(null == instance){
            instance = make();
        }
        return instance;
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Package> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Package.class, this);
    }
}
/**
 *  A position inside a file.
 *  @author  Timm Felden
 */
public static final class P5 extends Pool<tyr.tooling.sdk.ast.Position> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P5(int idx) {
        super(idx, "Position", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "File";
        case 1: return "EndLine";
        case 2: return "BeginLine";
        case 3: return "EndColumn";
        case 4: return "BeginColumn";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.Position> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f152((FieldType)SIFA[10], nextFID, this);
        case 1: return new f153((FieldType)SIFA[5], nextFID, this);
        case 2: return new f154((FieldType)SIFA[5], nextFID, this);
        case 3: return new f155((FieldType)SIFA[5], nextFID, this);
        case 4: return new f156((FieldType)SIFA[5], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Position(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Position instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Position make() {
        tyr.tooling.sdk.ast.Position rval = new tyr.tooling.sdk.ast.Position(0);
        add(rval);
        return rval;
    }

    public B5<tyr.tooling.sdk.ast.Position, ?> build() {
        return new B5<>(this, new tyr.tooling.sdk.ast.Position(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Position> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Position> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Position.class, this);
    }
}
public static final class P6 extends Pool<tyr.tooling.sdk.ast.Visibility> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P6(int idx) {
        super(idx, "Visibility", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.Visibility(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new Visibility instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.Visibility make() {
        tyr.tooling.sdk.ast.Visibility rval = new tyr.tooling.sdk.ast.Visibility(0);
        add(rval);
        return rval;
    }

    public B6<tyr.tooling.sdk.ast.Visibility, ?> build() {
        return new B6<>(this, new tyr.tooling.sdk.ast.Visibility(0));
    }
    @Override
    protected String nameSub(int id) {
        switch (id) {
        case 0: return "PublicVisible";
        case 1: return "PackageVisible";
        case 2: return "OverrideVisible";
        case 3: return "RestrictedVisible";
        default: return null;
        }
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Visibility> makeSub(int id, int idx) {
        switch (id) {
        case 0: return new P80(idx, this);
        case 1: return new P81(idx, this);
        case 2: return new P82(idx, this);
        case 3: return new P83(idx, this);
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.Visibility> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$Visibility.class, this);
    }
}
/**
 *  Entities with this visibility can be accessed from everywhere.
 */
public static final class P80 extends Pool<tyr.tooling.sdk.ast.PublicVisible>
        implements ogss.common.java.internal.SingletonPool<tyr.tooling.sdk.ast.PublicVisible> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P80(int idx, P6 sup) {
        super(idx, "PublicVisible", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo;

        if (staticDataInstances > 1) {
            throw new OGSSException("class "+name+" is a singleton, but has "+staticDataInstances+" instances");
        }
        if (1 == staticDataInstances) {
            // create a new object, claiming that there is none in data
            staticDataInstances = 0;
            tyr.tooling.sdk.ast.PublicVisible v = get();
            // instance is not a new object and make the object an object obtained from file
            this.newObjects.clear();
            staticDataInstances = 1;

            data[i] = v;
            setID(v, i + 1);
        }
    }

    /**
     * @return a new PublicVisible instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.PublicVisible make() {
        if(0 != size()) {
            throw new OGSSException("class "+name+" is a singleton with "+size()+" instance; use get to access the instance.");
        }

        tyr.tooling.sdk.ast.PublicVisible rval = new tyr.tooling.sdk.ast.PublicVisible(0);
        add(rval);
        return rval;
    }

    private tyr.tooling.sdk.ast.PublicVisible instance;

    @Override
    public synchronized tyr.tooling.sdk.ast.PublicVisible get() {
        if(null == instance){
            instance = make();
        }
        return instance;
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.PublicVisible> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$PublicVisible.class, this);
    }
}
/**
 *  Entities with this visibility can be accessed from inside the same package.
 */
public static final class P81 extends Pool<tyr.tooling.sdk.ast.PackageVisible>
        implements ogss.common.java.internal.SingletonPool<tyr.tooling.sdk.ast.PackageVisible> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P81(int idx, P6 sup) {
        super(idx, "PackageVisible", sup, 0);
    }

    @Override
    protected void allocateInstances() {
        int i = bpo;

        if (staticDataInstances > 1) {
            throw new OGSSException("class "+name+" is a singleton, but has "+staticDataInstances+" instances");
        }
        if (1 == staticDataInstances) {
            // create a new object, claiming that there is none in data
            staticDataInstances = 0;
            tyr.tooling.sdk.ast.PackageVisible v = get();
            // instance is not a new object and make the object an object obtained from file
            this.newObjects.clear();
            staticDataInstances = 1;

            data[i] = v;
            setID(v, i + 1);
        }
    }

    /**
     * @return a new PackageVisible instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.PackageVisible make() {
        if(0 != size()) {
            throw new OGSSException("class "+name+" is a singleton with "+size()+" instance; use get to access the instance.");
        }

        tyr.tooling.sdk.ast.PackageVisible rval = new tyr.tooling.sdk.ast.PackageVisible(0);
        add(rval);
        return rval;
    }

    private tyr.tooling.sdk.ast.PackageVisible instance;

    @Override
    public synchronized tyr.tooling.sdk.ast.PackageVisible get() {
        if(null == instance){
            instance = make();
        }
        return instance;
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.PackageVisible> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$PackageVisible.class, this);
    }
}
/**
 *  Override visibility. Overrides cannot change the visibility of an entity. On conflict, public will be chosen iff one
 *  target is public. On conflict, the largest common visibility will be chosen.
 *  @note  Increasing visibility on conflict is not an issue, as visibility cannot be used for security anyway. Also,
 *  access via the increased visibility is only granted if the precise type is known, i.e. there is no general removal
 *  of visibility of a super type.
 *  @note  It does not make sense to reduce the visibility for an overridden entity as it would not reduce the access to
 *  it.
 */
public static final class P82 extends Pool<tyr.tooling.sdk.ast.OverrideVisible> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P82(int idx, P6 sup) {
        super(idx, "OverrideVisible", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Targets";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.OverrideVisible> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f157((FieldType)SIFA[98], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.OverrideVisible(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new OverrideVisible instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.OverrideVisible make() {
        tyr.tooling.sdk.ast.OverrideVisible rval = new tyr.tooling.sdk.ast.OverrideVisible(0);
        add(rval);
        return rval;
    }

    public B82<tyr.tooling.sdk.ast.OverrideVisible, ?> build() {
        return new B82<>(this, new tyr.tooling.sdk.ast.OverrideVisible(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OverrideVisible> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.OverrideVisible> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$OverrideVisible.class, this);
    }
}
/**
 *  An entity that holds procted or private restrictions.
 *  @note  this is an AST, hence we do not resolve the semantics from missing CT args
 *  @note  If not CT args are provided, the parent of the restricted entity is chosen. Surprisingly, this is always what
 *  one wants.
 *  @inv  isProtected | isPrivate
 */
public static final class P83 extends Pool<tyr.tooling.sdk.ast.RestrictedVisible> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P83(int idx, P6 sup) {
        super(idx, "RestrictedVisible", sup, 0);
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Private";
        case 1: return "IsPrivate";
        case 2: return "Protected";
        case 3: return "IsProtected";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.RestrictedVisible> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f158((FieldType)SIFA[19], nextFID, this);
        case 1: return new f159((FieldType)SIFA[0], nextFID, this);
        case 2: return new f160((FieldType)SIFA[19], nextFID, this);
        case 3: return new f161((FieldType)SIFA[0], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.RestrictedVisible(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new RestrictedVisible instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.RestrictedVisible make() {
        tyr.tooling.sdk.ast.RestrictedVisible rval = new tyr.tooling.sdk.ast.RestrictedVisible(0);
        add(rval);
        return rval;
    }

    public B83<tyr.tooling.sdk.ast.RestrictedVisible, ?> build() {
        return new B83<>(this, new tyr.tooling.sdk.ast.RestrictedVisible(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.RestrictedVisible> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.RestrictedVisible> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$RestrictedVisible.class, this);
    }
}
/**
 *  A paragraph is a list of words.
 *  @note  Here, any non-whitespace character sequence counts as word.
 */
public static final class P7 extends Pool<tyr.tooling.sdk.ast.DocParagraph> {

    /**
     * Can only be constructed by the SkillFile in this package.
     */
    P7(int idx) {
        super(idx, "DocParagraph", null, 0);
    }

    final Obj[] data() {
        return data;
    }

    @Override
    protected String KFN(int id) {
        switch (id) {
        case 0: return "Words";
        default: return null;
        }
    }

    @Override
    protected FieldDeclaration<?, tyr.tooling.sdk.ast.DocParagraph> KFC(int id, FieldType<?>[] SIFA, int nextFID) {
        switch (id) {
        case 0: return new f162((FieldType)SIFA[94], nextFID, this);
        default: return null;
        }
    }

    @Override
    protected void allocateInstances() {
        int i = bpo, j;
        final int high = i + staticDataInstances;
        while (i < high) {
            data[i] = new tyr.tooling.sdk.ast.DocParagraph(j = (i + 1));
            i = j;
        }
    }

    /**
     * @return a new DocParagraph instance with default field values
     */
    @Override
    public tyr.tooling.sdk.ast.DocParagraph make() {
        tyr.tooling.sdk.ast.DocParagraph rval = new tyr.tooling.sdk.ast.DocParagraph(0);
        add(rval);
        return rval;
    }

    public B7<tyr.tooling.sdk.ast.DocParagraph, ?> build() {
        return new B7<>(this, new tyr.tooling.sdk.ast.DocParagraph(0));
    }

    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocParagraph> makeSub(int id, int idx) {
        switch (id) {
        default: return null;
        }
    }


    @Override
    protected Pool<? extends tyr.tooling.sdk.ast.DocParagraph> makeSub(int index, String name) {
        return new SubPool<>(index, name, tyr.tooling.sdk.ast.Sub$DocParagraph.class, this);
    }
}
    /**
     * Builder for new File instances.
     *
     * @author Timm Felden
     */
    public static class B0<T extends tyr.tooling.sdk.ast.File, B extends B0<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B0(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B parent(tyr.tooling.sdk.ast.File parent) {
            self.parent = parent;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }
    }

    /**
     * Builder for new Node instances.
     *
     * @author Timm Felden
     */
    public static class B1<T extends tyr.tooling.sdk.ast.Node, B extends B1<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B1(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B pos(tyr.tooling.sdk.ast.Position pos) {
            self.pos = pos;
            return (B)this;
        }

        public final B parent(tyr.tooling.sdk.ast.Node parent) {
            self.parent = parent;
            return (B)this;
        }
    }

    /**
     * Builder for new FileNode instances.
     *
     * @author Timm Felden
     */
    public static class B8<T extends tyr.tooling.sdk.ast.FileNode, B extends B8<T, B>> extends B1<T, B> {

        protected B8(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B imports(java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports) {
            self.imports = imports;
            return (B)this;
        }

        public final B defs(java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> defs) {
            self.defs = defs;
            return (B)this;
        }
    }

    /**
     * Builder for new ExtEntity instances.
     *
     * @author Timm Felden
     */
    public static class B9<T extends tyr.tooling.sdk.ast.ExtEntity, B extends B9<T, B>> extends B1<T, B> {

        protected B9(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B Zpackage(java.lang.String Zpackage) {
            self.Zpackage = Zpackage;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }
    }

    /**
     * Builder for new Namespace instances.
     *
     * @author Timm Felden
     */
    public static class B10<T extends tyr.tooling.sdk.ast.Namespace, B extends B10<T, B>> extends B1<T, B> {

        protected B10(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B declarations(java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> declarations) {
            self.declarations = declarations;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B subspace(java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> subspace) {
            self.subspace = subspace;
            return (B)this;
        }
    }

    /**
     * Builder for new Parameter instances.
     *
     * @author Timm Felden
     */
    public static class B11<T extends tyr.tooling.sdk.ast.Parameter, B extends B11<T, B>> extends B1<T, B> {

        protected B11(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }
    }

    /**
     * Builder for new ValueParameter instances.
     *
     * @author Timm Felden
     */
    public static class B21<T extends tyr.tooling.sdk.ast.ValueParameter, B extends B21<T, B>> extends B11<T, B> {

        protected B21(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B value(tyr.tooling.sdk.ast.Expression value) {
            self.value = value;
            return (B)this;
        }
    }

    /**
     * Builder for new DocComment instances.
     *
     * @author Timm Felden
     */
    public static class B12<T extends tyr.tooling.sdk.ast.DocComment, B extends B12<T, B>> extends B1<T, B> {

        protected B12(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B tags(java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> tags) {
            self.tags = tags;
            return (B)this;
        }

        public final B details(java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> details) {
            self.details = details;
            return (B)this;
        }
    }

    /**
     * Builder for new Expression instances.
     *
     * @author Timm Felden
     */
    public static class B13<T extends tyr.tooling.sdk.ast.Expression, B extends B13<T, B>> extends B1<T, B> {

        protected B13(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B prettyType(java.lang.String prettyType) {
            self.prettyType = prettyType;
            return (B)this;
        }

        public final B ET(tyr.tooling.sdk.ast.Expression ET) {
            self.ET = ET;
            return (B)this;
        }

        public final B definition(tyr.tooling.sdk.ast.NamedMember definition) {
            self.definition = definition;
            return (B)this;
        }
    }

    /**
     * Builder for new Block instances.
     *
     * @author Timm Felden
     */
    public static class B22<T extends tyr.tooling.sdk.ast.Block, B extends B22<T, B>> extends B13<T, B> {

        protected B22(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B statements(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> statements) {
            self.statements = statements;
            return (B)this;
        }
    }

    /**
     * Builder for new IntLiteral instances.
     *
     * @author Timm Felden
     */
    public static class B41<T extends tyr.tooling.sdk.ast.IntLiteral, B extends B41<T, B>> extends B13<T, B> {

        protected B41(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B value(long value) {
            self.value = value;
            return (B)this;
        }

        public final B size(int size) {
            self.size = size;
            return (B)this;
        }

        public final B image(java.lang.String image) {
            self.image = image;
            return (B)this;
        }

        public final B signed(boolean signed) {
            self.signed = signed;
            return (B)this;
        }
    }

    /**
     * Builder for new BoolLiteral instances.
     *
     * @author Timm Felden
     */
    public static class B42<T extends tyr.tooling.sdk.ast.BoolLiteral, B extends B42<T, B>> extends B13<T, B> {

        protected B42(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B value(boolean value) {
            self.value = value;
            return (B)this;
        }
    }

    /**
     * Builder for new CharLiteral instances.
     *
     * @author Timm Felden
     */
    public static class B43<T extends tyr.tooling.sdk.ast.CharLiteral, B extends B43<T, B>> extends B13<T, B> {

        protected B43(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B value(long value) {
            self.value = value;
            return (B)this;
        }
    }

    /**
     * Builder for new FloatLiteral instances.
     *
     * @author Timm Felden
     */
    public static class B45<T extends tyr.tooling.sdk.ast.FloatLiteral, B extends B45<T, B>> extends B13<T, B> {

        protected B45(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B size(int size) {
            self.size = size;
            return (B)this;
        }

        public final B image(java.lang.String image) {
            self.image = image;
            return (B)this;
        }

        public final B value(double value) {
            self.value = value;
            return (B)this;
        }
    }

    /**
     * Builder for new StringLiteral instances.
     *
     * @author Timm Felden
     */
    public static class B46<T extends tyr.tooling.sdk.ast.StringLiteral, B extends B46<T, B>> extends B13<T, B> {

        protected B46(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B value(java.lang.String value) {
            self.value = value;
            return (B)this;
        }
    }

    /**
     * Builder for new Allocation instances.
     *
     * @author Timm Felden
     */
    public static class B24<T extends tyr.tooling.sdk.ast.Allocation, B extends B24<T, B>> extends B13<T, B> {

        protected B24(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B second(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> second) {
            self.second = second;
            return (B)this;
        }

        public final B first(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> first) {
            self.first = first;
            return (B)this;
        }

        public final B args(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> args) {
            self.args = args;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new VariableDef instances.
     *
     * @author Timm Felden
     */
    public static class B25<T extends tyr.tooling.sdk.ast.VariableDef, B extends B25<T, B>> extends B13<T, B> {

        protected B25(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B init(tyr.tooling.sdk.ast.Expression init) {
            self.init = init;
            return (B)this;
        }

        public final B storage(tyr.tooling.sdk.ast.Storage storage) {
            self.storage = ((OGFile)p.owner()).Storage.proxy(storage);
            return (B)this;
        }

        public final B storage(EnumProxy<tyr.tooling.sdk.ast.Storage> storage) {
            self.storage = storage;
            return (B)this;
        }

        public final B typ(tyr.tooling.sdk.ast.Expression typ) {
            self.typ = typ;
            return (B)this;
        }
    }

    /**
     * Builder for new Deallocation instances.
     *
     * @author Timm Felden
     */
    public static class B26<T extends tyr.tooling.sdk.ast.Deallocation, B extends B26<T, B>> extends B13<T, B> {

        protected B26(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new FunctionType instances.
     *
     * @author Timm Felden
     */
    public static class B27<T extends tyr.tooling.sdk.ast.FunctionType, B extends B27<T, B>> extends B13<T, B> {

        protected B27(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B kind(tyr.tooling.sdk.ast.FunctionTypeKind kind) {
            self.kind = ((OGFile)p.owner()).FunctionTypeKind.proxy(kind);
            return (B)this;
        }

        public final B kind(EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind> kind) {
            self.kind = kind;
            return (B)this;
        }

        public final B ctParams(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> ctParams) {
            self.ctParams = ctParams;
            return (B)this;
        }

        public final B result(tyr.tooling.sdk.ast.Expression result) {
            self.result = result;
            return (B)this;
        }

        public final B rtParams(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> rtParams) {
            self.rtParams = rtParams;
            return (B)this;
        }
    }

    /**
     * Builder for new MemberAccess instances.
     *
     * @author Timm Felden
     */
    public static class B28<T extends tyr.tooling.sdk.ast.MemberAccess, B extends B28<T, B>> extends B13<T, B> {

        protected B28(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new StaticAccess instances.
     *
     * @author Timm Felden
     */
    public static class B29<T extends tyr.tooling.sdk.ast.StaticAccess, B extends B29<T, B>> extends B13<T, B> {

        protected B29(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }
    }

    /**
     * Builder for new CTApplication instances.
     *
     * @author Timm Felden
     */
    public static class B30<T extends tyr.tooling.sdk.ast.CTApplication, B extends B30<T, B>> extends B13<T, B> {

        protected B30(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B params(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> params) {
            self.params = params;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new OperatorUsage instances.
     *
     * @author Timm Felden
     */
    public static class B31<T extends tyr.tooling.sdk.ast.OperatorUsage, B extends B31<T, B>> extends B13<T, B> {

        protected B31(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }
    }

    /**
     * Builder for new RTApplication instances.
     *
     * @author Timm Felden
     */
    public static class B32<T extends tyr.tooling.sdk.ast.RTApplication, B extends B32<T, B>> extends B13<T, B> {

        protected B32(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B params(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> params) {
            self.params = params;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new ImportExpression instances.
     *
     * @author Timm Felden
     */
    public static class B33<T extends tyr.tooling.sdk.ast.ImportExpression, B extends B33<T, B>> extends B13<T, B> {

        protected B33(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new StaticTypeAccess instances.
     *
     * @author Timm Felden
     */
    public static class B34<T extends tyr.tooling.sdk.ast.StaticTypeAccess, B extends B34<T, B>> extends B13<T, B> {

        protected B34(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new BinderApplication instances.
     *
     * @author Timm Felden
     */
    public static class B35<T extends tyr.tooling.sdk.ast.BinderApplication, B extends B35<T, B>> extends B13<T, B> {

        protected B35(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B locals(java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> locals) {
            self.locals = locals;
            return (B)this;
        }

        public final B blocks(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> blocks) {
            self.blocks = blocks;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new DynamicTypeAccess instances.
     *
     * @author Timm Felden
     */
    public static class B36<T extends tyr.tooling.sdk.ast.DynamicTypeAccess, B extends B36<T, B>> extends B13<T, B> {

        protected B36(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new SwitchLike instances.
     *
     * @author Timm Felden
     */
    public static class B47<T extends tyr.tooling.sdk.ast.SwitchLike, B extends B47<T, B>> extends B13<T, B> {

        protected B47(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B guardName(java.lang.String guardName) {
            self.guardName = guardName;
            return (B)this;
        }
    }

    /**
     * Builder for new TryExpression instances.
     *
     * @author Timm Felden
     */
    public static class B54<T extends tyr.tooling.sdk.ast.TryExpression, B extends B54<T, B>> extends B47<T, B> {

        protected B54(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B others(tyr.tooling.sdk.ast.Expression others) {
            self.others = others;
            return (B)this;
        }

        public final B catchPos(tyr.tooling.sdk.ast.Position catchPos) {
            self.catchPos = catchPos;
            return (B)this;
        }

        public final B cases(java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> cases) {
            self.cases = cases;
            return (B)this;
        }

        public final B Zfinally(tyr.tooling.sdk.ast.Expression Zfinally) {
            self.Zfinally = Zfinally;
            return (B)this;
        }

        public final B finallyPos(tyr.tooling.sdk.ast.Position finallyPos) {
            self.finallyPos = finallyPos;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Expression body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new SwitchExpression instances.
     *
     * @author Timm Felden
     */
    public static class B55<T extends tyr.tooling.sdk.ast.SwitchExpression, B extends B55<T, B>> extends B47<T, B> {

        protected B55(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B guard(tyr.tooling.sdk.ast.Expression guard) {
            self.guard = guard;
            return (B)this;
        }

        public final B others(tyr.tooling.sdk.ast.Expression others) {
            self.others = others;
            return (B)this;
        }

        public final B cases(java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> cases) {
            self.cases = cases;
            return (B)this;
        }

        public final B kind(tyr.tooling.sdk.ast.Kind kind) {
            self.kind = ((OGFile)p.owner()).Kind.proxy(kind);
            return (B)this;
        }

        public final B kind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
            self.kind = kind;
            return (B)this;
        }
    }

    /**
     * Builder for new IfExpression instances.
     *
     * @author Timm Felden
     */
    public static class B48<T extends tyr.tooling.sdk.ast.IfExpression, B extends B48<T, B>> extends B13<T, B> {

        protected B48(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B guard(tyr.tooling.sdk.ast.Expression guard) {
            self.guard = guard;
            return (B)this;
        }

        public final B eb(tyr.tooling.sdk.ast.Expression eb) {
            self.eb = eb;
            return (B)this;
        }

        public final B tb(tyr.tooling.sdk.ast.Expression tb) {
            self.tb = tb;
            return (B)this;
        }
    }

    /**
     * Builder for new BreakExpression instances.
     *
     * @author Timm Felden
     */
    public static class B49<T extends tyr.tooling.sdk.ast.BreakExpression, B extends B49<T, B>> extends B13<T, B> {

        protected B49(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B result(tyr.tooling.sdk.ast.Expression result) {
            self.result = result;
            return (B)this;
        }
    }

    /**
     * Builder for new ThrowExpression instances.
     *
     * @author Timm Felden
     */
    public static class B50<T extends tyr.tooling.sdk.ast.ThrowExpression, B extends B50<T, B>> extends B13<T, B> {

        protected B50(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new ReturnExpression instances.
     *
     * @author Timm Felden
     */
    public static class B51<T extends tyr.tooling.sdk.ast.ReturnExpression, B extends B51<T, B>> extends B13<T, B> {

        protected B51(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B result(tyr.tooling.sdk.ast.Expression result) {
            self.result = result;
            return (B)this;
        }
    }

    /**
     * Builder for new ContinueExpression instances.
     *
     * @author Timm Felden
     */
    public static class B52<T extends tyr.tooling.sdk.ast.ContinueExpression, B extends B52<T, B>> extends B13<T, B> {

        protected B52(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B result(tyr.tooling.sdk.ast.Expression result) {
            self.result = result;
            return (B)this;
        }
    }

    /**
     * Builder for new BreakContinueTarget instances.
     *
     * @author Timm Felden
     */
    public static class B53<T extends tyr.tooling.sdk.ast.BreakContinueTarget, B extends B53<T, B>> extends B13<T, B> {

        protected B53(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B body(tyr.tooling.sdk.ast.Expression body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new WhileLoop instances.
     *
     * @author Timm Felden
     */
    public static class B56<T extends tyr.tooling.sdk.ast.WhileLoop, B extends B56<T, B>> extends B53<T, B> {

        protected B56(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B guard(tyr.tooling.sdk.ast.Expression guard) {
            self.guard = guard;
            return (B)this;
        }
    }

    /**
     * Builder for new DoWhileLoop instances.
     *
     * @author Timm Felden
     */
    public static class B57<T extends tyr.tooling.sdk.ast.DoWhileLoop, B extends B57<T, B>> extends B53<T, B> {

        protected B57(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B guard(tyr.tooling.sdk.ast.Expression guard) {
            self.guard = guard;
            return (B)this;
        }
    }

    /**
     * Builder for new OperatorApplication instances.
     *
     * @author Timm Felden
     */
    public static class B38<T extends tyr.tooling.sdk.ast.OperatorApplication, B extends B38<T, B>> extends B13<T, B> {

        protected B38(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B targets(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets) {
            self.targets = targets;
            return (B)this;
        }
    }

    /**
     * Builder for new SuperDestructorCall instances.
     *
     * @author Timm Felden
     */
    public static class B39<T extends tyr.tooling.sdk.ast.SuperDestructorCall, B extends B39<T, B>> extends B13<T, B> {

        protected B39(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new SuperConstructorCall instances.
     *
     * @author Timm Felden
     */
    public static class B40<T extends tyr.tooling.sdk.ast.SuperConstructorCall, B extends B40<T, B>> extends B13<T, B> {

        protected B40(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B second(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> second) {
            self.second = second;
            return (B)this;
        }

        public final B first(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> first) {
            self.first = first;
            return (B)this;
        }

        public final B args(java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> args) {
            self.args = args;
            return (B)this;
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new SwitchCase instances.
     *
     * @author Timm Felden
     */
    public static class B14<T extends tyr.tooling.sdk.ast.SwitchCase, B extends B14<T, B>> extends B1<T, B> {

        protected B14(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B labels(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> labels) {
            self.labels = labels;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Expression body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new TypeMember instances.
     *
     * @author Timm Felden
     */
    public static class B15<T extends tyr.tooling.sdk.ast.TypeMember, B extends B15<T, B>> extends B1<T, B> {

        protected B15(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B doc(tyr.tooling.sdk.ast.DocComment doc) {
            self.doc = doc;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B visibility(tyr.tooling.sdk.ast.Visibility visibility) {
            self.visibility = visibility;
            return (B)this;
        }
    }

    /**
     * Builder for new Test instances.
     *
     * @author Timm Felden
     */
    public static class B58<T extends tyr.tooling.sdk.ast.Test, B extends B58<T, B>> extends B15<T, B> {

        protected B58(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B categoryParams(java.util.ArrayList<java.lang.String> categoryParams) {
            self.categoryParams = categoryParams;
            return (B)this;
        }

        public final B category(java.lang.String category) {
            self.category = category;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Block body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new Field instances.
     *
     * @author Timm Felden
     */
    public static class B59<T extends tyr.tooling.sdk.ast.Field, B extends B59<T, B>> extends B15<T, B> {

        protected B59(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B init(tyr.tooling.sdk.ast.Expression init) {
            self.init = init;
            return (B)this;
        }

        public final B storage(tyr.tooling.sdk.ast.Storage storage) {
            self.storage = ((OGFile)p.owner()).Storage.proxy(storage);
            return (B)this;
        }

        public final B storage(EnumProxy<tyr.tooling.sdk.ast.Storage> storage) {
            self.storage = storage;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B kind(tyr.tooling.sdk.ast.Kind kind) {
            self.kind = ((OGFile)p.owner()).Kind.proxy(kind);
            return (B)this;
        }

        public final B kind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
            self.kind = kind;
            return (B)this;
        }

        public final B extern(tyr.tooling.sdk.ast.Expression extern) {
            self.extern = extern;
            return (B)this;
        }

        public final B typ(tyr.tooling.sdk.ast.Expression typ) {
            self.typ = typ;
            return (B)this;
        }
    }

    /**
     * Builder for new Function instances.
     *
     * @author Timm Felden
     */
    public static class B60<T extends tyr.tooling.sdk.ast.Function, B extends B60<T, B>> extends B15<T, B> {

        protected B60(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B CTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams) {
            self.CTParams = CTParams;
            return (B)this;
        }

        public final B returnType(tyr.tooling.sdk.ast.Expression returnType) {
            self.returnType = returnType;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B realization(tyr.tooling.sdk.ast.FunctionRealization realization) {
            self.realization = realization;
            return (B)this;
        }

        public final B kind(tyr.tooling.sdk.ast.Kind kind) {
            self.kind = ((OGFile)p.owner()).Kind.proxy(kind);
            return (B)this;
        }

        public final B kind(EnumProxy<tyr.tooling.sdk.ast.Kind> kind) {
            self.kind = kind;
            return (B)this;
        }

        public final B RTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> RTParams) {
            self.RTParams = RTParams;
            return (B)this;
        }
    }

    /**
     * Builder for new Destructor instances.
     *
     * @author Timm Felden
     */
    public static class B61<T extends tyr.tooling.sdk.ast.Destructor, B extends B61<T, B>> extends B15<T, B> {

        protected B61(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Block body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new Constructor instances.
     *
     * @author Timm Felden
     */
    public static class B62<T extends tyr.tooling.sdk.ast.Constructor, B extends B62<T, B>> extends B15<T, B> {

        protected B62(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B CTParams(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> CTParams) {
            self.CTParams = CTParams;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B RTParams(java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> RTParams) {
            self.RTParams = RTParams;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Block body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new GlobalDestructor instances.
     *
     * @author Timm Felden
     */
    public static class B63<T extends tyr.tooling.sdk.ast.GlobalDestructor, B extends B63<T, B>> extends B15<T, B> {

        protected B63(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B isClass(boolean isClass) {
            self.isClass = isClass;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Block body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new GlobalInitializer instances.
     *
     * @author Timm Felden
     */
    public static class B64<T extends tyr.tooling.sdk.ast.GlobalInitializer, B extends B64<T, B>> extends B15<T, B> {

        protected B64(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B isClass(boolean isClass) {
            self.isClass = isClass;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B body(tyr.tooling.sdk.ast.Block body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new EnumInstance instances.
     *
     * @author Timm Felden
     */
    public static class B16<T extends tyr.tooling.sdk.ast.EnumInstance, B extends B16<T, B>> extends B1<T, B> {

        protected B16(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B initializer(tyr.tooling.sdk.ast.Expression initializer) {
            self.initializer = initializer;
            return (B)this;
        }
    }

    /**
     * Builder for new TopLevelNode instances.
     *
     * @author Timm Felden
     */
    public static class B17<T extends tyr.tooling.sdk.ast.TopLevelNode, B extends B17<T, B>> extends B1<T, B> {

        protected B17(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B declarations(java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> declarations) {
            self.declarations = declarations;
            return (B)this;
        }

        public final B doc(tyr.tooling.sdk.ast.DocComment doc) {
            self.doc = doc;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B visibility(tyr.tooling.sdk.ast.Visibility visibility) {
            self.visibility = visibility;
            return (B)this;
        }
    }

    /**
     * Builder for new AliasDef instances.
     *
     * @author Timm Felden
     */
    public static class B65<T extends tyr.tooling.sdk.ast.AliasDef, B extends B65<T, B>> extends B17<T, B> {

        protected B65(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B target(tyr.tooling.sdk.ast.Expression target) {
            self.target = target;
            return (B)this;
        }
    }

    /**
     * Builder for new TypeLike instances.
     *
     * @author Timm Felden
     */
    public static class B66<T extends tyr.tooling.sdk.ast.TypeLike, B extends B66<T, B>> extends B17<T, B> {

        protected B66(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B imports(java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> imports) {
            self.imports = imports;
            return (B)this;
        }

        public final B params(java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> params) {
            self.params = params;
            return (B)this;
        }

        public final B extensions(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> extensions) {
            self.extensions = extensions;
            return (B)this;
        }
    }

    /**
     * Builder for new EnumDef instances.
     *
     * @author Timm Felden
     */
    public static class B67<T extends tyr.tooling.sdk.ast.EnumDef, B extends B67<T, B>> extends B66<T, B> {

        protected B67(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B instances(java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> instances) {
            self.instances = instances;
            return (B)this;
        }
    }

    /**
     * Builder for new EnumUnionDef instances.
     *
     * @author Timm Felden
     */
    public static class B69<T extends tyr.tooling.sdk.ast.EnumUnionDef, B extends B69<T, B>> extends B66<T, B> {

        protected B69(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B others(tyr.tooling.sdk.ast.Expression others) {
            self.others = others;
            return (B)this;
        }

        public final B cases(java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> cases) {
            self.cases = cases;
            return (B)this;
        }
    }

    /**
     * Builder for new TypeWithMembers instances.
     *
     * @author Timm Felden
     */
    public static class B70<T extends tyr.tooling.sdk.ast.TypeWithMembers, B extends B70<T, B>> extends B66<T, B> {

        protected B70(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B members(java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> members) {
            self.members = members;
            return (B)this;
        }

        public final B flat(boolean flat) {
            self.flat = flat;
            return (B)this;
        }
    }

    /**
     * Builder for new FormalParameter instances.
     *
     * @author Timm Felden
     */
    public static class B18<T extends tyr.tooling.sdk.ast.FormalParameter, B extends B18<T, B>> extends B1<T, B> {

        protected B18(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B Zdefault(tyr.tooling.sdk.ast.Expression Zdefault) {
            self.Zdefault = Zdefault;
            return (B)this;
        }

        public final B varArg(boolean varArg) {
            self.varArg = varArg;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B properties(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> properties) {
            self.properties = properties;
            return (B)this;
        }

        public final B typ(tyr.tooling.sdk.ast.Expression typ) {
            self.typ = typ;
            return (B)this;
        }
    }

    /**
     * Builder for new FormalCTParameter instances.
     *
     * @author Timm Felden
     */
    public static class B74<T extends tyr.tooling.sdk.ast.FormalCTParameter, B extends B74<T, B>> extends B18<T, B> {

        protected B74(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B variance(tyr.tooling.sdk.ast.Variance variance) {
            self.variance = ((OGFile)p.owner()).Variance.proxy(variance);
            return (B)this;
        }

        public final B variance(EnumProxy<tyr.tooling.sdk.ast.Variance> variance) {
            self.variance = variance;
            return (B)this;
        }

        public final B raw(tyr.tooling.sdk.ast.Expression raw) {
            self.raw = raw;
            return (B)this;
        }
    }

    /**
     * Builder for new ConstructorParameter instances.
     *
     * @author Timm Felden
     */
    public static class B75<T extends tyr.tooling.sdk.ast.ConstructorParameter, B extends B75<T, B>> extends B18<T, B> {

        protected B75(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B initializes(java.lang.String initializes) {
            self.initializes = initializes;
            return (B)this;
        }
    }

    /**
     * Builder for new FunctionBody instances.
     *
     * @author Timm Felden
     */
    public static class B76<T extends tyr.tooling.sdk.ast.FunctionBody, B extends B76<T, B>> extends B1<T, B> {

        protected B76(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B body(tyr.tooling.sdk.ast.Expression body) {
            self.body = body;
            return (B)this;
        }
    }

    /**
     * Builder for new ExternFunction instances.
     *
     * @author Timm Felden
     */
    public static class B77<T extends tyr.tooling.sdk.ast.ExternFunction, B extends B77<T, B>> extends B1<T, B> {

        protected B77(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B source(tyr.tooling.sdk.ast.Expression source) {
            self.source = source;
            return (B)this;
        }
    }

    /**
     * Builder for new FunctionAssignment instances.
     *
     * @author Timm Felden
     */
    public static class B79<T extends tyr.tooling.sdk.ast.FunctionAssignment, B extends B79<T, B>> extends B1<T, B> {

        protected B79(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B source(tyr.tooling.sdk.ast.Expression source) {
            self.source = source;
            return (B)this;
        }
    }

    /**
     * Builder for new DocTag instances.
     *
     * @author Timm Felden
     */
    public static class B2<T extends tyr.tooling.sdk.ast.DocTag, B extends B2<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B2(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B content(java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> content) {
            self.content = content;
            return (B)this;
        }

        public final B name(java.lang.String name) {
            self.name = name;
            return (B)this;
        }

        public final B words(java.util.ArrayList<java.lang.String> words) {
            self.words = words;
            return (B)this;
        }
    }

    /**
     * Builder for new Message instances.
     *
     * @author Timm Felden
     */
    public static class B3<T extends tyr.tooling.sdk.ast.Message, B extends B3<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B3(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B pos(tyr.tooling.sdk.ast.Position pos) {
            self.pos = pos;
            return (B)this;
        }

        public final B category(java.lang.String category) {
            self.category = category;
            return (B)this;
        }

        public final B severity(tyr.tooling.sdk.ast.Severity severity) {
            self.severity = ((OGFile)p.owner()).Severity.proxy(severity);
            return (B)this;
        }

        public final B severity(EnumProxy<tyr.tooling.sdk.ast.Severity> severity) {
            self.severity = severity;
            return (B)this;
        }

        public final B text(java.lang.String text) {
            self.text = text;
            return (B)this;
        }
    }

    /**
     * Builder for new Position instances.
     *
     * @author Timm Felden
     */
    public static class B5<T extends tyr.tooling.sdk.ast.Position, B extends B5<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B5(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B endLine(long endLine) {
            self.endLine = endLine;
            return (B)this;
        }

        public final B beginColumn(long beginColumn) {
            self.beginColumn = beginColumn;
            return (B)this;
        }

        public final B beginLine(long beginLine) {
            self.beginLine = beginLine;
            return (B)this;
        }

        public final B file(tyr.tooling.sdk.ast.File file) {
            self.file = file;
            return (B)this;
        }

        public final B endColumn(long endColumn) {
            self.endColumn = endColumn;
            return (B)this;
        }
    }

    /**
     * Builder for new Visibility instances.
     *
     * @author Timm Felden
     */
    public static class B6<T extends tyr.tooling.sdk.ast.Visibility, B extends B6<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B6(Pool<T> pool, T self) {
            super(pool, self);
        }
    }

    /**
     * Builder for new OverrideVisible instances.
     *
     * @author Timm Felden
     */
    public static class B82<T extends tyr.tooling.sdk.ast.OverrideVisible, B extends B82<T, B>> extends B6<T, B> {

        protected B82(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B targets(java.util.ArrayList<tyr.tooling.sdk.ast.Expression> targets) {
            self.targets = targets;
            return (B)this;
        }
    }

    /**
     * Builder for new RestrictedVisible instances.
     *
     * @author Timm Felden
     */
    public static class B83<T extends tyr.tooling.sdk.ast.RestrictedVisible, B extends B83<T, B>> extends B6<T, B> {

        protected B83(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B isPrivate(boolean isPrivate) {
            self.isPrivate = isPrivate;
            return (B)this;
        }

        public final B isProtected(boolean isProtected) {
            self.isProtected = isProtected;
            return (B)this;
        }

        public final B Zprivate(tyr.tooling.sdk.ast.Expression Zprivate) {
            self.Zprivate = Zprivate;
            return (B)this;
        }

        public final B Zprotected(tyr.tooling.sdk.ast.Expression Zprotected) {
            self.Zprotected = Zprotected;
            return (B)this;
        }
    }

    /**
     * Builder for new DocParagraph instances.
     *
     * @author Timm Felden
     */
    public static class B7<T extends tyr.tooling.sdk.ast.DocParagraph, B extends B7<T, B>> extends ogss.common.java.internal.Builder<T> {

        protected B7(Pool<T> pool, T self) {
            super(pool, self);
        }

        public final B words(java.util.ArrayList<java.lang.String> words) {
            self.words = words;
            return (B)this;
        }
    }

/**
 * String File.Name
 */
public static final class f0 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.File> implements KnownField {

    f0(FieldType<java.lang.String> type, int ID, P0 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P0) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.File)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P0) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.File)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.File) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.File) ref).name = value;
    }
}

/**
 * File File.Parent
 */
public static final class f1 extends FieldDeclaration<tyr.tooling.sdk.ast.File, tyr.tooling.sdk.ast.File> implements KnownField {

    f1(FieldType<tyr.tooling.sdk.ast.File> type, int ID, P0 owner) {
        super(type, "Parent", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P0) owner).data();
        final P0 t = ((P0) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.File)d[i]).parent = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P0) owner).data();
        final P0 t = ((P0) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.File v = ((tyr.tooling.sdk.ast.File)d[i]).parent;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.File get(Obj ref) {
        return ((tyr.tooling.sdk.ast.File) ref).parent;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.File value) {
        ((tyr.tooling.sdk.ast.File) ref).parent = value;
    }
}

/**
 * Position Node.Pos
 */
public static final class f2 extends FieldDeclaration<tyr.tooling.sdk.ast.Position, tyr.tooling.sdk.ast.Node> implements KnownField {

    f2(FieldType<tyr.tooling.sdk.ast.Position> type, int ID, P1 owner) {
        super(type, "Pos", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Node)d[i]).pos = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Position v = ((tyr.tooling.sdk.ast.Node)d[i]).pos;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Position get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Node) ref).pos;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Position value) {
        ((tyr.tooling.sdk.ast.Node) ref).pos = value;
    }
}

/**
 * Node Node.Parent
 */
public static final class f3 extends FieldDeclaration<tyr.tooling.sdk.ast.Node, tyr.tooling.sdk.ast.Node> implements KnownField {

    f3(FieldType<tyr.tooling.sdk.ast.Node> type, int ID, P1 owner) {
        super(type, "Parent", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner).data();
        final P1 t = ((P1) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Node)d[i]).parent = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner).data();
        final P1 t = ((P1) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Node v = ((tyr.tooling.sdk.ast.Node)d[i]).parent;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Node get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Node) ref).parent;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Node value) {
        ((tyr.tooling.sdk.ast.Node) ref).parent = value;
    }
}

/**
 * TopLevelNode[] FileNode.Defs
 */
public static final class f4 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode>, tyr.tooling.sdk.ast.FileNode> implements KnownField {

    f4(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode>> type, int ID, P8 owner) {
        super(type, "Defs", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TopLevelNode> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TopLevelNode>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FileNode)d[i]).defs = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TopLevelNode> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TopLevelNode>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FileNode)d[i]).defs, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FileNode) ref).defs;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.TopLevelNode> value) {
        ((tyr.tooling.sdk.ast.FileNode) ref).defs = value;
    }
}

/**
 * ImportExpression[] FileNode.Imports
 */
public static final class f5 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression>, tyr.tooling.sdk.ast.FileNode> implements KnownField {

    f5(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression>> type, int ID, P8 owner) {
        super(type, "Imports", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FileNode)d[i]).imports = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FileNode)d[i]).imports, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FileNode) ref).imports;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> value) {
        ((tyr.tooling.sdk.ast.FileNode) ref).imports = value;
    }
}

/**
 * String ExtEntity.Name
 */
public static final class f6 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.ExtEntity> implements KnownField {

    f6(FieldType<java.lang.String> type, int ID, P9 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ExtEntity)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.ExtEntity)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ExtEntity) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.ExtEntity) ref).name = value;
    }
}

/**
 * String ExtEntity.Package
 */
public static final class f7 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.ExtEntity> implements KnownField {

    f7(FieldType<java.lang.String> type, int ID, P9 owner) {
        super(type, "Package", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ExtEntity)d[i]).Zpackage = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.ExtEntity)d[i]).Zpackage, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ExtEntity) ref).Zpackage;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.ExtEntity) ref).Zpackage = value;
    }
}

/**
 * String Namespace.Name
 */
public static final class f8 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Namespace> implements KnownField {

    f8(FieldType<java.lang.String> type, int ID, P10 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Namespace)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Namespace)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Namespace) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Namespace) ref).name = value;
    }
}

/**
 * Map<String,Namespace> Namespace.Subspace
 */
public static final class f9 extends AutoField<java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace>, tyr.tooling.sdk.ast.Namespace> {

    f9(FieldType<java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace>> type, P10 owner) {
        super(type, "Subspace", -1, owner);
    }

    @Override
    public java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Namespace) ref).subspace;
    }

    @Override
    public void set(Obj ref, java.util.HashMap<java.lang.String, tyr.tooling.sdk.ast.Namespace> value) {
        ((tyr.tooling.sdk.ast.Namespace) ref).subspace = value;
    }
}

/**
 * Node[] Namespace.Declarations
 */
public static final class f10 extends AutoField<java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember>, tyr.tooling.sdk.ast.Namespace> {

    f10(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember>> type, P10 owner) {
        super(type, "Declarations", -2, owner);
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Namespace) ref).declarations;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> value) {
        ((tyr.tooling.sdk.ast.Namespace) ref).declarations = value;
    }
}

/**
 * String Parameter.Name
 */
public static final class f11 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Parameter> implements KnownField {

    f11(FieldType<java.lang.String> type, int ID, P11 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Parameter)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Parameter)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Parameter) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Parameter) ref).name = value;
    }
}

/**
 * Expression ValueParameter.Value
 */
public static final class f12 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ValueParameter> implements KnownField {

    f12(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P21 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ValueParameter)d[i]).value = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ValueParameter)d[i]).value;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ValueParameter) ref).value;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ValueParameter) ref).value = value;
    }
}

/**
 * DocTag[] DocComment.Tags
 */
public static final class f13 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.DocTag>, tyr.tooling.sdk.ast.DocComment> implements KnownField {

    f13(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.DocTag>> type, int ID, P12 owner) {
        super(type, "Tags", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocTag> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocTag>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocComment)d[i]).tags = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocTag> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocTag>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.DocComment)d[i]).tags, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocComment) ref).tags;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.DocTag> value) {
        ((tyr.tooling.sdk.ast.DocComment) ref).tags = value;
    }
}

/**
 * DocParagraph[] DocComment.Details
 */
public static final class f14 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph>, tyr.tooling.sdk.ast.DocComment> implements KnownField {

    f14(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph>> type, int ID, P12 owner) {
        super(type, "Details", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocComment)d[i]).details = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.DocComment)d[i]).details, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocComment) ref).details;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> value) {
        ((tyr.tooling.sdk.ast.DocComment) ref).details = value;
    }
}

/**
 * Expression Expression.ET
 */
public static final class f15 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Expression> implements KnownField {

    f15(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P13 owner) {
        super(type, "ET", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Expression)d[i]).ET = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Expression)d[i]).ET;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Expression) ref).ET;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Expression) ref).ET = value;
    }
}

/**
 * Node Expression.Definition
 */
public static final class f16 extends FieldDeclaration<tyr.tooling.sdk.ast.NamedMember, tyr.tooling.sdk.ast.Expression> implements KnownField {

    f16(FieldType<tyr.tooling.sdk.ast.NamedMember> type, int ID, P13 owner) {
        super(type, "Definition", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P1 t = (P1)
                FieldDeclaration.<tyr.tooling.sdk.ast.Node,tyr.tooling.sdk.ast.NamedMember>cast(type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Expression)d[i]).definition = (tyr.tooling.sdk.ast.NamedMember) t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P1 t = (P1)
                FieldDeclaration.<tyr.tooling.sdk.ast.Node,tyr.tooling.sdk.ast.NamedMember>cast(type);
        for (; i != h; i++) {
            Obj v = (Obj)((tyr.tooling.sdk.ast.Expression)d[i]).definition;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.NamedMember get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Expression) ref).definition;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.NamedMember value) {
        ((tyr.tooling.sdk.ast.Expression) ref).definition = value;
    }
}

/**
 * String Expression.PrettyType
 */
public static final class f17 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Expression> implements KnownField {

    f17(FieldType<java.lang.String> type, int ID, P13 owner) {
        super(type, "PrettyType", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Expression)d[i]).prettyType = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Expression)d[i]).prettyType, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Expression) ref).prettyType;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Expression) ref).prettyType = value;
    }
}

/**
 * Expression[] Block.Statements
 */
public static final class f18 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Block> implements KnownField {

    f18(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P22 owner) {
        super(type, "Statements", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Block)d[i]).statements = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Block)d[i]).statements, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Block) ref).statements;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Block) ref).statements = value;
    }
}

/**
 * I32 IntLiteral.Size
 */
public static final class f19 extends FieldDeclaration<java.lang.Integer, tyr.tooling.sdk.ast.IntLiteral> implements KnownField {

    f19(FieldType<java.lang.Integer> type, int ID, P41 owner) {
        super(type, "Size", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IntLiteral)d[i]).size = in.i32();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            int v=((tyr.tooling.sdk.ast.IntLiteral)d[i]).size;drop&=0==v;out.i32(v);
        }

        return drop;
    }

    @Override
    public java.lang.Integer get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IntLiteral) ref).size;
    }

    @Override
    public void set(Obj ref, java.lang.Integer value) {
        ((tyr.tooling.sdk.ast.IntLiteral) ref).size = value;
    }
}

/**
 * String IntLiteral.Image
 */
public static final class f20 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.IntLiteral> implements KnownField {

    f20(FieldType<java.lang.String> type, int ID, P41 owner) {
        super(type, "Image", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IntLiteral)d[i]).image = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.IntLiteral)d[i]).image, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IntLiteral) ref).image;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.IntLiteral) ref).image = value;
    }
}

/**
 * I64 IntLiteral.Value
 */
public static final class f21 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.IntLiteral> implements KnownField {

    f21(FieldType<java.lang.Long> type, int ID, P41 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IntLiteral)d[i]).value = in.i64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.IntLiteral)d[i]).value;drop&=0==v;out.i64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IntLiteral) ref).value;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.IntLiteral) ref).value = value;
    }
}

/**
 * Bool IntLiteral.Signed
 */
public static final class f22 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.IntLiteral> implements KnownField {

    f22(FieldType<java.lang.Boolean> type, int ID, P41 owner) {
        super(type, "Signed", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IntLiteral)d[i]).signed = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.IntLiteral)d[i]).signed;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IntLiteral) ref).signed;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.IntLiteral) ref).signed = value;
    }
}

/**
 * Bool BoolLiteral.Value
 */
public static final class f23 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.BoolLiteral> implements KnownField {

    f23(FieldType<java.lang.Boolean> type, int ID, P42 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BoolLiteral)d[i]).value = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.BoolLiteral)d[i]).value;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BoolLiteral) ref).value;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.BoolLiteral) ref).value = value;
    }
}

/**
 * V64 CharLiteral.Value
 */
public static final class f24 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.CharLiteral> implements KnownField {

    f24(FieldType<java.lang.Long> type, int ID, P43 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.CharLiteral)d[i]).value = in.v64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.CharLiteral)d[i]).value;drop&=0==v;out.v64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.CharLiteral) ref).value;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.CharLiteral) ref).value = value;
    }
}

/**
 * I32 FloatLiteral.Size
 */
public static final class f25 extends FieldDeclaration<java.lang.Integer, tyr.tooling.sdk.ast.FloatLiteral> implements KnownField {

    f25(FieldType<java.lang.Integer> type, int ID, P45 owner) {
        super(type, "Size", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FloatLiteral)d[i]).size = in.i32();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            int v=((tyr.tooling.sdk.ast.FloatLiteral)d[i]).size;drop&=0==v;out.i32(v);
        }

        return drop;
    }

    @Override
    public java.lang.Integer get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FloatLiteral) ref).size;
    }

    @Override
    public void set(Obj ref, java.lang.Integer value) {
        ((tyr.tooling.sdk.ast.FloatLiteral) ref).size = value;
    }
}

/**
 * String FloatLiteral.Image
 */
public static final class f26 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.FloatLiteral> implements KnownField {

    f26(FieldType<java.lang.String> type, int ID, P45 owner) {
        super(type, "Image", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FloatLiteral)d[i]).image = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.FloatLiteral)d[i]).image, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FloatLiteral) ref).image;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.FloatLiteral) ref).image = value;
    }
}

/**
 * F64 FloatLiteral.Value
 */
public static final class f27 extends FieldDeclaration<java.lang.Double, tyr.tooling.sdk.ast.FloatLiteral> implements KnownField {

    f27(FieldType<java.lang.Double> type, int ID, P45 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FloatLiteral)d[i]).value = in.f64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            double v=((tyr.tooling.sdk.ast.FloatLiteral)d[i]).value;drop&=0==v;out.f64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Double get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FloatLiteral) ref).value;
    }

    @Override
    public void set(Obj ref, java.lang.Double value) {
        ((tyr.tooling.sdk.ast.FloatLiteral) ref).value = value;
    }
}

/**
 * String StringLiteral.Value
 */
public static final class f28 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.StringLiteral> implements KnownField {

    f28(FieldType<java.lang.String> type, int ID, P46 owner) {
        super(type, "Value", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.StringLiteral)d[i]).value = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.StringLiteral)d[i]).value, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.StringLiteral) ref).value;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.StringLiteral) ref).value = value;
    }
}

/**
 * Parameter[] Allocation.Args
 */
public static final class f29 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.Allocation> implements KnownField {

    f29(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P24 owner) {
        super(type, "Args", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Allocation)d[i]).args = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Allocation)d[i]).args, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Allocation) ref).args;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.Allocation) ref).args = value;
    }
}

/**
 * Parameter[] Allocation.First
 */
public static final class f30 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.Allocation> implements KnownField {

    f30(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P24 owner) {
        super(type, "First", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Allocation)d[i]).first = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Allocation)d[i]).first, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Allocation) ref).first;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.Allocation) ref).first = value;
    }
}

/**
 * Parameter[] Allocation.Second
 */
public static final class f31 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.Allocation> implements KnownField {

    f31(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P24 owner) {
        super(type, "Second", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Allocation)d[i]).second = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Allocation)d[i]).second, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Allocation) ref).second;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.Allocation) ref).second = value;
    }
}

/**
 * Expression Allocation.Target
 */
public static final class f32 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Allocation> implements KnownField {

    f32(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P24 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Allocation)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Allocation)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Allocation) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Allocation) ref).target = value;
    }
}

/**
 * Expression VariableDef.Typ
 */
public static final class f33 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.VariableDef> implements KnownField {

    f33(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P25 owner) {
        super(type, "Typ", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.VariableDef)d[i]).typ = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.VariableDef)d[i]).typ;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.VariableDef) ref).typ;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.VariableDef) ref).typ = value;
    }
}

/**
 * Expression VariableDef.Init
 */
public static final class f34 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.VariableDef> implements KnownField {

    f34(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P25 owner) {
        super(type, "Init", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.VariableDef)d[i]).init = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.VariableDef)d[i]).init;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.VariableDef) ref).init;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.VariableDef) ref).init = value;
    }
}

/**
 * String VariableDef.Name
 */
public static final class f35 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.VariableDef> implements KnownField {

    f35(FieldType<java.lang.String> type, int ID, P25 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.VariableDef)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.VariableDef)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.VariableDef) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.VariableDef) ref).name = value;
    }
}

/**
 * Storage VariableDef.Storage
 */
public static final class f36 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Storage>, tyr.tooling.sdk.ast.VariableDef> implements KnownField {

    f36(FieldType<EnumProxy<tyr.tooling.sdk.ast.Storage>> type, int ID, P25 owner) {
        super(type, "Storage", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.VariableDef)d[i]).storage = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.VariableDef)d[i]).storage, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Storage> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Storage>)((tyr.tooling.sdk.ast.VariableDef) ref).storage;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Storage> value) {
        ((tyr.tooling.sdk.ast.VariableDef) ref).storage = value;
    }
}

/**
 * Expression[] Deallocation.Target
 */
public static final class f37 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Deallocation> implements KnownField {

    f37(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P26 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Deallocation)d[i]).target = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Deallocation)d[i]).target, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Deallocation) ref).target;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Deallocation) ref).target = value;
    }
}

/**
 * FunctionTypeKind FunctionType.Kind
 */
public static final class f38 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>, tyr.tooling.sdk.ast.FunctionType> implements KnownField {

    f38(FieldType<EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>> type, int ID, P27 owner) {
        super(type, "Kind", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionType)d[i]).kind = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FunctionType)d[i]).kind, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind>)((tyr.tooling.sdk.ast.FunctionType) ref).kind;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.FunctionTypeKind> value) {
        ((tyr.tooling.sdk.ast.FunctionType) ref).kind = value;
    }
}

/**
 * Expression FunctionType.Result
 */
public static final class f39 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FunctionType> implements KnownField {

    f39(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P27 owner) {
        super(type, "Result", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionType)d[i]).result = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FunctionType)d[i]).result;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FunctionType) ref).result;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FunctionType) ref).result = value;
    }
}

/**
 * Parameter[] FunctionType.CtParams
 */
public static final class f40 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.FunctionType> implements KnownField {

    f40(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P27 owner) {
        super(type, "CtParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionType)d[i]).ctParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FunctionType)d[i]).ctParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FunctionType) ref).ctParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.FunctionType) ref).ctParams = value;
    }
}

/**
 * Parameter[] FunctionType.RtParams
 */
public static final class f41 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.FunctionType> implements KnownField {

    f41(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P27 owner) {
        super(type, "RtParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionType)d[i]).rtParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FunctionType)d[i]).rtParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FunctionType) ref).rtParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.FunctionType) ref).rtParams = value;
    }
}

/**
 * String MemberAccess.Name
 */
public static final class f42 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.MemberAccess> implements KnownField {

    f42(FieldType<java.lang.String> type, int ID, P28 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.MemberAccess)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.MemberAccess)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.MemberAccess) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.MemberAccess) ref).name = value;
    }
}

/**
 * Expression MemberAccess.Target
 */
public static final class f43 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.MemberAccess> implements KnownField {

    f43(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P28 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.MemberAccess)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.MemberAccess)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.MemberAccess) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.MemberAccess) ref).target = value;
    }
}

/**
 * String StaticAccess.Name
 */
public static final class f44 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.StaticAccess> implements KnownField {

    f44(FieldType<java.lang.String> type, int ID, P29 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.StaticAccess)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.StaticAccess)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.StaticAccess) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.StaticAccess) ref).name = value;
    }
}

/**
 * Parameter[] CTApplication.Params
 */
public static final class f45 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.CTApplication> implements KnownField {

    f45(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P30 owner) {
        super(type, "Params", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.CTApplication)d[i]).params = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.CTApplication)d[i]).params, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.CTApplication) ref).params;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.CTApplication) ref).params = value;
    }
}

/**
 * Expression CTApplication.Target
 */
public static final class f46 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.CTApplication> implements KnownField {

    f46(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P30 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.CTApplication)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.CTApplication)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.CTApplication) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.CTApplication) ref).target = value;
    }
}

/**
 * String OperatorUsage.Name
 */
public static final class f47 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.OperatorUsage> implements KnownField {

    f47(FieldType<java.lang.String> type, int ID, P31 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.OperatorUsage)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.OperatorUsage)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.OperatorUsage) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.OperatorUsage) ref).name = value;
    }
}

/**
 * Parameter[] RTApplication.Params
 */
public static final class f48 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.RTApplication> implements KnownField {

    f48(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P32 owner) {
        super(type, "Params", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RTApplication)d[i]).params = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.RTApplication)d[i]).params, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RTApplication) ref).params;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.RTApplication) ref).params = value;
    }
}

/**
 * Expression RTApplication.Target
 */
public static final class f49 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.RTApplication> implements KnownField {

    f49(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P32 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RTApplication)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.RTApplication)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RTApplication) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.RTApplication) ref).target = value;
    }
}

/**
 * String ImportExpression.Name
 */
public static final class f50 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.ImportExpression> implements KnownField {

    f50(FieldType<java.lang.String> type, int ID, P33 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ImportExpression)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.ImportExpression)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ImportExpression) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.ImportExpression) ref).name = value;
    }
}

/**
 * Expression ImportExpression.Target
 */
public static final class f51 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ImportExpression> implements KnownField {

    f51(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P33 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ImportExpression)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ImportExpression)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ImportExpression) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ImportExpression) ref).target = value;
    }
}

/**
 * Expression StaticTypeAccess.Target
 */
public static final class f52 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.StaticTypeAccess> implements KnownField {

    f52(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P34 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.StaticTypeAccess)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.StaticTypeAccess)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.StaticTypeAccess) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.StaticTypeAccess) ref).target = value;
    }
}

/**
 * Expression[] BinderApplication.Blocks
 */
public static final class f53 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.BinderApplication> implements KnownField {

    f53(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P35 owner) {
        super(type, "Blocks", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BinderApplication)d[i]).blocks = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.BinderApplication)d[i]).blocks, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BinderApplication) ref).blocks;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.BinderApplication) ref).blocks = value;
    }
}

/**
 * VariableDef[] BinderApplication.Locals
 */
public static final class f54 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef>, tyr.tooling.sdk.ast.BinderApplication> implements KnownField {

    f54(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef>> type, int ID, P35 owner) {
        super(type, "Locals", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.VariableDef> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.VariableDef>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BinderApplication)d[i]).locals = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.VariableDef> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.VariableDef>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.BinderApplication)d[i]).locals, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BinderApplication) ref).locals;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.VariableDef> value) {
        ((tyr.tooling.sdk.ast.BinderApplication) ref).locals = value;
    }
}

/**
 * Expression BinderApplication.Target
 */
public static final class f55 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.BinderApplication> implements KnownField {

    f55(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P35 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BinderApplication)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.BinderApplication)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BinderApplication) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.BinderApplication) ref).target = value;
    }
}

/**
 * Expression DynamicTypeAccess.Target
 */
public static final class f56 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.DynamicTypeAccess> implements KnownField {

    f56(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P36 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DynamicTypeAccess)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.DynamicTypeAccess)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DynamicTypeAccess) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.DynamicTypeAccess) ref).target = value;
    }
}

/**
 * String SwitchLike.GuardName
 */
public static final class f57 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.SwitchLike> implements KnownField {

    f57(FieldType<java.lang.String> type, int ID, P47 owner) {
        super(type, "GuardName", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchLike)d[i]).guardName = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.SwitchLike)d[i]).guardName, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchLike) ref).guardName;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.SwitchLike) ref).guardName = value;
    }
}

/**
 * Expression TryExpression.Body
 */
public static final class f58 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f58(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P54 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.TryExpression)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).body = value;
    }
}

/**
 * SwitchCase[] TryExpression.Cases
 */
public static final class f59 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase>, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f59(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase>> type, int ID, P54 owner) {
        super(type, "Cases", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).cases = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.TryExpression)d[i]).cases, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).cases;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).cases = value;
    }
}

/**
 * Expression TryExpression.Others
 */
public static final class f60 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f60(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P54 owner) {
        super(type, "Others", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).others = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.TryExpression)d[i]).others;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).others;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).others = value;
    }
}

/**
 * Expression TryExpression.Finally
 */
public static final class f61 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f61(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P54 owner) {
        super(type, "Finally", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).Zfinally = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.TryExpression)d[i]).Zfinally;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).Zfinally;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).Zfinally = value;
    }
}

/**
 * Position TryExpression.CatchPos
 */
public static final class f62 extends FieldDeclaration<tyr.tooling.sdk.ast.Position, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f62(FieldType<tyr.tooling.sdk.ast.Position> type, int ID, P54 owner) {
        super(type, "CatchPos", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).catchPos = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Position v = ((tyr.tooling.sdk.ast.TryExpression)d[i]).catchPos;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Position get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).catchPos;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Position value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).catchPos = value;
    }
}

/**
 * Position TryExpression.FinallyPos
 */
public static final class f63 extends FieldDeclaration<tyr.tooling.sdk.ast.Position, tyr.tooling.sdk.ast.TryExpression> implements KnownField {

    f63(FieldType<tyr.tooling.sdk.ast.Position> type, int ID, P54 owner) {
        super(type, "FinallyPos", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TryExpression)d[i]).finallyPos = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Position v = ((tyr.tooling.sdk.ast.TryExpression)d[i]).finallyPos;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Position get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TryExpression) ref).finallyPos;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Position value) {
        ((tyr.tooling.sdk.ast.TryExpression) ref).finallyPos = value;
    }
}

/**
 * Kind SwitchExpression.Kind
 */
public static final class f64 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Kind>, tyr.tooling.sdk.ast.SwitchExpression> implements KnownField {

    f64(FieldType<EnumProxy<tyr.tooling.sdk.ast.Kind>> type, int ID, P55 owner) {
        super(type, "Kind", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).kind = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SwitchExpression)d[i]).kind, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Kind> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Kind>)((tyr.tooling.sdk.ast.SwitchExpression) ref).kind;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Kind> value) {
        ((tyr.tooling.sdk.ast.SwitchExpression) ref).kind = value;
    }
}

/**
 * SwitchCase[] SwitchExpression.Cases
 */
public static final class f65 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase>, tyr.tooling.sdk.ast.SwitchExpression> implements KnownField {

    f65(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase>> type, int ID, P55 owner) {
        super(type, "Cases", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).cases = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.SwitchCase>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SwitchExpression)d[i]).cases, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchExpression) ref).cases;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.SwitchCase> value) {
        ((tyr.tooling.sdk.ast.SwitchExpression) ref).cases = value;
    }
}

/**
 * Expression SwitchExpression.Guard
 */
public static final class f66 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.SwitchExpression> implements KnownField {

    f66(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P55 owner) {
        super(type, "Guard", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).guard = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).guard;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchExpression) ref).guard;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.SwitchExpression) ref).guard = value;
    }
}

/**
 * Expression SwitchExpression.Others
 */
public static final class f67 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.SwitchExpression> implements KnownField {

    f67(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P55 owner) {
        super(type, "Others", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).others = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.SwitchExpression)d[i]).others;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchExpression) ref).others;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.SwitchExpression) ref).others = value;
    }
}

/**
 * Expression IfExpression.Eb
 */
public static final class f68 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.IfExpression> implements KnownField {

    f68(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P48 owner) {
        super(type, "Eb", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IfExpression)d[i]).eb = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.IfExpression)d[i]).eb;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IfExpression) ref).eb;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.IfExpression) ref).eb = value;
    }
}

/**
 * Expression IfExpression.Tb
 */
public static final class f69 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.IfExpression> implements KnownField {

    f69(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P48 owner) {
        super(type, "Tb", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IfExpression)d[i]).tb = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.IfExpression)d[i]).tb;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IfExpression) ref).tb;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.IfExpression) ref).tb = value;
    }
}

/**
 * Expression IfExpression.Guard
 */
public static final class f70 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.IfExpression> implements KnownField {

    f70(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P48 owner) {
        super(type, "Guard", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.IfExpression)d[i]).guard = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.IfExpression)d[i]).guard;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.IfExpression) ref).guard;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.IfExpression) ref).guard = value;
    }
}

/**
 * Expression BreakExpression.Result
 */
public static final class f71 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.BreakExpression> implements KnownField {

    f71(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P49 owner) {
        super(type, "Result", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BreakExpression)d[i]).result = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.BreakExpression)d[i]).result;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BreakExpression) ref).result;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.BreakExpression) ref).result = value;
    }
}

/**
 * Expression ThrowExpression.Target
 */
public static final class f72 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ThrowExpression> implements KnownField {

    f72(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P50 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ThrowExpression)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ThrowExpression)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ThrowExpression) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ThrowExpression) ref).target = value;
    }
}

/**
 * Expression ReturnExpression.Result
 */
public static final class f73 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ReturnExpression> implements KnownField {

    f73(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P51 owner) {
        super(type, "Result", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ReturnExpression)d[i]).result = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ReturnExpression)d[i]).result;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ReturnExpression) ref).result;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ReturnExpression) ref).result = value;
    }
}

/**
 * Expression ContinueExpression.Result
 */
public static final class f74 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ContinueExpression> implements KnownField {

    f74(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P52 owner) {
        super(type, "Result", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ContinueExpression)d[i]).result = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ContinueExpression)d[i]).result;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ContinueExpression) ref).result;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ContinueExpression) ref).result = value;
    }
}

/**
 * Expression BreakContinueTarget.Body
 */
public static final class f75 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.BreakContinueTarget> implements KnownField {

    f75(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P53 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.BreakContinueTarget)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.BreakContinueTarget)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.BreakContinueTarget) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.BreakContinueTarget) ref).body = value;
    }
}

/**
 * Expression WhileLoop.Guard
 */
public static final class f76 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.WhileLoop> implements KnownField {

    f76(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P56 owner) {
        super(type, "Guard", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.WhileLoop)d[i]).guard = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.WhileLoop)d[i]).guard;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.WhileLoop) ref).guard;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.WhileLoop) ref).guard = value;
    }
}

/**
 * Expression DoWhileLoop.Guard
 */
public static final class f77 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.DoWhileLoop> implements KnownField {

    f77(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P57 owner) {
        super(type, "Guard", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DoWhileLoop)d[i]).guard = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.DoWhileLoop)d[i]).guard;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DoWhileLoop) ref).guard;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.DoWhileLoop) ref).guard = value;
    }
}

/**
 * Expression[] OperatorApplication.Targets
 */
public static final class f78 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.OperatorApplication> implements KnownField {

    f78(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P38 owner) {
        super(type, "Targets", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.OperatorApplication)d[i]).targets = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.OperatorApplication)d[i]).targets, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.OperatorApplication) ref).targets;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.OperatorApplication) ref).targets = value;
    }
}

/**
 * Expression SuperDestructorCall.Target
 */
public static final class f79 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.SuperDestructorCall> implements KnownField {

    f79(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P39 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SuperDestructorCall)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.SuperDestructorCall)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SuperDestructorCall) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.SuperDestructorCall) ref).target = value;
    }
}

/**
 * Parameter[] SuperConstructorCall.Args
 */
public static final class f80 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.SuperConstructorCall> implements KnownField {

    f80(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P40 owner) {
        super(type, "Args", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).args = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).args, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).args;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).args = value;
    }
}

/**
 * Parameter[] SuperConstructorCall.First
 */
public static final class f81 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.SuperConstructorCall> implements KnownField {

    f81(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P40 owner) {
        super(type, "First", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).first = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).first, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).first;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).first = value;
    }
}

/**
 * Parameter[] SuperConstructorCall.Second
 */
public static final class f82 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>, tyr.tooling.sdk.ast.SuperConstructorCall> implements KnownField {

    f82(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Parameter>> type, int ID, P40 owner) {
        super(type, "Second", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).second = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Parameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).second, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).second;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Parameter> value) {
        ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).second = value;
    }
}

/**
 * Expression SuperConstructorCall.Target
 */
public static final class f83 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.SuperConstructorCall> implements KnownField {

    f83(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P40 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.SuperConstructorCall)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.SuperConstructorCall) ref).target = value;
    }
}

/**
 * Expression SwitchCase.Body
 */
public static final class f84 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.SwitchCase> implements KnownField {

    f84(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P14 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchCase)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.SwitchCase)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchCase) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.SwitchCase) ref).body = value;
    }
}

/**
 * Expression[] SwitchCase.Labels
 */
public static final class f85 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.SwitchCase> implements KnownField {

    f85(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P14 owner) {
        super(type, "Labels", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.SwitchCase)d[i]).labels = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.SwitchCase)d[i]).labels, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.SwitchCase) ref).labels;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.SwitchCase) ref).labels = value;
    }
}

/**
 * DocComment TypeMember.Doc
 */
public static final class f86 extends FieldDeclaration<tyr.tooling.sdk.ast.DocComment, tyr.tooling.sdk.ast.TypeMember> implements KnownField {

    f86(FieldType<tyr.tooling.sdk.ast.DocComment> type, int ID, P15 owner) {
        super(type, "Doc", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P12 t = ((P12) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeMember)d[i]).doc = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P12 t = ((P12) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.DocComment v = ((tyr.tooling.sdk.ast.TypeMember)d[i]).doc;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.DocComment get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeMember) ref).doc;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.DocComment value) {
        ((tyr.tooling.sdk.ast.TypeMember) ref).doc = value;
    }
}

/**
 * String TypeMember.Name
 */
public static final class f87 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.TypeMember> implements KnownField {

    f87(FieldType<java.lang.String> type, int ID, P15 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeMember)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.TypeMember)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeMember) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.TypeMember) ref).name = value;
    }
}

/**
 * Visibility TypeMember.Visibility
 */
public static final class f88 extends FieldDeclaration<tyr.tooling.sdk.ast.Visibility, tyr.tooling.sdk.ast.TypeMember> implements KnownField {

    f88(FieldType<tyr.tooling.sdk.ast.Visibility> type, int ID, P15 owner) {
        super(type, "Visibility", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P6 t = ((P6) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeMember)d[i]).visibility = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P6 t = ((P6) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Visibility v = ((tyr.tooling.sdk.ast.TypeMember)d[i]).visibility;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Visibility get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeMember) ref).visibility;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Visibility value) {
        ((tyr.tooling.sdk.ast.TypeMember) ref).visibility = value;
    }
}

/**
 * Block Test.Body
 */
public static final class f89 extends FieldDeclaration<tyr.tooling.sdk.ast.Block, tyr.tooling.sdk.ast.Test> implements KnownField {

    f89(FieldType<tyr.tooling.sdk.ast.Block> type, int ID, P58 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Test)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Block v = ((tyr.tooling.sdk.ast.Test)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Block get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Test) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Block value) {
        ((tyr.tooling.sdk.ast.Test) ref).body = value;
    }
}

/**
 * String Test.Category
 */
public static final class f90 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Test> implements KnownField {

    f90(FieldType<java.lang.String> type, int ID, P58 owner) {
        super(type, "Category", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Test)d[i]).category = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Test)d[i]).category, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Test) ref).category;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Test) ref).category = value;
    }
}

/**
 * String[] Test.CategoryParams
 */
public static final class f91 extends FieldDeclaration<java.util.ArrayList<java.lang.String>, tyr.tooling.sdk.ast.Test> implements KnownField {

    f91(FieldType<java.util.ArrayList<java.lang.String>> type, int ID, P58 owner) {
        super(type, "CategoryParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Test)d[i]).categoryParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Test)d[i]).categoryParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<java.lang.String> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Test) ref).categoryParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<java.lang.String> value) {
        ((tyr.tooling.sdk.ast.Test) ref).categoryParams = value;
    }
}

/**
 * Expression Field.Typ
 */
public static final class f92 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Field> implements KnownField {

    f92(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P59 owner) {
        super(type, "Typ", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).typ = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Field)d[i]).typ;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Field) ref).typ;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Field) ref).typ = value;
    }
}

/**
 * Expression Field.Init
 */
public static final class f93 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Field> implements KnownField {

    f93(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P59 owner) {
        super(type, "Init", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).init = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Field)d[i]).init;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Field) ref).init;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Field) ref).init = value;
    }
}

/**
 * Kind Field.Kind
 */
public static final class f94 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Kind>, tyr.tooling.sdk.ast.Field> implements KnownField {

    f94(FieldType<EnumProxy<tyr.tooling.sdk.ast.Kind>> type, int ID, P59 owner) {
        super(type, "Kind", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).kind = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Field)d[i]).kind, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Kind> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Kind>)((tyr.tooling.sdk.ast.Field) ref).kind;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Kind> value) {
        ((tyr.tooling.sdk.ast.Field) ref).kind = value;
    }
}

/**
 * Expression Field.Extern
 */
public static final class f95 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Field> implements KnownField {

    f95(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P59 owner) {
        super(type, "Extern", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).extern = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Field)d[i]).extern;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Field) ref).extern;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Field) ref).extern = value;
    }
}

/**
 * Storage Field.Storage
 */
public static final class f96 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Storage>, tyr.tooling.sdk.ast.Field> implements KnownField {

    f96(FieldType<EnumProxy<tyr.tooling.sdk.ast.Storage>> type, int ID, P59 owner) {
        super(type, "Storage", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).storage = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Field)d[i]).storage, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Storage> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Storage>)((tyr.tooling.sdk.ast.Field) ref).storage;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Storage> value) {
        ((tyr.tooling.sdk.ast.Field) ref).storage = value;
    }
}

/**
 * Expression[] Field.Properties
 */
public static final class f97 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Field> implements KnownField {

    f97(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P59 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Field)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Field)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Field) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Field) ref).properties = value;
    }
}

/**
 * Kind Function.Kind
 */
public static final class f98 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Kind>, tyr.tooling.sdk.ast.Function> implements KnownField {

    f98(FieldType<EnumProxy<tyr.tooling.sdk.ast.Kind>> type, int ID, P60 owner) {
        super(type, "Kind", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).kind = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Function)d[i]).kind, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Kind> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Kind>)((tyr.tooling.sdk.ast.Function) ref).kind;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Kind> value) {
        ((tyr.tooling.sdk.ast.Function) ref).kind = value;
    }
}

/**
 * FormalCTParameter[] Function.CTParams
 */
public static final class f99 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>, tyr.tooling.sdk.ast.Function> implements KnownField {

    f99(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>> type, int ID, P60 owner) {
        super(type, "CTParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).CTParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Function)d[i]).CTParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Function) ref).CTParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> value) {
        ((tyr.tooling.sdk.ast.Function) ref).CTParams = value;
    }
}

/**
 * FormalParameter[] Function.RTParams
 */
public static final class f100 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter>, tyr.tooling.sdk.ast.Function> implements KnownField {

    f100(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter>> type, int ID, P60 owner) {
        super(type, "RTParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalParameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).RTParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalParameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Function)d[i]).RTParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Function) ref).RTParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.FormalParameter> value) {
        ((tyr.tooling.sdk.ast.Function) ref).RTParams = value;
    }
}

/**
 * Expression[] Function.Properties
 */
public static final class f101 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Function> implements KnownField {

    f101(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P60 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Function)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Function) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Function) ref).properties = value;
    }
}

/**
 * Expression Function.ReturnType
 */
public static final class f102 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.Function> implements KnownField {

    f102(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P60 owner) {
        super(type, "ReturnType", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).returnType = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.Function)d[i]).returnType;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Function) ref).returnType;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.Function) ref).returnType = value;
    }
}

/**
 * FunctionRealization Function.Realization
 */
public static final class f103 extends FieldDeclaration<tyr.tooling.sdk.ast.FunctionRealization, tyr.tooling.sdk.ast.Function> implements KnownField {

    f103(FieldType<tyr.tooling.sdk.ast.FunctionRealization> type, int ID, P60 owner) {
        super(type, "Realization", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P19 t = ((P19) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Function)d[i]).realization = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P19 t = ((P19) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.FunctionRealization v = ((tyr.tooling.sdk.ast.Function)d[i]).realization;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.FunctionRealization get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Function) ref).realization;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.FunctionRealization value) {
        ((tyr.tooling.sdk.ast.Function) ref).realization = value;
    }
}

/**
 * Block Destructor.Body
 */
public static final class f104 extends FieldDeclaration<tyr.tooling.sdk.ast.Block, tyr.tooling.sdk.ast.Destructor> implements KnownField {

    f104(FieldType<tyr.tooling.sdk.ast.Block> type, int ID, P61 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Destructor)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Block v = ((tyr.tooling.sdk.ast.Destructor)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Block get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Destructor) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Block value) {
        ((tyr.tooling.sdk.ast.Destructor) ref).body = value;
    }
}

/**
 * Expression[] Destructor.Properties
 */
public static final class f105 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Destructor> implements KnownField {

    f105(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P61 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Destructor)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Destructor)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Destructor) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Destructor) ref).properties = value;
    }
}

/**
 * Block Constructor.Body
 */
public static final class f106 extends FieldDeclaration<tyr.tooling.sdk.ast.Block, tyr.tooling.sdk.ast.Constructor> implements KnownField {

    f106(FieldType<tyr.tooling.sdk.ast.Block> type, int ID, P62 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Constructor)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Block v = ((tyr.tooling.sdk.ast.Constructor)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Block get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Constructor) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Block value) {
        ((tyr.tooling.sdk.ast.Constructor) ref).body = value;
    }
}

/**
 * FormalCTParameter[] Constructor.CTParams
 */
public static final class f107 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>, tyr.tooling.sdk.ast.Constructor> implements KnownField {

    f107(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>> type, int ID, P62 owner) {
        super(type, "CTParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Constructor)d[i]).CTParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Constructor)d[i]).CTParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Constructor) ref).CTParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> value) {
        ((tyr.tooling.sdk.ast.Constructor) ref).CTParams = value;
    }
}

/**
 * ConstructorParameter[] Constructor.RTParams
 */
public static final class f108 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter>, tyr.tooling.sdk.ast.Constructor> implements KnownField {

    f108(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter>> type, int ID, P62 owner) {
        super(type, "RTParams", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ConstructorParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ConstructorParameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Constructor)d[i]).RTParams = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ConstructorParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ConstructorParameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Constructor)d[i]).RTParams, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Constructor) ref).RTParams;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.ConstructorParameter> value) {
        ((tyr.tooling.sdk.ast.Constructor) ref).RTParams = value;
    }
}

/**
 * Expression[] Constructor.Properties
 */
public static final class f109 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.Constructor> implements KnownField {

    f109(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P62 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Constructor)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Constructor)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Constructor) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.Constructor) ref).properties = value;
    }
}

/**
 * Block GlobalDestructor.Body
 */
public static final class f110 extends FieldDeclaration<tyr.tooling.sdk.ast.Block, tyr.tooling.sdk.ast.GlobalDestructor> implements KnownField {

    f110(FieldType<tyr.tooling.sdk.ast.Block> type, int ID, P63 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Block v = ((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Block get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalDestructor) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Block value) {
        ((tyr.tooling.sdk.ast.GlobalDestructor) ref).body = value;
    }
}

/**
 * Bool GlobalDestructor.IsClass
 */
public static final class f111 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.GlobalDestructor> implements KnownField {

    f111(FieldType<java.lang.Boolean> type, int ID, P63 owner) {
        super(type, "IsClass", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).isClass = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).isClass;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalDestructor) ref).isClass;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.GlobalDestructor) ref).isClass = value;
    }
}

/**
 * Expression[] GlobalDestructor.Properties
 */
public static final class f112 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.GlobalDestructor> implements KnownField {

    f112(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P63 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.GlobalDestructor)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalDestructor) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.GlobalDestructor) ref).properties = value;
    }
}

/**
 * Block GlobalInitializer.Body
 */
public static final class f113 extends FieldDeclaration<tyr.tooling.sdk.ast.Block, tyr.tooling.sdk.ast.GlobalInitializer> implements KnownField {

    f113(FieldType<tyr.tooling.sdk.ast.Block> type, int ID, P64 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P22 t = ((P22) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Block v = ((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Block get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalInitializer) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Block value) {
        ((tyr.tooling.sdk.ast.GlobalInitializer) ref).body = value;
    }
}

/**
 * Bool GlobalInitializer.IsClass
 */
public static final class f114 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.GlobalInitializer> implements KnownField {

    f114(FieldType<java.lang.Boolean> type, int ID, P64 owner) {
        super(type, "IsClass", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).isClass = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).isClass;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalInitializer) ref).isClass;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.GlobalInitializer) ref).isClass = value;
    }
}

/**
 * Expression[] GlobalInitializer.Properties
 */
public static final class f115 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.GlobalInitializer> implements KnownField {

    f115(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P64 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.GlobalInitializer)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.GlobalInitializer) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.GlobalInitializer) ref).properties = value;
    }
}

/**
 * String EnumInstance.Name
 */
public static final class f116 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.EnumInstance> implements KnownField {

    f116(FieldType<java.lang.String> type, int ID, P16 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.EnumInstance)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.EnumInstance)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.EnumInstance) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.EnumInstance) ref).name = value;
    }
}

/**
 * Expression EnumInstance.Initializer
 */
public static final class f117 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.EnumInstance> implements KnownField {

    f117(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P16 owner) {
        super(type, "Initializer", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.EnumInstance)d[i]).initializer = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.EnumInstance)d[i]).initializer;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.EnumInstance) ref).initializer;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.EnumInstance) ref).initializer = value;
    }
}

/**
 * DocComment TopLevelNode.Doc
 */
public static final class f118 extends FieldDeclaration<tyr.tooling.sdk.ast.DocComment, tyr.tooling.sdk.ast.TopLevelNode> implements KnownField {

    f118(FieldType<tyr.tooling.sdk.ast.DocComment> type, int ID, P17 owner) {
        super(type, "Doc", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P12 t = ((P12) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TopLevelNode)d[i]).doc = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P12 t = ((P12) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.DocComment v = ((tyr.tooling.sdk.ast.TopLevelNode)d[i]).doc;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.DocComment get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TopLevelNode) ref).doc;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.DocComment value) {
        ((tyr.tooling.sdk.ast.TopLevelNode) ref).doc = value;
    }
}

/**
 * String TopLevelNode.Name
 */
public static final class f119 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.TopLevelNode> implements KnownField {

    f119(FieldType<java.lang.String> type, int ID, P17 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TopLevelNode)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.TopLevelNode)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TopLevelNode) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.TopLevelNode) ref).name = value;
    }
}

/**
 * Visibility TopLevelNode.Visibility
 */
public static final class f120 extends FieldDeclaration<tyr.tooling.sdk.ast.Visibility, tyr.tooling.sdk.ast.TopLevelNode> implements KnownField {

    f120(FieldType<tyr.tooling.sdk.ast.Visibility> type, int ID, P17 owner) {
        super(type, "Visibility", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P6 t = ((P6) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TopLevelNode)d[i]).visibility = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P6 t = ((P6) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Visibility v = ((tyr.tooling.sdk.ast.TopLevelNode)d[i]).visibility;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Visibility get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TopLevelNode) ref).visibility;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Visibility value) {
        ((tyr.tooling.sdk.ast.TopLevelNode) ref).visibility = value;
    }
}

/**
 * Node[] TopLevelNode.Declarations
 */
public static final class f121 extends AutoField<java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember>, tyr.tooling.sdk.ast.TopLevelNode> {

    f121(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember>> type, P17 owner) {
        super(type, "Declarations", -1, owner);
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TopLevelNode) ref).declarations;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.ScopeMember> value) {
        ((tyr.tooling.sdk.ast.TopLevelNode) ref).declarations = value;
    }
}

/**
 * Expression AliasDef.Target
 */
public static final class f122 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.AliasDef> implements KnownField {

    f122(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P65 owner) {
        super(type, "Target", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.AliasDef)d[i]).target = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.AliasDef)d[i]).target;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.AliasDef) ref).target;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.AliasDef) ref).target = value;
    }
}

/**
 * FormalCTParameter[] TypeLike.Params
 */
public static final class f123 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>, tyr.tooling.sdk.ast.TypeLike> implements KnownField {

    f123(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter>> type, int ID, P66 owner) {
        super(type, "Params", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeLike)d[i]).params = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.FormalCTParameter>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.TypeLike)d[i]).params, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeLike) ref).params;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.FormalCTParameter> value) {
        ((tyr.tooling.sdk.ast.TypeLike) ref).params = value;
    }
}

/**
 * ImportExpression[] TypeLike.Imports
 */
public static final class f124 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression>, tyr.tooling.sdk.ast.TypeLike> implements KnownField {

    f124(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression>> type, int ID, P66 owner) {
        super(type, "Imports", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeLike)d[i]).imports = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.ImportExpression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.TypeLike)d[i]).imports, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeLike) ref).imports;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.ImportExpression> value) {
        ((tyr.tooling.sdk.ast.TypeLike) ref).imports = value;
    }
}

/**
 * Expression[] TypeLike.Extensions
 */
public static final class f125 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.TypeLike> implements KnownField {

    f125(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P66 owner) {
        super(type, "Extensions", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeLike)d[i]).extensions = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.TypeLike)d[i]).extensions, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeLike) ref).extensions;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.TypeLike) ref).extensions = value;
    }
}

/**
 * EnumInstance[] EnumDef.Instances
 */
public static final class f126 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance>, tyr.tooling.sdk.ast.EnumDef> implements KnownField {

    f126(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance>> type, int ID, P67 owner) {
        super(type, "Instances", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.EnumInstance> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.EnumInstance>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.EnumDef)d[i]).instances = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.EnumInstance> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.EnumInstance>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.EnumDef)d[i]).instances, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.EnumDef) ref).instances;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.EnumInstance> value) {
        ((tyr.tooling.sdk.ast.EnumDef) ref).instances = value;
    }
}

/**
 * Map<StaticAccess,Expression> EnumUnionDef.Cases
 */
public static final class f127 extends FieldDeclaration<java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.EnumUnionDef> implements KnownField {

    f127(FieldType<java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression>> type, int ID, P69 owner) {
        super(type, "Cases", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.MapType<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.MapType<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression>) this.type;
        final FieldType keyType = type.keyType;
        final FieldType valueType = type.valueType;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.EnumUnionDef)d[i]).cases = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.MapType<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.MapType<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression>) this.type;
        final FieldType keyType = type.keyType;
        final FieldType valueType = type.valueType;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.EnumUnionDef)d[i]).cases, out);
        }

        return drop;
    }

    @Override
    public java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.EnumUnionDef) ref).cases;
    }

    @Override
    public void set(Obj ref, java.util.HashMap<tyr.tooling.sdk.ast.StaticAccess, tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.EnumUnionDef) ref).cases = value;
    }
}

/**
 * Expression EnumUnionDef.Others
 */
public static final class f128 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.EnumUnionDef> implements KnownField {

    f128(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P69 owner) {
        super(type, "Others", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.EnumUnionDef)d[i]).others = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.EnumUnionDef)d[i]).others;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.EnumUnionDef) ref).others;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.EnumUnionDef) ref).others = value;
    }
}

/**
 * Bool TypeWithMembers.Flat
 */
public static final class f129 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.TypeWithMembers> implements KnownField {

    f129(FieldType<java.lang.Boolean> type, int ID, P70 owner) {
        super(type, "Flat", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeWithMembers)d[i]).flat = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.TypeWithMembers)d[i]).flat;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeWithMembers) ref).flat;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.TypeWithMembers) ref).flat = value;
    }
}

/**
 * TypeMember[] TypeWithMembers.Members
 */
public static final class f130 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember>, tyr.tooling.sdk.ast.TypeWithMembers> implements KnownField {

    f130(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember>> type, int ID, P70 owner) {
        super(type, "Members", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TypeMember> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TypeMember>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.TypeWithMembers)d[i]).members = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TypeMember> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.TypeMember>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.TypeWithMembers)d[i]).members, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.TypeWithMembers) ref).members;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.TypeMember> value) {
        ((tyr.tooling.sdk.ast.TypeWithMembers) ref).members = value;
    }
}

/**
 * Expression FormalParameter.Typ
 */
public static final class f131 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FormalParameter> implements KnownField {

    f131(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P18 owner) {
        super(type, "Typ", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalParameter)d[i]).typ = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FormalParameter)d[i]).typ;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalParameter) ref).typ;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FormalParameter) ref).typ = value;
    }
}

/**
 * String FormalParameter.Name
 */
public static final class f132 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.FormalParameter> implements KnownField {

    f132(FieldType<java.lang.String> type, int ID, P18 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalParameter)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.FormalParameter)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalParameter) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.FormalParameter) ref).name = value;
    }
}

/**
 * Bool FormalParameter.VarArg
 */
public static final class f133 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.FormalParameter> implements KnownField {

    f133(FieldType<java.lang.Boolean> type, int ID, P18 owner) {
        super(type, "VarArg", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalParameter)d[i]).varArg = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.FormalParameter)d[i]).varArg;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalParameter) ref).varArg;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.FormalParameter) ref).varArg = value;
    }
}

/**
 * Expression FormalParameter.Default
 */
public static final class f134 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FormalParameter> implements KnownField {

    f134(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P18 owner) {
        super(type, "Default", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalParameter)d[i]).Zdefault = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FormalParameter)d[i]).Zdefault;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalParameter) ref).Zdefault;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FormalParameter) ref).Zdefault = value;
    }
}

/**
 * Expression[] FormalParameter.Properties
 */
public static final class f135 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.FormalParameter> implements KnownField {

    f135(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P18 owner) {
        super(type, "Properties", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalParameter)d[i]).properties = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FormalParameter)d[i]).properties, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalParameter) ref).properties;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.FormalParameter) ref).properties = value;
    }
}

/**
 * Expression FormalCTParameter.Raw
 */
public static final class f136 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FormalCTParameter> implements KnownField {

    f136(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P74 owner) {
        super(type, "Raw", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalCTParameter)d[i]).raw = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FormalCTParameter)d[i]).raw;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FormalCTParameter) ref).raw;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FormalCTParameter) ref).raw = value;
    }
}

/**
 * Variance FormalCTParameter.Variance
 */
public static final class f137 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Variance>, tyr.tooling.sdk.ast.FormalCTParameter> implements KnownField {

    f137(FieldType<EnumProxy<tyr.tooling.sdk.ast.Variance>> type, int ID, P74 owner) {
        super(type, "Variance", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FormalCTParameter)d[i]).variance = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.FormalCTParameter)d[i]).variance, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Variance> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Variance>)((tyr.tooling.sdk.ast.FormalCTParameter) ref).variance;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Variance> value) {
        ((tyr.tooling.sdk.ast.FormalCTParameter) ref).variance = value;
    }
}

/**
 * String ConstructorParameter.Initializes
 */
public static final class f138 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.ConstructorParameter> implements KnownField {

    f138(FieldType<java.lang.String> type, int ID, P75 owner) {
        super(type, "Initializes", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ConstructorParameter)d[i]).initializes = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.ConstructorParameter)d[i]).initializes, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ConstructorParameter) ref).initializes;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.ConstructorParameter) ref).initializes = value;
    }
}

/**
 * Expression FunctionBody.Body
 */
public static final class f139 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FunctionBody> implements KnownField {

    f139(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P76 owner) {
        super(type, "Body", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionBody)d[i]).body = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FunctionBody)d[i]).body;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FunctionBody) ref).body;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FunctionBody) ref).body = value;
    }
}

/**
 * Expression ExternFunction.Source
 */
public static final class f140 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.ExternFunction> implements KnownField {

    f140(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P77 owner) {
        super(type, "Source", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.ExternFunction)d[i]).source = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.ExternFunction)d[i]).source;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.ExternFunction) ref).source;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.ExternFunction) ref).source = value;
    }
}

/**
 * Expression FunctionAssignment.Source
 */
public static final class f141 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.FunctionAssignment> implements KnownField {

    f141(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P79 owner) {
        super(type, "Source", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.FunctionAssignment)d[i]).source = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P1) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.FunctionAssignment)d[i]).source;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.FunctionAssignment) ref).source;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.FunctionAssignment) ref).source = value;
    }
}

/**
 * String DocTag.Name
 */
public static final class f142 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.DocTag> implements KnownField {

    f142(FieldType<java.lang.String> type, int ID, P2 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P2) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocTag)d[i]).name = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P2) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.DocTag)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocTag) ref).name;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.DocTag) ref).name = value;
    }
}

/**
 * String[] DocTag.Words
 */
public static final class f143 extends FieldDeclaration<java.util.ArrayList<java.lang.String>, tyr.tooling.sdk.ast.DocTag> implements KnownField {

    f143(FieldType<java.util.ArrayList<java.lang.String>> type, int ID, P2 owner) {
        super(type, "Words", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P2) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocTag)d[i]).words = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P2) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.DocTag)d[i]).words, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<java.lang.String> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocTag) ref).words;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<java.lang.String> value) {
        ((tyr.tooling.sdk.ast.DocTag) ref).words = value;
    }
}

/**
 * DocParagraph[] DocTag.Content
 */
public static final class f144 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph>, tyr.tooling.sdk.ast.DocTag> implements KnownField {

    f144(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph>> type, int ID, P2 owner) {
        super(type, "Content", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P2) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocTag)d[i]).content = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P2) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.DocParagraph>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.DocTag)d[i]).content, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocTag) ref).content;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.DocParagraph> value) {
        ((tyr.tooling.sdk.ast.DocTag) ref).content = value;
    }
}

/**
 * Position Message.Pos
 */
public static final class f145 extends FieldDeclaration<tyr.tooling.sdk.ast.Position, tyr.tooling.sdk.ast.Message> implements KnownField {

    f145(FieldType<tyr.tooling.sdk.ast.Position> type, int ID, P3 owner) {
        super(type, "Pos", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P3) owner).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Message)d[i]).pos = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P3) owner).data();
        final P5 t = ((P5) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Position v = ((tyr.tooling.sdk.ast.Message)d[i]).pos;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Position get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Message) ref).pos;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Position value) {
        ((tyr.tooling.sdk.ast.Message) ref).pos = value;
    }
}

/**
 * String Message.Text
 */
public static final class f146 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Message> implements KnownField {

    f146(FieldType<java.lang.String> type, int ID, P3 owner) {
        super(type, "Text", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P3) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Message)d[i]).text = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P3) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Message)d[i]).text, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Message) ref).text;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Message) ref).text = value;
    }
}

/**
 * String Message.Category
 */
public static final class f147 extends FieldDeclaration<java.lang.String, tyr.tooling.sdk.ast.Message> implements KnownField {

    f147(FieldType<java.lang.String> type, int ID, P3 owner) {
        super(type, "Category", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P3) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Message)d[i]).category = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P3) owner).data();
        final StringPool t = (StringPool) type;
        for (; i != h; i++) {
            drop &= t.w(((tyr.tooling.sdk.ast.Message)d[i]).category, out);
        }

        return drop;
    }

    @Override
    public java.lang.String get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Message) ref).category;
    }

    @Override
    public void set(Obj ref, java.lang.String value) {
        ((tyr.tooling.sdk.ast.Message) ref).category = value;
    }
}

/**
 * Severity Message.Severity
 */
public static final class f148 extends FieldDeclaration<EnumProxy<tyr.tooling.sdk.ast.Severity>, tyr.tooling.sdk.ast.Message> implements KnownField {

    f148(FieldType<EnumProxy<tyr.tooling.sdk.ast.Severity>> type, int ID, P3 owner) {
        super(type, "Severity", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P3) owner).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Message)d[i]).severity = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P3) owner).data();
        final EnumPool<?> type = (EnumPool<?>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Message)d[i]).severity, out);
        }

        return drop;
    }

    @Override
    public EnumProxy<tyr.tooling.sdk.ast.Severity> get(Obj ref) {
        return (EnumProxy<tyr.tooling.sdk.ast.Severity>)((tyr.tooling.sdk.ast.Message) ref).severity;
    }

    @Override
    public void set(Obj ref, EnumProxy<tyr.tooling.sdk.ast.Severity> value) {
        ((tyr.tooling.sdk.ast.Message) ref).severity = value;
    }
}

/**
 * String[] Package.Name
 */
public static final class f149 extends FieldDeclaration<java.util.ArrayList<java.lang.String>, tyr.tooling.sdk.ast.Package> implements KnownField {

    f149(FieldType<java.util.ArrayList<java.lang.String>> type, int ID, P4 owner) {
        super(type, "Name", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P4) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Package)d[i]).name = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P4) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.Package)d[i]).name, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<java.lang.String> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Package) ref).name;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<java.lang.String> value) {
        ((tyr.tooling.sdk.ast.Package) ref).name = value;
    }
}

/**
 * Namespace Package.Root
 */
public static final class f150 extends FieldDeclaration<tyr.tooling.sdk.ast.Namespace, tyr.tooling.sdk.ast.Package> implements KnownField {

    f150(FieldType<tyr.tooling.sdk.ast.Namespace> type, int ID, P4 owner) {
        super(type, "Root", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P4) owner).data();
        final P10 t = ((P10) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Package)d[i]).root = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P4) owner).data();
        final P10 t = ((P10) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Namespace v = ((tyr.tooling.sdk.ast.Package)d[i]).root;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Namespace get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Package) ref).root;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Namespace value) {
        ((tyr.tooling.sdk.ast.Package) ref).root = value;
    }
}

/**
 * Namespace Package.PackageRoot
 */
public static final class f151 extends FieldDeclaration<tyr.tooling.sdk.ast.Namespace, tyr.tooling.sdk.ast.Package> implements KnownField {

    f151(FieldType<tyr.tooling.sdk.ast.Namespace> type, int ID, P4 owner) {
        super(type, "PackageRoot", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P4) owner).data();
        final P10 t = ((P10) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Package)d[i]).packageRoot = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P4) owner).data();
        final P10 t = ((P10) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Namespace v = ((tyr.tooling.sdk.ast.Package)d[i]).packageRoot;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Namespace get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Package) ref).packageRoot;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Namespace value) {
        ((tyr.tooling.sdk.ast.Package) ref).packageRoot = value;
    }
}

/**
 * File Position.File
 */
public static final class f152 extends FieldDeclaration<tyr.tooling.sdk.ast.File, tyr.tooling.sdk.ast.Position> implements KnownField {

    f152(FieldType<tyr.tooling.sdk.ast.File> type, int ID, P5 owner) {
        super(type, "File", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P5) owner).data();
        final P0 t = ((P0) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Position)d[i]).file = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P5) owner).data();
        final P0 t = ((P0) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.File v = ((tyr.tooling.sdk.ast.Position)d[i]).file;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.File get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Position) ref).file;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.File value) {
        ((tyr.tooling.sdk.ast.Position) ref).file = value;
    }
}

/**
 * V64 Position.EndLine
 */
public static final class f153 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.Position> implements KnownField {

    f153(FieldType<java.lang.Long> type, int ID, P5 owner) {
        super(type, "EndLine", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Position)d[i]).endLine = in.v64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.Position)d[i]).endLine;drop&=0==v;out.v64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Position) ref).endLine;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.Position) ref).endLine = value;
    }
}

/**
 * V64 Position.BeginLine
 */
public static final class f154 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.Position> implements KnownField {

    f154(FieldType<java.lang.Long> type, int ID, P5 owner) {
        super(type, "BeginLine", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Position)d[i]).beginLine = in.v64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.Position)d[i]).beginLine;drop&=0==v;out.v64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Position) ref).beginLine;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.Position) ref).beginLine = value;
    }
}

/**
 * V64 Position.EndColumn
 */
public static final class f155 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.Position> implements KnownField {

    f155(FieldType<java.lang.Long> type, int ID, P5 owner) {
        super(type, "EndColumn", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Position)d[i]).endColumn = in.v64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.Position)d[i]).endColumn;drop&=0==v;out.v64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Position) ref).endColumn;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.Position) ref).endColumn = value;
    }
}

/**
 * V64 Position.BeginColumn
 */
public static final class f156 extends FieldDeclaration<java.lang.Long, tyr.tooling.sdk.ast.Position> implements KnownField {

    f156(FieldType<java.lang.Long> type, int ID, P5 owner) {
        super(type, "BeginColumn", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.Position)d[i]).beginColumn = in.v64();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P5) owner).data();
        for (; i != h; i++) {
            long v=((tyr.tooling.sdk.ast.Position)d[i]).beginColumn;drop&=0==v;out.v64(v);
        }

        return drop;
    }

    @Override
    public java.lang.Long get(Obj ref) {
        return ((tyr.tooling.sdk.ast.Position) ref).beginColumn;
    }

    @Override
    public void set(Obj ref, java.lang.Long value) {
        ((tyr.tooling.sdk.ast.Position) ref).beginColumn = value;
    }
}

/**
 * Expression[] OverrideVisible.Targets
 */
public static final class f157 extends FieldDeclaration<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>, tyr.tooling.sdk.ast.OverrideVisible> implements KnownField {

    f157(FieldType<java.util.ArrayList<tyr.tooling.sdk.ast.Expression>> type, int ID, P82 owner) {
        super(type, "Targets", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P6) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.OverrideVisible)d[i]).targets = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P6) owner.basePool).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression> type = (ogss.common.java.internal.fieldTypes.ArrayType<tyr.tooling.sdk.ast.Expression>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.OverrideVisible)d[i]).targets, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<tyr.tooling.sdk.ast.Expression> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.OverrideVisible) ref).targets;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<tyr.tooling.sdk.ast.Expression> value) {
        ((tyr.tooling.sdk.ast.OverrideVisible) ref).targets = value;
    }
}

/**
 * Expression RestrictedVisible.Private
 */
public static final class f158 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.RestrictedVisible> implements KnownField {

    f158(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P83 owner) {
        super(type, "Private", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P6) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).Zprivate = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P6) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).Zprivate;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RestrictedVisible) ref).Zprivate;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.RestrictedVisible) ref).Zprivate = value;
    }
}

/**
 * Bool RestrictedVisible.IsPrivate
 */
public static final class f159 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.RestrictedVisible> implements KnownField {

    f159(FieldType<java.lang.Boolean> type, int ID, P83 owner) {
        super(type, "IsPrivate", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P6) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).isPrivate = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P6) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).isPrivate;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RestrictedVisible) ref).isPrivate;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.RestrictedVisible) ref).isPrivate = value;
    }
}

/**
 * Expression RestrictedVisible.Protected
 */
public static final class f160 extends FieldDeclaration<tyr.tooling.sdk.ast.Expression, tyr.tooling.sdk.ast.RestrictedVisible> implements KnownField {

    f160(FieldType<tyr.tooling.sdk.ast.Expression> type, int ID, P83 owner) {
        super(type, "Protected", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P6) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).Zprotected = t.get(in.v32());
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P6) owner.basePool).data();
        final P13 t = ((P13) type);
        for (; i != h; i++) {
            tyr.tooling.sdk.ast.Expression v = ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).Zprotected;
            final int id = (null == v ? 0 : v.ID());
            if(0 == id)
                out.i8((byte)0);
            else {
                drop = false;
                out.v64(id);
            };
        }

        return drop;
    }

    @Override
    public tyr.tooling.sdk.ast.Expression get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RestrictedVisible) ref).Zprotected;
    }

    @Override
    public void set(Obj ref, tyr.tooling.sdk.ast.Expression value) {
        ((tyr.tooling.sdk.ast.RestrictedVisible) ref).Zprotected = value;
    }
}

/**
 * Bool RestrictedVisible.IsProtected
 */
public static final class f161 extends FieldDeclaration<java.lang.Boolean, tyr.tooling.sdk.ast.RestrictedVisible> implements KnownField {

    f161(FieldType<java.lang.Boolean> type, int ID, P83 owner) {
        super(type, "IsProtected", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P6) owner.basePool).data();
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).isProtected = in.bool();
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P6) owner.basePool).data();
        final ogss.common.jvm.streams.BoolOutWrapper wrap = new ogss.common.jvm.streams.BoolOutWrapper(out);
        for (; i != h; i++) {
            final boolean v = ((tyr.tooling.sdk.ast.RestrictedVisible)d[i]).isProtected;
            drop &= !v;
            wrap.bool(v);
        }
        wrap.unwrap();

        return drop;
    }

    @Override
    public java.lang.Boolean get(Obj ref) {
        return ((tyr.tooling.sdk.ast.RestrictedVisible) ref).isProtected;
    }

    @Override
    public void set(Obj ref, java.lang.Boolean value) {
        ((tyr.tooling.sdk.ast.RestrictedVisible) ref).isProtected = value;
    }
}

/**
 * String[] DocParagraph.Words
 */
public static final class f162 extends FieldDeclaration<java.util.ArrayList<java.lang.String>, tyr.tooling.sdk.ast.DocParagraph> implements KnownField {

    f162(FieldType<java.util.ArrayList<java.lang.String>> type, int ID, P7 owner) {
        super(type, "Words", ID, owner);
        // TODO insert known restrictions?
    }

    @Override
    protected final void read(int i, final int h, MappedInStream in) {
        final Obj[] d = ((P7) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            ((tyr.tooling.sdk.ast.DocParagraph)d[i]).words = type.r(in);
        }

    }
    @Override
    protected final boolean write(int i, final int h, BufferedOutStream out) throws IOException {
        boolean drop = true;
        final Obj[] d = ((P7) owner).data();
        final ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String> type = (ogss.common.java.internal.fieldTypes.ArrayType<java.lang.String>) this.type;
        for (; i != h; i++) {
            drop &= type.w(((tyr.tooling.sdk.ast.DocParagraph)d[i]).words, out);
        }

        return drop;
    }

    @Override
    public java.util.ArrayList<java.lang.String> get(Obj ref) {
        return ((tyr.tooling.sdk.ast.DocParagraph) ref).words;
    }

    @Override
    public void set(Obj ref, java.util.ArrayList<java.lang.String> value) {
        ((tyr.tooling.sdk.ast.DocParagraph) ref).words = value;
    }
}

}
