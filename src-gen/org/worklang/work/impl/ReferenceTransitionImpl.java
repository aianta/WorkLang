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
import org.worklang.work.ReferenceTransition;
import org.worklang.work.TransitionID;
import org.worklang.work.WithTransitionsDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getRefTransition <em>Ref Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getFromDef <em>From Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.worklang.work.impl.ReferenceTransitionImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceTransitionImpl extends MinimalEObjectImpl.Container implements ReferenceTransition
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
   * The cached value of the '{@link #getRefTransition() <em>Ref Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTransition()
   * @generated
   * @ordered
   */
  protected TransitionID refTransition;

  /**
   * The cached value of the '{@link #getFromDef() <em>From Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromDef()
   * @generated
   * @ordered
   */
  protected FromFieldDefinition fromDef;

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
  protected ReferenceTransitionImpl()
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
    return WorkPackage.Literals.REFERENCE_TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID getRefTransition()
  {
    if (refTransition != null && refTransition.eIsProxy())
    {
      InternalEObject oldRefTransition = (InternalEObject)refTransition;
      refTransition = (TransitionID)eResolveProxy(oldRefTransition);
      if (refTransition != oldRefTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION, oldRefTransition, refTransition));
      }
    }
    return refTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionID basicGetRefTransition()
  {
    return refTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTransition(TransitionID newRefTransition)
  {
    TransitionID oldRefTransition = refTransition;
    refTransition = newRefTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION, oldRefTransition, refTransition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromFieldDefinition getFromDef()
  {
    return fromDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromDef(FromFieldDefinition newFromDef, NotificationChain msgs)
  {
    FromFieldDefinition oldFromDef = fromDef;
    fromDef = newFromDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__FROM_DEF, oldFromDef, newFromDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromDef(FromFieldDefinition newFromDef)
  {
    if (newFromDef != fromDef)
    {
      NotificationChain msgs = null;
      if (fromDef != null)
        msgs = ((InternalEObject)fromDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__FROM_DEF, null, msgs);
      if (newFromDef != null)
        msgs = ((InternalEObject)newFromDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__FROM_DEF, null, msgs);
      msgs = basicSetFromDef(newFromDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__FROM_DEF, newFromDef, newFromDef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__TRANSITION, oldTransition, newTransition);
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
        msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__TRANSITION, null, msgs);
      if (newTransition != null)
        msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__TRANSITION, null, msgs);
      msgs = basicSetTransition(newTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__TRANSITION, newTransition, newTransition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__COMPOSITION, oldComposition, newComposition);
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
        msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__COMPOSITION, null, msgs);
      if (newComposition != null)
        msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.REFERENCE_TRANSITION__COMPOSITION, null, msgs);
      msgs = basicSetComposition(newComposition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.REFERENCE_TRANSITION__COMPOSITION, newComposition, newComposition));
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
      case WorkPackage.REFERENCE_TRANSITION__FROM_DEF:
        return basicSetFromDef(null, msgs);
      case WorkPackage.REFERENCE_TRANSITION__TRANSITION:
        return basicSetTransition(null, msgs);
      case WorkPackage.REFERENCE_TRANSITION__COMPOSITION:
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
      case WorkPackage.REFERENCE_TRANSITION__OBJECT:
        return getObject();
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        if (resolve) return getRefTransition();
        return basicGetRefTransition();
      case WorkPackage.REFERENCE_TRANSITION__FROM_DEF:
        return getFromDef();
      case WorkPackage.REFERENCE_TRANSITION__TRANSITION:
        return getTransition();
      case WorkPackage.REFERENCE_TRANSITION__COMPOSITION:
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
      case WorkPackage.REFERENCE_TRANSITION__OBJECT:
        setObject((String)newValue);
        return;
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        setRefTransition((TransitionID)newValue);
        return;
      case WorkPackage.REFERENCE_TRANSITION__FROM_DEF:
        setFromDef((FromFieldDefinition)newValue);
        return;
      case WorkPackage.REFERENCE_TRANSITION__TRANSITION:
        setTransition((TransitionID)newValue);
        return;
      case WorkPackage.REFERENCE_TRANSITION__COMPOSITION:
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
      case WorkPackage.REFERENCE_TRANSITION__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        setRefTransition((TransitionID)null);
        return;
      case WorkPackage.REFERENCE_TRANSITION__FROM_DEF:
        setFromDef((FromFieldDefinition)null);
        return;
      case WorkPackage.REFERENCE_TRANSITION__TRANSITION:
        setTransition((TransitionID)null);
        return;
      case WorkPackage.REFERENCE_TRANSITION__COMPOSITION:
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
      case WorkPackage.REFERENCE_TRANSITION__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case WorkPackage.REFERENCE_TRANSITION__REF_TRANSITION:
        return refTransition != null;
      case WorkPackage.REFERENCE_TRANSITION__FROM_DEF:
        return fromDef != null;
      case WorkPackage.REFERENCE_TRANSITION__TRANSITION:
        return transition != null;
      case WorkPackage.REFERENCE_TRANSITION__COMPOSITION:
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

} //ReferenceTransitionImpl
