package fr.activity.meuge;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public class MeugeMetier {

	public static String postLoginData(String champbyId, String champbyId2) {
		// TODO Auto-generated method stub
		return ("Login successful").trim();
	}
    public static Intent passageVue(Context currentContext, Class goToActivity) {
    	Intent intent = new Intent(currentContext,
                goToActivity);
		return intent;
    }

}
