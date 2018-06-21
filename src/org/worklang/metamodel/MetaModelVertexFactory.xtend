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