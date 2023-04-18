package com.example.practical6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater a = getMenuInflater();
        a.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.newFile:
                Toast.makeText(this, "File Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.open:
                Toast.makeText(this, "Open Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this, "Save Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.saveAs:
                Toast.makeText(this, "SaveAs Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this, "Delete Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.close:
                Toast.makeText(this, "Close Selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.studentName:
                Toast.makeText(this, "Nameee",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
