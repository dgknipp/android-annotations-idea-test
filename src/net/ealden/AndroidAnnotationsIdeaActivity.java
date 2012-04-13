package net.ealden;

import android.app.Activity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.main)
public class AndroidAnnotationsIdeaActivity extends Activity {
    @ViewById
    EditText myInput;

    @ViewById(R.id.myTextView)
    TextView textView;

    @Click
    void myButton() {
        String name = myInput.getText().toString();
        textView.setText("Hello " + name);
    }

    @Click
    void subActivityButton() {
        Log.d("AndroidAnnotationsIdeaActivity", "Starting AndroidAnnotationsIdeaSubActivity");
        AndroidAnnotationsIdeaSubActivity_.intent(this).start();
    }
}
