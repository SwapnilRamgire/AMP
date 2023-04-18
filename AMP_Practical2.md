Programming Resources Android Resources: (Color, Theme, String, Drawable, Dimension, Image)

Add 3-4 text-views in one LinearLayout(Verical)

// For Colors
Go to, Project -> res -> values -> colours.xml
Add these lines.
<color name="blue">#0000FF</color>
<color name="green">#00FF00</color>
<color name="yellow">#FFFF00</color>
<color name="orange">#FF7F00</color>
Open activity_main.xml and add
android:background="" to all the Textviews
e.g
<TextView
 android:id="@+id/textView"
 android:layout_width="match_parent"
 android:layout_height="120dp"
 android:text="Swapnil Ramgire"
 android:background="@color/blue"/>

// For string
Go to, Project -> res -> values -> strings.xml
And Add these lines:
<resources>
<string name="app_name">P3_T2083</string>
<string name="studentName">Swapnil Ramgire</string>
<string name="studentRollNumber">T.20.83</string>
<string name="string3">Test String 1</string>
<string name="string4">Test String 2</string>
</resources>
Now, go to activity_main.xml and add below line of code to every TextView
android:text=
e.g.
<TextView
 android:id="@+id/textView"
 android:layout_width="match_parent"
 android:layout_height="120dp"
 android:text="@string/studentName"
 android:background="@color/blue"/>

// Images
Download and image and paste it in the Project -> res ->Drawable
add one ImageView in activity_main.xml and select the pasted image(UI)
After adding image the xml code should look like this

<?xml version="1.0" encoding="utf-8"?>

<android.support.constraint.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<ImageView
    android:id="@+id/imageView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/IronMan"
    tools:layout_editor_absoluteX="116dp"
    tools:layout_editor_absoluteY="214dp" />
</android.support.constraint.ConstraintLayout>
