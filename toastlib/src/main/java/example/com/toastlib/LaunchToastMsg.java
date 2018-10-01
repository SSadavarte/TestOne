package example.com.toastlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by SSadavarte on 10/1/2018.
 */

public class LaunchToastMsg
{
    public void toastMsg(Context c,String s)
    {
        Toast.makeText(c,s,Toast.LENGTH_SHORT).show();
    }
}
