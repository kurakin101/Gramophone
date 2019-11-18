package com.j2d.nudle.gramophone;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ActionBarDrawerToggle mDrawerToggle;
    DrawerLayout mDrawerLayout;
    private TextView mTextMessage;
//    private static final String TAG = "MainActivity";
//
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImageUrls = new ArrayList<>();
//    private HashMap<String, String> mDescriptions = new HashMap<>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_news:
                    setTitle("News"); //this will set title of Action Bar
                    FragmentOne fragment1 = new FragmentOne();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.framgmentConstainer, fragment1);  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction1.commit();
                    return true;
                case R.id.navigation_album:
                    setTitle("Music album");
                    FragmentTwo fragment2 = new FragmentTwo();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.framgmentConstainer, fragment2, "FragmentTwo");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_now_playing:
                    setTitle("Translation");
                    FragmentThree fragment3 = new FragmentThree();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.framgmentConstainer, fragment3, "FragmentThree");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction3.commit();
                    return true;
                case R.id.navigation_musicians:
                    setTitle("Musicians");
                    FragmentFour fragment4 = new FragmentFour();
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.framgmentConstainer, fragment4, "FragmentFour");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction4.commit();
                    return true;
                case R.id.navigation_tour:
                    setTitle("Tour");
                    FragmentFive fragment5 = new FragmentFive();
                    FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction5.replace(R.id.framgmentConstainer, fragment5, "FragmentFive");  //create first framelayout with id fram in the activity where fragments will be displayed
                    fragmentTransaction5.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.d(TAG, "onCreate: started.");
//
//        initImageBitmaps();

        ActionBar actionBar = getSupportActionBar();
// включаем иконку, иначе не будет отображаться
        actionBar.setDisplayHomeAsUpEnabled(true);
// устанавливаем для неё картинку
        actionBar.setHomeAsUpIndicator(R.drawable.file);
        getSupportActionBar().setHomeButtonEnabled(true); // включаем ДОМОЙ
        mDrawerLayout = (DrawerLayout) findViewById(R.id.container); // находим дровер
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, 0, 0); // создаём штуку, которая будет анимировать иконку (и не только)
        mDrawerLayout.addDrawerListener(mDrawerToggle); // подписываем её на события открытия и закрытия дровера (чтобы она знала, когда нужно анимировать кнопку)

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setTitle("Fragment One"); //this will set title of Action Bar
        FragmentOne fragment1 = new FragmentOne();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.framgmentConstainer, fragment1, "Fragment One");  //create first framelayout with id fram in the activity where fragments will be displayed
        fragmentTransaction1.commit();
        setNavigationItemSelectedListener();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) { // если нажали на
            case android.R.id.home: // кнопку меню
                // ищем меню
                DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.container);
                if (drawerLayout.isDrawerOpen(Gravity.START)) { // если уже открыто
                    drawerLayout.closeDrawer(Gravity.START); // закрываем
                } else { // иначе
                    drawerLayout.openDrawer(Gravity.START); // открываем
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

//    //заполняем список содержимым
//    private void initImageBitmaps() {
//        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
//
//        mImageUrls.add("https://outstyle.org/images/news/2/6/9/Cu7l3YWhDE8.jpg");
//        mNames.add("Night Lovell");
//
//        mImageUrls.add("https://f4.bcbits.com/img/a3122189327_16.jpg");
//        mNames.add("KLNV");
//
//        mImageUrls.add("https://themoscowtimes.com/static/uploads/events/2018/1/13/9bf854b016e8454ea6a26c05d8eafd15.jpg");
//        mNames.add("Bones");
//
//        mImageUrls.add("https://scontent-ort2-1.cdninstagram.com/vp/bd9389358ff9bdda3e11881dc5458998/5B671C4A/t51.2885-15/e35/p320x320/23098878_503791613318823_1925708690933940224_n.jpg?ig_cache_key=MTYzNzMxNjcyMjUxMTI3MDAwNQ%3D%3D.2");
//        mNames.add("Scarlxrd");
//
//        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSPrVOWKsk7ELLDGfo8DUhC-LT_ftDyi70dGRbdIMyKfVNSnph");
//        mNames.add("Lil Yachty");
//
//        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0HvePQa5q7Q57plX1PFYLEQDm3_lQKkKBshBYrL_vGax8Bwu7");
//        mNames.add("Beatles");
//
//        mImageUrls.add("https://is2-ssl.mzstatic.com/image/thumb/Features4/v4/bf/ba/ff/bfbaff63-caf9-1e2d-7991-cee13297e955/dj.mtwvirjq.jpg/1200x630bb.jpg");
//        mNames.add("AC&DC");
//
//        mImageUrls.add("https://thenypost.files.wordpress.com/2018/02/sting.jpg?quality=90&strip=all&w=618&h=410&crop=1");
//        mNames.add("Sting");
//
//        mDescriptions.put("Scarlxrd", "SASADSADSAD");
//        setNavigationItemSelectedListener();
////        initRecyclerView();
//    }


// настраиваем навигационное меню
    public void setNavigationItemSelectedListener() {
        NavigationView navigationView = findViewById(R.id.navigation_view); // находим вьюху
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) { // если выбрали пункт
                    case R.id.group_1: // выход
                        finish(); // закрываем активность
                        return true; // возвращаем true, мол, обработали нажатие
                    default: // иначе
                        return false; // возврващаем false, мол, этот пункт меню не поддерживаем
                }
            }
        });
    }
}
