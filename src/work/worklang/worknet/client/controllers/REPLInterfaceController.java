package work.worklang.worknet.client.controllers;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Console;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public class REPLInterfaceController implements ScreenController{

	@Override
	public void bind(Nifty nifty, Screen screen) {
		
		Console console = 
				screen
				.findElementById("layer")
				.findNiftyControl("console", Console.class);
		
		console.output("Hello :)");
		
	}

	@Override
	public void onStartScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEndScreen() {
		// TODO Auto-generated method stub
		
	}

}
