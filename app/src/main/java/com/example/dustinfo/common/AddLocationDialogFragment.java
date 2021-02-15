package com.example.dustinfo.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.dustinfo.R;

public class AddLocationDialogFragment extends DialogFragment {

    private OnClickListener mOnClickListener;


    public interface OnClickListener {
        void onOkClicked(String city);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        mOnClickListener = onClickListener;
    }

    private EditText mCityEditText;

    public static AddLocationDialogFragment newInstance(OnClickListener listener) {

        Bundle args = new Bundle();

        AddLocationDialogFragment fragment = new AddLocationDialogFragment();
        fragment.setOnClickListener(listener);
        fragment.setArguments(args);
        return fragment;
    }

    public AddLocationDialogFragment() {
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_add_location, null, false);

        mCityEditText = (EditText) view.findViewById(R.id.city_edit);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("위치 추가");
        builder.setView(view);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String city = mCityEditText.getText().toString();
                mOnClickListener.onOkClicked(city);
            }
        });
        builder.setNegativeButton("취소", null);
        return builder.create();
    }

}