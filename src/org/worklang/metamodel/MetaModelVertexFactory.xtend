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
package org.worklang.metamodel

import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph
import org.apache.tinkerpop.gremlin.structure.VertexProperty
import org.eclipse.emf.ecore.EObject
import java.util.Date
import java.time.Instant

abstract class MetaModelVertexFactory {
	
	val worklangKey = "worklangKey"
	
	var Neo4JGraph graph
	val date = Date.from(Instant.now)
	
	new (Neo4JGraph g){
		this.graph = g
	}
	
	def getVertex(EObject o, String label){
		var vertex = graph.addVertex(label)
		vertex.property(VertexProperty.Cardinality.single, worklangKey, o.eClass.instanceTypeName)
		vertex.property(VertexProperty.Cardinality.single, "created", date.toString)
		return vertex
	}
	
	def protected getGraph(){
		graph
	}
}