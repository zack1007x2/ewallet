package com.example.nfcwallet;


import com.example.nfcwallet.NFCVars;
import com.example.nfcwallet.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;


public class CreditSelectorActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		super.onResume();
		
//		SharedPreferences prefs = getSharedPreferences(NFCVars.PREFERENCES, Context.MODE_PRIVATE);
//		if (prefs.contains("relayPref")) {
//	        if (prefs.getBoolean("relayPref", false)) {
//	        	Intent intent = new Intent(getIntent());
//	        	intent.setClass(this, NFCRelayActivity.class);
//	        	startActivity(intent);
//	        	finish();
//	        }
//	        else {
//	        	
//				if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
//					prefs.edit().putBoolean("relayPref", true).commit();
//					Toast.makeText(this, "Proxy mode not supported.\nSwitching to Relay mode", Toast.LENGTH_LONG).show();        		
//	        	}
//
//	        	Intent intent = new Intent(getIntent());
//	        	intent.setClass(this, NFCProxyActivity.class);
//	        	startActivity(intent);
//	        	finish();    			        	
//	        }
//		}		
        setContentView(R.layout.selector);
        
        SharedPreferences prefs = getSharedPreferences(NFCVars.PREFERENCES, Context.MODE_PRIVATE);
		prefs.edit().putBoolean("relayPref", false).commit();
		
        Intent intent = new Intent(getIntent());
        
        //TODO  被改了
    	intent.setClass(this, MyAccount.class);
    	startActivity(intent);
    	finish();
        
        
//        Button proxyButton = (Button) findViewById(R.id.proxyModeButton);
//        Button relayButton = (Button) findViewById(R.id.relayModeButton);
        
//        proxyButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				SharedPreferences prefs = getSharedPreferences(NFCVars.PREFERENCES, Context.MODE_PRIVATE);
//				prefs.edit().putBoolean("relayPref", false).commit();
//	        	Intent intent = new Intent(getIntent());
//	        	intent.setClass(SelectorActivity.this, NFCProxyActivity.class);
//	        	startActivity(intent);
//			}
//        });
//        
//        relayButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				SharedPreferences prefs = getSharedPreferences(NFCVars.PREFERENCES, Context.MODE_PRIVATE);
//				prefs.edit().putBoolean("relayPref", true).commit();
//	        	Intent intent = new Intent(getIntent());
//	        	intent.setClass(SelectorActivity.this, NFCRelayActivity.class);
//	        	startActivity(intent);
//			}
//        });        
	
	}	

}
