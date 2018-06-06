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

import org.worklang.work.SetStatement;
import org.worklang.work.StateID;
import org.worklang.work.ToDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.SetStatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.worklang.work.impl.SetStatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.worklang.work.impl.SetStatementImpl#getToDef <em>To Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetStatementImpl extends MinimalEObjectImpl.Container implements SetStatement
{
  /**
   * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected static final String STATEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected String statement = STATEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected StateID variable;

  /**
   * The cached value of the '{@link #getToDef() <em>To Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToDef()
   * @generated
   * @ordered
   */
  protected ToDefinition toDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetStatementImpl()
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
    return WorkPackage.Literals.SET_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(String newStatement)
  {
    String oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.SET_STATEMENT__STATEMENT, oldStatement, statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (StateID)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.SET_STATEMENT__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateID basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(StateID newVariable)
  {
    StateID oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.SET_STATEMENT__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToDefinition getToDef()
  {
    return toDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToDef(ToDefinition newToDef, NotificationChain msgs)
  {
    ToDefinition oldToDef = toDef;
    toDef = newToDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.SET_STATEMENT__TO_DEF, oldToDef, newToDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToDef(ToDefinition newToDef)
  {
    if (newToDef != toDef)
    {
      NotificationChain msgs = null;
      if (toDef != null)
        msgs = ((InternalEObject)toDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.SET_STATEMENT__TO_DEF, null, msgs);
      if (newToDef != null)
        msgs = ((InternalEObject)newToDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.SET_STATEMENT__TO_DEF, null, msgs);
      msgs = basicSetToDef(newToDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.SET_STATEMENT__TO_DEF, newToDef, newToDef));
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
      case WorkPackage.SET_STATEMENT__TO_DEF:
        return basicSetToDef(null, msgs);
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
      case WorkPackage.SET_STATEMENT__STATEMENT:
        return getStatement();
      case WorkPackage.SET_STATEMENT__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case WorkPackage.SET_STATEMENT__TO_DEF:
        return getToDef();
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
      case WorkPackage.SET_STATEMENT__STATEMENT:
        setStatement((String)newValue);
        return;
      case WorkPackage.SET_STATEMENT__VARIABLE:
        setVariable((StateID)newValue);
        return;
      case WorkPackage.SET_STATEMENT__TO_DEF:
        setToDef((ToDefinition)newValue);
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
      case WorkPackage.SET_STATEMENT__STATEMENT:
        setStatement(STATEMENT_EDEFAULT);
        return;
      case WorkPackage.SET_STATEMENT__VARIABLE:
        setVariable((StateID)null);
        return;
      case WorkPackage.SET_STATEMENT__TO_DEF:
        setToDef((ToDefinition)null);
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
      case WorkPackage.SET_STATEMENT__STATEMENT:
        return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
      case WorkPackage.SET_STATEMENT__VARIABLE:
        return variable != null;
      case WorkPackage.SET_STATEMENT__TO_DEF:
        return toDef != null;
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
    result.append(" (statement: ");
    result.append(statement);
    result.append(')');
    return result.toString();
  }

} //SetStatementImpl
