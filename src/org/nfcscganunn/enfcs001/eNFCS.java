

package org.nfcscganunn.enfcs001;

import android.os.Bundle;
import org.apache.cordova.*;// use a plugin for fast development in one week

public class eNFCS extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.setIntegerProperty("loadUrlTimeoutValue", 70000);
        loadUrl(launchUrl);
    }
}
