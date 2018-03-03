package br.com.fiap.notepad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu.ContextMenuInfo
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import android.view.MenuItem




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.getItemId()) {
            R.id.ic_pesquisar -> {
                return true
            }
            R.id.ic_salvar -> {
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
