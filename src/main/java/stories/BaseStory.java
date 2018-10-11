package stories;

import steps.KharkovVodokanalPageSteps;

/**
 * Created by irina on 09/10/2018.
 */
public class BaseStory {

	protected KharkovVodokanalPageSteps kharkovVodokanalPageSteps;

	public BaseStory(){
		kharkovVodokanalPageSteps = new KharkovVodokanalPageSteps();
	}

}
