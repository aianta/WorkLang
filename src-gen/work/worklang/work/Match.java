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
package work.worklang.work;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.worklang.work.Match#getDomain <em>Domain</em>}</li>
 *   <li>{@link work.worklang.work.Match#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see work.worklang.work.WorkPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends Action
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' reference.
   * @see #setDomain(Element)
   * @see work.worklang.work.WorkPackage#getMatch_Domain()
   * @model
   * @generated
   */
  Element getDomain();

  /**
   * Sets the value of the '{@link work.worklang.work.Match#getDomain <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(Element value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' reference.
   * @see #setRange(Element)
   * @see work.worklang.work.WorkPackage#getMatch_Range()
   * @model
   * @generated
   */
  Element getRange();

  /**
   * Sets the value of the '{@link work.worklang.work.Match#getRange <em>Range</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Element value);

} // Match
