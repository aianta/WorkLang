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

import org.worklang.work.KnowledgeDefinition;
import org.worklang.work.ReferenceState;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.KnowledgeDefinitionImpl#getKnowledgeDef <em>Knowledge Def</em>}</li>
 *   <li>{@link org.worklang.work.impl.KnowledgeDefinitionImpl#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeDefinitionImpl extends MinimalEObjectImpl.Container implements KnowledgeDefinition
{
  /**
   * The default value of the '{@link #getKnowledgeDef() <em>Knowledge Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledgeDef()
   * @generated
   * @ordered
   */
  protected static final String KNOWLEDGE_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKnowledgeDef() <em>Knowledge Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledgeDef()
   * @generated
   * @ordered
   */
  protected String knowledgeDef = KNOWLEDGE_DEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected EList<ReferenceState> knowledge;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnowledgeDefinitionImpl()
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
    return WorkPackage.Literals.KNOWLEDGE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKnowledgeDef()
  {
    return knowledgeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledgeDef(String newKnowledgeDef)
  {
    String oldKnowledgeDef = knowledgeDef;
    knowledgeDef = newKnowledgeDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF, oldKnowledgeDef, knowledgeDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceState> getKnowledge()
  {
    if (knowledge == null)
    {
      knowledge = new EObjectContainmentEList<ReferenceState>(ReferenceState.class, this, WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE);
    }
    return knowledge;
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
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE:
        return ((InternalEList<?>)getKnowledge()).basicRemove(otherEnd, msgs);
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
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF:
        return getKnowledgeDef();
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE:
        return getKnowledge();
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
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF:
        setKnowledgeDef((String)newValue);
        return;
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE:
        getKnowledge().clear();
        getKnowledge().addAll((Collection<? extends ReferenceState>)newValue);
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
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF:
        setKnowledgeDef(KNOWLEDGE_DEF_EDEFAULT);
        return;
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE:
        getKnowledge().clear();
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
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE_DEF:
        return KNOWLEDGE_DEF_EDEFAULT == null ? knowledgeDef != null : !KNOWLEDGE_DEF_EDEFAULT.equals(knowledgeDef);
      case WorkPackage.KNOWLEDGE_DEFINITION__KNOWLEDGE:
        return knowledge != null && !knowledge.isEmpty();
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
    result.append(" (knowledgeDef: ");
    result.append(knowledgeDef);
    result.append(')');
    return result.toString();
  }

} //KnowledgeDefinitionImpl
