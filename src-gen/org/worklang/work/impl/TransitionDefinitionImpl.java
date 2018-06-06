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

import org.worklang.work.InputDefinition;
import org.worklang.work.OutputDefinition;
import org.worklang.work.TransitionDefinition;
import org.worklang.work.TransitionID;
import org.worklang.work.WithTransitionsDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.TransitionDefinitionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionDefinitionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionDefinitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionDefinitionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.worklang.work.impl.TransitionDefinitionImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionDefinitionImpl extends MinimalEObjectImpl.Container implements TransitionDefinition
{
  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected String object = OBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected TransitionID transition;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected InputDefinition in;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected OutputDefinition out;

  /**
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected WithTransitionsDefinition composition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionDefinitionImpl()
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
    return WorkPackage.Literals.TRANSITION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(String newObject)
  {
    String oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID getTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransition(TransitionID newTransition, NotificationChain msgs)
  {
    TransitionID oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__TRANSITION, oldTransition, newTransition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(TransitionID newTransition)
  {
    if (newTransition != transition)
    {
      NotificationChain msgs = null;
      if (transition != null)
        msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__TRANSITION, null, msgs);
      if (newTransition != null)
        msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__TRANSITION, null, msgs);
      msgs = basicSetTransition(newTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__TRANSITION, newTransition, newTransition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputDefinition getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn(InputDefinition newIn, NotificationChain msgs)
  {
    InputDefinition oldIn = in;
    in = newIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__IN, oldIn, newIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(InputDefinition newIn)
  {
    if (newIn != in)
    {
      NotificationChain msgs = null;
      if (in != null)
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__IN, newIn, newIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDefinition getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(OutputDefinition newOut, NotificationChain msgs)
  {
    OutputDefinition oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(OutputDefinition newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__OUT, newOut, newOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithTransitionsDefinition getComposition()
  {
    return composition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposition(WithTransitionsDefinition newComposition, NotificationChain msgs)
  {
    WithTransitionsDefinition oldComposition = composition;
    composition = newComposition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__COMPOSITION, oldComposition, newComposition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposition(WithTransitionsDefinition newComposition)
  {
    if (newComposition != composition)
    {
      NotificationChain msgs = null;
      if (composition != null)
        msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__COMPOSITION, null, msgs);
      if (newComposition != null)
        msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.TRANSITION_DEFINITION__COMPOSITION, null, msgs);
      msgs = basicSetComposition(newComposition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.TRANSITION_DEFINITION__COMPOSITION, newComposition, newComposition));
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
      case WorkPackage.TRANSITION_DEFINITION__TRANSITION:
        return basicSetTransition(null, msgs);
      case WorkPackage.TRANSITION_DEFINITION__IN:
        return basicSetIn(null, msgs);
      case WorkPackage.TRANSITION_DEFINITION__OUT:
        return basicSetOut(null, msgs);
      case WorkPackage.TRANSITION_DEFINITION__COMPOSITION:
        return basicSetComposition(null, msgs);
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
      case WorkPackage.TRANSITION_DEFINITION__OBJECT:
        return getObject();
      case WorkPackage.TRANSITION_DEFINITION__TRANSITION:
        return getTransition();
      case WorkPackage.TRANSITION_DEFINITION__IN:
        return getIn();
      case WorkPackage.TRANSITION_DEFINITION__OUT:
        return getOut();
      case WorkPackage.TRANSITION_DEFINITION__COMPOSITION:
        return getComposition();
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
      case WorkPackage.TRANSITION_DEFINITION__OBJECT:
        setObject((String)newValue);
        return;
      case WorkPackage.TRANSITION_DEFINITION__TRANSITION:
        setTransition((TransitionID)newValue);
        return;
      case WorkPackage.TRANSITION_DEFINITION__IN:
        setIn((InputDefinition)newValue);
        return;
      case WorkPackage.TRANSITION_DEFINITION__OUT:
        setOut((OutputDefinition)newValue);
        return;
      case WorkPackage.TRANSITION_DEFINITION__COMPOSITION:
        setComposition((WithTransitionsDefinition)newValue);
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
      case WorkPackage.TRANSITION_DEFINITION__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case WorkPackage.TRANSITION_DEFINITION__TRANSITION:
        setTransition((TransitionID)null);
        return;
      case WorkPackage.TRANSITION_DEFINITION__IN:
        setIn((InputDefinition)null);
        return;
      case WorkPackage.TRANSITION_DEFINITION__OUT:
        setOut((OutputDefinition)null);
        return;
      case WorkPackage.TRANSITION_DEFINITION__COMPOSITION:
        setComposition((WithTransitionsDefinition)null);
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
      case WorkPackage.TRANSITION_DEFINITION__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case WorkPackage.TRANSITION_DEFINITION__TRANSITION:
        return transition != null;
      case WorkPackage.TRANSITION_DEFINITION__IN:
        return in != null;
      case WorkPackage.TRANSITION_DEFINITION__OUT:
        return out != null;
      case WorkPackage.TRANSITION_DEFINITION__COMPOSITION:
        return composition != null;
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
    result.append(" (object: ");
    result.append(object);
    result.append(')');
    return result.toString();
  }

} //TransitionDefinitionImpl
