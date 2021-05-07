package Minesweeper.editor;

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
        return Collections.<ConceptEditor>singletonList(new Difficulty_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new DifficultyRef_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new LearningLevel_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new LevelCollection_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new TestLevel_Editor());
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
        return Collections.<SubstituteMenu>singletonList(new DifficultyRef_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new LevelCollectionRef_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L), MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648af8279L), MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ac9L), MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f564887ef38L), MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ae8L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648af8279L), MetaIdFactory.conceptId(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f56488c1679L)).seal();
}
