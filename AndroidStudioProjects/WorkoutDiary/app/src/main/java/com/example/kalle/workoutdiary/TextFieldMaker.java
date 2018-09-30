package com.example.kalle.workoutdiary;

import android.view.View;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class TextFieldMaker {



    static void makeTextFields(LinearLayout linlay, View v, ArrayList<ArrayList> containerForTextArray, ArrayList textFieldArray, int numExercises) {

       containerForTextArray.add(new ArrayList<EditText>());
       textFieldArray = containerForTextArray.get(numExercises);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(10, 0, 10, 0);
        layoutParams.gravity = Gravity.CENTER;


        LinearLayout.LayoutParams leftMarginParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        leftMarginParams.leftMargin = 10;
        leftMarginParams.rightMargin = 5;

        // make textfield
        EditText exerciseName = new EditText(v.getContext());
        MyTextField maktxt = new MyTextField();
        maktxt.makeTextField(exerciseName, 300);
        //exerciseName.setMaxWidth(300);
        exerciseName.setMinimumWidth(300);
        exerciseName.setPadding(10,5,10,5);
        textFieldArray.add(exerciseName);

        // second textfield
        EditText repsTextField = new EditText(v.getContext());
        maktxt.makeTextField(repsTextField, 150);
        // repsTextField.setMaxWidth(150);
        repsTextField.setMinimumWidth(150);
        repsTextField.setPadding(10,5,10,5);
        textFieldArray.add(repsTextField);

        // third textField
        EditText setsTextField = new EditText(v.getContext());
        maktxt.makeTextField(setsTextField, 150);
        // setsTextField.setMaxWidth(150);
        setsTextField.setMinimumWidth(150);
        setsTextField.setPadding(10,5,10,5);
        textFieldArray.add(setsTextField);

        //fourth textField
        EditText weightTextField = new EditText(v.getContext());
        maktxt.makeTextField(weightTextField, 150);
        // weightTextField.setMaxWidth(150);
        weightTextField.setMinimumWidth(150);
        weightTextField.setPadding(10,5,10,5);
        textFieldArray.add(weightTextField);

        // fifth textField
        EditText restTextField = new EditText(v.getContext());
        maktxt.makeTextField(restTextField,150);
        // restTextField.setMaxWidth(150);
        restTextField.setMinimumWidth(150);
        restTextField.setPadding(10,5,10,5);
        textFieldArray.add(restTextField);

        linlay.setLayoutParams(layoutParams);

        //textFieldRows.setLayoutParams(layoutParams);
        linlay.addView(exerciseName,leftMarginParams);
        linlay.addView(repsTextField,leftMarginParams);
        linlay.addView(setsTextField,leftMarginParams);
        linlay.addView(weightTextField,leftMarginParams);
        linlay.addView(restTextField,leftMarginParams);


    }
}
