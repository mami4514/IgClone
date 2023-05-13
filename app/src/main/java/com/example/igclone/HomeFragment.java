package com.example.igclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.igclone.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    private ArrayList<Fish> fishArrayList;
    private MyAdaptor myAdaptor;




    public HomeFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        fishArrayList = new ArrayList<>();

        myAdaptor = new MyAdaptor(fishArrayList);
        binding.recyclerView.setAdapter(myAdaptor);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        createArrayList();
        return view;
    }
    private void createArrayList(){
        fishArrayList.add(new Fish(R.drawable.jobfish,"Ahmet","jobfish geldi sansımıza"));
        fishArrayList.add(new Fish(R.drawable.blackfish,"Ali","blackfish yakaladik bugun "));
        fishArrayList.add(new Fish(R.drawable.sailfish,"Muhammed","sailfish dünyanın en güzel balığı :) "));
    }
}