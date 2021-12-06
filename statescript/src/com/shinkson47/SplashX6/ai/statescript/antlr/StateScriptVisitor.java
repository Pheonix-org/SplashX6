// Generated from /Volumes/The Vault/Workspaces/Java/SplashX6/statescript/src/com/shinkson47/SplashX6/ai/statescript/grammar/StateScript.g4 by ANTLR 4.9.1
package com.shinkson47.SplashX6.ai.statescript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(StateScriptParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(StateScriptParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#defaultState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultState(StateScriptParser.DefaultStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#behaviour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviour(StateScriptParser.BehaviourContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enterScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterScript(StateScriptParser.EnterScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#exitScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitScript(StateScriptParser.ExitScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(StateScriptParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#switchState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchState(StateScriptParser.SwitchStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(StateScriptParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(StateScriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(StateScriptParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(StateScriptParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(StateScriptParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(StateScriptParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceDeclaration(StateScriptParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiers(StateScriptParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(StateScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(StateScriptParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(StateScriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(StateScriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(StateScriptParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(StateScriptParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(StateScriptParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(StateScriptParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(StateScriptParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(StateScriptParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(StateScriptParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(StateScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(StateScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(StateScriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(StateScriptParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(StateScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(StateScriptParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(StateScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(StateScriptParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(StateScriptParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorDecl(StateScriptParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorRest(StateScriptParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(StateScriptParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(StateScriptParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(StateScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDecl(StateScriptParser.InterfaceMemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldDecl(StateScriptParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldRest(StateScriptParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaratorRest(StateScriptParser.MethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclaratorRest(StateScriptParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaratorRest(StateScriptParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceGenericMethodDecl(StateScriptParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidInterfaceMethodDeclaratorRest(StateScriptParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaratorRest(StateScriptParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(StateScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(StateScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(StateScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorsRest(StateScriptParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorRest(StateScriptParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(StateScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(StateScriptParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(StateScriptParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(StateScriptParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(StateScriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(StateScriptParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(StateScriptParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StateScriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(StateScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(StateScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(StateScriptParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(StateScriptParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(StateScriptParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(StateScriptParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(StateScriptParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDecls(StateScriptParser.FormalParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDeclsRest(StateScriptParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(StateScriptParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(StateScriptParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(StateScriptParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(StateScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(StateScriptParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(StateScriptParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(StateScriptParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(StateScriptParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(StateScriptParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(StateScriptParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(StateScriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(StateScriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(StateScriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(StateScriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(StateScriptParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(StateScriptParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(StateScriptParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(StateScriptParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(StateScriptParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StateScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(StateScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(StateScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(StateScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(StateScriptParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StateScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(StateScriptParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(StateScriptParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(StateScriptParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(StateScriptParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(StateScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(StateScriptParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(StateScriptParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(StateScriptParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroups(StateScriptParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(StateScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(StateScriptParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(StateScriptParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(StateScriptParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(StateScriptParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(StateScriptParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(StateScriptParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(StateScriptParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(StateScriptParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(StateScriptParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StateScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(StateScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(StateScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(StateScriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(StateScriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(StateScriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(StateScriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(StateScriptParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(StateScriptParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(StateScriptParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(StateScriptParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(StateScriptParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(StateScriptParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(StateScriptParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(StateScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(StateScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(StateScriptParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(StateScriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(StateScriptParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(StateScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(StateScriptParser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(StateScriptParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(StateScriptParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(StateScriptParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(StateScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(StateScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(StateScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(StateScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(StateScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(StateScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(StateScriptParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(StateScriptParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(StateScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(StateScriptParser.ArgumentsContext ctx);
}