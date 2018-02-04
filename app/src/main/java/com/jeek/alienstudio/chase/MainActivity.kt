package com.jeek.alienstudio.chase

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
//import com.jeek.alienstudio.chase.OkHttpDemo



class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    //val demo = OkHttpDemo()
    var mHelloText: TextView? = null

    val items = listOf(
            "给初学者的RxJava2.0教程（七）: Flowable",
            "Android之View的诞生之谜",
            "Android之自定义View的死亡三部曲之Measure",
            "Using ThreadPoolExecutor in Android ",
            "Kotlin 泛型定义与 Java 类似，但有着更多特性支持。",
            "Android异步的姿势，你真的用对了吗？",
            "Android 高质量录音库。",
            "Android 边缘侧滑效果，支持多种场景下的侧滑退出。"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val listview = findViewById(R.id.mRecDemo) as RecyclerView
        listview.layoutManager = LinearLayoutManager(this)
        listview.adapter = MainAdapter(items)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        //val response = demo.run("https://raw.github.com/square/okhttp/master/README.md")
        //mHelloText!!.setText(response)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
