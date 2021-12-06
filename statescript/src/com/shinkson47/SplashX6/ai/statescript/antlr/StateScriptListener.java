// Generated from /Volumes/The Vault/Workspaces/Java/SplashX6/statescript/src/com/shinkson47/SplashX6/ai/statescript/grammar/StateScript.g4 by ANTLR 4.9.1
package com.shinkson47.SplashX6.ai.statescript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateScriptParser}.
 */
public interface StateScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StateScriptParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StateScriptParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(StateScriptParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(StateScriptParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#defaultState}.
	 * @param ctx the parse tree
	 */
	void enterDefaultState(StateScriptParser.DefaultStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#defaultState}.
	 * @param ctx the parse tree
	 */
	void exitDefaultState(StateScriptParser.DefaultStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#behaviour}.
	 * @param ctx the parse tree
	 */
	void enterBehaviour(StateScriptParser.BehaviourContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#behaviour}.
	 * @param ctx the parse tree
	 */
	void exitBehaviour(StateScriptParser.BehaviourContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enterScript}.
	 * @param ctx the parse tree
	 */
	void enterEnterScript(StateScriptParser.EnterScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enterScript}.
	 * @param ctx the parse tree
	 */
	void exitEnterScript(StateScriptParser.EnterScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#exitScript}.
	 * @param ctx the parse tree
	 */
	void enterExitScript(StateScriptParser.ExitScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#exitScript}.
	 * @param ctx the parse tree
	 */
	void exitExitScript(StateScriptParser.ExitScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(StateScriptParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(StateScriptParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#switchState}.
	 * @param ctx the parse tree
	 */
	void enterSwitchState(StateScriptParser.SwitchStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#switchState}.
	 * @param ctx the parse tree
	 */
	void exitSwitchState(StateScriptParser.SwitchStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(StateScriptParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(StateScriptParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(StateScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(StateScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(StateScriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(StateScriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(StateScriptParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(StateScriptParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(StateScriptParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(StateScriptParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(StateScriptParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(StateScriptParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(StateScriptParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(StateScriptParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(StateScriptParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(StateScriptParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(StateScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(StateScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(StateScriptParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(StateScriptParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(StateScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(StateScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(StateScriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(StateScriptParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(StateScriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(StateScriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(StateScriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(StateScriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(StateScriptParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(StateScriptParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(StateScriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(StateScriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(StateScriptParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(StateScriptParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(StateScriptParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(StateScriptParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(StateScriptParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(StateScriptParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(StateScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(StateScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(StateScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(StateScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(StateScriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(StateScriptParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(StateScriptParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(StateScriptParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(StateScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(StateScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(StateScriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(StateScriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(StateScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(StateScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(StateScriptParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(StateScriptParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(StateScriptParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(StateScriptParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorDecl(StateScriptParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorDecl(StateScriptParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorRest(StateScriptParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorRest(StateScriptParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(StateScriptParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(StateScriptParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(StateScriptParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(StateScriptParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(StateScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(StateScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDecl(StateScriptParser.InterfaceMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDecl(StateScriptParser.InterfaceMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldDecl(StateScriptParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldDecl(StateScriptParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldRest(StateScriptParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldRest(StateScriptParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaratorRest(StateScriptParser.MethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaratorRest(StateScriptParser.MethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(StateScriptParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(StateScriptParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaratorRest(StateScriptParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaratorRest(StateScriptParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceGenericMethodDecl(StateScriptParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceGenericMethodDecl(StateScriptParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidInterfaceMethodDeclaratorRest(StateScriptParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidInterfaceMethodDeclaratorRest(StateScriptParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaratorRest(StateScriptParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaratorRest(StateScriptParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(StateScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(StateScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(StateScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(StateScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(StateScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(StateScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(StateScriptParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(StateScriptParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(StateScriptParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(StateScriptParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(StateScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(StateScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(StateScriptParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(StateScriptParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(StateScriptParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(StateScriptParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(StateScriptParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(StateScriptParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(StateScriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(StateScriptParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(StateScriptParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(StateScriptParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(StateScriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(StateScriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StateScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StateScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(StateScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(StateScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(StateScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(StateScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(StateScriptParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(StateScriptParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(StateScriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(StateScriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(StateScriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(StateScriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(StateScriptParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(StateScriptParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(StateScriptParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(StateScriptParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(StateScriptParser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(StateScriptParser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(StateScriptParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(StateScriptParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(StateScriptParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(StateScriptParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(StateScriptParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(StateScriptParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(StateScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(StateScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(StateScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(StateScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(StateScriptParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(StateScriptParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(StateScriptParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(StateScriptParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(StateScriptParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(StateScriptParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(StateScriptParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(StateScriptParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(StateScriptParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(StateScriptParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(StateScriptParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(StateScriptParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(StateScriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(StateScriptParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(StateScriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(StateScriptParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(StateScriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(StateScriptParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(StateScriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(StateScriptParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(StateScriptParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(StateScriptParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(StateScriptParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(StateScriptParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(StateScriptParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(StateScriptParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(StateScriptParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(StateScriptParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(StateScriptParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(StateScriptParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StateScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StateScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(StateScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(StateScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(StateScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(StateScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(StateScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(StateScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(StateScriptParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(StateScriptParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StateScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StateScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(StateScriptParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(StateScriptParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(StateScriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(StateScriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(StateScriptParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(StateScriptParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(StateScriptParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(StateScriptParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(StateScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(StateScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(StateScriptParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(StateScriptParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(StateScriptParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(StateScriptParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(StateScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(StateScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(StateScriptParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(StateScriptParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(StateScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(StateScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(StateScriptParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(StateScriptParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(StateScriptParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(StateScriptParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(StateScriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(StateScriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(StateScriptParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(StateScriptParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(StateScriptParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(StateScriptParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(StateScriptParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(StateScriptParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(StateScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(StateScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(StateScriptParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(StateScriptParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(StateScriptParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(StateScriptParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StateScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StateScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(StateScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(StateScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(StateScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(StateScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(StateScriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(StateScriptParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(StateScriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(StateScriptParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(StateScriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(StateScriptParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(StateScriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(StateScriptParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(StateScriptParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(StateScriptParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(StateScriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(StateScriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(StateScriptParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(StateScriptParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(StateScriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(StateScriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(StateScriptParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(StateScriptParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(StateScriptParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(StateScriptParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(StateScriptParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(StateScriptParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(StateScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(StateScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(StateScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(StateScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(StateScriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(StateScriptParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(StateScriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(StateScriptParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(StateScriptParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(StateScriptParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(StateScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(StateScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(StateScriptParser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(StateScriptParser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(StateScriptParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(StateScriptParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(StateScriptParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(StateScriptParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(StateScriptParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(StateScriptParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(StateScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(StateScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(StateScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(StateScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(StateScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(StateScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(StateScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(StateScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(StateScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(StateScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(StateScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(StateScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(StateScriptParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(StateScriptParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(StateScriptParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(StateScriptParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(StateScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(StateScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(StateScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(StateScriptParser.ArgumentsContext ctx);
}