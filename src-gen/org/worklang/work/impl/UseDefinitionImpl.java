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

import org.worklang.work.FromFieldDefinition;
import org.worklang.work.StateID;
import org.worklang.work.UseDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.UseDefinitionImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.worklang.work.impl.UseDefinitionImpl#getPredefinedValue <em>Predefined Value</em>}</li>
 *   <li>{@link org.worklang.work.impl.UseDefinitionImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseDefinitionImpl extends MinimalEObjectImpl.Container implements UseDefinition
{
  /**
   * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected static final String USE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected String use = USE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredefinedValue() <em>Predefined Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefinedValue()
   * @generated
   * @ordered
   */
  protected StateID predefinedValue;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected FromFieldDefinition field;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseDefinitionImpl()
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
    return WorkPackage.Literals.USE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUse()
  {
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUse(String newUse)
  {
    String oldUse = use;
    use = newUse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.USE_DEFINITION__USE, oldUse, use));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID getPredefinedValue()
  {
    if (predefinedValue != null && predefinedValue.eIsProxy())
    {
      InternalEObject oldPredefinedValue = (InternalEObject)predefinedValue;
      predefinedValue = (StateID)eResolveProxy(oldPredefinedValue);
      if (predefinedValue != oldPredefinedValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.USE_DEFINITION__PREDEFINED_VALUE, oldPredefinedValue, predefinedValue));
      }
    }
    return predefinedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID basicGetPredefinedValue()
  {
    return predefinedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefinedValue(StateID newPredefinedValue)
  {
    StateID oldPredefinedValue = predefinedValue;
    predefinedValue = newPredefinedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.USE_DEFINITION__PREDEFINED_VALUE, oldPredefinedValue, predefinedValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromFieldDefinition getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField(FromFieldDefinition newField, NotificationChain msgs)
  {
    FromFieldDefinition oldField = field;
    field = newField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.USE_DEFINITION__FIELD, oldField, newField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(FromFieldDefinition newField)
  {
    if (newField != field)
    {
      NotificationChain msgs = null;
      if (field != null)
        msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.USE_DEFINITION__FIELD, null, msgs);
      if (newField != null)
        msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.USE_DEFINITION__FIELD, null, msgs);
      msgs = basicSetField(newField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.USE_DEFINITION__FIELD, newField, newField));
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
      case WorkPackage.USE_DEFINITION__FIELD:
        return basicSetField(null, msgs);
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
      case WorkPackage.USE_DEFINITION__USE:
        return getUse();
      case WorkPackage.USE_DEFINITION__PREDEFINED_VALUE:
        if (resolve) return getPredefinedValue();
        return basicGetPredefinedValue();
      case WorkPackage.USE_DEFINITION__FIELD:
        return getField();
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
      case WorkPackage.USE_DEFINITION__USE:
        setUse((String)newValue);
        return;
      case WorkPackage.USE_DEFINITION__PREDEFINED_VALUE:
        setPredefinedValue((StateID)newValue);
        return;
      case WorkPackage.USE_DEFINITION__FIELD:
        setField((FromFieldDefinition)newValue);
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
      case WorkPackage.USE_DEFINITION__USE:
        setUse(USE_EDEFAULT);
        return;
      case WorkPackage.USE_DEFINITION__PREDEFINED_VALUE:
        setPredefinedValue((StateID)null);
        return;
      case WorkPackage.USE_DEFINITION__FIELD:
        setField((FromFieldDefinition)null);
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
      case WorkPackage.USE_DEFINITION__USE:
        return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
      case WorkPackage.USE_DEFINITION__PREDEFINED_VALUE:
        return predefinedValue != null;
      case WorkPackage.USE_DEFINITION__FIELD:
        return field != null;
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
    result.append(" (use: ");
    result.append(use);
    result.append(')');
    return result.toString();
  }

} //UseDefinitionImpl
