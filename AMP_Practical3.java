// Programming Activities and fragments
// Activity Life Cycle, Activity methods, Multiple Activities, Life Cycle of fragments and multiple fragments.

// Java code (Add this in MainACtivity class):

public class MainActivity extends AppCompatActivity {
String tag = "Android Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart() {
        super.onStart();
        Log.d(tag, "In onStart event");
    }
    public void onStop() {
        super.onStop();
        Log.d(tag, "In onStop event");
    }
    public void onPause() {
        super.onPause();
        Log.d(tag, "In onPause event");
    }
    public void onResume() {
        super.onResume();
        Log.d(tag, "In onResume event");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In onDestroy event");
    }
}
