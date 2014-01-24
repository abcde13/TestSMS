package com.testsms;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ReceiveSMSActivity extends Activity {

	static TextView messageBox;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_sms);
        messageBox=(TextView)findViewById(R.id.messageBox);
    }
    
    public static void updateMessageBox(String msg)
    {
    	messageBox.append(msg);
    }

}
