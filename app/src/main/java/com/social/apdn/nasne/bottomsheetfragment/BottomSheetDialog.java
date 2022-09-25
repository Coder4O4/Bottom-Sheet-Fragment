package com.social.apdn.nasne.bottomsheetfragment;

import android.os.Bundle;

import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.social.apdn.nasne.bottomsheetfragment.databinding.FragmentBottomSheetDialogBinding;


public class BottomSheetDialog extends BottomSheetDialogFragment {

   FragmentBottomSheetDialogBinding binding;

    public BottomSheetDialog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBottomSheetDialogBinding.inflate(inflater , container,false);


        binding.bottomSheetDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog.super.dismiss();
            }
        });


        return binding.getRoot();
    }
}