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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.worklang.work.ReferenceField;
import org.worklang.work.ReferenceState;
import org.worklang.work.ReferenceTransition;
import org.worklang.work.Referencespace;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferencespaceImpl#getSpaceType <em>Space Type</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferencespaceImpl#getRefFields <em>Ref Fields</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferencespaceImpl#getRefStates <em>Ref States</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferencespaceImpl#getRefTransition <em>Ref Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencespaceImpl extends MinimalEObjectImpl.Container implements Referencespace
{
  /**
   * The default value of the '{@link #getSpaceType() <em>Space Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpaceType()
   * @generated
   * @ordered
   */
  protected static final String SPACE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpaceType() <em>Space Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpaceType()
   * @generated
   * @ordered
   */
  protected String spaceType = SPACE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefFields() <em>Ref Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefFields()
   * @generated
   * @ordered
   */
  protected EList<ReferenceField> refFields;

  /**
   * The cached value of the '{@link #getRefStates() <em>Ref States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefStates()
   * @generated
   * @ordered
   */
  protected EList<ReferenceState> refStates;

  /**
   * The cached value of the '{@link #getRefTransition() <em>Ref Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTransition()
   * @generated
   * @ordered
   */
  protected EList<ReferenceTransition> refTransition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencespaceImpl()
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
    return WorkPackage.Literals.REFERENCESPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSpaceType()
  {
    return spaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpaceType(String newSpaceType)
  {
    String oldSpaceType = spaceType;
    spaceType = newSpaceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCESPACE__SPACE_TYPE, oldSpaceType, spaceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceField> getRefFields()
  {
    if (refFields == null)
    {
      refFields = new EObjectContainmentEList<ReferenceField>(ReferenceField.class, this, WorkPackage.REFERENCESPACE__REF_FIELDS);
    }
    return refFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceState> getRefStates()
  {
    if (refStates == null)
    {
      refStates = new EObjectContainmentEList<ReferenceState>(ReferenceState.class, this, WorkPackage.REFERENCESPACE__REF_STATES);
    }
    return refStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceTransition> getRefTransition()
  {
    if (refTransition == null)
    {
      refTransition = new EObjectContainmentEList<ReferenceTransition>(ReferenceTransition.class, this, WorkPackage.REFERENCESPACE__REF_TRANSITION);
    }
    return refTransition;
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
      case WorkPackage.REFERENCESPACE__REF_FIELDS:
        return ((InternalEList<?>)getRefFields()).basicRemove(otherEnd, msgs);
      case WorkPackage.REFERENCESPACE__REF_STATES:
        return ((InternalEList<?>)getRefStates()).basicRemove(otherEnd, msgs);
      case WorkPackage.REFERENCESPACE__REF_TRANSITION:
        return ((InternalEList<?>)getRefTransition()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.REFERENCESPACE__SPACE_TYPE:
        return getSpaceType();
      case WorkPackage.REFERENCESPACE__REF_FIELDS:
        return getRefFields();
      case WorkPackage.REFERENCESPACE__REF_STATES:
        return getRefStates();
      case WorkPackage.REFERENCESPACE__REF_TRANSITION:
        return getRefTransition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkPackage.REFERENCESPACE__SPACE_TYPE:
        setSpaceType((String)newValue);
        return;
      case WorkPackage.REFERENCESPACE__REF_FIELDS:
        getRefFields().clear();
        getRefFields().addAll((Collection<? extends ReferenceField>)newValue);
        return;
      case WorkPackage.REFERENCESPACE__REF_STATES:
        getRefStates().clear();
        getRefStates().addAll((Collection<? extends ReferenceState>)newValue);
        return;
      case WorkPackage.REFERENCESPACE__REF_TRANSITION:
        getRefTransition().clear();
        getRefTransition().addAll((Collection<? extends ReferenceTransition>)newValue);
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
      case WorkPackage.REFERENCESPACE__SPACE_TYPE:
        setSpaceType(SPACE_TYPE_EDEFAULT);
        return;
      case WorkPackage.REFERENCESPACE__REF_FIELDS:
        getRefFields().clear();
        return;
      case WorkPackage.REFERENCESPACE__REF_STATES:
        getRefStates().clear();
        return;
      case WorkPackage.REFERENCESPACE__REF_TRANSITION:
        getRefTransition().clear();
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
      case WorkPackage.REFERENCESPACE__SPACE_TYPE:
        return SPACE_TYPE_EDEFAULT == null ? spaceType != null : !SPACE_TYPE_EDEFAULT.equals(spaceType);
      case WorkPackage.REFERENCESPACE__REF_FIELDS:
        return refFields != null && !refFields.isEmpty();
      case WorkPackage.REFERENCESPACE__REF_STATES:
        return refStates != null && !refStates.isEmpty();
      case WorkPackage.REFERENCESPACE__REF_TRANSITION:
        return refTransition != null && !refTransition.isEmpty();
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
    result.append(" (spaceType: ");
    result.append(spaceType);
    result.append(')');
    return result.toString();
  }

} //ReferencespaceImpl
