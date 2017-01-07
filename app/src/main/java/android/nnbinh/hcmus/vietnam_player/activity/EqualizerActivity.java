package android.nnbinh.hcmus.vietnam_player.activity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.nnbinh.hcmus.vietnam_player.MainActivity;
import android.nnbinh.hcmus.vietnam_player.R;
import android.nnbinh.hcmus.vietnam_player.fragment.BaseFragment;
import android.nnbinh.hcmus.vietnam_player.fragment.MainFragment;
import android.nnbinh.hcmus.vietnam_player.fragment.PlayerMediaFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by nguyenngocbinh on 1/7/17.
 */

public class EqualizerActivity extends BaseFragment implements AdapterView.OnItemSelectedListener{
    Spinner spinEqualizers;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // noi thiet lap layout
        View view = inflater.inflate(R.layout.activity_equalizer, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // khi layout da dx khoi tao, no se vao vay => day la noi minh hay goi ham findById

//      phần này dùng để set các tùy chình cho toolbar của màn hình
        //mình có thể theem các nút back, done hay là search
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        spinEqualizers = (Spinner) view.findViewById(R.id.spinnerDefaultEqualizer);
        //Create an arrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.equalizers_default, android.R.layout.simple_spinner_dropdown_item);

        //specity the layout to use whent the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply the adapter to the spinner
        spinEqualizers.setAdapter(adapter);

        spinEqualizers.setOnItemSelectedListener(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_drive, menu);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_drive, menu);
//        return super.onCreateOptionsMenu(menu);
//    }


    //trở về màn hình chơi nhạc bình thường trước đó
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        Intent mhNomal = new Intent(EqualizerActivity.this, PlayerMediaFragment.class);
//        startActivity(mhNomal);
//        Toast.makeText(this, "Trở về giao diện Nomal", Toast.LENGTH_SHORT).show();



//=============phần này dùng để gọi cái fragment chơi nhạc.==========================================================
//        Fragment fragment = new PlayerMediaFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.fragment_equalizer_frame, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();




        return true;
    }
}