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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.worklang.work.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFactoryImpl extends EFactoryImpl implements WorkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkFactory init()
  {
    try
    {
      WorkFactory theWorkFactory = (WorkFactory)EPackage.Registry.INSTANCE.getEFactory(WorkPackage.eNS_URI);
      if (theWorkFactory != null)
      {
        return theWorkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WorkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WorkPackage.DOMAIN: return createDomain();
      case WorkPackage.STATE: return createState();
      case WorkPackage.TRANSITION: return createTransition();
      case WorkPackage.DEFINITION_SPACE: return createDefinitionSpace();
      case WorkPackage.INSTANCE_SPACE: return createInstanceSpace();
      case WorkPackage.INSTANCE: return createInstance();
      case WorkPackage.TRANSITION_INSTANCE: return createTransitionInstance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSpace createDefinitionSpace()
  {
    DefinitionSpaceImpl definitionSpace = new DefinitionSpaceImpl();
    return definitionSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceSpace createInstanceSpace()
  {
    InstanceSpaceImpl instanceSpace = new InstanceSpaceImpl();
    return instanceSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionInstance createTransitionInstance()
  {
    TransitionInstanceImpl transitionInstance = new TransitionInstanceImpl();
    return transitionInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkPackage getWorkPackage()
  {
    return (WorkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WorkPackage getPackage()
  {
    return WorkPackage.eINSTANCE;
  }

} //WorkFactoryImpl
