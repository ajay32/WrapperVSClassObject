package ajaymehta.wrappervsclassobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Wasteful obj1;
    Wasteful obj2;

    Integer obj3;
    Integer obj4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating class objects

        obj1 = new Wasteful(11);
        obj2 = new Wasteful(11);

        // creating Wrapper class objects

        obj3 = new Integer(11);
        obj4 = new Integer(11);


    }


    // checking if object (references) are equal or not...  we can check if objects are equal using equal() method.


    public void check12(View view) {
        if (obj1.equals(obj2)) {
            Toast.makeText(getApplicationContext(), "Obj1 and Obj2 are same", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Obj1 and Obj2 aren't same", Toast.LENGTH_SHORT).show();
        }

    }

    public void check34(View view) {

        if (obj3.equals(obj4)) {
            Toast.makeText(getApplicationContext(), "Obj3 and Obj4 are same", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Obj3 and Obj4 aren't same", Toast.LENGTH_SHORT).show();
        }
    }
}


class Wasteful {

    int x;

    public Wasteful(int x) {

        this.x = x;

    }

}

