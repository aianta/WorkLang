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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.worklang.work.TransitionalExpression;
import org.worklang.work.WithTransitionsDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Transitions Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.WithTransitionsDefinitionImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.worklang.work.impl.WithTransitionsDefinitionImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithTransitionsDefinitionImpl extends MinimalEObjectImpl.Container implements WithTransitionsDefinition
{
  /**
   * The default value of the '{@link #getComposition() <em>Composition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected static final String COMPOSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected String composition = COMPOSITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected TransitionalExpression transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithTransitionsDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WorkPackage.Literals.WITH_TRANSITIONS_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComposition()
  {
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposition(String newComposition)
  {
    String oldComposition = composition;
    composition = newComposition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WITH_TRANSITIONS_DEFINITION__COMPOSITION, oldComposition, composition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionalExpression getTransitions()
  {
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransitions(TransitionalExpression newTransitions, NotificationChain msgs)
  {
    TransitionalExpression oldTransitions = transitions;
    transitions = newTransitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS, oldTransitions, newTransitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitions(TransitionalExpression newTransitions)
  {
    if (newTransitions != transitions)
    {
      NotificationChain msgs = null;
      if (transitions != null)
        msgs = ((InternalEObject)transitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS, null, msgs);
      if (newTransitions != null)
        msgs = ((InternalEObject)newTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS, null, msgs);
      msgs = basicSetTransitions(newTransitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS, newTransitions, newTransitions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS:
        return basicSetTransitions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__COMPOSITION:
        return getComposition();
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS:
        return getTransitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__COMPOSITION:
        setComposition((String)newValue);
        return;
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS:
        setTransitions((TransitionalExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__COMPOSITION:
        setComposition(COMPOSITION_EDEFAULT);
        return;
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS:
        setTransitions((TransitionalExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__COMPOSITION:
        return COMPOSITION_EDEFAULT == null ? composition != null : !COMPOSITION_EDEFAULT.equals(composition);
      case WorkPackage.WITH_TRANSITIONS_DEFINITION__TRANSITIONS:
        return transitions != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (composition: ");
    result.append(composition);
    result.append(')');
    return result.toString();
  }

} //WithTransitionsDefinitionImpl
