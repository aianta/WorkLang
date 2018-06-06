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

import org.worklang.work.Instance;
import org.worklang.work.Instancespace;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.InstancespaceImpl#getSpaceType <em>Space Type</em>}</li>
 *   <li>{@link org.worklang.work.impl.InstancespaceImpl#getInstanceStates <em>Instance States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancespaceImpl extends MinimalEObjectImpl.Container implements Instancespace
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
   * The cached value of the '{@link #getInstanceStates() <em>Instance States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceStates()
   * @generated
   * @ordered
   */
  protected EList<Instance> instanceStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstancespaceImpl()
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
    return WorkPackage.Literals.INSTANCESPACE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.INSTANCESPACE__SPACE_TYPE, oldSpaceType, spaceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getInstanceStates()
  {
    if (instanceStates == null)
    {
      instanceStates = new EObjectContainmentEList<Instance>(Instance.class, this, WorkPackage.INSTANCESPACE__INSTANCE_STATES);
    }
    return instanceStates;
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
      case WorkPackage.INSTANCESPACE__INSTANCE_STATES:
        return ((InternalEList<?>)getInstanceStates()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.INSTANCESPACE__SPACE_TYPE:
        return getSpaceType();
      case WorkPackage.INSTANCESPACE__INSTANCE_STATES:
        return getInstanceStates();
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
      case WorkPackage.INSTANCESPACE__SPACE_TYPE:
        setSpaceType((String)newValue);
        return;
      case WorkPackage.INSTANCESPACE__INSTANCE_STATES:
        getInstanceStates().clear();
        getInstanceStates().addAll((Collection<? extends Instance>)newValue);
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
      case WorkPackage.INSTANCESPACE__SPACE_TYPE:
        setSpaceType(SPACE_TYPE_EDEFAULT);
        return;
      case WorkPackage.INSTANCESPACE__INSTANCE_STATES:
        getInstanceStates().clear();
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
      case WorkPackage.INSTANCESPACE__SPACE_TYPE:
        return SPACE_TYPE_EDEFAULT == null ? spaceType != null : !SPACE_TYPE_EDEFAULT.equals(spaceType);
      case WorkPackage.INSTANCESPACE__INSTANCE_STATES:
        return instanceStates != null && !instanceStates.isEmpty();
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

} //InstancespaceImpl
