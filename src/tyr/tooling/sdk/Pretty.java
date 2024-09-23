package tyr.tooling.sdk;

import tyr.tooling.sdk.ast.AbstractFunction;
import tyr.tooling.sdk.ast.AliasDef;
import tyr.tooling.sdk.ast.Allocation;
import tyr.tooling.sdk.ast.BinderApplication;
import tyr.tooling.sdk.ast.BlankParameter;
import tyr.tooling.sdk.ast.Block;
import tyr.tooling.sdk.ast.BoolLiteral;
import tyr.tooling.sdk.ast.BranchingExpression;
import tyr.tooling.sdk.ast.BreakContinueTarget;
import tyr.tooling.sdk.ast.BreakExpression;
import tyr.tooling.sdk.ast.CTApplication;
import tyr.tooling.sdk.ast.CharLiteral;
import tyr.tooling.sdk.ast.ClassDef;
import tyr.tooling.sdk.ast.Constructor;
import tyr.tooling.sdk.ast.ConstructorParameter;
import tyr.tooling.sdk.ast.ContinueExpression;
import tyr.tooling.sdk.ast.Deallocation;
import tyr.tooling.sdk.ast.Destructor;
import tyr.tooling.sdk.ast.DoWhileLoop;
import tyr.tooling.sdk.ast.DocComment;
import tyr.tooling.sdk.ast.DocParagraph;
import tyr.tooling.sdk.ast.DocTag;
import tyr.tooling.sdk.ast.DynamicTypeAccess;
import tyr.tooling.sdk.ast.EnumDef;
import tyr.tooling.sdk.ast.EnumInstance;
import tyr.tooling.sdk.ast.EnumUnionDef;
import tyr.tooling.sdk.ast.Expression;
import tyr.tooling.sdk.ast.ExtEntity;
import tyr.tooling.sdk.ast.ExternFunction;
import tyr.tooling.sdk.ast.Field;
import tyr.tooling.sdk.ast.File;
import tyr.tooling.sdk.ast.FileNode;
import tyr.tooling.sdk.ast.FloatLiteral;
import tyr.tooling.sdk.ast.FormalCTParameter;
import tyr.tooling.sdk.ast.FormalParameter;
import tyr.tooling.sdk.ast.Function;
import tyr.tooling.sdk.ast.FunctionAssignment;
import tyr.tooling.sdk.ast.FunctionBody;
import tyr.tooling.sdk.ast.FunctionRealization;
import tyr.tooling.sdk.ast.FunctionType;
import tyr.tooling.sdk.ast.GlobalDestructor;
import tyr.tooling.sdk.ast.GlobalInitializer;
import tyr.tooling.sdk.ast.IfExpression;
import tyr.tooling.sdk.ast.ImportExpression;
import tyr.tooling.sdk.ast.IntLiteral;
import tyr.tooling.sdk.ast.InterfaceDef;
import tyr.tooling.sdk.ast.Literal;
import tyr.tooling.sdk.ast.MemberAccess;
import tyr.tooling.sdk.ast.Message;
import tyr.tooling.sdk.ast.Namespace;
import tyr.tooling.sdk.ast.Node;
import tyr.tooling.sdk.ast.NullLiteral;
import tyr.tooling.sdk.ast.OperatorApplication;
import tyr.tooling.sdk.ast.OperatorUsage;
import tyr.tooling.sdk.ast.OverrideVisible;
import tyr.tooling.sdk.ast.Package;
import tyr.tooling.sdk.ast.PackageVisible;
import tyr.tooling.sdk.ast.Parameter;
import tyr.tooling.sdk.ast.Position;
import tyr.tooling.sdk.ast.PropertyDef;
import tyr.tooling.sdk.ast.PublicVisible;
import tyr.tooling.sdk.ast.RTApplication;
import tyr.tooling.sdk.ast.RestrictedVisible;
import tyr.tooling.sdk.ast.ReturnExpression;
import tyr.tooling.sdk.ast.StaticAccess;
import tyr.tooling.sdk.ast.StaticTypeAccess;
import tyr.tooling.sdk.ast.StringLiteral;
import tyr.tooling.sdk.ast.SuperConstructorCall;
import tyr.tooling.sdk.ast.SuperDestructorCall;
import tyr.tooling.sdk.ast.SwitchCase;
import tyr.tooling.sdk.ast.SwitchExpression;
import tyr.tooling.sdk.ast.SwitchLike;
import tyr.tooling.sdk.ast.Test;
import tyr.tooling.sdk.ast.ThrowExpression;
import tyr.tooling.sdk.ast.TopLevelNode;
import tyr.tooling.sdk.ast.TryExpression;
import tyr.tooling.sdk.ast.TypeDef;
import tyr.tooling.sdk.ast.TypeLike;
import tyr.tooling.sdk.ast.TypeMember;
import tyr.tooling.sdk.ast.TypeWithMembers;
import tyr.tooling.sdk.ast.ValueParameter;
import tyr.tooling.sdk.ast.VariableDef;
import tyr.tooling.sdk.ast.Visibility;
import tyr.tooling.sdk.ast.Visitor;
import tyr.tooling.sdk.ast.WhileLoop;

/**
 * Create a simple human-readable presentation of a node. The intended usage is error messages, basic UI elements and
 * documentation.
 *
 * @implNote code is currently optimized for clarity not for efficiency. Eventually, it might be required to delegate to
 *    another visitor using a string builder.
 *
 * @author Timm Felden
 */
public class Pretty extends Visitor<String, Void, RuntimeException> {

   @Override
   public String visit(File self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Node self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FileNode self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ExtEntity self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Namespace self, Void arg) throws RuntimeException {
      if (null == self.getParent())
         return "_root_";

      if (null == self.getParent().getParent())
         return self.getName();

      return visit(self.getParent(), null) + "." + self.getName();
   }

   @Override
   public String visit(Parameter self, Void arg) throws RuntimeException {
      return self.getName();
   }

   @Override
   public String visit(BlankParameter self, Void arg) throws RuntimeException {
      return self.getName();
   }

   @Override
   public String visit(ValueParameter self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(DocComment self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Expression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Block self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Literal self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(IntLiteral self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(BoolLiteral self, Void arg) throws RuntimeException {
      return self.getValue()
            ? "true"
            : "false";
   }

   @Override
   public String visit(CharLiteral self, Void arg) throws RuntimeException {
      return String.format("'%s'", Character.toString((int) self.getValue()));
   }

   @Override
   public String visit(NullLiteral self, Void arg) throws RuntimeException {
      return "null";
   }

   @Override
   public String visit(FloatLiteral self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(StringLiteral self, Void arg) throws RuntimeException {
      if (self.getValue().contains("\""))
         return String.format("\"\"\"%s\"\"\"", self.getValue());

      return String.format("\"%s\"", self.getValue());
   }

   @Override
   public String visit(Allocation self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(VariableDef self, Void arg) throws RuntimeException {
      return self.getName();
   }

   @Override
   public String visit(Deallocation self, Void arg) throws RuntimeException {
      return "delete " + String.join(", ", self.getTarget().stream().map(t -> t.accept(this, null)).toList());
   }

   @Override
   public String visit(FunctionType self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(MemberAccess self, Void arg) throws RuntimeException {
      return self.getTarget().accept(this, null) + "." + self.getName();
   }

   @Override
   public String visit(StaticAccess self, Void arg) throws RuntimeException {
      return self.getName();
   }

   @Override
   public String visit(CTApplication self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(OperatorUsage self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(RTApplication self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ImportExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(StaticTypeAccess self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(BinderApplication self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(DynamicTypeAccess self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(BranchingExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(SwitchLike self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TryExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(SwitchExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(IfExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(BreakExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ThrowExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ReturnExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ContinueExpression self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(BreakContinueTarget self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(WhileLoop self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(DoWhileLoop self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(OperatorApplication self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(SuperDestructorCall self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(SuperConstructorCall self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(SwitchCase self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TypeMember self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Test self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Field self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Function self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Destructor self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Constructor self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(GlobalDestructor self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(GlobalInitializer self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(EnumInstance self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TopLevelNode self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(AliasDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TypeLike self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(EnumDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(PropertyDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(EnumUnionDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TypeWithMembers self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(TypeDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ClassDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(InterfaceDef self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FormalParameter self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FormalCTParameter self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ConstructorParameter self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FunctionRealization self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FunctionBody self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(ExternFunction self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(AbstractFunction self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(FunctionAssignment self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(DocTag self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Message self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Package self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Position self, Void arg) throws RuntimeException {
      throw new RuntimeException("todo");
   }

   @Override
   public String visit(Visibility self, Void arg) throws RuntimeException {
      throw new NoSuchMethodError();
   }

   @Override
   public String visit(PublicVisible self, Void arg) throws RuntimeException {
      return "public";
   }

   @Override
   public String visit(PackageVisible self, Void arg) throws RuntimeException {
      return "";
   }

   @Override
   public String visit(OverrideVisible self, Void arg) throws RuntimeException {
      if (null != self.getTargets())
         throw new RuntimeException("todo");

      return "override";
   }

   @Override
   public String visit(RestrictedVisible self, Void arg) throws RuntimeException {
      var r = new StringBuilder();

      if (self.getIsProtected()) {
         r.append("protected");
         if (null != self.getProtected())
            throw new RuntimeException("todo");
      }

      if (self.getIsPrivate()) {
         if (self.getIsProtected())
            r.append(" ");

         r.append("private");
         if (null != self.getPrivate())
            throw new RuntimeException("todo");
      }

      return r.toString();
   }

   @Override
   public String visit(DocParagraph self, Void arg) throws RuntimeException {
      return String.join(" ", self.getWords());
   }

}
