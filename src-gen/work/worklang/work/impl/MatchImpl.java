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
package work.worklang.work.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.worklang.work.Element;
import work.worklang.work.Match;
import work.worklang.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.worklang.work.impl.MatchImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link work.worklang.work.impl.MatchImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends ActionImpl implements Match
{
  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected Element domain;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Element range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchImpl()
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
    return WorkPackage.Literals.MATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getDomain()
  {
    if (domain != null && domain.eIsProxy())
    {
      InternalEObject oldDomain = (InternalEObject)domain;
      domain = (Element)eResolveProxy(oldDomain);
      if (domain != oldDomain)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.MATCH__DOMAIN, oldDomain, domain));
      }
    }
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element basicGetDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(Element newDomain)
  {
    Element oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.MATCH__DOMAIN, oldDomain, domain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getRange()
  {
    if (range != null && range.eIsProxy())
    {
      InternalEObject oldRange = (InternalEObject)range;
      range = (Element)eResolveProxy(oldRange);
      if (range != oldRange)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkPackage.MATCH__RANGE, oldRange, range));
      }
    }
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element basicGetRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(Element newRange)
  {
    Element oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkPackage.MATCH__RANGE, oldRange, range));
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
      case WorkPackage.MATCH__DOMAIN:
        if (resolve) return getDomain();
        return basicGetDomain();
      case WorkPackage.MATCH__RANGE:
        if (resolve) return getRange();
        return basicGetRange();
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
      case WorkPackage.MATCH__DOMAIN:
        setDomain((Element)newValue);
        return;
      case WorkPackage.MATCH__RANGE:
        setRange((Element)newValue);
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
      case WorkPackage.MATCH__DOMAIN:
        setDomain((Element)null);
        return;
      case WorkPackage.MATCH__RANGE:
        setRange((Element)null);
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
      case WorkPackage.MATCH__DOMAIN:
        return domain != null;
      case WorkPackage.MATCH__RANGE:
        return range != null;
    }
    return super.eIsSet(featureID);
  }

} //MatchImpl
