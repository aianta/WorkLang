/* 
 * 	Copyright 2018 Alexandru Ianta
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 * 
 */

package org.worklang

import org.eclipse.xtext.resource.XtextResource
import com.google.inject.Provider
import org.eclipse.xtext.linking.lazy.LazyLinkingResource

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class WorkRuntimeModule extends AbstractWorkRuntimeModule {
	
	/* Bind XtextResource to WorkResource for graph database meta-model
	 * creation purposes.
	 */
	override Class<? extends XtextResource> bindXtextResource(){
		
		return WorklangResource
	}	
}
