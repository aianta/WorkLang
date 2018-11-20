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

import org.worklang.work.DefinitionSpace;
import org.worklang.work.Domain;
import org.worklang.work.InstanceSpace;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.impl.DomainImpl#getDefinitionSpace <em>Definition Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.DomainImpl#getInstanceSpace <em>Instance Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinitionSpace() <em>Definition Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionSpace()
   * @generated
   * @ordered
   */
  protected DefinitionSpace definitionSpace;

  /**
   * The cached value of the '{@link #getInstanceSpace() <em>Instance Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceSpace()
   * @generated
   * @ordered
   */
  protected InstanceSpace instanceSpace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainImpl()
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
    return WorkPackage.Literals.DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.DOMAIN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSpace getDefinitionSpace()
  {
    return definitionSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitionSpace(DefinitionSpace newDefinitionSpace, NotificationChain msgs)
  {
    DefinitionSpace oldDefinitionSpace = definitionSpace;
    definitionSpace = newDefinitionSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.DOMAIN__DEFINITION_SPACE, oldDefinitionSpace, newDefinitionSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinitionSpace(DefinitionSpace newDefinitionSpace)
  {
    if (newDefinitionSpace != definitionSpace)
    {
      NotificationChain msgs = null;
      if (definitionSpace != null)
        msgs = ((InternalEObject)definitionSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.DOMAIN__DEFINITION_SPACE, null, msgs);
      if (newDefinitionSpace != null)
        msgs = ((InternalEObject)newDefinitionSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.DOMAIN__DEFINITION_SPACE, null, msgs);
      msgs = basicSetDefinitionSpace(newDefinitionSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.DOMAIN__DEFINITION_SPACE, newDefinitionSpace, newDefinitionSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceSpace getInstanceSpace()
  {
    return instanceSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstanceSpace(InstanceSpace newInstanceSpace, NotificationChain msgs)
  {
    InstanceSpace oldInstanceSpace = instanceSpace;
    instanceSpace = newInstanceSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.DOMAIN__INSTANCE_SPACE, oldInstanceSpace, newInstanceSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstanceSpace(InstanceSpace newInstanceSpace)
  {
    if (newInstanceSpace != instanceSpace)
    {
      NotificationChain msgs = null;
      if (instanceSpace != null)
        msgs = ((InternalEObject)instanceSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.DOMAIN__INSTANCE_SPACE, null, msgs);
      if (newInstanceSpace != null)
        msgs = ((InternalEObject)newInstanceSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.DOMAIN__INSTANCE_SPACE, null, msgs);
      msgs = basicSetInstanceSpace(newInstanceSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.DOMAIN__INSTANCE_SPACE, newInstanceSpace, newInstanceSpace));
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
      case WorkPackage.DOMAIN__DEFINITION_SPACE:
        return basicSetDefinitionSpace(null, msgs);
      case WorkPackage.DOMAIN__INSTANCE_SPACE:
        return basicSetInstanceSpace(null, msgs);
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
      case WorkPackage.DOMAIN__NAME:
        return getName();
      case WorkPackage.DOMAIN__DEFINITION_SPACE:
        return getDefinitionSpace();
      case WorkPackage.DOMAIN__INSTANCE_SPACE:
        return getInstanceSpace();
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
      case WorkPackage.DOMAIN__NAME:
        setName((String)newValue);
        return;
      case WorkPackage.DOMAIN__DEFINITION_SPACE:
        setDefinitionSpace((DefinitionSpace)newValue);
        return;
      case WorkPackage.DOMAIN__INSTANCE_SPACE:
        setInstanceSpace((InstanceSpace)newValue);
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
      case WorkPackage.DOMAIN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WorkPackage.DOMAIN__DEFINITION_SPACE:
        setDefinitionSpace((DefinitionSpace)null);
        return;
      case WorkPackage.DOMAIN__INSTANCE_SPACE:
        setInstanceSpace((InstanceSpace)null);
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
      case WorkPackage.DOMAIN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WorkPackage.DOMAIN__DEFINITION_SPACE:
        return definitionSpace != null;
      case WorkPackage.DOMAIN__INSTANCE_SPACE:
        return instanceSpace != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DomainImpl
