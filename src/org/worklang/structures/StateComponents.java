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

package org.worklang.structures;

import java.util.ArrayList;
import java.util.List;

import org.worklang.work.CompoundStateDefinition;
import org.worklang.work.PrimitiveStateDefinition;
import org.worklang.work.StateDefinition;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class StateComponents {
	
	List<StateDefinition> andPrimitives = new ArrayList<>();
	List<StateDefinition> andCompounds = new ArrayList<>();
	
	List<StateDefinition> orPrimitives = new ArrayList<>();
	List<StateDefinition> orCompounds = new ArrayList<>();
	
	List<StateComponents> subComponents = new ArrayList<>();
	
	public List<StateDefinition> getAndPrimitives() {
		return andPrimitives;
	}
	public void setAndPrimitives(List<StateDefinition> andPrimitives) {
		this.andPrimitives = andPrimitives;
	}
	public List<StateDefinition> getAndCompounds() {
		return andCompounds;
	}
	public void setAndCompounds(List<StateDefinition> andCompounds) {
		this.andCompounds = andCompounds;
	}
	public List<StateDefinition> getOrPrimitives() {
		return orPrimitives;
	}
	public void setOrPrimitives(List<StateDefinition> orPrimitives) {
		this.orPrimitives = orPrimitives;
	}
	public List<StateDefinition> getOrCompounds() {
		return orCompounds;
	}
	public void setOrCompounds(List<StateDefinition> orCompounds) {
		this.orCompounds = orCompounds;
	}
	public List<StateComponents> getSubComponents() {
		return subComponents;
	}
	public void setSubComponents(List<StateComponents> subComponents) {
		this.subComponents = subComponents;
	}
	
	public String toString() {
		return toJson().encode();
	}
	
	public JsonObject toJson() {
		JsonObject result =  new JsonObject()
				.put("andPrimitives", new JsonArray())
				.put("andCompounds", new JsonArray())
				.put("orPrimitves", new JsonArray())
				.put("orCompounds", new JsonArray())
				.put("subComponents", new JsonArray());
		
		andPrimitives.forEach(ele->{
			result.getJsonArray("andPrimitives").add(ele.getInstance().getName());
		});
		
		andCompounds.forEach(ele->{
			result.getJsonArray("andCompounds").add(ele.getInstance().getName());
		});
		
		orPrimitives.forEach(ele->{
			result.getJsonArray("orPrimitives").add(ele.getInstance().getName());
		});
		
		orCompounds.forEach(ele->{
			result.getJsonArray("orCompounds").add(ele.getInstance().getName());
		});
		
		subComponents.forEach(ele->{
			result.getJsonArray("subComponents").add(ele.toJson());
		});
		
		return result;
	}
}
