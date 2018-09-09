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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.worklang.work.WorkFactory
 * @model kind="package"
 * @generated
 */
public interface WorkPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "work";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://worklang.work/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "work";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkPackage eINSTANCE = work.worklang.work.impl.WorkPackageImpl.init();

  /**
   * The meta object id for the '{@link work.worklang.work.impl.WorkStatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.WorkStatementImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getWorkStatement()
   * @generated
   */
  int WORK_STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.ActionImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = WORK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.MatchImpl <em>Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.MatchImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getMatch()
   * @generated
   */
  int MATCH = 2;

  /**
   * The feature id for the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH__DOMAIN = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH__RANGE = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.ElementImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.PointImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getPoint()
   * @generated
   */
  int POINT = 4;

  /**
   * The feature id for the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__FILEPATH = 0;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.MetaActionImpl <em>Meta Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.MetaActionImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getMetaAction()
   * @generated
   */
  int META_ACTION = 5;

  /**
   * The number of structural features of the '<em>Meta Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_ACTION_FEATURE_COUNT = WORK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link work.worklang.work.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see work.worklang.work.impl.AddImpl
   * @see work.worklang.work.impl.WorkPackageImpl#getAdd()
   * @generated
   */
  int ADD = 6;

  /**
   * The feature id for the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__FILEPATH = META_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = META_ACTION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link work.worklang.work.WorkStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see work.worklang.work.WorkStatement
   * @generated
   */
  EClass getWorkStatement();

  /**
   * Returns the meta object for class '{@link work.worklang.work.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see work.worklang.work.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link work.worklang.work.Match <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match</em>'.
   * @see work.worklang.work.Match
   * @generated
   */
  EClass getMatch();

  /**
   * Returns the meta object for the reference '{@link work.worklang.work.Match#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Domain</em>'.
   * @see work.worklang.work.Match#getDomain()
   * @see #getMatch()
   * @generated
   */
  EReference getMatch_Domain();

  /**
   * Returns the meta object for the reference '{@link work.worklang.work.Match#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Range</em>'.
   * @see work.worklang.work.Match#getRange()
   * @see #getMatch()
   * @generated
   */
  EReference getMatch_Range();

  /**
   * Returns the meta object for class '{@link work.worklang.work.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see work.worklang.work.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link work.worklang.work.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see work.worklang.work.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link work.worklang.work.Element#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see work.worklang.work.Element#getSource()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Source();

  /**
   * Returns the meta object for class '{@link work.worklang.work.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see work.worklang.work.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link work.worklang.work.Point#getFilepath <em>Filepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filepath</em>'.
   * @see work.worklang.work.Point#getFilepath()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Filepath();

  /**
   * Returns the meta object for class '{@link work.worklang.work.MetaAction <em>Meta Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Action</em>'.
   * @see work.worklang.work.MetaAction
   * @generated
   */
  EClass getMetaAction();

  /**
   * Returns the meta object for class '{@link work.worklang.work.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see work.worklang.work.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for the attribute '{@link work.worklang.work.Add#getFilepath <em>Filepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filepath</em>'.
   * @see work.worklang.work.Add#getFilepath()
   * @see #getAdd()
   * @generated
   */
  EAttribute getAdd_Filepath();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WorkFactory getWorkFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link work.worklang.work.impl.WorkStatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.WorkStatementImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getWorkStatement()
     * @generated
     */
    EClass WORK_STATEMENT = eINSTANCE.getWorkStatement();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.ActionImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.MatchImpl <em>Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.MatchImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getMatch()
     * @generated
     */
    EClass MATCH = eINSTANCE.getMatch();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH__DOMAIN = eINSTANCE.getMatch_Domain();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH__RANGE = eINSTANCE.getMatch_Range();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.ElementImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__SOURCE = eINSTANCE.getElement_Source();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.PointImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__FILEPATH = eINSTANCE.getPoint_Filepath();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.MetaActionImpl <em>Meta Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.MetaActionImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getMetaAction()
     * @generated
     */
    EClass META_ACTION = eINSTANCE.getMetaAction();

    /**
     * The meta object literal for the '{@link work.worklang.work.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see work.worklang.work.impl.AddImpl
     * @see work.worklang.work.impl.WorkPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD__FILEPATH = eINSTANCE.getAdd_Filepath();

  }

} //WorkPackage
