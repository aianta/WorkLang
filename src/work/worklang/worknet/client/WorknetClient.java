package work.worklang.worknet.client;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.ScreenController;

import work.worklang.worknet.client.controllers.REPLInterfaceController;

public class WorknetClient extends SimpleApplication{
	
	private static final Logger log = LoggerFactory.getLogger(WorknetClient.class);
	private Nifty nifty;

	@Override
	public void simpleInitApp() {
		Box b = new Box(1,1,1);
		Geometry geom = new Geometry("Box", b);
		Material mat = new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Color", ColorRGBA.Blue);
		geom.setMaterial(mat);
		rootNode.attachChild(geom);
		
		NiftyJmeDisplay niftyDisplay = NiftyJmeDisplay.newNiftyJmeDisplay(
				assetManager,
				inputManager,
				audioRenderer,
				guiViewPort);
		
		nifty = niftyDisplay.getNifty();
		
		try {
			nifty.validateXml("Interface/REPLInterface.xml");
		} catch (Exception e) {
			log.error("Invalid nifty .xml");
			e.printStackTrace();
		}
		nifty.fromXml("Interface/REPLInterface.xml", "start", (ScreenController)new REPLInterfaceController());
		guiViewPort.addProcessor(niftyDisplay);
		flyCam.setEnabled(false);
		flyCam.setDragToRotate(true);
		inputManager.setCursorVisible(true);
	}

}
