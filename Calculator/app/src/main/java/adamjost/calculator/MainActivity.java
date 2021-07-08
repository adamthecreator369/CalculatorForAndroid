/* Name: MainActivity.java
 * Author: Adam B. Jost
 * Course: CPT-160 Section 80
 * Language: Java
 * Project: Calculator
 * Date: 4/29/2021
 */

package adamjost.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView zero, one, two, three, four, five, six, seven, eight, nine, decimal;
    private TextView squared, sqrt, percent, clear, division, multiplication, subtraction, addition;
    private TextView polarity, equals, output;
    private String user_entered_operand;
    private double result;
    private boolean result_shown, negative, error_locked;
    private int decimal_count;
    private String operation_type;
    private SoundEffects sound_effects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set view
        setContentView(R.layout.activity_main);

        // Retrieve all TextViews
        zero = findViewById(R.id.zero_button);
        one = findViewById(R.id.one_button);
        two = findViewById(R.id.two_button);
        three = findViewById(R.id.three_button);
        four = findViewById(R.id.four_button);
        five = findViewById(R.id.five_button);
        six = findViewById(R.id.six_button);
        seven = findViewById(R.id.seven_button);
        eight = findViewById(R.id.eight_button);
        nine = findViewById(R.id.nine_button);
        decimal = findViewById(R.id.decimal_button);
        squared = findViewById(R.id.squared_button);
        sqrt = findViewById(R.id.sqrt_button);
        percent = findViewById(R.id.percent_button);
        clear = findViewById(R.id.clear_button);
        division = findViewById(R.id.division_button);
        multiplication = findViewById(R.id.multiply_button);
        subtraction = findViewById(R.id.subtraction_button);
        addition = findViewById(R.id.addition_button);
        polarity = findViewById(R.id.polarity_button);
        equals = findViewById(R.id.equals_button);
        output = findViewById(R.id.output_text);

        // Set default values (pointless but for documentation purposes)
        result_shown = false;
        operation_type = "none";
        decimal_count = 0;
        user_entered_operand = "0";
        result = 0;
        negative = false;
        error_locked = false;

        // Instantiate the sound effects player.
        sound_effects = SoundEffects.getInstance(getApplicationContext());

        // Numeric Button Clicks

        zero.setOnClickListener(new View.OnClickListener() {
            // When numeric button 0 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {

                    // Update pending String to shown to user in output.
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("") || user_entered_operand.equals("-0")) {
                        user_entered_operand = "0";
                    } else {
                        user_entered_operand += "0";
                    }

                    // Show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // zero click listener

        one.setOnClickListener(new View.OnClickListener() {
            // When numeric button 1 is clicked.
            @Override
            public void onClick(View view) {

                // If not showing a result of a calculation or displaying the word "Error".
                if (!result_shown && !error_locked) {

                    // Update pending String to shown to user in output.
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        // Display a 1 in the output section.
                        user_entered_operand = "1";
                    } else {
                        // Add 1 to the end of the number being entered.
                        user_entered_operand += "1";
                    }

                    // Show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // one click listener

        two.setOnClickListener(new View.OnClickListener() {
            // When numeric button 2 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {

                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "2";
                    } else {
                        user_entered_operand += "2";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // two click listener

        three.setOnClickListener(new View.OnClickListener() {
            // When numeric button 3 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {

                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "3";
                    } else {
                        user_entered_operand += "3";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 3 click listener

        four.setOnClickListener(new View.OnClickListener() {
            // When numeric button 1 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {

                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "4";
                    } else {
                        user_entered_operand += "4";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // one click listener

        five.setOnClickListener(new View.OnClickListener() {
            // When numeric button 5 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {
                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "5";
                    } else {
                        user_entered_operand += "5";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 5 click listener

        six.setOnClickListener(new View.OnClickListener() {
            // When numeric button 6 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {
                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "6";
                    } else {
                        user_entered_operand += "6";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 6 click listener

        seven.setOnClickListener(new View.OnClickListener() {
            // When numeric button 7 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {
                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "7";
                    } else {
                        user_entered_operand += "7";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 7 click listener

        eight.setOnClickListener(new View.OnClickListener() {
            // When numeric button 1 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {
                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "8";
                    } else {
                        user_entered_operand += "8";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 8 click listener

        nine.setOnClickListener(new View.OnClickListener() {
            // When numeric button 1 is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !error_locked) {
                    // Add number to pending update of output
                    if (user_entered_operand.equals("0") || user_entered_operand.equals("")) {
                        user_entered_operand = "9";
                    } else {
                        user_entered_operand += "9";
                    }

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // 9 click listener

        // Arithmetic button clicks

        addition.setOnClickListener(new View.OnClickListener() {
            // When addition is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && operation_type.equals("none")) {
                    // Set operation to be performed.
                    operation_type = "addition";

                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Start right operand at 0
                    user_entered_operand = "0";

                    // Show a blank value to user and wait for input of right operand
                    output.setText("0");

                    // If pressed when a calculation result was being shown,
                    // Unlock the numeric buttons and allow user to enter second operand.
                    result_shown = false;

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // + click listener

        subtraction.setOnClickListener(new View.OnClickListener() {
            // When subtraction button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && operation_type.equals("none")) {
                    // Set operation to be performed.
                    operation_type = "subtraction";

                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Start right operand at 0
                    user_entered_operand = "0";

                    // Show a blank value to user and wait for input of right operand
                    output.setText("0");

                    // If pressed when a calculation result was being shown,
                    // Unlock the numeric buttons and allow user to enter second operand.
                    result_shown = false;

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // (-) click listener

        multiplication.setOnClickListener(new View.OnClickListener() {
            // When multiplication button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && operation_type.equals("none")) {
                    // Set operation to be performed.
                    operation_type = "multiplication";

                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Start right operand at 0
                    user_entered_operand = "0";

                    // Show a blank value to user and wait for input of right operand
                    output.setText("0");

                    // If pressed when a calculation result was being shown,
                    // Unlock the numeric buttons and allow user to enter second operand.
                    result_shown = false;

                    // play tone
                    sound_effects.playTone(true);
                }


            }
        }); // (*) click listener

        division.setOnClickListener(new View.OnClickListener() {
            // When subtraction button is clicked.
            @Override
            public void onClick(View view) {


                if(!error_locked && operation_type.equals("none")) {
                    // Set operation to be performed.
                    operation_type = "division";

                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Start right operand at 0
                    user_entered_operand = "0";

                    // Show a blank value to user and wait for input of right operand
                    output.setText("0");

                    // If pressed when a calculation result was being shown,
                    // Unlock the numeric buttons and allow user to enter second operand.
                    result_shown = false;

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // (/) click listener

        squared.setOnClickListener(new View.OnClickListener() {
            // When squared button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && !user_entered_operand.equals("0")) {
                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Square the result.
                    result *= result;

                    // Display result as a double if a double, otherwise display as an integer.
                    if (result % 1 != 0) user_entered_operand = String.valueOf(result);
                    else user_entered_operand = String.valueOf((long) result);

                    if (user_entered_operand.equals("NaN")) {
                        user_entered_operand = "Error";
                        error_locked = true;
                    }

                    // If operation was performed show the calculated result.
                    output.setText(user_entered_operand);

                    // Lock numbers from being added to the end of the displayed result.
                    result_shown = true;

                    // Allow user to perform arithmetic operations to the result.
                    operation_type = "none";

                    // play tone
                    sound_effects.play_calculate_sound();
                }

            }
        }); // Squared click listener

        sqrt.setOnClickListener(new View.OnClickListener() {
            // When square root button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && !user_entered_operand.equals("0")) {
                    // Allow user to use a double by reseting decimal count.
                    // Accounts for user previously entering a double as the left operand.
                    decimal_count = 0;

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    // Calculate the sqrt of the result.
                    result = Math.sqrt(result);

                    // Display result as a double if a double, otherwise display as an integer.
                    if (result % 1 != 0) user_entered_operand = String.valueOf(result);
                    else user_entered_operand = String.valueOf((long) result);

                    // Lock the interface until "Clear" button is pressed due to a non-number result.
                    // aka "Error".
                    if (user_entered_operand.equals("NaN")) {
                        user_entered_operand = "Error";
                        error_locked = true;
                    }

                    // If operation was performed show the calculated result.
                    output.setText(user_entered_operand);

                    result_shown = true;
                    operation_type = "none";

                    // play tone
                    sound_effects.play_calculate_sound();
                }

            }
        }); // square root click listener

        equals.setOnClickListener(new View.OnClickListener() {
            // When equals button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && !operation_type.equals("none")) {

                    // Perform operation only if a right operand has been entered.
                    // Disallow user from continually hitting the equals button increasing result.
                    // Otherwise, wait and do nothing.

                    if (output.getText() != "") {

                        // If operation to be performed is addition.
                        if (operation_type.equals("addition")) {
                            result += Double.parseDouble((String) output.getText());
                        }

                        // If operation to be performed is subtraction.
                        if (operation_type.equals("subtraction")) {
                            result -= Double.parseDouble((String) output.getText());
                        }

                        // If operation to be performed is multiplication.
                        if (operation_type.equals("multiplication")) {
                            result *= Double.parseDouble((String) output.getText());
                        }

                        // If operation to be performed is division.
                        if (operation_type.equals("division")) {
                            result /= Double.parseDouble((String) output.getText());
                        }

                        // Display result as a double if a double, otherwise display as an integer.
                        if (result % 1 != 0) user_entered_operand = String.valueOf(result);
                        else user_entered_operand = String.valueOf((long) result);

                        if (user_entered_operand.equals("NaN")) { user_entered_operand = "Error"; }

                        if (user_entered_operand.equals("Infinity") || user_entered_operand.equals("NaN")
                                || user_entered_operand.equals("Error")) { error_locked = true; }

                        // If operation was performed show the calculated result.
                        output.setText(user_entered_operand);

                        result_shown = true;
                        negative = false;
                        operation_type = "none";

                        // play tone
                        sound_effects.play_calculate_sound();
                    }
                }


            }
        }); // + click listener


        // Other button clicks

        decimal.setOnClickListener(new View.OnClickListener() {
            // When decimal button is clicked.
            @Override
            public void onClick(View view) {
                if (!result_shown && !error_locked) {
                    // Add a decimal point to the end of the number if one dont already exist in String.
                    if (decimal_count == 0) {
                        user_entered_operand += ".";
                    }

                    decimal_count++; // Keep user from adding more than one decimal.

                    // Finally show entered number to the user
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // decimal click listener

        percent.setOnClickListener(new View.OnClickListener() {

            // When percent button is clicked.
            @Override
            public void onClick(View view) {

                if (!error_locked && !user_entered_operand.equals("0")) {

                    // Add/Store the left operand to the result
                    result = Double.parseDouble((String) user_entered_operand);

                    result /= 100;

                    // Display result as a double if a double, otherwise display as an integer.
                    if (result % 1 != 0) user_entered_operand = String.valueOf(result);
                    else user_entered_operand = String.valueOf((long) result);

                    if (user_entered_operand.equals("NaN")) {
                        user_entered_operand = "Error";
                        error_locked = true;
                    }

                    output.setText(user_entered_operand);

                    result_shown = true; // Keep user from adding #s to the end of the result.
                    decimal_count++; // Keep user from adding more than one decimal.

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // (%) click listener


        polarity.setOnClickListener(new View.OnClickListener() {

            // When decimal button is clicked.
            @Override
            public void onClick(View view) {

                if (!result_shown && !user_entered_operand.equals("0") && !error_locked) {
                    if (!negative) {
                        user_entered_operand = "-" + user_entered_operand;
                        negative = true;
                    } else {
                        user_entered_operand = user_entered_operand.substring(1).trim();
                        negative = false;
                    }

                    // Finally show entered number to the user.
                    output.setText(user_entered_operand);

                    // play tone
                    sound_effects.playTone(true);
                }

            }
        }); // polarity click listener

        clear.setOnClickListener(new View.OnClickListener() {

            // When clear button is clicked.
            @Override
            public void onClick(View view) {

                // Reset everything.
                user_entered_operand = "0";
                result = 0;
                decimal_count = 0;
                operation_type = "none";
                negative = false;
                error_locked = false;
                result_shown = false;

                // Finally result output text being show to "0".
                output.setText(user_entered_operand);

                // play tone
                sound_effects.play_calculate_sound();
            }
        }); // clear click listener

    } // on create
} // activity