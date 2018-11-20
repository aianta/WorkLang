package org.worklang.execution.structures;

import org.worklang.work.Instance;

public class InstanceTransitionInfo {
	
	private String routePath;
	private int port;
	private String host;
	private String path;
	private String name;
	
	
	public InstanceTransitionInfo(String fieldName, Instance transition) {
		this.routePath = "/" + fieldName.toLowerCase() + "/" +
				transition.getTransitionDeclaration().getTransition().getName().toLowerCase() + "/" +
				transition.getName().replaceAll("\\s", "").toLowerCase();
		
		this.port = transition.getTransition().getPort();
		this.host = transition.getTransition().getHost();
		this.path = transition.getTransition().getPath();
		this.name = transition.getName();
		
	}
	
	public String routePath() {
		return routePath;
	}
	
	public String transitionPath() {
		return path;
	}
	
	public int transitionPort() {
		return port;
	}
	
	public String transitionHost() {
		return host;
	}
	
	public String name() {
		return name;
	}
	

}
