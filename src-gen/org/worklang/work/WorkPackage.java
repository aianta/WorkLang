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
package org.worklang.work;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.worklang.work.WorkFactory
 * @model kind="package"
 * @generated
 */
public interface WorkPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "work";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.worklang.org/Work";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "work";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkPackage eINSTANCE = org.worklang.work.impl.WorkPackageImpl.init();

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ModelImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FIELDS = 0;

  /**
   * The feature id for the '<em><b>Experts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXPERTS = 1;

  /**
   * The feature id for the '<em><b>Practitioners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PRACTITIONERS = 2;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSTRUCTIONS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstructionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__OBJECT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Space</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__SPACE = 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PractitionerImpl <em>Practitioner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PractitionerImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPractitioner()
   * @generated
   */
  int PRACTITIONER = 2;

  /**
   * The feature id for the '<em><b>Practitioner Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRACTITIONER__PRACTITIONER_DEF = 0;

  /**
   * The feature id for the '<em><b>User</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRACTITIONER__USER = 1;

  /**
   * The feature id for the '<em><b>Knowledge Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRACTITIONER__KNOWLEDGE_DEF = 2;

  /**
   * The feature id for the '<em><b>Skills Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRACTITIONER__SKILLS_DEF = 3;

  /**
   * The number of structural features of the '<em>Practitioner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRACTITIONER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ExpertDefinitionImpl <em>Expert Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ExpertDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getExpertDefinition()
   * @generated
   */
  int EXPERT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Expert Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__EXPERT_DEF = 0;

  /**
   * The feature id for the '<em><b>User</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__USER = 1;

  /**
   * The feature id for the '<em><b>Domain Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__DOMAIN_DEF = 2;

  /**
   * The feature id for the '<em><b>Knowledge Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__KNOWLEDGE_DEF = 3;

  /**
   * The feature id for the '<em><b>Skills Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__SKILLS_DEF = 4;

  /**
   * The feature id for the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION__RATE = 5;

  /**
   * The number of structural features of the '<em>Expert Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPERT_DEFINITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.UserImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getUser()
   * @generated
   */
  int USER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.DomainDefinitionImpl <em>Domain Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.DomainDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getDomainDefinition()
   * @generated
   */
  int DOMAIN_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION__DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Domain Areas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION__DOMAIN_AREAS = 1;

  /**
   * The number of structural features of the '<em>Domain Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.KnowledgeDefinitionImpl <em>Knowledge Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.KnowledgeDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getKnowledgeDefinition()
   * @generated
   */
  int KNOWLEDGE_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Knowledge Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF = 0;

  /**
   * The feature id for the '<em><b>Knowledge</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE_DEFINITION__KNOWLEDGE = 1;

  /**
   * The number of structural features of the '<em>Knowledge Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNOWLEDGE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.SkillsDefinitionImpl <em>Skills Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.SkillsDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getSkillsDefinition()
   * @generated
   */
  int SKILLS_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Skills Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILLS_DEFINITION__SKILLS_DEF = 0;

  /**
   * The feature id for the '<em><b>Skills</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILLS_DEFINITION__SKILLS = 1;

  /**
   * The number of structural features of the '<em>Skills Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKILLS_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.FieldDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getFieldDefinition()
   * @generated
   */
  int FIELD_DEFINITION = 8;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__FIELD = 0;

  /**
   * The feature id for the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__SPACE = 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__EXTENDS = 2;

  /**
   * The feature id for the '<em><b>Conceptualspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__CONCEPTUALSPACE = 3;

  /**
   * The feature id for the '<em><b>Referencespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__REFERENCESPACE = 4;

  /**
   * The feature id for the '<em><b>Instancespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__INSTANCESPACE = 5;

  /**
   * The number of structural features of the '<em>Field Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.SpaceImpl <em>Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.SpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getSpace()
   * @generated
   */
  int SPACE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.NamespaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 10;

  /**
   * The feature id for the '<em><b>Space Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__SPACE_TYPE = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__STATES = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferencespaceImpl <em>Referencespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferencespaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferencespace()
   * @generated
   */
  int REFERENCESPACE = 11;

  /**
   * The feature id for the '<em><b>Space Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCESPACE__SPACE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCESPACE__REF_FIELDS = 1;

  /**
   * The feature id for the '<em><b>Ref States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCESPACE__REF_STATES = 2;

  /**
   * The feature id for the '<em><b>Ref Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCESPACE__REF_TRANSITION = 3;

  /**
   * The number of structural features of the '<em>Referencespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCESPACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InstancespaceImpl <em>Instancespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstancespaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstancespace()
   * @generated
   */
  int INSTANCESPACE = 12;

  /**
   * The feature id for the '<em><b>Space Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCESPACE__SPACE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCESPACE__INSTANCES = 1;

  /**
   * The number of structural features of the '<em>Instancespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCESPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceFieldImpl <em>Reference Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceFieldImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceField()
   * @generated
   */
  int REFERENCE_FIELD = 13;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FIELD__REF = 0;

  /**
   * The feature id for the '<em><b>Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FIELD__SPACE = 1;

  /**
   * The number of structural features of the '<em>Reference Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateObjectDefinitionImpl <em>State Object Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateObjectDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateObjectDefinition()
   * @generated
   */
  int STATE_OBJECT_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OBJECT_DEFINITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OBJECT_DEFINITION__STATE = 1;

  /**
   * The number of structural features of the '<em>State Object Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OBJECT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionObjectDefinitionImpl <em>Transition Object Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionObjectDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionObjectDefinition()
   * @generated
   */
  int TRANSITION_OBJECT_DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OBJECT_DEFINITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OBJECT_DEFINITION__TRANSITION = 1;

  /**
   * The number of structural features of the '<em>Transition Object Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OBJECT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PrimitiveStateDefinitionImpl <em>Primitive State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PrimitiveStateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPrimitiveStateDefinition()
   * @generated
   */
  int PRIMITIVE_STATE_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__ID = 1;

  /**
   * The number of structural features of the '<em>Primitive State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.CompoundStateDefinitionImpl <em>Compound State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.CompoundStateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getCompoundStateDefinition()
   * @generated
   */
  int COMPOUND_STATE_DEFINITION = 17;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__STATE = 1;

  /**
   * The feature id for the '<em><b>Compound State Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF = 2;

  /**
   * The number of structural features of the '<em>Compound State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateDefinitionImpl <em>State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateDefinition()
   * @generated
   */
  int STATE_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__STATE = 1;

  /**
   * The feature id for the '<em><b>With Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__WITH_DEFINITION = 2;

  /**
   * The number of structural features of the '<em>State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.BinaryExpressionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 39;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateIDImpl <em>State ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateIDImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateID()
   * @generated
   */
  int STATE_ID = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID__NAME = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID__INSTANCE = BINARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID__LIST = BINARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID__VALUE = BINARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.WithStatesDefinitionImpl <em>With States Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.WithStatesDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getWithStatesDefinition()
   * @generated
   */
  int WITH_STATES_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Composition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATES_DEFINITION__COMPOSITION = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATES_DEFINITION__PREDICATE = 1;

  /**
   * The number of structural features of the '<em>With States Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATES_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.WithTransitionsDefinitionImpl <em>With Transitions Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.WithTransitionsDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getWithTransitionsDefinition()
   * @generated
   */
  int WITH_TRANSITIONS_DEFINITION = 21;

  /**
   * The feature id for the '<em><b>Composition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSITIONS_DEFINITION__COMPOSITION = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSITIONS_DEFINITION__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>With Transitions Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSITIONS_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceStateImpl <em>Reference State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceStateImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceState()
   * @generated
   */
  int REFERENCE_STATE = 22;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Ref State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__REF_STATE = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__FROM = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__STATE = 3;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__COMPOSITION = 4;

  /**
   * The number of structural features of the '<em>Reference State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionDefinitionImpl <em>Transition Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDefinition()
   * @generated
   */
  int TRANSITION_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__TRANSITION = 1;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__IN = 2;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__OUT = 3;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__COMPOSITION = 4;

  /**
   * The number of structural features of the '<em>Transition Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionalExpressionImpl <em>Transitional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionalExpressionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionalExpression()
   * @generated
   */
  int TRANSITIONAL_EXPRESSION = 40;

  /**
   * The number of structural features of the '<em>Transitional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionIDImpl <em>Transition ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionIDImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionID()
   * @generated
   */
  int TRANSITION_ID = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ID__NAME = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ID__VALUE = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ID_FEATURE_COUNT = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceTransitionImpl <em>Reference Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceTransitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceTransition()
   * @generated
   */
  int REFERENCE_TRANSITION = 25;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Ref Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__REF_TRANSITION = 1;

  /**
   * The feature id for the '<em><b>From Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__FROM_DEF = 2;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__COMPOSITION = 4;

  /**
   * The number of structural features of the '<em>Reference Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.FromFieldDefinitionImpl <em>From Field Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.FromFieldDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getFromFieldDefinition()
   * @generated
   */
  int FROM_FIELD_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FIELD_DEFINITION__FROM = 0;

  /**
   * The feature id for the '<em><b>Ref Space</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FIELD_DEFINITION__REF_SPACE = 1;

  /**
   * The number of structural features of the '<em>From Field Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FIELD_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InputDefinitionImpl <em>Input Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InputDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInputDefinition()
   * @generated
   */
  int INPUT_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEFINITION__INPUT = 0;

  /**
   * The feature id for the '<em><b>Input State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEFINITION__INPUT_STATE = 1;

  /**
   * The number of structural features of the '<em>Input Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.OutputDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getOutputDefinition()
   * @generated
   */
  int OUTPUT_DEFINITION = 28;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__OUTPUT = 0;

  /**
   * The feature id for the '<em><b>Output State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__OUTPUT_STATE = 1;

  /**
   * The number of structural features of the '<em>Output Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ExtendsDefinitionImpl <em>Extends Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ExtendsDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getExtendsDefinition()
   * @generated
   */
  int EXTENDS_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_DEFINITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_DEFINITION__NAMESPACES = 1;

  /**
   * The number of structural features of the '<em>Extends Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 30;

  /**
   * The feature id for the '<em><b>Instance Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__INSTANCE_DEF = 0;

  /**
   * The feature id for the '<em><b>Transition Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TRANSITION_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>State Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__STATE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 3;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__STATE = 4;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TRANSITION = 5;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionDeclarationImpl <em>Transition Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionDeclarationImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDeclaration()
   * @generated
   */
  int TRANSITION_DECLARATION = 31;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__OBJECT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__TRANSITION = 1;

  /**
   * The number of structural features of the '<em>Transition Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateDeclarationImpl <em>State Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateDeclarationImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateDeclaration()
   * @generated
   */
  int STATE_DECLARATION = 32;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__OBJECT_TYPE = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__STATE = 1;

  /**
   * The number of structural features of the '<em>State Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionInstanceImpl <em>Transition Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionInstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionInstance()
   * @generated
   */
  int TRANSITION_INSTANCE = 33;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INSTANCE__HOST = 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INSTANCE__PORT = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INSTANCE__PATH = 2;

  /**
   * The number of structural features of the '<em>Transition Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateInstanceImpl <em>State Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateInstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateInstance()
   * @generated
   */
  int STATE_INSTANCE = 34;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INSTANCE__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>State Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INSTANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.UseDefinitionImpl <em>Use Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.UseDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getUseDefinition()
   * @generated
   */
  int USE_DEFINITION = 35;

  /**
   * The feature id for the '<em><b>Use</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__USE = 0;

  /**
   * The feature id for the '<em><b>Predefined Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__PREDEFINED_VALUE = 1;

  /**
   * The number of structural features of the '<em>Use Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.SetStatementImpl <em>Set Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.SetStatementImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getSetStatement()
   * @generated
   */
  int SET_STATEMENT = 36;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT__STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>To Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT__TO_DEF = 2;

  /**
   * The number of structural features of the '<em>Set Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ToDefinitionImpl <em>To Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ToDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getToDefinition()
   * @generated
   */
  int TO_DEFINITION = 37;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_DEFINITION__TO = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_DEFINITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>To Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PredicateImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 38;

  /**
   * The feature id for the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__NEGATION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__EXPRESSION = BINARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.OperationImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = BINARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = BINARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.worklang.work.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.worklang.work.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Model#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.worklang.work.Model#getFields()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Model#getExperts <em>Experts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Experts</em>'.
   * @see org.worklang.work.Model#getExperts()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Experts();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Model#getPractitioners <em>Practitioners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Practitioners</em>'.
   * @see org.worklang.work.Model#getPractitioners()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Practitioners();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Model#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see org.worklang.work.Model#getInstructions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Instructions();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.worklang.work.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Instruction#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.worklang.work.Instruction#getObjectType()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_ObjectType();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.Instruction#getSpace <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Space</em>'.
   * @see org.worklang.work.Instruction#getSpace()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Space();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.Instruction#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transition</em>'.
   * @see org.worklang.work.Instruction#getTransition()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Transition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Practitioner <em>Practitioner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Practitioner</em>'.
   * @see org.worklang.work.Practitioner
   * @generated
   */
  EClass getPractitioner();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Practitioner#getPractitionerDef <em>Practitioner Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Practitioner Def</em>'.
   * @see org.worklang.work.Practitioner#getPractitionerDef()
   * @see #getPractitioner()
   * @generated
   */
  EAttribute getPractitioner_PractitionerDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Practitioner#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>User</em>'.
   * @see org.worklang.work.Practitioner#getUser()
   * @see #getPractitioner()
   * @generated
   */
  EReference getPractitioner_User();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Practitioner#getKnowledgeDef <em>Knowledge Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Knowledge Def</em>'.
   * @see org.worklang.work.Practitioner#getKnowledgeDef()
   * @see #getPractitioner()
   * @generated
   */
  EReference getPractitioner_KnowledgeDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Practitioner#getSkillsDef <em>Skills Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skills Def</em>'.
   * @see org.worklang.work.Practitioner#getSkillsDef()
   * @see #getPractitioner()
   * @generated
   */
  EReference getPractitioner_SkillsDef();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ExpertDefinition <em>Expert Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expert Definition</em>'.
   * @see org.worklang.work.ExpertDefinition
   * @generated
   */
  EClass getExpertDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ExpertDefinition#getExpertDef <em>Expert Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expert Def</em>'.
   * @see org.worklang.work.ExpertDefinition#getExpertDef()
   * @see #getExpertDefinition()
   * @generated
   */
  EAttribute getExpertDefinition_ExpertDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ExpertDefinition#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>User</em>'.
   * @see org.worklang.work.ExpertDefinition#getUser()
   * @see #getExpertDefinition()
   * @generated
   */
  EReference getExpertDefinition_User();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ExpertDefinition#getDomainDef <em>Domain Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain Def</em>'.
   * @see org.worklang.work.ExpertDefinition#getDomainDef()
   * @see #getExpertDefinition()
   * @generated
   */
  EReference getExpertDefinition_DomainDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ExpertDefinition#getKnowledgeDef <em>Knowledge Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Knowledge Def</em>'.
   * @see org.worklang.work.ExpertDefinition#getKnowledgeDef()
   * @see #getExpertDefinition()
   * @generated
   */
  EReference getExpertDefinition_KnowledgeDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ExpertDefinition#getSkillsDef <em>Skills Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skills Def</em>'.
   * @see org.worklang.work.ExpertDefinition#getSkillsDef()
   * @see #getExpertDefinition()
   * @generated
   */
  EReference getExpertDefinition_SkillsDef();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ExpertDefinition#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rate</em>'.
   * @see org.worklang.work.ExpertDefinition#getRate()
   * @see #getExpertDefinition()
   * @generated
   */
  EAttribute getExpertDefinition_Rate();

  /**
   * Returns the meta object for class '{@link org.worklang.work.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see org.worklang.work.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for class '{@link org.worklang.work.DomainDefinition <em>Domain Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Definition</em>'.
   * @see org.worklang.work.DomainDefinition
   * @generated
   */
  EClass getDomainDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.DomainDefinition#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain</em>'.
   * @see org.worklang.work.DomainDefinition#getDomain()
   * @see #getDomainDefinition()
   * @generated
   */
  EAttribute getDomainDefinition_Domain();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.DomainDefinition#getDomainAreas <em>Domain Areas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Areas</em>'.
   * @see org.worklang.work.DomainDefinition#getDomainAreas()
   * @see #getDomainDefinition()
   * @generated
   */
  EReference getDomainDefinition_DomainAreas();

  /**
   * Returns the meta object for class '{@link org.worklang.work.KnowledgeDefinition <em>Knowledge Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knowledge Definition</em>'.
   * @see org.worklang.work.KnowledgeDefinition
   * @generated
   */
  EClass getKnowledgeDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.KnowledgeDefinition#getKnowledgeDef <em>Knowledge Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Knowledge Def</em>'.
   * @see org.worklang.work.KnowledgeDefinition#getKnowledgeDef()
   * @see #getKnowledgeDefinition()
   * @generated
   */
  EAttribute getKnowledgeDefinition_KnowledgeDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.KnowledgeDefinition#getKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Knowledge</em>'.
   * @see org.worklang.work.KnowledgeDefinition#getKnowledge()
   * @see #getKnowledgeDefinition()
   * @generated
   */
  EReference getKnowledgeDefinition_Knowledge();

  /**
   * Returns the meta object for class '{@link org.worklang.work.SkillsDefinition <em>Skills Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skills Definition</em>'.
   * @see org.worklang.work.SkillsDefinition
   * @generated
   */
  EClass getSkillsDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.SkillsDefinition#getSkillsDef <em>Skills Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skills Def</em>'.
   * @see org.worklang.work.SkillsDefinition#getSkillsDef()
   * @see #getSkillsDefinition()
   * @generated
   */
  EAttribute getSkillsDefinition_SkillsDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.SkillsDefinition#getSkills <em>Skills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skills</em>'.
   * @see org.worklang.work.SkillsDefinition#getSkills()
   * @see #getSkillsDefinition()
   * @generated
   */
  EReference getSkillsDefinition_Skills();

  /**
   * Returns the meta object for class '{@link org.worklang.work.FieldDefinition <em>Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Definition</em>'.
   * @see org.worklang.work.FieldDefinition
   * @generated
   */
  EClass getFieldDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.FieldDefinition#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see org.worklang.work.FieldDefinition#getField()
   * @see #getFieldDefinition()
   * @generated
   */
  EAttribute getFieldDefinition_Field();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getSpace <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Space</em>'.
   * @see org.worklang.work.FieldDefinition#getSpace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_Space();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see org.worklang.work.FieldDefinition#getExtends()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_Extends();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getConceptualspace <em>Conceptualspace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conceptualspace</em>'.
   * @see org.worklang.work.FieldDefinition#getConceptualspace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_Conceptualspace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getReferencespace <em>Referencespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Referencespace</em>'.
   * @see org.worklang.work.FieldDefinition#getReferencespace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_Referencespace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getInstancespace <em>Instancespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instancespace</em>'.
   * @see org.worklang.work.FieldDefinition#getInstancespace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_Instancespace();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Space <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Space</em>'.
   * @see org.worklang.work.Space
   * @generated
   */
  EClass getSpace();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Space#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.Space#getName()
   * @see #getSpace()
   * @generated
   */
  EAttribute getSpace_Name();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.worklang.work.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Namespace#getSpaceType <em>Space Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Space Type</em>'.
   * @see org.worklang.work.Namespace#getSpaceType()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_SpaceType();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Namespace#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.worklang.work.Namespace#getStates()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Namespace#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.worklang.work.Namespace#getTransitions()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Transitions();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Referencespace <em>Referencespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referencespace</em>'.
   * @see org.worklang.work.Referencespace
   * @generated
   */
  EClass getReferencespace();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Referencespace#getSpaceType <em>Space Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Space Type</em>'.
   * @see org.worklang.work.Referencespace#getSpaceType()
   * @see #getReferencespace()
   * @generated
   */
  EAttribute getReferencespace_SpaceType();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Referencespace#getRefFields <em>Ref Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Fields</em>'.
   * @see org.worklang.work.Referencespace#getRefFields()
   * @see #getReferencespace()
   * @generated
   */
  EReference getReferencespace_RefFields();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Referencespace#getRefStates <em>Ref States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref States</em>'.
   * @see org.worklang.work.Referencespace#getRefStates()
   * @see #getReferencespace()
   * @generated
   */
  EReference getReferencespace_RefStates();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Referencespace#getRefTransition <em>Ref Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Transition</em>'.
   * @see org.worklang.work.Referencespace#getRefTransition()
   * @see #getReferencespace()
   * @generated
   */
  EReference getReferencespace_RefTransition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Instancespace <em>Instancespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instancespace</em>'.
   * @see org.worklang.work.Instancespace
   * @generated
   */
  EClass getInstancespace();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Instancespace#getSpaceType <em>Space Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Space Type</em>'.
   * @see org.worklang.work.Instancespace#getSpaceType()
   * @see #getInstancespace()
   * @generated
   */
  EAttribute getInstancespace_SpaceType();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.Instancespace#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.worklang.work.Instancespace#getInstances()
   * @see #getInstancespace()
   * @generated
   */
  EReference getInstancespace_Instances();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ReferenceField <em>Reference Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Field</em>'.
   * @see org.worklang.work.ReferenceField
   * @generated
   */
  EClass getReferenceField();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ReferenceField#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see org.worklang.work.ReferenceField#getRef()
   * @see #getReferenceField()
   * @generated
   */
  EAttribute getReferenceField_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceField#getSpace <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Space</em>'.
   * @see org.worklang.work.ReferenceField#getSpace()
   * @see #getReferenceField()
   * @generated
   */
  EReference getReferenceField_Space();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateObjectDefinition <em>State Object Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Object Definition</em>'.
   * @see org.worklang.work.StateObjectDefinition
   * @generated
   */
  EClass getStateObjectDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateObjectDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.worklang.work.StateObjectDefinition#getType()
   * @see #getStateObjectDefinition()
   * @generated
   */
  EAttribute getStateObjectDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.StateObjectDefinition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.worklang.work.StateObjectDefinition#getState()
   * @see #getStateObjectDefinition()
   * @generated
   */
  EReference getStateObjectDefinition_State();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionObjectDefinition <em>Transition Object Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Object Definition</em>'.
   * @see org.worklang.work.TransitionObjectDefinition
   * @generated
   */
  EClass getTransitionObjectDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionObjectDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.worklang.work.TransitionObjectDefinition#getType()
   * @see #getTransitionObjectDefinition()
   * @generated
   */
  EAttribute getTransitionObjectDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.TransitionObjectDefinition#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see org.worklang.work.TransitionObjectDefinition#getTransition()
   * @see #getTransitionObjectDefinition()
   * @generated
   */
  EReference getTransitionObjectDefinition_Transition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.PrimitiveStateDefinition <em>Primitive State Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive State Definition</em>'.
   * @see org.worklang.work.PrimitiveStateDefinition
   * @generated
   */
  EClass getPrimitiveStateDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.PrimitiveStateDefinition#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.PrimitiveStateDefinition#getObject()
   * @see #getPrimitiveStateDefinition()
   * @generated
   */
  EAttribute getPrimitiveStateDefinition_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.PrimitiveStateDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.worklang.work.PrimitiveStateDefinition#getId()
   * @see #getPrimitiveStateDefinition()
   * @generated
   */
  EReference getPrimitiveStateDefinition_Id();

  /**
   * Returns the meta object for class '{@link org.worklang.work.CompoundStateDefinition <em>Compound State Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound State Definition</em>'.
   * @see org.worklang.work.CompoundStateDefinition
   * @generated
   */
  EClass getCompoundStateDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.CompoundStateDefinition#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.CompoundStateDefinition#getObject()
   * @see #getCompoundStateDefinition()
   * @generated
   */
  EAttribute getCompoundStateDefinition_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.CompoundStateDefinition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.worklang.work.CompoundStateDefinition#getState()
   * @see #getCompoundStateDefinition()
   * @generated
   */
  EReference getCompoundStateDefinition_State();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.CompoundStateDefinition#getCompoundStateDef <em>Compound State Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compound State Def</em>'.
   * @see org.worklang.work.CompoundStateDefinition#getCompoundStateDef()
   * @see #getCompoundStateDefinition()
   * @generated
   */
  EReference getCompoundStateDefinition_CompoundStateDef();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateDefinition <em>State Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Definition</em>'.
   * @see org.worklang.work.StateDefinition
   * @generated
   */
  EClass getStateDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateDefinition#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.StateDefinition#getObject()
   * @see #getStateDefinition()
   * @generated
   */
  EAttribute getStateDefinition_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.StateDefinition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.worklang.work.StateDefinition#getState()
   * @see #getStateDefinition()
   * @generated
   */
  EReference getStateDefinition_State();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.StateDefinition#getWithDefinition <em>With Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With Definition</em>'.
   * @see org.worklang.work.StateDefinition#getWithDefinition()
   * @see #getStateDefinition()
   * @generated
   */
  EReference getStateDefinition_WithDefinition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateID <em>State ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State ID</em>'.
   * @see org.worklang.work.StateID
   * @generated
   */
  EClass getStateID();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.StateID#getName()
   * @see #getStateID()
   * @generated
   */
  EAttribute getStateID_Name();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateID#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see org.worklang.work.StateID#getInstance()
   * @see #getStateID()
   * @generated
   */
  EReference getStateID_Instance();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateID#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.worklang.work.StateID#isList()
   * @see #getStateID()
   * @generated
   */
  EAttribute getStateID_List();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateID#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.worklang.work.StateID#getValue()
   * @see #getStateID()
   * @generated
   */
  EReference getStateID_Value();

  /**
   * Returns the meta object for class '{@link org.worklang.work.WithStatesDefinition <em>With States Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With States Definition</em>'.
   * @see org.worklang.work.WithStatesDefinition
   * @generated
   */
  EClass getWithStatesDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.WithStatesDefinition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Composition</em>'.
   * @see org.worklang.work.WithStatesDefinition#getComposition()
   * @see #getWithStatesDefinition()
   * @generated
   */
  EAttribute getWithStatesDefinition_Composition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.WithStatesDefinition#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.worklang.work.WithStatesDefinition#getPredicate()
   * @see #getWithStatesDefinition()
   * @generated
   */
  EReference getWithStatesDefinition_Predicate();

  /**
   * Returns the meta object for class '{@link org.worklang.work.WithTransitionsDefinition <em>With Transitions Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Transitions Definition</em>'.
   * @see org.worklang.work.WithTransitionsDefinition
   * @generated
   */
  EClass getWithTransitionsDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.WithTransitionsDefinition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Composition</em>'.
   * @see org.worklang.work.WithTransitionsDefinition#getComposition()
   * @see #getWithTransitionsDefinition()
   * @generated
   */
  EAttribute getWithTransitionsDefinition_Composition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.WithTransitionsDefinition#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transitions</em>'.
   * @see org.worklang.work.WithTransitionsDefinition#getTransitions()
   * @see #getWithTransitionsDefinition()
   * @generated
   */
  EReference getWithTransitionsDefinition_Transitions();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ReferenceState <em>Reference State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference State</em>'.
   * @see org.worklang.work.ReferenceState
   * @generated
   */
  EClass getReferenceState();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ReferenceState#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.ReferenceState#getObject()
   * @see #getReferenceState()
   * @generated
   */
  EAttribute getReferenceState_Object();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.ReferenceState#getRefState <em>Ref State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref State</em>'.
   * @see org.worklang.work.ReferenceState#getRefState()
   * @see #getReferenceState()
   * @generated
   */
  EReference getReferenceState_RefState();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceState#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.worklang.work.ReferenceState#getFrom()
   * @see #getReferenceState()
   * @generated
   */
  EReference getReferenceState_From();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceState#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.worklang.work.ReferenceState#getState()
   * @see #getReferenceState()
   * @generated
   */
  EReference getReferenceState_State();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceState#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see org.worklang.work.ReferenceState#getComposition()
   * @see #getReferenceState()
   * @generated
   */
  EReference getReferenceState_Composition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionDefinition <em>Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Definition</em>'.
   * @see org.worklang.work.TransitionDefinition
   * @generated
   */
  EClass getTransitionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionDefinition#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.TransitionDefinition#getObject()
   * @see #getTransitionDefinition()
   * @generated
   */
  EAttribute getTransitionDefinition_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.TransitionDefinition#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see org.worklang.work.TransitionDefinition#getTransition()
   * @see #getTransitionDefinition()
   * @generated
   */
  EReference getTransitionDefinition_Transition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.TransitionDefinition#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.worklang.work.TransitionDefinition#getIn()
   * @see #getTransitionDefinition()
   * @generated
   */
  EReference getTransitionDefinition_In();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.TransitionDefinition#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out</em>'.
   * @see org.worklang.work.TransitionDefinition#getOut()
   * @see #getTransitionDefinition()
   * @generated
   */
  EReference getTransitionDefinition_Out();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.TransitionDefinition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see org.worklang.work.TransitionDefinition#getComposition()
   * @see #getTransitionDefinition()
   * @generated
   */
  EReference getTransitionDefinition_Composition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionID <em>Transition ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition ID</em>'.
   * @see org.worklang.work.TransitionID
   * @generated
   */
  EClass getTransitionID();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.TransitionID#getName()
   * @see #getTransitionID()
   * @generated
   */
  EAttribute getTransitionID_Name();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionID#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.worklang.work.TransitionID#getValue()
   * @see #getTransitionID()
   * @generated
   */
  EReference getTransitionID_Value();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ReferenceTransition <em>Reference Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Transition</em>'.
   * @see org.worklang.work.ReferenceTransition
   * @generated
   */
  EClass getReferenceTransition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ReferenceTransition#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.worklang.work.ReferenceTransition#getObject()
   * @see #getReferenceTransition()
   * @generated
   */
  EAttribute getReferenceTransition_Object();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.ReferenceTransition#getRefTransition <em>Ref Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Transition</em>'.
   * @see org.worklang.work.ReferenceTransition#getRefTransition()
   * @see #getReferenceTransition()
   * @generated
   */
  EReference getReferenceTransition_RefTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceTransition#getFromDef <em>From Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Def</em>'.
   * @see org.worklang.work.ReferenceTransition#getFromDef()
   * @see #getReferenceTransition()
   * @generated
   */
  EReference getReferenceTransition_FromDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceTransition#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see org.worklang.work.ReferenceTransition#getTransition()
   * @see #getReferenceTransition()
   * @generated
   */
  EReference getReferenceTransition_Transition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.ReferenceTransition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see org.worklang.work.ReferenceTransition#getComposition()
   * @see #getReferenceTransition()
   * @generated
   */
  EReference getReferenceTransition_Composition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.FromFieldDefinition <em>From Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Field Definition</em>'.
   * @see org.worklang.work.FromFieldDefinition
   * @generated
   */
  EClass getFromFieldDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.FromFieldDefinition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.worklang.work.FromFieldDefinition#getFrom()
   * @see #getFromFieldDefinition()
   * @generated
   */
  EAttribute getFromFieldDefinition_From();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.FromFieldDefinition#getRefSpace <em>Ref Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Space</em>'.
   * @see org.worklang.work.FromFieldDefinition#getRefSpace()
   * @see #getFromFieldDefinition()
   * @generated
   */
  EReference getFromFieldDefinition_RefSpace();

  /**
   * Returns the meta object for class '{@link org.worklang.work.InputDefinition <em>Input Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Definition</em>'.
   * @see org.worklang.work.InputDefinition
   * @generated
   */
  EClass getInputDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.InputDefinition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.worklang.work.InputDefinition#getInput()
   * @see #getInputDefinition()
   * @generated
   */
  EAttribute getInputDefinition_Input();

  /**
   * Returns the meta object for the reference list '{@link org.worklang.work.InputDefinition#getInputState <em>Input State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Input State</em>'.
   * @see org.worklang.work.InputDefinition#getInputState()
   * @see #getInputDefinition()
   * @generated
   */
  EReference getInputDefinition_InputState();

  /**
   * Returns the meta object for class '{@link org.worklang.work.OutputDefinition <em>Output Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Definition</em>'.
   * @see org.worklang.work.OutputDefinition
   * @generated
   */
  EClass getOutputDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.OutputDefinition#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see org.worklang.work.OutputDefinition#getOutput()
   * @see #getOutputDefinition()
   * @generated
   */
  EAttribute getOutputDefinition_Output();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.OutputDefinition#getOutputState <em>Output State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output State</em>'.
   * @see org.worklang.work.OutputDefinition#getOutputState()
   * @see #getOutputDefinition()
   * @generated
   */
  EReference getOutputDefinition_OutputState();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ExtendsDefinition <em>Extends Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Definition</em>'.
   * @see org.worklang.work.ExtendsDefinition
   * @generated
   */
  EClass getExtendsDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ExtendsDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.worklang.work.ExtendsDefinition#getType()
   * @see #getExtendsDefinition()
   * @generated
   */
  EAttribute getExtendsDefinition_Type();

  /**
   * Returns the meta object for the reference list '{@link org.worklang.work.ExtendsDefinition#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Namespaces</em>'.
   * @see org.worklang.work.ExtendsDefinition#getNamespaces()
   * @see #getExtendsDefinition()
   * @generated
   */
  EReference getExtendsDefinition_Namespaces();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.worklang.work.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Instance#getInstanceDef <em>Instance Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Def</em>'.
   * @see org.worklang.work.Instance#getInstanceDef()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_InstanceDef();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Instance#getTransitionDeclaration <em>Transition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition Declaration</em>'.
   * @see org.worklang.work.Instance#getTransitionDeclaration()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_TransitionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Instance#getStateDeclaration <em>State Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Declaration</em>'.
   * @see org.worklang.work.Instance#getStateDeclaration()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_StateDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Instance#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.worklang.work.Instance#getState()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_State();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Instance#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see org.worklang.work.Instance#getTransition()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Transition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionDeclaration <em>Transition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Declaration</em>'.
   * @see org.worklang.work.TransitionDeclaration
   * @generated
   */
  EClass getTransitionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionDeclaration#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.worklang.work.TransitionDeclaration#getObjectType()
   * @see #getTransitionDeclaration()
   * @generated
   */
  EAttribute getTransitionDeclaration_ObjectType();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionDeclaration#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transition</em>'.
   * @see org.worklang.work.TransitionDeclaration#getTransition()
   * @see #getTransitionDeclaration()
   * @generated
   */
  EReference getTransitionDeclaration_Transition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateDeclaration <em>State Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Declaration</em>'.
   * @see org.worklang.work.StateDeclaration
   * @generated
   */
  EClass getStateDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateDeclaration#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.worklang.work.StateDeclaration#getObjectType()
   * @see #getStateDeclaration()
   * @generated
   */
  EAttribute getStateDeclaration_ObjectType();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateDeclaration#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.worklang.work.StateDeclaration#getState()
   * @see #getStateDeclaration()
   * @generated
   */
  EReference getStateDeclaration_State();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionInstance <em>Transition Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Instance</em>'.
   * @see org.worklang.work.TransitionInstance
   * @generated
   */
  EClass getTransitionInstance();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionInstance#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see org.worklang.work.TransitionInstance#getHost()
   * @see #getTransitionInstance()
   * @generated
   */
  EAttribute getTransitionInstance_Host();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionInstance#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.worklang.work.TransitionInstance#getPort()
   * @see #getTransitionInstance()
   * @generated
   */
  EAttribute getTransitionInstance_Port();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionInstance#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.worklang.work.TransitionInstance#getPath()
   * @see #getTransitionInstance()
   * @generated
   */
  EAttribute getTransitionInstance_Path();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateInstance <em>State Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Instance</em>'.
   * @see org.worklang.work.StateInstance
   * @generated
   */
  EClass getStateInstance();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.StateInstance#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.worklang.work.StateInstance#getMembers()
   * @see #getStateInstance()
   * @generated
   */
  EReference getStateInstance_Members();

  /**
   * Returns the meta object for class '{@link org.worklang.work.UseDefinition <em>Use Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Definition</em>'.
   * @see org.worklang.work.UseDefinition
   * @generated
   */
  EClass getUseDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.UseDefinition#getUse <em>Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use</em>'.
   * @see org.worklang.work.UseDefinition#getUse()
   * @see #getUseDefinition()
   * @generated
   */
  EAttribute getUseDefinition_Use();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.UseDefinition#getPredefinedValue <em>Predefined Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predefined Value</em>'.
   * @see org.worklang.work.UseDefinition#getPredefinedValue()
   * @see #getUseDefinition()
   * @generated
   */
  EReference getUseDefinition_PredefinedValue();

  /**
   * Returns the meta object for class '{@link org.worklang.work.SetStatement <em>Set Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Statement</em>'.
   * @see org.worklang.work.SetStatement
   * @generated
   */
  EClass getSetStatement();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.SetStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see org.worklang.work.SetStatement#getStatement()
   * @see #getSetStatement()
   * @generated
   */
  EAttribute getSetStatement_Statement();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.SetStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.worklang.work.SetStatement#getVariable()
   * @see #getSetStatement()
   * @generated
   */
  EReference getSetStatement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.SetStatement#getToDef <em>To Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Def</em>'.
   * @see org.worklang.work.SetStatement#getToDef()
   * @see #getSetStatement()
   * @generated
   */
  EReference getSetStatement_ToDef();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ToDefinition <em>To Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Definition</em>'.
   * @see org.worklang.work.ToDefinition
   * @generated
   */
  EClass getToDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ToDefinition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see org.worklang.work.ToDefinition#getTo()
   * @see #getToDefinition()
   * @generated
   */
  EAttribute getToDefinition_To();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.ToDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.worklang.work.ToDefinition#getValue()
   * @see #getToDefinition()
   * @generated
   */
  EAttribute getToDefinition_Value();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see org.worklang.work.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Predicate#isNegation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negation</em>'.
   * @see org.worklang.work.Predicate#isNegation()
   * @see #getPredicate()
   * @generated
   */
  EAttribute getPredicate_Negation();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Predicate#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.worklang.work.Predicate#getExpression()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Expression();

  /**
   * Returns the meta object for class '{@link org.worklang.work.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.worklang.work.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionalExpression <em>Transitional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitional Expression</em>'.
   * @see org.worklang.work.TransitionalExpression
   * @generated
   */
  EClass getTransitionalExpression();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.worklang.work.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.worklang.work.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.worklang.work.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.worklang.work.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WorkFactory getWorkFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ModelImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FIELDS = eINSTANCE.getModel_Fields();

    /**
     * The meta object literal for the '<em><b>Experts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXPERTS = eINSTANCE.getModel_Experts();

    /**
     * The meta object literal for the '<em><b>Practitioners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PRACTITIONERS = eINSTANCE.getModel_Practitioners();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INSTRUCTIONS = eINSTANCE.getModel_Instructions();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InstructionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__OBJECT_TYPE = eINSTANCE.getInstruction_ObjectType();

    /**
     * The meta object literal for the '<em><b>Space</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__SPACE = eINSTANCE.getInstruction_Space();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__TRANSITION = eINSTANCE.getInstruction_Transition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.PractitionerImpl <em>Practitioner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.PractitionerImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getPractitioner()
     * @generated
     */
    EClass PRACTITIONER = eINSTANCE.getPractitioner();

    /**
     * The meta object literal for the '<em><b>Practitioner Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRACTITIONER__PRACTITIONER_DEF = eINSTANCE.getPractitioner_PractitionerDef();

    /**
     * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRACTITIONER__USER = eINSTANCE.getPractitioner_User();

    /**
     * The meta object literal for the '<em><b>Knowledge Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRACTITIONER__KNOWLEDGE_DEF = eINSTANCE.getPractitioner_KnowledgeDef();

    /**
     * The meta object literal for the '<em><b>Skills Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRACTITIONER__SKILLS_DEF = eINSTANCE.getPractitioner_SkillsDef();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ExpertDefinitionImpl <em>Expert Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ExpertDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getExpertDefinition()
     * @generated
     */
    EClass EXPERT_DEFINITION = eINSTANCE.getExpertDefinition();

    /**
     * The meta object literal for the '<em><b>Expert Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERT_DEFINITION__EXPERT_DEF = eINSTANCE.getExpertDefinition_ExpertDef();

    /**
     * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERT_DEFINITION__USER = eINSTANCE.getExpertDefinition_User();

    /**
     * The meta object literal for the '<em><b>Domain Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERT_DEFINITION__DOMAIN_DEF = eINSTANCE.getExpertDefinition_DomainDef();

    /**
     * The meta object literal for the '<em><b>Knowledge Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERT_DEFINITION__KNOWLEDGE_DEF = eINSTANCE.getExpertDefinition_KnowledgeDef();

    /**
     * The meta object literal for the '<em><b>Skills Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPERT_DEFINITION__SKILLS_DEF = eINSTANCE.getExpertDefinition_SkillsDef();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPERT_DEFINITION__RATE = eINSTANCE.getExpertDefinition_Rate();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.UserImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.DomainDefinitionImpl <em>Domain Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.DomainDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getDomainDefinition()
     * @generated
     */
    EClass DOMAIN_DEFINITION = eINSTANCE.getDomainDefinition();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_DEFINITION__DOMAIN = eINSTANCE.getDomainDefinition_Domain();

    /**
     * The meta object literal for the '<em><b>Domain Areas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_DEFINITION__DOMAIN_AREAS = eINSTANCE.getDomainDefinition_DomainAreas();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.KnowledgeDefinitionImpl <em>Knowledge Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.KnowledgeDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getKnowledgeDefinition()
     * @generated
     */
    EClass KNOWLEDGE_DEFINITION = eINSTANCE.getKnowledgeDefinition();

    /**
     * The meta object literal for the '<em><b>Knowledge Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF = eINSTANCE.getKnowledgeDefinition_KnowledgeDef();

    /**
     * The meta object literal for the '<em><b>Knowledge</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNOWLEDGE_DEFINITION__KNOWLEDGE = eINSTANCE.getKnowledgeDefinition_Knowledge();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.SkillsDefinitionImpl <em>Skills Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.SkillsDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getSkillsDefinition()
     * @generated
     */
    EClass SKILLS_DEFINITION = eINSTANCE.getSkillsDefinition();

    /**
     * The meta object literal for the '<em><b>Skills Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKILLS_DEFINITION__SKILLS_DEF = eINSTANCE.getSkillsDefinition_SkillsDef();

    /**
     * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKILLS_DEFINITION__SKILLS = eINSTANCE.getSkillsDefinition_Skills();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.FieldDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getFieldDefinition()
     * @generated
     */
    EClass FIELD_DEFINITION = eINSTANCE.getFieldDefinition();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DEFINITION__FIELD = eINSTANCE.getFieldDefinition_Field();

    /**
     * The meta object literal for the '<em><b>Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__SPACE = eINSTANCE.getFieldDefinition_Space();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__EXTENDS = eINSTANCE.getFieldDefinition_Extends();

    /**
     * The meta object literal for the '<em><b>Conceptualspace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__CONCEPTUALSPACE = eINSTANCE.getFieldDefinition_Conceptualspace();

    /**
     * The meta object literal for the '<em><b>Referencespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__REFERENCESPACE = eINSTANCE.getFieldDefinition_Referencespace();

    /**
     * The meta object literal for the '<em><b>Instancespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__INSTANCESPACE = eINSTANCE.getFieldDefinition_Instancespace();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.SpaceImpl <em>Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.SpaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getSpace()
     * @generated
     */
    EClass SPACE = eINSTANCE.getSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE__NAME = eINSTANCE.getSpace_Name();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.NamespaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Space Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__SPACE_TYPE = eINSTANCE.getNamespace_SpaceType();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__STATES = eINSTANCE.getNamespace_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__TRANSITIONS = eINSTANCE.getNamespace_Transitions();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ReferencespaceImpl <em>Referencespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ReferencespaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getReferencespace()
     * @generated
     */
    EClass REFERENCESPACE = eINSTANCE.getReferencespace();

    /**
     * The meta object literal for the '<em><b>Space Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCESPACE__SPACE_TYPE = eINSTANCE.getReferencespace_SpaceType();

    /**
     * The meta object literal for the '<em><b>Ref Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCESPACE__REF_FIELDS = eINSTANCE.getReferencespace_RefFields();

    /**
     * The meta object literal for the '<em><b>Ref States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCESPACE__REF_STATES = eINSTANCE.getReferencespace_RefStates();

    /**
     * The meta object literal for the '<em><b>Ref Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCESPACE__REF_TRANSITION = eINSTANCE.getReferencespace_RefTransition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.InstancespaceImpl <em>Instancespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InstancespaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInstancespace()
     * @generated
     */
    EClass INSTANCESPACE = eINSTANCE.getInstancespace();

    /**
     * The meta object literal for the '<em><b>Space Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCESPACE__SPACE_TYPE = eINSTANCE.getInstancespace_SpaceType();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCESPACE__INSTANCES = eINSTANCE.getInstancespace_Instances();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ReferenceFieldImpl <em>Reference Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ReferenceFieldImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getReferenceField()
     * @generated
     */
    EClass REFERENCE_FIELD = eINSTANCE.getReferenceField();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_FIELD__REF = eINSTANCE.getReferenceField_Ref();

    /**
     * The meta object literal for the '<em><b>Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_FIELD__SPACE = eINSTANCE.getReferenceField_Space();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateObjectDefinitionImpl <em>State Object Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateObjectDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateObjectDefinition()
     * @generated
     */
    EClass STATE_OBJECT_DEFINITION = eINSTANCE.getStateObjectDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_OBJECT_DEFINITION__TYPE = eINSTANCE.getStateObjectDefinition_Type();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_OBJECT_DEFINITION__STATE = eINSTANCE.getStateObjectDefinition_State();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionObjectDefinitionImpl <em>Transition Object Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionObjectDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionObjectDefinition()
     * @generated
     */
    EClass TRANSITION_OBJECT_DEFINITION = eINSTANCE.getTransitionObjectDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_OBJECT_DEFINITION__TYPE = eINSTANCE.getTransitionObjectDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_OBJECT_DEFINITION__TRANSITION = eINSTANCE.getTransitionObjectDefinition_Transition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.PrimitiveStateDefinitionImpl <em>Primitive State Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.PrimitiveStateDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getPrimitiveStateDefinition()
     * @generated
     */
    EClass PRIMITIVE_STATE_DEFINITION = eINSTANCE.getPrimitiveStateDefinition();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_STATE_DEFINITION__OBJECT = eINSTANCE.getPrimitiveStateDefinition_Object();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_STATE_DEFINITION__ID = eINSTANCE.getPrimitiveStateDefinition_Id();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.CompoundStateDefinitionImpl <em>Compound State Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.CompoundStateDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getCompoundStateDefinition()
     * @generated
     */
    EClass COMPOUND_STATE_DEFINITION = eINSTANCE.getCompoundStateDefinition();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOUND_STATE_DEFINITION__OBJECT = eINSTANCE.getCompoundStateDefinition_Object();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATE_DEFINITION__STATE = eINSTANCE.getCompoundStateDefinition_State();

    /**
     * The meta object literal for the '<em><b>Compound State Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATE_DEFINITION__COMPOUND_STATE_DEF = eINSTANCE.getCompoundStateDefinition_CompoundStateDef();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateDefinitionImpl <em>State Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateDefinition()
     * @generated
     */
    EClass STATE_DEFINITION = eINSTANCE.getStateDefinition();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DEFINITION__OBJECT = eINSTANCE.getStateDefinition_Object();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DEFINITION__STATE = eINSTANCE.getStateDefinition_State();

    /**
     * The meta object literal for the '<em><b>With Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DEFINITION__WITH_DEFINITION = eINSTANCE.getStateDefinition_WithDefinition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateIDImpl <em>State ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateIDImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateID()
     * @generated
     */
    EClass STATE_ID = eINSTANCE.getStateID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ID__NAME = eINSTANCE.getStateID_Name();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_ID__INSTANCE = eINSTANCE.getStateID_Instance();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ID__LIST = eINSTANCE.getStateID_List();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_ID__VALUE = eINSTANCE.getStateID_Value();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.WithStatesDefinitionImpl <em>With States Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.WithStatesDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getWithStatesDefinition()
     * @generated
     */
    EClass WITH_STATES_DEFINITION = eINSTANCE.getWithStatesDefinition();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH_STATES_DEFINITION__COMPOSITION = eINSTANCE.getWithStatesDefinition_Composition();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_STATES_DEFINITION__PREDICATE = eINSTANCE.getWithStatesDefinition_Predicate();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.WithTransitionsDefinitionImpl <em>With Transitions Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.WithTransitionsDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getWithTransitionsDefinition()
     * @generated
     */
    EClass WITH_TRANSITIONS_DEFINITION = eINSTANCE.getWithTransitionsDefinition();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WITH_TRANSITIONS_DEFINITION__COMPOSITION = eINSTANCE.getWithTransitionsDefinition_Composition();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_TRANSITIONS_DEFINITION__TRANSITIONS = eINSTANCE.getWithTransitionsDefinition_Transitions();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ReferenceStateImpl <em>Reference State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ReferenceStateImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getReferenceState()
     * @generated
     */
    EClass REFERENCE_STATE = eINSTANCE.getReferenceState();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_STATE__OBJECT = eINSTANCE.getReferenceState_Object();

    /**
     * The meta object literal for the '<em><b>Ref State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__REF_STATE = eINSTANCE.getReferenceState_RefState();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__FROM = eINSTANCE.getReferenceState_From();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__STATE = eINSTANCE.getReferenceState_State();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__COMPOSITION = eINSTANCE.getReferenceState_Composition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionDefinitionImpl <em>Transition Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDefinition()
     * @generated
     */
    EClass TRANSITION_DEFINITION = eINSTANCE.getTransitionDefinition();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DEFINITION__OBJECT = eINSTANCE.getTransitionDefinition_Object();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DEFINITION__TRANSITION = eINSTANCE.getTransitionDefinition_Transition();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DEFINITION__IN = eINSTANCE.getTransitionDefinition_In();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DEFINITION__OUT = eINSTANCE.getTransitionDefinition_Out();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DEFINITION__COMPOSITION = eINSTANCE.getTransitionDefinition_Composition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionIDImpl <em>Transition ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionIDImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionID()
     * @generated
     */
    EClass TRANSITION_ID = eINSTANCE.getTransitionID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_ID__NAME = eINSTANCE.getTransitionID_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_ID__VALUE = eINSTANCE.getTransitionID_Value();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ReferenceTransitionImpl <em>Reference Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ReferenceTransitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getReferenceTransition()
     * @generated
     */
    EClass REFERENCE_TRANSITION = eINSTANCE.getReferenceTransition();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_TRANSITION__OBJECT = eINSTANCE.getReferenceTransition_Object();

    /**
     * The meta object literal for the '<em><b>Ref Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__REF_TRANSITION = eINSTANCE.getReferenceTransition_RefTransition();

    /**
     * The meta object literal for the '<em><b>From Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__FROM_DEF = eINSTANCE.getReferenceTransition_FromDef();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__TRANSITION = eINSTANCE.getReferenceTransition_Transition();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__COMPOSITION = eINSTANCE.getReferenceTransition_Composition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.FromFieldDefinitionImpl <em>From Field Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.FromFieldDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getFromFieldDefinition()
     * @generated
     */
    EClass FROM_FIELD_DEFINITION = eINSTANCE.getFromFieldDefinition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_FIELD_DEFINITION__FROM = eINSTANCE.getFromFieldDefinition_From();

    /**
     * The meta object literal for the '<em><b>Ref Space</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_FIELD_DEFINITION__REF_SPACE = eINSTANCE.getFromFieldDefinition_RefSpace();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.InputDefinitionImpl <em>Input Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InputDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInputDefinition()
     * @generated
     */
    EClass INPUT_DEFINITION = eINSTANCE.getInputDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_DEFINITION__INPUT = eINSTANCE.getInputDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Input State</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_DEFINITION__INPUT_STATE = eINSTANCE.getInputDefinition_InputState();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.OutputDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getOutputDefinition()
     * @generated
     */
    EClass OUTPUT_DEFINITION = eINSTANCE.getOutputDefinition();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_DEFINITION__OUTPUT = eINSTANCE.getOutputDefinition_Output();

    /**
     * The meta object literal for the '<em><b>Output State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DEFINITION__OUTPUT_STATE = eINSTANCE.getOutputDefinition_OutputState();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ExtendsDefinitionImpl <em>Extends Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ExtendsDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getExtendsDefinition()
     * @generated
     */
    EClass EXTENDS_DEFINITION = eINSTANCE.getExtendsDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS_DEFINITION__TYPE = eINSTANCE.getExtendsDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS_DEFINITION__NAMESPACES = eINSTANCE.getExtendsDefinition_Namespaces();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InstanceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Instance Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__INSTANCE_DEF = eINSTANCE.getInstance_InstanceDef();

    /**
     * The meta object literal for the '<em><b>Transition Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TRANSITION_DECLARATION = eINSTANCE.getInstance_TransitionDeclaration();

    /**
     * The meta object literal for the '<em><b>State Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__STATE_DECLARATION = eINSTANCE.getInstance_StateDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__STATE = eINSTANCE.getInstance_State();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TRANSITION = eINSTANCE.getInstance_Transition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionDeclarationImpl <em>Transition Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionDeclarationImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDeclaration()
     * @generated
     */
    EClass TRANSITION_DECLARATION = eINSTANCE.getTransitionDeclaration();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__OBJECT_TYPE = eINSTANCE.getTransitionDeclaration_ObjectType();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DECLARATION__TRANSITION = eINSTANCE.getTransitionDeclaration_Transition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateDeclarationImpl <em>State Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateDeclarationImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateDeclaration()
     * @generated
     */
    EClass STATE_DECLARATION = eINSTANCE.getStateDeclaration();

    /**
     * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DECLARATION__OBJECT_TYPE = eINSTANCE.getStateDeclaration_ObjectType();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DECLARATION__STATE = eINSTANCE.getStateDeclaration_State();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionInstanceImpl <em>Transition Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionInstanceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionInstance()
     * @generated
     */
    EClass TRANSITION_INSTANCE = eINSTANCE.getTransitionInstance();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_INSTANCE__HOST = eINSTANCE.getTransitionInstance_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_INSTANCE__PORT = eINSTANCE.getTransitionInstance_Port();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_INSTANCE__PATH = eINSTANCE.getTransitionInstance_Path();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateInstanceImpl <em>State Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateInstanceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateInstance()
     * @generated
     */
    EClass STATE_INSTANCE = eINSTANCE.getStateInstance();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_INSTANCE__MEMBERS = eINSTANCE.getStateInstance_Members();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.UseDefinitionImpl <em>Use Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.UseDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getUseDefinition()
     * @generated
     */
    EClass USE_DEFINITION = eINSTANCE.getUseDefinition();

    /**
     * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_DEFINITION__USE = eINSTANCE.getUseDefinition_Use();

    /**
     * The meta object literal for the '<em><b>Predefined Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_DEFINITION__PREDEFINED_VALUE = eINSTANCE.getUseDefinition_PredefinedValue();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.SetStatementImpl <em>Set Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.SetStatementImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getSetStatement()
     * @generated
     */
    EClass SET_STATEMENT = eINSTANCE.getSetStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_STATEMENT__STATEMENT = eINSTANCE.getSetStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_STATEMENT__VARIABLE = eINSTANCE.getSetStatement_Variable();

    /**
     * The meta object literal for the '<em><b>To Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_STATEMENT__TO_DEF = eINSTANCE.getSetStatement_ToDef();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ToDefinitionImpl <em>To Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ToDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getToDefinition()
     * @generated
     */
    EClass TO_DEFINITION = eINSTANCE.getToDefinition();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TO_DEFINITION__TO = eINSTANCE.getToDefinition_To();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TO_DEFINITION__VALUE = eINSTANCE.getToDefinition_Value();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.PredicateImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE__NEGATION = eINSTANCE.getPredicate_Negation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__EXPRESSION = eINSTANCE.getPredicate_Expression();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.BinaryExpressionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionalExpressionImpl <em>Transitional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionalExpressionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionalExpression()
     * @generated
     */
    EClass TRANSITIONAL_EXPRESSION = eINSTANCE.getTransitionalExpression();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.OperationImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

  }

} //WorkPackage
