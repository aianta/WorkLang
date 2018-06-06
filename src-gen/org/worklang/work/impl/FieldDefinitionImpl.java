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

import org.worklang.work.ExtendsDefinition;
import org.worklang.work.FieldDefinition;
import org.worklang.work.Instancespace;
import org.worklang.work.Namespace;
import org.worklang.work.Referencespace;
import org.worklang.work.Space;
import org.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getConceptualspace <em>Conceptualspace</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getReferencespace <em>Referencespace</em>}</li>
 *   <li>{@link org.worklang.work.impl.FieldDefinitionImpl#getInstancespace <em>Instancespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDefinitionImpl extends MinimalEObjectImpl.Container implements FieldDefinition
{
  /**
   * The default value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected static final String FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected String field = FIELD_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpace() <em>Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpace()
   * @generated
   * @ordered
   */
  protected Space space;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected ExtendsDefinition extends_;

  /**
   * The cached value of the '{@link #getConceptualspace() <em>Conceptualspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConceptualspace()
   * @generated
   * @ordered
   */
  protected Namespace conceptualspace;

  /**
   * The cached value of the '{@link #getReferencespace() <em>Referencespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencespace()
   * @generated
   * @ordered
   */
  protected Referencespace referencespace;

  /**
   * The cached value of the '{@link #getInstancespace() <em>Instancespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstancespace()
   * @generated
   * @ordered
   */
  protected Instancespace instancespace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldDefinitionImpl()
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
    return WorkPackage.Literals.FIELD_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(String newField)
  {
    String oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Space getSpace()
  {
    return space;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs)
  {
    Space oldSpace = space;
    space = newSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__SPACE, oldSpace, newSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpace(Space newSpace)
  {
    if (newSpace != space)
    {
      NotificationChain msgs = null;
      if (space != null)
        msgs = ((InternalEObject)space).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__SPACE, null, msgs);
      if (newSpace != null)
        msgs = ((InternalEObject)newSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__SPACE, null, msgs);
      msgs = basicSetSpace(newSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__SPACE, newSpace, newSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsDefinition getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(ExtendsDefinition newExtends, NotificationChain msgs)
  {
    ExtendsDefinition oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(ExtendsDefinition newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getConceptualspace()
  {
    return conceptualspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConceptualspace(Namespace newConceptualspace, NotificationChain msgs)
  {
    Namespace oldConceptualspace = conceptualspace;
    conceptualspace = newConceptualspace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE, oldConceptualspace, newConceptualspace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConceptualspace(Namespace newConceptualspace)
  {
    if (newConceptualspace != conceptualspace)
    {
      NotificationChain msgs = null;
      if (conceptualspace != null)
        msgs = ((InternalEObject)conceptualspace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE, null, msgs);
      if (newConceptualspace != null)
        msgs = ((InternalEObject)newConceptualspace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE, null, msgs);
      msgs = basicSetConceptualspace(newConceptualspace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE, newConceptualspace, newConceptualspace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Referencespace getReferencespace()
  {
    return referencespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferencespace(Referencespace newReferencespace, NotificationChain msgs)
  {
    Referencespace oldReferencespace = referencespace;
    referencespace = newReferencespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__REFERENCESPACE, oldReferencespace, newReferencespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencespace(Referencespace newReferencespace)
  {
    if (newReferencespace != referencespace)
    {
      NotificationChain msgs = null;
      if (referencespace != null)
        msgs = ((InternalEObject)referencespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__REFERENCESPACE, null, msgs);
      if (newReferencespace != null)
        msgs = ((InternalEObject)newReferencespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__REFERENCESPACE, null, msgs);
      msgs = basicSetReferencespace(newReferencespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__REFERENCESPACE, newReferencespace, newReferencespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instancespace getInstancespace()
  {
    return instancespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstancespace(Instancespace newInstancespace, NotificationChain msgs)
  {
    Instancespace oldInstancespace = instancespace;
    instancespace = newInstancespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__INSTANCESPACE, oldInstancespace, newInstancespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstancespace(Instancespace newInstancespace)
  {
    if (newInstancespace != instancespace)
    {
      NotificationChain msgs = null;
      if (instancespace != null)
        msgs = ((InternalEObject)instancespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__INSTANCESPACE, null, msgs);
      if (newInstancespace != null)
        msgs = ((InternalEObject)newInstancespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkPackage.FIELD_DEFINITION__INSTANCESPACE, null, msgs);
      msgs = basicSetInstancespace(newInstancespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.FIELD_DEFINITION__INSTANCESPACE, newInstancespace, newInstancespace));
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
      case WorkPackage.FIELD_DEFINITION__SPACE:
        return basicSetSpace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__EXTENDS:
        return basicSetExtends(null, msgs);
      case WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE:
        return basicSetConceptualspace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__REFERENCESPACE:
        return basicSetReferencespace(null, msgs);
      case WorkPackage.FIELD_DEFINITION__INSTANCESPACE:
        return basicSetInstancespace(null, msgs);
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
      case WorkPackage.FIELD_DEFINITION__FIELD:
        return getField();
      case WorkPackage.FIELD_DEFINITION__SPACE:
        return getSpace();
      case WorkPackage.FIELD_DEFINITION__EXTENDS:
        return getExtends();
      case WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE:
        return getConceptualspace();
      case WorkPackage.FIELD_DEFINITION__REFERENCESPACE:
        return getReferencespace();
      case WorkPackage.FIELD_DEFINITION__INSTANCESPACE:
        return getInstancespace();
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
      case WorkPackage.FIELD_DEFINITION__FIELD:
        setField((String)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__SPACE:
        setSpace((Space)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__EXTENDS:
        setExtends((ExtendsDefinition)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE:
        setConceptualspace((Namespace)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__REFERENCESPACE:
        setReferencespace((Referencespace)newValue);
        return;
      case WorkPackage.FIELD_DEFINITION__INSTANCESPACE:
        setInstancespace((Instancespace)newValue);
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
      case WorkPackage.FIELD_DEFINITION__FIELD:
        setField(FIELD_EDEFAULT);
        return;
      case WorkPackage.FIELD_DEFINITION__SPACE:
        setSpace((Space)null);
        return;
      case WorkPackage.FIELD_DEFINITION__EXTENDS:
        setExtends((ExtendsDefinition)null);
        return;
      case WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE:
        setConceptualspace((Namespace)null);
        return;
      case WorkPackage.FIELD_DEFINITION__REFERENCESPACE:
        setReferencespace((Referencespace)null);
        return;
      case WorkPackage.FIELD_DEFINITION__INSTANCESPACE:
        setInstancespace((Instancespace)null);
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
      case WorkPackage.FIELD_DEFINITION__FIELD:
        return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
      case WorkPackage.FIELD_DEFINITION__SPACE:
        return space != null;
      case WorkPackage.FIELD_DEFINITION__EXTENDS:
        return extends_ != null;
      case WorkPackage.FIELD_DEFINITION__CONCEPTUALSPACE:
        return conceptualspace != null;
      case WorkPackage.FIELD_DEFINITION__REFERENCESPACE:
        return referencespace != null;
      case WorkPackage.FIELD_DEFINITION__INSTANCESPACE:
        return instancespace != null;
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
    result.append(" (field: ");
    result.append(field);
    result.append(')');
    return result.toString();
  }

} //FieldDefinitionImpl
