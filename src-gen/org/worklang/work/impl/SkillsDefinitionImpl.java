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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.worklang.work.ReferenceTransition;
import org.worklang.work.SkillsDefinition;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skills Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.SkillsDefinitionImpl#getSkillsDef <em>Skills Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.SkillsDefinitionImpl#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillsDefinitionImpl extends MinimalEObjectImpl.Container implements SkillsDefinition
{
  /**
   * The default value of the '{@link #getSkillsDef() <em>Skills Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkillsDef()
   * @generated
   * @ordered
   */
  protected static final String SKILLS_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkillsDef() <em>Skills Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkillsDef()
   * @generated
   * @ordered
   */
  protected String skillsDef = SKILLS_DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkills()
   * @generated
   * @ordered
   */
  protected EList<ReferenceTransition> skills;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SkillsDefinitionImpl()
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
    return WorkPackage.Literals.SKILLS_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSkillsDef()
  {
    return skillsDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkillsDef(String newSkillsDef)
  {
    String oldSkillsDef = skillsDef;
    skillsDef = newSkillsDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.SKILLS_DEFINITION__SKILLS_DEF, oldSkillsDef, skillsDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceTransition> getSkills()
  {
    if (skills == null)
    {
      skills = new EObjectContainmentEList<ReferenceTransition>(ReferenceTransition.class, this, WorkPackage.SKILLS_DEFINITION__SKILLS);
    }
    return skills;
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
      case WorkPackage.SKILLS_DEFINITION__SKILLS:
        return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.SKILLS_DEFINITION__SKILLS_DEF:
        return getSkillsDef();
      case WorkPackage.SKILLS_DEFINITION__SKILLS:
        return getSkills();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WorkPackage.SKILLS_DEFINITION__SKILLS_DEF:
        setSkillsDef((String)newValue);
        return;
      case WorkPackage.SKILLS_DEFINITION__SKILLS:
        getSkills().clear();
        getSkills().addAll((Collection<? extends ReferenceTransition>)newValue);
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
      case WorkPackage.SKILLS_DEFINITION__SKILLS_DEF:
        setSkillsDef(SKILLS_DEF_EDEFAULT);
        return;
      case WorkPackage.SKILLS_DEFINITION__SKILLS:
        getSkills().clear();
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
      case WorkPackage.SKILLS_DEFINITION__SKILLS_DEF:
        return SKILLS_DEF_EDEFAULT == null ? skillsDef != null : !SKILLS_DEF_EDEFAULT.equals(skillsDef);
      case WorkPackage.SKILLS_DEFINITION__SKILLS:
        return skills != null && !skills.isEmpty();
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
    result.append(" (skillsDef: ");
    result.append(skillsDef);
    result.append(')');
    return result.toString();
  }

} //SkillsDefinitionImpl
