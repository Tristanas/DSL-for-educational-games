package Education.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAnswer = createDescriptorForAnswer();
  /*package*/ final ConceptDescriptor myConceptSimpleTest = createDescriptorForSimpleTest();
  /*package*/ final ConceptDescriptor myConceptSingleChoiceQuestion = createDescriptorForSingleChoiceQuestion();
  /*package*/ final ConceptDescriptor myConceptTestReference = createDescriptorForTestReference();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAnswer, myConceptSimpleTest, myConceptSingleChoiceQuestion, myConceptTestReference);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Answer:
        return myConceptAnswer;
      case LanguageConceptSwitch.SimpleTest:
        return myConceptSimpleTest;
      case LanguageConceptSwitch.SingleChoiceQuestion:
        return myConceptSingleChoiceQuestion;
      case LanguageConceptSwitch.TestReference:
        return myConceptTestReference;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList();
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAnswer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Education", "Answer", 0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad1L);
    b.class_(false, false, false);
    b.origin("r:e50e3323-bf4b-4477-ac62-28fa501ce249(Education.structure)/2388291872900373201");
    b.version(2);
    b.property("text", 0x2124eace002ddad2L).type(PrimitiveTypeId.STRING).origin("2388291872900373202").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSimpleTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Education", "SimpleTest", 0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e58a6dL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e50e3323-bf4b-4477-ac62-28fa501ce249(Education.structure)/5724796527229373037");
    b.version(2);
    b.aggregate("questions", 0x2124eace002ddbbeL).target(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L).optional(true).ordered(true).multiple(true).origin("2388291872900373438").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSingleChoiceQuestion() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Education", "SingleChoiceQuestion", 0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L);
    b.class_(false, false, false);
    b.origin("r:e50e3323-bf4b-4477-ac62-28fa501ce249(Education.structure)/2388291872900373204");
    b.version(2);
    b.property("question", 0x2124eace002ddb3eL).type(PrimitiveTypeId.STRING).origin("2388291872900373310").done();
    b.aggregate("correctAnswer", 0x2124eace002ddad5L).target(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad1L).optional(false).ordered(true).multiple(false).origin("2388291872900373205").done();
    b.aggregate("incorrectAnswers", 0x2124eace002ddad7L).target(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad1L).optional(false).ordered(true).multiple(true).origin("2388291872900373207").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Education", "TestReference", 0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e5a8a0L);
    b.class_(false, false, false);
    b.origin("r:e50e3323-bf4b-4477-ac62-28fa501ce249(Education.structure)/5724796527229380768");
    b.version(2);
    b.associate("testReference", 0x4f72901c38f02137L).target(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e58a6dL).optional(false).origin("5724796527230066999").done();
    return b.create();
  }
}