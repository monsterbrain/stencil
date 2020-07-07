package com.thoughtbot.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.thoughtbot.sample.extensions.brusherFont
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //set custom font
    customFontStencil.paint.typeface = brusherFont
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.menu_play, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    when (item?.itemId) {
      R.id.play -> {
        defaultStencil.animatePath()
        customFontStencil.animatePath()
      }
    }
    return super.onOptionsItemSelected(item)
  }
}
