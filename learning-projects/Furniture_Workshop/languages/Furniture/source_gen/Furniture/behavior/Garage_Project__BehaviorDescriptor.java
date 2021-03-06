package Furniture.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Garage_Project__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0xe2c2524837734879L, 0x8bfc859bbe4db0d8L, 0x7a2187a2b23dc5b1L, "Furniture.structure.Garage_Project");

  public static final SMethod<Integer> getExpenses_id7CxxUaMfVk1 = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("getExpenses").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7CxxUaMfVk1").build();
  public static final SMethod<Integer> getPrice_id7CxxUaMg2un = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.TYPE)).name("getPrice").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7CxxUaMg2un").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getExpenses_id7CxxUaMfVk1, getPrice_id7CxxUaMg2un);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static int getExpenses_id7CxxUaMfVk1(@NotNull SNode __thisNode__) {
    int expenses = 0;
    for (SNode component : SLinkOperations.getChildren(__thisNode__, LINKS.components$_S9g)) {
      expenses += SPropertyOperations.getInteger(SLinkOperations.getTarget(component, LINKS.component$_Lyp), PROPS.price$Qapg) * SPropertyOperations.getInteger(component, PROPS.quantity$_L4n);
    }
    return expenses;
  }
  /*package*/ static int getPrice_id7CxxUaMg2un(@NotNull SNode __thisNode__) {
    return ((int) Garage_Project__BehaviorDescriptor.getExpenses_id7CxxUaMfVk1.invoke(__thisNode__)) * 2;
  }

  /*package*/ Garage_Project__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Integer) getExpenses_id7CxxUaMfVk1(node));
      case 1:
        return (T) ((Integer) getPrice_id7CxxUaMg2un(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink components$_S9g = MetaAdapterFactory.getContainmentLink(0xe2c2524837734879L, 0x8bfc859bbe4db0d8L, 0x7a2187a2b23dc5b1L, 0x7a2187a2b23dc5b6L, "components");
    /*package*/ static final SReferenceLink component$_Lyp = MetaAdapterFactory.getReferenceLink(0xe2c2524837734879L, 0x8bfc859bbe4db0d8L, 0x7a2187a2b23dc5acL, 0x7a2187a2b23dc5afL, "component");
  }

  private static final class PROPS {
    /*package*/ static final SProperty quantity$_L4n = MetaAdapterFactory.getProperty(0xe2c2524837734879L, 0x8bfc859bbe4db0d8L, 0x7a2187a2b23dc5acL, 0x7a2187a2b23dc5adL, "quantity");
    /*package*/ static final SProperty price$Qapg = MetaAdapterFactory.getProperty(0xe2c2524837734879L, 0x8bfc859bbe4db0d8L, 0x7a2187a2b23c5e16L, 0x7a2187a2b23c5e1bL, "price");
  }
}
