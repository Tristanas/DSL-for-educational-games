package Education.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Answer;
  private ConceptPresentation props_Fact;
  private ConceptPresentation props_Lesson;
  private ConceptPresentation props_LessonReference;
  private ConceptPresentation props_SimpleTest;
  private ConceptPresentation props_SingleChoiceQuestion;
  private ConceptPresentation props_Subject;
  private ConceptPresentation props_TestReference;
  private ConceptPresentation props_Topic;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Answer:
        if (props_Answer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Answer");
          props_Answer = cpb.create();
        }
        return props_Answer;
      case LanguageConceptSwitch.Fact:
        if (props_Fact == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Fact");
          props_Fact = cpb.create();
        }
        return props_Fact;
      case LanguageConceptSwitch.Lesson:
        if (props_Lesson == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Lesson = cpb.create();
        }
        return props_Lesson;
      case LanguageConceptSwitch.LessonReference:
        if (props_LessonReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x7a874f564887f1eaL, 0x7a874f564887f1fcL, "LessonRef", "", "");
          props_LessonReference = cpb.create();
        }
        return props_LessonReference;
      case LanguageConceptSwitch.SimpleTest:
        if (props_SimpleTest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_SimpleTest = cpb.create();
        }
        return props_SimpleTest;
      case LanguageConceptSwitch.SingleChoiceQuestion:
        if (props_SingleChoiceQuestion == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("SingleChoiceQuestion");
          props_SingleChoiceQuestion = cpb.create();
        }
        return props_SingleChoiceQuestion;
      case LanguageConceptSwitch.Subject:
        if (props_Subject == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Subject");
          props_Subject = cpb.create();
        }
        return props_Subject;
      case LanguageConceptSwitch.TestReference:
        if (props_TestReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e5a8a0L, 0x4f72901c38f02137L, "testReference", "", "");
          props_TestReference = cpb.create();
        }
        return props_TestReference;
      case LanguageConceptSwitch.Topic:
        if (props_Topic == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Topic");
          props_Topic = cpb.create();
        }
        return props_Topic;
    }
    return null;
  }
}
