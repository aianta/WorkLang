/**
 * Copyright 2018 Alexandru Ianta
 *  
 * 	Licensed under the Apache License, Version 2.0 (the "License"); 
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 *  
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package org.worklang.work.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.worklang.work.BinaryExpression;
import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.DomainDefinition;
import org.worklang.work.ExpertDefinition;
import org.worklang.work.ExtendsDefinition;
import org.worklang.work.FieldDefinition;
import org.worklang.work.FromFieldDefinition;
import org.worklang.work.InputDefinition;
import org.worklang.work.Instance;
import org.worklang.work.Instancespace;
import org.worklang.work.Instruction;
import org.worklang.work.KnowledgeDefinition;
import org.worklang.work.Model;
import org.worklang.work.Namespace;
import org.worklang.work.Operation;
import org.worklang.work.OutputDefinition;
import org.worklang.work.Practitioner;
import org.worklang.work.Predicate;
import org.worklang.work.PrimitiveStateDefinition;
import org.worklang.work.ReferenceField;
import org.worklang.work.ReferenceState;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.Referencespace;
import org.worklang.work.SetStatement;
import org.worklang.work.SkillsDefinition;
import org.worklang.work.Space;
import org.worklang.work.StateDeclaration;
import org.worklang.work.StateDefinition;
import org.worklang.work.StateID;
import org.worklang.work.StateInstance;
import org.worklang.work.StateObjectDefinition;
import org.worklang.work.ToDefinition;
import org.worklang.work.TransitionDeclaration;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionID;
import org.worklang.work.TransitionInstance;
import org.worklang.work.TransitionObjectDefinition;
import org.worklang.work.TransitionalExpression;
import org.worklang.work.UseDefinition;
import org.worklang.work.User;
import org.worklang.work.WithStatesDefinition;
import org.worklang.work.WithTransitionsDefinition;
import org.worklang.work.WorkFactory;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPackageImpl extends EPackageImpl implements WorkPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass practitionerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expertDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass knowledgeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skillsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instancespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateObjectDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionObjectDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveStateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withStatesDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withTransitionsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionIDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromFieldDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.worklang.work.WorkPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WorkPackageImpl()
  {
    super(eNS_URI, WorkFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WorkPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WorkPackage init()
  {
    if (isInited) return (WorkPackage)EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI);

    // Obtain or create and register package
    WorkPackageImpl theWorkPackage = (WorkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWorkPackage.createPackageContents();

    // Initialize created meta-data
    theWorkPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWorkPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WorkPackage.eNS_URI, theWorkPackage);
    return theWorkPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Fields()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Experts()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Practitioners()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Instructions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_ObjectType()
  {
    return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_Space()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_Transition()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPractitioner()
  {
    return practitionerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPractitioner_PractitionerDef()
  {
    return (EAttribute)practitionerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPractitioner_User()
  {
    return (EReference)practitionerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPractitioner_KnowledgeDef()
  {
    return (EReference)practitionerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPractitioner_SkillsDef()
  {
    return (EReference)practitionerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpertDefinition()
  {
    return expertDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpertDefinition_ExpertDef()
  {
    return (EAttribute)expertDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpertDefinition_User()
  {
    return (EReference)expertDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpertDefinition_DomainDef()
  {
    return (EReference)expertDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpertDefinition_KnowledgeDef()
  {
    return (EReference)expertDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpertDefinition_SkillsDef()
  {
    return (EReference)expertDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpertDefinition_Rate()
  {
    return (EAttribute)expertDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Name()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainDefinition()
  {
    return domainDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainDefinition_Domain()
  {
    return (EAttribute)domainDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDefinition_DomainAreas()
  {
    return (EReference)domainDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKnowledgeDefinition()
  {
    return knowledgeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKnowledgeDefinition_KnowledgeDef()
  {
    return (EAttribute)knowledgeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKnowledgeDefinition_Knowledge()
  {
    return (EReference)knowledgeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkillsDefinition()
  {
    return skillsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkillsDefinition_SkillsDef()
  {
    return (EAttribute)skillsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkillsDefinition_Skills()
  {
    return (EReference)skillsDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDefinition()
  {
    return fieldDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldDefinition_Field()
  {
    return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_Space()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_Extends()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_Conceptualspace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_Referencespace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDefinition_Instancespace()
  {
    return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpace()
  {
    return spaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpace_Name()
  {
    return (EAttribute)spaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_SpaceType()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_States()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Transitions()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencespace()
  {
    return referencespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencespace_SpaceType()
  {
    return (EAttribute)referencespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencespace_RefFields()
  {
    return (EReference)referencespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencespace_RefStates()
  {
    return (EReference)referencespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencespace_RefTransition()
  {
    return (EReference)referencespaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstancespace()
  {
    return instancespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstancespace_SpaceType()
  {
    return (EAttribute)instancespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancespace_Instances()
  {
    return (EReference)instancespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceField()
  {
    return referenceFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceField_Ref()
  {
    return (EAttribute)referenceFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceField_Space()
  {
    return (EReference)referenceFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateObjectDefinition()
  {
    return stateObjectDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateObjectDefinition_Type()
  {
    return (EAttribute)stateObjectDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateObjectDefinition_State()
  {
    return (EReference)stateObjectDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionObjectDefinition()
  {
    return transitionObjectDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionObjectDefinition_Type()
  {
    return (EAttribute)transitionObjectDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionObjectDefinition_Transition()
  {
    return (EReference)transitionObjectDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveStateDefinition()
  {
    return primitiveStateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveStateDefinition_Object()
  {
    return (EAttribute)primitiveStateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveStateDefinition_Id()
  {
    return (EReference)primitiveStateDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundStateDefinition()
  {
    return compoundStateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompoundStateDefinition_Object()
  {
    return (EAttribute)compoundStateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundStateDefinition_State()
  {
    return (EReference)compoundStateDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundStateDefinition_CompoundStateDef()
  {
    return (EReference)compoundStateDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDefinition()
  {
    return stateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateDefinition_Object()
  {
    return (EAttribute)stateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDefinition_State()
  {
    return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDefinition_WithDefinition()
  {
    return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateID()
  {
    return stateIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateID_Name()
  {
    return (EAttribute)stateIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateID_Instance()
  {
    return (EReference)stateIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateID_List()
  {
    return (EAttribute)stateIDEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateID_Value()
  {
    return (EReference)stateIDEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithStatesDefinition()
  {
    return withStatesDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithStatesDefinition_Composition()
  {
    return (EAttribute)withStatesDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithStatesDefinition_Predicate()
  {
    return (EReference)withStatesDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithTransitionsDefinition()
  {
    return withTransitionsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWithTransitionsDefinition_Composition()
  {
    return (EAttribute)withTransitionsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithTransitionsDefinition_Transitions()
  {
    return (EReference)withTransitionsDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceState()
  {
    return referenceStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceState_Object()
  {
    return (EAttribute)referenceStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_RefState()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_From()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_State()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceState_Composition()
  {
    return (EReference)referenceStateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDefinition()
  {
    return transitionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionDefinition_Object()
  {
    return (EAttribute)transitionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_Transition()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_In()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_Out()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDefinition_Composition()
  {
    return (EReference)transitionDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionID()
  {
    return transitionIDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionID_Name()
  {
    return (EAttribute)transitionIDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionID_Value()
  {
    return (EReference)transitionIDEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceTransition()
  {
    return referenceTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceTransition_Object()
  {
    return (EAttribute)referenceTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_RefTransition()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_FromDef()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_Transition()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceTransition_Composition()
  {
    return (EReference)referenceTransitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromFieldDefinition()
  {
    return fromFieldDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromFieldDefinition_From()
  {
    return (EAttribute)fromFieldDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromFieldDefinition_RefSpace()
  {
    return (EReference)fromFieldDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputDefinition()
  {
    return inputDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputDefinition_Input()
  {
    return (EAttribute)inputDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputDefinition_InputState()
  {
    return (EReference)inputDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputDefinition()
  {
    return outputDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputDefinition_Output()
  {
    return (EAttribute)outputDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputDefinition_OutputState()
  {
    return (EReference)outputDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendsDefinition()
  {
    return extendsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendsDefinition_Type()
  {
    return (EAttribute)extendsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendsDefinition_Namespaces()
  {
    return (EReference)extendsDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_InstanceDef()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_TransitionDeclaration()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_StateDeclaration()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_Name()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_State()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Transition()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDeclaration()
  {
    return transitionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionDeclaration_ObjectType()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDeclaration_Transition()
  {
    return (EReference)transitionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDeclaration()
  {
    return stateDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateDeclaration_ObjectType()
  {
    return (EAttribute)stateDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDeclaration_State()
  {
    return (EReference)stateDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionInstance()
  {
    return transitionInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Host()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Port()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInstance_Path()
  {
    return (EAttribute)transitionInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateInstance()
  {
    return stateInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateInstance_Members()
  {
    return (EReference)stateInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseDefinition()
  {
    return useDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseDefinition_Use()
  {
    return (EAttribute)useDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDefinition_PredefinedValue()
  {
    return (EReference)useDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetStatement()
  {
    return setStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetStatement_Statement()
  {
    return (EAttribute)setStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetStatement_Variable()
  {
    return (EReference)setStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetStatement_ToDef()
  {
    return (EReference)setStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToDefinition()
  {
    return toDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToDefinition_To()
  {
    return (EAttribute)toDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToDefinition_Value()
  {
    return (EAttribute)toDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicate()
  {
    return predicateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPredicate_Negation()
  {
    return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicate_Expression()
  {
    return (EReference)predicateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpression()
  {
    return binaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionalExpression()
  {
    return transitionalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Left()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Op()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Right()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkFactory getWorkFactory()
  {
    return (WorkFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__FIELDS);
    createEReference(modelEClass, MODEL__EXPERTS);
    createEReference(modelEClass, MODEL__PRACTITIONERS);
    createEReference(modelEClass, MODEL__INSTRUCTIONS);

    instructionEClass = createEClass(INSTRUCTION);
    createEAttribute(instructionEClass, INSTRUCTION__OBJECT_TYPE);
    createEReference(instructionEClass, INSTRUCTION__SPACE);
    createEReference(instructionEClass, INSTRUCTION__TRANSITION);

    practitionerEClass = createEClass(PRACTITIONER);
    createEAttribute(practitionerEClass, PRACTITIONER__PRACTITIONER_DEF);
    createEReference(practitionerEClass, PRACTITIONER__USER);
    createEReference(practitionerEClass, PRACTITIONER__KNOWLEDGE_DEF);
    createEReference(practitionerEClass, PRACTITIONER__SKILLS_DEF);

    expertDefinitionEClass = createEClass(EXPERT_DEFINITION);
    createEAttribute(expertDefinitionEClass, EXPERT_DEFINITION__EXPERT_DEF);
    createEReference(expertDefinitionEClass, EXPERT_DEFINITION__USER);
    createEReference(expertDefinitionEClass, EXPERT_DEFINITION__DOMAIN_DEF);
    createEReference(expertDefinitionEClass, EXPERT_DEFINITION__KNOWLEDGE_DEF);
    createEReference(expertDefinitionEClass, EXPERT_DEFINITION__SKILLS_DEF);
    createEAttribute(expertDefinitionEClass, EXPERT_DEFINITION__RATE);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__NAME);

    domainDefinitionEClass = createEClass(DOMAIN_DEFINITION);
    createEAttribute(domainDefinitionEClass, DOMAIN_DEFINITION__DOMAIN);
    createEReference(domainDefinitionEClass, DOMAIN_DEFINITION__DOMAIN_AREAS);

    knowledgeDefinitionEClass = createEClass(KNOWLEDGE_DEFINITION);
    createEAttribute(knowledgeDefinitionEClass, KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF);
    createEReference(knowledgeDefinitionEClass, KNOWLEDGE_DEFINITION__KNOWLEDGE);

    skillsDefinitionEClass = createEClass(SKILLS_DEFINITION);
    createEAttribute(skillsDefinitionEClass, SKILLS_DEFINITION__SKILLS_DEF);
    createEReference(skillsDefinitionEClass, SKILLS_DEFINITION__SKILLS);

    fieldDefinitionEClass = createEClass(FIELD_DEFINITION);
    createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__FIELD);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__SPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__EXTENDS);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__CONCEPTUALSPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__REFERENCESPACE);
    createEReference(fieldDefinitionEClass, FIELD_DEFINITION__INSTANCESPACE);

    spaceEClass = createEClass(SPACE);
    createEAttribute(spaceEClass, SPACE__NAME);

    namespaceEClass = createEClass(NAMESPACE);
    createEAttribute(namespaceEClass, NAMESPACE__SPACE_TYPE);
    createEReference(namespaceEClass, NAMESPACE__STATES);
    createEReference(namespaceEClass, NAMESPACE__TRANSITIONS);

    referencespaceEClass = createEClass(REFERENCESPACE);
    createEAttribute(referencespaceEClass, REFERENCESPACE__SPACE_TYPE);
    createEReference(referencespaceEClass, REFERENCESPACE__REF_FIELDS);
    createEReference(referencespaceEClass, REFERENCESPACE__REF_STATES);
    createEReference(referencespaceEClass, REFERENCESPACE__REF_TRANSITION);

    instancespaceEClass = createEClass(INSTANCESPACE);
    createEAttribute(instancespaceEClass, INSTANCESPACE__SPACE_TYPE);
    createEReference(instancespaceEClass, INSTANCESPACE__INSTANCES);

    referenceFieldEClass = createEClass(REFERENCE_FIELD);
    createEAttribute(referenceFieldEClass, REFERENCE_FIELD__REF);
    createEReference(referenceFieldEClass, REFERENCE_FIELD__SPACE);

    stateObjectDefinitionEClass = createEClass(STATE_OBJECT_DEFINITION);
    createEAttribute(stateObjectDefinitionEClass, STATE_OBJECT_DEFINITION__TYPE);
    createEReference(stateObjectDefinitionEClass, STATE_OBJECT_DEFINITION__STATE);

    transitionObjectDefinitionEClass = createEClass(TRANSITION_OBJECT_DEFINITION);
    createEAttribute(transitionObjectDefinitionEClass, TRANSITION_OBJECT_DEFINITION__TYPE);
    createEReference(transitionObjectDefinitionEClass, TRANSITION_OBJECT_DEFINITION__TRANSITION);

    primitiveStateDefinitionEClass = createEClass(PRIMITIVE_STATE_DEFINITION);
    createEAttribute(primitiveStateDefinitionEClass, PRIMITIVE_STATE_DEFINITION__OBJECT);
    createEReference(primitiveStateDefinitionEClass, PRIMITIVE_STATE_DEFINITION__ID);

    compoundStateDefinitionEClass = createEClass(COMPOUND_STATE_DEFINITION);
    createEAttribute(compoundStateDefinitionEClass, COMPOUND_STATE_DEFINITION__OBJECT);
    createEReference(compoundStateDefinitionEClass, COMPOUND_STATE_DEFINITION__STATE);
    createEReference(compoundStateDefinitionEClass, COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF);

    stateDefinitionEClass = createEClass(STATE_DEFINITION);
    createEAttribute(stateDefinitionEClass, STATE_DEFINITION__OBJECT);
    createEReference(stateDefinitionEClass, STATE_DEFINITION__STATE);
    createEReference(stateDefinitionEClass, STATE_DEFINITION__WITH_DEFINITION);

    stateIDEClass = createEClass(STATE_ID);
    createEAttribute(stateIDEClass, STATE_ID__NAME);
    createEReference(stateIDEClass, STATE_ID__INSTANCE);
    createEAttribute(stateIDEClass, STATE_ID__LIST);
    createEReference(stateIDEClass, STATE_ID__VALUE);

    withStatesDefinitionEClass = createEClass(WITH_STATES_DEFINITION);
    createEAttribute(withStatesDefinitionEClass, WITH_STATES_DEFINITION__COMPOSITION);
    createEReference(withStatesDefinitionEClass, WITH_STATES_DEFINITION__PREDICATE);

    withTransitionsDefinitionEClass = createEClass(WITH_TRANSITIONS_DEFINITION);
    createEAttribute(withTransitionsDefinitionEClass, WITH_TRANSITIONS_DEFINITION__COMPOSITION);
    createEReference(withTransitionsDefinitionEClass, WITH_TRANSITIONS_DEFINITION__TRANSITIONS);

    referenceStateEClass = createEClass(REFERENCE_STATE);
    createEAttribute(referenceStateEClass, REFERENCE_STATE__OBJECT);
    createEReference(referenceStateEClass, REFERENCE_STATE__REF_STATE);
    createEReference(referenceStateEClass, REFERENCE_STATE__FROM);
    createEReference(referenceStateEClass, REFERENCE_STATE__STATE);
    createEReference(referenceStateEClass, REFERENCE_STATE__COMPOSITION);

    transitionDefinitionEClass = createEClass(TRANSITION_DEFINITION);
    createEAttribute(transitionDefinitionEClass, TRANSITION_DEFINITION__OBJECT);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__TRANSITION);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__IN);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__OUT);
    createEReference(transitionDefinitionEClass, TRANSITION_DEFINITION__COMPOSITION);

    transitionIDEClass = createEClass(TRANSITION_ID);
    createEAttribute(transitionIDEClass, TRANSITION_ID__NAME);
    createEReference(transitionIDEClass, TRANSITION_ID__VALUE);

    referenceTransitionEClass = createEClass(REFERENCE_TRANSITION);
    createEAttribute(referenceTransitionEClass, REFERENCE_TRANSITION__OBJECT);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__REF_TRANSITION);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__FROM_DEF);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__TRANSITION);
    createEReference(referenceTransitionEClass, REFERENCE_TRANSITION__COMPOSITION);

    fromFieldDefinitionEClass = createEClass(FROM_FIELD_DEFINITION);
    createEAttribute(fromFieldDefinitionEClass, FROM_FIELD_DEFINITION__FROM);
    createEReference(fromFieldDefinitionEClass, FROM_FIELD_DEFINITION__REF_SPACE);

    inputDefinitionEClass = createEClass(INPUT_DEFINITION);
    createEAttribute(inputDefinitionEClass, INPUT_DEFINITION__INPUT);
    createEReference(inputDefinitionEClass, INPUT_DEFINITION__INPUT_STATE);

    outputDefinitionEClass = createEClass(OUTPUT_DEFINITION);
    createEAttribute(outputDefinitionEClass, OUTPUT_DEFINITION__OUTPUT);
    createEReference(outputDefinitionEClass, OUTPUT_DEFINITION__OUTPUT_STATE);

    extendsDefinitionEClass = createEClass(EXTENDS_DEFINITION);
    createEAttribute(extendsDefinitionEClass, EXTENDS_DEFINITION__TYPE);
    createEReference(extendsDefinitionEClass, EXTENDS_DEFINITION__NAMESPACES);

    instanceEClass = createEClass(INSTANCE);
    createEAttribute(instanceEClass, INSTANCE__INSTANCE_DEF);
    createEReference(instanceEClass, INSTANCE__TRANSITION_DECLARATION);
    createEReference(instanceEClass, INSTANCE__STATE_DECLARATION);
    createEAttribute(instanceEClass, INSTANCE__NAME);
    createEReference(instanceEClass, INSTANCE__STATE);
    createEReference(instanceEClass, INSTANCE__TRANSITION);

    transitionDeclarationEClass = createEClass(TRANSITION_DECLARATION);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__OBJECT_TYPE);
    createEReference(transitionDeclarationEClass, TRANSITION_DECLARATION__TRANSITION);

    stateDeclarationEClass = createEClass(STATE_DECLARATION);
    createEAttribute(stateDeclarationEClass, STATE_DECLARATION__OBJECT_TYPE);
    createEReference(stateDeclarationEClass, STATE_DECLARATION__STATE);

    transitionInstanceEClass = createEClass(TRANSITION_INSTANCE);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__HOST);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__PORT);
    createEAttribute(transitionInstanceEClass, TRANSITION_INSTANCE__PATH);

    stateInstanceEClass = createEClass(STATE_INSTANCE);
    createEReference(stateInstanceEClass, STATE_INSTANCE__MEMBERS);

    useDefinitionEClass = createEClass(USE_DEFINITION);
    createEAttribute(useDefinitionEClass, USE_DEFINITION__USE);
    createEReference(useDefinitionEClass, USE_DEFINITION__PREDEFINED_VALUE);

    setStatementEClass = createEClass(SET_STATEMENT);
    createEAttribute(setStatementEClass, SET_STATEMENT__STATEMENT);
    createEReference(setStatementEClass, SET_STATEMENT__VARIABLE);
    createEReference(setStatementEClass, SET_STATEMENT__TO_DEF);

    toDefinitionEClass = createEClass(TO_DEFINITION);
    createEAttribute(toDefinitionEClass, TO_DEFINITION__TO);
    createEAttribute(toDefinitionEClass, TO_DEFINITION__VALUE);

    predicateEClass = createEClass(PREDICATE);
    createEAttribute(predicateEClass, PREDICATE__NEGATION);
    createEReference(predicateEClass, PREDICATE__EXPRESSION);

    binaryExpressionEClass = createEClass(BINARY_EXPRESSION);

    transitionalExpressionEClass = createEClass(TRANSITIONAL_EXPRESSION);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__LEFT);
    createEAttribute(operationEClass, OPERATION__OP);
    createEReference(operationEClass, OPERATION__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stateIDEClass.getESuperTypes().add(this.getBinaryExpression());
    transitionIDEClass.getESuperTypes().add(this.getTransitionalExpression());
    predicateEClass.getESuperTypes().add(this.getBinaryExpression());
    operationEClass.getESuperTypes().add(this.getBinaryExpression());
    operationEClass.getESuperTypes().add(this.getTransitionalExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Fields(), this.getFieldDefinition(), null, "fields", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Experts(), this.getExpertDefinition(), null, "experts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Practitioners(), this.getPractitioner(), null, "practitioners", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_Space(), this.getSpace(), null, "space", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_Transition(), this.getTransitionID(), null, "transition", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(practitionerEClass, Practitioner.class, "Practitioner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPractitioner_PractitionerDef(), ecorePackage.getEString(), "practitionerDef", null, 0, 1, Practitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPractitioner_User(), this.getUser(), null, "user", null, 0, 1, Practitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPractitioner_KnowledgeDef(), this.getKnowledgeDefinition(), null, "knowledgeDef", null, 0, 1, Practitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPractitioner_SkillsDef(), this.getSkillsDefinition(), null, "skillsDef", null, 0, 1, Practitioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expertDefinitionEClass, ExpertDefinition.class, "ExpertDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpertDefinition_ExpertDef(), ecorePackage.getEString(), "expertDef", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpertDefinition_User(), this.getUser(), null, "user", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpertDefinition_DomainDef(), this.getDomainDefinition(), null, "domainDef", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpertDefinition_KnowledgeDef(), this.getKnowledgeDefinition(), null, "knowledgeDef", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpertDefinition_SkillsDef(), this.getSkillsDefinition(), null, "skillsDef", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpertDefinition_Rate(), ecorePackage.getEInt(), "rate", null, 0, 1, ExpertDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainDefinitionEClass, DomainDefinition.class, "DomainDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainDefinition_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, DomainDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainDefinition_DomainAreas(), this.getReferenceField(), null, "domainAreas", null, 0, -1, DomainDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(knowledgeDefinitionEClass, KnowledgeDefinition.class, "KnowledgeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKnowledgeDefinition_KnowledgeDef(), ecorePackage.getEString(), "knowledgeDef", null, 0, 1, KnowledgeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKnowledgeDefinition_Knowledge(), this.getReferenceState(), null, "knowledge", null, 0, -1, KnowledgeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skillsDefinitionEClass, SkillsDefinition.class, "SkillsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSkillsDefinition_SkillsDef(), ecorePackage.getEString(), "skillsDef", null, 0, 1, SkillsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSkillsDefinition_Skills(), this.getReferenceTransition(), null, "skills", null, 0, -1, SkillsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDefinitionEClass, FieldDefinition.class, "FieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldDefinition_Field(), ecorePackage.getEString(), "field", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_Space(), this.getSpace(), null, "space", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_Extends(), this.getExtendsDefinition(), null, "extends", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_Conceptualspace(), this.getNamespace(), null, "conceptualspace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_Referencespace(), this.getReferencespace(), null, "referencespace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDefinition_Instancespace(), this.getInstancespace(), null, "instancespace", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spaceEClass, Space.class, "Space", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Space.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_SpaceType(), ecorePackage.getEString(), "spaceType", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_States(), this.getStateObjectDefinition(), null, "states", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Transitions(), this.getTransitionObjectDefinition(), null, "transitions", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referencespaceEClass, Referencespace.class, "Referencespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferencespace_SpaceType(), ecorePackage.getEString(), "spaceType", null, 0, 1, Referencespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferencespace_RefFields(), this.getReferenceField(), null, "refFields", null, 0, -1, Referencespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferencespace_RefStates(), this.getReferenceState(), null, "refStates", null, 0, -1, Referencespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferencespace_RefTransition(), this.getReferenceTransition(), null, "refTransition", null, 0, -1, Referencespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instancespaceEClass, Instancespace.class, "Instancespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstancespace_SpaceType(), ecorePackage.getEString(), "spaceType", null, 0, 1, Instancespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstancespace_Instances(), this.getInstance(), null, "instances", null, 0, -1, Instancespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceFieldEClass, ReferenceField.class, "ReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceField_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceField_Space(), this.getSpace(), null, "space", null, 0, 1, ReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateObjectDefinitionEClass, StateObjectDefinition.class, "StateObjectDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateObjectDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, StateObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateObjectDefinition_State(), this.getStateDefinition(), null, "state", null, 0, 1, StateObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionObjectDefinitionEClass, TransitionObjectDefinition.class, "TransitionObjectDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionObjectDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, TransitionObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionObjectDefinition_Transition(), this.getTransitionDefinition(), null, "transition", null, 0, 1, TransitionObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveStateDefinitionEClass, PrimitiveStateDefinition.class, "PrimitiveStateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveStateDefinition_Object(), ecorePackage.getEString(), "object", null, 0, 1, PrimitiveStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveStateDefinition_Id(), this.getStateID(), null, "id", null, 0, 1, PrimitiveStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundStateDefinitionEClass, CompoundStateDefinition.class, "CompoundStateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompoundStateDefinition_Object(), ecorePackage.getEString(), "object", null, 0, 1, CompoundStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompoundStateDefinition_State(), this.getStateID(), null, "state", null, 0, 1, CompoundStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompoundStateDefinition_CompoundStateDef(), this.getWithStatesDefinition(), null, "compoundStateDef", null, 0, 1, CompoundStateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDefinitionEClass, StateDefinition.class, "StateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateDefinition_Object(), ecorePackage.getEString(), "object", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateDefinition_State(), this.getStateID(), null, "state", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateDefinition_WithDefinition(), this.getWithStatesDefinition(), null, "withDefinition", null, 0, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateIDEClass, StateID.class, "StateID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateID_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateID_Instance(), this.getStateID(), null, "instance", null, 0, 1, StateID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateID_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, StateID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateID_Value(), this.getStateID(), null, "value", null, 0, 1, StateID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withStatesDefinitionEClass, WithStatesDefinition.class, "WithStatesDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWithStatesDefinition_Composition(), ecorePackage.getEString(), "composition", null, 0, 1, WithStatesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithStatesDefinition_Predicate(), this.getPredicate(), null, "predicate", null, 0, 1, WithStatesDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withTransitionsDefinitionEClass, WithTransitionsDefinition.class, "WithTransitionsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWithTransitionsDefinition_Composition(), ecorePackage.getEString(), "composition", null, 0, 1, WithTransitionsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithTransitionsDefinition_Transitions(), this.getTransitionalExpression(), null, "transitions", null, 0, 1, WithTransitionsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceStateEClass, ReferenceState.class, "ReferenceState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceState_Object(), ecorePackage.getEString(), "object", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceState_RefState(), this.getStateID(), null, "refState", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceState_From(), this.getFromFieldDefinition(), null, "from", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceState_State(), this.getStateID(), null, "state", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceState_Composition(), this.getWithStatesDefinition(), null, "composition", null, 0, 1, ReferenceState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDefinitionEClass, TransitionDefinition.class, "TransitionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionDefinition_Object(), ecorePackage.getEString(), "object", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_Transition(), this.getTransitionID(), null, "transition", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_In(), this.getInputDefinition(), null, "in", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_Out(), this.getOutputDefinition(), null, "out", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDefinition_Composition(), this.getWithTransitionsDefinition(), null, "composition", null, 0, 1, TransitionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionIDEClass, TransitionID.class, "TransitionID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionID_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransitionID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionID_Value(), this.getTransitionID(), null, "value", null, 0, 1, TransitionID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceTransitionEClass, ReferenceTransition.class, "ReferenceTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceTransition_Object(), ecorePackage.getEString(), "object", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceTransition_RefTransition(), this.getTransitionID(), null, "refTransition", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceTransition_FromDef(), this.getFromFieldDefinition(), null, "fromDef", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceTransition_Transition(), this.getTransitionID(), null, "transition", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceTransition_Composition(), this.getWithTransitionsDefinition(), null, "composition", null, 0, 1, ReferenceTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromFieldDefinitionEClass, FromFieldDefinition.class, "FromFieldDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFromFieldDefinition_From(), ecorePackage.getEString(), "from", null, 0, 1, FromFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFromFieldDefinition_RefSpace(), this.getSpace(), null, "refSpace", null, 0, 1, FromFieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputDefinitionEClass, InputDefinition.class, "InputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputDefinition_Input(), ecorePackage.getEString(), "input", null, 0, 1, InputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputDefinition_InputState(), this.getStateID(), null, "inputState", null, 0, -1, InputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputDefinitionEClass, OutputDefinition.class, "OutputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputDefinition_Output(), ecorePackage.getEString(), "output", null, 0, 1, OutputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputDefinition_OutputState(), this.getStateID(), null, "outputState", null, 0, 1, OutputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsDefinitionEClass, ExtendsDefinition.class, "ExtendsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtendsDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExtendsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtendsDefinition_Namespaces(), this.getSpace(), null, "namespaces", null, 0, -1, ExtendsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstance_InstanceDef(), ecorePackage.getEString(), "instanceDef", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_TransitionDeclaration(), this.getTransitionDeclaration(), null, "transitionDeclaration", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_StateDeclaration(), this.getStateDeclaration(), null, "stateDeclaration", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_State(), this.getStateInstance(), null, "state", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Transition(), this.getTransitionInstance(), null, "transition", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDeclarationEClass, TransitionDeclaration.class, "TransitionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionDeclaration_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, TransitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDeclaration_Transition(), this.getTransitionID(), null, "transition", null, 0, 1, TransitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDeclarationEClass, StateDeclaration.class, "StateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateDeclaration_ObjectType(), ecorePackage.getEString(), "objectType", null, 0, 1, StateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateDeclaration_State(), this.getStateID(), null, "state", null, 0, 1, StateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionInstanceEClass, TransitionInstance.class, "TransitionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionInstance_Host(), ecorePackage.getEString(), "host", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionInstance_Port(), ecorePackage.getEInt(), "port", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionInstance_Path(), ecorePackage.getEString(), "path", null, 0, 1, TransitionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateInstanceEClass, StateInstance.class, "StateInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateInstance_Members(), ecorePackage.getEObject(), null, "members", null, 0, -1, StateInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useDefinitionEClass, UseDefinition.class, "UseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUseDefinition_Use(), ecorePackage.getEString(), "use", null, 0, 1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDefinition_PredefinedValue(), this.getInstance(), null, "predefinedValue", null, 0, 1, UseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setStatementEClass, SetStatement.class, "SetStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetStatement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, SetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetStatement_Variable(), this.getStateID(), null, "variable", null, 0, 1, SetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetStatement_ToDef(), this.getToDefinition(), null, "toDef", null, 0, 1, SetStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toDefinitionEClass, ToDefinition.class, "ToDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getToDefinition_To(), ecorePackage.getEString(), "to", null, 0, 1, ToDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getToDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, ToDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPredicate_Negation(), ecorePackage.getEBoolean(), "negation", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPredicate_Expression(), this.getBinaryExpression(), null, "expression", null, 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionalExpressionEClass, TransitionalExpression.class, "TransitionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Left(), ecorePackage.getEObject(), null, "left", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Right(), ecorePackage.getEObject(), null, "right", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WorkPackageImpl
