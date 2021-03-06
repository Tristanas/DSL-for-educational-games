package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import java.util.Collection;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.lesson$91Ko), LINKS.LessonRef$aYr2), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_1_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.question$rRt2);
  }
  public static Object propertyMacro_GetValue_1_2(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_3(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.correctAnswer$ofSB), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_4(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.correctAnswer$ofSB), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_5(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.Name$ZyJG);
  }
  public static Object propertyMacro_GetValue_1_6(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.Description$ZC93);
  }
  public static Object propertyMacro_GetValue_1_7(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.width$fASQ);
  }
  public static Object propertyMacro_GetValue_1_8(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.height$fB7R);
  }
  public static Object propertyMacro_GetValue_1_9(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.bombs$fBmS);
  }
  public static Object propertyMacro_GetValue_1_10(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.lives$FIRj);
  }
  public static Object propertyMacro_GetValue_1_11(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.specialEffects$1T8K);
  }
  public static Object propertyMacro_GetValue_1_12(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), PROPS.factsCount$yrJ0);
  }
  public static Object propertyMacro_GetValue_1_13(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), PROPS.questionsQount$YSIm);
  }
  public static Object propertyMacro_GetValue_1_14(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.difficulty$5ewA), LINKS.difficultyRef$yEpj), PROPS.reveals$FJll);
  }
  public static Object propertyMacro_GetValue_1_15(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.lesson$91Ko), LINKS.LessonRef$aYr2), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_1_16(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.topic$L$Tc), LINKS.topicRef$wps$), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_1_17(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.question$rRt2);
  }
  public static Object propertyMacro_GetValue_1_18(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_19(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.correctAnswer$ofSB), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_20(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.correctAnswer$ofSB), PROPS.text$ofa7);
  }
  public static Object propertyMacro_GetValue_1_21(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.width$fASQ);
  }
  public static Object propertyMacro_GetValue_1_22(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.height$fB7R);
  }
  public static Object propertyMacro_GetValue_1_23(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.bombs$fBmS);
  }
  public static Object propertyMacro_GetValue_1_24(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.lives$FIRj);
  }
  public static Object propertyMacro_GetValue_1_25(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.specialEffects$1T8K);
  }
  public static Object propertyMacro_GetValue_1_26(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), PROPS.questionsQount$YSIm);
  }
  public static Object propertyMacro_GetValue_1_27(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.difficulty$4Kkk), LINKS.difficultyRef$yEpj), PROPS.reveals$FJll);
  }
  public static Object propertyMacro_GetValue_1_28(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.topic$L$Tc), LINKS.topicRef$wps$), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_1_29(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static boolean ifMacro_Condition_1_0(final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), PROPS.teacherApp$K_72);
  }
  public static boolean ifMacro_Condition_1_1(final IfMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.topic$L$Tc), LINKS.topicRef$wps$), LINKS.Test$bFOf) != null;
  }
  public static boolean ifMacro_Condition_1_2(final IfMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj) != null;
  }
  public static Iterable<SNode> sourceNodesQuery_1_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.incorrectAnswers$ogmD);
  }
  public static Iterable<SNode> sourceNodesQuery_1_1(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.lesson$91Ko), LINKS.LessonRef$aYr2), LINKS.Questions$DWXJ);
  }
  public static Iterable<SNode> sourceNodesQuery_1_2(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.lesson$91Ko), LINKS.LessonRef$aYr2), LINKS.Facts$YWXG);
  }
  public static Iterable<SNode> sourceNodesQuery_1_3(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.learningLevels$h2Gi);
  }
  public static Iterable<SNode> sourceNodesQuery_1_4(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.incorrectAnswers$ogmD);
  }
  public static Iterable<SNode> sourceNodesQuery_1_5(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.levelCollection$x$UM), LINKS.testLevel$NYj), LINKS.topic$L$Tc), LINKS.topicRef$wps$), LINKS.Test$bFOf), LINKS.questions$3WMF);
  }
  public static Iterable<SNode> sourceNodesQuery_1_6(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.levelCollections$9hLc);
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("6383579779442773738", new SNsQ(i++));
    snsqMethods.put("6383579779442773773", new SNsQ(i++));
    snsqMethods.put("6383579779442773812", new SNsQ(i++));
    snsqMethods.put("6383579779442773972", new SNsQ(i++));
    snsqMethods.put("6383579779442774031", new SNsQ(i++));
    snsqMethods.put("6383579779442774066", new SNsQ(i++));
    snsqMethods.put("6383579779442774265", new SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    SourceNodesQuery query = identity.forFunctionNode(snsqMethods);
    return (query != null ? query : super.getSourceNodesQuery(identity));
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_0(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_1(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_2(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_3(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_4(ctx));
        case 5:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_5(ctx));
        case 6:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_6(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("6383579779442773700", new PVQ(i++, MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x229012ddae35f05L, "value"), "\"name\""));
    pvqMethods.put("6383579779442773727", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Is it okay to sweep mines?"));
    pvqMethods.put("6383579779442773744", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "wrongAnswers"));
    pvqMethods.put("6383579779442773752", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Answer"));
    pvqMethods.put("6383579779442773763", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Answer"));
    pvqMethods.put("6383579779442773796", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Name"));
    pvqMethods.put("6383579779442773804", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Description"));
    pvqMethods.put("6383579779442773865", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "8"));
    pvqMethods.put("6383579779442773877", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "8"));
    pvqMethods.put("6383579779442773889", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "10"));
    pvqMethods.put("6383579779442773901", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "2"));
    pvqMethods.put("6383579779442773917", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "1"));
    pvqMethods.put("6383579779442773929", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "2"));
    pvqMethods.put("6383579779442773937", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "4"));
    pvqMethods.put("6383579779442773947", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "1"));
    pvqMethods.put("6383579779442773828", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "name"));
    pvqMethods.put("1545923617533088420", new PVQ(i++, MetaAdapterFactory.getProperty(0xc7fb639fbe784307L, 0x89b0b5959c3fa8c8L, 0x229012ddae35f04L, 0x229012ddae35f05L, "value"), "\"Name\""));
    pvqMethods.put("6383579779442774020", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Is it okay to sweep mines?"));
    pvqMethods.put("6383579779442774037", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "wrongAnswers"));
    pvqMethods.put("6383579779442774045", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Answer"));
    pvqMethods.put("6383579779442774056", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Answer"));
    pvqMethods.put("6383579779442774125", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "8"));
    pvqMethods.put("6383579779442774141", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "8"));
    pvqMethods.put("6383579779442774157", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "10"));
    pvqMethods.put("6383579779442774173", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "2"));
    pvqMethods.put("6383579779442774193", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "1"));
    pvqMethods.put("6383579779442774210", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "4"));
    pvqMethods.put("6383579779442774224", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "1"));
    pvqMethods.put("6383579779442774084", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "name"));
    pvqMethods.put("2388291872900261601", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "Minesweeper"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    PropertyValueQuery query = identity.forTemplateNode(pvqMethods);
    return (query != null ? query : super.getPropertyValueQuery(identity));
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetValue_1_1(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_1_2(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_1_3(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetValue_1_4(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetValue_1_5(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetValue_1_6(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetValue_1_7(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetValue_1_8(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetValue_1_9(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetValue_1_10(ctx);
        case 11:
          return QueriesGenerated.propertyMacro_GetValue_1_11(ctx);
        case 12:
          return QueriesGenerated.propertyMacro_GetValue_1_12(ctx);
        case 13:
          return QueriesGenerated.propertyMacro_GetValue_1_13(ctx);
        case 14:
          return QueriesGenerated.propertyMacro_GetValue_1_14(ctx);
        case 15:
          return QueriesGenerated.propertyMacro_GetValue_1_15(ctx);
        case 16:
          return QueriesGenerated.propertyMacro_GetValue_1_16(ctx);
        case 17:
          return QueriesGenerated.propertyMacro_GetValue_1_17(ctx);
        case 18:
          return QueriesGenerated.propertyMacro_GetValue_1_18(ctx);
        case 19:
          return QueriesGenerated.propertyMacro_GetValue_1_19(ctx);
        case 20:
          return QueriesGenerated.propertyMacro_GetValue_1_20(ctx);
        case 21:
          return QueriesGenerated.propertyMacro_GetValue_1_21(ctx);
        case 22:
          return QueriesGenerated.propertyMacro_GetValue_1_22(ctx);
        case 23:
          return QueriesGenerated.propertyMacro_GetValue_1_23(ctx);
        case 24:
          return QueriesGenerated.propertyMacro_GetValue_1_24(ctx);
        case 25:
          return QueriesGenerated.propertyMacro_GetValue_1_25(ctx);
        case 26:
          return QueriesGenerated.propertyMacro_GetValue_1_26(ctx);
        case 27:
          return QueriesGenerated.propertyMacro_GetValue_1_27(ctx);
        case 28:
          return QueriesGenerated.propertyMacro_GetValue_1_28(ctx);
        case 29:
          return QueriesGenerated.propertyMacro_GetValue_1_29(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("1192959622837718206", new IfMC(i++));
    imcMethods.put("1545923617532754775", new IfMC(i++));
    imcMethods.put("6383579779442774252", new IfMC(i++));
  }
  @NotNull
  @Override
  public IfMacroCondition getIfMacroCondition(@NotNull QueryKey identity) {
    IfMacroCondition query = identity.forTemplateNode(imcMethods);
    return (query != null ? query : super.getIfMacroCondition(identity));
  }
  private static class IfMC implements IfMacroCondition {
    private final int methodKey;
    public IfMC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull IfMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.ifMacro_Condition_1_0(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_1_1(ctx);
        case 2:
          return QueriesGenerated.ifMacro_Condition_1_2(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink lesson$91Ko = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ac9L, 0x7a874f564887f02fL, "lesson");
    /*package*/ static final SReferenceLink LessonRef$aYr2 = MetaAdapterFactory.getReferenceLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x7a874f564887f1eaL, 0x7a874f564887f1fcL, "LessonRef");
    /*package*/ static final SContainmentLink correctAnswer$ofSB = MetaAdapterFactory.getContainmentLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L, 0x2124eace002ddad5L, "correctAnswer");
    /*package*/ static final SContainmentLink difficulty$5ewA = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ac9L, 0x7a874f5648b6ab58L, "difficulty");
    /*package*/ static final SReferenceLink difficultyRef$yEpj = MetaAdapterFactory.getReferenceLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648af8279L, 0x7a874f5648af828dL, "difficultyRef");
    /*package*/ static final SReferenceLink levelCollection$x$UM = MetaAdapterFactory.getReferenceLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f56488c1679L, 0x7a874f56488c168cL, "levelCollection");
    /*package*/ static final SContainmentLink testLevel$NYj = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f564887ef38L, 0x7a874f564887ef4cL, "testLevel");
    /*package*/ static final SContainmentLink topic$L$Tc = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ae8L, 0xe6e29df31a656e5L, "topic");
    /*package*/ static final SReferenceLink topicRef$wps$ = MetaAdapterFactory.getReferenceLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0xe6e29df31a5e180L, 0xe6e29df31a5e194L, "topicRef");
    /*package*/ static final SContainmentLink difficulty$4Kkk = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ae8L, 0x72edabd130ddb607L, "difficulty");
    /*package*/ static final SReferenceLink Test$bFOf = MetaAdapterFactory.getReferenceLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd72d0L, 0x3d6df2112a121d3eL, "Test");
    /*package*/ static final SContainmentLink incorrectAnswers$ogmD = MetaAdapterFactory.getContainmentLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L, 0x2124eace002ddad7L, "incorrectAnswers");
    /*package*/ static final SContainmentLink Questions$DWXJ = MetaAdapterFactory.getContainmentLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd72efL, 0x416b6ea5b9bdd627L, "Questions");
    /*package*/ static final SContainmentLink Facts$YWXG = MetaAdapterFactory.getContainmentLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd72efL, 0x101a8b55effd99f9L, "Facts");
    /*package*/ static final SContainmentLink learningLevels$h2Gi = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f564887ef38L, 0x7a874f56488802d8L, "learningLevels");
    /*package*/ static final SContainmentLink questions$3WMF = MetaAdapterFactory.getContainmentLink(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x4f72901c38e58a6dL, 0x2124eace002ddbbeL, "questions");
    /*package*/ static final SContainmentLink levelCollections$9hLc = MetaAdapterFactory.getContainmentLink(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f564887efceL, 0x7a874f56488801bbL, "levelCollections");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty question$rRt2 = MetaAdapterFactory.getProperty(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad4L, 0x2124eace002ddb3eL, "question");
    /*package*/ static final SProperty text$ofa7 = MetaAdapterFactory.getProperty(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x2124eace002ddad1L, 0x2124eace002ddad2L, "text");
    /*package*/ static final SProperty Name$ZyJG = MetaAdapterFactory.getProperty(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd730eL, 0x101a8b55effd9a2eL, "Name");
    /*package*/ static final SProperty Description$ZC93 = MetaAdapterFactory.getProperty(0xf086fa03c1954951L, 0xa78fbf3bd377c791L, 0x101a8b55effd730eL, 0x101a8b55effd9a30L, "Description");
    /*package*/ static final SProperty width$fASQ = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648971367L, "width");
    /*package*/ static final SProperty height$fB7R = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648971368L, "height");
    /*package*/ static final SProperty bombs$fBmS = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648971369L, "bombs");
    /*package*/ static final SProperty lives$FIRj = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648a61810L, "lives");
    /*package*/ static final SProperty specialEffects$1T8K = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648a61ac2L, "specialEffects");
    /*package*/ static final SProperty factsCount$yrJ0 = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x101a8b55effd9ac9L, 0xe6e29df31637f1cL, "factsCount");
    /*package*/ static final SProperty questionsQount$YSIm = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x6cece7c61cb7d2b1L, 0x7a874f5648a6183dL, "questionsQount");
    /*package*/ static final SProperty reveals$FJll = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f5648971366L, 0x7a874f5648a61812L, "reveals");
    /*package*/ static final SProperty teacherApp$K_72 = MetaAdapterFactory.getProperty(0x8f66faecbf224d22L, 0x897476ccb51727aeL, 0x7a874f564887efceL, 0x42ff3555e6de9f1cL, "teacherApp");
  }
}
