package matrix;

import utils.Utils;

public class DimMismatch extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DimMismatch(String message) {
		super(message);

	}
	
	public void prnt_msg() {
		
		Utils.prntln(getMessage());
		
	}

}
