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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.worklang.work.Instance;
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
  protected Instance predefinedValue;

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
  public Instance getPredefinedValue()
  {
    if (predefinedValue != null && predefinedValue.eIsProxy())
    {
      InternalEObject oldPredefinedValue = (InternalEObject)predefinedValue;
      predefinedValue = (Instance)eResolveProxy(oldPredefinedValue);
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
  public Instance basicGetPredefinedValue()
  {
    return predefinedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefinedValue(Instance newPredefinedValue)
  {
    Instance oldPredefinedValue = predefinedValue;
    predefinedValue = newPredefinedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.USE_DEFINITION__PREDEFINED_VALUE, oldPredefinedValue, predefinedValue));
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
        setPredefinedValue((Instance)newValue);
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
        setPredefinedValue((Instance)null);
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
