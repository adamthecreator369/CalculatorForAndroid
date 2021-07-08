/* Name: SplashScreen.java
 * Author: Adam B. Jost
 * Course: CPT-160 Section 80
 * Language: Java
 * Project: Calculator
 * Date: 4/29/2021
 */

package adamjost.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display splash screen to user for 6 1/2 seconds.
        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Then transfer to the calculator.
        startActivity(new Intent(this, MainActivity.class));
    }
}