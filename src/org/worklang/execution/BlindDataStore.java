package org.worklang.execution;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import io.vertx.core.buffer.Buffer;

public class BlindDataStore {
	
	public static final UUID uiRequest = UUID.randomUUID();
	public static final UUID connectorIn = UUID.randomUUID();
	public static final UUID connectorOut = UUID.randomUUID();
	public static final UUID mapInput = UUID.randomUUID();
	
	private static Map<UUID, Buffer> dataStore = new HashMap<>();
	
	public static void addData(UUID id, Buffer data) {
		dataStore.put(id, data);
	}
	
	public static Buffer getData(UUID id) {
		return dataStore.get(id);
	}

	public static UUID getUirequest() {
		return uiRequest;
	}

	public static UUID getConnectorin() {
		return connectorIn;
	}

	public static UUID getConnectorout() {
		return connectorOut;
	}

	public static UUID getMapinput() {
		return mapInput;
	}
	
	

}
