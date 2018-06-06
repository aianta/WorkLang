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

import org.worklang.work.DomainDefinition;
import org.worklang.work.ExpertDefinition;
import org.worklang.work.KnowledgeDefinition;
import org.worklang.work.SkillsDefinition;
import org.worklang.work.User;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expert Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getExpertDef <em>Expert Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getDomainDef <em>Domain Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getKnowledgeDef <em>Knowledge Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getSkillsDef <em>Skills Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.ExpertDefinitionImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpertDefinitionImpl extends MinimalEObjectImpl.Container implements ExpertDefinition
{
  /**
   * The default value of the '{@link #getExpertDef() <em>Expert Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpertDef()
   * @generated
   * @ordered
   */
  protected static final String EXPERT_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpertDef() <em>Expert Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpertDef()
   * @generated
   * @ordered
   */
  protected String expertDef = EXPERT_DEF_EDEFAULT;

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
   * The cached value of the '{@link #getDomainDef() <em>Domain Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainDef()
   * @generated
   * @ordered
   */
  protected DomainDefinition domainDef;

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
   * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected static final int RATE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected int rate = RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpertDefinitionImpl()
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
    return WorkPackage.Literals.EXPERT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpertDef()
  {
    return expertDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpertDef(String newExpertDef)
  {
    String oldExpertDef = expertDef;
    expertDef = newExpertDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__EXPERT_DEF, oldExpertDef, expertDef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__USER, oldUser, newUser);
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
        msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__USER, null, msgs);
      if (newUser != null)
        msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__USER, null, msgs);
      msgs = basicSetUser(newUser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__USER, newUser, newUser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDefinition getDomainDef()
  {
    return domainDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomainDef(DomainDefinition newDomainDef, NotificationChain msgs)
  {
    DomainDefinition oldDomainDef = domainDef;
    domainDef = newDomainDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF, oldDomainDef, newDomainDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainDef(DomainDefinition newDomainDef)
  {
    if (newDomainDef != domainDef)
    {
      NotificationChain msgs = null;
      if (domainDef != null)
        msgs = ((InternalEObject)domainDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF, null, msgs);
      if (newDomainDef != null)
        msgs = ((InternalEObject)newDomainDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF, null, msgs);
      msgs = basicSetDomainDef(newDomainDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF, newDomainDef, newDomainDef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF, oldKnowledgeDef, newKnowledgeDef);
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
        msgs = ((InternalEObject)knowledgeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF, null, msgs);
      if (newKnowledgeDef != null)
        msgs = ((InternalEObject)newKnowledgeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF, null, msgs);
      msgs = basicSetKnowledgeDef(newKnowledgeDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF, newKnowledgeDef, newKnowledgeDef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__SKILLS_DEF, oldSkillsDef, newSkillsDef);
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
        msgs = ((InternalEObject)skillsDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__SKILLS_DEF, null, msgs);
      if (newSkillsDef != null)
        msgs = ((InternalEObject)newSkillsDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.EXPERT_DEFINITION__SKILLS_DEF, null, msgs);
      msgs = basicSetSkillsDef(newSkillsDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__SKILLS_DEF, newSkillsDef, newSkillsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRate()
  {
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRate(int newRate)
  {
    int oldRate = rate;
    rate = newRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.EXPERT_DEFINITION__RATE, oldRate, rate));
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
      case WorkPackage.EXPERT_DEFINITION__USER:
        return basicSetUser(null, msgs);
      case WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF:
        return basicSetDomainDef(null, msgs);
      case WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF:
        return basicSetKnowledgeDef(null, msgs);
      case WorkPackage.EXPERT_DEFINITION__SKILLS_DEF:
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
      case WorkPackage.EXPERT_DEFINITION__EXPERT_DEF:
        return getExpertDef();
      case WorkPackage.EXPERT_DEFINITION__USER:
        return getUser();
      case WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF:
        return getDomainDef();
      case WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF:
        return getKnowledgeDef();
      case WorkPackage.EXPERT_DEFINITION__SKILLS_DEF:
        return getSkillsDef();
      case WorkPackage.EXPERT_DEFINITION__RATE:
        return getRate();
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
      case WorkPackage.EXPERT_DEFINITION__EXPERT_DEF:
        setExpertDef((String)newValue);
        return;
      case WorkPackage.EXPERT_DEFINITION__USER:
        setUser((User)newValue);
        return;
      case WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF:
        setDomainDef((DomainDefinition)newValue);
        return;
      case WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF:
        setKnowledgeDef((KnowledgeDefinition)newValue);
        return;
      case WorkPackage.EXPERT_DEFINITION__SKILLS_DEF:
        setSkillsDef((SkillsDefinition)newValue);
        return;
      case WorkPackage.EXPERT_DEFINITION__RATE:
        setRate((Integer)newValue);
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
      case WorkPackage.EXPERT_DEFINITION__EXPERT_DEF:
        setExpertDef(EXPERT_DEF_EDEFAULT);
        return;
      case WorkPackage.EXPERT_DEFINITION__USER:
        setUser((User)null);
        return;
      case WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF:
        setDomainDef((DomainDefinition)null);
        return;
      case WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF:
        setKnowledgeDef((KnowledgeDefinition)null);
        return;
      case WorkPackage.EXPERT_DEFINITION__SKILLS_DEF:
        setSkillsDef((SkillsDefinition)null);
        return;
      case WorkPackage.EXPERT_DEFINITION__RATE:
        setRate(RATE_EDEFAULT);
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
      case WorkPackage.EXPERT_DEFINITION__EXPERT_DEF:
        return EXPERT_DEF_EDEFAULT == null ? expertDef != null : !EXPERT_DEF_EDEFAULT.equals(expertDef);
      case WorkPackage.EXPERT_DEFINITION__USER:
        return user != null;
      case WorkPackage.EXPERT_DEFINITION__DOMAIN_DEF:
        return domainDef != null;
      case WorkPackage.EXPERT_DEFINITION__KNOWLEDGE_DEF:
        return knowledgeDef != null;
      case WorkPackage.EXPERT_DEFINITION__SKILLS_DEF:
        return skillsDef != null;
      case WorkPackage.EXPERT_DEFINITION__RATE:
        return rate != RATE_EDEFAULT;
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
    result.append(" (expertDef: ");
    result.append(expertDef);
    result.append(", rate: ");
    result.append(rate);
    result.append(')');
    return result.toString();
  }

} //ExpertDefinitionImpl
