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

import org.worklang.work.KnowledgeDefinition;
import org.worklang.work.Practitioner;
import org.worklang.work.SkillsDefinition;
import org.worklang.work.User;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practitioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.PractitionerImpl#getPractitionerDef <em>Practitioner Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.PractitionerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.worklang.work.impl.PractitionerImpl#getKnowledgeDef <em>Knowledge Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.PractitionerImpl#getSkillsDef <em>Skills Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PractitionerImpl extends MinimalEObjectImpl.Container implements Practitioner
{
  /**
   * The default value of the '{@link #getPractitionerDef() <em>Practitioner Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPractitionerDef()
   * @generated
   * @ordered
   */
  protected static final String PRACTITIONER_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPractitionerDef() <em>Practitioner Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPractitionerDef()
   * @generated
   * @ordered
   */
  protected String practitionerDef = PRACTITIONER_DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected User user;

  /**
   * The cached value of the '{@link #getKnowledgeDef() <em>Knowledge Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledgeDef()
   * @generated
   * @ordered
   */
  protected KnowledgeDefinition knowledgeDef;

  /**
   * The cached value of the '{@link #getSkillsDef() <em>Skills Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkillsDef()
   * @generated
   * @ordered
   */
  protected SkillsDefinition skillsDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PractitionerImpl()
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
    return WorkPackage.Literals.PRACTITIONER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPractitionerDef()
  {
    return practitionerDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPractitionerDef(String newPractitionerDef)
  {
    String oldPractitionerDef = practitionerDef;
    practitionerDef = newPractitionerDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__PRACTITIONER_DEF, oldPractitionerDef, practitionerDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUser(User newUser, NotificationChain msgs)
  {
    User oldUser = user;
    user = newUser;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__USER, oldUser, newUser);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(User newUser)
  {
    if (newUser != user)
    {
      NotificationChain msgs = null;
      if (user != null)
        msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__USER, null, msgs);
      if (newUser != null)
        msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__USER, null, msgs);
      msgs = basicSetUser(newUser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__USER, newUser, newUser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnowledgeDefinition getKnowledgeDef()
  {
    return knowledgeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKnowledgeDef(KnowledgeDefinition newKnowledgeDef, NotificationChain msgs)
  {
    KnowledgeDefinition oldKnowledgeDef = knowledgeDef;
    knowledgeDef = newKnowledgeDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__KNOWLEDGE_DEF, oldKnowledgeDef, newKnowledgeDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledgeDef(KnowledgeDefinition newKnowledgeDef)
  {
    if (newKnowledgeDef != knowledgeDef)
    {
      NotificationChain msgs = null;
      if (knowledgeDef != null)
        msgs = ((InternalEObject)knowledgeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__KNOWLEDGE_DEF, null, msgs);
      if (newKnowledgeDef != null)
        msgs = ((InternalEObject)newKnowledgeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__KNOWLEDGE_DEF, null, msgs);
      msgs = basicSetKnowledgeDef(newKnowledgeDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__KNOWLEDGE_DEF, newKnowledgeDef, newKnowledgeDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SkillsDefinition getSkillsDef()
  {
    return skillsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSkillsDef(SkillsDefinition newSkillsDef, NotificationChain msgs)
  {
    SkillsDefinition oldSkillsDef = skillsDef;
    skillsDef = newSkillsDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__SKILLS_DEF, oldSkillsDef, newSkillsDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkillsDef(SkillsDefinition newSkillsDef)
  {
    if (newSkillsDef != skillsDef)
    {
      NotificationChain msgs = null;
      if (skillsDef != null)
        msgs = ((InternalEObject)skillsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__SKILLS_DEF, null, msgs);
      if (newSkillsDef != null)
        msgs = ((InternalEObject)newSkillsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.PRACTITIONER__SKILLS_DEF, null, msgs);
      msgs = basicSetSkillsDef(newSkillsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.PRACTITIONER__SKILLS_DEF, newSkillsDef, newSkillsDef));
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
      case WorkPackage.PRACTITIONER__USER:
        return basicSetUser(null, msgs);
      case WorkPackage.PRACTITIONER__KNOWLEDGE_DEF:
        return basicSetKnowledgeDef(null, msgs);
      case WorkPackage.PRACTITIONER__SKILLS_DEF:
        return basicSetSkillsDef(null, msgs);
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
      case WorkPackage.PRACTITIONER__PRACTITIONER_DEF:
        return getPractitionerDef();
      case WorkPackage.PRACTITIONER__USER:
        return getUser();
      case WorkPackage.PRACTITIONER__KNOWLEDGE_DEF:
        return getKnowledgeDef();
      case WorkPackage.PRACTITIONER__SKILLS_DEF:
        return getSkillsDef();
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
      case WorkPackage.PRACTITIONER__PRACTITIONER_DEF:
        setPractitionerDef((String)newValue);
        return;
      case WorkPackage.PRACTITIONER__USER:
        setUser((User)newValue);
        return;
      case WorkPackage.PRACTITIONER__KNOWLEDGE_DEF:
        setKnowledgeDef((KnowledgeDefinition)newValue);
        return;
      case WorkPackage.PRACTITIONER__SKILLS_DEF:
        setSkillsDef((SkillsDefinition)newValue);
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
      case WorkPackage.PRACTITIONER__PRACTITIONER_DEF:
        setPractitionerDef(PRACTITIONER_DEF_EDEFAULT);
        return;
      case WorkPackage.PRACTITIONER__USER:
        setUser((User)null);
        return;
      case WorkPackage.PRACTITIONER__KNOWLEDGE_DEF:
        setKnowledgeDef((KnowledgeDefinition)null);
        return;
      case WorkPackage.PRACTITIONER__SKILLS_DEF:
        setSkillsDef((SkillsDefinition)null);
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
      case WorkPackage.PRACTITIONER__PRACTITIONER_DEF:
        return PRACTITIONER_DEF_EDEFAULT == null ? practitionerDef != null : !PRACTITIONER_DEF_EDEFAULT.equals(practitionerDef);
      case WorkPackage.PRACTITIONER__USER:
        return user != null;
      case WorkPackage.PRACTITIONER__KNOWLEDGE_DEF:
        return knowledgeDef != null;
      case WorkPackage.PRACTITIONER__SKILLS_DEF:
        return skillsDef != null;
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
    result.append(" (practitionerDef: ");
    result.append(practitionerDef);
    result.append(')');
    return result.toString();
  }

} //PractitionerImpl
