package com.example.jyothikrishnamurthy.fragments;

        import android.app.Fragment;
        import android.content.Context;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

/**
 * Created by Jyothi Krishnamurthy on 11/17/2015.
 */
public class FragmentOne extends Fragment {


    private View rootView;
    private Button displaybutton;
    private Context context;
    private EditText userText;
    private FragmentsCommunication orderDetail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.fragment_one, container, false);
        context = rootView.getContext();

        //here OrderDetail is the name of ActionBarActivity
        orderDetail = (FragmentsCommunication) context;
        userText = (EditText) rootView.findViewById(R.id.userInput);
        displaybutton = (Button) rootView.findViewById(R.id.display);
        //here pass some text to second Fragment using button ClickListener
        displaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                orderDetail.onUpdateTitle(userText.getText().toString());
            }
        });
        return rootView;
    }

    public interface TitleChangeListener {

        public void onUpdateTitle(String text);

    }


}



