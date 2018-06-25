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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.FieldDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getFieldDefinition()
   * @generated
   */
  int FIELD_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__DEFINITION_SPACE = 1;

  /**
   * The feature id for the '<em><b>Reference Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__REFERENCE_SPACE = 2;

  /**
   * The feature id for the '<em><b>Map Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__MAP_SPACE = 3;

  /**
   * The feature id for the '<em><b>Instance Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION__INSTANCE_SPACE = 4;

  /**
   * The number of structural features of the '<em>Field Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.MapSpaceImpl <em>Map Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.MapSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getMapSpace()
   * @generated
   */
  int MAP_SPACE = 2;

  /**
   * The feature id for the '<em><b>Mapped States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_SPACE__MAPPED_STATES = 0;

  /**
   * The feature id for the '<em><b>Mapped Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_SPACE__MAPPED_TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Map Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_SPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateMappingImpl <em>State Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateMappingImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateMapping()
   * @generated
   */
  int STATE_MAPPING = 3;

  /**
   * The feature id for the '<em><b>Foreign State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MAPPING__FOREIGN_STATE = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MAPPING__FIELD = 1;

  /**
   * The feature id for the '<em><b>Local State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MAPPING__LOCAL_STATE = 2;

  /**
   * The number of structural features of the '<em>State Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MAPPING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionMappingImpl <em>Transition Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionMappingImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionMapping()
   * @generated
   */
  int TRANSITION_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Foreign Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_MAPPING__FOREIGN_TRANSITION = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_MAPPING__FIELD = 1;

  /**
   * The feature id for the '<em><b>Local Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_MAPPING__LOCAL_TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Transition Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_MAPPING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.DefinitionSpaceImpl <em>Definition Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.DefinitionSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getDefinitionSpace()
   * @generated
   */
  int DEFINITION_SPACE = 5;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SPACE__STATES = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SPACE__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Definition Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.BinaryExpressionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateDefinitionImpl <em>State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateDefinition()
   * @generated
   */
  int STATE_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__INSTANCE = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__LIST = BINARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__VALUE = BINARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__TYPE = BINARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION__NAME = BINARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DEFINITION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PrimitiveStateDefinitionImpl <em>Primitive State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PrimitiveStateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPrimitiveStateDefinition()
   * @generated
   */
  int PRIMITIVE_STATE_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__INSTANCE = STATE_DEFINITION__INSTANCE;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__LIST = STATE_DEFINITION__LIST;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__VALUE = STATE_DEFINITION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__TYPE = STATE_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION__NAME = STATE_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Primitive State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_STATE_DEFINITION_FEATURE_COUNT = STATE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.CompoundStateDefinitionImpl <em>Compound State Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.CompoundStateDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getCompoundStateDefinition()
   * @generated
   */
  int COMPOUND_STATE_DEFINITION = 8;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__INSTANCE = STATE_DEFINITION__INSTANCE;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__LIST = STATE_DEFINITION__LIST;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__VALUE = STATE_DEFINITION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__TYPE = STATE_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__NAME = STATE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION__COMPOSITION = STATE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound State Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATE_DEFINITION_FEATURE_COUNT = STATE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionalExpressionImpl <em>Transitional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionalExpressionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionalExpression()
   * @generated
   */
  int TRANSITIONAL_EXPRESSION = 30;

  /**
   * The number of structural features of the '<em>Transitional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionDefinitionImpl <em>Transition Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDefinition()
   * @generated
   */
  int TRANSITION_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__VALUE = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__TYPE = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__NAME = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__IN = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION__OUT = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Transition Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DEFINITION_FEATURE_COUNT = TRANSITIONAL_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PrimitiveTransitionDefinitionImpl <em>Primitive Transition Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PrimitiveTransitionDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPrimitiveTransitionDefinition()
   * @generated
   */
  int PRIMITIVE_TRANSITION_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION__VALUE = TRANSITION_DEFINITION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION__TYPE = TRANSITION_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION__NAME = TRANSITION_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION__IN = TRANSITION_DEFINITION__IN;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION__OUT = TRANSITION_DEFINITION__OUT;

  /**
   * The number of structural features of the '<em>Primitive Transition Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TRANSITION_DEFINITION_FEATURE_COUNT = TRANSITION_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.CompoundTransitionDefinitionImpl <em>Compound Transition Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.CompoundTransitionDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getCompoundTransitionDefinition()
   * @generated
   */
  int COMPOUND_TRANSITION_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__VALUE = TRANSITION_DEFINITION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__TYPE = TRANSITION_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__NAME = TRANSITION_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__IN = TRANSITION_DEFINITION__IN;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__OUT = TRANSITION_DEFINITION__OUT;

  /**
   * The feature id for the '<em><b>Composition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION__COMPOSITION = TRANSITION_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound Transition Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_TRANSITION_DEFINITION_FEATURE_COUNT = TRANSITION_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceSpaceImpl <em>Reference Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceSpace()
   * @generated
   */
  int REFERENCE_SPACE = 12;

  /**
   * The feature id for the '<em><b>Ref States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_SPACE__REF_STATES = 0;

  /**
   * The feature id for the '<em><b>Ref Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_SPACE__REF_TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Reference Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_SPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceTransitionImpl <em>Reference Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceTransitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceTransition()
   * @generated
   */
  int REFERENCE_TRANSITION = 13;

  /**
   * The feature id for the '<em><b>Ref Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__REF_TRANSITION = 0;

  /**
   * The feature id for the '<em><b>Foreign Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION__FOREIGN_FIELD = 1;

  /**
   * The number of structural features of the '<em>Reference Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ReferenceStateImpl <em>Reference State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ReferenceStateImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getReferenceState()
   * @generated
   */
  int REFERENCE_STATE = 14;

  /**
   * The feature id for the '<em><b>Ref State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__REF_STATE = 0;

  /**
   * The feature id for the '<em><b>Foreign Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE__FOREIGN_FIELD = 1;

  /**
   * The number of structural features of the '<em>Reference State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InstanceSpaceImpl <em>Instance Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstanceSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstanceSpace()
   * @generated
   */
  int INSTANCE_SPACE = 15;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPACE__INSTANCES = 0;

  /**
   * The number of structural features of the '<em>Instance Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_SPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.WithStatesDefinitionImpl <em>With States Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.WithStatesDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getWithStatesDefinition()
   * @generated
   */
  int WITH_STATES_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATES_DEFINITION__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>With States Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_STATES_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.WithTransitionsDefinitionImpl <em>With Transitions Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.WithTransitionsDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getWithTransitionsDefinition()
   * @generated
   */
  int WITH_TRANSITIONS_DEFINITION = 17;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSITIONS_DEFINITION__TRANSITIONS = 0;

  /**
   * The number of structural features of the '<em>With Transitions Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSITIONS_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InputDefinitionImpl <em>Input Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InputDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInputDefinition()
   * @generated
   */
  int INPUT_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Input State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEFINITION__INPUT_STATE = 0;

  /**
   * The number of structural features of the '<em>Input Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.OutputDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getOutputDefinition()
   * @generated
   */
  int OUTPUT_DEFINITION = 19;

  /**
   * The feature id for the '<em><b>Output State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__OUTPUT_STATE = 0;

  /**
   * The number of structural features of the '<em>Output Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 20;

  /**
   * The feature id for the '<em><b>Transition Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TRANSITION_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>State Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__STATE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 2;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__STATE = 3;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TRANSITION = 4;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionDeclarationImpl <em>Transition Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionDeclarationImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionDeclaration()
   * @generated
   */
  int TRANSITION_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__TRANSITION = 0;

  /**
   * The number of structural features of the '<em>Transition Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateDeclarationImpl <em>State Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateDeclarationImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getStateDeclaration()
   * @generated
   */
  int STATE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__STATE = 0;

  /**
   * The number of structural features of the '<em>State Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionInstanceImpl <em>Transition Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionInstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionInstance()
   * @generated
   */
  int TRANSITION_INSTANCE = 23;

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
  int STATE_INSTANCE = 24;

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
  int USE_DEFINITION = 25;

  /**
   * The feature id for the '<em><b>Predefined Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION__PREDEFINED_VALUE = 0;

  /**
   * The number of structural features of the '<em>Use Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.SetStatementImpl <em>Set Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.SetStatementImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getSetStatement()
   * @generated
   */
  int SET_STATEMENT = 26;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>To Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT__TO_DEF = 1;

  /**
   * The number of structural features of the '<em>Set Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.ToDefinitionImpl <em>To Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.ToDefinitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getToDefinition()
   * @generated
   */
  int TO_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_DEFINITION__VALUE = 0;

  /**
   * The number of structural features of the '<em>To Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.PredicateImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 28;

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
  int OPERATION = 31;

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
   * Returns the meta object for class '{@link org.worklang.work.FieldDefinition <em>Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Definition</em>'.
   * @see org.worklang.work.FieldDefinition
   * @generated
   */
  EClass getFieldDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.FieldDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.FieldDefinition#getName()
   * @see #getFieldDefinition()
   * @generated
   */
  EAttribute getFieldDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getDefinitionSpace <em>Definition Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Space</em>'.
   * @see org.worklang.work.FieldDefinition#getDefinitionSpace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_DefinitionSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getReferenceSpace <em>Reference Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference Space</em>'.
   * @see org.worklang.work.FieldDefinition#getReferenceSpace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_ReferenceSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getMapSpace <em>Map Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Space</em>'.
   * @see org.worklang.work.FieldDefinition#getMapSpace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_MapSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.FieldDefinition#getInstanceSpace <em>Instance Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instance Space</em>'.
   * @see org.worklang.work.FieldDefinition#getInstanceSpace()
   * @see #getFieldDefinition()
   * @generated
   */
  EReference getFieldDefinition_InstanceSpace();

  /**
   * Returns the meta object for class '{@link org.worklang.work.MapSpace <em>Map Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Space</em>'.
   * @see org.worklang.work.MapSpace
   * @generated
   */
  EClass getMapSpace();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.MapSpace#getMappedStates <em>Mapped States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped States</em>'.
   * @see org.worklang.work.MapSpace#getMappedStates()
   * @see #getMapSpace()
   * @generated
   */
  EReference getMapSpace_MappedStates();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.MapSpace#getMappedTransitions <em>Mapped Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Transitions</em>'.
   * @see org.worklang.work.MapSpace#getMappedTransitions()
   * @see #getMapSpace()
   * @generated
   */
  EReference getMapSpace_MappedTransitions();

  /**
   * Returns the meta object for class '{@link org.worklang.work.StateMapping <em>State Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Mapping</em>'.
   * @see org.worklang.work.StateMapping
   * @generated
   */
  EClass getStateMapping();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateMapping#getForeignState <em>Foreign State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Foreign State</em>'.
   * @see org.worklang.work.StateMapping#getForeignState()
   * @see #getStateMapping()
   * @generated
   */
  EReference getStateMapping_ForeignState();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateMapping#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.worklang.work.StateMapping#getField()
   * @see #getStateMapping()
   * @generated
   */
  EReference getStateMapping_Field();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateMapping#getLocalState <em>Local State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Local State</em>'.
   * @see org.worklang.work.StateMapping#getLocalState()
   * @see #getStateMapping()
   * @generated
   */
  EReference getStateMapping_LocalState();

  /**
   * Returns the meta object for class '{@link org.worklang.work.TransitionMapping <em>Transition Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Mapping</em>'.
   * @see org.worklang.work.TransitionMapping
   * @generated
   */
  EClass getTransitionMapping();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionMapping#getForeignTransition <em>Foreign Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Foreign Transition</em>'.
   * @see org.worklang.work.TransitionMapping#getForeignTransition()
   * @see #getTransitionMapping()
   * @generated
   */
  EReference getTransitionMapping_ForeignTransition();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionMapping#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.worklang.work.TransitionMapping#getField()
   * @see #getTransitionMapping()
   * @generated
   */
  EReference getTransitionMapping_Field();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionMapping#getLocalTransition <em>Local Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Local Transition</em>'.
   * @see org.worklang.work.TransitionMapping#getLocalTransition()
   * @see #getTransitionMapping()
   * @generated
   */
  EReference getTransitionMapping_LocalTransition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.DefinitionSpace <em>Definition Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Space</em>'.
   * @see org.worklang.work.DefinitionSpace
   * @generated
   */
  EClass getDefinitionSpace();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.DefinitionSpace#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.worklang.work.DefinitionSpace#getStates()
   * @see #getDefinitionSpace()
   * @generated
   */
  EReference getDefinitionSpace_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.DefinitionSpace#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.worklang.work.DefinitionSpace#getTransitions()
   * @see #getDefinitionSpace()
   * @generated
   */
  EReference getDefinitionSpace_Transitions();

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
   * Returns the meta object for the reference '{@link org.worklang.work.StateDefinition#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see org.worklang.work.StateDefinition#getInstance()
   * @see #getStateDefinition()
   * @generated
   */
  EReference getStateDefinition_Instance();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateDefinition#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.worklang.work.StateDefinition#isList()
   * @see #getStateDefinition()
   * @generated
   */
  EAttribute getStateDefinition_List();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.StateDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.worklang.work.StateDefinition#getValue()
   * @see #getStateDefinition()
   * @generated
   */
  EReference getStateDefinition_Value();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.worklang.work.StateDefinition#getType()
   * @see #getStateDefinition()
   * @generated
   */
  EAttribute getStateDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.StateDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.StateDefinition#getName()
   * @see #getStateDefinition()
   * @generated
   */
  EAttribute getStateDefinition_Name();

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
   * Returns the meta object for class '{@link org.worklang.work.CompoundStateDefinition <em>Compound State Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound State Definition</em>'.
   * @see org.worklang.work.CompoundStateDefinition
   * @generated
   */
  EClass getCompoundStateDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.CompoundStateDefinition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see org.worklang.work.CompoundStateDefinition#getComposition()
   * @see #getCompoundStateDefinition()
   * @generated
   */
  EReference getCompoundStateDefinition_Composition();

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
   * Returns the meta object for the reference '{@link org.worklang.work.TransitionDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.worklang.work.TransitionDefinition#getValue()
   * @see #getTransitionDefinition()
   * @generated
   */
  EReference getTransitionDefinition_Value();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.worklang.work.TransitionDefinition#getType()
   * @see #getTransitionDefinition()
   * @generated
   */
  EAttribute getTransitionDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.TransitionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.TransitionDefinition#getName()
   * @see #getTransitionDefinition()
   * @generated
   */
  EAttribute getTransitionDefinition_Name();

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
   * Returns the meta object for class '{@link org.worklang.work.PrimitiveTransitionDefinition <em>Primitive Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Transition Definition</em>'.
   * @see org.worklang.work.PrimitiveTransitionDefinition
   * @generated
   */
  EClass getPrimitiveTransitionDefinition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.CompoundTransitionDefinition <em>Compound Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Transition Definition</em>'.
   * @see org.worklang.work.CompoundTransitionDefinition
   * @generated
   */
  EClass getCompoundTransitionDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.CompoundTransitionDefinition#getComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composition</em>'.
   * @see org.worklang.work.CompoundTransitionDefinition#getComposition()
   * @see #getCompoundTransitionDefinition()
   * @generated
   */
  EReference getCompoundTransitionDefinition_Composition();

  /**
   * Returns the meta object for class '{@link org.worklang.work.ReferenceSpace <em>Reference Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Space</em>'.
   * @see org.worklang.work.ReferenceSpace
   * @generated
   */
  EClass getReferenceSpace();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.ReferenceSpace#getRefStates <em>Ref States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref States</em>'.
   * @see org.worklang.work.ReferenceSpace#getRefStates()
   * @see #getReferenceSpace()
   * @generated
   */
  EReference getReferenceSpace_RefStates();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.ReferenceSpace#getRefTransitions <em>Ref Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ref Transitions</em>'.
   * @see org.worklang.work.ReferenceSpace#getRefTransitions()
   * @see #getReferenceSpace()
   * @generated
   */
  EReference getReferenceSpace_RefTransitions();

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
   * Returns the meta object for the reference '{@link org.worklang.work.ReferenceTransition#getForeignField <em>Foreign Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Foreign Field</em>'.
   * @see org.worklang.work.ReferenceTransition#getForeignField()
   * @see #getReferenceTransition()
   * @generated
   */
  EReference getReferenceTransition_ForeignField();

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
   * Returns the meta object for the reference '{@link org.worklang.work.ReferenceState#getForeignField <em>Foreign Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Foreign Field</em>'.
   * @see org.worklang.work.ReferenceState#getForeignField()
   * @see #getReferenceState()
   * @generated
   */
  EReference getReferenceState_ForeignField();

  /**
   * Returns the meta object for class '{@link org.worklang.work.InstanceSpace <em>Instance Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Space</em>'.
   * @see org.worklang.work.InstanceSpace
   * @generated
   */
  EClass getInstanceSpace();

  /**
   * Returns the meta object for the containment reference list '{@link org.worklang.work.InstanceSpace#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.worklang.work.InstanceSpace#getInstances()
   * @see #getInstanceSpace()
   * @generated
   */
  EReference getInstanceSpace_Instances();

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
   * Returns the meta object for class '{@link org.worklang.work.InputDefinition <em>Input Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Definition</em>'.
   * @see org.worklang.work.InputDefinition
   * @generated
   */
  EClass getInputDefinition();

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
   * Returns the meta object for class '{@link org.worklang.work.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.worklang.work.Instance
   * @generated
   */
  EClass getInstance();

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
     * The meta object literal for the '{@link org.worklang.work.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.FieldDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getFieldDefinition()
     * @generated
     */
    EClass FIELD_DEFINITION = eINSTANCE.getFieldDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DEFINITION__NAME = eINSTANCE.getFieldDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Definition Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__DEFINITION_SPACE = eINSTANCE.getFieldDefinition_DefinitionSpace();

    /**
     * The meta object literal for the '<em><b>Reference Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__REFERENCE_SPACE = eINSTANCE.getFieldDefinition_ReferenceSpace();

    /**
     * The meta object literal for the '<em><b>Map Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__MAP_SPACE = eINSTANCE.getFieldDefinition_MapSpace();

    /**
     * The meta object literal for the '<em><b>Instance Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DEFINITION__INSTANCE_SPACE = eINSTANCE.getFieldDefinition_InstanceSpace();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.MapSpaceImpl <em>Map Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.MapSpaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getMapSpace()
     * @generated
     */
    EClass MAP_SPACE = eINSTANCE.getMapSpace();

    /**
     * The meta object literal for the '<em><b>Mapped States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_SPACE__MAPPED_STATES = eINSTANCE.getMapSpace_MappedStates();

    /**
     * The meta object literal for the '<em><b>Mapped Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_SPACE__MAPPED_TRANSITIONS = eINSTANCE.getMapSpace_MappedTransitions();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateMappingImpl <em>State Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateMappingImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getStateMapping()
     * @generated
     */
    EClass STATE_MAPPING = eINSTANCE.getStateMapping();

    /**
     * The meta object literal for the '<em><b>Foreign State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MAPPING__FOREIGN_STATE = eINSTANCE.getStateMapping_ForeignState();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MAPPING__FIELD = eINSTANCE.getStateMapping_Field();

    /**
     * The meta object literal for the '<em><b>Local State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MAPPING__LOCAL_STATE = eINSTANCE.getStateMapping_LocalState();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionMappingImpl <em>Transition Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionMappingImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransitionMapping()
     * @generated
     */
    EClass TRANSITION_MAPPING = eINSTANCE.getTransitionMapping();

    /**
     * The meta object literal for the '<em><b>Foreign Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_MAPPING__FOREIGN_TRANSITION = eINSTANCE.getTransitionMapping_ForeignTransition();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_MAPPING__FIELD = eINSTANCE.getTransitionMapping_Field();

    /**
     * The meta object literal for the '<em><b>Local Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_MAPPING__LOCAL_TRANSITION = eINSTANCE.getTransitionMapping_LocalTransition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.DefinitionSpaceImpl <em>Definition Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.DefinitionSpaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getDefinitionSpace()
     * @generated
     */
    EClass DEFINITION_SPACE = eINSTANCE.getDefinitionSpace();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_SPACE__STATES = eINSTANCE.getDefinitionSpace_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_SPACE__TRANSITIONS = eINSTANCE.getDefinitionSpace_Transitions();

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
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DEFINITION__INSTANCE = eINSTANCE.getStateDefinition_Instance();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DEFINITION__LIST = eINSTANCE.getStateDefinition_List();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DEFINITION__VALUE = eINSTANCE.getStateDefinition_Value();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DEFINITION__TYPE = eINSTANCE.getStateDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DEFINITION__NAME = eINSTANCE.getStateDefinition_Name();

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
     * The meta object literal for the '{@link org.worklang.work.impl.CompoundStateDefinitionImpl <em>Compound State Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.CompoundStateDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getCompoundStateDefinition()
     * @generated
     */
    EClass COMPOUND_STATE_DEFINITION = eINSTANCE.getCompoundStateDefinition();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATE_DEFINITION__COMPOSITION = eINSTANCE.getCompoundStateDefinition_Composition();

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
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DEFINITION__VALUE = eINSTANCE.getTransitionDefinition_Value();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DEFINITION__TYPE = eINSTANCE.getTransitionDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DEFINITION__NAME = eINSTANCE.getTransitionDefinition_Name();

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
     * The meta object literal for the '{@link org.worklang.work.impl.PrimitiveTransitionDefinitionImpl <em>Primitive Transition Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.PrimitiveTransitionDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getPrimitiveTransitionDefinition()
     * @generated
     */
    EClass PRIMITIVE_TRANSITION_DEFINITION = eINSTANCE.getPrimitiveTransitionDefinition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.CompoundTransitionDefinitionImpl <em>Compound Transition Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.CompoundTransitionDefinitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getCompoundTransitionDefinition()
     * @generated
     */
    EClass COMPOUND_TRANSITION_DEFINITION = eINSTANCE.getCompoundTransitionDefinition();

    /**
     * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_TRANSITION_DEFINITION__COMPOSITION = eINSTANCE.getCompoundTransitionDefinition_Composition();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.ReferenceSpaceImpl <em>Reference Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.ReferenceSpaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getReferenceSpace()
     * @generated
     */
    EClass REFERENCE_SPACE = eINSTANCE.getReferenceSpace();

    /**
     * The meta object literal for the '<em><b>Ref States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_SPACE__REF_STATES = eINSTANCE.getReferenceSpace_RefStates();

    /**
     * The meta object literal for the '<em><b>Ref Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_SPACE__REF_TRANSITIONS = eINSTANCE.getReferenceSpace_RefTransitions();

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
     * The meta object literal for the '<em><b>Ref Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__REF_TRANSITION = eINSTANCE.getReferenceTransition_RefTransition();

    /**
     * The meta object literal for the '<em><b>Foreign Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_TRANSITION__FOREIGN_FIELD = eINSTANCE.getReferenceTransition_ForeignField();

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
     * The meta object literal for the '<em><b>Ref State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__REF_STATE = eINSTANCE.getReferenceState_RefState();

    /**
     * The meta object literal for the '<em><b>Foreign Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_STATE__FOREIGN_FIELD = eINSTANCE.getReferenceState_ForeignField();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.InstanceSpaceImpl <em>Instance Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InstanceSpaceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInstanceSpace()
     * @generated
     */
    EClass INSTANCE_SPACE = eINSTANCE.getInstanceSpace();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_SPACE__INSTANCES = eINSTANCE.getInstanceSpace_Instances();

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
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_TRANSITIONS_DEFINITION__TRANSITIONS = eINSTANCE.getWithTransitionsDefinition_Transitions();

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
     * The meta object literal for the '<em><b>Output State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DEFINITION__OUTPUT_STATE = eINSTANCE.getOutputDefinition_OutputState();

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
