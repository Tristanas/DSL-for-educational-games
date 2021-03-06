<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7fc84f00-0d6e-4e92-a907-7624e0db57e3(EducationalGame.build-app)">
  <persistence version="9" />
  <languages>
    <use id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build" version="0" />
    <use id="0cf935df-4699-4e9c-a132-fa109541cba3" name="jetbrains.mps.build.mps" version="7" />
  </languages>
  <imports>
    <import index="ffeo" ref="r:874d959d-e3b4-4d04-b931-ca849af130dd(jetbrains.mps.ide.build)" />
  </imports>
  <registry>
    <language id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build">
      <concept id="5481553824944787378" name="jetbrains.mps.build.structure.BuildSourceProjectRelativePath" flags="ng" index="55IIr" />
      <concept id="9126048691954557131" name="jetbrains.mps.build.structure.BuildLayout_Comment" flags="ng" index="28u9K_">
        <property id="9126048691954700811" name="text" index="28hIV_" />
      </concept>
      <concept id="2755237150521975431" name="jetbrains.mps.build.structure.BuildVariableMacroInitWithString" flags="ng" index="aVJcg">
        <child id="2755237150521975437" name="value" index="aVJcq" />
      </concept>
      <concept id="7321017245476976379" name="jetbrains.mps.build.structure.BuildRelativePath" flags="ng" index="iG8Mu">
        <child id="7321017245477039051" name="compositePart" index="iGT6I" />
      </concept>
      <concept id="3767587139141066978" name="jetbrains.mps.build.structure.BuildVariableMacro" flags="ng" index="2kB4xC">
        <child id="2755237150521975432" name="initialValue" index="aVJcv" />
      </concept>
      <concept id="2750015747481074431" name="jetbrains.mps.build.structure.BuildLayout_Files" flags="ng" index="2HvfSZ">
        <child id="2750015747481074432" name="path" index="2HvfZ0" />
      </concept>
      <concept id="4380385936562003279" name="jetbrains.mps.build.structure.BuildString" flags="ng" index="NbPM2">
        <child id="4903714810883783243" name="parts" index="3MwsjC" />
      </concept>
      <concept id="8618885170173601777" name="jetbrains.mps.build.structure.BuildCompositePath" flags="nn" index="2Ry0Ak">
        <property id="8618885170173601779" name="head" index="2Ry0Am" />
        <child id="8618885170173601778" name="tail" index="2Ry0An" />
      </concept>
      <concept id="6647099934206700647" name="jetbrains.mps.build.structure.BuildJavaPlugin" flags="ng" index="10PD9b" />
      <concept id="7389400916848050074" name="jetbrains.mps.build.structure.BuildLayout_Jar" flags="ng" index="3981dx" />
      <concept id="7389400916848050060" name="jetbrains.mps.build.structure.BuildLayout_NamedContainer" flags="ng" index="3981dR">
        <child id="4380385936562148502" name="containerName" index="Nbhlr" />
      </concept>
      <concept id="7389400916848036984" name="jetbrains.mps.build.structure.BuildLayout_Folder" flags="ng" index="398223" />
      <concept id="7389400916848136194" name="jetbrains.mps.build.structure.BuildFolderMacro" flags="ng" index="398rNT">
        <child id="7389400916848144618" name="defaultPath" index="398pKh" />
      </concept>
      <concept id="7389400916848153117" name="jetbrains.mps.build.structure.BuildSourceMacroRelativePath" flags="ng" index="398BVA">
        <reference id="7389400916848153130" name="macro" index="398BVh" />
      </concept>
      <concept id="5617550519002745364" name="jetbrains.mps.build.structure.BuildLayout" flags="ng" index="1l3spV" />
      <concept id="5617550519002745363" name="jetbrains.mps.build.structure.BuildProject" flags="ng" index="1l3spW">
        <property id="5204048710541015587" name="internalBaseDirectory" index="2DA0ip" />
        <child id="6647099934206700656" name="plugins" index="10PD9s" />
        <child id="5617550519002745378" name="macros" index="1l3spd" />
        <child id="5617550519002745372" name="layout" index="1l3spN" />
      </concept>
      <concept id="4701820937132344003" name="jetbrains.mps.build.structure.BuildLayout_Container" flags="ng" index="1y1bJS">
        <child id="7389400916848037006" name="children" index="39821P" />
      </concept>
      <concept id="841011766566059607" name="jetbrains.mps.build.structure.BuildStringNotEmpty" flags="ng" index="3_J27D" />
      <concept id="1251221292903960366" name="jetbrains.mps.build.structure.BuildLayout_JarManifest" flags="ng" index="3FFNgc">
        <child id="8563603456895840659" name="parts" index="2FjnpF" />
      </concept>
      <concept id="1251221292903960368" name="jetbrains.mps.build.structure.BuildLayout_JarManifest_Attribute" flags="ng" index="3FFNgi">
        <child id="1251221292903960370" name="value" index="3FFNgg" />
        <child id="1251221292903960369" name="name" index="3FFNgj" />
      </concept>
      <concept id="4903714810883702019" name="jetbrains.mps.build.structure.BuildTextStringPart" flags="ng" index="3Mxwew">
        <property id="4903714810883755350" name="text" index="3MwjfP" />
      </concept>
      <concept id="4903714810883702017" name="jetbrains.mps.build.structure.BuildVarRefStringPart" flags="ng" index="3Mxwey">
        <reference id="4903714810883702018" name="macro" index="3Mxwex" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1l3spW" id="5HOGEjnMbK4">
    <property role="TrG5h" value="mathsweeper-apps" />
    <property role="2DA0ip" value="../.." />
    <node concept="10PD9b" id="5HOGEjnMbK5" role="10PD9s" />
    <node concept="2kB4xC" id="5HOGEjnLIx4" role="1l3spd">
      <property role="TrG5h" value="game_name" />
      <node concept="aVJcg" id="5HOGEjnLIDG" role="aVJcv">
        <node concept="NbPM2" id="5HOGEjnLIDF" role="aVJcq">
          <node concept="3Mxwew" id="5HOGEjnLIDE" role="3MwsjC">
            <property role="3MwjfP" value="MathSweeper" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2kB4xC" id="6QtedtYJDAm" role="1l3spd">
      <property role="TrG5h" value="teacher_app_name" />
      <node concept="aVJcg" id="6QtedtYJDRt" role="aVJcv">
        <node concept="NbPM2" id="6QtedtYJDRs" role="aVJcq">
          <node concept="3Mxwew" id="6QtedtYJDRr" role="3MwsjC">
            <property role="3MwjfP" value="MathSweeperTeacher" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2kB4xC" id="6QtedtYKC1S" role="1l3spd">
      <property role="TrG5h" value="student_app_name" />
      <node concept="aVJcg" id="6QtedtYKCl6" role="aVJcv">
        <node concept="NbPM2" id="6QtedtYKCl5" role="aVJcq">
          <node concept="3Mxwey" id="6QtedtYKClN" role="3MwsjC">
            <ref role="3Mxwex" node="5HOGEjnLIx4" resolve="game_name" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2kB4xC" id="6QtedtYJCDX" role="1l3spd">
      <property role="TrG5h" value="teacher_app_jar" />
      <node concept="aVJcg" id="6QtedtYJCPJ" role="aVJcv">
        <node concept="NbPM2" id="6QtedtYJCPI" role="aVJcq">
          <node concept="3Mxwey" id="6QtedtYJCPH" role="3MwsjC">
            <ref role="3Mxwex" node="5HOGEjnLIx4" resolve="game_name" />
          </node>
          <node concept="3Mxwew" id="6QtedtYJCQt" role="3MwsjC">
            <property role="3MwjfP" value="-teacher.jar" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2kB4xC" id="6QtedtYJD6o" role="1l3spd">
      <property role="TrG5h" value="student_app_jar" />
      <node concept="aVJcg" id="6QtedtYJDfF" role="aVJcv">
        <node concept="NbPM2" id="6QtedtYJDfE" role="aVJcq">
          <node concept="3Mxwey" id="6QtedtYJDgN" role="3MwsjC">
            <ref role="3Mxwex" node="5HOGEjnLIx4" resolve="game_name" />
          </node>
          <node concept="3Mxwew" id="6QtedtYJDhv" role="3MwsjC">
            <property role="3MwjfP" value=".jar" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2kB4xC" id="5HOGEjnLIH_" role="1l3spd">
      <property role="TrG5h" value="app_class" />
      <node concept="aVJcg" id="5HOGEjnLIMa" role="aVJcv">
        <node concept="NbPM2" id="5HOGEjnLIM9" role="aVJcq">
          <node concept="3Mxwey" id="5HOGEjnLIM8" role="3MwsjC">
            <ref role="3Mxwex" node="5HOGEjnLIx4" resolve="game_name" />
          </node>
          <node concept="3Mxwew" id="5HOGEjnLIMO" role="3MwsjC">
            <property role="3MwjfP" value=".class" />
          </node>
        </node>
      </node>
    </node>
    <node concept="398rNT" id="5HOGEjnLI4P" role="1l3spd">
      <property role="TrG5h" value="app_folder" />
      <node concept="55IIr" id="5HOGEjnLI8A" role="398pKh">
        <node concept="2Ry0Ak" id="5HOGEjnLIa9" role="iGT6I">
          <property role="2Ry0Am" value="languages" />
          <node concept="2Ry0Ak" id="5HOGEjnLIev" role="2Ry0An">
            <property role="2Ry0Am" value="Minesweeper" />
            <node concept="2Ry0Ak" id="5HOGEjnLIfI" role="2Ry0An">
              <property role="2Ry0Am" value="sandbox" />
              <node concept="2Ry0Ak" id="5HOGEjnLIr6" role="2Ry0An">
                <property role="2Ry0Am" value="classes_gen" />
                <node concept="2Ry0Ak" id="5HOGEjnNaU0" role="2Ry0An">
                  <property role="2Ry0Am" value="com" />
                  <node concept="2Ry0Ak" id="5HOGEjnNaUp" role="2Ry0An">
                    <property role="2Ry0Am" value="zetcode" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="398rNT" id="6jw$TreW1jB" role="1l3spd">
      <property role="TrG5h" value="minesweeper_java_source" />
      <node concept="55IIr" id="6jw$TreW1kL" role="398pKh">
        <node concept="2Ry0Ak" id="6jw$TreW1lZ" role="iGT6I">
          <property role="2Ry0Am" value=".." />
          <node concept="2Ry0Ak" id="6jw$TreW1mQ" role="2Ry0An">
            <property role="2Ry0Am" value="learning-projects" />
            <node concept="2Ry0Ak" id="6jw$TreW1nn" role="2Ry0An">
              <property role="2Ry0Am" value="minesweeper-java" />
              <node concept="2Ry0Ak" id="6jw$TreW1oB" role="2Ry0An">
                <property role="2Ry0Am" value="out" />
                <node concept="2Ry0Ak" id="6jw$TreW1p8" role="2Ry0An">
                  <property role="2Ry0Am" value="production" />
                  <node concept="2Ry0Ak" id="6jw$TreW1pD" role="2Ry0An">
                    <property role="2Ry0Am" value="minesweeper" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="398rNT" id="5HOGEjnLTre" role="1l3spd">
      <property role="TrG5h" value="resources_folder" />
      <node concept="55IIr" id="5HOGEjnLTsa" role="398pKh">
        <node concept="2Ry0Ak" id="5HOGEjnLTsR" role="iGT6I">
          <property role="2Ry0Am" value="languages" />
          <node concept="2Ry0Ak" id="5HOGEjnLTtg" role="2Ry0An">
            <property role="2Ry0Am" value="Minesweeper" />
            <node concept="2Ry0Ak" id="5HOGEjnLTtN" role="2Ry0An">
              <property role="2Ry0Am" value="sandbox" />
              <node concept="2Ry0Ak" id="5HOGEjnLTuc" role="2Ry0An">
                <property role="2Ry0Am" value="resources" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="398rNT" id="5HOGEjnNb5l" role="1l3spd">
      <property role="TrG5h" value="lib_folder" />
      <node concept="55IIr" id="5HOGEjnNb6y" role="398pKh">
        <node concept="2Ry0Ak" id="5HOGEjnNb7H" role="iGT6I">
          <property role="2Ry0Am" value="solutions" />
          <node concept="2Ry0Ak" id="5HOGEjnNb8m" role="2Ry0An">
            <property role="2Ry0Am" value="CommonClasses" />
            <node concept="2Ry0Ak" id="5HOGEjnNb8F" role="2Ry0An">
              <property role="2Ry0Am" value="libs" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1l3spV" id="5HOGEjnMbKo" role="1l3spN">
      <node concept="28u9K_" id="6QtedtYKGlv" role="39821P">
        <property role="28hIV_" value="Teacher's application:" />
      </node>
      <node concept="3981dx" id="6QtedtYJC_K" role="39821P">
        <node concept="3FFNgc" id="6QtedtYJDV7" role="39821P">
          <node concept="3FFNgi" id="6QtedtYJDV8" role="2FjnpF">
            <node concept="3_J27D" id="6QtedtYJDV9" role="3FFNgg">
              <node concept="3Mxwew" id="6QtedtYJDVa" role="3MwsjC">
                <property role="3MwjfP" value="com.zetcode." />
              </node>
              <node concept="3Mxwey" id="6QtedtYJDVb" role="3MwsjC">
                <ref role="3Mxwex" node="6QtedtYJDAm" resolve="teacher_app_name" />
              </node>
            </node>
            <node concept="3_J27D" id="6QtedtYJDVc" role="3FFNgj">
              <node concept="3Mxwew" id="6QtedtYJDVd" role="3MwsjC">
                <property role="3MwjfP" value="Main-Class" />
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="1lOelrD0KWS" role="39821P">
          <node concept="3_J27D" id="1lOelrD0KWU" role="Nbhlr">
            <node concept="3Mxwew" id="1lOelrD0KXq" role="3MwsjC">
              <property role="3MwjfP" value="org" />
            </node>
          </node>
          <node concept="2HvfSZ" id="1lOelrD0KXs" role="39821P">
            <node concept="398BVA" id="1lOelrD0KXw" role="2HvfZ0">
              <ref role="398BVh" node="5HOGEjnNb5l" resolve="lib_folder" />
              <node concept="2Ry0Ak" id="1lOelrD0KXA" role="iGT6I">
                <property role="2Ry0Am" value="json-simple-1.1.1" />
                <node concept="2Ry0Ak" id="1lOelrD0KXF" role="2Ry0An">
                  <property role="2Ry0Am" value="org" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJDVe" role="39821P">
          <node concept="3_J27D" id="6QtedtYJDVf" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJDVg" role="3MwsjC">
              <property role="3MwjfP" value="resources" />
            </node>
          </node>
          <node concept="2HvfSZ" id="6QtedtYJDVh" role="39821P">
            <node concept="398BVA" id="6QtedtYJDVi" role="2HvfZ0">
              <ref role="398BVh" node="5HOGEjnLTre" resolve="resources_folder" />
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJDVj" role="39821P">
          <node concept="3_J27D" id="6QtedtYJDVk" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJDVl" role="3MwsjC">
              <property role="3MwjfP" value="common" />
            </node>
          </node>
          <node concept="2HvfSZ" id="6QtedtYJDVm" role="39821P">
            <node concept="398BVA" id="6QtedtYJDVn" role="2HvfZ0">
              <ref role="398BVh" node="6jw$TreW1jB" resolve="minesweeper_java_source" />
              <node concept="2Ry0Ak" id="6QtedtYJDVo" role="iGT6I">
                <property role="2Ry0Am" value="common" />
                <node concept="2Ry0Ak" id="6QtedtYJDVp" role="2Ry0An">
                  <property role="2Ry0Am" value="" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJDVq" role="39821P">
          <node concept="398223" id="6QtedtYJDVr" role="39821P">
            <node concept="2HvfSZ" id="6QtedtYJDVs" role="39821P">
              <node concept="398BVA" id="6QtedtYJDVt" role="2HvfZ0">
                <ref role="398BVh" node="5HOGEjnLI4P" resolve="app_folder" />
                <node concept="2Ry0Ak" id="6QtedtYJDVu" role="iGT6I" />
              </node>
            </node>
            <node concept="3_J27D" id="6QtedtYJDVv" role="Nbhlr">
              <node concept="3Mxwew" id="6QtedtYJDVw" role="3MwsjC">
                <property role="3MwjfP" value="zetcode" />
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="6QtedtYJDVx" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJDVy" role="3MwsjC">
              <property role="3MwjfP" value="com" />
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="6QtedtYJC_M" role="Nbhlr">
          <node concept="3Mxwey" id="6QtedtYJEkd" role="3MwsjC">
            <ref role="3Mxwex" node="6QtedtYJCDX" resolve="teacher_app_jar" />
          </node>
        </node>
      </node>
      <node concept="28u9K_" id="6QtedtYKGnx" role="39821P">
        <property role="28hIV_" value="Student's application:" />
      </node>
      <node concept="3981dx" id="6QtedtYJCjS" role="39821P">
        <node concept="3FFNgc" id="6QtedtYJCjT" role="39821P">
          <node concept="3FFNgi" id="6QtedtYJCjU" role="2FjnpF">
            <node concept="3_J27D" id="6QtedtYJCjV" role="3FFNgg">
              <node concept="3Mxwew" id="6QtedtYJCjW" role="3MwsjC">
                <property role="3MwjfP" value="com.zetcode." />
              </node>
              <node concept="3Mxwey" id="6QtedtYJCjX" role="3MwsjC">
                <ref role="3Mxwex" node="6QtedtYKC1S" resolve="student_app_name" />
              </node>
            </node>
            <node concept="3_J27D" id="6QtedtYJCjY" role="3FFNgj">
              <node concept="3Mxwew" id="6QtedtYJCjZ" role="3MwsjC">
                <property role="3MwjfP" value="Main-Class" />
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJCk0" role="39821P">
          <node concept="3_J27D" id="6QtedtYJCk1" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJCk2" role="3MwsjC">
              <property role="3MwjfP" value="resources" />
            </node>
          </node>
          <node concept="2HvfSZ" id="6QtedtYJCk3" role="39821P">
            <node concept="398BVA" id="6QtedtYJCk4" role="2HvfZ0">
              <ref role="398BVh" node="5HOGEjnLTre" resolve="resources_folder" />
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJCk5" role="39821P">
          <node concept="3_J27D" id="6QtedtYJCk6" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJCk7" role="3MwsjC">
              <property role="3MwjfP" value="common" />
            </node>
          </node>
          <node concept="2HvfSZ" id="6QtedtYJCk8" role="39821P">
            <node concept="398BVA" id="6QtedtYJCk9" role="2HvfZ0">
              <ref role="398BVh" node="6jw$TreW1jB" resolve="minesweeper_java_source" />
              <node concept="2Ry0Ak" id="6QtedtYJCka" role="iGT6I">
                <property role="2Ry0Am" value="common" />
                <node concept="2Ry0Ak" id="6QtedtYJCkb" role="2Ry0An">
                  <property role="2Ry0Am" value="" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="1lOelrD0L1x" role="39821P">
          <node concept="3_J27D" id="1lOelrD0L1y" role="Nbhlr">
            <node concept="3Mxwew" id="1lOelrD0L1z" role="3MwsjC">
              <property role="3MwjfP" value="org" />
            </node>
          </node>
          <node concept="2HvfSZ" id="1lOelrD0L1$" role="39821P">
            <node concept="398BVA" id="1lOelrD0L1_" role="2HvfZ0">
              <ref role="398BVh" node="5HOGEjnNb5l" resolve="lib_folder" />
              <node concept="2Ry0Ak" id="1lOelrD0L1A" role="iGT6I">
                <property role="2Ry0Am" value="json-simple-1.1.1" />
                <node concept="2Ry0Ak" id="1lOelrD0L1B" role="2Ry0An">
                  <property role="2Ry0Am" value="org" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="398223" id="6QtedtYJCkc" role="39821P">
          <node concept="398223" id="6QtedtYJCkd" role="39821P">
            <node concept="2HvfSZ" id="6QtedtYJCke" role="39821P">
              <node concept="398BVA" id="6QtedtYJCkf" role="2HvfZ0">
                <ref role="398BVh" node="5HOGEjnLI4P" resolve="app_folder" />
                <node concept="2Ry0Ak" id="6QtedtYJCkg" role="iGT6I" />
              </node>
            </node>
            <node concept="3_J27D" id="6QtedtYJCkh" role="Nbhlr">
              <node concept="3Mxwew" id="6QtedtYJCki" role="3MwsjC">
                <property role="3MwjfP" value="zetcode" />
              </node>
            </node>
          </node>
          <node concept="3_J27D" id="6QtedtYJCkj" role="Nbhlr">
            <node concept="3Mxwew" id="6QtedtYJCkk" role="3MwsjC">
              <property role="3MwjfP" value="com" />
            </node>
          </node>
        </node>
        <node concept="3_J27D" id="6QtedtYJCkl" role="Nbhlr">
          <node concept="3Mxwey" id="6QtedtYJDsU" role="3MwsjC">
            <ref role="3Mxwex" node="6QtedtYJD6o" resolve="student_app_jar" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

