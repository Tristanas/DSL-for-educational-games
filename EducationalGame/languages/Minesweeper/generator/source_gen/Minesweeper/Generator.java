package Minesweeper;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModuleInterpreted2;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import main.QueriesGenerated;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;

public class Generator extends TemplateModuleInterpreted2 {

  public Generator(LanguageRegistry languageRegistry, LanguageRuntime sourceLanguage, jetbrains.mps.smodel.Generator generator) {
    super(languageRegistry, sourceLanguage, generator);
  }

  @NotNull
  @Override
  public SModuleReference getModuleReference() {
    return PersistenceFacade.getInstance().createModuleReference("e12af3e9-8538-46c4-8b97-41ac8896ba44(Minesweeper#01)");
  }

  @Override
  protected void fillTemplateModels(TemplateModuleInterpreted2.TemplateModels models) {
    models.templates("r:af9f2a0c-227a-421f-8221-a5797c4c093a", QueriesGenerated.class);
  }


  @Override
  public Collection<SLanguage> getTargetLanguages() {
    SLanguage[] rv = new SLanguage[4];
    rv[0] = MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage");
    rv[1] = MetaAdapterFactory.getLanguage(0xfd3920347849419dL, 0x907112563d152375L, "jetbrains.mps.baseLanguage.closures");
    rv[2] = MetaAdapterFactory.getLanguage(0xf280165065d5424eL, 0xbb1b463a8781b786L, "jetbrains.mps.baseLanguage.javadoc");
    rv[3] = MetaAdapterFactory.getLanguage(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, "jetbrains.mps.lang.text");
    return Arrays.asList(rv);
  }

}
