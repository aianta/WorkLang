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
import org.worklang.work.FieldDefinition;
import org.worklang.work.InstanceSpace;
import org.worklang.work.MapSpace;
import org.worklang.work.ReferenceSpace;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getDefinitionSpace <em>Definition Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getReferenceSpace <em>Reference Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getMapSpace <em>Map Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getInstanceSpace <em>Instance Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDefinitionImpl extends MinimalEObjectImpl.Container implements FieldDefinition
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
   * The cached value of the '{@link #getReferenceSpace() <em>Reference Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceSpace()
   * @generated
   * @ordered
   */
  protected ReferenceSpace referenceSpace;

  /**
   * The cached value of the '{@link #getMapSpace() <em>Map Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapSpace()
   * @generated
   * @ordered
   */
  protected MapSpace mapSpace;

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
  protected FieldDefinitionImpl()
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
    return WorkPackage.Literals.FIELD_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE, oldDefinitionSpace, newDefinitionSpace);
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
        msgs = ((InternalEObject)definitionSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE, null, msgs);
      if (newDefinitionSpace != null)
        msgs = ((InternalEObject)newDefinitionSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE, null, msgs);
      msgs = basicSetDefinitionSpace(newDefinitionSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE, newDefinitionSpace, newDefinitionSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceSpace getReferenceSpace()
  {
    return referenceSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferenceSpace(ReferenceSpace newReferenceSpace, NotificationChain msgs)
  {
    ReferenceSpace oldReferenceSpace = referenceSpace;
    referenceSpace = newReferenceSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE, oldReferenceSpace, newReferenceSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceSpace(ReferenceSpace newReferenceSpace)
  {
    if (newReferenceSpace != referenceSpace)
    {
      NotificationChain msgs = null;
      if (referenceSpace != null)
        msgs = ((InternalEObject)referenceSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE, null, msgs);
      if (newReferenceSpace != null)
        msgs = ((InternalEObject)newReferenceSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE, null, msgs);
      msgs = basicSetReferenceSpace(newReferenceSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE, newReferenceSpace, newReferenceSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapSpace getMapSpace()
  {
    return mapSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapSpace(MapSpace newMapSpace, NotificationChain msgs)
  {
    MapSpace oldMapSpace = mapSpace;
    mapSpace = newMapSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__MAP_SPACE, oldMapSpace, newMapSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapSpace(MapSpace newMapSpace)
  {
    if (newMapSpace != mapSpace)
    {
      NotificationChain msgs = null;
      if (mapSpace != null)
        msgs = ((InternalEObject)mapSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__MAP_SPACE, null, msgs);
      if (newMapSpace != null)
        msgs = ((InternalEObject)newMapSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__MAP_SPACE, null, msgs);
      msgs = basicSetMapSpace(newMapSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__MAP_SPACE, newMapSpace, newMapSpace));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE, oldInstanceSpace, newInstanceSpace);
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
        msgs = ((InternalEObject)instanceSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE, null, msgs);
      if (newInstanceSpace != null)
        msgs = ((InternalEObject)newInstanceSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE, null, msgs);
      msgs = basicSetInstanceSpace(newInstanceSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE, newInstanceSpace, newInstanceSpace));
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
      case WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE:
        return basicSetDefinitionSpace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE:
        return basicSetReferenceSpace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__MAP_SPACE:
        return basicSetMapSpace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE:
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
      case WorkPackage.FIELD_DEFINITION__NAME:
        return getName();
      case WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE:
        return getDefinitionSpace();
      case WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE:
        return getReferenceSpace();
      case WorkPackage.FIELD_DEFINITION__MAP_SPACE:
        return getMapSpace();
      case WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE:
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
      case WorkPackage.FIELD_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE:
        setDefinitionSpace((DefinitionSpace)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE:
        setReferenceSpace((ReferenceSpace)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__MAP_SPACE:
        setMapSpace((MapSpace)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE:
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
      case WorkPackage.FIELD_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE:
        setDefinitionSpace((DefinitionSpace)null);
        return;
      case WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE:
        setReferenceSpace((ReferenceSpace)null);
        return;
      case WorkPackage.FIELD_DEFINITION__MAP_SPACE:
        setMapSpace((MapSpace)null);
        return;
      case WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE:
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
      case WorkPackage.FIELD_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WorkPackage.FIELD_DEFINITION__DEFINITION_SPACE:
        return definitionSpace != null;
      case WorkPackage.FIELD_DEFINITION__REFERENCE_SPACE:
        return referenceSpace != null;
      case WorkPackage.FIELD_DEFINITION__MAP_SPACE:
        return mapSpace != null;
      case WorkPackage.FIELD_DEFINITION__INSTANCE_SPACE:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FieldDefinitionImpl
