package Education.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Answer_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Fact_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Lesson_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new LessonReference_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new SimpleTest_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new SingleChoiceQuestion_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new TestReference_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new LessonReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new TestReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad1L), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd730eL), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd72efL), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x7a874f564887f1eaL), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e58a6dL), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e5a8a0L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x7a874f564887f1eaL), MetaIdFactory.conceptId(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e5a8a0L)).seal();
}
