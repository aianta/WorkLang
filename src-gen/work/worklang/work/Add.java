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
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.worklang.work.Add#getFilepath <em>Filepath</em>}</li>
 * </ul>
 *
 * @see work.worklang.work.WorkPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends MetaAction
{
  /**
   * Returns the value of the '<em><b>Filepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filepath</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filepath</em>' attribute.
   * @see #setFilepath(String)
   * @see work.worklang.work.WorkPackage#getAdd_Filepath()
   * @model
   * @generated
   */
  String getFilepath();

  /**
   * Sets the value of the '{@link work.worklang.work.Add#getFilepath <em>Filepath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filepath</em>' attribute.
   * @see #getFilepath()
   * @generated
   */
  void setFilepath(String value);

} // Add
