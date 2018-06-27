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

import org.worklang.work.IfInstruction;
import org.worklang.work.InstructionExpression;
import org.worklang.work.ResolvableValue;
import org.worklang.work.TestValue;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.IfInstructionImpl#getTestKey <em>Test Key</em>}</li>
 *   <li>{@link org.worklang.work.impl.IfInstructionImpl#getTestValue <em>Test Value</em>}</li>
 *   <li>{@link org.worklang.work.impl.IfInstructionImpl#getToComputeIfTrue <em>To Compute If True</em>}</li>
 *   <li>{@link org.worklang.work.impl.IfInstructionImpl#getToComputeIfFalse <em>To Compute If False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfInstructionImpl extends InstructionExpressionImpl implements IfInstruction
{
  /**
   * The cached value of the '{@link #getTestKey() <em>Test Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestKey()
   * @generated
   * @ordered
   */
  protected ResolvableValue testKey;

  /**
   * The cached value of the '{@link #getTestValue() <em>Test Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestValue()
   * @generated
   * @ordered
   */
  protected TestValue testValue;

  /**
   * The cached value of the '{@link #getToComputeIfTrue() <em>To Compute If True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToComputeIfTrue()
   * @generated
   * @ordered
   */
  protected InstructionExpression toComputeIfTrue;

  /**
   * The cached value of the '{@link #getToComputeIfFalse() <em>To Compute If False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToComputeIfFalse()
   * @generated
   * @ordered
   */
  protected InstructionExpression toComputeIfFalse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfInstructionImpl()
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
    return WorkPackage.Literals.IF_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolvableValue getTestKey()
  {
    return testKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestKey(ResolvableValue newTestKey, NotificationChain msgs)
  {
    ResolvableValue oldTestKey = testKey;
    testKey = newTestKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TEST_KEY, oldTestKey, newTestKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestKey(ResolvableValue newTestKey)
  {
    if (newTestKey != testKey)
    {
      NotificationChain msgs = null;
      if (testKey != null)
        msgs = ((InternalEObject)testKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TEST_KEY, null, msgs);
      if (newTestKey != null)
        msgs = ((InternalEObject)newTestKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TEST_KEY, null, msgs);
      msgs = basicSetTestKey(newTestKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TEST_KEY, newTestKey, newTestKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestValue getTestValue()
  {
    return testValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestValue(TestValue newTestValue, NotificationChain msgs)
  {
    TestValue oldTestValue = testValue;
    testValue = newTestValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TEST_VALUE, oldTestValue, newTestValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestValue(TestValue newTestValue)
  {
    if (newTestValue != testValue)
    {
      NotificationChain msgs = null;
      if (testValue != null)
        msgs = ((InternalEObject)testValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TEST_VALUE, null, msgs);
      if (newTestValue != null)
        msgs = ((InternalEObject)newTestValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TEST_VALUE, null, msgs);
      msgs = basicSetTestValue(newTestValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TEST_VALUE, newTestValue, newTestValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstructionExpression getToComputeIfTrue()
  {
    return toComputeIfTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToComputeIfTrue(InstructionExpression newToComputeIfTrue, NotificationChain msgs)
  {
    InstructionExpression oldToComputeIfTrue = toComputeIfTrue;
    toComputeIfTrue = newToComputeIfTrue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE, oldToComputeIfTrue, newToComputeIfTrue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToComputeIfTrue(InstructionExpression newToComputeIfTrue)
  {
    if (newToComputeIfTrue != toComputeIfTrue)
    {
      NotificationChain msgs = null;
      if (toComputeIfTrue != null)
        msgs = ((InternalEObject)toComputeIfTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE, null, msgs);
      if (newToComputeIfTrue != null)
        msgs = ((InternalEObject)newToComputeIfTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE, null, msgs);
      msgs = basicSetToComputeIfTrue(newToComputeIfTrue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE, newToComputeIfTrue, newToComputeIfTrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstructionExpression getToComputeIfFalse()
  {
    return toComputeIfFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToComputeIfFalse(InstructionExpression newToComputeIfFalse, NotificationChain msgs)
  {
    InstructionExpression oldToComputeIfFalse = toComputeIfFalse;
    toComputeIfFalse = newToComputeIfFalse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE, oldToComputeIfFalse, newToComputeIfFalse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToComputeIfFalse(InstructionExpression newToComputeIfFalse)
  {
    if (newToComputeIfFalse != toComputeIfFalse)
    {
      NotificationChain msgs = null;
      if (toComputeIfFalse != null)
        msgs = ((InternalEObject)toComputeIfFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE, null, msgs);
      if (newToComputeIfFalse != null)
        msgs = ((InternalEObject)newToComputeIfFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE, null, msgs);
      msgs = basicSetToComputeIfFalse(newToComputeIfFalse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE, newToComputeIfFalse, newToComputeIfFalse));
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
      case WorkPackage.IF_INSTRUCTION__TEST_KEY:
        return basicSetTestKey(null, msgs);
      case WorkPackage.IF_INSTRUCTION__TEST_VALUE:
        return basicSetTestValue(null, msgs);
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE:
        return basicSetToComputeIfTrue(null, msgs);
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE:
        return basicSetToComputeIfFalse(null, msgs);
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
      case WorkPackage.IF_INSTRUCTION__TEST_KEY:
        return getTestKey();
      case WorkPackage.IF_INSTRUCTION__TEST_VALUE:
        return getTestValue();
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE:
        return getToComputeIfTrue();
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE:
        return getToComputeIfFalse();
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
      case WorkPackage.IF_INSTRUCTION__TEST_KEY:
        setTestKey((ResolvableValue)newValue);
        return;
      case WorkPackage.IF_INSTRUCTION__TEST_VALUE:
        setTestValue((TestValue)newValue);
        return;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE:
        setToComputeIfTrue((InstructionExpression)newValue);
        return;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE:
        setToComputeIfFalse((InstructionExpression)newValue);
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
      case WorkPackage.IF_INSTRUCTION__TEST_KEY:
        setTestKey((ResolvableValue)null);
        return;
      case WorkPackage.IF_INSTRUCTION__TEST_VALUE:
        setTestValue((TestValue)null);
        return;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE:
        setToComputeIfTrue((InstructionExpression)null);
        return;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE:
        setToComputeIfFalse((InstructionExpression)null);
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
      case WorkPackage.IF_INSTRUCTION__TEST_KEY:
        return testKey != null;
      case WorkPackage.IF_INSTRUCTION__TEST_VALUE:
        return testValue != null;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_TRUE:
        return toComputeIfTrue != null;
      case WorkPackage.IF_INSTRUCTION__TO_COMPUTE_IF_FALSE:
        return toComputeIfFalse != null;
    }
    return super.eIsSet(featureID);
  }

} //IfInstructionImpl
