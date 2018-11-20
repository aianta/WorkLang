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
   * The meta object id for the '{@link org.worklang.work.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.DomainImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DEFINITION_SPACE = 1;

  /**
   * The feature id for the '<em><b>Instance Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__INSTANCE_SPACE = 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.StateImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__INPUT = 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OUTPUT = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.DefinitionSpaceImpl <em>Definition Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.DefinitionSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getDefinitionSpace()
   * @generated
   */
  int DEFINITION_SPACE = 3;

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
   * The meta object id for the '{@link org.worklang.work.impl.InstanceSpaceImpl <em>Instance Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstanceSpaceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstanceSpace()
   * @generated
   */
  int INSTANCE_SPACE = 4;

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
   * The meta object id for the '{@link org.worklang.work.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.InstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 5;

  /**
   * The feature id for the '<em><b>Conceptual Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__CONCEPTUAL_TRANSITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.worklang.work.impl.TransitionInstanceImpl <em>Transition Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.worklang.work.impl.TransitionInstanceImpl
   * @see org.worklang.work.impl.WorkPackageImpl#getTransitionInstance()
   * @generated
   */
  int TRANSITION_INSTANCE = 6;

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
   * Returns the meta object for class '{@link org.worklang.work.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.worklang.work.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Domain#getDefinitionSpace <em>Definition Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Space</em>'.
   * @see org.worklang.work.Domain#getDefinitionSpace()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_DefinitionSpace();

  /**
   * Returns the meta object for the containment reference '{@link org.worklang.work.Domain#getInstanceSpace <em>Instance Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instance Space</em>'.
   * @see org.worklang.work.Domain#getInstanceSpace()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_InstanceSpace();

  /**
   * Returns the meta object for class '{@link org.worklang.work.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.worklang.work.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link org.worklang.work.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.worklang.work.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link org.worklang.work.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.worklang.work.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.Transition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see org.worklang.work.Transition#getInput()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Input();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.Transition#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output</em>'.
   * @see org.worklang.work.Transition#getOutput()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Output();

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
   * Returns the meta object for class '{@link org.worklang.work.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.worklang.work.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link org.worklang.work.Instance#getConceptualTransition <em>Conceptual Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Conceptual Transition</em>'.
   * @see org.worklang.work.Instance#getConceptualTransition()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_ConceptualTransition();

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
     * The meta object literal for the '{@link org.worklang.work.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.DomainImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

    /**
     * The meta object literal for the '<em><b>Definition Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DEFINITION_SPACE = eINSTANCE.getDomain_DefinitionSpace();

    /**
     * The meta object literal for the '<em><b>Instance Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__INSTANCE_SPACE = eINSTANCE.getDomain_InstanceSpace();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.StateImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link org.worklang.work.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.TransitionImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

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
     * The meta object literal for the '{@link org.worklang.work.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.worklang.work.impl.InstanceImpl
     * @see org.worklang.work.impl.WorkPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Conceptual Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__CONCEPTUAL_TRANSITION = eINSTANCE.getInstance_ConceptualTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TRANSITION = eINSTANCE.getInstance_Transition();

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

  }

} //WorkPackage
