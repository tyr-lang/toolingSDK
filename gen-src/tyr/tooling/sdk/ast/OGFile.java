/*   ____  _____________                                                                                              *\
 *  / __ \/ ___/ __/ __/  Your OGSS/Java Binding                                                                      * 
 * / /_/ / (_\_\ \_\ \    Tyr Tooling SDK                                                                             * 
 * \____/\___/___/___/    by: feldentm                                                                                * 
\*                                                                                                                    */
package tyr.tooling.sdk.ast;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import ogss.common.java.api.Mode;
import ogss.common.java.api.OGSSException;
import ogss.common.java.internal.KCC;
import ogss.common.java.internal.Pool;
import ogss.common.java.internal.StateInitializer;

/**
 * An abstract OGSS file that is hiding all the dirty implementation details
 * from you.
 *
 * @note Type access fields start with a capital letter to avoid collisions and to match type names.
 *
 * @author Timm Felden
 */
@SuppressWarnings("all")
public final class OGFile extends ogss.common.java.internal.State {

    /**
     * Create a new OGSS file based on argument path and mode.
     *
     * @throws IOException
     *             on IO and mode related errors
     * @throws OGSSException
     *             on file or specification consistency errors
     */
    public static OGFile open(String path, Mode... mode) throws IOException, OGSSException {
        return new OGFile(StateInitializer.make(Paths.get(path), new internal.PB(), mode));
    }

    /**
     * Create a new OGSS file based on argument path and mode.
     *
     * @throws IOException
     *             on IO and mode related errors
     * @throws OGSSException
     *             on file or specification consistency errors
     */
    public static OGFile open(File path, Mode... mode) throws IOException, OGSSException {
        return new OGFile(StateInitializer.make(path.toPath(), new internal.PB(), mode));
    }

    /**
     * Create a new OGSS file based on argument path and mode.
     *
     * @throws IOException
     *             on IO and mode related errors
     * @throws OGSSException
     *             on file or specification consistency errors
     */
    public static OGFile open(Path path, Mode... mode) throws IOException, OGSSException {
        return new OGFile(StateInitializer.make(path, new internal.PB(), mode));
    }

    /**
     * Access for all Files in this file
     */
    final public internal.P0 Files;

    /**
     * Access for all Nodes in this file
     */
    final public internal.P1 Nodes;

    /**
     * Access for all FileNodes in this file
     */
    final public internal.P8 FileNodes;

    /**
     * Access for all ExtEntitys in this file
     */
    final public internal.P9 ExtEntitys;

    /**
     * Access for all Namespaces in this file
     */
    final public internal.P10 Namespaces;

    /**
     * Access for all Parameters in this file
     */
    final public internal.P11 Parameters;

    /**
     * Access for all BlankParameters in this file
     */
    final public internal.P20 BlankParameters;

    /**
     * Access for all ValueParameters in this file
     */
    final public internal.P21 ValueParameters;

    /**
     * Access for all DocComments in this file
     */
    final public internal.P12 DocComments;

    /**
     * Access for all Expressions in this file
     */
    final public internal.P13 Expressions;

    /**
     * Access for all Blocks in this file
     */
    final public internal.P22 Blocks;

    /**
     * Access for all Literals in this file
     */
    final public internal.P23 Literals;

    /**
     * Access for all IntLiterals in this file
     */
    final public internal.P41 IntLiterals;

    /**
     * Access for all BoolLiterals in this file
     */
    final public internal.P42 BoolLiterals;

    /**
     * Access for all CharLiterals in this file
     */
    final public internal.P43 CharLiterals;

    /**
     * Access for all NullLiterals in this file
     */
    final public internal.P44 NullLiterals;

    /**
     * Access for all FloatLiterals in this file
     */
    final public internal.P45 FloatLiterals;

    /**
     * Access for all StringLiterals in this file
     */
    final public internal.P46 StringLiterals;

    /**
     * Access for all Allocations in this file
     */
    final public internal.P24 Allocations;

    /**
     * Access for all VariableDefs in this file
     */
    final public internal.P25 VariableDefs;

    /**
     * Access for all Deallocations in this file
     */
    final public internal.P26 Deallocations;

    /**
     * Access for all FunctionTypes in this file
     */
    final public internal.P27 FunctionTypes;

    /**
     * Access for all MemberAccesss in this file
     */
    final public internal.P28 MemberAccesss;

    /**
     * Access for all StaticAccesss in this file
     */
    final public internal.P29 StaticAccesss;

    /**
     * Access for all CTApplications in this file
     */
    final public internal.P30 CTApplications;

    /**
     * Access for all OperatorUsages in this file
     */
    final public internal.P31 OperatorUsages;

    /**
     * Access for all RTApplications in this file
     */
    final public internal.P32 RTApplications;

    /**
     * Access for all ImportExpressions in this file
     */
    final public internal.P33 ImportExpressions;

    /**
     * Access for all StaticTypeAccesss in this file
     */
    final public internal.P34 StaticTypeAccesss;

    /**
     * Access for all BinderApplications in this file
     */
    final public internal.P35 BinderApplications;

    /**
     * Access for all DynamicTypeAccesss in this file
     */
    final public internal.P36 DynamicTypeAccesss;

    /**
     * Access for all BranchingExpressions in this file
     */
    final public internal.P37 BranchingExpressions;

    /**
     * Access for all SwitchLikes in this file
     */
    final public internal.P47 SwitchLikes;

    /**
     * Access for all TryExpressions in this file
     */
    final public internal.P54 TryExpressions;

    /**
     * Access for all SwitchExpressions in this file
     */
    final public internal.P55 SwitchExpressions;

    /**
     * Access for all IfExpressions in this file
     */
    final public internal.P48 IfExpressions;

    /**
     * Access for all BreakExpressions in this file
     */
    final public internal.P49 BreakExpressions;

    /**
     * Access for all ThrowExpressions in this file
     */
    final public internal.P50 ThrowExpressions;

    /**
     * Access for all ReturnExpressions in this file
     */
    final public internal.P51 ReturnExpressions;

    /**
     * Access for all ContinueExpressions in this file
     */
    final public internal.P52 ContinueExpressions;

    /**
     * Access for all BreakContinueTargets in this file
     */
    final public internal.P53 BreakContinueTargets;

    /**
     * Access for all WhileLoops in this file
     */
    final public internal.P56 WhileLoops;

    /**
     * Access for all DoWhileLoops in this file
     */
    final public internal.P57 DoWhileLoops;

    /**
     * Access for all OperatorApplications in this file
     */
    final public internal.P38 OperatorApplications;

    /**
     * Access for all SuperDestructorCalls in this file
     */
    final public internal.P39 SuperDestructorCalls;

    /**
     * Access for all SuperConstructorCalls in this file
     */
    final public internal.P40 SuperConstructorCalls;

    /**
     * Access for all SwitchCases in this file
     */
    final public internal.P14 SwitchCases;

    /**
     * Access for all TypeMembers in this file
     */
    final public internal.P15 TypeMembers;

    /**
     * Access for all Tests in this file
     */
    final public internal.P58 Tests;

    /**
     * Access for all Fields in this file
     */
    final public internal.P59 Fields;

    /**
     * Access for all Functions in this file
     */
    final public internal.P60 Functions;

    /**
     * Access for all Destructors in this file
     */
    final public internal.P61 Destructors;

    /**
     * Access for all Constructors in this file
     */
    final public internal.P62 Constructors;

    /**
     * Access for all GlobalDestructors in this file
     */
    final public internal.P63 GlobalDestructors;

    /**
     * Access for all GlobalInitializers in this file
     */
    final public internal.P64 GlobalInitializers;

    /**
     * Access for all EnumInstances in this file
     */
    final public internal.P16 EnumInstances;

    /**
     * Access for all TopLevelNodes in this file
     */
    final public internal.P17 TopLevelNodes;

    /**
     * Access for all AliasDefs in this file
     */
    final public internal.P65 AliasDefs;

    /**
     * Access for all TypeLikes in this file
     */
    final public internal.P66 TypeLikes;

    /**
     * Access for all EnumDefs in this file
     */
    final public internal.P67 EnumDefs;

    /**
     * Access for all PropertyDefs in this file
     */
    final public internal.P68 PropertyDefs;

    /**
     * Access for all EnumUnionDefs in this file
     */
    final public internal.P69 EnumUnionDefs;

    /**
     * Access for all TypeWithMemberss in this file
     */
    final public internal.P70 TypeWithMemberss;

    /**
     * Access for all TypeDefs in this file
     */
    final public internal.P71 TypeDefs;

    /**
     * Access for all ClassDefs in this file
     */
    final public internal.P72 ClassDefs;

    /**
     * Access for all InterfaceDefs in this file
     */
    final public internal.P73 InterfaceDefs;

    /**
     * Access for all FormalParameters in this file
     */
    final public internal.P18 FormalParameters;

    /**
     * Access for all FormalCTParameters in this file
     */
    final public internal.P74 FormalCTParameters;

    /**
     * Access for all ConstructorParameters in this file
     */
    final public internal.P75 ConstructorParameters;

    /**
     * Access for all FunctionRealizations in this file
     */
    final public internal.P19 FunctionRealizations;

    /**
     * Access for all FunctionBodys in this file
     */
    final public internal.P76 FunctionBodys;

    /**
     * Access for all ExternFunctions in this file
     */
    final public internal.P77 ExternFunctions;

    /**
     * Access for all AbstractFunctions in this file
     */
    final public internal.P78 AbstractFunctions;

    /**
     * Access for all FunctionAssignments in this file
     */
    final public internal.P79 FunctionAssignments;

    /**
     * Access for all DocTags in this file
     */
    final public internal.P2 DocTags;

    /**
     * Access for all Messages in this file
     */
    final public internal.P3 Messages;

    /**
     * Access for all Packages in this file
     */
    final public internal.P4 Packages;

    /**
     * Access for all Positions in this file
     */
    final public internal.P5 Positions;

    /**
     * Access for all Visibilitys in this file
     */
    final public internal.P6 Visibilitys;

    /**
     * Access for all PublicVisibles in this file
     */
    final public internal.P80 PublicVisibles;

    /**
     * Access for all PackageVisibles in this file
     */
    final public internal.P81 PackageVisibles;

    /**
     * Access for all OverrideVisibles in this file
     */
    final public internal.P82 OverrideVisibles;

    /**
     * Access for all RestrictedVisibles in this file
     */
    final public internal.P83 RestrictedVisibles;

    /**
     * Access for all DocParagraphs in this file
     */
    final public internal.P7 DocParagraphs;

    /**
     * Access for all ScopeMembers in this file
     */
    final public ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.ScopeMember, tyr.tooling.sdk.ast.Node> ScopeMembers;

    /**
     * Access for all Scopes in this file
     */
    final public ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.Scope, tyr.tooling.sdk.ast.Node> Scopes;

    /**
     * Access for all NamedMembers in this file
     */
    final public ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.NamedMember, tyr.tooling.sdk.ast.Node> NamedMembers;

    /**
     * Access for all WithMemberPropertiess in this file
     */
    final public ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.WithMemberProperties, tyr.tooling.sdk.ast.TypeMember> WithMemberPropertiess;
    /**
     * Access for all Kind proxies in this file
     */
    final public ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Kind> Kind;
    /**
     * Access for all Storage proxies in this file
     */
    final public ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Storage> Storage;
    /**
     * Access for all Severity proxies in this file
     */
    final public ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Severity> Severity;
    /**
     * Access for all Variance proxies in this file
     */
    final public ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Variance> Variance;
    /**
     * Access for all FunctionTypeKind proxies in this file
     */
    final public ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.FunctionTypeKind> FunctionTypeKind;

    private OGFile(StateInitializer init) {
        super(init);

        Files = (internal.P0) init.SIFA[10];
        Nodes = (internal.P1) init.SIFA[11];
        FileNodes = (internal.P8) init.SIFA[12];
        ExtEntitys = (internal.P9) init.SIFA[13];
        Namespaces = (internal.P10) init.SIFA[14];
        Parameters = (internal.P11) init.SIFA[15];
        BlankParameters = (internal.P20) init.SIFA[16];
        ValueParameters = (internal.P21) init.SIFA[17];
        DocComments = (internal.P12) init.SIFA[18];
        Expressions = (internal.P13) init.SIFA[19];
        Blocks = (internal.P22) init.SIFA[20];
        Literals = (internal.P23) init.SIFA[21];
        IntLiterals = (internal.P41) init.SIFA[22];
        BoolLiterals = (internal.P42) init.SIFA[23];
        CharLiterals = (internal.P43) init.SIFA[24];
        NullLiterals = (internal.P44) init.SIFA[25];
        FloatLiterals = (internal.P45) init.SIFA[26];
        StringLiterals = (internal.P46) init.SIFA[27];
        Allocations = (internal.P24) init.SIFA[28];
        VariableDefs = (internal.P25) init.SIFA[29];
        Deallocations = (internal.P26) init.SIFA[30];
        FunctionTypes = (internal.P27) init.SIFA[31];
        MemberAccesss = (internal.P28) init.SIFA[32];
        StaticAccesss = (internal.P29) init.SIFA[33];
        CTApplications = (internal.P30) init.SIFA[34];
        OperatorUsages = (internal.P31) init.SIFA[35];
        RTApplications = (internal.P32) init.SIFA[36];
        ImportExpressions = (internal.P33) init.SIFA[37];
        StaticTypeAccesss = (internal.P34) init.SIFA[38];
        BinderApplications = (internal.P35) init.SIFA[39];
        DynamicTypeAccesss = (internal.P36) init.SIFA[40];
        BranchingExpressions = (internal.P37) init.SIFA[41];
        SwitchLikes = (internal.P47) init.SIFA[42];
        TryExpressions = (internal.P54) init.SIFA[43];
        SwitchExpressions = (internal.P55) init.SIFA[44];
        IfExpressions = (internal.P48) init.SIFA[45];
        BreakExpressions = (internal.P49) init.SIFA[46];
        ThrowExpressions = (internal.P50) init.SIFA[47];
        ReturnExpressions = (internal.P51) init.SIFA[48];
        ContinueExpressions = (internal.P52) init.SIFA[49];
        BreakContinueTargets = (internal.P53) init.SIFA[50];
        WhileLoops = (internal.P56) init.SIFA[51];
        DoWhileLoops = (internal.P57) init.SIFA[52];
        OperatorApplications = (internal.P38) init.SIFA[53];
        SuperDestructorCalls = (internal.P39) init.SIFA[54];
        SuperConstructorCalls = (internal.P40) init.SIFA[55];
        SwitchCases = (internal.P14) init.SIFA[56];
        TypeMembers = (internal.P15) init.SIFA[57];
        Tests = (internal.P58) init.SIFA[58];
        Fields = (internal.P59) init.SIFA[59];
        Functions = (internal.P60) init.SIFA[60];
        Destructors = (internal.P61) init.SIFA[61];
        Constructors = (internal.P62) init.SIFA[62];
        GlobalDestructors = (internal.P63) init.SIFA[63];
        GlobalInitializers = (internal.P64) init.SIFA[64];
        EnumInstances = (internal.P16) init.SIFA[65];
        TopLevelNodes = (internal.P17) init.SIFA[66];
        AliasDefs = (internal.P65) init.SIFA[67];
        TypeLikes = (internal.P66) init.SIFA[68];
        EnumDefs = (internal.P67) init.SIFA[69];
        PropertyDefs = (internal.P68) init.SIFA[70];
        EnumUnionDefs = (internal.P69) init.SIFA[71];
        TypeWithMemberss = (internal.P70) init.SIFA[72];
        TypeDefs = (internal.P71) init.SIFA[73];
        ClassDefs = (internal.P72) init.SIFA[74];
        InterfaceDefs = (internal.P73) init.SIFA[75];
        FormalParameters = (internal.P18) init.SIFA[76];
        FormalCTParameters = (internal.P74) init.SIFA[77];
        ConstructorParameters = (internal.P75) init.SIFA[78];
        FunctionRealizations = (internal.P19) init.SIFA[79];
        FunctionBodys = (internal.P76) init.SIFA[80];
        ExternFunctions = (internal.P77) init.SIFA[81];
        AbstractFunctions = (internal.P78) init.SIFA[82];
        FunctionAssignments = (internal.P79) init.SIFA[83];
        DocTags = (internal.P2) init.SIFA[84];
        Messages = (internal.P3) init.SIFA[85];
        Packages = (internal.P4) init.SIFA[86];
        Positions = (internal.P5) init.SIFA[87];
        Visibilitys = (internal.P6) init.SIFA[88];
        PublicVisibles = (internal.P80) init.SIFA[89];
        PackageVisibles = (internal.P81) init.SIFA[90];
        OverrideVisibles = (internal.P82) init.SIFA[91];
        RestrictedVisibles = (internal.P83) init.SIFA[92];
        DocParagraphs = (internal.P7) init.SIFA[93];
        ScopeMembers = new ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.ScopeMember, tyr.tooling.sdk.ast.Node>("ScopeMember", Nodes,FileNodes,ExtEntitys,Namespaces,TypeMembers,EnumInstances,TopLevelNodes,FormalParameters);
        Scopes = new ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.Scope, tyr.tooling.sdk.ast.Node>("Scope", Nodes,Namespaces,TopLevelNodes);
        NamedMembers = new ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.NamedMember, tyr.tooling.sdk.ast.Node>("NamedMember", Nodes,ExtEntitys,Namespaces,TypeMembers,EnumInstances,TopLevelNodes,FormalParameters);
        WithMemberPropertiess = new ogss.common.java.internal.InterfacePool<tyr.tooling.sdk.ast.WithMemberProperties, tyr.tooling.sdk.ast.TypeMember>("WithMemberProperties", TypeMembers,Fields,Functions,Destructors,Constructors,GlobalDestructors,GlobalInitializers);
        Kind = (ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Kind>) init.SIFA[111];
        Storage = (ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Storage>) init.SIFA[112];
        Severity = (ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Severity>) init.SIFA[113];
        Variance = (ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.Variance>) init.SIFA[114];
        FunctionTypeKind = (ogss.common.java.internal.EnumPool<tyr.tooling.sdk.ast.FunctionTypeKind>) init.SIFA[115];

        init.awaitResults();
    }
}
